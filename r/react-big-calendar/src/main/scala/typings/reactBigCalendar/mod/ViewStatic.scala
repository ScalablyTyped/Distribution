package typings.reactBigCalendar.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewStatic extends StObject {
  
  def navigate(date: Date, action: NavigateAction, props: js.Any): Date
  
  def title(date: Date, options: TitleOptions): String
}
object ViewStatic {
  
  inline def apply(navigate: (Date, NavigateAction, js.Any) => Date, title: (Date, TitleOptions) => String): ViewStatic = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction3(navigate), title = js.Any.fromFunction2(title))
    __obj.asInstanceOf[ViewStatic]
  }
  
  extension [Self <: ViewStatic](x: Self) {
    
    inline def setNavigate(value: (Date, NavigateAction, js.Any) => Date): Self = StObject.set(x, "navigate", js.Any.fromFunction3(value))
    
    inline def setTitle(value: (Date, TitleOptions) => String): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
  }
}
