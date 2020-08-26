package typings.rpiGpio.mod

import typings.node.eventsMod.EventEmitter
import typings.rpiGpio.anon.DIRHIGH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val promise: DIRHIGH = js.native
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
  def setup(
    channel: Double,
    direction: js.UndefOr[scala.Nothing],
    edge: js.UndefOr[scala.Nothing],
    onSetup: ValueCallback[Boolean]
  ): Unit = js.native
  def setup(channel: Double, direction: js.UndefOr[scala.Nothing], edge: EDGE): Unit = js.native
  def setup(channel: Double, direction: js.UndefOr[scala.Nothing], edge: EDGE, onSetup: ValueCallback[Boolean]): Unit = js.native
  def setup(channel: Double, direction: js.UndefOr[scala.Nothing], onSetup: ValueCallback[Boolean]): Unit = js.native
  def setup(channel: Double, direction: PinDirection): Unit = js.native
  def setup(
    channel: Double,
    direction: PinDirection,
    edge: js.UndefOr[scala.Nothing],
    onSetup: ValueCallback[Boolean]
  ): Unit = js.native
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

