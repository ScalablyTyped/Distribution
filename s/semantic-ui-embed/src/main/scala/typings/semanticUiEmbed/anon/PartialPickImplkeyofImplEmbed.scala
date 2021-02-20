package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplEmbed extends StObject {
  
  var embed: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var play: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplEmbed {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplEmbed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplEmbed]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplEmbedMutableBuilder[Self <: PartialPickImplkeyofImplEmbed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
  }
}
