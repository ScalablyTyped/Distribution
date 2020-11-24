package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveToOpts extends FindPathOpts {
  
  /**
    * If this option is set to true, `moveTo` method will return `ERR_NOT_FOUND` if there is no memorized path to reuse. This can
    * significantly save CPU time in some cases. The default value is false.
    */
  var noPathFinding: js.UndefOr[Boolean] = js.native
  
  /**
    * This option enables reusing the path found along multiple game ticks. It allows to save CPU time, but can result in a slightly
    * slower creep reaction behavior. The path is stored into the creep's memory to the `_move` property. The `reusePath` value defines
    * the amount of ticks which the path should be reused for. The default value is 5. Increase the amount to save more CPU, decrease
    * to make the movement more consistent. Set to 0 if you want to disable path reusing.
    */
  var reusePath: js.UndefOr[Double] = js.native
  
  /**
    * If `reusePath` is enabled and this option is set to true, the path will be stored in memory in the short serialized form using
    * `Room.serializePath`. The default value is true.
    */
  var serializeMemory: js.UndefOr[Boolean] = js.native
  
  /**
    * Draw a line along the creep’s path using `RoomVisual.poly`. You can provide either an empty object or custom style parameters.
    */
  var visualizePathStyle: js.UndefOr[PolyStyle] = js.native
}
object MoveToOpts {
  
  @scala.inline
  def apply(): MoveToOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToOpts]
  }
  
  @scala.inline
  implicit class MoveToOptsOps[Self <: MoveToOpts] (val x: Self) extends AnyVal {
    
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
    def setNoPathFinding(value: Boolean): Self = this.set("noPathFinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoPathFinding: Self = this.set("noPathFinding", js.undefined)
    
    @scala.inline
    def setReusePath(value: Double): Self = this.set("reusePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReusePath: Self = this.set("reusePath", js.undefined)
    
    @scala.inline
    def setSerializeMemory(value: Boolean): Self = this.set("serializeMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializeMemory: Self = this.set("serializeMemory", js.undefined)
    
    @scala.inline
    def setVisualizePathStyle(value: PolyStyle): Self = this.set("visualizePathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisualizePathStyle: Self = this.set("visualizePathStyle", js.undefined)
  }
}
