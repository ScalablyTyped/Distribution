package typings.reactVega

import org.scalablytyped.runtime.Instantiable1
import typings.fastJsonPatch.moduleCoreMod.Operation
import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import typings.reactVega.libTypesMod.PlainObject
import typings.reactVega.libTypesMod.SignalListeners
import typings.reactVega.libTypesMod.ViewListener
import typings.reactVega.reactVegaStrings.dark
import typings.reactVega.reactVegaStrings.excel
import typings.reactVega.reactVegaStrings.ggplot2
import typings.reactVega.reactVegaStrings.quartz
import typings.reactVega.reactVegaStrings.vox
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Record
import typings.vega.mod.View
import typings.vegaEmbed.anon.Bottom
import typings.vegaEmbed.anon.PartialCLICKTOVIEWACTIONS
import typings.vegaEmbed.anon.TypeofexpressionInterpret
import typings.vegaEmbed.mod.Actions
import typings.vegaEmbed.mod.Config
import typings.vegaEmbed.mod.ExpressionFunction
import typings.vegaEmbed.mod.Hover
import typings.vegaEmbed.mod.PatchFunc
import typings.vegaEmbed.mod.VisualizationSpec
import typings.vegaTooltip.mod.Options
import typings.vegaTypings.typesRuntimeMod.Item
import typings.vegaTypings.typesRuntimeMod.LoaderOptions
import typings.vegaTypings.typesRuntimeMod.Loader_
import typings.vegaTypings.typesRuntimeMod.TooltipHandler
import typings.vegaTypings.typesRuntimeRendererMod.Renderers
import typings.vegaTypings.typesRuntimeRuntimeMod.Runtime
import typings.vegaTypings.typesSpecMod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVegaLiteMod {
  
  @JSImport("react-vega/lib/VegaLite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: VegaLiteProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Omit<react-vega.react-vega/lib/Vega.VegaProps, 'mode'> */
  trait VegaLiteProps extends StObject {
    
    var actions: js.UndefOr[Boolean | Actions] = js.undefined
    
    var ast: js.UndefOr[Boolean] = js.undefined
    
    var bind: js.UndefOr[HTMLElement | String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var config: js.UndefOr[String | Config] = js.undefined
    
    var data: js.UndefOr[PlainObject] = js.undefined
    
    var defaultStyle: js.UndefOr[Boolean | String] = js.undefined
    
    var downloadFileName: js.UndefOr[String] = js.undefined
    
    var editorUrl: js.UndefOr[String] = js.undefined
    
    var expr: js.UndefOr[TypeofexpressionInterpret] = js.undefined
    
    var expressionFunctions: js.UndefOr[ExpressionFunction] = js.undefined
    
    var formatLocale: js.UndefOr[Record[String, Any]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var hover: js.UndefOr[Boolean | Hover] = js.undefined
    
    var i18n: js.UndefOr[PartialCLICKTOVIEWACTIONS] = js.undefined
    
    var loader: js.UndefOr[Loader_ | LoaderOptions] = js.undefined
    
    var logLevel: js.UndefOr[Double] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* containerRef */ HTMLDivElement, Unit]] = js.undefined
    
    var onNewView: js.UndefOr[ViewListener] = js.undefined
    
    var padding: js.UndefOr[Double | Bottom] = js.undefined
    
    var patch: js.UndefOr[String | PatchFunc | js.Array[Operation]] = js.undefined
    
    var renderer: js.UndefOr[Renderers] = js.undefined
    
    var scaleFactor: js.UndefOr[Double] = js.undefined
    
    var signalListeners: js.UndefOr[SignalListeners] = js.undefined
    
    var sourceFooter: js.UndefOr[String] = js.undefined
    
    var sourceHeader: js.UndefOr[String] = js.undefined
    
    var spec: VisualizationSpec
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var theme: js.UndefOr[excel | ggplot2 | quartz | vox | dark] = js.undefined
    
    var timeFormatLocale: js.UndefOr[Record[String, Any]] = js.undefined
    
    var tooltip: js.UndefOr[TooltipHandler | Options | Boolean] = js.undefined
    
    var viewClass: js.UndefOr[Instantiable1[/* runtime */ Runtime, View]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object VegaLiteProps {
    
    inline def apply(spec: VisualizationSpec): VegaLiteProps = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[VegaLiteProps]
    }
    
    extension [Self <: VegaLiteProps](x: Self) {
      
      inline def setActions(value: Boolean | Actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAst(value: Boolean): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      inline def setBind(value: HTMLElement | String): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setConfig(value: String | Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setData(value: PlainObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDefaultStyle(value: Boolean | String): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      inline def setDownloadFileName(value: String): Self = StObject.set(x, "downloadFileName", value.asInstanceOf[js.Any])
      
      inline def setDownloadFileNameUndefined: Self = StObject.set(x, "downloadFileName", js.undefined)
      
      inline def setEditorUrl(value: String): Self = StObject.set(x, "editorUrl", value.asInstanceOf[js.Any])
      
      inline def setEditorUrlUndefined: Self = StObject.set(x, "editorUrl", js.undefined)
      
      inline def setExpr(value: TypeofexpressionInterpret): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
      
      inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
      
      inline def setExpressionFunctions(value: ExpressionFunction): Self = StObject.set(x, "expressionFunctions", value.asInstanceOf[js.Any])
      
      inline def setExpressionFunctionsUndefined: Self = StObject.set(x, "expressionFunctions", js.undefined)
      
      inline def setFormatLocale(value: Record[String, Any]): Self = StObject.set(x, "formatLocale", value.asInstanceOf[js.Any])
      
      inline def setFormatLocaleUndefined: Self = StObject.set(x, "formatLocale", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHover(value: Boolean | Hover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setI18n(value: PartialCLICKTOVIEWACTIONS): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setLoader(value: Loader_ | LoaderOptions): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* containerRef */ HTMLDivElement) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnNewView(value: /* view */ typings.reactVega.libTypesMod.View => Unit): Self = StObject.set(x, "onNewView", js.Any.fromFunction1(value))
      
      inline def setOnNewViewUndefined: Self = StObject.set(x, "onNewView", js.undefined)
      
      inline def setPadding(value: Double | Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPatch(value: String | PatchFunc | js.Array[Operation]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchFunction1(value: /* spec */ Spec => Spec): Self = StObject.set(x, "patch", js.Any.fromFunction1(value))
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPatchVarargs(value: Operation*): Self = StObject.set(x, "patch", js.Array(value*))
      
      inline def setRenderer(value: Renderers): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
      
      inline def setSignalListeners(value: SignalListeners): Self = StObject.set(x, "signalListeners", value.asInstanceOf[js.Any])
      
      inline def setSignalListenersUndefined: Self = StObject.set(x, "signalListeners", js.undefined)
      
      inline def setSourceFooter(value: String): Self = StObject.set(x, "sourceFooter", value.asInstanceOf[js.Any])
      
      inline def setSourceFooterUndefined: Self = StObject.set(x, "sourceFooter", js.undefined)
      
      inline def setSourceHeader(value: String): Self = StObject.set(x, "sourceHeader", value.asInstanceOf[js.Any])
      
      inline def setSourceHeaderUndefined: Self = StObject.set(x, "sourceHeader", js.undefined)
      
      inline def setSpec(value: VisualizationSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: excel | ggplot2 | quartz | vox | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTimeFormatLocale(value: Record[String, Any]): Self = StObject.set(x, "timeFormatLocale", value.asInstanceOf[js.Any])
      
      inline def setTimeFormatLocaleUndefined: Self = StObject.set(x, "timeFormatLocale", js.undefined)
      
      inline def setTooltip(value: TooltipHandler | Options | Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipFunction4(value: (/* handler */ Any, /* event */ MouseEvent, /* item */ Item[Any], /* value */ Any) => Unit): Self = StObject.set(x, "tooltip", js.Any.fromFunction4(value))
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setViewClass(value: Instantiable1[/* runtime */ Runtime, View]): Self = StObject.set(x, "viewClass", value.asInstanceOf[js.Any])
      
      inline def setViewClassUndefined: Self = StObject.set(x, "viewClass", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
