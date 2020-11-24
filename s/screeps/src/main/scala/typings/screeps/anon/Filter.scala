package typings.screeps.anon

import typings.screeps.FilterObject
import typings.screeps.FindClosestByPathAlgorithm
import typings.screeps.HasRoomPosition
import typings.screeps.RoomPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter[T /* <: HasRoomPosition | RoomPosition */] extends js.Object {
  
  var algorithm: js.UndefOr[FindClosestByPathAlgorithm] = js.native
  
  var filter: js.UndefOr[(js.Function1[/* object */ T, Boolean]) | FilterObject | String] = js.native
}
object Filter {
  
  @scala.inline
  def apply[T /* <: HasRoomPosition | RoomPosition */](): Filter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter[T]]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter[_], T /* <: HasRoomPosition | RoomPosition */] (val x: Self with Filter[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithm(value: FindClosestByPathAlgorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setFilterFunction1(value: /* object */ T => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilter(value: (js.Function1[/* object */ T, Boolean]) | FilterObject | String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
}
