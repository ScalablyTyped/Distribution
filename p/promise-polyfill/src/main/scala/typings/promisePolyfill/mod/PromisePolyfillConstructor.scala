package typings.promisePolyfill.mod

import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromisePolyfillConstructor extends PromiseConstructor {
  
  var _immediateFn: js.UndefOr[js.Function1[/* handler */ js.Function0[Unit] | String, Unit]] = js.native
}
