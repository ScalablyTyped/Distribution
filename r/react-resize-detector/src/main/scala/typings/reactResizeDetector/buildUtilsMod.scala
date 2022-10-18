package typings.reactResizeDetector

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.reactResizeDetector.anon.Leading
import typings.reactResizeDetector.buildResizeDetectorMod.ReactResizeDetectorDimensions
import typings.reactResizeDetector.reactResizeDetectorStrings.debounce
import typings.reactResizeDetector.reactResizeDetectorStrings.throttle
import typings.std.ResizeObserverCallback
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsMod {
  
  @JSImport("react-resize-detector/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNotifier(
    onResize: js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], Unit],
    setSize: Dispatch[SetStateAction[ReactResizeDetectorDimensions]],
    handleWidth: Boolean,
    handleHeight: Boolean
  ): js.Function1[/* hasWidthHeight */ ReactResizeDetectorDimensions, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotifier")(onResize.asInstanceOf[js.Any], setSize.asInstanceOf[js.Any], handleWidth.asInstanceOf[js.Any], handleHeight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* hasWidthHeight */ ReactResizeDetectorDimensions, Unit]]
  inline def createNotifier(
    onResize: Unit,
    setSize: Dispatch[SetStateAction[ReactResizeDetectorDimensions]],
    handleWidth: Boolean,
    handleHeight: Boolean
  ): js.Function1[/* hasWidthHeight */ ReactResizeDetectorDimensions, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotifier")(onResize.asInstanceOf[js.Any], setSize.asInstanceOf[js.Any], handleWidth.asInstanceOf[js.Any], handleHeight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* hasWidthHeight */ ReactResizeDetectorDimensions, Unit]]
  
  inline def isDOMElement(element: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(fn: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(fn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSSR(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSSR")().asInstanceOf[Boolean]
  
  inline def patchResizeHandler(resizeCallback: ResizeObserverCallback): patchResizeHandlerType = ^.asInstanceOf[js.Dynamic].applyDynamic("patchResizeHandler")(resizeCallback.asInstanceOf[js.Any]).asInstanceOf[patchResizeHandlerType]
  inline def patchResizeHandler(resizeCallback: ResizeObserverCallback, refreshMode: throttle | debounce): patchResizeHandlerType = (^.asInstanceOf[js.Dynamic].applyDynamic("patchResizeHandler")(resizeCallback.asInstanceOf[js.Any], refreshMode.asInstanceOf[js.Any])).asInstanceOf[patchResizeHandlerType]
  inline def patchResizeHandler(resizeCallback: ResizeObserverCallback, refreshMode: throttle | debounce, refreshRate: Double): patchResizeHandlerType = (^.asInstanceOf[js.Dynamic].applyDynamic("patchResizeHandler")(resizeCallback.asInstanceOf[js.Any], refreshMode.asInstanceOf[js.Any], refreshRate.asInstanceOf[js.Any])).asInstanceOf[patchResizeHandlerType]
  inline def patchResizeHandler(
    resizeCallback: ResizeObserverCallback,
    refreshMode: throttle | debounce,
    refreshRate: Double,
    refreshOptions: Leading
  ): patchResizeHandlerType = (^.asInstanceOf[js.Dynamic].applyDynamic("patchResizeHandler")(resizeCallback.asInstanceOf[js.Any], refreshMode.asInstanceOf[js.Any], refreshRate.asInstanceOf[js.Any], refreshOptions.asInstanceOf[js.Any])).asInstanceOf[patchResizeHandlerType]
  inline def patchResizeHandler(
    resizeCallback: ResizeObserverCallback,
    refreshMode: throttle | debounce,
    refreshRate: Unit,
    refreshOptions: Leading
  ): patchResizeHandlerType = (^.asInstanceOf[js.Dynamic].applyDynamic("patchResizeHandler")(resizeCallback.asInstanceOf[js.Any], refreshMode.asInstanceOf[js.Any], refreshRate.asInstanceOf[js.Any], refreshOptions.asInstanceOf[js.Any])).asInstanceOf[patchResizeHandlerType]
  inline def patchResizeHandler(resizeCallback: ResizeObserverCallback, refreshMode: Unit, refreshRate: Double): patchResizeHandlerType = (^.asInstanceOf[js.Dynamic].applyDynamic("patchResizeHandler")(resizeCallback.asInstanceOf[js.Any], refreshMode.asInstanceOf[js.Any], refreshRate.asInstanceOf[js.Any])).asInstanceOf[patchResizeHandlerType]
  inline def patchResizeHandler(
    resizeCallback: ResizeObserverCallback,
    refreshMode: Unit,
    refreshRate: Double,
    refreshOptions: Leading
  ): patchResizeHandlerType = (^.asInstanceOf[js.Dynamic].applyDynamic("patchResizeHandler")(resizeCallback.asInstanceOf[js.Any], refreshMode.asInstanceOf[js.Any], refreshRate.asInstanceOf[js.Any], refreshOptions.asInstanceOf[js.Any])).asInstanceOf[patchResizeHandlerType]
  inline def patchResizeHandler(
    resizeCallback: ResizeObserverCallback,
    refreshMode: Unit,
    refreshRate: Unit,
    refreshOptions: Leading
  ): patchResizeHandlerType = (^.asInstanceOf[js.Dynamic].applyDynamic("patchResizeHandler")(resizeCallback.asInstanceOf[js.Any], refreshMode.asInstanceOf[js.Any], refreshRate.asInstanceOf[js.Any], refreshOptions.asInstanceOf[js.Any])).asInstanceOf[patchResizeHandlerType]
  
  type patchResizeHandlerType = (ReturnType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof debounce */ Any
  ]) | ResizeObserverCallback
}
