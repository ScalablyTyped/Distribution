package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.treeUtilMod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitWrapper extends StObject {
  
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
  implicit class InitWrapperMutableBuilder[Self <: InitWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitWrapper(value: /* wrapper */ Wrapper => Wrapper): Self = StObject.set(x, "initWrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitWrapperUndefined: Self = StObject.set(x, "initWrapper", js.undefined)
    
    @scala.inline
    def setOnProcessFinished(value: /* wrapper */ Wrapper => Unit): Self = StObject.set(x, "onProcessFinished", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProcessFinishedUndefined: Self = StObject.set(x, "onProcessFinished", js.undefined)
    
    @scala.inline
    def setProcessEntity(value: (/* entity */ DataEntity, /* wrapper */ Wrapper) => Unit): Self = StObject.set(x, "processEntity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProcessEntityUndefined: Self = StObject.set(x, "processEntity", js.undefined)
  }
}
