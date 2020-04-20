package typings.reactBigCalendar.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewStatic extends js.Object {
  def navigate(date: Date, action: NavigateAction, props: js.Any): Date
  def title(date: Date, options: TitleOptions): String
}

object ViewStatic {
  @scala.inline
  def apply(navigate: (Date, NavigateAction, js.Any) => Date, title: (Date, TitleOptions) => String): ViewStatic = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction3(navigate), title = js.Any.fromFunction2(title))
    __obj.asInstanceOf[ViewStatic]
  }
}

