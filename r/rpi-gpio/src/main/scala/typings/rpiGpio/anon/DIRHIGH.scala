package typings.rpiGpio.anon

import typings.rpiGpio.mod.EDGE
import typings.rpiGpio.mod.MODE
import typings.rpiGpio.mod.PinDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DIRHIGH extends js.Object {
  var DIR_HIGH: PinDirection
  var DIR_IN: PinDirection
  var DIR_LOW: PinDirection
  var DIR_OUT: PinDirection
  var EDGE_BOTH: EDGE
  var EDGE_FALLING: EDGE
  var EDGE_NONE: EDGE
  var EDGE_RISING: EDGE
  var MODE_BCM: MODE
  var MODE_RPI: MODE
  /**
    * @see {@link Gpio.destroy}
    * @returns Promise
    */
  def destroy(): js.Promise[_]
  /**
    * @see {@link Gpio.read}
    * @param channel
    * @returns Promise
    */
  def read(channel: Double): js.Promise[_]
  /**
    * @see {@link Gpio.setup}
    * @param channel
    * @param direction
    * @param edge
    * @returns Promise
    */
  def setup(channel: Double, direction: PinDirection, edge: EDGE): js.Promise[_]
  /**
    * @see {@link Gpio.write}
    * @param channel
    * @param value
    * @returns Promise
    */
  def write(channel: Double, value: Boolean): js.Promise[_]
}

object DIRHIGH {
  @scala.inline
  def apply(
    DIR_HIGH: PinDirection,
    DIR_IN: PinDirection,
    DIR_LOW: PinDirection,
    DIR_OUT: PinDirection,
    EDGE_BOTH: EDGE,
    EDGE_FALLING: EDGE,
    EDGE_NONE: EDGE,
    EDGE_RISING: EDGE,
    MODE_BCM: MODE,
    MODE_RPI: MODE,
    destroy: () => js.Promise[_],
    read: Double => js.Promise[_],
    setup: (Double, PinDirection, EDGE) => js.Promise[_],
    write: (Double, Boolean) => js.Promise[_]
  ): DIRHIGH = {
    val __obj = js.Dynamic.literal(DIR_HIGH = DIR_HIGH.asInstanceOf[js.Any], DIR_IN = DIR_IN.asInstanceOf[js.Any], DIR_LOW = DIR_LOW.asInstanceOf[js.Any], DIR_OUT = DIR_OUT.asInstanceOf[js.Any], EDGE_BOTH = EDGE_BOTH.asInstanceOf[js.Any], EDGE_FALLING = EDGE_FALLING.asInstanceOf[js.Any], EDGE_NONE = EDGE_NONE.asInstanceOf[js.Any], EDGE_RISING = EDGE_RISING.asInstanceOf[js.Any], MODE_BCM = MODE_BCM.asInstanceOf[js.Any], MODE_RPI = MODE_RPI.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), read = js.Any.fromFunction1(read), setup = js.Any.fromFunction3(setup), write = js.Any.fromFunction2(write))
    __obj.asInstanceOf[DIRHIGH]
  }
}

