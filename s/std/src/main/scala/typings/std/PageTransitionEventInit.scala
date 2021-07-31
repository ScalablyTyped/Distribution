package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageTransitionEventInit
  extends StObject
     with EventInit {
  
  var persisted: js.UndefOr[scala.Boolean] = js.undefined
}
object PageTransitionEventInit {
  
  @scala.inline
  def apply(): PageTransitionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageTransitionEventInit]
  }
  
  @scala.inline
  implicit class PageTransitionEventInitMutableBuilder[Self <: PageTransitionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPersisted(value: scala.Boolean): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistedUndefined: Self = StObject.set(x, "persisted", js.undefined)
  }
}
