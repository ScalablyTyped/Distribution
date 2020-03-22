package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallThisCompareKeySelector extends js.Object {
  def apply[T](): js.Any = js.native
  def apply[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Any = js.native
  def apply[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): js.Any = js.native
}

