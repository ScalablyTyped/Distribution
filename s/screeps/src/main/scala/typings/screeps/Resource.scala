package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dropped piece of resource. It will decay after a while if not picked up. Dropped resource pile decays for ceil(amount/1000) units per tick.
  */
@js.native
trait Resource[T /* <: ResourceConstant */] extends RoomObject {
  
  /**
    * The amount of resource units containing.
    */
  var amount: Double = js.native
  
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type] = js.native
  
  /**
    * One of the `RESOURCE_*` constants.
    */
  var resourceType: T = js.native
}
object Resource {
  
  @scala.inline
  def apply[T /* <: ResourceConstant */](
    amount: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Resource[T]],
    pos: RoomPosition,
    resourceType: T
  ): Resource[T] = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource[T]]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource[_], T /* <: ResourceConstant */] (val x: Self with Resource[T]) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Id[Resource[T]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: T): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
