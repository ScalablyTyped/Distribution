package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportingDescriptor extends js.Object {
  /**
    * Default reporting configuration information.
    */
  var defaultConfiguration: js.UndefOr[ReportingConfiguration] = js.undefined
  /**
    * An array of unique identifies in the form of a GUID by which this report was known in some previous version of
    * the analysis tool.
    */
  var deprecatedGuids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An array of stable, opaque identifiers by which this report was known in some previous version of the analysis
    * tool.
    */
  var deprecatedIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An array of readable identifiers by which this report was known in some previous version of the analysis tool.
    */
  var deprecatedNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A description of the report. Should, as far as possible, provide details sufficient to enable resolution of any
    * problem indicated by the result.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.undefined
  /**
    * A unique identifer for the reporting descriptor in the form of a GUID.
    */
  var guid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provides the primary documentation for the report, useful when there is no online documentation.
    */
  var help: js.UndefOr[MultiformatMessageString] = js.undefined
  /**
    * A URI where the primary documentation for the report can be found.
    */
  var helpUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A stable, opaque identifier for the report.
    */
  var id: java.lang.String
  /**
    * A set of name/value pairs with arbitrary names. Each value is a multiformatMessageString object, which holds
    * message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can
    * be used to construct a message in combination with an arbitrary number of additional string arguments.
    */
  var messageStrings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * A report identifier that is understandable to an end user.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the report.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of objects that describe relationships between this reporting descriptor and others.
    */
  var relationships: js.UndefOr[js.Array[ReportingDescriptorRelationship]] = js.undefined
  /**
    * A concise description of the report. Should be a single sentence that is understandable when visible space is
    * limited to a single line of text.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.undefined
}

object ReportingDescriptor {
  @scala.inline
  def apply(
    id: java.lang.String,
    defaultConfiguration: ReportingConfiguration = null,
    deprecatedGuids: js.Array[java.lang.String] = null,
    deprecatedIds: js.Array[java.lang.String] = null,
    deprecatedNames: js.Array[java.lang.String] = null,
    fullDescription: MultiformatMessageString = null,
    guid: java.lang.String = null,
    help: MultiformatMessageString = null,
    helpUri: java.lang.String = null,
    messageStrings: org.scalablytyped.runtime.StringDictionary[MultiformatMessageString] = null,
    name: java.lang.String = null,
    properties: PropertyBag = null,
    relationships: js.Array[ReportingDescriptorRelationship] = null,
    shortDescription: MultiformatMessageString = null
  ): ReportingDescriptor = {
    val __obj = js.Dynamic.literal(id = id)
    if (defaultConfiguration != null) __obj.updateDynamic("defaultConfiguration")(defaultConfiguration)
    if (deprecatedGuids != null) __obj.updateDynamic("deprecatedGuids")(deprecatedGuids)
    if (deprecatedIds != null) __obj.updateDynamic("deprecatedIds")(deprecatedIds)
    if (deprecatedNames != null) __obj.updateDynamic("deprecatedNames")(deprecatedNames)
    if (fullDescription != null) __obj.updateDynamic("fullDescription")(fullDescription)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (help != null) __obj.updateDynamic("help")(help)
    if (helpUri != null) __obj.updateDynamic("helpUri")(helpUri)
    if (messageStrings != null) __obj.updateDynamic("messageStrings")(messageStrings)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (relationships != null) __obj.updateDynamic("relationships")(relationships)
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription)
    __obj.asInstanceOf[ReportingDescriptor]
  }
}

