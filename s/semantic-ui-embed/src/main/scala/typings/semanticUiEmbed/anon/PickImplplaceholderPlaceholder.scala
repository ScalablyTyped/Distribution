package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl, 'placeholder'> */
trait PickImplplaceholderPlaceholder extends StObject {
  
  def placeholder(image: String, icon: String): String
  @JSName("placeholder")
  var placeholder_Original: js.Function2[/* image */ String, /* icon */ String, String]
}
object PickImplplaceholderPlaceholder {
  
  inline def apply(placeholder: (/* image */ String, /* icon */ String) => String): PickImplplaceholderPlaceholder = {
    val __obj = js.Dynamic.literal(placeholder = js.Any.fromFunction2(placeholder))
    __obj.asInstanceOf[PickImplplaceholderPlaceholder]
  }
  
  extension [Self <: PickImplplaceholderPlaceholder](x: Self) {
    
    inline def setPlaceholder(value: (/* image */ String, /* icon */ String) => String): Self = StObject.set(x, "placeholder", js.Any.fromFunction2(value))
  }
}
