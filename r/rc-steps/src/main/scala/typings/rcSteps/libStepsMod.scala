package typings.rcSteps

import typings.rcSteps.anon.Description
import typings.rcSteps.anon.Index
import typings.rcSteps.libInterfaceMod.Icons
import typings.rcSteps.libInterfaceMod.Status
import typings.rcSteps.libStepMod.StepProps
import typings.rcSteps.rcStepsStrings.`inline`
import typings.rcSteps.rcStepsStrings.default
import typings.rcSteps.rcStepsStrings.horizontal
import typings.rcSteps.rcStepsStrings.navigation
import typings.rcSteps.rcStepsStrings.small
import typings.rcSteps.rcStepsStrings.vertical
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsMod {
  
  object default {
    
    inline def apply(props: StepsProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-steps/lib/Steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_Step.default` */
    inline def Step(props: StepProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Step")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  }
  
  type ProgressDotRender = js.Function2[/* iconDot */ Any, /* info */ Index, ReactNode]
  
  type StepIconRender = js.Function1[/* info */ Description, ReactNode]
  
  trait StepsProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var current: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var iconPrefix: js.UndefOr[String] = js.undefined
    
    var icons: js.UndefOr[Icons] = js.undefined
    
    var initial: js.UndefOr[Double] = js.undefined
    
    var itemRender: js.UndefOr[js.Function2[/* item */ StepProps, /* stepItem */ ReactNode, ReactNode]] = js.undefined
    
    var items: js.UndefOr[js.Array[StepProps]] = js.undefined
    
    var labelPlacement: js.UndefOr[horizontal | vertical] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var progressDot: js.UndefOr[ProgressDotRender | Boolean] = js.undefined
    
    var size: js.UndefOr[default | small] = js.undefined
    
    var status: js.UndefOr[Status] = js.undefined
    
    var stepIcon: js.UndefOr[StepIconRender] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: js.UndefOr[default | navigation | `inline`] = js.undefined
  }
  object StepsProps {
    
    inline def apply(): StepsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepsProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      inline def setIconPrefixUndefined: Self = StObject.set(x, "iconPrefix", js.undefined)
      
      inline def setIcons(value: Icons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setItemRender(value: (/* item */ StepProps, /* stepItem */ ReactNode) => ReactNode): Self = StObject.set(x, "itemRender", js.Any.fromFunction2(value))
      
      inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      inline def setItems(value: js.Array[StepProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: StepProps*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLabelPlacement(value: horizontal | vertical): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setOnChange(value: /* current */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setProgressDot(value: ProgressDotRender | Boolean): Self = StObject.set(x, "progressDot", value.asInstanceOf[js.Any])
      
      inline def setProgressDotFunction2(value: (/* iconDot */ Any, /* info */ Index) => ReactNode): Self = StObject.set(x, "progressDot", js.Any.fromFunction2(value))
      
      inline def setProgressDotUndefined: Self = StObject.set(x, "progressDot", js.undefined)
      
      inline def setSize(value: default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStepIcon(value: /* info */ Description => ReactNode): Self = StObject.set(x, "stepIcon", js.Any.fromFunction1(value))
      
      inline def setStepIconUndefined: Self = StObject.set(x, "stepIcon", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: default | navigation | `inline`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
