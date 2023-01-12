package typings.rcDialog

import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDialogMaskMod {
  
  @JSImport("rc-dialog/es/Dialog/Mask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MaskProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MaskProps extends StObject {
    
    var maskProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    var motionName: js.UndefOr[String] = js.undefined
    
    var prefixCls: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var visible: Boolean
  }
  object MaskProps {
    
    inline def apply(prefixCls: String, visible: Boolean): MaskProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaskProps] (val x: Self) extends AnyVal {
      
      inline def setMaskProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "maskProps", value.asInstanceOf[js.Any])
      
      inline def setMaskPropsUndefined: Self = StObject.set(x, "maskProps", js.undefined)
      
      inline def setMotionName(value: String): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      inline def setMotionNameUndefined: Self = StObject.set(x, "motionName", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
