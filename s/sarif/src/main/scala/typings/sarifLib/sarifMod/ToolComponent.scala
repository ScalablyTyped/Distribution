package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolComponent extends js.Object {
  /**
    * The index within the run artifacts array of the artifact object associated with the component.
    */
  var artifactIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The binary version of the component's primary executable file expressed as four non-negative integers separated
    * by a period (for operating systems that express file versions in this way).
    */
  var dottedQuadFileVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute URI from which the component can be downloaded.
    */
  var downloadUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the component along with its version and any other useful identifying information, such as its
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
    * The name of the component.
    */
  var name: java.lang.String
  /**
    * An array of reportDescriptor objects relevant to the notifications related to the configuration and runtime
    * execution of the component.
    */
  var notificationDescriptors: js.UndefOr[js.Array[ReportingDescriptor]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the component.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of reportDescriptor objects relevant to the analysis performed by the component.
    */
  var ruleDescriptors: js.UndefOr[js.Array[ReportingDescriptor]] = js.undefined
  /**
    * The component version in the format specified by Semantic Versioning 2.0.
    */
  var semanticVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The component version, in whatever format the component natively provides.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ToolComponent {
  @scala.inline
  def apply(
    name: java.lang.String,
    artifactIndex: scala.Int | scala.Double = null,
    dottedQuadFileVersion: java.lang.String = null,
    downloadUri: java.lang.String = null,
    fullName: java.lang.String = null,
    globalMessageStrings: org.scalablytyped.runtime.StringDictionary[MultiformatMessageString] = null,
    notificationDescriptors: js.Array[ReportingDescriptor] = null,
    properties: PropertyBag = null,
    ruleDescriptors: js.Array[ReportingDescriptor] = null,
    semanticVersion: java.lang.String = null,
    version: java.lang.String = null
  ): ToolComponent = {
    val __obj = js.Dynamic.literal(name = name)
    if (artifactIndex != null) __obj.updateDynamic("artifactIndex")(artifactIndex.asInstanceOf[js.Any])
    if (dottedQuadFileVersion != null) __obj.updateDynamic("dottedQuadFileVersion")(dottedQuadFileVersion)
    if (downloadUri != null) __obj.updateDynamic("downloadUri")(downloadUri)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (globalMessageStrings != null) __obj.updateDynamic("globalMessageStrings")(globalMessageStrings)
    if (notificationDescriptors != null) __obj.updateDynamic("notificationDescriptors")(notificationDescriptors)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (ruleDescriptors != null) __obj.updateDynamic("ruleDescriptors")(ruleDescriptors)
    if (semanticVersion != null) __obj.updateDynamic("semanticVersion")(semanticVersion)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ToolComponent]
  }
}

