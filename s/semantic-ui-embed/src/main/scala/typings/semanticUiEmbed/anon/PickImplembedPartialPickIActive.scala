package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl, 'embed'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl>> */
trait PickImplembedPartialPickIActive
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var embed: String
}
object PickImplembedPartialPickIActive {
  
  inline def apply(embed: String): PickImplembedPartialPickIActive = {
    val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplembedPartialPickIActive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplembedPartialPickIActive] (val x: Self) extends AnyVal {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
  }
}
