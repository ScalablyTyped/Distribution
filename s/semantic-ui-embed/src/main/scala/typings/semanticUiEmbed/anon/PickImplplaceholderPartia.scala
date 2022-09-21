package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, 'placeholder'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl>> */
trait PickImplplaceholderPartia
  extends StObject
     with Param {
  
  var embed: js.UndefOr[String] = js.undefined
  
  var placeholder: String & js.UndefOr[String]
  
  var play: js.UndefOr[String] = js.undefined
}
object PickImplplaceholderPartia {
  
  inline def apply(placeholder: String & js.UndefOr[String]): PickImplplaceholderPartia = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplaceholderPartia]
  }
  
  extension [Self <: PickImplplaceholderPartia](x: Self) {
    
    inline def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    inline def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
    
    inline def setPlaceholder(value: String & js.UndefOr[String]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
  }
}
