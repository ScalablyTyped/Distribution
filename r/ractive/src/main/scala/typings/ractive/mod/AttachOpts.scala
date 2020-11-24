package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachOpts extends js.Object {
  
  /** If the target anchor is already occupied, this instance will be moved to the end of the queue to occupy it, meaning that all of the other attached instances will need to be detached before this one can occupy the anchor. */
  var append: js.UndefOr[Boolean] = js.native
  
  /** The index of the position in the queue for the target anchor at which to insert this instance. 0 is equivalent to prepend: true. */
  var insertAt: js.UndefOr[Double] = js.native
  
  /** If the target anchor is already occupied, this instance will be moved to the beginning of the queue to occupy it, meaning it will replace the instance currently occupying the anchor. */
  var prepend: js.UndefOr[Boolean] = js.native
  
  /** The name of an anchor to attach a child to e.g. 'foo' for <#foo />. */
  var target: js.UndefOr[String] = js.native
}
object AttachOpts {
  
  @scala.inline
  def apply(): AttachOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachOpts]
  }
  
  @scala.inline
  implicit class AttachOptsOps[Self <: AttachOpts] (val x: Self) extends AnyVal {
    
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
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    
    @scala.inline
    def setInsertAt(value: Double): Self = this.set("insertAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertAt: Self = this.set("insertAt", js.undefined)
    
    @scala.inline
    def setPrepend(value: Boolean): Self = this.set("prepend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
