package typings.reactDashInstantsearchDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  def createURL(args: js.Any*): String
  def refine(args: js.Any*): js.Any
  def searchForItems(args: js.Any*): js.Any
}

object Anon_Args {
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => String,
    refine: /* repeated */ js.Any => js.Any,
    searchForItems: /* repeated */ js.Any => js.Any
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
  
    __obj.asInstanceOf[Anon_Args]
  }
}

