package typings.semanticUiSidebar.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, 'ios'> */
@js.native
trait PickImpliosIos extends js.Object {
  
  var ios: RegExp = js.native
}
object PickImpliosIos {
  
  @scala.inline
  def apply(ios: RegExp): PickImpliosIos = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpliosIos]
  }
  
  @scala.inline
  implicit class PickImpliosIosOps[Self <: PickImpliosIos] (val x: Self) extends AnyVal {
    
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
    def setIos(value: RegExp): Self = this.set("ios", value.asInstanceOf[js.Any])
  }
}
