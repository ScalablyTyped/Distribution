package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildOptions extends js.Object {
  
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
  implicit class BuildOptionsOps[Self <: BuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachToDOM(value: Boolean): Self = this.set("attachToDOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExtensionsVarargs(value: js.Any*): Self = this.set("dataExtensions", js.Array(value :_*))
    
    @scala.inline
    def setDataExtensions(value: js.Array[_]): Self = this.set("dataExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedPositioningEnabled(value: Boolean): Self = this.set("fixedPositioningEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyMenuInit(value: Boolean): Self = this.set("lazyMenuInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimmedIdsVarargs(value: String*): Self = this.set("trimmedIds", js.Array(value :_*))
    
    @scala.inline
    def setTrimmedIds(value: js.Array[String]): Self = this.set("trimmedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateServerRendering(value: Boolean): Self = this.set("validateServerRendering", value.asInstanceOf[js.Any])
  }
}
