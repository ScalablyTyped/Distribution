package typings.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod

import typings.react.mod.ReactNode
import typings.storybookRouter.distTs3Dot9ModulesReactRouterNodeModulesHistoryIndexMod.InitialEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryRouterProps extends StObject {
  
  var basename: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var initialEntries: js.UndefOr[js.Array[InitialEntry]] = js.undefined
  
  var initialIndex: js.UndefOr[Double] = js.undefined
}
object MemoryRouterProps {
  
  inline def apply(): MemoryRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryRouterProps]
  }
  
  extension [Self <: MemoryRouterProps](x: Self) {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setInitialEntries(value: js.Array[InitialEntry]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
    
    inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
    
    inline def setInitialEntriesVarargs(value: InitialEntry*): Self = StObject.set(x, "initialEntries", js.Array(value*))
    
    inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
    
    inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
  }
}
