package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.NonNullable<{  regular :number,   bold :number}> */
trait NonNullableregularnumberb extends StObject {
  
  var bold: Double
  
  var regular: Double
}
object NonNullableregularnumberb {
  
  inline def apply(bold: Double, regular: Double): NonNullableregularnumberb = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonNullableregularnumberb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonNullableregularnumberb] (val x: Self) extends AnyVal {
    
    inline def setBold(value: Double): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setRegular(value: Double): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
  }
}
