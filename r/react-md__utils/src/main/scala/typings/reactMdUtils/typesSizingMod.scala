package typings.reactMdUtils

import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.reactMdUtils.anon.AppSizeinitializedboolean
import typings.reactMdUtils.reactMdUtilsStrings.max
import typings.reactMdUtils.reactMdUtilsStrings.min
import typings.reactMdUtils.typesSizingAppSizeListenerMod.AppSizeListenerProps
import typings.reactMdUtils.typesSizingConstantsMod.QuerySize
import typings.reactMdUtils.typesSizingMediaOnlyMod.MediaOnlyProps
import typings.reactMdUtils.typesSizingResizeListenerMod.ResizeListenerProps
import typings.reactMdUtils.typesSizingUseAppSizeMediaMod.AppSize
import typings.reactMdUtils.typesSizingUseAppSizeMediaMod.AppSizeOptions
import typings.reactMdUtils.typesSizingUseResizeListenerMod.ResizeListenerOptions
import typings.reactMdUtils.typesSizingUseResizeObserverMod.OnResizeObserverChange
import typings.reactMdUtils.typesSizingUseResizeObserverMod.UseResizeObserverOptions
import typings.reactMdUtils.typesSizingUseWidthMediaQueryMod.WidthMediaQuery
import typings.reactMdUtils.typesSizingUseWidthMediaQueryMod.WidthMediaQuerys
import typings.reactMdUtils.typesUseEnsuredRefMod.EnsuredRefs
import typings.std.HTMLElement
import typings.std.OrientationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSizingMod {
  
  @JSImport("@react-md/utils/types/sizing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/sizing", "AppSizeContext")
  @js.native
  val AppSizeContext: Context[AppSizeinitializedboolean] = js.native
  
  inline def AppSizeListener(param0: AppSizeListenerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("AppSizeListener")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
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
  
  inline def DesktopOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("DesktopOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def MobileOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MobileOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def PhoneOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("PhoneOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def ResizeListener(param0: ResizeListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ResizeListener")(param0.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def TabletOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("TabletOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def getOrientationType(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientationType")().asInstanceOf[OrientationType]
  
  inline def toWidthPart(v: Unit, prefix: min | max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toWidthPart(v: QuerySize, prefix: min | max): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWidthPart")(v.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useAppSize(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSize")().asInstanceOf[AppSize]
  
  inline def useAppSizeMedia(): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")().asInstanceOf[AppSize]
  inline def useAppSizeMedia(param0: AppSizeOptions): AppSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useAppSizeMedia")(param0.asInstanceOf[js.Any]).asInstanceOf[AppSize]
  
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
  
  inline def useResizeListener(param0: ResizeListenerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeListener")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E]): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any]).asInstanceOf[EnsuredRefs[E]]
  inline def useResizeObserver[E /* <: HTMLElement */](onResize: OnResizeObserverChange[E], options: UseResizeObserverOptions[E]): EnsuredRefs[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnsuredRefs[E]]
  
  inline def useWidthMediaQuery(param0: WidthMediaQuery & WidthMediaQuerys): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useWidthMediaQuery")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
