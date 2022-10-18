package typings.stringifyEntities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilToDecimalMod {
  
  @JSImport("stringify-entities/lib/util/to-decimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toDecimal(code: Double, next: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(code.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toDecimal(code: Double, next: Double, omit: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(code.asInstanceOf[js.Any], next.asInstanceOf[js.Any], omit.asInstanceOf[js.Any])).asInstanceOf[String]
}
