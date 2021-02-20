package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryLocation extends StObject {
  
  var pathname: String = js.native
  
  var search: js.UndefOr[String] = js.native
}
object HistoryLocation {
  
  @scala.inline
  def apply(pathname: String): HistoryLocation = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryLocation]
  }
  
  @scala.inline
  implicit class HistoryLocationMutableBuilder[Self <: HistoryLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
