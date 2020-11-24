package typings.reflux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionParameters extends js.Object {
  
  var asyncResult: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[js.Array[String]] = js.native
  
  var preEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, js.UndefOr[js.Array[_]]]] = js.native
  
  var shouldEmit: js.UndefOr[js.Function1[/* repeated */ js.Any, Boolean]] = js.native
  
  var sync: js.UndefOr[Boolean] = js.native
}
object ActionParameters {
  
  @scala.inline
  def apply(): ActionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionParameters]
  }
  
  @scala.inline
  implicit class ActionParametersOps[Self <: ActionParameters] (val x: Self) extends AnyVal {
    
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
    def setAsyncResult(value: Boolean): Self = this.set("asyncResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncResult: Self = this.set("asyncResult", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: String*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[String]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setPreEmit(value: /* repeated */ js.Any => js.UndefOr[js.Array[_]]): Self = this.set("preEmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreEmit: Self = this.set("preEmit", js.undefined)
    
    @scala.inline
    def setShouldEmit(value: /* repeated */ js.Any => Boolean): Self = this.set("shouldEmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldEmit: Self = this.set("shouldEmit", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
}
