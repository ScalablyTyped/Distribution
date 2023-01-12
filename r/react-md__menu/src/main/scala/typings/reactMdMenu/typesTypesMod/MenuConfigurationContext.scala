package typings.reactMdMenu.typesTypesMod

import typings.react.mod.ReactNode
import typings.reactMdSheet.typesSheetMod.SheetPosition
import typings.reactMdSheet.typesSheetMod.SheetVerticalSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@react-md/menu.@react-md/menu/types/types.MenuConfiguration> */
trait MenuConfigurationContext extends StObject {
  
  var horizontal: Boolean
  
  var renderAsSheet: RenderMenuAsSheet
  
  var sheetFooter: ReactNode
  
  var sheetHeader: ReactNode
  
  var sheetPosition: SheetPosition
  
  var sheetVerticalSize: SheetVerticalSize
}
object MenuConfigurationContext {
  
  inline def apply(
    horizontal: Boolean,
    renderAsSheet: RenderMenuAsSheet,
    sheetPosition: SheetPosition,
    sheetVerticalSize: SheetVerticalSize
  ): MenuConfigurationContext = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], renderAsSheet = renderAsSheet.asInstanceOf[js.Any], sheetPosition = sheetPosition.asInstanceOf[js.Any], sheetVerticalSize = sheetVerticalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuConfigurationContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuConfigurationContext] (val x: Self) extends AnyVal {
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setRenderAsSheet(value: RenderMenuAsSheet): Self = StObject.set(x, "renderAsSheet", value.asInstanceOf[js.Any])
    
    inline def setSheetFooter(value: ReactNode): Self = StObject.set(x, "sheetFooter", value.asInstanceOf[js.Any])
    
    inline def setSheetFooterUndefined: Self = StObject.set(x, "sheetFooter", js.undefined)
    
    inline def setSheetHeader(value: ReactNode): Self = StObject.set(x, "sheetHeader", value.asInstanceOf[js.Any])
    
    inline def setSheetHeaderUndefined: Self = StObject.set(x, "sheetHeader", js.undefined)
    
    inline def setSheetPosition(value: SheetPosition): Self = StObject.set(x, "sheetPosition", value.asInstanceOf[js.Any])
    
    inline def setSheetVerticalSize(value: SheetVerticalSize): Self = StObject.set(x, "sheetVerticalSize", value.asInstanceOf[js.Any])
  }
}
