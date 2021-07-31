package typings.reactFns

import typings.react.mod.ComponentType
import typings.react.mod.SFC
import typings.reactFns.anon.PartialScrollConfig
import typings.reactFns.anon.PartialWindowSizeConfig
import typings.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps
import typings.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typings.reactFns.geoPositionGeoPositionMod.GeoPositionProps
import typings.reactFns.localesLocalesMod.LocalesProps
import typings.reactFns.mediaMediaMod.MediaProps
import typings.reactFns.networkNetworkMod.NetworkProps
import typings.reactFns.scrollScrollMod.ScrollConfig
import typings.reactFns.scrollScrollMod.ScrollProps
import typings.reactFns.typesMod.SharedRenderProps
import typings.reactFns.windowSizeWindowSizeMod.WindowSizeConfig
import typings.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-fns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-fns", "DeviceMotion")
  @js.native
  class DeviceMotion protected ()
    extends typings.reactFns.deviceMotionMod.DeviceMotion {
    def this(props: SharedRenderProps[DeviceMotionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceMotionProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns", "DeviceOrientation")
  @js.native
  class DeviceOrientation protected ()
    extends typings.reactFns.deviceOrientationMod.DeviceOrientation {
    def this(props: SharedRenderProps[DeviceOrientationProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[DeviceOrientationProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns", "GeoPosition")
  @js.native
  class GeoPosition protected ()
    extends typings.reactFns.geoPositionMod.GeoPosition {
    def this(props: SharedRenderProps[GeoPositionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[GeoPositionProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns", "Locales")
  @js.native
  class Locales protected ()
    extends typings.reactFns.localesMod.Locales {
    def this(props: SharedRenderProps[LocalesProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[LocalesProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns", "Media")
  @js.native
  val Media: SFC[SharedRenderProps[MediaProps]] = js.native
  
  @JSImport("react-fns", "Network")
  @js.native
  class Network protected ()
    extends typings.reactFns.networkMod.Network {
    def this(props: SharedRenderProps[NetworkProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[NetworkProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns", "Scroll")
  @js.native
  class Scroll protected ()
    extends typings.reactFns.scrollMod.Scroll {
    def this(props: ScrollConfig & SharedRenderProps[ScrollProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollConfig & SharedRenderProps[ScrollProps], context: js.Any) = this()
  }
  /* static members */
  object Scroll {
    
    @JSImport("react-fns", "Scroll")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns", "Scroll.defaultProps")
    @js.native
    def defaultProps: PartialScrollConfig = js.native
    @scala.inline
    def defaultProps_=(x: PartialScrollConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-fns", "WindowSize")
  @js.native
  class WindowSize protected ()
    extends typings.reactFns.windowSizeMod.WindowSize {
    def this(props: WindowSizeConfig & SharedRenderProps[WindowSizeProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WindowSizeConfig & SharedRenderProps[WindowSizeProps], context: js.Any) = this()
  }
  /* static members */
  object WindowSize {
    
    @JSImport("react-fns", "WindowSize")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fns", "WindowSize.defaultProps")
    @js.native
    def defaultProps: PartialWindowSizeConfig = js.native
    @scala.inline
    def defaultProps_=(x: PartialWindowSizeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def withDeviceMotion[Props](Component: ComponentType[Props & DeviceMotionProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDeviceMotion")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  @scala.inline
  def withDeviceOrientation[Props](Component: ComponentType[Props & DeviceOrientationProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDeviceOrientation")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  @scala.inline
  def withGeoPosition[Props](Component: ComponentType[Props & GeoPositionProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withGeoPosition")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  @scala.inline
  def withLocales[Props](Component: ComponentType[Props & LocalesProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLocales")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  @scala.inline
  def withNetwork[Props](Component: ComponentType[Props & NetworkProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNetwork")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  @scala.inline
  def withScroll[Props](Component: ComponentType[Props & ScrollProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScroll")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  @scala.inline
  def withWindowSize[Props](Component: ComponentType[Props & WindowSizeProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withWindowSize")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
