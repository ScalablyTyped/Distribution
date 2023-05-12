package typings.sentryUtils.anon

import typings.sentryUtils.sentryUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends StObject {
  
  def apply(msg: Any, url: Any, line: Any, column: Any, error: Any): Boolean = js.native
  
  var __SENTRY_INSTRUMENTED__ : js.UndefOr[`true`] = js.native
  
  var __SENTRY_LOADER__ : js.UndefOr[`true`] = js.native
}
