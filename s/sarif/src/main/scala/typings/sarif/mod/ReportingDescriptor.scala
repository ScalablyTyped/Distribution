package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportingDescriptor extends js.Object {
  
  /**
    * Default reporting configuration information.
    */
  var defaultConfiguration: js.UndefOr[ReportingConfiguration] = js.native
  
  /**
    * An array of unique identifies in the form of a GUID by which this report was known in some previous version of
    * the analysis tool.
    */
  var deprecatedGuids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of stable, opaque identifiers by which this report was known in some previous version of the analysis
    * tool.
    */
  var deprecatedIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of readable identifiers by which this report was known in some previous version of the analysis tool.
    */
  var deprecatedNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A description of the report. Should, as far as possible, provide details sufficient to enable resolution of any
    * problem indicated by the result.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.native
  
  /**
    * A unique identifer for the reporting descriptor in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  
  /**
    * Provides the primary documentation for the report, useful when there is no online documentation.
    */
  var help: js.UndefOr[MultiformatMessageString] = js.native
  
  /**
    * A URI where the primary documentation for the report can be found.
    */
  var helpUri: js.UndefOr[String] = js.native
  
  /**
    * A stable, opaque identifier for the report.
    */
  var id: String = js.native
  
  /**
    * A set of name/value pairs with arbitrary names. Each value is a multiformatMessageString object, which holds
    * message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can
    * be used to construct a message in combination with an arbitrary number of additional string arguments.
    */
  var messageStrings: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  
  /**
    * A report identifier that is understandable to an end user.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Key/value pairs that provide additional information about the report.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * An array of objects that describe relationships between this reporting descriptor and others.
    */
  var relationships: js.UndefOr[js.Array[ReportingDescriptorRelationship]] = js.native
  
  /**
    * A concise description of the report. Should be a single sentence that is understandable when visible space is
    * limited to a single line of text.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.native
}
object ReportingDescriptor {
  
  @scala.inline
  def apply(id: String): ReportingDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingDescriptor]
  }
  
  @scala.inline
  implicit class ReportingDescriptorOps[Self <: ReportingDescriptor] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultConfiguration(value: ReportingConfiguration): Self = this.set("defaultConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultConfiguration: Self = this.set("defaultConfiguration", js.undefined)
    
    @scala.inline
    def setDeprecatedGuidsVarargs(value: String*): Self = this.set("deprecatedGuids", js.Array(value :_*))
    
    @scala.inline
    def setDeprecatedGuids(value: js.Array[String]): Self = this.set("deprecatedGuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedGuids: Self = this.set("deprecatedGuids", js.undefined)
    
    @scala.inline
    def setDeprecatedIdsVarargs(value: String*): Self = this.set("deprecatedIds", js.Array(value :_*))
    
    @scala.inline
    def setDeprecatedIds(value: js.Array[String]): Self = this.set("deprecatedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedIds: Self = this.set("deprecatedIds", js.undefined)
    
    @scala.inline
    def setDeprecatedNamesVarargs(value: String*): Self = this.set("deprecatedNames", js.Array(value :_*))
    
    @scala.inline
    def setDeprecatedNames(value: js.Array[String]): Self = this.set("deprecatedNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedNames: Self = this.set("deprecatedNames", js.undefined)
    
    @scala.inline
    def setFullDescription(value: MultiformatMessageString): Self = this.set("fullDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullDescription: Self = this.set("fullDescription", js.undefined)
    
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    
    @scala.inline
    def setHelp(value: MultiformatMessageString): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setHelpUri(value: String): Self = this.set("helpUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpUri: Self = this.set("helpUri", js.undefined)
    
    @scala.inline
    def setMessageStrings(value: StringDictionary[MultiformatMessageString]): Self = this.set("messageStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageStrings: Self = this.set("messageStrings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRelationshipsVarargs(value: ReportingDescriptorRelationship*): Self = this.set("relationships", js.Array(value :_*))
    
    @scala.inline
    def setRelationships(value: js.Array[ReportingDescriptorRelationship]): Self = this.set("relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationships: Self = this.set("relationships", js.undefined)
    
    @scala.inline
    def setShortDescription(value: MultiformatMessageString): Self = this.set("shortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortDescription: Self = this.set("shortDescription", js.undefined)
  }
}
