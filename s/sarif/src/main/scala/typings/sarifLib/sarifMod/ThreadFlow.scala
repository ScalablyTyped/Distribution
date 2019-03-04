package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadFlow extends js.Object {
  /**
    * An string that uniquely identifies the threadFlow within the codeFlow in which it occurs.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A temporally ordered array of 'threadFlowLocation' objects, each of which describes a location visited by the
    * tool while producing the result.
    */
  var locations: js.Array[ThreadFlowLocation]
  /**
    * A message relevant to the thread flow.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the thread flow.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object ThreadFlow {
  @scala.inline
  def apply(
    locations: js.Array[ThreadFlowLocation],
    id: java.lang.String = null,
    message: Message = null,
    properties: PropertyBag = null
  ): ThreadFlow = {
    val __obj = js.Dynamic.literal(locations = locations)
    if (id != null) __obj.updateDynamic("id")(id)
    if (message != null) __obj.updateDynamic("message")(message)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ThreadFlow]
  }
}

