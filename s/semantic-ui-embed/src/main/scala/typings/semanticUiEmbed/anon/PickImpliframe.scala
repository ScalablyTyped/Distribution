package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.TemplatesSettings._Impl, 'iframe'> */
trait PickImpliframe extends StObject {
  
  def iframe(url: String, parameters: String): String
  @JSName("iframe")
  var iframe_Original: js.Function2[/* url */ String, /* parameters */ String, String]
}
object PickImpliframe {
  
  inline def apply(iframe: (/* url */ String, /* parameters */ String) => String): PickImpliframe = {
    val __obj = js.Dynamic.literal(iframe = js.Any.fromFunction2(iframe))
    __obj.asInstanceOf[PickImpliframe]
  }
  
  extension [Self <: PickImpliframe](x: Self) {
    
    inline def setIframe(value: (/* url */ String, /* parameters */ String) => String): Self = StObject.set(x, "iframe", js.Any.fromFunction2(value))
  }
}
