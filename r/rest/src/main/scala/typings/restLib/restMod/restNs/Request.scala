package typings
package restLib.restMod.restNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Request extends js.Object {
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var canceled: js.UndefOr[scala.Boolean] = js.undefined
  var entity: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var originator: js.UndefOr[js.Function1[/* request */ js.UndefOr[Request], ResponsePromise]] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

