package typings
package rpioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rpio extends js.Object {
  // Constants:
  var HIGH: scala.Double = js.native
  var INPUT: scala.Double = js.native
  var LOW: scala.Double = js.native
  var OUTPUT: scala.Double = js.native
  var PAD_DRIVE_10mA: scala.Double = js.native
  var PAD_DRIVE_12mA: scala.Double = js.native
  var PAD_DRIVE_14mA: scala.Double = js.native
  var PAD_DRIVE_16mA: scala.Double = js.native
  var PAD_DRIVE_2mA: scala.Double = js.native
  var PAD_DRIVE_4mA: scala.Double = js.native
  var PAD_DRIVE_6mA: scala.Double = js.native
  var PAD_DRIVE_8mA: scala.Double = js.native
  var PAD_GROUP_0_27: scala.Double = js.native
  var PAD_GROUP_28_45: scala.Double = js.native
  var PAD_GROUP_46_53: scala.Double = js.native
  var PAD_HYSTERESIS: scala.Double = js.native
  var PAD_SLEW_UNLIMITED: scala.Double = js.native
  var POLL_BOTH: scala.Double = js.native
  var POLL_HIGH: scala.Double = js.native
  var POLL_LOW: scala.Double = js.native
  var PULL_DOWN: scala.Double = js.native
  var PULL_OFF: scala.Double = js.native
  var PULL_UP: scala.Double = js.native
  var PWM: scala.Double = js.native
  /**
       * Reset pin to INPUT and clear any pullup/pulldown resistors and poll events.
       * @param pin
       */
  def close(pin: scala.Double): scala.Unit = js.native
  // I²C
  /**
       * Assign pins 3 and 5 to i²c use. Until .i2cEnd() is called they won't be available for GPIO use.
       *
       * The pin assignments are:
       * Pin 3: SDA (Serial Data)
       * Pin 5: SCL (Serial Clock)
       */
  def i2cBegin(): scala.Unit = js.native
  /**
       * Turn off the i²c interface and return the pins to GPIO.
       */
  def i2cEnd(): scala.Unit = js.native
  /**
       * Read from the i²c slave.
       * Function takes a buffer and optional length argument, defaulting to the length of the buffer if not specified.
       * @param buffer
       * @param length
       */
  def i2cRead(buffer: nodeLib.Buffer): scala.Unit = js.native
  /**
       * Read from the i²c slave.
       * Function takes a buffer and optional length argument, defaulting to the length of the buffer if not specified.
       * @param buffer
       * @param length
       */
  def i2cRead(buffer: nodeLib.Buffer, length: scala.Double): scala.Unit = js.native
  /**
       * Set the baud rate - directly set the speed in hertz.
       * @param baudRate
       */
  def i2cSetBaudRate(baudRate: scala.Double): scala.Unit = js.native
  /**
       * Set the baud rate - based on a divisor of the base 250MHz rate.
       * @param clockDivider
       */
  def i2cSetClockDivider(clockDivider: scala.Double): scala.Unit = js.native
  /**
       * Configure the slave address. This is between 0 - 0x7f, and it can be helpful to
       * run the i2cdetect program to figure out where your devices are if you are unsure.
       * @param address
       */
  def i2cSetSlaveAddress(address: scala.Double): scala.Unit = js.native
  /**
       * Write to the i²c slave.
       * Function takes a buffer and optional length argument, defaulting to the length of the buffer if not specified.
       * @param biffer
       * @param length
       */
  def i2cWrite(biffer: nodeLib.Buffer): scala.Unit = js.native
  /**
       * Write to the i²c slave.
       * Function takes a buffer and optional length argument, defaulting to the length of the buffer if not specified.
       * @param biffer
       * @param length
       */
  def i2cWrite(biffer: nodeLib.Buffer, length: scala.Double): scala.Unit = js.native
  /**
       * Initialise the bcm2835 library. This will be called automatically by .open() using the default option values if not called explicitly.
       * @param options
       */
  def init(options: rpioLib.RPIONs.Options): scala.Unit = js.native
  /**
       * Switch a pin that has already been opened in one mode to a different mode.
       * This is provided primarily for performance reasons, as it avoids some of the setup work done by .open().
       * @param pin
       * @param mode
       */
  def mode(pin: scala.Double, mode: scala.Double): scala.Unit = js.native
  /**
       * Sleep for n milliseconds.
       * @param n: number of milliseconds to sleep
       */
  def msleep(n: scala.Double): scala.Unit = js.native
  /**
       * Open a pin for input or output. Valid modes are:
       * INPUT: pin is input (read-only).
       * OUTPUT: pin is output (read-write).
       * PWM: configure pin for hardware PWM.
       *
       * For input pins, option can be used to configure the internal pullup or pulldown resistors using options as described in the .pud() documentation below.
       *
       * For output pins, option defines the initial isMotionDetected of the pin, rather than having to issue a separate .write() call. This can be critical for devices which must have a stable value, rather than relying on the initial floating value when a pin is enabled for output but hasn't yet been configured with a value.
       * @param pin
       * @param mode
       * @param options
       */
  def open(pin: scala.Double, mode: scala.Double): scala.Unit = js.native
  /**
       * Open a pin for input or output. Valid modes are:
       * INPUT: pin is input (read-only).
       * OUTPUT: pin is output (read-write).
       * PWM: configure pin for hardware PWM.
       *
       * For input pins, option can be used to configure the internal pullup or pulldown resistors using options as described in the .pud() documentation below.
       *
       * For output pins, option defines the initial isMotionDetected of the pin, rather than having to issue a separate .write() call. This can be critical for devices which must have a stable value, rather than relying on the initial floating value when a pin is enabled for output but hasn't yet been configured with a value.
       * @param pin
       * @param mode
       * @param options
       */
  def open(pin: scala.Double, mode: scala.Double, options: scala.Double): scala.Unit = js.native
  /**
       * Watch pin for changes and execute the callback cb() on events. cb() takes a single argument, the pin which triggered the callback.
       *
       * The optional direction argument can be used to watch for specific events:
       * POLL_LOW: poll for falling edge transitions to low.
       * POLL_HIGH: poll for rising edge transitions to high.
       * POLL_BOTH: poll for both transitions (the default).
       *
       * Due to hardware/kernel limitations we can only poll for changes, and the event detection only says that an event occurred, not which one. The poll interval is a 1ms setInterval() and transitions could come in between detecting the event and reading the value. Therefore this interface is only useful for events which transition slower than approximately 1kHz.
       *
       * To stop watching for pin changes, call .poll() again, setting the callback to null.
       * @param pin
       * @param cb
       * @param direction
       */
  def poll(pin: scala.Double): scala.Unit = js.native
  /**
       * Watch pin for changes and execute the callback cb() on events. cb() takes a single argument, the pin which triggered the callback.
       *
       * The optional direction argument can be used to watch for specific events:
       * POLL_LOW: poll for falling edge transitions to low.
       * POLL_HIGH: poll for rising edge transitions to high.
       * POLL_BOTH: poll for both transitions (the default).
       *
       * Due to hardware/kernel limitations we can only poll for changes, and the event detection only says that an event occurred, not which one. The poll interval is a 1ms setInterval() and transitions could come in between detecting the event and reading the value. Therefore this interface is only useful for events which transition slower than approximately 1kHz.
       *
       * To stop watching for pin changes, call .poll() again, setting the callback to null.
       * @param pin
       * @param cb
       * @param direction
       */
  def poll(pin: scala.Double, cb: rpioLib.RPIONs.CallbackFunction): scala.Unit = js.native
  /**
       * Watch pin for changes and execute the callback cb() on events. cb() takes a single argument, the pin which triggered the callback.
       *
       * The optional direction argument can be used to watch for specific events:
       * POLL_LOW: poll for falling edge transitions to low.
       * POLL_HIGH: poll for rising edge transitions to high.
       * POLL_BOTH: poll for both transitions (the default).
       *
       * Due to hardware/kernel limitations we can only poll for changes, and the event detection only says that an event occurred, not which one. The poll interval is a 1ms setInterval() and transitions could come in between detecting the event and reading the value. Therefore this interface is only useful for events which transition slower than approximately 1kHz.
       *
       * To stop watching for pin changes, call .poll() again, setting the callback to null.
       * @param pin
       * @param cb
       * @param direction
       */
  def poll(pin: scala.Double, cb: rpioLib.RPIONs.CallbackFunction, direction: scala.Double): scala.Unit = js.native
  /**
       * Watch pin for changes and execute the callback cb() on events. cb() takes a single argument, the pin which triggered the callback.
       *
       * The optional direction argument can be used to watch for specific events:
       * POLL_LOW: poll for falling edge transitions to low.
       * POLL_HIGH: poll for rising edge transitions to high.
       * POLL_BOTH: poll for both transitions (the default).
       *
       * Due to hardware/kernel limitations we can only poll for changes, and the event detection only says that an event occurred, not which one. The poll interval is a 1ms setInterval() and transitions could come in between detecting the event and reading the value. Therefore this interface is only useful for events which transition slower than approximately 1kHz.
       *
       * To stop watching for pin changes, call .poll() again, setting the callback to null.
       * @param pin
       * @param cb
       * @param direction
       */
  def poll(pin: scala.Double, cb: scala.Null, direction: scala.Double): scala.Unit = js.native
  /**
       * Configure the pin's internal pullup or pulldown resistors, using the following isMotionDetected constants:
       * PULL_OFF: disable configured resistors.
       * PULL_DOWN: enable the pulldown resistor.
       * PULL_UP: enable the pullup resistor.
       *
       * @param pin
       * @param state
       */
  def pud(pin: scala.Double, state: scala.Double): scala.Unit = js.native
  // PWM
  /**
       * Set the PWM refresh rate.
       * @param clockDivider: power-of-two divisor of the base 19.2MHz rate, with a maximum value of 4096 (4.6875kHz).
       */
  def pwmSetClockDivider(clockDivider: scala.Double): scala.Unit = js.native
  /**
       * Set the PWM width for a pin.
       * @param pin
       * @param data
       */
  def pwmSetData(pin: scala.Double, data: scala.Double): scala.Unit = js.native
  /**
       * Set the PWM range for a pin. This determines the maximum pulse width.
       * @param pin
       * @param range
       */
  def pwmSetRange(pin: scala.Double, range: scala.Double): scala.Unit = js.native
  /**
       * Read the current value of pin, returning either 1 (high) or 0 (low).
       * @param pin
       */
  def read(pin: scala.Double): scala.Double = js.native
  /**
       * Read length bits from pin into buffer as fast as possible. If length isn't specified it defaults to buffer.length.
       * @param pin
       * @param buffer
       * @param length
       */
  def readbuf(pin: scala.Double, buffer: nodeLib.Buffer): scala.Unit = js.native
  /**
       * Read length bits from pin into buffer as fast as possible. If length isn't specified it defaults to buffer.length.
       * @param pin
       * @param buffer
       * @param length
       */
  def readbuf(pin: scala.Double, buffer: nodeLib.Buffer, length: scala.Double): scala.Unit = js.native
  /**
       * Read the current isMotionDetected of the GPIO pad control for the specified GPIO group. On current models of Raspberry Pi there are three groups with corresponding defines:
       * PAD_GROUP_0_27: GPIO0 - GPIO27. Use this for the main GPIO header.
       * PAD_GROUP_28_45: GPIO28 - GPIO45. Use this to configure the P5 header.
       * PAD_GROUP_46_53: GPIO46 - GPIO53. Internal, you probably won't need this.
       *
       * The value returned will be a bit mask of the following defines:
       * PAD_SLEW_UNLIMITED: 0x10. Slew rate unlimited if set.
       * PAD_HYSTERESIS: 0x08. Hysteresis is enabled if set.
       *
       * The bottom three bits determine the drive current:
       * PAD_DRIVE_2mA: 0b000
       * PAD_DRIVE_4mA: 0b001
       * PAD_DRIVE_6mA: 0b010
       * PAD_DRIVE_8mA: 0b011
       * PAD_DRIVE_10mA: 0b100
       * PAD_DRIVE_12mA: 0b101
       * PAD_DRIVE_14mA: 0b110
       * PAD_DRIVE_16mA: 0b111
       *
       * @note Note that the pad control registers are not available via /dev/gpiomem, so you will need to use .init({gpiomem: false}) and run as root.
       * @param group
       */
  def readpad(group: scala.Double): scala.Double = js.native
  // Misc
  /**
       * Sleep for n seconds.
       * @param n: number of seconds to sleep
       */
  def sleep(n: scala.Double): scala.Unit = js.native
  // SPI
  /**
       * Switch pins 119, 21, 23, 24 and 25 (GPIO7-GPIO11) to SPI mode
       *
       *  Pin | Function
       * -----|----------
       *   19 |   MOSI
       *   21 |   MISO
       *   23 |   SCLK
       *   24 |   CE0
       *   25 |   CE1
       */
  def spiBegin(): scala.Unit = js.native
  /**
       * Choose which of the chip select / chip enable pins to control.
       *
       *  Value | Pin
       *  ------|---------------------
       *    0   | SPI_CE0 (24 / GPIO8)
       *    1   | SPI_CE1 (25 / GPIO7)
       *    2   | Both
       *
       * @param chip
       */
  def spiChipSelect(cePin: scala.Double): scala.Unit = js.native
  /**
       * Release the pins back to general purpose use.
       */
  def spiEnd(): scala.Unit = js.native
  /**
       * Commonly chip enable (CE) pins are active low, and this is the default.
       * If your device's CE pin is active high, use spiSetCSPolarity() to change the polarity.
       * @param cePin
       * @param polarity
       */
  def spiSetCSPolarity(cePin: scala.Double, polarity: scala.Double): scala.Unit = js.native
  /**
       * Set the SPI clock speed with.
       * @param clockDivider: an even divisor of the base 250MHz rate ranging between 0 and 65536.
       */
  def spiSetClockDivider(clockDivider: scala.Double): scala.Unit = js.native
  /**
       * Transfer data. Data is sent and received in 8-bit chunks via buffers which should be the same size.
       * @param txBuffer
       * @param rxBuffer
       * @param txLength
       */
  def spiTransfer(txBuffer: nodeLib.Buffer, rxBuffer: nodeLib.Buffer, txLength: scala.Double): scala.Unit = js.native
  /**
       * Send data and do not care about the data coming back.
       * @param txBuffer
       * @param txLength
       */
  def spiWrite(txBuffer: nodeLib.Buffer, txLength: scala.Double): scala.Unit = js.native
  /**
       * Sleep for n microseconds.
       * @param n: number of microseconds to sleep
       */
  def usleep(n: scala.Double): scala.Unit = js.native
  /**
       * Set the specified pin either high or low, using either the HIGH/LOW constants, or simply 1 or 0.
       * @param pin
       * @param value
       */
  def write(pin: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
       * Write length bits to pin from buffer as fast as possible. If length isn't specified it defaults to buffer.length.
  
       * @param pin
       * @param buffer
       * @param length
       */
  def writebuf(pin: scala.Double, buffer: nodeLib.Buffer): scala.Unit = js.native
  /**
       * Write length bits to pin from buffer as fast as possible. If length isn't specified it defaults to buffer.length.
  
       * @param pin
       * @param buffer
       * @param length
       */
  def writebuf(pin: scala.Double, buffer: nodeLib.Buffer, length: scala.Double): scala.Unit = js.native
  /**
       * Write control settings to the pad control for group. Uses the same defines as above for .readpad().
       * @param group
       * @param control
       */
  def writepad(group: scala.Double, control: scala.Double): scala.Unit = js.native
}

