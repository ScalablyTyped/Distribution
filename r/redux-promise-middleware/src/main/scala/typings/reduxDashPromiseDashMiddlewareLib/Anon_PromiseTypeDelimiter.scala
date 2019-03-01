package typings
package reduxDashPromiseDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PromiseTypeDelimiter extends js.Object {
  var promiseTypeDelimiter: js.UndefOr[java.lang.String] = js.undefined
  var promiseTypeSuffixes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_PromiseTypeDelimiter {
  @scala.inline
  def apply(
    promiseTypeDelimiter: java.lang.String = null,
    promiseTypeSuffixes: js.Array[java.lang.String] = null
  ): Anon_PromiseTypeDelimiter = {
    val __obj = js.Dynamic.literal()
    if (promiseTypeDelimiter != null) __obj.updateDynamic("promiseTypeDelimiter")(promiseTypeDelimiter)
    if (promiseTypeSuffixes != null) __obj.updateDynamic("promiseTypeSuffixes")(promiseTypeSuffixes)
    __obj.asInstanceOf[Anon_PromiseTypeDelimiter]
  }
}

