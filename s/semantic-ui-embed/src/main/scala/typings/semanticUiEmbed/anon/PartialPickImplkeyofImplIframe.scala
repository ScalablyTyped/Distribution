package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl>> */
trait PartialPickImplkeyofImplIframe extends StObject {
  
  var iframe: js.UndefOr[js.Function2[/* url */ String, /* parameters */ String, String]] = js.undefined
  
  var placeholder: js.UndefOr[js.Function2[/* image */ String, /* icon */ String, String]] = js.undefined
}
object PartialPickImplkeyofImplIframe {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplIframe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplIframe]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplIframeMutableBuilder[Self <: PartialPickImplkeyofImplIframe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIframe(value: (/* url */ String, /* parameters */ String) => String): Self = StObject.set(x, "iframe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: (/* image */ String, /* icon */ String) => String): Self = StObject.set(x, "placeholder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
