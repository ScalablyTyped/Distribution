package typings.rcComponentTour

import typings.rcComponentTour.anon.Placeholder
import typings.rcComponentTour.esHooksUseTargetMod.PosInfo
import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMaskMod {
  
  @JSImport("@rc-component/tour/es/Mask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MaskProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MaskProps extends StObject {
    
    var animated: js.UndefOr[Boolean | Placeholder] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var pos: PosInfo
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var showMask: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object MaskProps {
    
    inline def apply(pos: PosInfo): MaskProps = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaskProps] (val x: Self) extends AnyVal {
      
      inline def setAnimated(value: Boolean | Placeholder): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPos(value: PosInfo): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setShowMask(value: Boolean): Self = StObject.set(x, "showMask", value.asInstanceOf[js.Any])
      
      inline def setShowMaskUndefined: Self = StObject.set(x, "showMask", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
