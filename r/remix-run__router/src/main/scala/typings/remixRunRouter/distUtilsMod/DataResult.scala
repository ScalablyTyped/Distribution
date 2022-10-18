package typings.remixRunRouter.distUtilsMod

import typings.remixRunRouter.distUtilsMod.ResultType.data
import typings.remixRunRouter.distUtilsMod.ResultType.deferred
import typings.remixRunRouter.distUtilsMod.ResultType.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.remixRunRouter.distUtilsMod.SuccessResult
  - typings.remixRunRouter.distUtilsMod.DeferredResult
  - typings.remixRunRouter.distUtilsMod.RedirectResult
  - typings.remixRunRouter.distUtilsMod.ErrorResult
*/
trait DataResult extends StObject
object DataResult {
  
  inline def DeferredResult(deferredData: DeferredData, `type`: deferred): typings.remixRunRouter.distUtilsMod.DeferredResult = {
    val __obj = js.Dynamic.literal(deferredData = deferredData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remixRunRouter.distUtilsMod.DeferredResult]
  }
  
  inline def ErrorResult(error: Any, `type`: error): typings.remixRunRouter.distUtilsMod.ErrorResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remixRunRouter.distUtilsMod.ErrorResult]
  }
  
  inline def RedirectResult(
    location: String,
    revalidate: Boolean,
    status: Double,
    `type`: typings.remixRunRouter.distUtilsMod.ResultType.redirect
  ): typings.remixRunRouter.distUtilsMod.RedirectResult = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], revalidate = revalidate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remixRunRouter.distUtilsMod.RedirectResult]
  }
  
  inline def SuccessResult(data: Any, `type`: data): typings.remixRunRouter.distUtilsMod.SuccessResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remixRunRouter.distUtilsMod.SuccessResult]
  }
}
