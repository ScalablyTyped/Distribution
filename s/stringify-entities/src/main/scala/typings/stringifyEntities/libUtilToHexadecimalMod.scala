package typings.stringifyEntities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilToHexadecimalMod {
  
  @JSImport("stringify-entities/lib/util/to-hexadecimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toHexadecimal(code: Double, next: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHexadecimal")(code.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toHexadecimal(code: Double, next: Double, omit: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHexadecimal")(code.asInstanceOf[js.Any], next.asInstanceOf[js.Any], omit.asInstanceOf[js.Any])).asInstanceOf[String]
}
