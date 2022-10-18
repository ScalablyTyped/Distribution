package typings.screeps.global

import org.scalablytyped.runtime.Shortcut
import typings.screeps.DirectionConstant
import typings.screeps.Id
import typings.screeps.RoomObjectEffect
import typings.screeps.ScreepsReturnCode
import typings.screeps.StructureSpawnConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Spawn")
@js.native
open class Spawn protected ()
  extends StObject
     with typings.screeps.StructureSpawn {
  def this(id: Id[typings.screeps.StructureSpawn]) = this()
  
  /**
    * Destroy this structure immediately.
    */
  /* CompleteClass */
  override def destroy(): ScreepsReturnCode = js.native
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  var effects: js.Array[RoomObjectEffect] = js.native
  
  /**
    * The current amount of hit points of the structure.
    */
  /* CompleteClass */
  var hits: Double = js.native
  
  /**
    * The total amount of hit points of the structure.
    */
  /* CompleteClass */
  var hitsMax: Double = js.native
  
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  var id: Id[this.type] = js.native
  
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  
  /**
    * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
    */
  /* CompleteClass */
  var my: Boolean = js.native
  
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  /* CompleteClass */
  override def notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode = js.native
  
  /**
    * An object with the structure’s owner info (if present) containing the following properties: username
    */
  /* CompleteClass */
  var owner: /* import warning: importer.ImportType#apply Failed type conversion: T extends screeps.STRUCTURE_CONTROLLER ? screeps.Owner | undefined : screeps.Owner */ js.Any = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typings.screeps.RoomPosition = js.native
  
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  var room_Structure: typings.screeps.Room = js.native
  
  /**
    * One of the STRUCTURE_* constants.
    */
  /* CompleteClass */
  var structureType: typings.screeps.STRUCTURE_SPAWN = js.native
}
object Spawn extends Shortcut {
  
  @JSGlobal("Spawn")
  @js.native
  val ^ : StructureSpawnConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Spawn.Spawning")
  @js.native
  open class Spawning protected ()
    extends StObject
       with typings.screeps.Spawning {
    def this(id: Id[typings.screeps.StructureSpawn]) = this()
    
    /**
      * Cancel spawning immediately. Energy spent on spawning is not returned.
      */
    /* CompleteClass */
    override def cancel(): (typings.screeps.OK & ScreepsReturnCode) | (typings.screeps.ERR_NOT_OWNER & ScreepsReturnCode) = js.native
    
    /**
      * An array with the spawn directions
      * @see http://docs.screeps.com/api/#StructureSpawn.Spawning.setDirections
      */
    /* CompleteClass */
    var directions: js.Array[DirectionConstant] = js.native
    
    /**
      * The name of the creep
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Time needed in total to complete the spawning.
      */
    /* CompleteClass */
    var needTime: Double = js.native
    
    /**
      * Remaining time to go.
      */
    /* CompleteClass */
    var remainingTime: Double = js.native
    
    /**
      * Set desired directions where the creep should move when spawned.
      * @param directions An array with the spawn directions
      */
    /* CompleteClass */
    override def setDirections(directions: js.Array[DirectionConstant]): (typings.screeps.OK & ScreepsReturnCode) | (typings.screeps.ERR_NOT_OWNER & ScreepsReturnCode) | (typings.screeps.ERR_INVALID_ARGS & ScreepsReturnCode) = js.native
    
    /**
      * A link to the spawn
      */
    /* CompleteClass */
    var spawn: typings.screeps.StructureSpawn = js.native
  }
  
  type _To = StructureSpawnConstructor
  
  /* This means you don't have to write `^`, but can instead just say `Spawn.foo` */
  override def _to: StructureSpawnConstructor = ^
}
