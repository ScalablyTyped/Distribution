package typings.semanticUiNag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl, 'noCookieStorage'> */
@js.native
trait PickImplnoCookieStorage extends js.Object {
  
  var noCookieStorage: String = js.native
}
object PickImplnoCookieStorage {
  
  @scala.inline
  def apply(noCookieStorage: String): PickImplnoCookieStorage = {
    val __obj = js.Dynamic.literal(noCookieStorage = noCookieStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoCookieStorage]
  }
  
  @scala.inline
  implicit class PickImplnoCookieStorageOps[Self <: PickImplnoCookieStorage] (val x: Self) extends AnyVal {
    
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
    def setNoCookieStorage(value: String): Self = this.set("noCookieStorage", value.asInstanceOf[js.Any])
  }
}
