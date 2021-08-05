package typings.rotJs

import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.anon.PartialOptionsCorridorLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diggerMod {
  
  @JSImport("rot-js/lib/map/digger", JSImport.Default)
  @js.native
  class default protected () extends Digger {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: PartialOptionsCorridorLength) = this()
  }
  
  @js.native
  trait Digger
    extends typings.rotJs.dungeonMod.default {
    
    /**
      * Find empty spaces surrounding rooms, and apply doors.
      */
    def _addDoors(): Unit = js.native
    
    def _canBeDugCallback(x: Double, y: Double): Boolean = js.native
    
    def _digCallback(x: Double, y: Double, value: Double): Unit = js.native
    
    var _dug: Double = js.native
    
    var _featureAttempts: Double = js.native
    
    var _features: StringDictionary[Double] = js.native
    
    /**
      * Get a suitable wall
      */
    def _findWall(): String | Null = js.native
    
    def _firstRoom(): Unit = js.native
    
    /**
      * Returns vector in "digging" direction, or false, if this does not exist (or is not unique)
      */
    def _getDiggingDirection(cx: Double, cy: Double): js.Array[Double] | Null = js.native
    
    def _isWallCallback(x: Double, y: Double): Boolean = js.native
    
    var _map: js.Array[js.Array[Double]] = js.native
    
    var _options: Options = js.native
    
    def _priorityWallCallback(x: Double, y: Double): Unit = js.native
    
    def _removeSurroundingWalls(cx: Double, cy: Double): Unit = js.native
    
    /**
      * Tries adding a feature
      * @returns {bool} was this a successful try?
      */
    def _tryFeature(x: Double, y: Double, dx: Double, dy: Double): Boolean = js.native
    
    var _walls: StringDictionary[Double] = js.native
  }
  
  trait Options extends StObject {
    
    var corridorLength: js.Tuple2[Double, Double]
    
    var dugPercentage: Double
    
    var roomHeight: js.Tuple2[Double, Double]
    
    var roomWidth: js.Tuple2[Double, Double]
    
    var timeLimit: Double
  }
  object Options {
    
    inline def apply(
      corridorLength: js.Tuple2[Double, Double],
      dugPercentage: Double,
      roomHeight: js.Tuple2[Double, Double],
      roomWidth: js.Tuple2[Double, Double],
      timeLimit: Double
    ): Options = {
      val __obj = js.Dynamic.literal(corridorLength = corridorLength.asInstanceOf[js.Any], dugPercentage = dugPercentage.asInstanceOf[js.Any], roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any], timeLimit = timeLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCorridorLength(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "corridorLength", value.asInstanceOf[js.Any])
      
      inline def setDugPercentage(value: Double): Self = StObject.set(x, "dugPercentage", value.asInstanceOf[js.Any])
      
      inline def setRoomHeight(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomHeight", value.asInstanceOf[js.Any])
      
      inline def setRoomWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomWidth", value.asInstanceOf[js.Any])
      
      inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
    }
  }
}
