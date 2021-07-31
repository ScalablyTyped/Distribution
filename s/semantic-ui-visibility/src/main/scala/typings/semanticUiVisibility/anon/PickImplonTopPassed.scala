package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onTopPassed'> */
trait PickImplonTopPassed extends StObject {
  
  def onTopPassed(): Unit
  @JSName("onTopPassed")
  var onTopPassed_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonTopPassed {
  
  @scala.inline
  def apply(onTopPassed: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonTopPassed = {
    val __obj = js.Dynamic.literal(onTopPassed = onTopPassed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonTopPassed]
  }
  
  @scala.inline
  implicit class PickImplonTopPassedMutableBuilder[Self <: PickImplonTopPassed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnTopPassed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopPassed", value.asInstanceOf[js.Any])
  }
}
