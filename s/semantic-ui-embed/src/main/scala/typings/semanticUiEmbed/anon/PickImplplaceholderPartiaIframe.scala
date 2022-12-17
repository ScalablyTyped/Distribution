package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl, 'placeholder'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl>> */
trait PickImplplaceholderPartiaIframe
  extends StObject
     with Param {
  
  var iframe: js.UndefOr[js.Function2[/* url */ String, /* parameters */ String, String]] = js.undefined
  
  def placeholder(image: String, icon: String): String
  @JSName("placeholder")
  var placeholder_Original: js.Function2[/* image */ String, /* icon */ String, String]
}
object PickImplplaceholderPartiaIframe {
  
  inline def apply(placeholder: (/* image */ String, /* icon */ String) => String): PickImplplaceholderPartiaIframe = {
    val __obj = js.Dynamic.literal(placeholder = js.Any.fromFunction2(placeholder))
    __obj.asInstanceOf[PickImplplaceholderPartiaIframe]
  }
  
  extension [Self <: PickImplplaceholderPartiaIframe](x: Self) {
    
    inline def setIframe(value: (/* url */ String, /* parameters */ String) => String): Self = StObject.set(x, "iframe", js.Any.fromFunction2(value))
    
    inline def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    inline def setPlaceholder(value: (/* image */ String, /* icon */ String) => String): Self = StObject.set(x, "placeholder", js.Any.fromFunction2(value))
  }
}
