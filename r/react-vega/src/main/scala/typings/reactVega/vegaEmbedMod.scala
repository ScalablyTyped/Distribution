package typings.reactVega

import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.reactVega.typesMod.SignalListeners
import typings.reactVega.typesMod.View
import typings.reactVega.typesMod.ViewListener
import typings.std.HTMLDivElement
import typings.vegaEmbed.mod.EmbedOptions
import typings.vegaEmbed.mod.Result
import typings.vegaEmbed.mod.VisualizationSpec
import typings.vegaTypings.rendererMod.Renderers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vegaEmbedMod {
  
  @JSImport("react-vega/lib/VegaEmbed", JSImport.Default)
  @js.native
  open class default () extends VegaEmbed
  
  @js.native
  trait VegaEmbed
    extends PureComponent[VegaEmbedProps, js.Object, Any] {
    
    def clearView(): this.type = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MVegaEmbed(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MVegaEmbed(prevProps: VegaEmbedProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MVegaEmbed(): Unit = js.native
    
    var containerRef: RefObject[HTMLDivElement] = js.native
    
    def createView(): Unit = js.native
    
    def handleError(error: js.Error): Unit = js.native
    
    def modifyView(action: ViewListener): Unit = js.native
    
    var resultPromise: js.UndefOr[js.Promise[js.UndefOr[Result]]] = js.native
  }
  
  trait VegaEmbedProps
    extends StObject
       with EmbedOptions[String, Renderers] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* containerRef */ HTMLDivElement, Unit]] = js.undefined
    
    var onNewView: js.UndefOr[ViewListener] = js.undefined
    
    var signalListeners: js.UndefOr[SignalListeners] = js.undefined
    
    var spec: VisualizationSpec
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object VegaEmbedProps {
    
    inline def apply(spec: VisualizationSpec): VegaEmbedProps = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[VegaEmbedProps]
    }
    
    extension [Self <: VegaEmbedProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* containerRef */ HTMLDivElement) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnNewView(value: /* view */ View => Unit): Self = StObject.set(x, "onNewView", js.Any.fromFunction1(value))
      
      inline def setOnNewViewUndefined: Self = StObject.set(x, "onNewView", js.undefined)
      
      inline def setSignalListeners(value: SignalListeners): Self = StObject.set(x, "signalListeners", value.asInstanceOf[js.Any])
      
      inline def setSignalListenersUndefined: Self = StObject.set(x, "signalListeners", js.undefined)
      
      inline def setSpec(value: VisualizationSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
