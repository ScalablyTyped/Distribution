package typings.rotJs

import typings.rotJs.featuresMod.Corridor
import typings.rotJs.featuresMod.Room
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dungeonMod {
  
  @JSImport("rot-js/lib/map/dungeon", JSImport.Default)
  @js.native
  abstract class default protected () extends Dungeon {
    def this(width: Double, height: Double) = this()
  }
  
  @js.native
  trait Dungeon
    extends typings.rotJs.mapMapMod.default {
    
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
}
