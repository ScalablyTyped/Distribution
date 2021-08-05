package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.semanticUiEmbedStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'autoplay'> */
trait PickImplautoplay extends StObject {
  
  var autoplay: auto | Boolean
}
object PickImplautoplay {
  
  inline def apply(autoplay: auto | Boolean): PickImplautoplay = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplautoplay]
  }
  
  extension [Self <: PickImplautoplay](x: Self) {
    
    inline def setAutoplay(value: auto | Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
  }
}
