package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolComponentTranslation extends js.Object {
  /**
    * A dictionary, each of whose keys is a message identifier and each of whose values is a multiformatMessageString
    * object, which holds message strings in plain text and (optionally) Markdown format. The strings can include
    * placeholders, which can be used to construct a message in combination with an arbitrary number of additional
    * string arguments. The property names are a subset of the property names in the globalMessageStrings property of
    * the toolComponent object to which this translation belongs.
    */
  var globalMessageStrings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * The location of the translation.
    */
  var location: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * Provides an array of translations for a notification descriptor in a available languages.
    */
  var notificationDescriptors: js.UndefOr[js.Array[ReportingDescriptorTranslation]] = js.undefined
  /**
    * True if this object contains a subset of the strings defined by the tool component.
    */
  var partialTranslation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Key/value pairs that provide additional information about the translationComponentTranslation.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * Provides an array of translations for a reporting descriptor in a available languages.
    */
  var reportingDescriptors: js.UndefOr[js.Array[ReportingDescriptorTranslation]] = js.undefined
  /**
    * The semantic version of the tool component for which the translation was made.
    */
  var semanticVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique identifier for the tool component in the form of a GUID, matching toolComponent.guid.
    */
  var toolComponentGuid: js.UndefOr[java.lang.String] = js.undefined
}

object ToolComponentTranslation {
  @scala.inline
  def apply(
    globalMessageStrings: org.scalablytyped.runtime.StringDictionary[MultiformatMessageString] = null,
    location: ArtifactLocation = null,
    notificationDescriptors: js.Array[ReportingDescriptorTranslation] = null,
    partialTranslation: js.UndefOr[scala.Boolean] = js.undefined,
    properties: PropertyBag = null,
    reportingDescriptors: js.Array[ReportingDescriptorTranslation] = null,
    semanticVersion: java.lang.String = null,
    toolComponentGuid: java.lang.String = null
  ): ToolComponentTranslation = {
    val __obj = js.Dynamic.literal()
    if (globalMessageStrings != null) __obj.updateDynamic("globalMessageStrings")(globalMessageStrings)
    if (location != null) __obj.updateDynamic("location")(location)
    if (notificationDescriptors != null) __obj.updateDynamic("notificationDescriptors")(notificationDescriptors)
    if (!js.isUndefined(partialTranslation)) __obj.updateDynamic("partialTranslation")(partialTranslation)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (reportingDescriptors != null) __obj.updateDynamic("reportingDescriptors")(reportingDescriptors)
    if (semanticVersion != null) __obj.updateDynamic("semanticVersion")(semanticVersion)
    if (toolComponentGuid != null) __obj.updateDynamic("toolComponentGuid")(toolComponentGuid)
    __obj.asInstanceOf[ToolComponentTranslation]
  }
}

