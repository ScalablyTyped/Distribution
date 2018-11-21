package typings
package promiseDashPolyfillLib.promiseDashPolyfillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisePolyfillConstructor
  extends stdLib.PromiseConstructor {
  var _immediateFn: js.UndefOr[
    js.Function1[/* handler */ js.Function0[scala.Unit] | java.lang.String, scala.Unit]
  ] = js.native
}

