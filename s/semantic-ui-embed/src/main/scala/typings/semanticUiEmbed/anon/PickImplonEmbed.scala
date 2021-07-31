package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.JQuery
import typings.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'onEmbed'> */
trait PickImplonEmbed extends StObject {
  
  def onEmbed(parameters: ParametersSettings): ParametersSettings
  @JSName("onEmbed")
  var onEmbed_Original: js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
}
object PickImplonEmbed {
  
  @scala.inline
  def apply(
    onEmbed: js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
  ): PickImplonEmbed = {
    val __obj = js.Dynamic.literal(onEmbed = onEmbed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonEmbed]
  }
  
  @scala.inline
  implicit class PickImplonEmbedMutableBuilder[Self <: PickImplonEmbed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnEmbed(
      value: js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
    ): Self = StObject.set(x, "onEmbed", value.asInstanceOf[js.Any])
  }
}
