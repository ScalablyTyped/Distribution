package typings.reactMdUtils

import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.reactMdUtils.anon.AppSizeinitializedboolean
import typings.reactMdUtils.appSizeListenerMod.AppSizeListenerProps
import typings.reactMdUtils.mediaOnlyMod.MediaOnlyProps
import typings.reactMdUtils.reactMdUtilsStrings.max
import typings.reactMdUtils.reactMdUtilsStrings.min
import typings.reactMdUtils.resizeListenerMod.ResizeListenerProps
import typings.reactMdUtils.resizeObserverMod.ResizeObserverProps
import typings.reactMdUtils.sizingConstantsMod.QuerySize
import typings.reactMdUtils.useAppSizeMediaMod.AppSize
import typings.reactMdUtils.useAppSizeMediaMod.AppSizeOptions
import typings.reactMdUtils.useEnsuredRefMod.EnsuredRefs
import typings.reactMdUtils.useResizeListenerMod.ResizeListenerOptions
import typings.reactMdUtils.useResizeObserverMod.OnResizeObserverChange
import typings.reactMdUtils.useResizeObserverMod.UseResizeObserverOptions
import typings.reactMdUtils.useResizeObserverV1Mod.UseResizeObserverV1Options
import typings.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuery
import typings.reactMdUtils.useWidthMediaQueryMod.WidthMediaQuerys
import typings.std.HTMLElement
import typings.std.OrientationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizingMod {
  
  @JSImport("@react-md/utils/types/sizing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/sizing", "AppSizeContext")
  @js.native
  val AppSizeContext: Context[AppSizeinitializedboolean] = js.native
  
  object AppSizeListener {
    
    inline def apply(
      hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/utils/types/sizing", "AppSizeListener")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.defaultSize")
      @js.native
      def defaultSize: js.Any = js.native
      inline def defaultSize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.desktopLargeMinWidth")
      @js.native
      def desktopLargeMinWidth: js.Any = js.native
      inline def desktopLargeMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLargeMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.desktopMinWidth")
      @js.native
      def desktopMinWidth: js.Any = js.native
      inline def desktopMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.onChange")
      @js.native
      def onChange: js.Any = js.native
      inline def onChange_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.phoneMaxWidth")
      @js.native
      def phoneMaxWidth: js.Any = js.native
      inline def phoneMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.tabletMaxWidth")
      @js.native
      def tabletMaxWidth: js.Any = js.native
      inline def tabletMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "AppSizeListener.propTypes.tabletMinWidth")
      @js.native
      def tabletMinWidth: js.Any = js.native
      inline def tabletMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMinWidth")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_APP_SIZE")
  @js.native
  val DEFAULT_APP_SIZE: AppSize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_DESKTOP_LARGE_MIN_WIDTH")
  @js.native
  val DEFAULT_DESKTOP_LARGE_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_DESKTOP_MIN_WIDTH")
  @js.native
  val DEFAULT_DESKTOP_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_PHONE_MAX_WIDTH")
  @js.native
  val DEFAULT_PHONE_MAX_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_TABLET_MAX_WIDTH")
  @js.native
  val DEFAULT_TABLET_MAX_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DEFAULT_TABLET_MIN_WIDTH")
  @js.native
  val DEFAULT_TABLET_MIN_WIDTH: QuerySize = js.native
  
  @JSImport("@react-md/utils/types/sizing", "DesktopOnly")
  @js.native
  val DesktopOnly: FC[MediaOnlyProps] = js.native
  
  @JSImport("@react-md/utils/types/sizing", "MobileOnly")
  @js.native
  val MobileOnly: FC[MediaOnlyProps] = js.native
  
  @JSImport("@react-md/utils/types/sizing", "PhoneOnly")
  @js.native
  val PhoneOnly: FC[MediaOnlyProps] = js.native
  
  object ResizeListener {
    
    inline def apply(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = ^.asInstanceOf[js.Dynamic].apply(hasOnResizeOptionsImmediate.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    @JSImport("@react-md/utils/types/sizing", "ResizeListener")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/sizing", "ResizeListener.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/sizing", "ResizeListener.propTypes.immediate")
      @js.native
      def immediate: js.Any = js.native
      inline def immediate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediate")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeListener.propTypes.onResize")
      @js.native
      def onResize: js.Any = js.native
      inline def onResize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeListener.propTypes.options")
      @js.native
      def options: js.Any = js.native
      inline def options_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    }
  }
  
  object ResizeObserver {
    
    inline def apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize: ResizeObserverProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("@react-md/utils/types/sizing", "ResizeObserver")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes.className")
      @js.native
      def className: js.Any = js.native
      inline def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes.component")
      @js.native
      def component: js.Any = js.native
      inline def component_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes.disableHeight")
      @js.native
      def disableHeight: js.Any = js.native
      inline def disableHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes.disableWidth")
      @js.native
      def disableWidth: js.Any = js.native
      inline def disableWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/utils/types/sizing", "ResizeObserver.propTypes.target")
      @js.native
      def target: js.Any = js.native
      inline def target_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("target")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/utils/types/sizing", "TabletOnly")
  @js.native
  val TabletOnly: FC[MediaOnlyProps] = js.native
  
  inline def getOrientationType(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientationType")().asInstanceOf[OrientationType]
  
  inline def toWidthPart_max(v: Unit, prefix: max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toWidthPart_max(v: QuerySize, prefix: max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toWidthPart_min(v: Unit, prefix: min): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toWidthPart_min(v: QuerySize, prefix: min): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useAppSize(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSize")().asInstanceOf[AppSize]
  
  inline def useAppSizeMedia(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")().asInstanceOf[AppSize]
  inline def useAppSizeMedia(
    hasPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeOptions
  ): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")(hasPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize.asInstanceOf[js.Any]).asInstanceOf[AppSize]
  
  inline def useMediaQuery(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Boolean, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Boolean, disabled: Unit, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Boolean, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useMediaQuery(query: String, defaultValue: Unit, disabled: Unit, checkImmediately: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], checkImmediately.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useOrientation(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("useOrientation")().asInstanceOf[OrientationType]
  inline def useOrientation(defaultValue: OrientationType): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("useOrientation")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[OrientationType]
  
  inline def useResizeListener(hasOnResizeOptionsImmediateEnabled: ResizeListenerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeListener")(hasOnResizeOptionsImmediateEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E]): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any]).asInstanceOf[EnsuredRefs[E]]
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E], options: UseResizeObserverOptions[E]): EnsuredRefs[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnsuredRefs[E]]
  inline def useResizeObserver[E /* <: HTMLElement */](options: UseResizeObserverV1Options[E]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useWidthMediaQuery(hasMinMax: WidthMediaQuery & WidthMediaQuerys): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useWidthMediaQuery")(hasMinMax.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
