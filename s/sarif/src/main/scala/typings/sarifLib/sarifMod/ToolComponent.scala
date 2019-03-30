package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolComponent extends js.Object {
  /**
    * The indices within the run artifacts array of the artifact objects associated with the tool component.
    */
  var artifactIndices: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The binary version of the tool component's primary executable file expressed as four non-negative integers
    * separated by a period (for operating systems that express file versions in this way).
    */
  var dottedQuadFileVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute URI from which the tool component can be downloaded.
    */
  var downloadUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A comprehensive description of the tool component.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.undefined
  /**
    * The name of the tool component along with its version and any other useful identifying information, such as its
    * locale.
    */
  var fullName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A dictionary, each of whose keys is a resource identifier and each of whose values is a multiformatMessageString
    * object, which holds message strings in plain text and (optionally) Markdown format. The strings can include
    * placeholders, which can be used to construct a message in combination with an arbitrary number of additional
    * string arguments.
    */
  var globalMessageStrings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * A unique identifer for the tool component in the form of a GUID.
    */
  var guid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the tool component.
    */
  var name: java.lang.String
  /**
    * An array of reportDescriptor objects relevant to the notifications related to the configuration and runtime
    * execution of the tool component.
    */
  var notificationDescriptors: js.UndefOr[js.Array[ReportingDescriptor]] = js.undefined
  /**
    * The organization or company that produced the tool component.
    */
  var organization: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A product suite to which the tool component belongs.
    */
  var product: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the tool component.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of reportDescriptor objects relevant to the analysis performed by the tool component.
    */
  var ruleDescriptors: js.UndefOr[js.Array[ReportingDescriptor]] = js.undefined
  /**
    * The tool component version in the format specified by Semantic Versioning 2.0.
    */
  var semanticVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A brief description of the tool component.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.undefined
  /**
    * The tool component version, in whatever format the component natively provides.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ToolComponent {
  @scala.inline
  def apply(
    name: java.lang.String,
    artifactIndices: js.Array[scala.Double] = null,
    dottedQuadFileVersion: java.lang.String = null,
    downloadUri: java.lang.String = null,
    fullDescription: MultiformatMessageString = null,
    fullName: java.lang.String = null,
    globalMessageStrings: org.scalablytyped.runtime.StringDictionary[MultiformatMessageString] = null,
    guid: java.lang.String = null,
    notificationDescriptors: js.Array[ReportingDescriptor] = null,
    organization: java.lang.String = null,
    product: java.lang.String = null,
    properties: PropertyBag = null,
    ruleDescriptors: js.Array[ReportingDescriptor] = null,
    semanticVersion: java.lang.String = null,
    shortDescription: MultiformatMessageString = null,
    version: java.lang.String = null
  ): ToolComponent = {
    val __obj = js.Dynamic.literal(name = name)
    if (artifactIndices != null) __obj.updateDynamic("artifactIndices")(artifactIndices)
    if (dottedQuadFileVersion != null) __obj.updateDynamic("dottedQuadFileVersion")(dottedQuadFileVersion)
    if (downloadUri != null) __obj.updateDynamic("downloadUri")(downloadUri)
    if (fullDescription != null) __obj.updateDynamic("fullDescription")(fullDescription)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (globalMessageStrings != null) __obj.updateDynamic("globalMessageStrings")(globalMessageStrings)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (notificationDescriptors != null) __obj.updateDynamic("notificationDescriptors")(notificationDescriptors)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (product != null) __obj.updateDynamic("product")(product)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (ruleDescriptors != null) __obj.updateDynamic("ruleDescriptors")(ruleDescriptors)
    if (semanticVersion != null) __obj.updateDynamic("semanticVersion")(semanticVersion)
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ToolComponent]
  }
}

