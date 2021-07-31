package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'duration'> */
trait PickImplduration extends StObject {
  
  var duration: Double
}
object PickImplduration {
  
  @scala.inline
  def apply(duration: Double): PickImplduration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplduration]
  }
  
  @scala.inline
  implicit class PickImpldurationMutableBuilder[Self <: PickImplduration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}
