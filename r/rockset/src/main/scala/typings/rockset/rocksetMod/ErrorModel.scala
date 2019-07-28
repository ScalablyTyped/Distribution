package typings.rockset.rocksetMod

import typings.rockset.rocksetStrings.ALREADYEXISTS
import typings.rockset.rocksetStrings.AUTHEXCEPTION
import typings.rockset.rocksetStrings.CONNECTION_ERROR
import typings.rockset.rocksetStrings.DEPENDENTRESOURCES
import typings.rockset.rocksetStrings.FORBIDDEN
import typings.rockset.rocksetStrings.INTEGRATION_NOT_FOUND
import typings.rockset.rocksetStrings.INTERNALERROR
import typings.rockset.rocksetStrings.INVALIDINPUT
import typings.rockset.rocksetStrings.NOTFOUND
import typings.rockset.rocksetStrings.NOTIMPLEMENTEDYET
import typings.rockset.rocksetStrings.NOT_READY
import typings.rockset.rocksetStrings.QUERY_ERROR
import typings.rockset.rocksetStrings.QUERY_TIMEOUT
import typings.rockset.rocksetStrings.RESOURCEEXCEEDED
import typings.rockset.rocksetStrings.ROLE_NOT_FOUND
import typings.rockset.rocksetStrings.VERSIONEXCEPTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorModel extends js.Object {
  // Column where the error happened (if applicable)
  var column: js.UndefOr[Double] = js.undefined
  // Line where the error happened (if applicable)
  var line: js.UndefOr[Double] = js.undefined
  // descriptive message about the error
  var message: js.UndefOr[String] = js.undefined
  // Internal trace ID to help with debugging
  var trace_id: js.UndefOr[String] = js.undefined
  // category of the error
  var `type`: js.UndefOr[
    AUTHEXCEPTION | VERSIONEXCEPTION | INTERNALERROR | INVALIDINPUT | NOTIMPLEMENTEDYET | RESOURCEEXCEEDED | ALREADYEXISTS | NOTFOUND | DEPENDENTRESOURCES | QUERY_ERROR | NOT_READY | FORBIDDEN | QUERY_TIMEOUT | INTEGRATION_NOT_FOUND | ROLE_NOT_FOUND | CONNECTION_ERROR
  ] = js.undefined
}

object ErrorModel {
  @scala.inline
  def apply(
    column: Int | Double = null,
    line: Int | Double = null,
    message: String = null,
    trace_id: String = null,
    `type`: AUTHEXCEPTION | VERSIONEXCEPTION | INTERNALERROR | INVALIDINPUT | NOTIMPLEMENTEDYET | RESOURCEEXCEEDED | ALREADYEXISTS | NOTFOUND | DEPENDENTRESOURCES | QUERY_ERROR | NOT_READY | FORBIDDEN | QUERY_TIMEOUT | INTEGRATION_NOT_FOUND | ROLE_NOT_FOUND | CONNECTION_ERROR = null
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

