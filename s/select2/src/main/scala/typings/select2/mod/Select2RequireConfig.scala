package typings.select2.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select2RequireConfig extends js.Object {
  
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var config: js.UndefOr[StringDictionary[js.Object]] = js.native
  
  var deps: js.UndefOr[js.Array[String]] = js.native
  
  var map: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.native
}
object Select2RequireConfig {
  
  @scala.inline
  def apply(): Select2RequireConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Select2RequireConfig]
  }
  
  @scala.inline
  implicit class Select2RequireConfigOps[Self <: Select2RequireConfig] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: /* repeated */ js.Any => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setConfig(value: StringDictionary[js.Object]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: String*): Self = this.set("deps", js.Array(value :_*))
    
    @scala.inline
    def setDeps(value: js.Array[String]): Self = this.set("deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeps: Self = this.set("deps", js.undefined)
    
    @scala.inline
    def setMap(value: StringDictionary[StringDictionary[String]]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
}
