package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, 'logging'> */
@js.native
trait PickImpllogging extends js.Object {
  
  var logging: String = js.native
}
object PickImpllogging {
  
  @scala.inline
  def apply(logging: String): PickImpllogging = {
    val __obj = js.Dynamic.literal(logging = logging.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllogging]
  }
  
  @scala.inline
  implicit class PickImplloggingOps[Self <: PickImpllogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLogging(value: String): Self = this.set("logging", value.asInstanceOf[js.Any])
  }
}
