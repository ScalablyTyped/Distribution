package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingDescriptorReference extends js.Object {
  /**
    * A guid that uniquely identifies the descriptor.
    */
  var guid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id of the descriptor.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index into an array of descriptors in toolComponent.ruleDescriptors, toolComponent.notificationDescriptors,
    * or toolComponent.taxonomyDescriptors, depending on context.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the reporting descriptor reference.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A reference used to locate the toolComponent associated with the descriptor.
    */
  var toolComponent: js.UndefOr[ToolComponentReference] = js.undefined
}

object ReportingDescriptorReference {
  @scala.inline
  def apply(
    guid: java.lang.String = null,
    id: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    properties: PropertyBag = null,
    toolComponent: ToolComponentReference = null
  ): ReportingDescriptorReference = {
    val __obj = js.Dynamic.literal()
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (toolComponent != null) __obj.updateDynamic("toolComponent")(toolComponent)
    __obj.asInstanceOf[ReportingDescriptorReference]
  }
}

