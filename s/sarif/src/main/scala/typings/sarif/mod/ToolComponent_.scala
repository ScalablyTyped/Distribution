package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.mod.ToolComponent.contents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolComponent_ extends js.Object {
  /**
    * The component which is strongly associated with this component. For a translation, this refers to the component
    * which has been translated. For an extension, this is the driver that provides the extension's plugin model.
    */
  var associatedComponent: js.UndefOr[ToolComponentReference] = js.native
  /**
    * The kinds of data contained in this object.
    */
  var contents: js.UndefOr[js.Array[contents]] = js.native
  /**
    * The binary version of the tool component's primary executable file expressed as four non-negative integers
    * separated by a period (for operating systems that express file versions in this way).
    */
  var dottedQuadFileVersion: js.UndefOr[String] = js.native
  /**
    * The absolute URI from which the tool component can be downloaded.
    */
  var downloadUri: js.UndefOr[String] = js.native
  /**
    * A comprehensive description of the tool component.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.native
  /**
    * The name of the tool component along with its version and any other useful identifying information, such as its
    * locale.
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * A dictionary, each of whose keys is a resource identifier and each of whose values is a multiformatMessageString
    * object, which holds message strings in plain text and (optionally) Markdown format. The strings can include
    * placeholders, which can be used to construct a message in combination with an arbitrary number of additional
    * string arguments.
    */
  var globalMessageStrings: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  /**
    * A unique identifer for the tool component in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  /**
    * The absolute URI at which information about this version of the tool component can be found.
    */
  var informationUri: js.UndefOr[String] = js.native
  /**
    * Specifies whether this object contains a complete definition of the localizable and/or non-localizable data for
    * this component, as opposed to including only data that is relevant to the results persisted to this log file.
    */
  var isComprehensive: js.UndefOr[Boolean] = js.native
  /**
    * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter
    * lowercase language code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code
    * associated with a country or region). The casing is recommended but not required (in order for this data to
    * conform to RFC5646).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The semantic version of the localized strings defined in this component; maintained by components that provide
    * translations.
    */
  var localizedDataSemanticVersion: js.UndefOr[String] = js.native
  /**
    * An array of the artifactLocation objects associated with the tool component.
    */
  var locations: js.UndefOr[js.Array[ArtifactLocation]] = js.native
  /**
    * The minimum value of localizedDataSemanticVersion required in translations consumed by this component; used by
    * components that consume translations.
    */
  var minimumRequiredLocalizedDataSemanticVersion: js.UndefOr[String] = js.native
  /**
    * The name of the tool component.
    */
  var name: String = js.native
  /**
    * An array of reportingDescriptor objects relevant to the notifications related to the configuration and runtime
    * execution of the tool component.
    */
  var notifications: js.UndefOr[js.Array[ReportingDescriptor]] = js.native
  /**
    * The organization or company that produced the tool component.
    */
  var organization: js.UndefOr[String] = js.native
  /**
    * A product suite to which the tool component belongs.
    */
  var product: js.UndefOr[String] = js.native
  /**
    * A localizable string containing the name of the suite of products to which the tool component belongs.
    */
  var productSuite: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the tool component.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * A string specifying the UTC date (and optionally, the time) of the component's release.
    */
  var releaseDateUtc: js.UndefOr[String] = js.native
  /**
    * An array of reportingDescriptor objects relevant to the analysis performed by the tool component.
    */
  var rules: js.UndefOr[js.Array[ReportingDescriptor]] = js.native
  /**
    * The tool component version in the format specified by Semantic Versioning 2.0.
    */
  var semanticVersion: js.UndefOr[String] = js.native
  /**
    * A brief description of the tool component.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.native
  /**
    * An array of toolComponentReference objects to declare the taxonomies supported by the tool component.
    */
  var supportedTaxonomies: js.UndefOr[js.Array[ToolComponentReference]] = js.native
  /**
    * An array of reportingDescriptor objects relevant to the definitions of both standalone and tool-defined
    * taxonomies.
    */
  var taxa: js.UndefOr[js.Array[ReportingDescriptor]] = js.native
  /**
    * Translation metadata, required for a translation, not populated by other component types.
    */
  var translationMetadata: js.UndefOr[TranslationMetadata] = js.native
  /**
    * The tool component version, in whatever format the component natively provides.
    */
  var version: js.UndefOr[String] = js.native
}

object ToolComponent_ {
  @scala.inline
  def apply(name: String): ToolComponent_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolComponent_]
  }
  @scala.inline
  implicit class ToolComponent_Ops[Self <: ToolComponent_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociatedComponent(value: ToolComponentReference): Self = this.set("associatedComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatedComponent: Self = this.set("associatedComponent", js.undefined)
    @scala.inline
    def setContentsVarargs(value: contents*): Self = this.set("contents", js.Array(value :_*))
    @scala.inline
    def setContents(value: js.Array[contents]): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    @scala.inline
    def setDottedQuadFileVersion(value: String): Self = this.set("dottedQuadFileVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDottedQuadFileVersion: Self = this.set("dottedQuadFileVersion", js.undefined)
    @scala.inline
    def setDownloadUri(value: String): Self = this.set("downloadUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadUri: Self = this.set("downloadUri", js.undefined)
    @scala.inline
    def setFullDescription(value: MultiformatMessageString): Self = this.set("fullDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullDescription: Self = this.set("fullDescription", js.undefined)
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    @scala.inline
    def setGlobalMessageStrings(value: StringDictionary[MultiformatMessageString]): Self = this.set("globalMessageStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalMessageStrings: Self = this.set("globalMessageStrings", js.undefined)
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setInformationUri(value: String): Self = this.set("informationUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInformationUri: Self = this.set("informationUri", js.undefined)
    @scala.inline
    def setIsComprehensive(value: Boolean): Self = this.set("isComprehensive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsComprehensive: Self = this.set("isComprehensive", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocalizedDataSemanticVersion(value: String): Self = this.set("localizedDataSemanticVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedDataSemanticVersion: Self = this.set("localizedDataSemanticVersion", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: ArtifactLocation*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[ArtifactLocation]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setMinimumRequiredLocalizedDataSemanticVersion(value: String): Self = this.set("minimumRequiredLocalizedDataSemanticVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumRequiredLocalizedDataSemanticVersion: Self = this.set("minimumRequiredLocalizedDataSemanticVersion", js.undefined)
    @scala.inline
    def setNotificationsVarargs(value: ReportingDescriptor*): Self = this.set("notifications", js.Array(value :_*))
    @scala.inline
    def setNotifications(value: js.Array[ReportingDescriptor]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifications: Self = this.set("notifications", js.undefined)
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    @scala.inline
    def setProductSuite(value: String): Self = this.set("productSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductSuite: Self = this.set("productSuite", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setReleaseDateUtc(value: String): Self = this.set("releaseDateUtc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseDateUtc: Self = this.set("releaseDateUtc", js.undefined)
    @scala.inline
    def setRulesVarargs(value: ReportingDescriptor*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[ReportingDescriptor]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setSemanticVersion(value: String): Self = this.set("semanticVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemanticVersion: Self = this.set("semanticVersion", js.undefined)
    @scala.inline
    def setShortDescription(value: MultiformatMessageString): Self = this.set("shortDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDescription: Self = this.set("shortDescription", js.undefined)
    @scala.inline
    def setSupportedTaxonomiesVarargs(value: ToolComponentReference*): Self = this.set("supportedTaxonomies", js.Array(value :_*))
    @scala.inline
    def setSupportedTaxonomies(value: js.Array[ToolComponentReference]): Self = this.set("supportedTaxonomies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedTaxonomies: Self = this.set("supportedTaxonomies", js.undefined)
    @scala.inline
    def setTaxaVarargs(value: ReportingDescriptor*): Self = this.set("taxa", js.Array(value :_*))
    @scala.inline
    def setTaxa(value: js.Array[ReportingDescriptor]): Self = this.set("taxa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxa: Self = this.set("taxa", js.undefined)
    @scala.inline
    def setTranslationMetadata(value: TranslationMetadata): Self = this.set("translationMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslationMetadata: Self = this.set("translationMetadata", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

