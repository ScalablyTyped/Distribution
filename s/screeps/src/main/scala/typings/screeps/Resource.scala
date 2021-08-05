package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dropped piece of resource. It will decay after a while if not picked up. Dropped resource pile decays for ceil(amount/1000) units per tick.
  */
trait Resource[T /* <: ResourceConstant */]
  extends StObject
     with RoomObject {
  
  /**
    * The amount of resource units containing.
    */
  var amount: Double
  
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type]
  
  /**
    * One of the `RESOURCE_*` constants.
    */
  var resourceType: T
}
object Resource {
  
  inline def apply[T /* <: ResourceConstant */](
    amount: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Resource[T]],
    pos: RoomPosition,
    resourceType: T
  ): Resource[T] = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource[T]]
  }
  
  extension [Self <: Resource[?], T /* <: ResourceConstant */](x: Self & Resource[T]) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id[Resource[T]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: T): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
