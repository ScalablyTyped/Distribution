package typings.screeps.global

import typings.screeps.Id
import typings.screeps.ResourceConstant
import typings.screeps.ResourceConstructor
import typings.screeps.RoomObjectEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Resource")
@js.native
class Resource protected ()
  extends StObject
     with typings.screeps.Resource[ResourceConstant] {
  def this(id: Id[typings.screeps.Resource[ResourceConstant]]) = this()
  
  /**
    * The amount of resource units containing.
    */
  /* CompleteClass */
  var amount: Double = js.native
  
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
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typings.screeps.RoomPosition = js.native
  
  /**
    * One of the `RESOURCE_*` constants.
    */
  /* CompleteClass */
  var resourceType: ResourceConstant = js.native
}
object Resource {
  
  inline def apply: ResourceConstructor = js.Dynamic.global.selectDynamic("Resource").asInstanceOf[ResourceConstructor]
}
