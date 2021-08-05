package typings.screeps.global

import typings.screeps.BuildableStructureConstant
import typings.screeps.ConstructionSiteConstructor
import typings.screeps.Id
import typings.screeps.Owner
import typings.screeps.RoomObjectEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ConstructionSite")
@js.native
class ConstructionSite protected ()
  extends StObject
     with typings.screeps.ConstructionSite[BuildableStructureConstant] {
  def this(id: Id[typings.screeps.ConstructionSite[BuildableStructureConstant]]) = this()
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  var effects: js.Array[RoomObjectEffect] = js.native
  
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  /* CompleteClass */
  var id: Id[this.type] = js.native
  
  /**
    * Whether this is your own construction site.
    */
  /* CompleteClass */
  var my: Boolean = js.native
  
  /**
    * An object with the structure’s owner info.
    */
  /* CompleteClass */
  var owner: Owner = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typings.screeps.RoomPosition = js.native
  
  /**
    * The current construction progress.
    */
  /* CompleteClass */
  var progress: Double = js.native
  
  /**
    * The total construction progress needed for the structure to be built.
    */
  /* CompleteClass */
  var progressTotal: Double = js.native
  
  /**
    * Remove the construction site.
    * @returns Result Code: OK, ERR_NOT_OWNER
    */
  /* CompleteClass */
  override def remove(): Double = js.native
  
  /**
    * One of the `STRUCTURE_*` constants.
    */
  /* CompleteClass */
  var structureType: BuildableStructureConstant = js.native
}
object ConstructionSite {
  
  inline def apply: ConstructionSiteConstructor = js.Dynamic.global.selectDynamic("ConstructionSite").asInstanceOf[ConstructionSiteConstructor]
}
