package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryLocation extends StObject {
  
  var hash: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var pathname: js.UndefOr[String] = js.undefined
  
  var search: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[ObjectLiteral[js.Any]] = js.undefined
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
    def setState(value: ObjectLiteral[js.Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
