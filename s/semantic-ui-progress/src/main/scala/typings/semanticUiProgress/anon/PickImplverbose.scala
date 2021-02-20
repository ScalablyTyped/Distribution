package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'verbose'> */
@js.native
trait PickImplverbose extends StObject {
  
  var verbose: Boolean = js.native
}
object PickImplverbose {
  
  @scala.inline
  def apply(verbose: Boolean): PickImplverbose = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplverbose]
  }
  
  @scala.inline
  implicit class PickImplverboseMutableBuilder[Self <: PickImplverbose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
