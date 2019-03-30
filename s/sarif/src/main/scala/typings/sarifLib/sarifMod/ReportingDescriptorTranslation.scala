package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingDescriptorTranslation extends js.Object {
  /**
    * A description of the report. Should, as far as possible, provide details sufficient to enable resolution of any
    * problem indicated by the result.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.undefined
  /**
    * The unique identifier in the form of a GUID of the reporting descriptor to which this translation belongs,
    * matching reportingDescriptor.guid.
    */
  var guid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The stable, opaque identifier of the reporting descriptor to which this translation belongs, matching
    * reportingDescriptor.id.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A set of name/value pairs with arbitrary names. Each value is a multiformatMessageString object, which holds
    * message strings in plain text and (optionally) Markdown format. The property names are a subset of the property
    * names in the messageStrings property of the reportingDescriptor object to which this translation belongs.
    */
  var messageStrings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * Key/value pairs that provide additional information about reportingDescriptorTranslation.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A concise description of the report. Should be a single sentence that is understandable when visible space is
    * limited to a single line of text.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.undefined
}

object ReportingDescriptorTranslation {
  @scala.inline
  def apply(
    fullDescription: MultiformatMessageString = null,
    guid: java.lang.String = null,
    id: java.lang.String = null,
    messageStrings: org.scalablytyped.runtime.StringDictionary[MultiformatMessageString] = null,
    properties: PropertyBag = null,
    shortDescription: MultiformatMessageString = null
  ): ReportingDescriptorTranslation = {
    val __obj = js.Dynamic.literal()
    if (fullDescription != null) __obj.updateDynamic("fullDescription")(fullDescription)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (id != null) __obj.updateDynamic("id")(id)
    if (messageStrings != null) __obj.updateDynamic("messageStrings")(messageStrings)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription)
    __obj.asInstanceOf[ReportingDescriptorTranslation]
  }
}

