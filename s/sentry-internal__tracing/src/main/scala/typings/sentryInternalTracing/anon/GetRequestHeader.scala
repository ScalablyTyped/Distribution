package typings.sentryInternalTracing.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRequestHeader extends StObject {
  
  var __sentry_own_request__ : js.UndefOr[Boolean] = js.native
  
  var __sentry_xhr_span_id__ : js.UndefOr[String] = js.native
  
  var getRequestHeader: js.UndefOr[js.Function1[/* key */ String, String]] = js.native
  
  var setRequestHeader: js.UndefOr[js.Function2[/* key */ String, /* val */ String, Unit]] = js.native
}
