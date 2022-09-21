package typings.rcDrawer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-drawer/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseWidthHeight(): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWidthHeight")().asInstanceOf[String | Double]
  inline def parseWidthHeight(value: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWidthHeight")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def parseWidthHeight(value: Double): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWidthHeight")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
}
