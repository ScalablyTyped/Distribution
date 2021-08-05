package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.treeUtilMod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitWrapper extends StObject {
  
  var initWrapper: js.UndefOr[js.Function1[/* wrapper */ Wrapper, Wrapper]] = js.undefined
  
  var onProcessFinished: js.UndefOr[js.Function1[/* wrapper */ Wrapper, Unit]] = js.undefined
  
  var processEntity: js.UndefOr[js.Function2[/* entity */ DataEntity, /* wrapper */ Wrapper, Unit]] = js.undefined
}
object InitWrapper {
  
  inline def apply(): InitWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitWrapper]
  }
  
  extension [Self <: InitWrapper](x: Self) {
    
    inline def setInitWrapper(value: /* wrapper */ Wrapper => Wrapper): Self = StObject.set(x, "initWrapper", js.Any.fromFunction1(value))
    
    inline def setInitWrapperUndefined: Self = StObject.set(x, "initWrapper", js.undefined)
    
    inline def setOnProcessFinished(value: /* wrapper */ Wrapper => Unit): Self = StObject.set(x, "onProcessFinished", js.Any.fromFunction1(value))
    
    inline def setOnProcessFinishedUndefined: Self = StObject.set(x, "onProcessFinished", js.undefined)
    
    inline def setProcessEntity(value: (/* entity */ DataEntity, /* wrapper */ Wrapper) => Unit): Self = StObject.set(x, "processEntity", js.Any.fromFunction2(value))
    
    inline def setProcessEntityUndefined: Self = StObject.set(x, "processEntity", js.undefined)
  }
}
