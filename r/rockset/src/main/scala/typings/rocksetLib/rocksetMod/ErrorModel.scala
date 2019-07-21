package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorModel extends js.Object {
  // Column where the error happened (if applicable)
  var column: js.UndefOr[scala.Double] = js.undefined
  // Line where the error happened (if applicable)
  var line: js.UndefOr[scala.Double] = js.undefined
  // descriptive message about the error
  var message: js.UndefOr[java.lang.String] = js.undefined
  // Internal trace ID to help with debugging
  var trace_id: js.UndefOr[java.lang.String] = js.undefined
  // category of the error
  var `type`: js.UndefOr[
    rocksetLib.rocksetLibStrings.AUTHEXCEPTION | rocksetLib.rocksetLibStrings.VERSIONEXCEPTION | rocksetLib.rocksetLibStrings.INTERNALERROR | rocksetLib.rocksetLibStrings.INVALIDINPUT | rocksetLib.rocksetLibStrings.NOTIMPLEMENTEDYET | rocksetLib.rocksetLibStrings.RESOURCEEXCEEDED | rocksetLib.rocksetLibStrings.ALREADYEXISTS | rocksetLib.rocksetLibStrings.NOTFOUND | rocksetLib.rocksetLibStrings.DEPENDENTRESOURCES | rocksetLib.rocksetLibStrings.QUERY_ERROR | rocksetLib.rocksetLibStrings.NOT_READY | rocksetLib.rocksetLibStrings.FORBIDDEN | rocksetLib.rocksetLibStrings.QUERY_TIMEOUT | rocksetLib.rocksetLibStrings.INTEGRATION_NOT_FOUND | rocksetLib.rocksetLibStrings.ROLE_NOT_FOUND | rocksetLib.rocksetLibStrings.CONNECTION_ERROR
  ] = js.undefined
}

object ErrorModel {
  @scala.inline
  def apply(
    column: scala.Int | scala.Double = null,
    line: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    trace_id: java.lang.String = null,
    `type`: rocksetLib.rocksetLibStrings.AUTHEXCEPTION | rocksetLib.rocksetLibStrings.VERSIONEXCEPTION | rocksetLib.rocksetLibStrings.INTERNALERROR | rocksetLib.rocksetLibStrings.INVALIDINPUT | rocksetLib.rocksetLibStrings.NOTIMPLEMENTEDYET | rocksetLib.rocksetLibStrings.RESOURCEEXCEEDED | rocksetLib.rocksetLibStrings.ALREADYEXISTS | rocksetLib.rocksetLibStrings.NOTFOUND | rocksetLib.rocksetLibStrings.DEPENDENTRESOURCES | rocksetLib.rocksetLibStrings.QUERY_ERROR | rocksetLib.rocksetLibStrings.NOT_READY | rocksetLib.rocksetLibStrings.FORBIDDEN | rocksetLib.rocksetLibStrings.QUERY_TIMEOUT | rocksetLib.rocksetLibStrings.INTEGRATION_NOT_FOUND | rocksetLib.rocksetLibStrings.ROLE_NOT_FOUND | rocksetLib.rocksetLibStrings.CONNECTION_ERROR = null
  ): ErrorModel = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (trace_id != null) __obj.updateDynamic("trace_id")(trace_id)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorModel]
  }
}

