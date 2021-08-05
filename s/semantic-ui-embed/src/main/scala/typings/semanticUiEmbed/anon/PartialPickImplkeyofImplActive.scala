package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplActive extends StObject {
  
  var active: js.UndefOr[String] = js.undefined
  
  var embed: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplActive {
  
  inline def apply(): PartialPickImplkeyofImplActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplActive]
  }
  
  extension [Self <: PartialPickImplkeyofImplActive](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    inline def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
  }
}
