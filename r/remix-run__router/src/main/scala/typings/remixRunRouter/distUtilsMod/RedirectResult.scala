package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectResult
  extends StObject
     with DataResult {
  
  var location: String
  
  var revalidate: Boolean
  
  var status: Double
  
  var `type`: typings.remixRunRouter.distUtilsMod.ResultType.redirect
}
object RedirectResult {
  
  inline def apply(
    location: String,
    revalidate: Boolean,
    status: Double,
    `type`: typings.remixRunRouter.distUtilsMod.ResultType.redirect
  ): RedirectResult = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], revalidate = revalidate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectResult]
  }
  
  extension [Self <: RedirectResult](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setRevalidate(value: Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.remixRunRouter.distUtilsMod.ResultType.redirect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
