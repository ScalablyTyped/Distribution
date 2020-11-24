package typings.reflux.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreDefinition
  extends /* propertyName */ StringDictionary[js.Any] {
  
  var getInitialState: js.UndefOr[js.Function] = js.native
  
  var init: js.UndefOr[js.Function] = js.native
  
  var listenables: js.UndefOr[js.Array[_]] = js.native
}
object StoreDefinition {
  
  @scala.inline
  def apply(): StoreDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreDefinition]
  }
  
  @scala.inline
  implicit class StoreDefinitionOps[Self <: StoreDefinition] (val x: Self) extends AnyVal {
    
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
    def setGetInitialState(value: js.Function): Self = this.set("getInitialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetInitialState: Self = this.set("getInitialState", js.undefined)
    
    @scala.inline
    def setInit(value: js.Function): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setListenablesVarargs(value: js.Any*): Self = this.set("listenables", js.Array(value :_*))
    
    @scala.inline
    def setListenables(value: js.Array[_]): Self = this.set("listenables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenables: Self = this.set("listenables", js.undefined)
  }
}
