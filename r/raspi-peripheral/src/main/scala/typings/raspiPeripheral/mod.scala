package typings.raspiPeripheral

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raspi-peripheral", "Peripheral")
  @js.native
  open class Peripheral protected () extends EventEmitter {
    def this(pins: String) = this()
    def this(pins: js.Array[String | Double]) = this()
    def this(pins: Double) = this()
    
    /* private */ var _alive: Any = js.native
    
    /* private */ var _pins: Any = js.native
    
    val alive: Boolean = js.native
    
    def destroy(): Unit = js.native
    
    val pins: js.Array[Double] = js.native
    
    def validateAlive(): Unit = js.native
  }
}
