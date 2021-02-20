package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsGetEngineVersionMod {
  
  @JSImport("@pulumi/aws/rds/getEngineVersion", "getEngineVersion")
  @js.native
  def getEngineVersion(args: GetEngineVersionArgs): js.Promise[GetEngineVersionResult] = js.native
  @JSImport("@pulumi/aws/rds/getEngineVersion", "getEngineVersion")
  @js.native
  def getEngineVersion(args: GetEngineVersionArgs, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = js.native
  
  @js.native
  trait GetEngineVersionArgs extends StObject {
    
    /**
      * DB engine. Engine values include `aurora`, `aurora-mysql`, `aurora-postgresql`, `docdb`, `mariadb`, `mysql`, `neptune`, `oracle-ee`, `oracle-se`, `oracle-se1`, `oracle-se2`, `postgres`, `sqlserver-ee`, `sqlserver-ex`, `sqlserver-se`, and `sqlserver-web`.
      */
    val engine: String = js.native
    
    /**
      * The name of a specific DB parameter group family. Examples of parameter group families are `mysql8.0`, `mariadb10.4`, and `postgres12`.
      */
    val parameterGroupFamily: js.UndefOr[String] = js.native
    
    /**
      * Ordered list of preferred engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. If both the `version` and `preferredVersions` arguments are not configured, the data source will return the default version for the engine.
      */
    val preferredVersions: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Version of the DB engine. For example, `5.7.22`, `10.1.34`, and `12.3`. If both the `version` and `preferredVersions` arguments are not configured, the data source will return the default version for the engine.
      */
    val version: js.UndefOr[String] = js.native
  }
  object GetEngineVersionArgs {
    
    @scala.inline
    def apply(engine: String): GetEngineVersionArgs = {
      val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEngineVersionArgs]
    }
    
    @scala.inline
    implicit class GetEngineVersionArgsMutableBuilder[Self <: GetEngineVersionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterGroupFamily(value: String): Self = StObject.set(x, "parameterGroupFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterGroupFamilyUndefined: Self = StObject.set(x, "parameterGroupFamily", js.undefined)
      
      @scala.inline
      def setPreferredVersions(value: js.Array[String]): Self = StObject.set(x, "preferredVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredVersionsUndefined: Self = StObject.set(x, "preferredVersions", js.undefined)
      
      @scala.inline
      def setPreferredVersionsVarargs(value: String*): Self = StObject.set(x, "preferredVersions", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait GetEngineVersionResult extends StObject {
    
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
    implicit class GetEngineVersionResultMutableBuilder[Self <: GetEngineVersionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultCharacterSet(value: String): Self = StObject.set(x, "defaultCharacterSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineDescription(value: String): Self = StObject.set(x, "engineDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportableLogTypes(value: js.Array[String]): Self = StObject.set(x, "exportableLogTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportableLogTypesVarargs(value: String*): Self = StObject.set(x, "exportableLogTypes", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterGroupFamily(value: String): Self = StObject.set(x, "parameterGroupFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredVersions(value: js.Array[String]): Self = StObject.set(x, "preferredVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredVersionsUndefined: Self = StObject.set(x, "preferredVersions", js.undefined)
      
      @scala.inline
      def setPreferredVersionsVarargs(value: String*): Self = StObject.set(x, "preferredVersions", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedCharacterSets(value: js.Array[String]): Self = StObject.set(x, "supportedCharacterSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedCharacterSetsVarargs(value: String*): Self = StObject.set(x, "supportedCharacterSets", js.Array(value :_*))
      
      @scala.inline
      def setSupportedFeatureNames(value: js.Array[String]): Self = StObject.set(x, "supportedFeatureNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedFeatureNamesVarargs(value: String*): Self = StObject.set(x, "supportedFeatureNames", js.Array(value :_*))
      
      @scala.inline
      def setSupportedModes(value: js.Array[String]): Self = StObject.set(x, "supportedModes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedModesVarargs(value: String*): Self = StObject.set(x, "supportedModes", js.Array(value :_*))
      
      @scala.inline
      def setSupportedTimezones(value: js.Array[String]): Self = StObject.set(x, "supportedTimezones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedTimezonesVarargs(value: String*): Self = StObject.set(x, "supportedTimezones", js.Array(value :_*))
      
      @scala.inline
      def setSupportsGlobalDatabases(value: Boolean): Self = StObject.set(x, "supportsGlobalDatabases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsLogExportsToCloudwatch(value: Boolean): Self = StObject.set(x, "supportsLogExportsToCloudwatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsParallelQuery(value: Boolean): Self = StObject.set(x, "supportsParallelQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsReadReplica(value: Boolean): Self = StObject.set(x, "supportsReadReplica", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUpgradeTargets(value: js.Array[String]): Self = StObject.set(x, "validUpgradeTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUpgradeTargetsVarargs(value: String*): Self = StObject.set(x, "validUpgradeTargets", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionDescription(value: String): Self = StObject.set(x, "versionDescription", value.asInstanceOf[js.Any])
    }
  }
}
