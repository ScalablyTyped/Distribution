package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.treeUtilMod.Wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitWrapper extends js.Object {
  
  var initWrapper: js.UndefOr[js.Function1[/* wrapper */ Wrapper, Wrapper]] = js.native
  
  var onProcessFinished: js.UndefOr[js.Function1[/* wrapper */ Wrapper, Unit]] = js.native
  
  var processEntity: js.UndefOr[js.Function2[/* entity */ DataEntity, /* wrapper */ Wrapper, Unit]] = js.native
}
object InitWrapper {
  
  @scala.inline
  def apply(): InitWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitWrapper]
  }
  
  @scala.inline
  implicit class InitWrapperOps[Self <: InitWrapper] (val x: Self) extends AnyVal {
    
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
    def setInitWrapper(value: /* wrapper */ Wrapper => Wrapper): Self = this.set("initWrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitWrapper: Self = this.set("initWrapper", js.undefined)
    
    @scala.inline
    def setOnProcessFinished(value: /* wrapper */ Wrapper => Unit): Self = this.set("onProcessFinished", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProcessFinished: Self = this.set("onProcessFinished", js.undefined)
    
    @scala.inline
    def setProcessEntity(value: (/* entity */ DataEntity, /* wrapper */ Wrapper) => Unit): Self = this.set("processEntity", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteProcessEntity: Self = this.set("processEntity", js.undefined)
  }
}
