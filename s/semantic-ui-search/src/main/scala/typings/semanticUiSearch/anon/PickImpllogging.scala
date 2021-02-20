package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, 'logging'> */
@js.native
trait PickImpllogging extends StObject {
  
  var logging: String = js.native
}
object PickImpllogging {
  
  @scala.inline
  def apply(logging: String): PickImpllogging = {
    val __obj = js.Dynamic.literal(logging = logging.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllogging]
  }
  
  @scala.inline
  implicit class PickImplloggingMutableBuilder[Self <: PickImpllogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogging(value: String): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
  }
}
