package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsMain extends js.Object {
  
  var isMain: Boolean = js.native
}
object IsMain {
  
  @scala.inline
  def apply(isMain: Boolean): IsMain = {
    val __obj = js.Dynamic.literal(isMain = isMain.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMain]
  }
  
  @scala.inline
  implicit class IsMainOps[Self <: IsMain] (val x: Self) extends AnyVal {
    
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
    def setIsMain(value: Boolean): Self = this.set("isMain", value.asInstanceOf[js.Any])
  }
}
