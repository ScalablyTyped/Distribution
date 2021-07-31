package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, 'progress'> */
trait PickImplprogress extends StObject {
  
  var progress: String
}
object PickImplprogress {
  
  @scala.inline
  def apply(progress: String): PickImplprogress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplprogress]
  }
  
  @scala.inline
  implicit class PickImplprogressMutableBuilder[Self <: PickImplprogress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
