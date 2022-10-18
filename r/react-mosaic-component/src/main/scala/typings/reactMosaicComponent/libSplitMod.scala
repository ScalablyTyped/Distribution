package typings.reactMosaicComponent

import typings.react.mod.PureComponent
import typings.reactMosaicComponent.anon.MinimumPaneSizePercentage
import typings.reactMosaicComponent.libTypesMod.EnabledResizeOptions
import typings.reactMosaicComponent.libTypesMod.MosaicDirection
import typings.reactMosaicComponent.libUtilBoundingBoxMod.BoundingBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSplitMod {
  
  @JSImport("react-mosaic-component/lib/Split", "Split")
  @js.native
  open class Split protected ()
    extends PureComponent[SplitProps, js.Object, Any] {
    def this(props: SplitProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SplitProps, context: Any) = this()
    
    /* private */ var bindListeners: Any = js.native
    
    /* private */ var calculateRelativePercentage: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSplit(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSplit(): Unit = js.native
    
    /* private */ var computeStyle: Any = js.native
    
    /* private */ var listenersBound: Any = js.native
    
    /* private */ var onMouseDown: Any = js.native
    
    /* private */ var onMouseMove: Any = js.native
    
    /* private */ var onMouseUp: Any = js.native
    
    /* private */ var rootElement: Any = js.native
    
    /* private */ var throttledUpdatePercentage: Any = js.native
    
    /* private */ var unbindListeners: Any = js.native
  }
  /* static members */
  object Split {
    
    @JSImport("react-mosaic-component/lib/Split", "Split")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component/lib/Split", "Split.defaultProps")
    @js.native
    def defaultProps: MinimumPaneSizePercentage = js.native
    inline def defaultProps_=(x: MinimumPaneSizePercentage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait SplitProps
    extends StObject
       with EnabledResizeOptions {
    
    var boundingBox: BoundingBox
    
    var direction: MosaicDirection
    
    var onChange: js.UndefOr[js.Function1[/* percentOfParent */ Double, Unit]] = js.undefined
    
    var onRelease: js.UndefOr[js.Function1[/* percentOfParent */ Double, Unit]] = js.undefined
    
    var splitPercentage: Double
  }
  object SplitProps {
    
    inline def apply(boundingBox: BoundingBox, direction: MosaicDirection, splitPercentage: Double): SplitProps = {
      val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], splitPercentage = splitPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitProps]
    }
    
    extension [Self <: SplitProps](x: Self) {
      
      inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: MosaicDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* percentOfParent */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnRelease(value: /* percentOfParent */ Double => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
      
      inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
      
      inline def setSplitPercentage(value: Double): Self = StObject.set(x, "splitPercentage", value.asInstanceOf[js.Any])
    }
  }
}
