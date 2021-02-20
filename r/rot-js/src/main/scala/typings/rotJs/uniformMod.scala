package typings.rotJs

import typings.rotJs.anon.PartialOptionsRoomDugPercentage
import typings.rotJs.featuresMod.Room
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniformMod {
  
  @JSImport("rot-js/lib/map/uniform", JSImport.Default)
  @js.native
  class default protected () extends Uniform {
    def this(width: Double, height: Double, options: PartialOptionsRoomDugPercentage) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var roomDugPercentage: Double = js.native
    
    var roomHeight: js.Tuple2[Double, Double] = js.native
    
    var roomWidth: js.Tuple2[Double, Double] = js.native
    
    var timeLimit: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      roomDugPercentage: Double,
      roomHeight: js.Tuple2[Double, Double],
      roomWidth: js.Tuple2[Double, Double],
      timeLimit: Double
    ): Options = {
      val __obj = js.Dynamic.literal(roomDugPercentage = roomDugPercentage.asInstanceOf[js.Any], roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any], timeLimit = timeLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoomDugPercentage(value: Double): Self = StObject.set(x, "roomDugPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomHeight(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
    }
  }
  
  type Point = js.Tuple2[Double, Double]
  
  @js.native
  trait Uniform
    extends typings.rotJs.dungeonMod.default {
    
    def _canBeDugCallback(x: Double, y: Double): Boolean = js.native
    
    /**
      * For a given room, find the closest one from the list
      */
    def _closestRoom(rooms: js.Array[Room], room: Room): Room | Null = js.native
    
    def _connectRooms(room1: Room, room2: Room): Boolean = js.native
    
    var _connected: js.Array[Room] = js.native
    
    var _corridorAttempts: Double = js.native
    
    def _digCallback(x: Double, y: Double, value: Double): Unit = js.native
    
    /**
      * Dig a polyline.
      */
    def _digLine(points: js.Array[Point]): Unit = js.native
    
    var _dug: Double = js.native
    
    /**
      * Generates connectors beween rooms
      * @returns {bool} success Was this attempt successfull?
      */
    def _generateCorridors(): Boolean = js.native
    
    /**
      * Try to generate one room
      */
    def _generateRoom(): Room | Null = js.native
    
    /**
      * Generates a suitable amount of rooms
      */
    def _generateRooms(): Unit = js.native
    
    def _isWallCallback(x: Double, y: Double): Boolean = js.native
    
    var _map: js.Array[js.Array[Double]] = js.native
    
    var _options: Options = js.native
    
    def _placeInWall(room: Room, dirIndex: Double): Point | Null = js.native
    
    var _roomAttempts: Double = js.native
    
    var _unconnected: js.Array[Room] = js.native
  }
}
