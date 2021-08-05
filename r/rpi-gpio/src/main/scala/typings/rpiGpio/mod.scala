package typings.rpiGpio

import org.scalablytyped.runtime.Shortcut
import typings.node.eventsMod.EventEmitter
import typings.rpiGpio.anon.DIRHIGH
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rpi-gpio", JSImport.Namespace)
  @js.native
  val ^ : Gpio = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.rpiGpio.rpiGpioStrings.none
    - typings.rpiGpio.rpiGpioStrings.rising
    - typings.rpiGpio.rpiGpioStrings.falling
    - typings.rpiGpio.rpiGpioStrings.both
  */
  trait EDGE extends StObject
  object EDGE {
    
    inline def both: typings.rpiGpio.rpiGpioStrings.both = "both".asInstanceOf[typings.rpiGpio.rpiGpioStrings.both]
    
    inline def falling: typings.rpiGpio.rpiGpioStrings.falling = "falling".asInstanceOf[typings.rpiGpio.rpiGpioStrings.falling]
    
    inline def none: typings.rpiGpio.rpiGpioStrings.none = "none".asInstanceOf[typings.rpiGpio.rpiGpioStrings.none]
    
    inline def rising: typings.rpiGpio.rpiGpioStrings.rising = "rising".asInstanceOf[typings.rpiGpio.rpiGpioStrings.rising]
  }
  
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  
  @js.native
  trait Gpio extends EventEmitter {
    
    val DIR_HIGH: PinDirection = js.native
    
    val DIR_IN: PinDirection = js.native
    
    val DIR_LOW: PinDirection = js.native
    
    val DIR_OUT: PinDirection = js.native
    
    val EDGE_BOTH: EDGE = js.native
    
    val EDGE_FALLING: EDGE = js.native
    
    val EDGE_NONE: EDGE = js.native
    
    val EDGE_RISING: EDGE = js.native
    
    val MODE_BCM: MODE = js.native
    
    val MODE_RPI: MODE = js.native
    
    /**
      * Unexport any pins setup by this module
      *
      * @param [cb] callback
      */
    def destroy(cb: ErrorCallback): Unit = js.native
    
    /**
      * Read a value from a channel
      *
      * @param channel The channel to read from
      * @param cb      Callback which receives the channel's boolean value
      */
    def input(channel: Double, cb: ValueCallback[Boolean]): Unit = js.native
    
    /**
      * Write a value to a channel
      *
      * @param channel The channel to write to
      * @param value   If true, turns the channel on, else turns off
      * @param [cb]      Optional callback
      */
    def output(channel: Double, value: Boolean): Unit = js.native
    def output(channel: Double, value: Boolean, cb: ErrorCallback): Unit = js.native
    
    val promise: DIRHIGH = js.native
    
    /**
      * Read a value from a channel
      *
      * @param channel The channel to read from
      * @param cb      Callback which receives the channel's boolean value
      */
    def read(channel: Double, cb: ValueCallback[Boolean]): Unit = js.native
    
    /**
      * Reset the state of the module
      */
    def reset(): Unit = js.native
    
    /**
      * Set pin reference mode. Defaults to 'mode_rpi'.
      *
      * @param mode Pin reference mode, 'mode_rpi' or 'mode_bcm'
      */
    def setMode(mode: MODE): Unit = js.native
    
    /**
      * Setup a channel for use as an input or output
      *
      * @param channel   Reference to the pin in the current mode's schema
      * @param direction The pin direction, either 'in' or 'out'
      * @param edge       edge Informs the GPIO chip if it needs to generate interrupts. Either 'none', 'rising', 'falling' or 'both'. Defaults to 'none'
      * @param onSetup  callback
      */
    def setup(channel: Double): Unit = js.native
    def setup(channel: Double, direction: Unit, edge: Unit, onSetup: ValueCallback[Boolean]): Unit = js.native
    def setup(channel: Double, direction: Unit, edge: EDGE): Unit = js.native
    def setup(channel: Double, direction: Unit, edge: EDGE, onSetup: ValueCallback[Boolean]): Unit = js.native
    def setup(channel: Double, direction: Unit, onSetup: ValueCallback[Boolean]): Unit = js.native
    def setup(channel: Double, direction: PinDirection): Unit = js.native
    def setup(channel: Double, direction: PinDirection, edge: Unit, onSetup: ValueCallback[Boolean]): Unit = js.native
    def setup(channel: Double, direction: PinDirection, edge: EDGE): Unit = js.native
    def setup(channel: Double, direction: PinDirection, edge: EDGE, onSetup: ValueCallback[Boolean]): Unit = js.native
    def setup(channel: Double, direction: PinDirection, onSetup: ValueCallback[Boolean]): Unit = js.native
    def setup(channel: Double, onSetup: ValueCallback[Boolean]): Unit = js.native
    
    /**
      * Write a value to a channel
      *
      * @param channel The channel to write to
      * @param value   If true, turns the channel on, else turns off
      * @param [cb]      Optional callback
      */
    def write(channel: Double, value: Boolean): Unit = js.native
    def write(channel: Double, value: Boolean, cb: ErrorCallback): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rpiGpio.rpiGpioStrings.mode_rpi
    - typings.rpiGpio.rpiGpioStrings.mode_bcm
  */
  trait MODE extends StObject
  object MODE {
    
    inline def mode_bcm: typings.rpiGpio.rpiGpioStrings.mode_bcm = "mode_bcm".asInstanceOf[typings.rpiGpio.rpiGpioStrings.mode_bcm]
    
    inline def mode_rpi: typings.rpiGpio.rpiGpioStrings.mode_rpi = "mode_rpi".asInstanceOf[typings.rpiGpio.rpiGpioStrings.mode_rpi]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rpiGpio.rpiGpioStrings.in
    - typings.rpiGpio.rpiGpioStrings.out
    - typings.rpiGpio.rpiGpioStrings.low
    - typings.rpiGpio.rpiGpioStrings.high
  */
  trait PinDirection extends StObject
  object PinDirection {
    
    inline def high: typings.rpiGpio.rpiGpioStrings.high = "high".asInstanceOf[typings.rpiGpio.rpiGpioStrings.high]
    
    inline def in: typings.rpiGpio.rpiGpioStrings.in = "in".asInstanceOf[typings.rpiGpio.rpiGpioStrings.in]
    
    inline def low: typings.rpiGpio.rpiGpioStrings.low = "low".asInstanceOf[typings.rpiGpio.rpiGpioStrings.low]
    
    inline def out: typings.rpiGpio.rpiGpioStrings.out = "out".asInstanceOf[typings.rpiGpio.rpiGpioStrings.out]
  }
  
  type ValueCallback[T] = js.Function2[/* err */ js.UndefOr[Error | Null], /* value */ js.UndefOr[T], Unit]
  
  type _To = Gpio
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Gpio = ^
}
