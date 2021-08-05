package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsGetEngineVersionMod {
  
  @JSImport("@pulumi/aws/rds/getEngineVersion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEngineVersion(args: GetEngineVersionArgs): js.Promise[GetEngineVersionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEngineVersionResult]]
  inline def getEngineVersion(args: GetEngineVersionArgs, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEngineVersionResult]]
  
  trait GetEngineVersionArgs extends StObject {
    
    /**
      * DB engine. Engine values include `aurora`, `aurora-mysql`, `aurora-postgresql`, `docdb`, `mariadb`, `mysql`, `neptune`, `oracle-ee`, `oracle-se`, `oracle-se1`, `oracle-se2`, `postgres`, `sqlserver-ee`, `sqlserver-ex`, `sqlserver-se`, and `sqlserver-web`.
      */
    val engine: String
    
    /**
      * The name of a specific DB parameter group family. Examples of parameter group families are `mysql8.0`, `mariadb10.4`, and `postgres12`.
      */
    val parameterGroupFamily: js.UndefOr[String] = js.undefined
    
    /**
      * Ordered list of preferred engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. If both the `version` and `preferredVersions` arguments are not configured, the data source will return the default version for the engine.
      */
    val preferredVersions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Version of the DB engine. For example, `5.7.22`, `10.1.34`, and `12.3`. If both the `version` and `preferredVersions` arguments are not configured, the data source will return the default version for the engine.
      */
    val version: js.UndefOr[String] = js.undefined
  }
  object GetEngineVersionArgs {
    
    inline def apply(engine: String): GetEngineVersionArgs = {
      val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEngineVersionArgs]
    }
    
    extension [Self <: GetEngineVersionArgs](x: Self) {
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setParameterGroupFamily(value: String): Self = StObject.set(x, "parameterGroupFamily", value.asInstanceOf[js.Any])
      
      inline def setParameterGroupFamilyUndefined: Self = StObject.set(x, "parameterGroupFamily", js.undefined)
      
      inline def setPreferredVersions(value: js.Array[String]): Self = StObject.set(x, "preferredVersions", value.asInstanceOf[js.Any])
      
      inline def setPreferredVersionsUndefined: Self = StObject.set(x, "preferredVersions", js.undefined)
      
      inline def setPreferredVersionsVarargs(value: String*): Self = StObject.set(x, "preferredVersions", js.Array(value :_*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait GetEngineVersionResult extends StObject {
    
    /**
      * The default character set for new instances of this engine version.
      */
    val defaultCharacterSet: String
    
    val engine: String
    
    /**
      * The description of the database engine.
      */
    val engineDescription: String
    
    /**
      * Set of log types that the database engine has available for export to CloudWatch Logs.
      */
    val exportableLogTypes: js.Array[String]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val parameterGroupFamily: String
    
    val preferredVersions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The status of the DB engine version, either available or deprecated.
      */
    val status: String
    
    /**
      * Set of the character sets supported by this engine.
      */
    val supportedCharacterSets: js.Array[String]
    
    /**
      * Set of features supported by the DB engine.
      */
    val supportedFeatureNames: js.Array[String]
    
    /**
      * Set of the supported DB engine modes.
      */
    val supportedModes: js.Array[String]
    
    /**
      * Set of the time zones supported by this engine.
      */
    val supportedTimezones: js.Array[String]
    
    /**
      * Indicates whether you can use Aurora global databases with a specific DB engine version.
      */
    val supportsGlobalDatabases: Boolean
    
    /**
      * Indicates whether the engine version supports exporting the log types specified by `exportableLogTypes` to CloudWatch Logs.
      */
    val supportsLogExportsToCloudwatch: Boolean
    
    /**
      * Indicates whether you can use Aurora parallel query with a specific DB engine version.
      */
    val supportsParallelQuery: Boolean
    
    /**
      * Indicates whether the database engine version supports read replicas.
      */
    val supportsReadReplica: Boolean
    
    /**
      * Set of engine versions that this database engine version can be upgraded to.
      */
    val validUpgradeTargets: js.Array[String]
    
    val version: String
    
    /**
      * The description of the database engine version.
      */
    val versionDescription: String
  }
  object GetEngineVersionResult {
    
    inline def apply(
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
    
    extension [Self <: GetEngineVersionResult](x: Self) {
      
      inline def setDefaultCharacterSet(value: String): Self = StObject.set(x, "defaultCharacterSet", value.asInstanceOf[js.Any])
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineDescription(value: String): Self = StObject.set(x, "engineDescription", value.asInstanceOf[js.Any])
      
      inline def setExportableLogTypes(value: js.Array[String]): Self = StObject.set(x, "exportableLogTypes", value.asInstanceOf[js.Any])
      
      inline def setExportableLogTypesVarargs(value: String*): Self = StObject.set(x, "exportableLogTypes", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParameterGroupFamily(value: String): Self = StObject.set(x, "parameterGroupFamily", value.asInstanceOf[js.Any])
      
      inline def setPreferredVersions(value: js.Array[String]): Self = StObject.set(x, "preferredVersions", value.asInstanceOf[js.Any])
      
      inline def setPreferredVersionsUndefined: Self = StObject.set(x, "preferredVersions", js.undefined)
      
      inline def setPreferredVersionsVarargs(value: String*): Self = StObject.set(x, "preferredVersions", js.Array(value :_*))
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSupportedCharacterSets(value: js.Array[String]): Self = StObject.set(x, "supportedCharacterSets", value.asInstanceOf[js.Any])
      
      inline def setSupportedCharacterSetsVarargs(value: String*): Self = StObject.set(x, "supportedCharacterSets", js.Array(value :_*))
      
      inline def setSupportedFeatureNames(value: js.Array[String]): Self = StObject.set(x, "supportedFeatureNames", value.asInstanceOf[js.Any])
      
      inline def setSupportedFeatureNamesVarargs(value: String*): Self = StObject.set(x, "supportedFeatureNames", js.Array(value :_*))
      
      inline def setSupportedModes(value: js.Array[String]): Self = StObject.set(x, "supportedModes", value.asInstanceOf[js.Any])
      
      inline def setSupportedModesVarargs(value: String*): Self = StObject.set(x, "supportedModes", js.Array(value :_*))
      
      inline def setSupportedTimezones(value: js.Array[String]): Self = StObject.set(x, "supportedTimezones", value.asInstanceOf[js.Any])
      
      inline def setSupportedTimezonesVarargs(value: String*): Self = StObject.set(x, "supportedTimezones", js.Array(value :_*))
      
      inline def setSupportsGlobalDatabases(value: Boolean): Self = StObject.set(x, "supportsGlobalDatabases", value.asInstanceOf[js.Any])
      
      inline def setSupportsLogExportsToCloudwatch(value: Boolean): Self = StObject.set(x, "supportsLogExportsToCloudwatch", value.asInstanceOf[js.Any])
      
      inline def setSupportsParallelQuery(value: Boolean): Self = StObject.set(x, "supportsParallelQuery", value.asInstanceOf[js.Any])
      
      inline def setSupportsReadReplica(value: Boolean): Self = StObject.set(x, "supportsReadReplica", value.asInstanceOf[js.Any])
      
      inline def setValidUpgradeTargets(value: js.Array[String]): Self = StObject.set(x, "validUpgradeTargets", value.asInstanceOf[js.Any])
      
      inline def setValidUpgradeTargetsVarargs(value: String*): Self = StObject.set(x, "validUpgradeTargets", js.Array(value :_*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionDescription(value: String): Self = StObject.set(x, "versionDescription", value.asInstanceOf[js.Any])
    }
  }
}
