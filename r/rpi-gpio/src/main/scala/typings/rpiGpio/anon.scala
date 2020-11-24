package typings.rpiGpio

import typings.rpiGpio.mod.EDGE
import typings.rpiGpio.mod.MODE
import typings.rpiGpio.mod.PinDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait DIRHIGH extends js.Object {
    
    var DIR_HIGH: PinDirection = js.native
    
    var DIR_IN: PinDirection = js.native
    
    var DIR_LOW: PinDirection = js.native
    
    var DIR_OUT: PinDirection = js.native
    
    var EDGE_BOTH: EDGE = js.native
    
    var EDGE_FALLING: EDGE = js.native
    
    var EDGE_NONE: EDGE = js.native
    
    var EDGE_RISING: EDGE = js.native
    
    var MODE_BCM: MODE = js.native
    
    var MODE_RPI: MODE = js.native
    
    /**
      * @see {@link Gpio.destroy}
      * @returns Promise
      */
    def destroy(): js.Promise[_] = js.native
    
    /**
      * @see {@link Gpio.read}
      * @param channel
      * @returns Promise
      */
    def read(channel: Double): js.Promise[Boolean] = js.native
    
    /**
      * @see {@link Gpio.setup}
      * @param channel
      * @param direction
      * @param edge
      * @returns Promise
      */
    def setup(channel: Double, direction: PinDirection): js.Promise[Boolean] = js.native
    def setup(channel: Double, direction: PinDirection, edge: EDGE): js.Promise[Boolean] = js.native
    
    /**
      * @see {@link Gpio.write}
      * @param channel
      * @param value
      * @returns Promise
      */
    def write(channel: Double, value: Boolean): js.Promise[_] = js.native
  }
}
