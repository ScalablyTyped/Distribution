package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.mod.ToolComponent.contents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolComponent_ extends js.Object {
  /**
    * The component which is strongly associated with this component. For a translation, this refers to the component
    * which has been translated. For an extension, this is the driver that provides the extension's plugin model.
    */
  var associatedComponent: js.UndefOr[ToolComponentReference] = js.undefined
  /**
    * The kinds of data contained in this object.
    */
  var contents: js.UndefOr[js.Array[contents]] = js.undefined
  /**
    * The binary version of the tool component's primary executable file expressed as four non-negative integers
    * separated by a period (for operating systems that express file versions in this way).
    */
  var dottedQuadFileVersion: js.UndefOr[String] = js.undefined
  /**
    * The absolute URI from which the tool component can be downloaded.
    */
  var downloadUri: js.UndefOr[String] = js.undefined
  /**
    * A comprehensive description of the tool component.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.undefined
  /**
    * The name of the tool component along with its version and any other useful identifying information, such as its
    * locale.
    */
  var fullName: js.UndefOr[String] = js.undefined
  /**
    * A dictionary, each of whose keys is a resource identifier and each of whose values is a multiformatMessageString
    * object, which holds message strings in plain text and (optionally) Markdown format. The strings can include
    * placeholders, which can be used to construct a message in combination with an arbitrary number of additional
    * string arguments.
    */
  var globalMessageStrings: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * A unique identifer for the tool component in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  /**
    * The absolute URI at which information about this version of the tool component can be found.
    */
  var informationUri: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether this object contains a complete definition of the localizable and/or non-localizable data for
    * this component, as opposed to including only data that is relevant to the results persisted to this log file.
    */
  var isComprehensive: js.UndefOr[Boolean] = js.undefined
  /**
    * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter
    * lowercase language code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code
    * associated with a country or region). The casing is recommended but not required (in order for this data to
    * conform to RFC5646).
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * The semantic version of the localized strings defined in this component; maintained by components that provide
    * translations.
    */
  var localizedDataSemanticVersion: js.UndefOr[String] = js.undefined
  /**
    * An array of the artifactLocation objects associated with the tool component.
    */
  var locations: js.UndefOr[js.Array[ArtifactLocation]] = js.undefined
  /**
    * The minimum value of localizedDataSemanticVersion required in translations consumed by this component; used by
    * components that consume translations.
    */
  var minimumRequiredLocalizedDataSemanticVersion: js.UndefOr[String] = js.undefined
  /**
    * The name of the tool component.
    */
  var name: String
  /**
    * An array of reportingDescriptor objects relevant to the notifications related to the configuration and runtime
    * execution of the tool component.
    */
  var notifications: js.UndefOr[js.Array[ReportingDescriptor]] = js.undefined
  /**
    * The organization or company that produced the tool component.
    */
  var organization: js.UndefOr[String] = js.undefined
  /**
    * A product suite to which the tool component belongs.
    */
  var product: js.UndefOr[String] = js.undefined
  /**
    * A localizable string containing the name of the suite of products to which the tool component belongs.
    */
  var productSuite: js.UndefOr[String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the tool component.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A string specifying the UTC date (and optionally, the time) of the component's release.
    */
  var releaseDateUtc: js.UndefOr[String] = js.undefined
  /**
    * An array of reportingDescriptor objects relevant to the analysis performed by the tool component.
    */
  var rules: js.UndefOr[js.Array[ReportingDescriptor]] = js.undefined
  /**
    * The tool component version in the format specified by Semantic Versioning 2.0.
    */
  var semanticVersion: js.UndefOr[String] = js.undefined
  /**
    * A brief description of the tool component.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.undefined
  /**
    * An array of toolComponentReference objects to declare the taxonomies supported by the tool component.
    */
  var supportedTaxonomies: js.UndefOr[js.Array[ToolComponentReference]] = js.undefined
  /**
    * An array of reportingDescriptor objects relevant to the definitions of both standalone and tool-defined
    * taxonomies.
    */
  var taxa: js.UndefOr[js.Array[ReportingDescriptor]] = js.undefined
  /**
    * Translation metadata, required for a translation, not populated by other component types.
    */
  var translationMetadata: js.UndefOr[TranslationMetadata] = js.undefined
  /**
    * The tool component version, in whatever format the component natively provides.
    */
  var version: js.UndefOr[String] = js.undefined
}

object ToolComponent_ {
  @scala.inline
  def apply(
    name: String,
    associatedComponent: ToolComponentReference = null,
    contents: js.Array[contents] = null,
    dottedQuadFileVersion: String = null,
    downloadUri: String = null,
    fullDescription: MultiformatMessageString = null,
    fullName: String = null,
    globalMessageStrings: StringDictionary[MultiformatMessageString] = null,
    guid: String = null,
    informationUri: String = null,
    isComprehensive: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    localizedDataSemanticVersion: String = null,
    locations: js.Array[ArtifactLocation] = null,
    minimumRequiredLocalizedDataSemanticVersion: String = null,
    notifications: js.Array[ReportingDescriptor] = null,
    organization: String = null,
    product: String = null,
    productSuite: String = null,
    properties: PropertyBag = null,
    releaseDateUtc: String = null,
    rules: js.Array[ReportingDescriptor] = null,
    semanticVersion: String = null,
    shortDescription: MultiformatMessageString = null,
    supportedTaxonomies: js.Array[ToolComponentReference] = null,
    taxa: js.Array[ReportingDescriptor] = null,
    translationMetadata: TranslationMetadata = null,
    version: String = null
  ): ToolComponent_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (associatedComponent != null) __obj.updateDynamic("associatedComponent")(associatedComponent.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (dottedQuadFileVersion != null) __obj.updateDynamic("dottedQuadFileVersion")(dottedQuadFileVersion.asInstanceOf[js.Any])
    if (downloadUri != null) __obj.updateDynamic("downloadUri")(downloadUri.asInstanceOf[js.Any])
    if (fullDescription != null) __obj.updateDynamic("fullDescription")(fullDescription.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (globalMessageStrings != null) __obj.updateDynamic("globalMessageStrings")(globalMessageStrings.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (informationUri != null) __obj.updateDynamic("informationUri")(informationUri.asInstanceOf[js.Any])
    if (!js.isUndefined(isComprehensive)) __obj.updateDynamic("isComprehensive")(isComprehensive.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (localizedDataSemanticVersion != null) __obj.updateDynamic("localizedDataSemanticVersion")(localizedDataSemanticVersion.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (minimumRequiredLocalizedDataSemanticVersion != null) __obj.updateDynamic("minimumRequiredLocalizedDataSemanticVersion")(minimumRequiredLocalizedDataSemanticVersion.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (productSuite != null) __obj.updateDynamic("productSuite")(productSuite.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (releaseDateUtc != null) __obj.updateDynamic("releaseDateUtc")(releaseDateUtc.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (semanticVersion != null) __obj.updateDynamic("semanticVersion")(semanticVersion.asInstanceOf[js.Any])
    if (shortDescription != null) __obj.updateDynamic("shortDescription")(shortDescription.asInstanceOf[js.Any])
    if (supportedTaxonomies != null) __obj.updateDynamic("supportedTaxonomies")(supportedTaxonomies.asInstanceOf[js.Any])
    if (taxa != null) __obj.updateDynamic("taxa")(taxa.asInstanceOf[js.Any])
    if (translationMetadata != null) __obj.updateDynamic("translationMetadata")(translationMetadata.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolComponent_]
  }
}

