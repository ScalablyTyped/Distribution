package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOptions extends StObject {
  
  var attachToDOM: Boolean
  
  var clientID: String
  
  var dataExtensions: js.Array[Any]
  
  var fixedPositioningEnabled: Boolean
  
  var lazyMenuInit: Boolean
  
  var trimmedIds: js.Array[String]
  
  var validateServerRendering: Boolean
}
object BuildOptions {
  
  inline def apply(
    attachToDOM: Boolean,
    clientID: String,
    dataExtensions: js.Array[Any],
    fixedPositioningEnabled: Boolean,
    lazyMenuInit: Boolean,
    trimmedIds: js.Array[String],
    validateServerRendering: Boolean
  ): BuildOptions = {
    val __obj = js.Dynamic.literal(attachToDOM = attachToDOM.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], dataExtensions = dataExtensions.asInstanceOf[js.Any], fixedPositioningEnabled = fixedPositioningEnabled.asInstanceOf[js.Any], lazyMenuInit = lazyMenuInit.asInstanceOf[js.Any], trimmedIds = trimmedIds.asInstanceOf[js.Any], validateServerRendering = validateServerRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptions]
  }
  
  extension [Self <: BuildOptions](x: Self) {
    
    inline def setAttachToDOM(value: Boolean): Self = StObject.set(x, "attachToDOM", value.asInstanceOf[js.Any])
    
    inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setDataExtensions(value: js.Array[Any]): Self = StObject.set(x, "dataExtensions", value.asInstanceOf[js.Any])
    
    inline def setDataExtensionsVarargs(value: Any*): Self = StObject.set(x, "dataExtensions", js.Array(value*))
    
    inline def setFixedPositioningEnabled(value: Boolean): Self = StObject.set(x, "fixedPositioningEnabled", value.asInstanceOf[js.Any])
    
    inline def setLazyMenuInit(value: Boolean): Self = StObject.set(x, "lazyMenuInit", value.asInstanceOf[js.Any])
    
    inline def setTrimmedIds(value: js.Array[String]): Self = StObject.set(x, "trimmedIds", value.asInstanceOf[js.Any])
    
    inline def setTrimmedIdsVarargs(value: String*): Self = StObject.set(x, "trimmedIds", js.Array(value*))
    
    inline def setValidateServerRendering(value: Boolean): Self = StObject.set(x, "validateServerRendering", value.asInstanceOf[js.Any])
  }
}
