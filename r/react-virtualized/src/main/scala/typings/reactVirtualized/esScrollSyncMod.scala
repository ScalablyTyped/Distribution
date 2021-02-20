package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.ChildrenValidator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esScrollSyncMod {
  
  @JSImport("react-virtualized/dist/es/ScrollSync", "ScrollSync")
  @js.native
  class ScrollSync protected ()
    extends PureComponent[ScrollSyncProps, ScrollSyncState, js.Any] {
    def this(props: ScrollSyncProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollSyncProps, context: js.Any) = this()
  }
  /* static members */
  object ScrollSync {
    
    @JSImport("react-virtualized/dist/es/ScrollSync", "ScrollSync")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/ScrollSync", "ScrollSync.propTypes")
    @js.native
    def propTypes: ChildrenValidator = js.native
    @scala.inline
    def propTypes_=(x: ChildrenValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait OnScrollParams extends StObject {
    
    var clientHeight: Double = js.native
    
    var clientWidth: Double = js.native
    
    var scrollHeight: Double = js.native
    
    var scrollLeft: Double = js.native
    
    var scrollTop: Double = js.native
    
    var scrollWidth: Double = js.native
  }
  object OnScrollParams {
    
    @scala.inline
    def apply(
      clientHeight: Double,
      clientWidth: Double,
      scrollHeight: Double,
      scrollLeft: Double,
      scrollTop: Double,
      scrollWidth: Double
    ): OnScrollParams = {
      val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnScrollParams]
    }
    
    @scala.inline
    implicit class OnScrollParamsMutableBuilder[Self <: OnScrollParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollSyncChildProps extends StObject {
    
    var clientHeight: Double = js.native
    
    var clientWidth: Double = js.native
    
    def onScroll(params: OnScrollParams): Unit = js.native
    
    var scrollHeight: Double = js.native
    
    var scrollLeft: Double = js.native
    
    var scrollTop: Double = js.native
    
    var scrollWidth: Double = js.native
  }
  object ScrollSyncChildProps {
    
    @scala.inline
    def apply(
      clientHeight: Double,
      clientWidth: Double,
      onScroll: OnScrollParams => Unit,
      scrollHeight: Double,
      scrollLeft: Double,
      scrollTop: Double,
      scrollWidth: Double
    ): ScrollSyncChildProps = {
      val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollSyncChildProps]
    }
    
    @scala.inline
    implicit class ScrollSyncChildPropsMutableBuilder[Self <: ScrollSyncChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScroll(value: OnScrollParams => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollSyncProps
    extends /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] {
    
    /**
      * Function responsible for rendering 2 or more virtualized components.
      * This function should implement the following signature:
      * ({ onScroll, scrollLeft, scrollTop }) => PropTypes.element
      */
    def children(props: ScrollSyncChildProps): ReactNode = js.native
  }
  object ScrollSyncProps {
    
    @scala.inline
    def apply(children: ScrollSyncChildProps => ReactNode): ScrollSyncProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ScrollSyncProps]
    }
    
    @scala.inline
    implicit class ScrollSyncPropsMutableBuilder[Self <: ScrollSyncProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ScrollSyncChildProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ScrollSyncState extends StObject {
    
    var clientHeight: Double = js.native
    
    var clientWidth: Double = js.native
    
    var scrollHeight: Double = js.native
    
    var scrollLeft: Double = js.native
    
    var scrollTop: Double = js.native
    
    var scrollWidth: Double = js.native
  }
  object ScrollSyncState {
    
    @scala.inline
    def apply(
      clientHeight: Double,
      clientWidth: Double,
      scrollHeight: Double,
      scrollLeft: Double,
      scrollTop: Double,
      scrollWidth: Double
    ): ScrollSyncState = {
      val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollSyncState]
    }
    
    @scala.inline
    implicit class ScrollSyncStateMutableBuilder[Self <: ScrollSyncState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    }
  }
}
