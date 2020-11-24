package typings.sentryBrowser.helpersMod

import typings.sentryBrowser.anon.Mechanism
import typings.sentryTypes.wrappedfunctionMod.WrappedFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/helpers", "wrap")
@js.native
object wrap extends js.Object {
  
  def apply(fn: WrappedFunction): js.Any = js.native
  def apply(fn: WrappedFunction, options: js.UndefOr[scala.Nothing], before: WrappedFunction): js.Any = js.native
  def apply(fn: WrappedFunction, options: Mechanism): js.Any = js.native
  def apply(fn: WrappedFunction, options: Mechanism, before: WrappedFunction): js.Any = js.native
}
