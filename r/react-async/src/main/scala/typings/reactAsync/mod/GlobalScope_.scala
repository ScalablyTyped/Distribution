package typings.reactAsync.mod

import typings.reactAsync.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalScope_ extends StObject {
  
  var AbortController: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AbortController */ Any
  ] = js.undefined
  
  var __REACT_ASYNC__ : Any
  
  var fetch: FnCall
}
object GlobalScope_ {
  
  inline def apply(__REACT_ASYNC__ : Any, fetch: FnCall): GlobalScope_ = {
    val __obj = js.Dynamic.literal(__REACT_ASYNC__ = __REACT_ASYNC__.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalScope_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalScope_] (val x: Self) extends AnyVal {
    
    inline def setAbortController(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AbortController */ Any
    ): Self = StObject.set(x, "AbortController", value.asInstanceOf[js.Any])
    
    inline def setAbortControllerUndefined: Self = StObject.set(x, "AbortController", js.undefined)
    
    inline def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    inline def set__REACT_ASYNC__(value: Any): Self = StObject.set(x, "__REACT_ASYNC__", value.asInstanceOf[js.Any])
  }
}
