package typings.propertyInformation

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object caseSensitiveTransformMod {
  
  @JSImport("property-information/lib/util/case-sensitive-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def caseSensitiveTransform(attributes: Record[String, String], attribute: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("caseSensitiveTransform")(attributes.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[String]
}
