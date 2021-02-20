package typings.reactResponsive

import typings.react.mod.CSSProperties
import typings.react.mod.ClassType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.reactResponsive.anon.PartialMediaQueryAllQuery
import typings.reactResponsive.anon.PartialMediaQueryAllQueryAll
import typings.reactResponsive.anon.PartialMediaQueryMatchers
import typings.reactResponsive.reactResponsiveStrings.interlace
import typings.reactResponsive.reactResponsiveStrings.landscape
import typings.reactResponsive.reactResponsiveStrings.portrait
import typings.reactResponsive.reactResponsiveStrings.progressive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-responsive", JSImport.Default)
  @js.native
  class default ()
    extends Component[MediaQueryProps, js.Object, js.Any]
  
  @JSImport("react-responsive", "Context")
  @js.native
  val Context: typings.react.mod.Context[PartialMediaQueryAllQuery] = js.native
  
  @JSImport("react-responsive", "toQuery")
  @js.native
  def toQuery(matchers: PartialMediaQueryAllQuery): String = js.native
  
  @JSImport("react-responsive", "useMediaQuery")
  @js.native
  def useMediaQuery(settings: PartialMediaQueryAllQueryAll): Boolean = js.native
  @JSImport("react-responsive", "useMediaQuery")
  @js.native
  def useMediaQuery(
    settings: PartialMediaQueryAllQueryAll,
    device: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* matches */ Boolean, Unit]
  ): Boolean = js.native
  @JSImport("react-responsive", "useMediaQuery")
  @js.native
  def useMediaQuery(settings: PartialMediaQueryAllQueryAll, device: MediaQueryMatchers): Boolean = js.native
  @JSImport("react-responsive", "useMediaQuery")
  @js.native
  def useMediaQuery(
    settings: PartialMediaQueryAllQueryAll,
    device: MediaQueryMatchers,
    callback: js.Function1[/* matches */ Boolean, Unit]
  ): Boolean = js.native
  
  type MediaQuery = Component[MediaQueryProps, js.Object, js.Any]
  
  @js.native
  trait MediaQueryAllQueryable
    extends MediaQueryFeatures
       with MediaQueryTypes
  object MediaQueryAllQueryable {
    
    @scala.inline
    def apply(): MediaQueryAllQueryable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueryAllQueryable]
    }
  }
  
  @js.native
  trait MediaQueryFeatures extends MediaQueryMatchers {
    
    var maxAspectRatio: js.UndefOr[String] = js.native
    
    var maxColor: js.UndefOr[Double] = js.native
    
    var maxColorIndex: js.UndefOr[Double] = js.native
    
    var maxDeviceAspectRatio: js.UndefOr[String] = js.native
    
    var maxDeviceHeight: js.UndefOr[Double | String] = js.native
    
    var maxDeviceWidth: js.UndefOr[Double | String] = js.native
    
    var maxHeight: js.UndefOr[Double | String] = js.native
    
    var maxMonochrome: js.UndefOr[Double] = js.native
    
    var maxResolution: js.UndefOr[Double | String] = js.native
    
    var maxWidth: js.UndefOr[Double | String] = js.native
    
    var minAspectRatio: js.UndefOr[String] = js.native
    
    var minColor: js.UndefOr[Double] = js.native
    
    var minColorIndex: js.UndefOr[Double] = js.native
    
    var minDeviceAspectRatio: js.UndefOr[String] = js.native
    
    var minDeviceHeight: js.UndefOr[Double | String] = js.native
    
    var minDeviceWidth: js.UndefOr[Double | String] = js.native
    
    var minHeight: js.UndefOr[Double | String] = js.native
    
    var minMonochrome: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double | String] = js.native
    
    var minWidth: js.UndefOr[Double | String] = js.native
  }
  object MediaQueryFeatures {
    
    @scala.inline
    def apply(): MediaQueryFeatures = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueryFeatures]
    }
    
    @scala.inline
    implicit class MediaQueryFeaturesMutableBuilder[Self <: MediaQueryFeatures] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAspectRatio(value: String): Self = StObject.set(x, "maxAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAspectRatioUndefined: Self = StObject.set(x, "maxAspectRatio", js.undefined)
      
      @scala.inline
      def setMaxColor(value: Double): Self = StObject.set(x, "maxColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxColorIndex(value: Double): Self = StObject.set(x, "maxColorIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxColorIndexUndefined: Self = StObject.set(x, "maxColorIndex", js.undefined)
      
      @scala.inline
      def setMaxColorUndefined: Self = StObject.set(x, "maxColor", js.undefined)
      
      @scala.inline
      def setMaxDeviceAspectRatio(value: String): Self = StObject.set(x, "maxDeviceAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDeviceAspectRatioUndefined: Self = StObject.set(x, "maxDeviceAspectRatio", js.undefined)
      
      @scala.inline
      def setMaxDeviceHeight(value: Double | String): Self = StObject.set(x, "maxDeviceHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDeviceHeightUndefined: Self = StObject.set(x, "maxDeviceHeight", js.undefined)
      
      @scala.inline
      def setMaxDeviceWidth(value: Double | String): Self = StObject.set(x, "maxDeviceWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDeviceWidthUndefined: Self = StObject.set(x, "maxDeviceWidth", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxMonochrome(value: Double): Self = StObject.set(x, "maxMonochrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMonochromeUndefined: Self = StObject.set(x, "maxMonochrome", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double | String): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinAspectRatio(value: String): Self = StObject.set(x, "minAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinAspectRatioUndefined: Self = StObject.set(x, "minAspectRatio", js.undefined)
      
      @scala.inline
      def setMinColor(value: Double): Self = StObject.set(x, "minColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinColorIndex(value: Double): Self = StObject.set(x, "minColorIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinColorIndexUndefined: Self = StObject.set(x, "minColorIndex", js.undefined)
      
      @scala.inline
      def setMinColorUndefined: Self = StObject.set(x, "minColor", js.undefined)
      
      @scala.inline
      def setMinDeviceAspectRatio(value: String): Self = StObject.set(x, "minDeviceAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDeviceAspectRatioUndefined: Self = StObject.set(x, "minDeviceAspectRatio", js.undefined)
      
      @scala.inline
      def setMinDeviceHeight(value: Double | String): Self = StObject.set(x, "minDeviceHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDeviceHeightUndefined: Self = StObject.set(x, "minDeviceHeight", js.undefined)
      
      @scala.inline
      def setMinDeviceWidth(value: Double | String): Self = StObject.set(x, "minDeviceWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDeviceWidthUndefined: Self = StObject.set(x, "minDeviceWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinMonochrome(value: Double): Self = StObject.set(x, "minMonochrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinMonochromeUndefined: Self = StObject.set(x, "minMonochrome", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double | String): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    }
  }
  
  @js.native
  trait MediaQueryMatchers extends StObject {
    
    var aspectRatio: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[Boolean] = js.native
    
    var colorIndex: js.UndefOr[Boolean] = js.native
    
    var deviceAspectRatio: js.UndefOr[String] = js.native
    
    var deviceHeight: js.UndefOr[Double | String] = js.native
    
    var deviceWidth: js.UndefOr[Double | String] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var monochrome: js.UndefOr[Boolean] = js.native
    
    var orientation: js.UndefOr[portrait | landscape] = js.native
    
    var resolution: js.UndefOr[Double | String] = js.native
    
    var scan: js.UndefOr[progressive | interlace] = js.native
    
    var `type`: js.UndefOr[MediaQueryType] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
  }
  object MediaQueryMatchers {
    
    @scala.inline
    def apply(): MediaQueryMatchers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueryMatchers]
    }
    
    @scala.inline
    implicit class MediaQueryMatchersMutableBuilder[Self <: MediaQueryMatchers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorIndex(value: Boolean): Self = StObject.set(x, "colorIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorIndexUndefined: Self = StObject.set(x, "colorIndex", js.undefined)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDeviceAspectRatio(value: String): Self = StObject.set(x, "deviceAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceAspectRatioUndefined: Self = StObject.set(x, "deviceAspectRatio", js.undefined)
      
      @scala.inline
      def setDeviceHeight(value: Double | String): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceHeightUndefined: Self = StObject.set(x, "deviceHeight", js.undefined)
      
      @scala.inline
      def setDeviceWidth(value: Double | String): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceWidthUndefined: Self = StObject.set(x, "deviceWidth", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMonochrome(value: Boolean): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonochromeUndefined: Self = StObject.set(x, "monochrome", js.undefined)
      
      @scala.inline
      def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setResolution(value: Double | String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      @scala.inline
      def setScan(value: progressive | interlace): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScanUndefined: Self = StObject.set(x, "scan", js.undefined)
      
      @scala.inline
      def setType(value: MediaQueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait MediaQueryProps extends MediaQueryAllQueryable {
    
    var children: js.UndefOr[ReactNode | (js.Function1[/* matches */ Boolean, ReactNode])] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[String | SFC[_] | (ClassType[_, _, _]) | (ComponentClass[_, ComponentState])] = js.native
    
    var device: js.UndefOr[MediaQueryMatchers] = js.native
    
    var onBeforeChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.native
    
    var query: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var values: js.UndefOr[PartialMediaQueryMatchers] = js.native
  }
  object MediaQueryProps {
    
    @scala.inline
    def apply(): MediaQueryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueryProps]
    }
    
    @scala.inline
    implicit class MediaQueryPropsMutableBuilder[Self <: MediaQueryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode | (js.Function1[/* matches */ Boolean, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* matches */ Boolean => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponent(value: String | SFC[_] | (ClassType[_, _, _]) | (ComponentClass[_, ComponentState])): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDevice(value: MediaQueryMatchers): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setOnBeforeChange(value: /* matches */ Boolean => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* matches */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValues(value: PartialMediaQueryMatchers): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
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
  
  @js.native
  trait MediaQueryTypes extends StObject {
    
    var all: js.UndefOr[Boolean] = js.native
    
    var aural: js.UndefOr[Boolean] = js.native
    
    var braille: js.UndefOr[Boolean] = js.native
    
    var embossed: js.UndefOr[Boolean] = js.native
    
    var grid: js.UndefOr[Boolean] = js.native
    
    var handheld: js.UndefOr[Boolean] = js.native
    
    var print: js.UndefOr[Boolean] = js.native
    
    var projection: js.UndefOr[Boolean] = js.native
    
    var screen: js.UndefOr[Boolean] = js.native
    
    var tty: js.UndefOr[Boolean] = js.native
    
    var tv: js.UndefOr[Boolean] = js.native
  }
  object MediaQueryTypes {
    
    @scala.inline
    def apply(): MediaQueryTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQueryTypes]
    }
    
    @scala.inline
    implicit class MediaQueryTypesMutableBuilder[Self <: MediaQueryTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setAural(value: Boolean): Self = StObject.set(x, "aural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuralUndefined: Self = StObject.set(x, "aural", js.undefined)
      
      @scala.inline
      def setBraille(value: Boolean): Self = StObject.set(x, "braille", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrailleUndefined: Self = StObject.set(x, "braille", js.undefined)
      
      @scala.inline
      def setEmbossed(value: Boolean): Self = StObject.set(x, "embossed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbossedUndefined: Self = StObject.set(x, "embossed", js.undefined)
      
      @scala.inline
      def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHandheld(value: Boolean): Self = StObject.set(x, "handheld", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandheldUndefined: Self = StObject.set(x, "handheld", js.undefined)
      
      @scala.inline
      def setPrint(value: Boolean): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      @scala.inline
      def setProjection(value: Boolean): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setScreen(value: Boolean): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
      
      @scala.inline
      def setTty(value: Boolean): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtyUndefined: Self = StObject.set(x, "tty", js.undefined)
      
      @scala.inline
      def setTv(value: Boolean): Self = StObject.set(x, "tv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvUndefined: Self = StObject.set(x, "tv", js.undefined)
    }
  }
}
