package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl, 'noCookieStorage'> */
@js.native
trait PickImplnoCookieStorage extends StObject {
  
  var noCookieStorage: String = js.native
}
object PickImplnoCookieStorage {
  
  @scala.inline
  def apply(noCookieStorage: String): PickImplnoCookieStorage = {
    val __obj = js.Dynamic.literal(noCookieStorage = noCookieStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoCookieStorage]
  }
  
  @scala.inline
  implicit class PickImplnoCookieStorageMutableBuilder[Self <: PickImplnoCookieStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoCookieStorage(value: String): Self = StObject.set(x, "noCookieStorage", value.asInstanceOf[js.Any])
  }
}
