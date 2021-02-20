package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryLocation extends StObject {
  
  var hash: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var pathname: js.UndefOr[String] = js.native
  
  var search: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[ObjectLiteral[_]] = js.native
}
object HistoryLocation {
  
  @scala.inline
  def apply(): HistoryLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryLocation]
  }
  
  @scala.inline
  implicit class HistoryLocationMutableBuilder[Self <: HistoryLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setState(value: ObjectLiteral[_]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
