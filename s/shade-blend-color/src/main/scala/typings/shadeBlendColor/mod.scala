package typings.shadeBlendColor

import typings.shadeBlendColor.shadeBlendColorStrings.c
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shade-blend-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(percentage: Double, from: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(percentage.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def default(percentage: Double, from: String, to: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(percentage.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def default_c(percentage: Double, from: String, to: c): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(percentage.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
