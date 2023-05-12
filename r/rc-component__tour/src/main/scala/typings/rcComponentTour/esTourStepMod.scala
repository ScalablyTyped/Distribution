package typings.rcComponentTour

import typings.rcComponentTour.anon.Color
import typings.rcComponentTour.anon.PointAtCenter
import typings.rcComponentTour.esPlacementsMod.PlacementType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.ScrollIntoViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTourStepMod {
  
  @JSImport("@rc-component/tour/es/TourStep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TourStepProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TourStepInfo extends StObject {
    
    var arrow: js.UndefOr[Boolean | PointAtCenter] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var mask: js.UndefOr[Boolean | Color] = js.undefined
    
    var placement: js.UndefOr[PlacementType] = js.undefined
    
    var scrollIntoViewOptions: js.UndefOr[Boolean | ScrollIntoViewOptions] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var target: js.UndefOr[HTMLElement | (js.Function0[HTMLElement | Null]) | Null] = js.undefined
    
    var title: ReactNode
  }
  object TourStepInfo {
    
    inline def apply(): TourStepInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TourStepInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TourStepInfo] (val x: Self) extends AnyVal {
      
      inline def setArrow(value: Boolean | PointAtCenter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setMask(value: Boolean | Color): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setPlacement(value: PlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setScrollIntoViewOptions(value: Boolean | ScrollIntoViewOptions): Self = StObject.set(x, "scrollIntoViewOptions", value.asInstanceOf[js.Any])
      
      inline def setScrollIntoViewOptionsUndefined: Self = StObject.set(x, "scrollIntoViewOptions", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: HTMLElement | (js.Function0[HTMLElement | Null])): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFunction0(value: () => HTMLElement | Null): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TourStepProps
    extends StObject
       with TourStepInfo {
    
    var current: js.UndefOr[Double] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPrev: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderPanel: js.UndefOr[js.Function2[/* step */ this.type, /* current */ Double, ReactNode]] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object TourStepProps {
    
    inline def apply(): TourStepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TourStepProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TourStepProps] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setOnNext(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      inline def setOnPrev(value: () => Unit): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
      
      inline def setOnPrevUndefined: Self = StObject.set(x, "onPrev", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRenderPanel(value: (TourStepProps, /* current */ Double) => ReactNode): Self = StObject.set(x, "renderPanel", js.Any.fromFunction2(value))
      
      inline def setRenderPanelUndefined: Self = StObject.set(x, "renderPanel", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
