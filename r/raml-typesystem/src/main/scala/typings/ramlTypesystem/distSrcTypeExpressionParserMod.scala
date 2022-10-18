package typings.ramlTypesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypeExpressionParserMod {
  
  @JSImport("raml-typesystem/dist/src/typeExpressionParser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SyntaxError(message: Any, expected: Any, found: Any, location: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("SyntaxError")(message.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], found.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parse(input: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
}
