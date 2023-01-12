package typings.regexpTree.astMod

import typings.regexpTree.regexpTreeStrings.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AstRegExp
  extends StObject
     with Base[RegExp] {
  
  var body: Expression | Null
  
  var flags: String
}
object AstRegExp {
  
  inline def apply(flags: String): AstRegExp = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], body = null)
    __obj.updateDynamic("type")("RegExp")
    __obj.asInstanceOf[AstRegExp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AstRegExp] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Expression): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
  }
}
