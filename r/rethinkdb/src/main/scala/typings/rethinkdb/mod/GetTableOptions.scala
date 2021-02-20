package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTableOptions extends StObject {
  
  var useOutdated: Boolean = js.native
}
object GetTableOptions {
  
  @scala.inline
  def apply(useOutdated: Boolean): GetTableOptions = {
    val __obj = js.Dynamic.literal(useOutdated = useOutdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableOptions]
  }
  
  @scala.inline
  implicit class GetTableOptionsMutableBuilder[Self <: GetTableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseOutdated(value: Boolean): Self = StObject.set(x, "useOutdated", value.asInstanceOf[js.Any])
  }
}
