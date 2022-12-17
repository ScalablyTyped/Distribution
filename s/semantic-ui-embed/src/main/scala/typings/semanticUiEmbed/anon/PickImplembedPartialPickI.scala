package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, 'embed'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl>> */
trait PickImplembedPartialPickI
  extends StObject
     with Param {
  
  var embed: String
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var play: js.UndefOr[String] = js.undefined
}
object PickImplembedPartialPickI {
  
  inline def apply(embed: String): PickImplembedPartialPickI = {
    val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplembedPartialPickI]
  }
  
  extension [Self <: PickImplembedPartialPickI](x: Self) {
    
    inline def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
  }
}
