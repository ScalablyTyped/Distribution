package typings.serviceWorkerUpdater

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.serviceWorkerUpdater.serviceWorkerUpdaterStrings.hasUpdate
import typings.serviceWorkerUpdater.serviceWorkerUpdaterStrings.updateHandler
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("service-worker-updater", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSWUpdateChecker(): UpdateHookResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useSWUpdateChecker")().asInstanceOf[UpdateHookResult]
  inline def useSWUpdateChecker(opts: CheckOptions): UpdateHookResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useSWUpdateChecker")(opts.asInstanceOf[js.Any]).asInstanceOf[UpdateHookResult]
  
  inline def withSWUpdateChecker[P /* <: InjectedUpdateProps */](WrappedComponent: ComponentType[P]): ComponentClass[Omit[P, hasUpdate | updateHandler], ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSWUpdateChecker")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[Omit[P, hasUpdate | updateHandler], ComponentState]]
  inline def withSWUpdateChecker[P /* <: InjectedUpdateProps */](WrappedComponent: ComponentType[P], opts: CheckOptions): ComponentClass[Omit[P, hasUpdate | updateHandler], ComponentState] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSWUpdateChecker")(WrappedComponent.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ComponentClass[Omit[P, hasUpdate | updateHandler], ComponentState]]
  
  trait CheckOptions extends StObject {
    
    var checkInterval: js.UndefOr[Double] = js.undefined
    
    var updateOnLoad: js.UndefOr[Boolean] = js.undefined
  }
  object CheckOptions {
    
    inline def apply(): CheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
      
      inline def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
      
      inline def setUpdateOnLoad(value: Boolean): Self = StObject.set(x, "updateOnLoad", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnLoadUndefined: Self = StObject.set(x, "updateOnLoad", js.undefined)
    }
  }
  
  trait InjectedUpdateProps extends StObject {
    
    var hasUpdate: Boolean
    
    var updateHandler: UpdateHandler
  }
  object InjectedUpdateProps {
    
    inline def apply(hasUpdate: Boolean, updateHandler: () => Unit): InjectedUpdateProps = {
      val __obj = js.Dynamic.literal(hasUpdate = hasUpdate.asInstanceOf[js.Any], updateHandler = js.Any.fromFunction0(updateHandler))
      __obj.asInstanceOf[InjectedUpdateProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InjectedUpdateProps] (val x: Self) extends AnyVal {
      
      inline def setHasUpdate(value: Boolean): Self = StObject.set(x, "hasUpdate", value.asInstanceOf[js.Any])
      
      inline def setUpdateHandler(value: () => Unit): Self = StObject.set(x, "updateHandler", js.Any.fromFunction0(value))
    }
  }
  
  type UpdateHandler = js.Function0[Unit]
  
  type UpdateHookResult = js.Tuple2[/* hasUpdate */ Boolean, /* updateHandler */ UpdateHandler]
}
