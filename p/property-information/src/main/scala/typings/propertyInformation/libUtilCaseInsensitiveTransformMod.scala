package typings.propertyInformation

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCaseInsensitiveTransformMod {
  
  @JSImport("property-information/lib/util/case-insensitive-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def caseInsensitiveTransform(attributes: Record[String, String], property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("caseInsensitiveTransform")(attributes.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
}
