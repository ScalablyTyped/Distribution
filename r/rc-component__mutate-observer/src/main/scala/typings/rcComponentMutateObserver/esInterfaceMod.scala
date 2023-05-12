package typings.rcComponentMutateObserver

import typings.react.mod.ReactNode
import typings.std.MutationObserver
import typings.std.MutationObserverInit
import typings.std.MutationRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  trait MutationObserverProps extends StObject {
    
    var children: ReactNode
    
    var onMutate: js.UndefOr[
        js.Function2[/* mutations */ js.Array[MutationRecord], /* observer */ MutationObserver, Unit]
      ] = js.undefined
    
    var options: js.UndefOr[MutationObserverInit] = js.undefined
  }
  object MutationObserverProps {
    
    inline def apply(): MutationObserverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MutationObserverProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MutationObserverProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnMutate(value: (/* mutations */ js.Array[MutationRecord], /* observer */ MutationObserver) => Unit): Self = StObject.set(x, "onMutate", js.Any.fromFunction2(value))
      
      inline def setOnMutateUndefined: Self = StObject.set(x, "onMutate", js.undefined)
      
      inline def setOptions(value: MutationObserverInit): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
