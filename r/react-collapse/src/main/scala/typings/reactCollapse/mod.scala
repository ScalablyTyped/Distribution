package typings.reactCollapse

import typings.react.mod.HTMLProps
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactCollapse.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-collapse", "Collapse")
  @js.native
  class Collapse protected ()
    extends PureComponent[CollapseProps, js.Object, js.Any] {
    def this(props: CollapseProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CollapseProps, context: js.Any) = this()
  }
  
  @JSImport("react-collapse", "UnmountClosed")
  @js.native
  class UnmountClosed protected ()
    extends PureComponent[CollapseProps, js.Object, js.Any] {
    def this(props: CollapseProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CollapseProps, context: js.Any) = this()
  }
  
  @js.native
  trait CollapseCallbackArgs extends StObject {
    
    /** current pixel height of Collapse container (changes until reaches `contentHeight`) */
    var containerHeight: Double = js.native
    
    /** determined height of supplied Content */
    var contentHeight: Double = js.native
    
    /** `true` only when Collapse is fully closed and height is zero */
    var isFullyClosed: Boolean = js.native
    
    /** `true` only when Collapse reached final height */
    var isFullyOpened: Boolean = js.native
    
    /** `true` if Collapse has any non-zero height */
    var isOpened: Boolean = js.native
  }
  object CollapseCallbackArgs {
    
    @scala.inline
    def apply(
      containerHeight: Double,
      contentHeight: Double,
      isFullyClosed: Boolean,
      isFullyOpened: Boolean,
      isOpened: Boolean
    ): CollapseCallbackArgs = {
      val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], contentHeight = contentHeight.asInstanceOf[js.Any], isFullyClosed = isFullyClosed.asInstanceOf[js.Any], isFullyOpened = isFullyOpened.asInstanceOf[js.Any], isOpened = isOpened.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseCallbackArgs]
    }
    
    @scala.inline
    implicit class CollapseCallbackArgsMutableBuilder[Self <: CollapseCallbackArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFullyClosed(value: Boolean): Self = StObject.set(x, "isFullyClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFullyOpened(value: Boolean): Self = StObject.set(x, "isFullyOpened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpened(value: Boolean): Self = StObject.set(x, "isOpened", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CollapseProps extends HTMLProps[Collapse] {
    
    /** How often (in ms) the height of the content is checked. */
    var checkTimeout: js.UndefOr[Double] = js.native
    
    /** One or multiple children with static, variable or dynamic height. */
    @JSName("children")
    var children_CollapseProps: ReactNode = js.native
    
    /** A way to control the initial element style. Will not be valid after the initial render */
    var initialStyle: js.UndefOr[Height] = js.native
    
    /** Expands or collapses content. */
    var isOpened: Boolean = js.native
    
    /** Callback function triggered when animation has completed */
    var onRest: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.native
    
    /** Callback function triggered when animation begins */
    var onWork: js.UndefOr[js.Function1[/* args */ CollapseCallbackArgs, Unit]] = js.native
    
    /** It is possible to set className for extra div elements that ReactCollapse creates. */
    var theme: js.UndefOr[typings.reactCollapse.anon.Collapse] = js.native
  }
  object CollapseProps {
    
    @scala.inline
    def apply(isOpened: Boolean): CollapseProps = {
      val __obj = js.Dynamic.literal(isOpened = isOpened.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseProps]
    }
    
    @scala.inline
    implicit class CollapsePropsMutableBuilder[Self <: CollapseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckTimeout(value: Double): Self = StObject.set(x, "checkTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckTimeoutUndefined: Self = StObject.set(x, "checkTimeout", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialStyle(value: Height): Self = StObject.set(x, "initialStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStyleUndefined: Self = StObject.set(x, "initialStyle", js.undefined)
      
      @scala.inline
      def setIsOpened(value: Boolean): Self = StObject.set(x, "isOpened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRest(value: /* args */ CollapseCallbackArgs => Unit): Self = StObject.set(x, "onRest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      @scala.inline
      def setOnWork(value: /* args */ CollapseCallbackArgs => Unit): Self = StObject.set(x, "onWork", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWorkUndefined: Self = StObject.set(x, "onWork", js.undefined)
      
      @scala.inline
      def setTheme(value: typings.reactCollapse.anon.Collapse): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
