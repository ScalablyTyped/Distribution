package typings.sentryUtils

import typings.sentryUtils.typesWorldwideMod.InternalGlobal
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserMod {
  
  @JSImport("@sentry/utils/types/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/utils/types/browser", "WINDOW")
  @js.native
  val WINDOW: InternalGlobal & Window = js.native
  
  inline def getDomElement[E](selector: String): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomElement")(selector.asInstanceOf[js.Any]).asInstanceOf[E | Null]
  
  inline def getLocationHref(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationHref")().asInstanceOf[String]
  
  inline def htmlTreeAsString(elem: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlTreeAsString")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def htmlTreeAsString(elem: Any, keyAttrs: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlTreeAsString")(elem.asInstanceOf[js.Any], keyAttrs.asInstanceOf[js.Any])).asInstanceOf[String]
}
