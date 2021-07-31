package typings.rotJs

import typings.rotJs.anon.PartialOptionsCellHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rogueMod {
  
  @JSImport("rot-js/lib/map/rogue", JSImport.Default)
  @js.native
  class default protected () extends Rogue {
    def this(width: Double, height: Double, options: PartialOptionsCellHeight) = this()
  }
  
  trait Options extends StObject {
    
    /** Number of cells to create on the vertical (number of rooms vertically) */
    var cellHeight: Double
    
    /** Number of cells to create on the horizontal (number of rooms horizontally) */
    var cellWidth: Double
    
    /** Room min and max height - normally set auto-magically via the constructor. */
    var roomHeight: js.Tuple2[Double, Double]
    
    /** Room min and max width - normally set auto-magically via the constructor. */
    var roomWidth: js.Tuple2[Double, Double]
  }
  object Options {
    
    @scala.inline
    def apply(
      cellHeight: Double,
      cellWidth: Double,
      roomHeight: js.Tuple2[Double, Double],
      roomWidth: js.Tuple2[Double, Double]
    ): Options = {
      val __obj = js.Dynamic.literal(cellHeight = cellHeight.asInstanceOf[js.Any], cellWidth = cellWidth.asInstanceOf[js.Any], roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomHeight(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type Point = js.Tuple2[Double, Double]
  
  @js.native
  trait Rogue
    extends typings.rotJs.mapMapMod.default {
    
    def _calculateRoomSize(size: Double, cell: Double): js.Tuple2[Double, Double] = js.native
    
    def _connectRooms(): Unit = js.native
    
    def _connectUnconnectedRooms(): Unit = js.native
    
    def _createCorridors(): Unit = js.native
    
    def _createRandomRoomConnections(): Unit = js.native
    
    def _createRooms(): Unit = js.native
    
    def _drawCorridor(startPosition: Point, endPosition: Point): Unit = js.native
    
    def _getWallPosition(aRoom: Room, aDirection: Double): Point = js.native
    
    def _initRooms(): Unit = js.native
    
    var _options: js.Any = js.native
    
    var connectedCells: js.Any = js.native
    
    var map: js.Any = js.native
    
    var rooms: js.Any = js.native
  }
  
  trait Room extends StObject {
    
    var cellx: Double
    
    var celly: Double
    
    var connections: js.Array[js.Any]
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Room {
    
    @scala.inline
    def apply(
      cellx: Double,
      celly: Double,
      connections: js.Array[js.Any],
      height: Double,
      width: Double,
      x: Double,
      y: Double
    ): Room = {
      val __obj = js.Dynamic.literal(cellx = cellx.asInstanceOf[js.Any], celly = celly.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Room]
    }
    
    @scala.inline
    implicit class RoomMutableBuilder[Self <: Room] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellx(value: Double): Self = StObject.set(x, "cellx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCelly(value: Double): Self = StObject.set(x, "celly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnections(value: js.Array[js.Any]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionsVarargs(value: js.Any*): Self = StObject.set(x, "connections", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
