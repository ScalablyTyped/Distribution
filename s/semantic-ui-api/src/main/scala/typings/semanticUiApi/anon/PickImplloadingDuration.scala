package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'loadingDuration'> */
trait PickImplloadingDuration extends StObject {
  
  var loadingDuration: Double
}
object PickImplloadingDuration {
  
  @scala.inline
  def apply(loadingDuration: Double): PickImplloadingDuration = {
    val __obj = js.Dynamic.literal(loadingDuration = loadingDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloadingDuration]
  }
  
  @scala.inline
  implicit class PickImplloadingDurationMutableBuilder[Self <: PickImplloadingDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadingDuration(value: Double): Self = StObject.set(x, "loadingDuration", value.asInstanceOf[js.Any])
  }
}
