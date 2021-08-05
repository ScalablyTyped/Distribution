package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'onDisplay'> */
trait PickImplonDisplay extends StObject {
  
  def onDisplay(): Unit
  @JSName("onDisplay")
  var onDisplay_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonDisplay {
  
  inline def apply(onDisplay: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonDisplay = {
    val __obj = js.Dynamic.literal(onDisplay = onDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonDisplay]
  }
  
  extension [Self <: PickImplonDisplay](x: Self) {
    
    inline def setOnDisplay(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onDisplay", value.asInstanceOf[js.Any])
  }
}
