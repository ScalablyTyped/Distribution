package typings.reactAsync.mod

import typings.reactAsync.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalScope_ extends StObject {
  
  var AbortController: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AbortController */ js.Any
  ] = js.native
  
  var __REACT_ASYNC__ : js.Any = js.native
  
  var fetch: FnCall = js.native
}
object GlobalScope_ {
  
  @scala.inline
  def apply(__REACT_ASYNC__ : js.Any, fetch: FnCall): GlobalScope_ = {
    val __obj = js.Dynamic.literal(__REACT_ASYNC__ = __REACT_ASYNC__.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalScope_]
  }
  
  @scala.inline
  implicit class GlobalScope_MutableBuilder[Self <: GlobalScope_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortController(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AbortController */ js.Any
    ): Self = StObject.set(x, "AbortController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortControllerUndefined: Self = StObject.set(x, "AbortController", js.undefined)
    
    @scala.inline
    def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__REACT_ASYNC__(value: js.Any): Self = StObject.set(x, "__REACT_ASYNC__", value.asInstanceOf[js.Any])
  }
}
