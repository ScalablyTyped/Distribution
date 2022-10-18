package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.LabelHTMLAttributes
import typings.reactstrap.typesLibColMod.ColumnProps
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLLabelElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibLabelMod {
  
  @JSImport("reactstrap/types/lib/Label", JSImport.Default)
  @js.native
  open class default ()
    extends Component[LabelProps, js.Object, Any]
  
  type Label = Component[LabelProps, js.Object, Any]
  
  trait LabelProps
    extends StObject
       with LabelHTMLAttributes[HTMLLabelElement]
       with /* key */ StringDictionary[Any] {
    
    var check: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var `for`: js.UndefOr[String] = js.undefined
    
    var lg: js.UndefOr[ColumnProps] = js.undefined
    
    var md: js.UndefOr[ColumnProps] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var sm: js.UndefOr[ColumnProps] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    // custom widths
    var widths: js.UndefOr[js.Array[String]] = js.undefined
    
    var xl: js.UndefOr[ColumnProps] = js.undefined
    
    var xs: js.UndefOr[ColumnProps] = js.undefined
    
    var xxl: js.UndefOr[ColumnProps] = js.undefined
  }
  object LabelProps {
    
    inline def apply(): LabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelProps]
    }
    
    extension [Self <: LabelProps](x: Self) {
      
      inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      inline def setLg(value: ColumnProps): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: ColumnProps): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSm(value: ColumnProps): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setWidths(value: js.Array[String]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      inline def setWidthsVarargs(value: String*): Self = StObject.set(x, "widths", js.Array(value*))
      
      inline def setXl(value: ColumnProps): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: ColumnProps): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: ColumnProps): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
}
