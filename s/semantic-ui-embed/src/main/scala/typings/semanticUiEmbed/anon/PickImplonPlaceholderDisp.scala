package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'onPlaceholderDisplay'> */
trait PickImplonPlaceholderDisp extends StObject {
  
  def onPlaceholderDisplay(): Unit
  @JSName("onPlaceholderDisplay")
  var onPlaceholderDisplay_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonPlaceholderDisp {
  
  inline def apply(onPlaceholderDisplay: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonPlaceholderDisp = {
    val __obj = js.Dynamic.literal(onPlaceholderDisplay = onPlaceholderDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonPlaceholderDisp]
  }
  
  extension [Self <: PickImplonPlaceholderDisp](x: Self) {
    
    inline def setOnPlaceholderDisplay(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onPlaceholderDisplay", value.asInstanceOf[js.Any])
  }
}
