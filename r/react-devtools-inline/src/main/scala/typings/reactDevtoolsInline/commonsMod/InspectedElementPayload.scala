package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.`unknown-hook`
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.uncaught
import typings.reactDevtoolsInline.reactDevtoolsInlineStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactDevtoolsInline.commonsMod.InspectElementError
  - typings.reactDevtoolsInline.commonsMod.InspectElementFullData
  - typings.reactDevtoolsInline.commonsMod.InspectElementHydratedPath
  - typings.reactDevtoolsInline.commonsMod.InspectElementNoChange
  - typings.reactDevtoolsInline.commonsMod.InspectElementNotFound
*/
trait InspectedElementPayload extends StObject
object InspectedElementPayload {
  
  inline def InspectElementError(errorType: user | `unknown-hook` | uncaught, id: Double, message: String, responseID: Double): typings.reactDevtoolsInline.commonsMod.InspectElementError = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typings.reactDevtoolsInline.commonsMod.InspectElementError]
  }
  
  inline def InspectElementFullData(id: Double, responseID: Double, value: InspectedElement): typings.reactDevtoolsInline.commonsMod.InspectElementFullData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("full-data")
    __obj.asInstanceOf[typings.reactDevtoolsInline.commonsMod.InspectElementFullData]
  }
  
  inline def InspectElementHydratedPath(id: Double, path: js.Array[String | Double], responseID: Double, value: Any): typings.reactDevtoolsInline.commonsMod.InspectElementHydratedPath = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hydrated-path")
    __obj.asInstanceOf[typings.reactDevtoolsInline.commonsMod.InspectElementHydratedPath]
  }
  
  inline def InspectElementNoChange(id: Double, responseID: Double): typings.reactDevtoolsInline.commonsMod.InspectElementNoChange = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("no-change")
    __obj.asInstanceOf[typings.reactDevtoolsInline.commonsMod.InspectElementNoChange]
  }
  
  inline def InspectElementNotFound(id: Double, responseID: Double): typings.reactDevtoolsInline.commonsMod.InspectElementNotFound = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("not-found")
    __obj.asInstanceOf[typings.reactDevtoolsInline.commonsMod.InspectElementNotFound]
  }
}
