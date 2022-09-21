package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.ChildrenValidator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esScrollSyncMod {
  
  @JSImport("react-virtualized/dist/es/ScrollSync", JSImport.Default)
  @js.native
  open class default protected () extends ScrollSync {
    def this(props: ScrollSyncProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollSyncProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-virtualized/dist/es/ScrollSync", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/ScrollSync", "default.propTypes")
    @js.native
    def propTypes: ChildrenValidator = js.native
    inline def propTypes_=(x: ChildrenValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-virtualized/dist/es/ScrollSync", "ScrollSync")
  @js.native
  open class ScrollSync protected () extends PureComponent[ScrollSyncProps, ScrollSyncState, Any] {
    def this(props: ScrollSyncProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollSyncProps, context: Any) = this()
  }
  /* static members */
  object ScrollSync {
    
    @JSImport("react-virtualized/dist/es/ScrollSync", "ScrollSync")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/ScrollSync", "ScrollSync.propTypes")
    @js.native
    def propTypes: ChildrenValidator = js.native
    inline def propTypes_=(x: ChildrenValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait OnScrollParams extends StObject {
    
    var clientHeight: Double
    
    var clientWidth: Double
    
    var scrollHeight: Double
    
    var scrollLeft: Double
    
    var scrollTop: Double
    
    var scrollWidth: Double
  }
  object OnScrollParams {
    
    inline def apply(
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
    
    extension [Self <: OnScrollParams](x: Self) {
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollSyncChildProps extends StObject {
    
    var clientHeight: Double
    
    var clientWidth: Double
    
    def onScroll(params: OnScrollParams): Unit
    
    var scrollHeight: Double
    
    var scrollLeft: Double
    
    var scrollTop: Double
    
    var scrollWidth: Double
  }
  object ScrollSyncChildProps {
    
    inline def apply(
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
    
    extension [Self <: ScrollSyncChildProps](x: Self) {
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setOnScroll(value: OnScrollParams => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollSyncProps
    extends StObject
       with /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Function responsible for rendering 2 or more virtualized components.
      * This function should implement the following signature:
      * ({ onScroll, scrollLeft, scrollTop }) => PropTypes.element
      */
    def children(props: ScrollSyncChildProps): ReactNode
  }
  object ScrollSyncProps {
    
    inline def apply(children: ScrollSyncChildProps => ReactNode): ScrollSyncProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ScrollSyncProps]
    }
    
    extension [Self <: ScrollSyncProps](x: Self) {
      
      inline def setChildren(value: ScrollSyncChildProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait ScrollSyncState extends StObject {
    
    var clientHeight: Double
    
    var clientWidth: Double
    
    var scrollHeight: Double
    
    var scrollLeft: Double
    
    var scrollTop: Double
    
    var scrollWidth: Double
  }
  object ScrollSyncState {
    
    inline def apply(
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
    
    extension [Self <: ScrollSyncState](x: Self) {
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    }
  }
}
