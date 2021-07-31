package typings.reactMdUtils

import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.reactMdUtils.useResizeObserverMod.OnResizeObserverChange
import typings.reactMdUtils.useResizeObserverMod.ResizeObserverElementData
import typings.reactMdUtils.useResizeObserverV1Mod.ResizeObserverTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeObserverMod {
  
  object ResizeObserver {
    
    @scala.inline
    def apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize: ResizeObserverProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("@react-md/utils/types/sizing/ResizeObserver", "ResizeObserver")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/sizing/ResizeObserver", "ResizeObserver.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/sizing/ResizeObserver", "ResizeObserver.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/ResizeObserver", "ResizeObserver.propTypes.component")
      @js.native
      def component: js.Any = js.native
      @scala.inline
      def component_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/ResizeObserver", "ResizeObserver.propTypes.disableHeight")
      @js.native
      def disableHeight: js.Any = js.native
      @scala.inline
      def disableHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/ResizeObserver", "ResizeObserver.propTypes.disableWidth")
      @js.native
      def disableWidth: js.Any = js.native
      @scala.inline
      def disableWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing/ResizeObserver", "ResizeObserver.propTypes.target")
      @js.native
      def target: js.Any = js.native
      @scala.inline
      def target_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("target")(x.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeObserverProps extends StObject {
    
    /**
      * An optional className to provide to this component when the `target` prop
      * is provided. You should really not be adding styles to this component as it
      * is hidden.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * This prop will only be used when the `target` prop is `undefined`. Since
      * the `ResizeObserver` will need to find a DOM node to listen to changes to,
      * it will be rendered in the dom and find the parent element for size
      * changes. You really only want to change this up if trying to listen to
      * table resize events and not using the `target` prop.
      */
    var component: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    /**
      * Boolean if the resize observer should stop tracking height changes. This
      * will only update the callback/renderer to not update on height changes, so
      * there will not be a huge performance boost.
      */
    var disableHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the resize observer should stop tracking width changes. This
      * will only update the callback/renderer to not update on height changes, so
      * there will not be a huge performance boost.
      */
    var disableWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The resize event handler for the resize observer. The callback will include
      * the next height, width, scrollHeight, scrollWidth, and the element that is
      * being observed.
      */
    var onResize: OnResizeObserverChange[HTMLElement]
    
    /**
      * An optional resize target to be used instead of the parent element of this
      * component.  This can either be an `HTMLElement`, a `querySelector` string,
      * a function that returns an `HTMLElement` or `null`.
      *
      * Setting this to `null` will result in a "lazy Observer". The observer will
      * not start until it has been updated to be a string or an HTMLElement.
      */
    var target: js.UndefOr[ResizeObserverTarget[HTMLElement]] = js.undefined
  }
  object ResizeObserverProps {
    
    @scala.inline
    def apply(onResize: /* resizeData */ ResizeObserverElementData[HTMLElement] => Unit): ResizeObserverProps = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
      __obj.asInstanceOf[ResizeObserverProps]
    }
    
    @scala.inline
    implicit class ResizeObserverPropsMutableBuilder[Self <: ResizeObserverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponent(value: ElementType[js.Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDisableHeight(value: Boolean): Self = StObject.set(x, "disableHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHeightUndefined: Self = StObject.set(x, "disableHeight", js.undefined)
      
      @scala.inline
      def setDisableWidth(value: Boolean): Self = StObject.set(x, "disableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableWidthUndefined: Self = StObject.set(x, "disableWidth", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* resizeData */ ResizeObserverElementData[HTMLElement] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTarget(value: ResizeObserverTarget[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetFunction0(value: () => HTMLElement | Null): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
