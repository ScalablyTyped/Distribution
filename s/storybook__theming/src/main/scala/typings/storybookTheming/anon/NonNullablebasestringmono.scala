package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.NonNullable<{  base :string,   mono :string}> */
trait NonNullablebasestringmono extends StObject {
  
  var base: String
  
  var mono: String
}
object NonNullablebasestringmono {
  
  inline def apply(base: String, mono: String): NonNullablebasestringmono = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], mono = mono.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonNullablebasestringmono]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonNullablebasestringmono] (val x: Self) extends AnyVal {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setMono(value: String): Self = StObject.set(x, "mono", value.asInstanceOf[js.Any])
  }
}
