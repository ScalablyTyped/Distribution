package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildOptions extends StObject {
  
  var attachToDOM: Boolean = js.native
  
  var clientID: String = js.native
  
  var dataExtensions: js.Array[_] = js.native
  
  var fixedPositioningEnabled: Boolean = js.native
  
  var lazyMenuInit: Boolean = js.native
  
  var trimmedIds: js.Array[String] = js.native
  
  var validateServerRendering: Boolean = js.native
}
object BuildOptions {
  
  @scala.inline
  def apply(
    attachToDOM: Boolean,
    clientID: String,
    dataExtensions: js.Array[_],
    fixedPositioningEnabled: Boolean,
    lazyMenuInit: Boolean,
    trimmedIds: js.Array[String],
    validateServerRendering: Boolean
  ): BuildOptions = {
    val __obj = js.Dynamic.literal(attachToDOM = attachToDOM.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], dataExtensions = dataExtensions.asInstanceOf[js.Any], fixedPositioningEnabled = fixedPositioningEnabled.asInstanceOf[js.Any], lazyMenuInit = lazyMenuInit.asInstanceOf[js.Any], trimmedIds = trimmedIds.asInstanceOf[js.Any], validateServerRendering = validateServerRendering.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptions]
  }
  
  @scala.inline
  implicit class BuildOptionsMutableBuilder[Self <: BuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachToDOM(value: Boolean): Self = StObject.set(x, "attachToDOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExtensions(value: js.Array[_]): Self = StObject.set(x, "dataExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExtensionsVarargs(value: js.Any*): Self = StObject.set(x, "dataExtensions", js.Array(value :_*))
    
    @scala.inline
    def setFixedPositioningEnabled(value: Boolean): Self = StObject.set(x, "fixedPositioningEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyMenuInit(value: Boolean): Self = StObject.set(x, "lazyMenuInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimmedIds(value: js.Array[String]): Self = StObject.set(x, "trimmedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimmedIdsVarargs(value: String*): Self = StObject.set(x, "trimmedIds", js.Array(value :_*))
    
    @scala.inline
    def setValidateServerRendering(value: Boolean): Self = StObject.set(x, "validateServerRendering", value.asInstanceOf[js.Any])
  }
}
