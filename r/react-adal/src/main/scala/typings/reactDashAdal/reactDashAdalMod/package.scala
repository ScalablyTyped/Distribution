package typings.reactDashAdal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashAdalMod {
  type TokenCallback = js.Function3[/* errorDesc */ String | Null, /* token */ String | Null, /* error */ js.Any, Unit]
  type UserCallback = js.Function2[/* errorDesc */ String | Null, /* user */ UserInfo | Null, Unit]
}
