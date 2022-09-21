package typings.slateReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined slate.slate.BaseText & {  placeholder :string | undefined} */
trait BaseTextplaceholderstring extends StObject {
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var text: String
}
object BaseTextplaceholderstring {
  
  inline def apply(text: String): BaseTextplaceholderstring = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTextplaceholderstring]
  }
  
  extension [Self <: BaseTextplaceholderstring](x: Self) {
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
