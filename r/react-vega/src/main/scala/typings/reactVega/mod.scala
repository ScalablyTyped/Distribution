package typings.reactVega

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactVega.anon.Bottom
import typings.reactVega.anon.TypeofVegaWithSpec
import typings.std.Error
import typings.std.MouseEvent
import typings.std.Record
import typings.vegaTypings.mod.View
import typings.vegaTypings.runtimeMod.Item
import typings.vegaTypings.runtimeMod.TooltipHandler
import typings.vegaTypings.specMod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-vega", JSImport.Default)
  @js.native
  class default ()
    extends Component[VegaPropsWithSpec, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-vega", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-vega", "default.createClassFromSpec")
    @js.native
    def createClassFromSpec: CreateClassFromSpec = js.native
    inline def createClassFromSpec_=(x: CreateClassFromSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createClassFromSpec")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-vega", "VegaWithSpec")
  @js.native
  class VegaWithSpec protected ()
    extends Component[VegaPropsWithoutSpec, js.Object, js.Any] {
    def this(props: VegaPropsWithoutSpec) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VegaPropsWithoutSpec, context: js.Any) = this()
  }
  /* static members */
  object VegaWithSpec {
    
    @JSImport("react-vega", "VegaWithSpec")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getSpec(): Spec = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpec")().asInstanceOf[Spec]
  }
  
  @js.native
  trait CreateClassFromSpec extends StObject {
    
    def apply(name: String, spec: Spec): TypeofVegaWithSpec = js.native
    def apply(spec: Spec): TypeofVegaWithSpec = js.native
  }
  
  type Vega = Component[VegaPropsWithSpec, js.Object, js.Any]
  
  trait VegaPropsWithSpec
    extends StObject
       with VegaPropsWithoutSpec {
    
    var spec: Spec
  }
  object VegaPropsWithSpec {
    
    inline def apply(spec: Spec): VegaPropsWithSpec = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[VegaPropsWithSpec]
    }
    
    extension [Self <: VegaPropsWithSpec](x: Self) {
      
      inline def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  trait VegaPropsWithoutSpec extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Record[String, js.Array[js.Any]]] = js.undefined
    
    var enableHover: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var logLevel: js.UndefOr[Double] = js.undefined
    
    var onNewView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.undefined
    
    var onParseError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    
    var padding: js.UndefOr[Double | Bottom] = js.undefined
    
    var renderer: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tooltip: js.UndefOr[TooltipHandler] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object VegaPropsWithoutSpec {
    
    inline def apply(): VegaPropsWithoutSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VegaPropsWithoutSpec]
    }
    
    extension [Self <: VegaPropsWithoutSpec](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: Record[String, js.Array[js.Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEnableHover(value: Boolean): Self = StObject.set(x, "enableHover", value.asInstanceOf[js.Any])
      
      inline def setEnableHoverUndefined: Self = StObject.set(x, "enableHover", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setOnNewView(value: /* view */ View => Unit): Self = StObject.set(x, "onNewView", js.Any.fromFunction1(value))
      
      inline def setOnNewViewUndefined: Self = StObject.set(x, "onNewView", js.undefined)
      
      inline def setOnParseError(value: /* error */ Error => Unit): Self = StObject.set(x, "onParseError", js.Any.fromFunction1(value))
      
      inline def setOnParseErrorUndefined: Self = StObject.set(x, "onParseError", js.undefined)
      
      inline def setPadding(value: Double | Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRenderer(value: String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTooltip(
        value: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit
      ): Self = StObject.set(x, "tooltip", js.Any.fromFunction4(value))
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
