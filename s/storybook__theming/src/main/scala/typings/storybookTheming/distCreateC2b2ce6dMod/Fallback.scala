package typings.storybookTheming.distCreateC2b2ce6dMod

import typings.storybookTheming.anon.Base
import typings.storybookTheming.anon.Bold
import typings.storybookTheming.anon.Code
import typings.storybookTheming.anon.NonNullablebasestringmono
import typings.storybookTheming.anon.NonNullableregularnumberb
import typings.storybookTheming.anon.NonNullables1numbers2numb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof T ]: T[P] | std.Array<std.NonNullable<T[P]>>} */
trait Fallback[T] extends StObject {
  
  var fonts: Base | js.Array[NonNullablebasestringmono]
  
  var size: Code | js.Array[NonNullables1numbers2numb]
  
  var weight: Bold | js.Array[NonNullableregularnumberb]
}
object Fallback {
  
  inline def apply[T](
    fonts: Base | js.Array[NonNullablebasestringmono],
    size: Code | js.Array[NonNullables1numbers2numb],
    weight: Bold | js.Array[NonNullableregularnumberb]
  ): Fallback[T] = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fallback[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fallback[?], T] (val x: Self & Fallback[T]) extends AnyVal {
    
    inline def setFonts(value: Base | js.Array[NonNullablebasestringmono]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsVarargs(value: NonNullablebasestringmono*): Self = StObject.set(x, "fonts", js.Array(value*))
    
    inline def setSize(value: Code | js.Array[NonNullables1numbers2numb]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeVarargs(value: NonNullables1numbers2numb*): Self = StObject.set(x, "size", js.Array(value*))
    
    inline def setWeight(value: Bold | js.Array[NonNullableregularnumberb]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightVarargs(value: NonNullableregularnumberb*): Self = StObject.set(x, "weight", js.Array(value*))
  }
}
