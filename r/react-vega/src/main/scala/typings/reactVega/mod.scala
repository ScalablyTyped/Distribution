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
import scala.scalajs.js.`|`
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
    @scala.inline
    def createClassFromSpec_=(x: CreateClassFromSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createClassFromSpec")(x.asInstanceOf[js.Any])
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
    
    @JSImport("react-vega", "VegaWithSpec.getSpec")
    @js.native
    def getSpec(): Spec = js.native
  }
  
  @js.native
  trait CreateClassFromSpec extends StObject {
    
    def apply(name: String, spec: Spec): TypeofVegaWithSpec = js.native
    def apply(spec: Spec): TypeofVegaWithSpec = js.native
  }
  
  type Vega = Component[VegaPropsWithSpec, js.Object, js.Any]
  
  @js.native
  trait VegaPropsWithSpec extends VegaPropsWithoutSpec {
    
    var spec: Spec = js.native
  }
  object VegaPropsWithSpec {
    
    @scala.inline
    def apply(spec: Spec): VegaPropsWithSpec = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[VegaPropsWithSpec]
    }
    
    @scala.inline
    implicit class VegaPropsWithSpecMutableBuilder[Self <: VegaPropsWithSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VegaPropsWithoutSpec extends StObject {
    
    var background: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[Record[String, js.Array[_]]] = js.native
    
    var enableHover: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var logLevel: js.UndefOr[Double] = js.native
    
    var onNewView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.native
    
    var onParseError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
    
    var padding: js.UndefOr[Double | Bottom] = js.native
    
    var renderer: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tooltip: js.UndefOr[TooltipHandler] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object VegaPropsWithoutSpec {
    
    @scala.inline
    def apply(): VegaPropsWithoutSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VegaPropsWithoutSpec]
    }
    
    @scala.inline
    implicit class VegaPropsWithoutSpecMutableBuilder[Self <: VegaPropsWithoutSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setData(value: Record[String, js.Array[_]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEnableHover(value: Boolean): Self = StObject.set(x, "enableHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableHoverUndefined: Self = StObject.set(x, "enableHover", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setOnNewView(value: /* view */ View => Unit): Self = StObject.set(x, "onNewView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNewViewUndefined: Self = StObject.set(x, "onNewView", js.undefined)
      
      @scala.inline
      def setOnParseError(value: /* error */ Error => Unit): Self = StObject.set(x, "onParseError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnParseErrorUndefined: Self = StObject.set(x, "onParseError", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRenderer(value: String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTooltip(
        value: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit
      ): Self = StObject.set(x, "tooltip", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
