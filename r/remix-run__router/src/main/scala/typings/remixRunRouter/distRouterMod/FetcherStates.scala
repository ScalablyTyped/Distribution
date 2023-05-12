package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.anon.Data
import typings.remixRunRouter.anon.FormAction
import typings.remixRunRouter.anon.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Potential states for fetchers
  */
trait FetcherStates[TData] extends StObject {
  
  var Idle: Data[TData]
  
  var Loading: FormAction[TData]
  
  var Submitting: FormData[TData]
}
object FetcherStates {
  
  inline def apply[TData](Idle: Data[TData], Loading: FormAction[TData], Submitting: FormData[TData]): FetcherStates[TData] = {
    val __obj = js.Dynamic.literal(Idle = Idle.asInstanceOf[js.Any], Loading = Loading.asInstanceOf[js.Any], Submitting = Submitting.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetcherStates[TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetcherStates[?], TData] (val x: Self & FetcherStates[TData]) extends AnyVal {
    
    inline def setIdle(value: Data[TData]): Self = StObject.set(x, "Idle", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: FormAction[TData]): Self = StObject.set(x, "Loading", value.asInstanceOf[js.Any])
    
    inline def setSubmitting(value: FormData[TData]): Self = StObject.set(x, "Submitting", value.asInstanceOf[js.Any])
  }
}
