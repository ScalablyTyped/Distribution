package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl, 'active'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl>> */
trait PickImplactivePartialPick
  extends StObject
     with Param {
  
  var active: String & js.UndefOr[String]
  
  var embed: js.UndefOr[String] = js.undefined
}
object PickImplactivePartialPick {
  
  inline def apply(active: String & js.UndefOr[String]): PickImplactivePartialPick = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactivePartialPick]
  }
  
  extension [Self <: PickImplactivePartialPick](x: Self) {
    
    inline def setActive(value: String & js.UndefOr[String]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    inline def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
  }
}
