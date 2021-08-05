package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplEmbed extends StObject {
  
  var embed: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var play: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplEmbed {
  
  inline def apply(): PartialPickImplkeyofImplEmbed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplEmbed]
  }
  
  extension [Self <: PartialPickImplkeyofImplEmbed](x: Self) {
    
    inline def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    inline def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
  }
}
