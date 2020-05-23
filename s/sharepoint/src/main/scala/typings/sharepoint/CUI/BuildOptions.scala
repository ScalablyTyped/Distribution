package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptions extends js.Object {
  var attachToDOM: Boolean
  var clientID: String
  var dataExtensions: js.Array[_]
  var fixedPositioningEnabled: Boolean
  var lazyMenuInit: Boolean
  var trimmedIds: js.Array[String]
  var validateServerRendering: Boolean
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
}

