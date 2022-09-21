package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl, 'source'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl>> */
trait PickImplsourcePartialPickIcon
  extends StObject
     with Param {
  
  var icon: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var source: String & js.UndefOr[String]
  
  var url: js.UndefOr[String] = js.undefined
}
object PickImplsourcePartialPickIcon {
  
  inline def apply(source: String & js.UndefOr[String]): PickImplsourcePartialPickIcon = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsourcePartialPickIcon]
  }
  
  extension [Self <: PickImplsourcePartialPickIcon](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSource(value: String & js.UndefOr[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
