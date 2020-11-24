package typings.pulumiAws.rdsGetEngineVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEngineVersionResult extends js.Object {
  
  /**
    * The default character set for new instances of this engine version.
    */
  val defaultCharacterSet: String = js.native
  
  val engine: String = js.native
  
  /**
    * The description of the database engine.
    */
  val engineDescription: String = js.native
  
  /**
    * Set of log types that the database engine has available for export to CloudWatch Logs.
    */
  val exportableLogTypes: js.Array[String] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val parameterGroupFamily: String = js.native
  
  val preferredVersions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The status of the DB engine version, either available or deprecated.
    */
  val status: String = js.native
  
  /**
    * Set of the character sets supported by this engine.
    */
  val supportedCharacterSets: js.Array[String] = js.native
  
  /**
    * Set of features supported by the DB engine.
    */
  val supportedFeatureNames: js.Array[String] = js.native
  
  /**
    * Set of the supported DB engine modes.
    */
  val supportedModes: js.Array[String] = js.native
  
  /**
    * Set of the time zones supported by this engine.
    */
  val supportedTimezones: js.Array[String] = js.native
  
  /**
    * Indicates whether you can use Aurora global databases with a specific DB engine version.
    */
  val supportsGlobalDatabases: Boolean = js.native
  
  /**
    * Indicates whether the engine version supports exporting the log types specified by `exportableLogTypes` to CloudWatch Logs.
    */
  val supportsLogExportsToCloudwatch: Boolean = js.native
  
  /**
    * Indicates whether you can use Aurora parallel query with a specific DB engine version.
    */
  val supportsParallelQuery: Boolean = js.native
  
  /**
    * Indicates whether the database engine version supports read replicas.
    */
  val supportsReadReplica: Boolean = js.native
  
  /**
    * Set of engine versions that this database engine version can be upgraded to.
    */
  val validUpgradeTargets: js.Array[String] = js.native
  
  val version: String = js.native
  
  /**
    * The description of the database engine version.
    */
  val versionDescription: String = js.native
}
object GetEngineVersionResult {
  
  @scala.inline
  def apply(
    defaultCharacterSet: String,
    engine: String,
    engineDescription: String,
    exportableLogTypes: js.Array[String],
    id: String,
    parameterGroupFamily: String,
    status: String,
    supportedCharacterSets: js.Array[String],
    supportedFeatureNames: js.Array[String],
    supportedModes: js.Array[String],
    supportedTimezones: js.Array[String],
    supportsGlobalDatabases: Boolean,
    supportsLogExportsToCloudwatch: Boolean,
    supportsParallelQuery: Boolean,
    supportsReadReplica: Boolean,
    validUpgradeTargets: js.Array[String],
    version: String,
    versionDescription: String
  ): GetEngineVersionResult = {
    val __obj = js.Dynamic.literal(defaultCharacterSet = defaultCharacterSet.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineDescription = engineDescription.asInstanceOf[js.Any], exportableLogTypes = exportableLogTypes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parameterGroupFamily = parameterGroupFamily.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], supportedCharacterSets = supportedCharacterSets.asInstanceOf[js.Any], supportedFeatureNames = supportedFeatureNames.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any], supportedTimezones = supportedTimezones.asInstanceOf[js.Any], supportsGlobalDatabases = supportsGlobalDatabases.asInstanceOf[js.Any], supportsLogExportsToCloudwatch = supportsLogExportsToCloudwatch.asInstanceOf[js.Any], supportsParallelQuery = supportsParallelQuery.asInstanceOf[js.Any], supportsReadReplica = supportsReadReplica.asInstanceOf[js.Any], validUpgradeTargets = validUpgradeTargets.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionDescription = versionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEngineVersionResult]
  }
  
  @scala.inline
  implicit class GetEngineVersionResultOps[Self <: GetEngineVersionResult] (val x: Self) extends AnyVal {
    
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
    def setDefaultCharacterSet(value: String): Self = this.set("defaultCharacterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineDescription(value: String): Self = this.set("engineDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportableLogTypesVarargs(value: String*): Self = this.set("exportableLogTypes", js.Array(value :_*))
    
    @scala.inline
    def setExportableLogTypes(value: js.Array[String]): Self = this.set("exportableLogTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupFamily(value: String): Self = this.set("parameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCharacterSetsVarargs(value: String*): Self = this.set("supportedCharacterSets", js.Array(value :_*))
    
    @scala.inline
    def setSupportedCharacterSets(value: js.Array[String]): Self = this.set("supportedCharacterSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedFeatureNamesVarargs(value: String*): Self = this.set("supportedFeatureNames", js.Array(value :_*))
    
    @scala.inline
    def setSupportedFeatureNames(value: js.Array[String]): Self = this.set("supportedFeatureNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedModesVarargs(value: String*): Self = this.set("supportedModes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedModes(value: js.Array[String]): Self = this.set("supportedModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedTimezonesVarargs(value: String*): Self = this.set("supportedTimezones", js.Array(value :_*))
    
    @scala.inline
    def setSupportedTimezones(value: js.Array[String]): Self = this.set("supportedTimezones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsGlobalDatabases(value: Boolean): Self = this.set("supportsGlobalDatabases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsLogExportsToCloudwatch(value: Boolean): Self = this.set("supportsLogExportsToCloudwatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsParallelQuery(value: Boolean): Self = this.set("supportsParallelQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsReadReplica(value: Boolean): Self = this.set("supportsReadReplica", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUpgradeTargetsVarargs(value: String*): Self = this.set("validUpgradeTargets", js.Array(value :_*))
    
    @scala.inline
    def setValidUpgradeTargets(value: js.Array[String]): Self = this.set("validUpgradeTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDescription(value: String): Self = this.set("versionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredVersionsVarargs(value: String*): Self = this.set("preferredVersions", js.Array(value :_*))
    
    @scala.inline
    def setPreferredVersions(value: js.Array[String]): Self = this.set("preferredVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredVersions: Self = this.set("preferredVersions", js.undefined)
  }
}
