package typings.rotDashJs

import typings.rotDashJs.libMapDungeonMod.Dungeon
import typings.rotDashJs.libMapFeaturesMod.Corridor
import typings.rotDashJs.libMapFeaturesMod.Room
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/map/dungeon", JSImport.Namespace)
@js.native
object libMapDungeonMod extends js.Object {
  @js.native
  trait Dungeon
    extends typings.rotDashJs.libMapMapMod.default {
    var _corridors: js.Array[Corridor] = js.native
    var _rooms: js.Array[Room] = js.native
    /**
      * Get all generated corridors
      * @returns {ROT.Map.Feature.Corridor[]}
      */
    def getCorridors(): js.Array[Corridor] = js.native
    /**
      * Get all generated rooms
      * @returns {ROT.Map.Feature.Room[]}
      */
    def getRooms(): js.Array[Room] = js.native
  }
  
  @js.native
  abstract class default protected () extends Dungeon {
    def this(width: Double, height: Double) = this()
  }
  
}

