package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, 'play'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl>> */
trait PickImplplayPartialPickIm
  extends StObject
     with Param {
  
  var embed: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var play: String
}
object PickImplplayPartialPickIm {
  
  inline def apply(play: String): PickImplplayPartialPickIm = {
    val __obj = js.Dynamic.literal(play = play.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplayPartialPickIm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplplayPartialPickIm] (val x: Self) extends AnyVal {
    
    inline def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    inline def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
  }
}
