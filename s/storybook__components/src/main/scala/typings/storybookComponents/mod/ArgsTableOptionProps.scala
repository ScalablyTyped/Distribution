package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsTableOptionProps extends StObject {
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var inAddonPanel: js.UndefOr[Boolean] = js.undefined
  
  var initialExpandedArgs: js.UndefOr[Boolean] = js.undefined
  
  var isLoading: js.UndefOr[Boolean] = js.undefined
  
  var resetArgs: js.UndefOr[js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]] = js.undefined
  
  var sort: js.UndefOr[SortType] = js.undefined
  
  var updateArgs: js.UndefOr[js.Function1[/* args */ Args, Unit]] = js.undefined
}
object ArgsTableOptionProps {
  
  inline def apply(): ArgsTableOptionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgsTableOptionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgsTableOptionProps] (val x: Self) extends AnyVal {
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setInAddonPanel(value: Boolean): Self = StObject.set(x, "inAddonPanel", value.asInstanceOf[js.Any])
    
    inline def setInAddonPanelUndefined: Self = StObject.set(x, "inAddonPanel", js.undefined)
    
    inline def setInitialExpandedArgs(value: Boolean): Self = StObject.set(x, "initialExpandedArgs", value.asInstanceOf[js.Any])
    
    inline def setInitialExpandedArgsUndefined: Self = StObject.set(x, "initialExpandedArgs", js.undefined)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setResetArgs(value: /* argNames */ js.UndefOr[js.Array[String]] => Unit): Self = StObject.set(x, "resetArgs", js.Any.fromFunction1(value))
    
    inline def setResetArgsUndefined: Self = StObject.set(x, "resetArgs", js.undefined)
    
    inline def setSort(value: SortType): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setUpdateArgs(value: /* args */ Args => Unit): Self = StObject.set(x, "updateArgs", js.Any.fromFunction1(value))
    
    inline def setUpdateArgsUndefined: Self = StObject.set(x, "updateArgs", js.undefined)
  }
}
