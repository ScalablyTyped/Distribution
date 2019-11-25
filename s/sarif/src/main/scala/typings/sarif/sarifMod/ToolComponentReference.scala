package typings.sarif.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolComponentReference extends js.Object {
  /**
    * The 'guid' property of the referenced toolComponent.
    */
  var guid: js.UndefOr[String] = js.undefined
  /**
    * An index into the referenced toolComponent in tool.extensions.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * The 'name' property of the referenced toolComponent.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the toolComponentReference.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object ToolComponentReference {
  @scala.inline
  def apply(
    guid: String = null,
    index: Int | Double = null,
    name: String = null,
    properties: PropertyBag = null
  ): ToolComponentReference = {
    val __obj = js.Dynamic.literal()
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolComponentReference]
  }
}

