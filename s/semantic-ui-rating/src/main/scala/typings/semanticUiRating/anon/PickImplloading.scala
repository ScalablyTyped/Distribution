package typings.semanticUiRating.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl, 'loading'> */
@js.native
trait PickImplloading extends StObject {
  
  var loading: String = js.native
}
object PickImplloading {
  
  @scala.inline
  def apply(loading: String): PickImplloading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloading]
  }
  
  @scala.inline
  implicit class PickImplloadingMutableBuilder[Self <: PickImplloading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
  }
}
