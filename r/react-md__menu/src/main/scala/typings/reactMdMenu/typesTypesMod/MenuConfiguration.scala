package typings.reactMdMenu.typesTypesMod

import typings.react.mod.ReactNode
import typings.reactMdSheet.typesSheetMod.SheetPosition
import typings.reactMdSheet.typesSheetMod.SheetVerticalSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuConfiguration
  extends StObject
     with MenuOrientationProps {
  
  /** {@inheritDoc RenderMenuAsSheet} */
  var renderAsSheet: js.UndefOr[RenderMenuAsSheet] = js.undefined
  
  /**
    * Any children to render below the sheet's menu implementation. This would
    * normally be something like a `<DialogFooter>`.
    *
    * @defaultValue `null`
    */
  var sheetFooter: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Any children to render above the sheet's menu implementation. This would
    * normally be something like a `<DialogHeader>` or `AppBar`.
    *
    * @defaultValue `null`
    */
  var sheetHeader: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @see {@link SheetPosition}
    * @defaultValue `"bottom"`
    */
  var sheetPosition: js.UndefOr[SheetPosition] = js.undefined
  
  /**
    * @see {@link SheetVerticalSize}
    * @defaultValue `"touch"`
    */
  var sheetVerticalSize: js.UndefOr[SheetVerticalSize] = js.undefined
}
object MenuConfiguration {
  
  inline def apply(): MenuConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRenderAsSheet(value: RenderMenuAsSheet): Self = StObject.set(x, "renderAsSheet", value.asInstanceOf[js.Any])
    
    inline def setRenderAsSheetUndefined: Self = StObject.set(x, "renderAsSheet", js.undefined)
    
    inline def setSheetFooter(value: ReactNode): Self = StObject.set(x, "sheetFooter", value.asInstanceOf[js.Any])
    
    inline def setSheetFooterUndefined: Self = StObject.set(x, "sheetFooter", js.undefined)
    
    inline def setSheetHeader(value: ReactNode): Self = StObject.set(x, "sheetHeader", value.asInstanceOf[js.Any])
    
    inline def setSheetHeaderUndefined: Self = StObject.set(x, "sheetHeader", js.undefined)
    
    inline def setSheetPosition(value: SheetPosition): Self = StObject.set(x, "sheetPosition", value.asInstanceOf[js.Any])
    
    inline def setSheetPositionUndefined: Self = StObject.set(x, "sheetPosition", js.undefined)
    
    inline def setSheetVerticalSize(value: SheetVerticalSize): Self = StObject.set(x, "sheetVerticalSize", value.asInstanceOf[js.Any])
    
    inline def setSheetVerticalSizeUndefined: Self = StObject.set(x, "sheetVerticalSize", js.undefined)
  }
}
