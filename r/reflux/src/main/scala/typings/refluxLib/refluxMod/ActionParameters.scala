package typings
package refluxLib.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionParameters extends js.Object {
  var asyncResult: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var preEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, js.UndefOr[js.Array[_]]]] = js.undefined
  var shouldEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Boolean]] = js.undefined
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

