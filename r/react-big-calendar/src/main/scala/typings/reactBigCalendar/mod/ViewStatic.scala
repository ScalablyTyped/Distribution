package typings.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewStatic extends StObject {
  
  def navigate(date: js.Date, action: NavigateAction, props: Any): js.Date
  
  def title(date: js.Date, options: TitleOptions): String
}
object ViewStatic {
  
  inline def apply(navigate: (js.Date, NavigateAction, Any) => js.Date, title: (js.Date, TitleOptions) => String): ViewStatic = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction3(navigate), title = js.Any.fromFunction2(title))
    __obj.asInstanceOf[ViewStatic]
  }
  
  extension [Self <: ViewStatic](x: Self) {
    
    inline def setNavigate(value: (js.Date, NavigateAction, Any) => js.Date): Self = StObject.set(x, "navigate", js.Any.fromFunction3(value))
    
    inline def setTitle(value: (js.Date, TitleOptions) => String): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
  }
}
