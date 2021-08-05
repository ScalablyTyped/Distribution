package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.DisableHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAutoSizerMod {
  
  @JSImport("react-virtualized/dist/es/AutoSizer", "AutoSizer")
  @js.native
  class AutoSizer protected ()
    extends PureComponent[AutoSizerProps, Size, js.Any] {
    def this(props: AutoSizerProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MAutoSizer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAutoSizer(): Unit = js.native
  }
  /* static members */
  object AutoSizer {
    
    @JSImport("react-virtualized/dist/es/AutoSizer", "AutoSizer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/AutoSizer", "AutoSizer.defaultProps")
    @js.native
    def defaultProps: DisableHeight = js.native
    inline def defaultProps_=(x: DisableHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait AutoSizerProps
    extends StObject
       with /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] {
    
    /**
      * Function responsible for rendering children.
      * This function should implement the following signature:
      * ({ height, width }) => PropTypes.element
      */
    def children(props: Size): ReactNode
    
    /**
      *     Optional custom CSS class name to attach to root AutoSizer element.
      * This is an advanced property and is not typically necessary.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Height passed to child for initial render; useful for server-side rendering.
      * This value will be overridden with an accurate height after mounting.
      */
    var defaultHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Width passed to child for initial render; useful for server-side rendering.
      * This value will be overridden with an accurate width after mounting.
      */
    var defaultWidth: js.UndefOr[Double] = js.undefined
    
    /** Disable dynamic :height property */
    var disableHeight: js.UndefOr[Boolean] = js.undefined
    
    /** Disable dynamic :width property */
    var disableWidth: js.UndefOr[Boolean] = js.undefined
    
    /** Nonce of the inlined stylesheet for Content Security Policy */
    var nonce: js.UndefOr[String] = js.undefined
    
    /** Callback to be invoked on-resize: ({ height, width }) */
    var onResize: js.UndefOr[js.Function1[/* info */ Size, js.Any]] = js.undefined
    
    /**
      * Optional custom inline style to attach to root AutoSizer element.
      * This is an advanced property and is not typically necessary.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AutoSizerProps {
    
    inline def apply(children: Size => ReactNode): AutoSizerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[AutoSizerProps]
    }
    
    extension [Self <: AutoSizerProps](x: Self) {
      
      inline def setChildren(value: Size => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
      
      inline def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
      
      inline def setDisableHeight(value: Boolean): Self = StObject.set(x, "disableHeight", value.asInstanceOf[js.Any])
      
      inline def setDisableHeightUndefined: Self = StObject.set(x, "disableHeight", js.undefined)
      
      inline def setDisableWidth(value: Boolean): Self = StObject.set(x, "disableWidth", value.asInstanceOf[js.Any])
      
      inline def setDisableWidthUndefined: Self = StObject.set(x, "disableWidth", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnResize(value: /* info */ Size => js.Any): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type Dimensions = Size
  
  trait Size extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Size {
    
    inline def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
