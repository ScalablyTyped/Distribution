package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithLoader extends js.Object {
  
  var id: String = js.native
  
  var withLoader: Boolean = js.native
}
object WithLoader {
  
  @scala.inline
  def apply(id: String, withLoader: Boolean): WithLoader = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], withLoader = withLoader.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithLoader]
  }
  
  @scala.inline
  implicit class WithLoaderOps[Self <: WithLoader] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithLoader(value: Boolean): Self = this.set("withLoader", value.asInstanceOf[js.Any])
  }
}
