package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportingDescriptor extends StObject {
  
  /**
    * Default reporting configuration information.
    */
  var defaultConfiguration: js.UndefOr[ReportingConfiguration] = js.undefined
  
  /**
    * An array of unique identifies in the form of a GUID by which this report was known in some previous version of
    * the analysis tool.
    */
  var deprecatedGuids: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of stable, opaque identifiers by which this report was known in some previous version of the analysis
    * tool.
    */
  var deprecatedIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of readable identifiers by which this report was known in some previous version of the analysis tool.
    */
  var deprecatedNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A description of the report. Should, as far as possible, provide details sufficient to enable resolution of any
    * problem indicated by the result.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.undefined
  
  /**
    * A unique identifer for the reporting descriptor in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the primary documentation for the report, useful when there is no online documentation.
    */
  var help: js.UndefOr[MultiformatMessageString] = js.undefined
  
  /**
    * A URI where the primary documentation for the report can be found.
    */
  var helpUri: js.UndefOr[String] = js.undefined
  
  /**
    * A stable, opaque identifier for the report.
    */
  var id: String
  
  /**
    * A set of name/value pairs with arbitrary names. Each value is a multiformatMessageString object, which holds
    * message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can
    * be used to construct a message in combination with an arbitrary number of additional string arguments.
    */
  var messageStrings: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.undefined
  
  /**
    * A report identifier that is understandable to an end user.
    */
  var name: js.UndefOr[String] = js.undefined
  
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
  
  inline def apply(id: String): ReportingDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingDescriptor]
  }
  
  extension [Self <: ReportingDescriptor](x: Self) {
    
    inline def setDefaultConfiguration(value: ReportingConfiguration): Self = StObject.set(x, "defaultConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDefaultConfigurationUndefined: Self = StObject.set(x, "defaultConfiguration", js.undefined)
    
    inline def setDeprecatedGuids(value: js.Array[String]): Self = StObject.set(x, "deprecatedGuids", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedGuidsUndefined: Self = StObject.set(x, "deprecatedGuids", js.undefined)
    
    inline def setDeprecatedGuidsVarargs(value: String*): Self = StObject.set(x, "deprecatedGuids", js.Array(value :_*))
    
    inline def setDeprecatedIds(value: js.Array[String]): Self = StObject.set(x, "deprecatedIds", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedIdsUndefined: Self = StObject.set(x, "deprecatedIds", js.undefined)
    
    inline def setDeprecatedIdsVarargs(value: String*): Self = StObject.set(x, "deprecatedIds", js.Array(value :_*))
    
    inline def setDeprecatedNames(value: js.Array[String]): Self = StObject.set(x, "deprecatedNames", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedNamesUndefined: Self = StObject.set(x, "deprecatedNames", js.undefined)
    
    inline def setDeprecatedNamesVarargs(value: String*): Self = StObject.set(x, "deprecatedNames", js.Array(value :_*))
    
    inline def setFullDescription(value: MultiformatMessageString): Self = StObject.set(x, "fullDescription", value.asInstanceOf[js.Any])
    
    inline def setFullDescriptionUndefined: Self = StObject.set(x, "fullDescription", js.undefined)
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setHelp(value: MultiformatMessageString): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setHelpUri(value: String): Self = StObject.set(x, "helpUri", value.asInstanceOf[js.Any])
    
    inline def setHelpUriUndefined: Self = StObject.set(x, "helpUri", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessageStrings(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "messageStrings", value.asInstanceOf[js.Any])
    
    inline def setMessageStringsUndefined: Self = StObject.set(x, "messageStrings", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRelationships(value: js.Array[ReportingDescriptorRelationship]): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    inline def setRelationshipsVarargs(value: ReportingDescriptorRelationship*): Self = StObject.set(x, "relationships", js.Array(value :_*))
    
    inline def setShortDescription(value: MultiformatMessageString): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
  }
}
