package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'showActivity'> */
trait PickImplshowActivity extends StObject {
  
  var showActivity: Boolean
}
object PickImplshowActivity {
  
  @scala.inline
  def apply(showActivity: Boolean): PickImplshowActivity = {
    val __obj = js.Dynamic.literal(showActivity = showActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshowActivity]
  }
  
  @scala.inline
  implicit class PickImplshowActivityMutableBuilder[Self <: PickImplshowActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowActivity(value: Boolean): Self = StObject.set(x, "showActivity", value.asInstanceOf[js.Any])
  }
}
