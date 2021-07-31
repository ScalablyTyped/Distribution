package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyfillMod {
  
  @JSImport("@sentry/utils/dist/polyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def setPrototypeOf(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def setPrototypeOf(o: js.Any, proto: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(o.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
