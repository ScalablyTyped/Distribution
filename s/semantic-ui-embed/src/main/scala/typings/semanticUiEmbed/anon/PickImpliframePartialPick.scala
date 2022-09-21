package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl, 'iframe'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl>> */
trait PickImpliframePartialPick
  extends StObject
     with Param {
  
  def iframe(url: String, parameters: String): String
  @JSName("iframe")
  var iframe_Original: (js.Function2[/* url */ String, /* parameters */ String, String]) & (js.UndefOr[js.Function2[/* url */ String, /* parameters */ String, String]])
  
  var placeholder: js.UndefOr[js.Function2[/* image */ String, /* icon */ String, String]] = js.undefined
}
object PickImpliframePartialPick {
  
  inline def apply(
    iframe: (js.Function2[/* url */ String, /* parameters */ String, String]) & (js.UndefOr[js.Function2[/* url */ String, /* parameters */ String, String]])
  ): PickImpliframePartialPick = {
    val __obj = js.Dynamic.literal(iframe = iframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpliframePartialPick]
  }
  
  extension [Self <: PickImpliframePartialPick](x: Self) {
    
    inline def setIframe(
      value: (js.Function2[/* url */ String, /* parameters */ String, String]) & (js.UndefOr[js.Function2[/* url */ String, /* parameters */ String, String]])
    ): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: (/* image */ String, /* icon */ String) => String): Self = StObject.set(x, "placeholder", js.Any.fromFunction2(value))
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
