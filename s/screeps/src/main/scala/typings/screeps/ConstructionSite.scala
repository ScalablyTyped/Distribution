package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A site of a structure which is currently under construction.
  */
@js.native
trait ConstructionSite[T /* <: BuildableStructureConstant */] extends RoomObject {
  
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type] = js.native
  
  /**
    * Whether this is your own construction site.
    */
  var my: Boolean = js.native
  
  /**
    * An object with the structure’s owner info.
    */
  var owner: Owner = js.native
  
  /**
    * The current construction progress.
    */
  var progress: Double = js.native
  
  /**
    * The total construction progress needed for the structure to be built.
    */
  var progressTotal: Double = js.native
  
  /**
    * Remove the construction site.
    * @returns Result Code: OK, ERR_NOT_OWNER
    */
  def remove(): Double = js.native
  
  /**
    * One of the `STRUCTURE_*` constants.
    */
  var structureType: T = js.native
}
object ConstructionSite {
  
  @scala.inline
  def apply[T /* <: BuildableStructureConstant */](
    effects: js.Array[RoomObjectEffect],
    id: Id[ConstructionSite[T]],
    my: Boolean,
    owner: Owner,
    pos: RoomPosition,
    progress: Double,
    progressTotal: Double,
    remove: () => Double,
    structureType: T
  ): ConstructionSite[T] = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], my = my.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressTotal = progressTotal.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructionSite[T]]
  }
  
  @scala.inline
  implicit class ConstructionSiteOps[Self <: ConstructionSite[_], T /* <: BuildableStructureConstant */] (val x: Self with ConstructionSite[T]) extends AnyVal {
    
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
    def setId(value: Id[ConstructionSite[T]]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMy(value: Boolean): Self = this.set("my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Owner): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressTotal(value: Double): Self = this.set("progressTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Double): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStructureType(value: T): Self = this.set("structureType", value.asInstanceOf[js.Any])
  }
}
