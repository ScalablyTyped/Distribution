package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ast extends StObject {
  
  var ast: Null
}
object Ast {
  
  inline def apply(ast: Null): Ast = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ast]
  }
  
  extension [Self <: Ast](x: Self) {
    
    inline def setAst(value: Null): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
  }
}
