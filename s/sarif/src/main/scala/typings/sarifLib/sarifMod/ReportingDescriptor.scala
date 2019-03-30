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
    * An array of stable, opaque identifiers by which this report was known in some previous version of the analysis
    * tool.
    */
  var deprecatedIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var help: js.UndefOr[Message] = js.undefined
  /**
    * A URI where the primary documentation for the report can be found.
    */
  var helpUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A stable, opaque identifier for the report.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
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
    * An array of references used to locate an optional set of taxonomy reporting descriptors that may be applied to a
    * result.
    */
  var optionalTaxonomyReferences: js.UndefOr[js.Array[ReportingDescriptorReference]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the report.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A concise description of the report. Should be a single sentence that is understandable when visible space is
    * limited to a single line of text.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.undefined
  /**
    * An array of references used to locate a set of taxonomy reporting descriptors that are always applicable to a
    * result.
    */
  var taxonomyReferences: js.UndefOr[js.Array[ReportingDescriptorReference]] = js.undefined
}

object ReportingDescriptor {
  @scala.inline
  def apply(
    defaultConfiguration: ReportingConfiguration = null,
    deprecatedIds: js.Array[java.lang.String] = null,
    fullDescription: MultiformatMessageString = null,
    guid: java.lang.String = null,
    help: Message = null,
    helpUri: java.lang.String = null,
    id: java.lang.String = null,
    messageStrings: org.scalablytyped.runtime.StringDictionary[MultiformatMessageString] = null,
    name: java.lang.String = null,
    optionalTaxonomyReferences: js.Array[ReportingDescriptorReference] = null,
    properties: PropertyBag = null,
    shortDescription: MultiformatMessageString = null,
    taxonomyReferences: js.Array[ReportingDescriptorReference] = null
  ): ReportingDescriptor = {
    val __obj = js.Dynamic.literal()
    if (defaultConfiguration != null) __obj.updateDynamic("defaultConfiguration")(defaultConfiguration)
    if (deprecatedIds != null) __obj.updateDynamic("deprecatedIds")(deprecatedIds)
    if (fullDescription != null) __obj.updateDynamic("fullDescription")(fullDescription)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (help != null) __obj.updateDynamic("help")(help)
    if (helpUri != null) __obj.updateDynamic("helpUri")(helpUri)
    if (id != null) __obj.updateDynamic("id")(id)
    if (messageStrings != null) __obj.updateDynamic("messageStrings")(messageStrings)
    if (name != null) __obj.updateDynamic("name")(name)
    if (optionalTaxonomyReferences != null) __obj.updateDynamic("optionalTaxonomyReferences")(optionalTaxonomyReferences)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription)
    if (taxonomyReferences != null) __obj.updateDynamic("taxonomyReferences")(taxonomyReferences)
    __obj.asInstanceOf[ReportingDescriptor]
  }
}

