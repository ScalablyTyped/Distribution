package typings.rpio

import typings.node.bufferMod.global.Buffer
import typings.rpio.RPIO_.CallbackFunction
import typings.rpio.RPIO_.I2cStatusCode
import typings.rpio.RPIO_.Options
import typings.rpio.rpioStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rpio extends StObject {
  
  var HIGH: Double = js.native
  
  /*
    * Supported function select modes.  INPUT and OUTPUT match the bcm2835
    * function select integers.  PWM is handled specially.
    */
  var INPUT: Double = js.native
  
  // Constants:
  var LOW: Double = js.native
  
  var OUTPUT: Double = js.native
  
  var PAD_DRIVE_10mA: Double = js.native
  
  var PAD_DRIVE_12mA: Double = js.native
  
  var PAD_DRIVE_14mA: Double = js.native
  
  var PAD_DRIVE_16mA: Double = js.native
  
  var PAD_DRIVE_2mA: Double = js.native
  
  var PAD_DRIVE_4mA: Double = js.native
  
  var PAD_DRIVE_6mA: Double = js.native
  
  var PAD_DRIVE_8mA: Double = js.native
  
  /*
    * GPIO Pad Control
    */
  var PAD_GROUP_0_27: Double = js.native
  
  var PAD_GROUP_28_45: Double = js.native
  
  var PAD_GROUP_46_53: Double = js.native
  
  var PAD_HYSTERESIS: Double = js.native
  
  var PAD_SLEW_UNLIMITED: Double = js.native
  
  /*
    * Pin close options
    */
  /** Preserve the current status on a pin when it is closed. */
  var PIN_PRESERVE: Double = js.native
  
  /** Default pin reset value */
  var PIN_RESET: Double = js.native
  
  /** POLL_LOW | POLL_HIGH */
  var POLL_BOTH: Double = js.native
  
  /** Rising edge detect */
  var POLL_HIGH: Double = js.native
  
  /*
    * Pin edge detect events.  Default to both.
    */
  /** Falling edge detect */
  var POLL_LOW: Double = js.native
  
  /** Pull resistor down */
  var PULL_DOWN: Double = js.native
  
  /*
    * Configure builtin pullup/pulldown resistors.
    */
  var PULL_OFF: Double = js.native
  
  /** Pull resistor up */
  var PULL_UP: Double = js.native
  
  var PWM: Double = js.native
  
  /**
    * Indicate that the pin will no longer be used, and clear any poll
    * events associated with it.
    * 
    * The optional reset argument can be used to configure the state that
    * pin will be left in after close:
    *   rpio.PIN_RESET: return pin to rpio.INPUT and clear any pullup/pulldown resistors. This is the default.
    *   rpio.PIN_PRESERVE: leave pin in its currently configured state.
    * 
    * @param pin - pin number to close
    * @reset PIN_RESET | PIN_PRESERVE, default = PIN_RESET
    */
  def close(pin: Double): Unit = js.native
  def close(pin: Double, reset: Double): Unit = js.native
  
  /**
    * Shuts down the rpio library, unmapping and clearing all memory maps.
    * By default this will happen automatically. This method is provided
    * to allow explicit shutdown when using close_on_exit: false and a
    * custom exit handler.
    */
  def exit(): Unit = js.native
  
  // I²C
  /**
    * Assign pins 3 and 5 to i²c use. Until i2cEnd() is called they won't
    * be available for GPIO use. 
    * Calls init() if it hasn't already been called, with gpiomem: false
    * set. Hardware i²c support requires /dev/mem access and therefore root.
    * The pin assignments are:
    * Pin 3: SDA (Serial Data)
    * Pin 5: SCL (Serial Clock)
    */
  def i2cBegin(): Unit = js.native
  
  /**
    * Turn off the i²c interface and return the pins to GPIO.
    */
  def i2cEnd(): Unit = js.native
  
  /**
    * Read from the i²c slave.
    * 
    * @param buffer - holds the read bits
    * @param length - number of bits to read, defaults to buffer.length
    * @returns a status code
    */
  def i2cRead(buffer: Buffer): I2cStatusCode = js.native
  def i2cRead(buffer: Buffer, length: Double): I2cStatusCode = js.native
  
  /*
    * Read bytes from a register into a buffer after issuing a repeated start,
    * required by e.g. MPL3115A2 pressure and temperature sensor.
    * See the bcm2835 documentation for more information.
    * 
    * @param register - register to read
    * @param buffer - store for read bits
    * @param length - the max number of bits to read, default = buffer.length
    * @returns a status code
    */
  def i2cReadRegisterRestart(register: Double, buffer: Buffer): I2cStatusCode = js.native
  def i2cReadRegisterRestart(register: Double, buffer: Buffer, length: Double): I2cStatusCode = js.native
  
  /**
    * Set the baud rate - directly set the speed in hertz.
    * 
    * @param baudRate - baudRate in hertz
    */
  def i2cSetBaudRate(baudRate: Double): Unit = js.native
  
  /**
    * Set the baud rate.
    * 
    * @param clockDivider - a divisor of the base 250MHz rate
    */
  def i2cSetClockDivider(clockDivider: Double): Unit = js.native
  
  /**
    * Configure the slave address. This is between 0 - 0x7f, and it can be helpful to
    * run the i2cdetect program to figure out where your devices are if you are unsure.
    * 
    * @param address - between 0 - 0x7f
    */
  def i2cSetSlaveAddress(address: Double): Unit = js.native
  
  /**
    * Write to the i²c slave.
    * 
    * @param buffer - bits to write
    * @param length - number of bits in buffer to transfer, default = buffer.length
    * @returns a status code
    */
  def i2cWrite(buffer: Buffer): I2cStatusCode = js.native
  def i2cWrite(buffer: Buffer, length: Double): I2cStatusCode = js.native
  
  /*
    * Write cmdlen commands from cmdbuf to device before issuing a repeated
    * start and reading rlen bytes into rbuf, for e.g. MLX90620.
    * @param cmdBuf
    * @param cmdLen
    * @param rbuf
    * @param rlen
    * @returns a status code
    */
  def i2cWriteReadRestart(cmdbuf: Buffer, cmdlen: Double, rbuf: Buffer, rlen: Double): I2cStatusCode = js.native
  
  /**
    * Initialize the library. Called automatically by
    * open() using the default option values if not called explicitly.
    * 
    * @param options - library init options
    */
  def init(): Unit = js.native
  def init(options: Options): Unit = js.native
  
  /**
    * Switch a pin that has already been opened in one mode to a different mode.
    * This is provided primarily for performance reasons, as it avoids some
    * of the setup work done by open().
    * 
    * @param pin - pin number
    * @param mode - INPUT (readonly) | OUTPUT (readwrite) | PWM (configured for hardware PWM)
    * @param option - For input pins, option can be used to configure the internal pullup 
    *                 or pulldown resistors using options as described in the pud() documentation:
    *                 PULL_OFF, PULL_DOWN or PULL_UP.
    *                 For output pins, option defines the initial state of the pin (LOW, HIGH),
    *                 rather than having to issue a separate write() call. This can be critical
    *                 for devices which must have a stable value, rather than relying on the initial
    *                 floating value when a pin is enabled for output but hasn't yet been configured
    *                 with a value.
    */
  def mode(pin: Double, mode: Double): Unit = js.native
  def mode(pin: Double, mode: Double, option: Double): Unit = js.native
  
  /**
    * Sleep for n milliseconds.
    * @param milliseconds - milliseconds to sleep
    */
  def msleep(milliseconds: Double): Unit = js.native
  
  /**
    * Callback for library warning messages.
    * 
    * @param event - listen for 'warn' events
    * @param callback - callback function recieving the library warning message
    */
  @JSName("on")
  def on_warn(event: warn, callback: js.Function1[/* msg */ String, Unit]): Any = js.native
  
  /**
    * Open a pin for input or output. 
    * 
    * @param pin - pin number
    * @param mode - INPUT (readonly) | OUTPUT (readwrite) | PWM (configured for hardware PWM)
    * @param option - For input pins, option can be used to configure the internal pullup 
    *                 or pulldown resistors using options as described in the pud() documentation:
    *                 PULL_OFF, PULL_DOWN or PULL_UP.
    *                 For output pins, option defines the initial state of the pin (LOW, HIGH),
    *                 rather than having to issue a separate write() call. This can be critical
    *                 for devices which must have a stable value, rather than relying on the initial
    *                 floating value when a pin is enabled for output but hasn't yet been configured
    *                 with a value.
    */
  def open(pin: Double, mode: Double): Unit = js.native
  def open(pin: Double, mode: Double, option: Double): Unit = js.native
  
  /**
    * Watch pin for changes and execute the callback cb() on events.
    * cb() takes a single argument, the pin which triggered the callback.
    *
    * The optional direction argument can be used to watch for specific events:
    * POLL_LOW: poll for falling edge transitions to low.
    * POLL_HIGH: poll for rising edge transitions to high.
    * POLL_BOTH: poll for both transitions (the default).
    *
    * Due to hardware/kernel limitations we can only poll for changes, and
    * the event detection only says that an event occurred, not which one.
    * The poll interval is a 1ms setInterval() and transitions could come
    * in between detecting the event and reading the value.
    * Therefore this interface is only useful for events which transition
    * slower than approximately 1kHz.
    *
    * To stop watching for pin changes, call poll() again, setting the
    * callback to null.
    * 
    * @param pin - pin to poll
    * @param cb - callback with the pin that changed
    * @param direction - POLL_LOW | POLL_HIGH | POLL_BOTH, default = POLL_BOTH
    */
  def poll(pin: Double): Unit = js.native
  def poll(pin: Double, cb: Null, direction: Double): Unit = js.native
  def poll(pin: Double, cb: CallbackFunction): Unit = js.native
  def poll(pin: Double, cb: CallbackFunction, direction: Double): Unit = js.native
  
  /**
    * Configure the pin's internal pullup or pulldown resistors
    *
    * @param pin - pin to configure
    * @param state - PULL_OFF | PULL_DOWN | PULL_UP
    */
  def pud(pin: Double, state: Double): Unit = js.native
  
  // PWM
  /**
    * Set the PWM refresh rate.
    * 
    * @param clockDivider: power-of-two divisor of the base 19.2MHz rate,
    *                      with a maximum value of 4096 (4.6875kHz).
    */
  def pwmSetClockDivider(clockDivider: Double): Unit = js.native
  
  /**
    * Set the PWM width for a pin.
    * 
    * @param pin
    * @param data - set the PWM width on a pin. Must be less range.
    */
  def pwmSetData(pin: Double, data: Double): Unit = js.native
  
  /**
    * Set the PWM range, i.e., resolution, for a pin. 
    * This determines the maximum pulse width.
    * 
    * @param pin
    * @param range - the resolution, maximum pulse width
    */
  def pwmSetRange(pin: Double, range: Double): Unit = js.native
  
  /**
    * Read the current value of pin, returning either 1 (high) or 0 (low).
    * 
    * This can help with timing-critical code where the JavaScript function
    * call overhead of calling mode() first is enough to miss input data.
    * Altering the pullup state is not supported, as on many devices this
    * requires a delay to activate, defeating the point of this feature.
    * 
    * @param pin - pin number
    * @param mode - default = 0, non-zero will perform a switch to input mode before reading
    * @returns current value of pin, HIGH or LOW
    */
  def read(pin: Double): Double = js.native
  def read(pin: Double, mode: Double): Double = js.native
  
  /**
    * Read length bits from pin into buffer as fast as possible.
    * This is useful for devices which send out information faster than the
    * JavaScript function call overhead can handle, e.g. if you need
    * microsecond accuracy.
    * 
    * @param pin - pin number
    * @param buffer - incoming data
    * @param length - number of bits to read, defaults to buffer.length
    * @param mode - default = 0, non-zero will perform a switch to input mode before reading
    */
  def readbuf(pin: Double, buffer: Buffer): Unit = js.native
  def readbuf(pin: Double, buffer: Buffer, length: Double): Unit = js.native
  def readbuf(pin: Double, buffer: Buffer, length: Double, mode: Double): Unit = js.native
  def readbuf(pin: Double, buffer: Buffer, length: Unit, mode: Double): Unit = js.native
  
  /**
    * Read the current state of the GPIO pad control for the specified
    * GPIO group. On current models of Raspberry Pi there are three groups
    * with corresponding defines:
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
    * @note Note that the pad control registers are not available via /dev/gpiomem,
    * so you will need to use init({gpiomem: false}) and run as root.
    * 
    * @param group - pad group: PAD_GROUP_0_27, PAD_GROUP_28_45 or PAD_GROUP_46_53
    * @returns The current state of the GPIO pad control for the specified
    * GPIO group
    */
  def readpad(group: Double): Double = js.native
  
  // Misc
  /**
    * Sleep for n seconds.
    * @param seconds - number of seconds to sleep
    */
  def sleep(seconds: Double): Unit = js.native
  
  // SPI
  /**
    * Switch pins 119, 21, 23, 24 and 25 (GPIO7-GPIO11) to SPI mode.
    * Once SPI is enabled, the SPI pins are unavailable for GPIO use until
    * spiEnd() is called.
    * 
    * SPI requires gpiomem: false and root privileges. spiBegin() will call
    * init() with the appropriate values if you do not explicitly call it yourself.
    *
    *  Pin | Function
    * -----|----------
    *   19 |   MOSI
    *   21 |   MISO
    *   23 |   SCLK
    *   24 |   CE0
    *   26 |   CE1
    */
  def spiBegin(): Unit = js.native
  
  /**
    * Choose which of the chip select / chip enable pins to control.
    *
    *  Value | Pin
    *  ------|---------------------
    *    0   | SPI_CE0 (24 / GPIO8)
    *    1   | SPI_CE1 (26 / GPIO7)
    *    2   | Both
    *
    * @param cePin - 0 | 1 | 2
    */
  def spiChipSelect(cePin: Double): Unit = js.native
  
  /**
    * Release the pins back to general purpose use.
    */
  def spiEnd(): Unit = js.native
  
  /**
    * If your device's CE pin is active high, use spiSetCSPolarity() to change the polarity.
    * Commonly chip enable (CE) pins are active low, this is the default.
    * 
    * @param cePin
    * @param polarity LOW | HIGH
    */
  def spiSetCSPolarity(cePin: Double, polarity: Double): Unit = js.native
  
  /**
    * Set the SPI clock speed.
    * 
    * @param clockDivider: an even divisor of the base 250MHz rate ranging between 0 and 65536.
    */
  def spiSetClockDivider(clockDivider: Double): Unit = js.native
  
  /**
    * Set the SPI Data Mode:
    *  Mode | CPOL | CPHA
    *  -----|------|-----
    *    0  |  0   |  0
    *    1  |  0   |  1
    *    2  |  1   |  0
    *    3  |  1   |  1
    * 
    * @param mode - spi data mode, 0 | 1 | 2 | 3, default = 0
    */
  def spiSetDataMode(mode: Double): Unit = js.native
  
  /**
    * Transfer data. Data is sent and received in 8-bit chunks via buffers
    * which should be the same size.
    * 
    * @param txBuffer - data to send
    * @param rxBuffer - data received
    * @param txLength - length of txBuffer, rxBuffer should be same length
    */
  def spiTransfer(txBuffer: Buffer, rxBuffer: Buffer, txLength: Double): Unit = js.native
  
  /**
    * Send data and do not care about the data coming back.
    * 
    * @param txBuffer - data to send
    * @param txLength - length of data to send
    */
  def spiWrite(txBuffer: Buffer, txLength: Double): Unit = js.native
  
  /**
    * Sleep for n microseconds.
    * @param microseconds - microseconds to sleep
    */
  def usleep(microseconds: Double): Unit = js.native
  
  /**
    * Set a pin to high or low, using either the HIGH/LOW constants,
    * or simply 1 or 0.
    * 
    * @param pin - pin number
    * @param value - pin value: HIGH or LOW
    */
  def write(pin: Double, value: Double): Unit = js.native
  
  /**
    * Write bits to pin from buffer as fast as possible.
    * 
    * @param pin - pin number
    * @param buffer - bits
    * @param length - number of bits from buffer to write, defaults to buffer.length
    */
  def writebuf(pin: Double, buffer: Buffer): Unit = js.native
  def writebuf(pin: Double, buffer: Buffer, length: Double): Unit = js.native
  
  /**
    * Write control settings to the pad control for group. Uses the same
    * defines as readpad().
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
    * @note Note that the pad control registers are not available via /dev/gpiomem,
    * so you will need to use init({gpiomem: false}) and run as root.
    * 
    * @param group - GPIO group to update: PAD_GROUP_0_27, PAD_GROUP_28_45 or PAD_GROUP_46_53
    * @param control - GPIO pad control state
    */
  def writepad(group: Double, control: Double): Unit = js.native
}
