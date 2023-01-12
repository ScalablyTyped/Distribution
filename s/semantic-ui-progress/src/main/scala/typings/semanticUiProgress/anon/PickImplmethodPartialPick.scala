package typings.semanticUiProgress.anon

import typings.semanticUiProgress.SemanticUI.Progress.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl, keyof semantic-ui-progress.SemanticUI.Progress.ErrorSettings._Impl>> */
trait PickImplmethodPartialPick
  extends StObject
     with Param {
  
  var method: String
  
  var nonNumeric: js.UndefOr[String] = js.undefined
}
object PickImplmethodPartialPick {
  
  inline def apply(method: String): PickImplmethodPartialPick = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmethodPartialPick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplmethodPartialPick] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNonNumeric(value: String): Self = StObject.set(x, "nonNumeric", value.asInstanceOf[js.Any])
    
    inline def setNonNumericUndefined: Self = StObject.set(x, "nonNumeric", js.undefined)
  }
}
