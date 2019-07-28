package typings.reduxDashPromiseDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PromiseTypeDelimiter extends js.Object {
  var promiseTypeDelimiter: js.UndefOr[String] = js.undefined
  var promiseTypeSuffixes: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_PromiseTypeDelimiter {
  @scala.inline
  def apply(promiseTypeDelimiter: String = null, promiseTypeSuffixes: js.Array[String] = null): Anon_PromiseTypeDelimiter = {
    val __obj = js.Dynamic.literal()
    if (promiseTypeDelimiter != null) __obj.updateDynamic("promiseTypeDelimiter")(promiseTypeDelimiter)
    if (promiseTypeSuffixes != null) __obj.updateDynamic("promiseTypeSuffixes")(promiseTypeSuffixes)
    __obj.asInstanceOf[Anon_PromiseTypeDelimiter]
  }
}

