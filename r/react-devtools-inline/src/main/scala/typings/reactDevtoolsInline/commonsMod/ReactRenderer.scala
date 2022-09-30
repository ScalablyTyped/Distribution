package typings.reactDevtoolsInline.commonsMod

import typings.reactReconciler.mod.Fiber
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactRenderer extends StObject {
  
  /** Uniquely identifies React DOM v15. */
  var ComponentTree: js.UndefOr[Any] = js.undefined
  
  /** Present for React DOM v12 (possibly earlier) through v15. */
  var Mount: js.UndefOr[Any] = js.undefined
  
  var bundleType: BundleType
  
  /** Only injected by React v16.8+ in order to support hooks inspection. */
  var currentDispatcherRef: js.UndefOr[CurrentDispatcherRef] = js.undefined
  
  def findFiberByHostInstance(hostInstance: NativeType): Fiber | Null
  
  /**
    * Only injected by React v16.9+ in DEV mode.
    * Enables DevTools to append owners-only component stack to error messages.
    */
  var getCurrentFiber: js.UndefOr[js.Function0[Fiber | Null]] = js.undefined
  
  var getLaneLabelMap: js.UndefOr[js.Function0[(Map[Double, String]) | Null]] = js.undefined
  
  /**
    * 18.0+
    */
  var injectProfilingHooks: js.UndefOr[js.Function1[/* profilingHooks */ DevToolsProfilingHooks, Unit]] = js.undefined
  
  /** 16.9+ */
  var overrideHookState: js.UndefOr[
    (js.Function4[
      /* fiber */ Record[String, Any], 
      /* id */ Double, 
      /* path */ js.Array[String | Double], 
      /* value */ Any, 
      Unit
    ]) | Null
  ] = js.undefined
  
  /** 17+ */
  var overrideHookStateDeletePath: js.UndefOr[
    (js.Function3[
      /* fiber */ Record[String, Any], 
      /* id */ Double, 
      /* path */ js.Array[String | Double], 
      Unit
    ]) | Null
  ] = js.undefined
  
  /** 17+ */
  var overrideHookStateRenamePath: js.UndefOr[
    (js.Function4[
      /* fiber */ Record[String, Any], 
      /* id */ Double, 
      /* oldPath */ js.Array[String | Double], 
      /* newPath */ js.Array[String | Double], 
      Unit
    ]) | Null
  ] = js.undefined
  
  /** 16.7+ */
  var overrideProps: js.UndefOr[
    (js.Function3[
      /* fiber */ Record[String, Any], 
      /* path */ js.Array[String | Double], 
      /* value */ Any, 
      Unit
    ]) | Null
  ] = js.undefined
  
  /** 17+ */
  var overridePropsDeletePath: js.UndefOr[
    (js.Function2[/* fiber */ Record[String, Any], /* path */ js.Array[String | Double], Unit]) | Null
  ] = js.undefined
  
  /** 17+ */
  var overridePropsRenamePath: js.UndefOr[
    (js.Function3[
      /* fiber */ Record[String, Any], 
      /* oldPath */ js.Array[String | Double], 
      /* newPath */ js.Array[String | Double], 
      Unit
    ]) | Null
  ] = js.undefined
  
  /** 17.0.2+ */
  var reconcilerVersion: js.UndefOr[String] = js.undefined
  
  var rendererPackageName: String
  
  /**
    * Intentionally opaque type to avoid coupling DevTools to different Fast Refresh versions.
    */
  var scheduleRefresh: js.UndefOr[AnyFn] = js.undefined
  
  /** 16.9+ */
  var scheduleUpdate: js.UndefOr[(js.Function1[/* fiber */ Record[String, Any], Unit]) | Null] = js.undefined
  
  /** Only injected by React v17.0.3+ in DEV mode */
  var setErrorHandler: js.UndefOr[
    (js.Function1[
      /* shouldError */ js.Function1[/* fiber */ Record[String, Any], js.UndefOr[Boolean | Null]], 
      Unit
    ]) | Null
  ] = js.undefined
  
  def setRefreshHandler(fn: AnyFn): Unit
  
  var setSuspenseHandler: js.UndefOr[
    (js.Function1[/* shouldSuspend */ js.Function1[/* fiber */ Record[String, Any], Boolean], Unit]) | Null
  ] = js.undefined
  
  var version: String
}
object ReactRenderer {
  
  inline def apply(
    bundleType: BundleType,
    findFiberByHostInstance: NativeType => Fiber | Null,
    rendererPackageName: String,
    setRefreshHandler: AnyFn => Unit,
    version: String
  ): ReactRenderer = {
    val __obj = js.Dynamic.literal(bundleType = bundleType.asInstanceOf[js.Any], findFiberByHostInstance = js.Any.fromFunction1(findFiberByHostInstance), rendererPackageName = rendererPackageName.asInstanceOf[js.Any], setRefreshHandler = js.Any.fromFunction1(setRefreshHandler), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactRenderer]
  }
  
  extension [Self <: ReactRenderer](x: Self) {
    
    inline def setBundleType(value: BundleType): Self = StObject.set(x, "bundleType", value.asInstanceOf[js.Any])
    
    inline def setComponentTree(value: Any): Self = StObject.set(x, "ComponentTree", value.asInstanceOf[js.Any])
    
    inline def setComponentTreeUndefined: Self = StObject.set(x, "ComponentTree", js.undefined)
    
    inline def setCurrentDispatcherRef(value: CurrentDispatcherRef): Self = StObject.set(x, "currentDispatcherRef", value.asInstanceOf[js.Any])
    
    inline def setCurrentDispatcherRefUndefined: Self = StObject.set(x, "currentDispatcherRef", js.undefined)
    
    inline def setFindFiberByHostInstance(value: NativeType => Fiber | Null): Self = StObject.set(x, "findFiberByHostInstance", js.Any.fromFunction1(value))
    
    inline def setGetCurrentFiber(value: () => Fiber | Null): Self = StObject.set(x, "getCurrentFiber", js.Any.fromFunction0(value))
    
    inline def setGetCurrentFiberUndefined: Self = StObject.set(x, "getCurrentFiber", js.undefined)
    
    inline def setGetLaneLabelMap(value: () => (Map[Double, String]) | Null): Self = StObject.set(x, "getLaneLabelMap", js.Any.fromFunction0(value))
    
    inline def setGetLaneLabelMapUndefined: Self = StObject.set(x, "getLaneLabelMap", js.undefined)
    
    inline def setInjectProfilingHooks(value: /* profilingHooks */ DevToolsProfilingHooks => Unit): Self = StObject.set(x, "injectProfilingHooks", js.Any.fromFunction1(value))
    
    inline def setInjectProfilingHooksUndefined: Self = StObject.set(x, "injectProfilingHooks", js.undefined)
    
    inline def setMount(value: Any): Self = StObject.set(x, "Mount", value.asInstanceOf[js.Any])
    
    inline def setMountUndefined: Self = StObject.set(x, "Mount", js.undefined)
    
    inline def setOverrideHookState(
      value: (/* fiber */ Record[String, Any], /* id */ Double, /* path */ js.Array[String | Double], /* value */ Any) => Unit
    ): Self = StObject.set(x, "overrideHookState", js.Any.fromFunction4(value))
    
    inline def setOverrideHookStateDeletePath(
      value: (/* fiber */ Record[String, Any], /* id */ Double, /* path */ js.Array[String | Double]) => Unit
    ): Self = StObject.set(x, "overrideHookStateDeletePath", js.Any.fromFunction3(value))
    
    inline def setOverrideHookStateDeletePathNull: Self = StObject.set(x, "overrideHookStateDeletePath", null)
    
    inline def setOverrideHookStateDeletePathUndefined: Self = StObject.set(x, "overrideHookStateDeletePath", js.undefined)
    
    inline def setOverrideHookStateNull: Self = StObject.set(x, "overrideHookState", null)
    
    inline def setOverrideHookStateRenamePath(
      value: (/* fiber */ Record[String, Any], /* id */ Double, /* oldPath */ js.Array[String | Double], /* newPath */ js.Array[String | Double]) => Unit
    ): Self = StObject.set(x, "overrideHookStateRenamePath", js.Any.fromFunction4(value))
    
    inline def setOverrideHookStateRenamePathNull: Self = StObject.set(x, "overrideHookStateRenamePath", null)
    
    inline def setOverrideHookStateRenamePathUndefined: Self = StObject.set(x, "overrideHookStateRenamePath", js.undefined)
    
    inline def setOverrideHookStateUndefined: Self = StObject.set(x, "overrideHookState", js.undefined)
    
    inline def setOverrideProps(
      value: (/* fiber */ Record[String, Any], /* path */ js.Array[String | Double], /* value */ Any) => Unit
    ): Self = StObject.set(x, "overrideProps", js.Any.fromFunction3(value))
    
    inline def setOverridePropsDeletePath(value: (/* fiber */ Record[String, Any], /* path */ js.Array[String | Double]) => Unit): Self = StObject.set(x, "overridePropsDeletePath", js.Any.fromFunction2(value))
    
    inline def setOverridePropsDeletePathNull: Self = StObject.set(x, "overridePropsDeletePath", null)
    
    inline def setOverridePropsDeletePathUndefined: Self = StObject.set(x, "overridePropsDeletePath", js.undefined)
    
    inline def setOverridePropsNull: Self = StObject.set(x, "overrideProps", null)
    
    inline def setOverridePropsRenamePath(
      value: (/* fiber */ Record[String, Any], /* oldPath */ js.Array[String | Double], /* newPath */ js.Array[String | Double]) => Unit
    ): Self = StObject.set(x, "overridePropsRenamePath", js.Any.fromFunction3(value))
    
    inline def setOverridePropsRenamePathNull: Self = StObject.set(x, "overridePropsRenamePath", null)
    
    inline def setOverridePropsRenamePathUndefined: Self = StObject.set(x, "overridePropsRenamePath", js.undefined)
    
    inline def setOverridePropsUndefined: Self = StObject.set(x, "overrideProps", js.undefined)
    
    inline def setReconcilerVersion(value: String): Self = StObject.set(x, "reconcilerVersion", value.asInstanceOf[js.Any])
    
    inline def setReconcilerVersionUndefined: Self = StObject.set(x, "reconcilerVersion", js.undefined)
    
    inline def setRendererPackageName(value: String): Self = StObject.set(x, "rendererPackageName", value.asInstanceOf[js.Any])
    
    inline def setScheduleRefresh(value: AnyFn): Self = StObject.set(x, "scheduleRefresh", value.asInstanceOf[js.Any])
    
    inline def setScheduleRefreshUndefined: Self = StObject.set(x, "scheduleRefresh", js.undefined)
    
    inline def setScheduleUpdate(value: /* fiber */ Record[String, Any] => Unit): Self = StObject.set(x, "scheduleUpdate", js.Any.fromFunction1(value))
    
    inline def setScheduleUpdateNull: Self = StObject.set(x, "scheduleUpdate", null)
    
    inline def setScheduleUpdateUndefined: Self = StObject.set(x, "scheduleUpdate", js.undefined)
    
    inline def setSetErrorHandler(
      value: /* shouldError */ js.Function1[/* fiber */ Record[String, Any], js.UndefOr[Boolean | Null]] => Unit
    ): Self = StObject.set(x, "setErrorHandler", js.Any.fromFunction1(value))
    
    inline def setSetErrorHandlerNull: Self = StObject.set(x, "setErrorHandler", null)
    
    inline def setSetErrorHandlerUndefined: Self = StObject.set(x, "setErrorHandler", js.undefined)
    
    inline def setSetRefreshHandler(value: AnyFn => Unit): Self = StObject.set(x, "setRefreshHandler", js.Any.fromFunction1(value))
    
    inline def setSetSuspenseHandler(value: /* shouldSuspend */ js.Function1[/* fiber */ Record[String, Any], Boolean] => Unit): Self = StObject.set(x, "setSuspenseHandler", js.Any.fromFunction1(value))
    
    inline def setSetSuspenseHandlerNull: Self = StObject.set(x, "setSuspenseHandler", null)
    
    inline def setSetSuspenseHandlerUndefined: Self = StObject.set(x, "setSuspenseHandler", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
