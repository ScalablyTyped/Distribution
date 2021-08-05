package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Holds useful CSS-related methods. No object with this interface are implemented: it contains only static methods and therefore is a utilitarian interface. */
object CSS {
  
  @JSGlobal("CSS")
  @js.native
  val ^ : js.Any = js.native
  
  inline def escape(ident: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(ident.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  inline def supports(conditionText: java.lang.String): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supports")(conditionText.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  inline def supports(property: java.lang.String, value: java.lang.String): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("supports")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
