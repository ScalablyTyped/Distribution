package typings.reactAsync.mod

import org.scalablytyped.runtime.Instantiable0
import typings.reactAsync.anon.FnCall
import typings.reactAsync.anon.Instantiable
import typings.std.global.AbortController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalScope_ extends js.Object {
  
  var AbortController: js.UndefOr[Instantiable with Instantiable0[typings.std.global.AbortController]] = js.native
  
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
  implicit class GlobalScope_Ops[Self <: GlobalScope_] (val x: Self) extends AnyVal {
    
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
    def set__REACT_ASYNC__(value: js.Any): Self = this.set("__REACT_ASYNC__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetch(value: FnCall): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortController(value: Instantiable with Instantiable0[AbortController]): Self = this.set("AbortController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortController: Self = this.set("AbortController", js.undefined)
  }
}
