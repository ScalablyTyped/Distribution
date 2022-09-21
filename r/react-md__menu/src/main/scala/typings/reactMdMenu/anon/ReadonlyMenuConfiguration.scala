package typings.reactMdMenu.anon

import typings.react.mod.ReactNode
import typings.reactMdMenu.typesMod.RenderMenuAsSheet
import typings.reactMdSheet.sheetMod.SheetPosition
import typings.reactMdSheet.sheetMod.SheetVerticalSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@react-md/menu.@react-md/menu/types/types.MenuConfigurationContext> */
trait ReadonlyMenuConfiguration extends StObject {
  
  val horizontal: Boolean
  
  val renderAsSheet: RenderMenuAsSheet
  
  val sheetFooter: ReactNode
  
  val sheetHeader: ReactNode
  
  val sheetPosition: SheetPosition
  
  val sheetVerticalSize: SheetVerticalSize
}
object ReadonlyMenuConfiguration {
  
  inline def apply(
    horizontal: Boolean,
    renderAsSheet: RenderMenuAsSheet,
    sheetPosition: SheetPosition,
    sheetVerticalSize: SheetVerticalSize
  ): ReadonlyMenuConfiguration = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], renderAsSheet = renderAsSheet.asInstanceOf[js.Any], sheetPosition = sheetPosition.asInstanceOf[js.Any], sheetVerticalSize = sheetVerticalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMenuConfiguration]
  }
  
  extension [Self <: ReadonlyMenuConfiguration](x: Self) {
    
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
