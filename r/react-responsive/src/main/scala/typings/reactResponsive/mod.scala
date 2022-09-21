package typings.reactResponsive

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.reactResponsive.anon.PartialMediaQueryAllQuery
import typings.reactResponsive.anon.PartialMediaQueryAllQueryAll
import typings.reactResponsive.anon.PartialMediaQueryMatchers
import typings.reactResponsive.reactResponsiveStrings.interlace
import typings.reactResponsive.reactResponsiveStrings.landscape
import typings.reactResponsive.reactResponsiveStrings.portrait
import typings.reactResponsive.reactResponsiveStrings.progressive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-responsive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-responsive", JSImport.Default)
  @js.native
  open class default ()
    extends Component[MediaQueryProps, js.Object, Any]
  
  @JSImport("react-responsive", "Context")
  @js.native
  val Context: typings.react.mod.Context[PartialMediaQueryAllQuery] = js.native
  
  inline def toQuery(matchers: PartialMediaQueryAllQuery): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toQuery")(matchers.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useMediaQuery(settings: PartialMediaQueryAllQueryAll): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(settings.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def useMediaQuery(
    settings: PartialMediaQueryAllQueryAll,
    device: Unit,
    callback: js.Function1[/* matches */ Boolean, Unit]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(settings.asInstanceOf[js.Any], device.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(settings: PartialMediaQueryAllQueryAll, device: MediaQueryMatchers): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(settings.asInstanceOf[js.Any], device.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(
    settings: PartialMediaQueryAllQueryAll,
    device: MediaQueryMatchers,
    callback: js.Function1[/* matches */ Boolean, Unit]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(settings.asInstanceOf[js.Any], device.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type MediaQuery = Component[MediaQueryProps, js.Object, Any]
  
  trait MediaQueryAllQueryable
    extends StObject
       with MediaQueryFeatures
       with MediaQueryTypes
  object MediaQueryAllQueryable {
    
    inline def apply(): MediaQueryAllQueryable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueryAllQueryable]
    }
  }
  
  trait MediaQueryFeatures
    extends StObject
       with MediaQueryMatchers {
    
    var maxAspectRatio: js.UndefOr[String] = js.undefined
    
    var maxColor: js.UndefOr[Double] = js.undefined
    
    var maxColorIndex: js.UndefOr[Double] = js.undefined
    
    var maxDeviceAspectRatio: js.UndefOr[String] = js.undefined
    
    var maxDeviceHeight: js.UndefOr[Double | String] = js.undefined
    
    var maxDeviceWidth: js.UndefOr[Double | String] = js.undefined
    
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    var maxMonochrome: js.UndefOr[Double] = js.undefined
    
    var maxResolution: js.UndefOr[Double | String] = js.undefined
    
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    var minAspectRatio: js.UndefOr[String] = js.undefined
    
    var minColor: js.UndefOr[Double] = js.undefined
    
    var minColorIndex: js.UndefOr[Double] = js.undefined
    
    var minDeviceAspectRatio: js.UndefOr[String] = js.undefined
    
    var minDeviceHeight: js.UndefOr[Double | String] = js.undefined
    
    var minDeviceWidth: js.UndefOr[Double | String] = js.undefined
    
    var minHeight: js.UndefOr[Double | String] = js.undefined
    
    var minMonochrome: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double | String] = js.undefined
    
    var minWidth: js.UndefOr[Double | String] = js.undefined
  }
  object MediaQueryFeatures {
    
    inline def apply(): MediaQueryFeatures = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueryFeatures]
    }
    
    extension [Self <: MediaQueryFeatures](x: Self) {
      
      inline def setMaxAspectRatio(value: String): Self = StObject.set(x, "maxAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setMaxAspectRatioUndefined: Self = StObject.set(x, "maxAspectRatio", js.undefined)
      
      inline def setMaxColor(value: Double): Self = StObject.set(x, "maxColor", value.asInstanceOf[js.Any])
      
      inline def setMaxColorIndex(value: Double): Self = StObject.set(x, "maxColorIndex", value.asInstanceOf[js.Any])
      
      inline def setMaxColorIndexUndefined: Self = StObject.set(x, "maxColorIndex", js.undefined)
      
      inline def setMaxColorUndefined: Self = StObject.set(x, "maxColor", js.undefined)
      
      inline def setMaxDeviceAspectRatio(value: String): Self = StObject.set(x, "maxDeviceAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setMaxDeviceAspectRatioUndefined: Self = StObject.set(x, "maxDeviceAspectRatio", js.undefined)
      
      inline def setMaxDeviceHeight(value: Double | String): Self = StObject.set(x, "maxDeviceHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxDeviceHeightUndefined: Self = StObject.set(x, "maxDeviceHeight", js.undefined)
      
      inline def setMaxDeviceWidth(value: Double | String): Self = StObject.set(x, "maxDeviceWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxDeviceWidthUndefined: Self = StObject.set(x, "maxDeviceWidth", js.undefined)
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxMonochrome(value: Double): Self = StObject.set(x, "maxMonochrome", value.asInstanceOf[js.Any])
      
      inline def setMaxMonochromeUndefined: Self = StObject.set(x, "maxMonochrome", js.undefined)
      
      inline def setMaxResolution(value: Double | String): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinAspectRatio(value: String): Self = StObject.set(x, "minAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setMinAspectRatioUndefined: Self = StObject.set(x, "minAspectRatio", js.undefined)
      
      inline def setMinColor(value: Double): Self = StObject.set(x, "minColor", value.asInstanceOf[js.Any])
      
      inline def setMinColorIndex(value: Double): Self = StObject.set(x, "minColorIndex", value.asInstanceOf[js.Any])
      
      inline def setMinColorIndexUndefined: Self = StObject.set(x, "minColorIndex", js.undefined)
      
      inline def setMinColorUndefined: Self = StObject.set(x, "minColor", js.undefined)
      
      inline def setMinDeviceAspectRatio(value: String): Self = StObject.set(x, "minDeviceAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setMinDeviceAspectRatioUndefined: Self = StObject.set(x, "minDeviceAspectRatio", js.undefined)
      
      inline def setMinDeviceHeight(value: Double | String): Self = StObject.set(x, "minDeviceHeight", value.asInstanceOf[js.Any])
      
      inline def setMinDeviceHeightUndefined: Self = StObject.set(x, "minDeviceHeight", js.undefined)
      
      inline def setMinDeviceWidth(value: Double | String): Self = StObject.set(x, "minDeviceWidth", value.asInstanceOf[js.Any])
      
      inline def setMinDeviceWidthUndefined: Self = StObject.set(x, "minDeviceWidth", js.undefined)
      
      inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinMonochrome(value: Double): Self = StObject.set(x, "minMonochrome", value.asInstanceOf[js.Any])
      
      inline def setMinMonochromeUndefined: Self = StObject.set(x, "minMonochrome", js.undefined)
      
      inline def setMinResolution(value: Double | String): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    }
  }
  
  trait MediaQueryMatchers extends StObject {
    
    var aspectRatio: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[Boolean] = js.undefined
    
    var colorIndex: js.UndefOr[Boolean] = js.undefined
    
    var deviceAspectRatio: js.UndefOr[String] = js.undefined
    
    var deviceHeight: js.UndefOr[Double | String] = js.undefined
    
    var deviceWidth: js.UndefOr[Double | String] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var monochrome: js.UndefOr[Boolean] = js.undefined
    
    var orientation: js.UndefOr[portrait | landscape] = js.undefined
    
    var resolution: js.UndefOr[Double | String] = js.undefined
    
    var scan: js.UndefOr[progressive | interlace] = js.undefined
    
    var `type`: js.UndefOr[MediaQueryType] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object MediaQueryMatchers {
    
    inline def apply(): MediaQueryMatchers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueryMatchers]
    }
    
    extension [Self <: MediaQueryMatchers](x: Self) {
      
      inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorIndex(value: Boolean): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
      
      inline def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDeviceAspectRatio(value: String): Self = StObject.set(x, "deviceAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setDeviceAspectRatioUndefined: Self = StObject.set(x, "deviceAspectRatio", js.undefined)
      
      inline def setDeviceHeight(value: Double | String): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      inline def setDeviceHeightUndefined: Self = StObject.set(x, "deviceHeight", js.undefined)
      
      inline def setDeviceWidth(value: Double | String): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      inline def setDeviceWidthUndefined: Self = StObject.set(x, "deviceWidth", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMonochrome(value: Boolean): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
      
      inline def setMonochromeUndefined: Self = StObject.set(x, "monochrome", js.undefined)
      
      inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setResolution(value: Double | String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setScan(value: progressive | interlace): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
      
      inline def setScanUndefined: Self = StObject.set(x, "scan", js.undefined)
      
      inline def setType(value: MediaQueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MediaQueryProps
    extends StObject
       with MediaQueryAllQueryable {
    
    var children: js.UndefOr[ReactNode | (js.Function1[/* matches */ Boolean, ReactNode])] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[ElementType[Any]] = js.undefined
    
    var device: js.UndefOr[MediaQueryMatchers] = js.undefined
    
    var onBeforeChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var values: js.UndefOr[PartialMediaQueryMatchers] = js.undefined
  }
  object MediaQueryProps {
    
    inline def apply(): MediaQueryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueryProps]
    }
    
    extension [Self <: MediaQueryProps](x: Self) {
      
      inline def setChildren(value: ReactNode | (js.Function1[/* matches */ Boolean, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* matches */ Boolean => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDevice(value: MediaQueryMatchers): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setOnBeforeChange(value: /* matches */ Boolean => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction1(value))
      
      inline def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      inline def setOnChange(value: /* matches */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValues(value: PartialMediaQueryMatchers): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactResponsive.reactResponsiveStrings.all
    - typings.reactResponsive.reactResponsiveStrings.grid
    - typings.reactResponsive.reactResponsiveStrings.aural
    - typings.reactResponsive.reactResponsiveStrings.braille
    - typings.reactResponsive.reactResponsiveStrings.handheld
    - typings.reactResponsive.reactResponsiveStrings.print
    - typings.reactResponsive.reactResponsiveStrings.projection
    - typings.reactResponsive.reactResponsiveStrings.screen
    - typings.reactResponsive.reactResponsiveStrings.tty
    - typings.reactResponsive.reactResponsiveStrings.tv
    - typings.reactResponsive.reactResponsiveStrings.embossed
  */
  trait MediaQueryType extends StObject
  
  trait MediaQueryTypes extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var aural: js.UndefOr[Boolean] = js.undefined
    
    var braille: js.UndefOr[Boolean] = js.undefined
    
    var embossed: js.UndefOr[Boolean] = js.undefined
    
    var grid: js.UndefOr[Boolean] = js.undefined
    
    var handheld: js.UndefOr[Boolean] = js.undefined
    
    var print: js.UndefOr[Boolean] = js.undefined
    
    var projection: js.UndefOr[Boolean] = js.undefined
    
    var screen: js.UndefOr[Boolean] = js.undefined
    
    var tty: js.UndefOr[Boolean] = js.undefined
    
    var tv: js.UndefOr[Boolean] = js.undefined
  }
  object MediaQueryTypes {
    
    inline def apply(): MediaQueryTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueryTypes]
    }
    
    extension [Self <: MediaQueryTypes](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setAural(value: Boolean): Self = StObject.set(x, "aural", value.asInstanceOf[js.Any])
      
      inline def setAuralUndefined: Self = StObject.set(x, "aural", js.undefined)
      
      inline def setBraille(value: Boolean): Self = StObject.set(x, "braille", value.asInstanceOf[js.Any])
      
      inline def setBrailleUndefined: Self = StObject.set(x, "braille", js.undefined)
      
      inline def setEmbossed(value: Boolean): Self = StObject.set(x, "embossed", value.asInstanceOf[js.Any])
      
      inline def setEmbossedUndefined: Self = StObject.set(x, "embossed", js.undefined)
      
      inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHandheld(value: Boolean): Self = StObject.set(x, "handheld", value.asInstanceOf[js.Any])
      
      inline def setHandheldUndefined: Self = StObject.set(x, "handheld", js.undefined)
      
      inline def setPrint(value: Boolean): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      inline def setProjection(value: Boolean): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setScreen(value: Boolean): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
      
      inline def setTty(value: Boolean): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
      
      inline def setTtyUndefined: Self = StObject.set(x, "tty", js.undefined)
      
      inline def setTv(value: Boolean): Self = StObject.set(x, "tv", value.asInstanceOf[js.Any])
      
      inline def setTvUndefined: Self = StObject.set(x, "tv", js.undefined)
    }
  }
}
