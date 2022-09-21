package typings.reactMdUtils

import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.reactMdUtils.anon.AppSizeinitializedboolean
import typings.reactMdUtils.appSizeListenerMod.AppSizeListenerProps
import typings.reactMdUtils.mediaOnlyMod.MediaOnlyProps
import typings.reactMdUtils.reactMdUtilsStrings.max
import typings.reactMdUtils.reactMdUtilsStrings.min
import typings.reactMdUtils.resizeListenerMod.ResizeListenerProps
import typings.reactMdUtils.sizingConstantsMod.QuerySize
import typings.reactMdUtils.useAppSizeMediaMod.AppSize
import typings.reactMdUtils.useAppSizeMediaMod.AppSizeOptions
import typings.reactMdUtils.useEnsuredRefMod.EnsuredRefs
import typings.reactMdUtils.useResizeListenerMod.ResizeListenerOptions
import typings.reactMdUtils.useResizeObserverMod.OnResizeObserverChange
import typings.reactMdUtils.useResizeObserverMod.UseResizeObserverOptions
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
  
  inline def AppSizeListener(
    hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("AppSizeListener")(hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
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
  
  inline def DesktopOnly(hasChildrenFallback: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("DesktopOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def MobileOnly(hasChildrenFallback: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MobileOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def PhoneOnly(hasChildrenFallback: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("PhoneOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def ResizeListener(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ResizeListener")(hasOnResizeOptionsImmediate.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def TabletOnly(hasChildrenFallback: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("TabletOnly")(hasChildrenFallback.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def getOrientationType(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientationType")().asInstanceOf[OrientationType]
  
  inline def toWidthPart(v: Unit, prefix: min | max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toWidthPart(v: QuerySize, prefix: min | max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  
  inline def useWidthMediaQuery(hasMinMax: WidthMediaQuery & WidthMediaQuerys): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useWidthMediaQuery")(hasMinMax.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
