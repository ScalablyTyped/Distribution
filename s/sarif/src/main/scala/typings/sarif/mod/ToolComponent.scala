package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sarif.mod.ToolComponent.contents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolComponent extends StObject {
  
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
object ToolComponent {
  
  inline def apply(name: String): ToolComponent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolComponent] (val x: Self) extends AnyVal {
    
    inline def setAssociatedComponent(value: ToolComponentReference): Self = StObject.set(x, "associatedComponent", value.asInstanceOf[js.Any])
    
    inline def setAssociatedComponentUndefined: Self = StObject.set(x, "associatedComponent", js.undefined)
    
    inline def setContents(value: js.Array[contents]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setContentsVarargs(value: contents*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setDottedQuadFileVersion(value: String): Self = StObject.set(x, "dottedQuadFileVersion", value.asInstanceOf[js.Any])
    
    inline def setDottedQuadFileVersionUndefined: Self = StObject.set(x, "dottedQuadFileVersion", js.undefined)
    
    inline def setDownloadUri(value: String): Self = StObject.set(x, "downloadUri", value.asInstanceOf[js.Any])
    
    inline def setDownloadUriUndefined: Self = StObject.set(x, "downloadUri", js.undefined)
    
    inline def setFullDescription(value: MultiformatMessageString): Self = StObject.set(x, "fullDescription", value.asInstanceOf[js.Any])
    
    inline def setFullDescriptionUndefined: Self = StObject.set(x, "fullDescription", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setGlobalMessageStrings(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "globalMessageStrings", value.asInstanceOf[js.Any])
    
    inline def setGlobalMessageStringsUndefined: Self = StObject.set(x, "globalMessageStrings", js.undefined)
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setInformationUri(value: String): Self = StObject.set(x, "informationUri", value.asInstanceOf[js.Any])
    
    inline def setInformationUriUndefined: Self = StObject.set(x, "informationUri", js.undefined)
    
    inline def setIsComprehensive(value: Boolean): Self = StObject.set(x, "isComprehensive", value.asInstanceOf[js.Any])
    
    inline def setIsComprehensiveUndefined: Self = StObject.set(x, "isComprehensive", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocalizedDataSemanticVersion(value: String): Self = StObject.set(x, "localizedDataSemanticVersion", value.asInstanceOf[js.Any])
    
    inline def setLocalizedDataSemanticVersionUndefined: Self = StObject.set(x, "localizedDataSemanticVersion", js.undefined)
    
    inline def setLocations(value: js.Array[ArtifactLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: ArtifactLocation*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setMinimumRequiredLocalizedDataSemanticVersion(value: String): Self = StObject.set(x, "minimumRequiredLocalizedDataSemanticVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumRequiredLocalizedDataSemanticVersionUndefined: Self = StObject.set(x, "minimumRequiredLocalizedDataSemanticVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotifications(value: js.Array[ReportingDescriptor]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    inline def setNotificationsVarargs(value: ReportingDescriptor*): Self = StObject.set(x, "notifications", js.Array(value*))
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductSuite(value: String): Self = StObject.set(x, "productSuite", value.asInstanceOf[js.Any])
    
    inline def setProductSuiteUndefined: Self = StObject.set(x, "productSuite", js.undefined)
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReleaseDateUtc(value: String): Self = StObject.set(x, "releaseDateUtc", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUtcUndefined: Self = StObject.set(x, "releaseDateUtc", js.undefined)
    
    inline def setRules(value: js.Array[ReportingDescriptor]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: ReportingDescriptor*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setSemanticVersion(value: String): Self = StObject.set(x, "semanticVersion", value.asInstanceOf[js.Any])
    
    inline def setSemanticVersionUndefined: Self = StObject.set(x, "semanticVersion", js.undefined)
    
    inline def setShortDescription(value: MultiformatMessageString): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    inline def setSupportedTaxonomies(value: js.Array[ToolComponentReference]): Self = StObject.set(x, "supportedTaxonomies", value.asInstanceOf[js.Any])
    
    inline def setSupportedTaxonomiesUndefined: Self = StObject.set(x, "supportedTaxonomies", js.undefined)
    
    inline def setSupportedTaxonomiesVarargs(value: ToolComponentReference*): Self = StObject.set(x, "supportedTaxonomies", js.Array(value*))
    
    inline def setTaxa(value: js.Array[ReportingDescriptor]): Self = StObject.set(x, "taxa", value.asInstanceOf[js.Any])
    
    inline def setTaxaUndefined: Self = StObject.set(x, "taxa", js.undefined)
    
    inline def setTaxaVarargs(value: ReportingDescriptor*): Self = StObject.set(x, "taxa", js.Array(value*))
    
    inline def setTranslationMetadata(value: TranslationMetadata): Self = StObject.set(x, "translationMetadata", value.asInstanceOf[js.Any])
    
    inline def setTranslationMetadataUndefined: Self = StObject.set(x, "translationMetadata", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.localizedData
    - typings.sarif.sarifStrings.nonLocalizedData
  */
  trait contents extends StObject
  object contents {
    
    inline def localizedData: typings.sarif.sarifStrings.localizedData = "localizedData".asInstanceOf[typings.sarif.sarifStrings.localizedData]
    
    inline def nonLocalizedData: typings.sarif.sarifStrings.nonLocalizedData = "nonLocalizedData".asInstanceOf[typings.sarif.sarifStrings.nonLocalizedData]
  }
}
