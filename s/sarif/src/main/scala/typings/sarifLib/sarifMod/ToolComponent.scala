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

