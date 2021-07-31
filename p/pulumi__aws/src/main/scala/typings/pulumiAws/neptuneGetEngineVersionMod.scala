package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neptuneGetEngineVersionMod {
  
  @JSImport("@pulumi/aws/neptune/getEngineVersion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getEngineVersion(): js.Promise[GetEngineVersionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")().asInstanceOf[js.Promise[GetEngineVersionResult]]
  @scala.inline
  def getEngineVersion(args: Unit, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEngineVersionResult]]
  @scala.inline
  def getEngineVersion(args: GetEngineVersionArgs): js.Promise[GetEngineVersionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEngineVersionResult]]
  @scala.inline
  def getEngineVersion(args: GetEngineVersionArgs, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEngineVersionResult]]
  
  trait GetEngineVersionArgs extends StObject {
    
    /**
      * DB engine. (Default: `neptune`)
      */
    val engine: js.UndefOr[String] = js.undefined
    
    /**
      * The name of a specific DB parameter group family. An example parameter group family is `neptune1`.
      */
    val parameterGroupFamily: js.UndefOr[String] = js.undefined
    
    /**
      * Ordered list of preferred engine versions. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. If both the `version` and `preferredVersions` arguments are not configured, the data source will return the default version for the engine.
      */
    val preferredVersions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Version of the DB engine. For example, `1.0.1.0`, `1.0.2.2`, and `1.0.3.0`. If both the `version` and `preferredVersions` arguments are not configured, the data source will return the default version for the engine.
      */
    val version: js.UndefOr[String] = js.undefined
  }
  object GetEngineVersionArgs {
    
    @scala.inline
    def apply(): GetEngineVersionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetEngineVersionArgs]
    }
    
    @scala.inline
    implicit class GetEngineVersionArgsMutableBuilder[Self <: GetEngineVersionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
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
  
  trait GetEngineVersionResult extends StObject {
    
    val engine: js.UndefOr[String] = js.undefined
    
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
      * Set of the time zones supported by this engine.
      */
    val supportedTimezones: js.Array[String]
    
    /**
      * Indicates whether the engine version supports exporting the log types specified by `exportableLogTypes` to CloudWatch Logs.
      */
    val supportsLogExportsToCloudwatch: Boolean
    
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
    
    @scala.inline
    def apply(
      engineDescription: String,
      exportableLogTypes: js.Array[String],
      id: String,
      parameterGroupFamily: String,
      supportedTimezones: js.Array[String],
      supportsLogExportsToCloudwatch: Boolean,
      supportsReadReplica: Boolean,
      validUpgradeTargets: js.Array[String],
      version: String,
      versionDescription: String
    ): GetEngineVersionResult = {
      val __obj = js.Dynamic.literal(engineDescription = engineDescription.asInstanceOf[js.Any], exportableLogTypes = exportableLogTypes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parameterGroupFamily = parameterGroupFamily.asInstanceOf[js.Any], supportedTimezones = supportedTimezones.asInstanceOf[js.Any], supportsLogExportsToCloudwatch = supportsLogExportsToCloudwatch.asInstanceOf[js.Any], supportsReadReplica = supportsReadReplica.asInstanceOf[js.Any], validUpgradeTargets = validUpgradeTargets.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionDescription = versionDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEngineVersionResult]
    }
    
    @scala.inline
    implicit class GetEngineVersionResultMutableBuilder[Self <: GetEngineVersionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineDescription(value: String): Self = StObject.set(x, "engineDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
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
      def setSupportedTimezones(value: js.Array[String]): Self = StObject.set(x, "supportedTimezones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedTimezonesVarargs(value: String*): Self = StObject.set(x, "supportedTimezones", js.Array(value :_*))
      
      @scala.inline
      def setSupportsLogExportsToCloudwatch(value: Boolean): Self = StObject.set(x, "supportsLogExportsToCloudwatch", value.asInstanceOf[js.Any])
      
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
