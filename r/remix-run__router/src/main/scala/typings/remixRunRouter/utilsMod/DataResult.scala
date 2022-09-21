package typings.remixRunRouter.utilsMod

import typings.remixRunRouter.utilsMod.ResultType.data
import typings.remixRunRouter.utilsMod.ResultType.deferred
import typings.remixRunRouter.utilsMod.ResultType.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.remixRunRouter.utilsMod.SuccessResult
  - typings.remixRunRouter.utilsMod.DeferredResult
  - typings.remixRunRouter.utilsMod.RedirectResult
  - typings.remixRunRouter.utilsMod.ErrorResult
*/
trait DataResult extends StObject
object DataResult {
  
  inline def DeferredResult(deferredData: DeferredData, `type`: deferred): typings.remixRunRouter.utilsMod.DeferredResult = {
    val __obj = js.Dynamic.literal(deferredData = deferredData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remixRunRouter.utilsMod.DeferredResult]
  }
  
  inline def ErrorResult(error: Any, `type`: error): typings.remixRunRouter.utilsMod.ErrorResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remixRunRouter.utilsMod.ErrorResult]
  }
  
  inline def RedirectResult(
    location: String,
    revalidate: Boolean,
    status: Double,
    `type`: typings.remixRunRouter.utilsMod.ResultType.redirect
  ): typings.remixRunRouter.utilsMod.RedirectResult = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], revalidate = revalidate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remixRunRouter.utilsMod.RedirectResult]
  }
  
  inline def SuccessResult(data: Any, `type`: data): typings.remixRunRouter.utilsMod.SuccessResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remixRunRouter.utilsMod.SuccessResult]
  }
}
