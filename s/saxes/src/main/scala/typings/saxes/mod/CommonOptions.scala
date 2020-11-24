package typings.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonOptions extends js.Object {
  
  /**
    * A file name to use for error reporting. "File name" is a loose concept. You
    * could use a URL to some resource, or any descriptive name you like.
    */
  var fileName: js.UndefOr[String] = js.native
  
  /** Whether to accept XML fragments. Unset means ``false``. */
  var fragment: js.UndefOr[Boolean] = js.native
  
  /** Whether to track positions. Unset means ``true``. */
  var position: js.UndefOr[Boolean] = js.native
}
object CommonOptions {
  
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setFragment(value: Boolean): Self = this.set("fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragment: Self = this.set("fragment", js.undefined)
    
    @scala.inline
    def setPosition(value: Boolean): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
