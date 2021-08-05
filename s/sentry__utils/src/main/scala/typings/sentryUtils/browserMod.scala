package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@sentry/utils/dist/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def htmlTreeAsString(elem: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlTreeAsString")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
}
