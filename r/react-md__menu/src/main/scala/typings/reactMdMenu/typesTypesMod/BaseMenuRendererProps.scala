package typings.reactMdMenu.typesTypesMod

import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.reactMdMenu.anon.ReadonlyOmitMenuWidgetPro
import typings.reactMdMenu.reactMdMenuStrings.children
import typings.reactMdMenu.reactMdMenuStrings.id
import typings.reactMdMenu.reactMdMenuStrings.onRequestClose
import typings.reactMdMenu.reactMdMenuStrings.visible
import typings.reactMdPortal.typesConditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdSheet.typesSheetMod.SheetProps
import typings.std.HTMLDivElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMenuRendererProps
  extends StObject
     with RenderConditionalPortalProps
     with MenuConfiguration {
  
  /**
    * An optional className that should be passed to the menu component.
    */
  var menuClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Any additional props that should be passed to the {@link Menu} component.
    *
    * Note: use the {@link menuStyle} and {@link menuClassName} props instead of
    * including `style` or `className` here.
    */
  var menuProps: js.UndefOr[ReadonlyOmitMenuWidgetPro] = js.undefined
  
  /**
    * An optional style object that should be merged with the menu's fixed
    * positioning styles.
    */
  var menuStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * An optional className that should be passed to the sheet component.
    */
  var sheetClassName: js.UndefOr[String] = js.undefined
  
  /**
    * Any additional props that should be added to the sheet's menu
    * implementation. You probably won't ever need to use this.
    */
  var sheetMenuProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  
  /**
    * Any additional props that should be passed to the {@link Sheet} component.
    *
    * Note: use the {@link sheetStyle} and {@link sheetClassName} props instead
    * of including `style` or `className` here.
    */
  var sheetProps: js.UndefOr[Omit[SheetProps, id | visible | onRequestClose | children]] = js.undefined
  
  /**
    * An optional style object that should be passed to the sheet.
    */
  var sheetStyle: js.UndefOr[CSSProperties] = js.undefined
}
object BaseMenuRendererProps {
  
  inline def apply(): BaseMenuRendererProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMenuRendererProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseMenuRendererProps] (val x: Self) extends AnyVal {
    
    inline def setMenuClassName(value: String): Self = StObject.set(x, "menuClassName", value.asInstanceOf[js.Any])
    
    inline def setMenuClassNameUndefined: Self = StObject.set(x, "menuClassName", js.undefined)
    
    inline def setMenuProps(value: ReadonlyOmitMenuWidgetPro): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
    
    inline def setMenuPropsUndefined: Self = StObject.set(x, "menuProps", js.undefined)
    
    inline def setMenuStyle(value: CSSProperties): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
    
    inline def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
    
    inline def setSheetClassName(value: String): Self = StObject.set(x, "sheetClassName", value.asInstanceOf[js.Any])
    
    inline def setSheetClassNameUndefined: Self = StObject.set(x, "sheetClassName", js.undefined)
    
    inline def setSheetMenuProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "sheetMenuProps", value.asInstanceOf[js.Any])
    
    inline def setSheetMenuPropsUndefined: Self = StObject.set(x, "sheetMenuProps", js.undefined)
    
    inline def setSheetProps(value: Omit[SheetProps, id | visible | onRequestClose | children]): Self = StObject.set(x, "sheetProps", value.asInstanceOf[js.Any])
    
    inline def setSheetPropsUndefined: Self = StObject.set(x, "sheetProps", js.undefined)
    
    inline def setSheetStyle(value: CSSProperties): Self = StObject.set(x, "sheetStyle", value.asInstanceOf[js.Any])
    
    inline def setSheetStyleUndefined: Self = StObject.set(x, "sheetStyle", js.undefined)
  }
}
