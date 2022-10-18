package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapDividedmazeMod {
  
  @JSImport("rot-js/lib/map/dividedmaze", JSImport.Default)
  @js.native
  open class default () extends DividedMaze
  
  @js.native
  trait DividedMaze
    extends typings.rotJs.libMapMapMod.default {
    
    var _map: js.Array[js.Array[Double]] = js.native
    
    def _partitionRoom(room: Room): Unit = js.native
    
    def _process(): Unit = js.native
    
    var _stack: js.Array[Room] = js.native
  }
  
  type Room = js.Tuple4[Double, Double, Double, Double]
}
