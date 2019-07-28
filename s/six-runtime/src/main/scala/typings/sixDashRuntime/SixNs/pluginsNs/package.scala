package typings.sixDashRuntime.SixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pluginsNs {
  type rpc = js.Function1[/* config */ js.Object, js.Object]
  type whiteList = js.Function1[/* ctx */ js.Object, Boolean]
}
