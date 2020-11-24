package typings.simplSchema.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeepArrays extends js.Object {
  
  var keepArrays: js.UndefOr[Boolean] = js.native
}
object KeepArrays {
  
  @scala.inline
  def apply(): KeepArrays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeepArrays]
  }
  
  @scala.inline
  implicit class KeepArraysOps[Self <: KeepArrays] (val x: Self) extends AnyVal {
    
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
    def setKeepArrays(value: Boolean): Self = this.set("keepArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepArrays: Self = this.set("keepArrays", js.undefined)
  }
}
