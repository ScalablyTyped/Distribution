package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslatableProvided extends StObject {
  
  def translate(key: String, params: Any*): String
}
object TranslatableProvided {
  
  inline def apply(translate: (String, /* repeated */ Any) => String): TranslatableProvided = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction2(translate))
    __obj.asInstanceOf[TranslatableProvided]
  }
  
  extension [Self <: TranslatableProvided](x: Self) {
    
    inline def setTranslate(value: (String, /* repeated */ Any) => String): Self = StObject.set(x, "translate", js.Any.fromFunction2(value))
  }
}
