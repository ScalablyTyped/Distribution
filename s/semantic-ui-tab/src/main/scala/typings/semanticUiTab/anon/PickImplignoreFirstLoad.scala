package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'ignoreFirstLoad'> */
@js.native
trait PickImplignoreFirstLoad extends js.Object {
  
  var ignoreFirstLoad: Boolean = js.native
}
object PickImplignoreFirstLoad {
  
  @scala.inline
  def apply(ignoreFirstLoad: Boolean): PickImplignoreFirstLoad = {
    val __obj = js.Dynamic.literal(ignoreFirstLoad = ignoreFirstLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplignoreFirstLoad]
  }
  
  @scala.inline
  implicit class PickImplignoreFirstLoadOps[Self <: PickImplignoreFirstLoad] (val x: Self) extends AnyVal {
    
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
    def setIgnoreFirstLoad(value: Boolean): Self = this.set("ignoreFirstLoad", value.asInstanceOf[js.Any])
  }
}
