package typings.reactStickynode

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactStickynode.mod.StatusCode.STATUS_FIXED
import typings.reactStickynode.mod.StatusCode.STATUS_ORIGINAL
import typings.reactStickynode.mod.StatusCode.STATUS_RELEASED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** A performant and comprehensive React sticky component. */
  @JSImport("react-stickynode", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[Props, js.Object, js.Any]
  @JSImport("react-stickynode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("react-stickynode", "STATUS_FIXED")
  @js.native
  def STATUS_FIXED: typings.reactStickynode.mod.StatusCode.STATUS_FIXED = js.native
  @scala.inline
  def STATUS_FIXED_=(x: STATUS_FIXED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATUS_FIXED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("react-stickynode", "STATUS_ORIGINAL")
  @js.native
  def STATUS_ORIGINAL: typings.reactStickynode.mod.StatusCode.STATUS_ORIGINAL = js.native
  @scala.inline
  def STATUS_ORIGINAL_=(x: STATUS_ORIGINAL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATUS_ORIGINAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("react-stickynode", "STATUS_RELEASED")
  @js.native
  def STATUS_RELEASED: typings.reactStickynode.mod.StatusCode.STATUS_RELEASED = js.native
  @scala.inline
  def STATUS_RELEASED_=(x: STATUS_RELEASED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATUS_RELEASED")(x.asInstanceOf[js.Any])
  
  @js.native
  sealed trait StatusCode extends StObject
  @JSImport("react-stickynode", "StatusCode")
  @js.native
  object StatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StatusCode with Double] = js.native
    
    @js.native
    sealed trait STATUS_FIXED extends StatusCode
    /* 2 */ val STATUS_FIXED: typings.reactStickynode.mod.StatusCode.STATUS_FIXED with Double = js.native
    
    /** The default status, located at the original position. */
    @js.native
    sealed trait STATUS_ORIGINAL extends StatusCode
    /* 0 */ val STATUS_ORIGINAL: typings.reactStickynode.mod.StatusCode.STATUS_ORIGINAL with Double = js.native
    
    /**
      * The released status, located at somewhere on document, but not
      * default one.
      */
    @js.native
    sealed trait STATUS_RELEASED extends StatusCode
    /* 1 */ val STATUS_RELEASED: typings.reactStickynode.mod.StatusCode.STATUS_RELEASED with Double = js.native
  }
  
  /* static member */
  @JSImport("react-stickynode", "defaultProps")
  @js.native
  def defaultProps: Props = js.native
  @scala.inline
  def defaultProps_=(x: Props): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Props extends StObject {
    
    /**
      * Class name to be applied to the element when the sticky state is
      * active ('active' by default).
      */
    var activeClass: js.UndefOr[String] = js.native
    
    /**
      * The offset from the top of document which release state will be
      * triggered when the bottom of the element reaches at. If it is a
      * selector to a target (via `querySelector()`), the offset will be the
      * bottom of the target.
      */
    var bottomBoundary: js.UndefOr[Double | String] = js.native
    
    var children: ReactNode | (js.Function1[/* status */ Status, ReactNode]) = js.native
    
    /**
      * Class name to be applied to the element independent of the
      * sticky state.
      */
    var className: js.UndefOr[String] = js.native
    
    /** Enable the use of CSS3 transforms (`true` by default). */
    var enableTransforms: js.UndefOr[Boolean] = js.native
    
    /** The switch to enable or disable Sticky (true by default ). */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Class name to be applied to the inner element ('' by default).
      */
    var innerClass: js.UndefOr[String] = js.native
    
    /** z-index of the sticky */
    var innerZ: js.UndefOr[Double | String] = js.native
    
    /** Callback for when the sticky state changes. */
    var onStateChange: js.UndefOr[js.Function1[/* status */ Status, Unit]] = js.native
    
    /**
      * Class name to be applied to the element when the sticky state is
      * released ('released' by default).
      */
    var releasedClass: js.UndefOr[String] = js.native
    
    /**
      * Callback to indicate when the sticky plugin should freeze position
      * and ignore scroll/resize events.
      */
    var shouldFreeze: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /**
      * The offset from the top of window where the top of the element will
      * be when sticky state is triggered(0 by default ). If it is a selector
      * to a target (via `querySelector()`), the offset will be the height of
      * the target.
      */
    var top: js.UndefOr[Double | String] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      @scala.inline
      def setBottomBoundary(value: Double | String): Self = StObject.set(x, "bottomBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomBoundaryUndefined: Self = StObject.set(x, "bottomBoundary", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode | (js.Function1[/* status */ Status, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* status */ Status => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEnableTransforms(value: Boolean): Self = StObject.set(x, "enableTransforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTransformsUndefined: Self = StObject.set(x, "enableTransforms", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setInnerClass(value: String): Self = StObject.set(x, "innerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerClassUndefined: Self = StObject.set(x, "innerClass", js.undefined)
      
      @scala.inline
      def setInnerZ(value: Double | String): Self = StObject.set(x, "innerZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerZUndefined: Self = StObject.set(x, "innerZ", js.undefined)
      
      @scala.inline
      def setOnStateChange(value: /* status */ Status => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      @scala.inline
      def setReleasedClass(value: String): Self = StObject.set(x, "releasedClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleasedClassUndefined: Self = StObject.set(x, "releasedClass", js.undefined)
      
      @scala.inline
      def setShouldFreeze(value: () => Boolean): Self = StObject.set(x, "shouldFreeze", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldFreezeUndefined: Self = StObject.set(x, "shouldFreeze", js.undefined)
      
      @scala.inline
      def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait Status extends StObject {
    
    var status: StatusCode = js.native
  }
  object Status {
    
    @scala.inline
    def apply(status: StatusCode): Status = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: StatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** A performant and comprehensive React sticky component. */
  type Sticky = Component[Props, js.Object, js.Any]
}
