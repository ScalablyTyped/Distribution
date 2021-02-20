package typings.reactBigCalendar.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewStatic extends StObject {
  
  def navigate(date: Date, action: NavigateAction, props: js.Any): Date = js.native
  
  def title(date: Date, options: TitleOptions): String = js.native
}
object ViewStatic {
  
  @scala.inline
  def apply(navigate: (Date, NavigateAction, js.Any) => Date, title: (Date, TitleOptions) => String): ViewStatic = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction3(navigate), title = js.Any.fromFunction2(title))
    __obj.asInstanceOf[ViewStatic]
  }
  
  @scala.inline
  implicit class ViewStaticMutableBuilder[Self <: ViewStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigate(value: (Date, NavigateAction, js.Any) => Date): Self = StObject.set(x, "navigate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTitle(value: (Date, TitleOptions) => String): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
  }
}
