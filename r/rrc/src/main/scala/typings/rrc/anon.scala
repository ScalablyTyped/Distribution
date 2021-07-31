package typings.rrc

import typings.history.mod.Hash
import typings.history.mod.LocationKey
import typings.history.mod.LocationState
import typings.history.mod.Pathname
import typings.history.mod.Search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined history.history.LocationDescriptorObject<history.history.LocationState> & {  pathname :history.history.Pathname} */
  trait LocationDescriptorObjectL extends StObject {
    
    var hash: js.UndefOr[Hash] = js.undefined
    
    var key: js.UndefOr[LocationKey] = js.undefined
    
    var pathname: js.UndefOr[Pathname] & Pathname
    
    var search: js.UndefOr[Search] = js.undefined
    
    var state: js.UndefOr[LocationState] = js.undefined
  }
  object LocationDescriptorObjectL {
    
    @scala.inline
    def apply(pathname: js.UndefOr[Pathname] & Pathname): LocationDescriptorObjectL = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationDescriptorObjectL]
    }
    
    @scala.inline
    implicit class LocationDescriptorObjectLMutableBuilder[Self <: LocationDescriptorObjectL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setKey(value: LocationKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPathname(value: js.UndefOr[Pathname] & Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setState(value: LocationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
