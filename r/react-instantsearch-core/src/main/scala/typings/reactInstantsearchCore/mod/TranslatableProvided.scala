package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslatableProvided extends StObject {
  
  def translate(key: String, params: js.Any*): String = js.native
}
object TranslatableProvided {
  
  @scala.inline
  def apply(translate: (String, /* repeated */ js.Any) => String): TranslatableProvided = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction2(translate))
    __obj.asInstanceOf[TranslatableProvided]
  }
  
  @scala.inline
  implicit class TranslatableProvidedMutableBuilder[Self <: TranslatableProvided] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslate(value: (String, /* repeated */ js.Any) => String): Self = StObject.set(x, "translate", js.Any.fromFunction2(value))
  }
}
