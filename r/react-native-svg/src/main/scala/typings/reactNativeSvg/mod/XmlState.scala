package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XmlState extends StObject {
  
  var ast: JsxAST | Null
}
object XmlState {
  
  inline def apply(): XmlState = {
    val __obj = js.Dynamic.literal(ast = null)
    __obj.asInstanceOf[XmlState]
  }
  
  extension [Self <: XmlState](x: Self) {
    
    inline def setAst(value: JsxAST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstNull: Self = StObject.set(x, "ast", null)
  }
}
