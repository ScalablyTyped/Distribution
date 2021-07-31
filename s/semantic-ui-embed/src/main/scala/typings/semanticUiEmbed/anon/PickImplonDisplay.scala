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
  
  @scala.inline
  def apply(onDisplay: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonDisplay = {
    val __obj = js.Dynamic.literal(onDisplay = onDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonDisplay]
  }
  
  @scala.inline
  implicit class PickImplonDisplayMutableBuilder[Self <: PickImplonDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDisplay(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onDisplay", value.asInstanceOf[js.Any])
  }
}
