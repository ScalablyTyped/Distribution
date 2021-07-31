package typings.semanticUiSidebar.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, 'ios'> */
trait PickImpliosIos extends StObject {
  
  var ios: RegExp
}
object PickImpliosIos {
  
  @scala.inline
  def apply(ios: RegExp): PickImpliosIos = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpliosIos]
  }
  
  @scala.inline
  implicit class PickImpliosIosMutableBuilder[Self <: PickImpliosIos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIos(value: RegExp): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
