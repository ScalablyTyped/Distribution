package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOrderableDbInstanceMod {
  
  @JSImport("@pulumi/aws/docdb/getOrderableDbInstance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOrderableDbInstance(): js.Promise[GetOrderableDbInstanceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")().asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
  inline def getOrderableDbInstance(args: Unit, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
  inline def getOrderableDbInstance(args: GetOrderableDbInstanceArgs): js.Promise[GetOrderableDbInstanceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
  inline def getOrderableDbInstance(args: GetOrderableDbInstanceArgs, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
  
  trait GetOrderableDbInstanceArgs extends StObject {
    
    /**
      * DB engine. Default: `docdb`
      */
    val engine: js.UndefOr[String] = js.undefined
    
    /**
      * Version of the DB engine.
      */
    val engineVersion: js.UndefOr[String] = js.undefined
    
    /**
      * DB instance class. Examples of classes are `db.r5.12xlarge`, `db.r5.24xlarge`, `db.r5.2xlarge`, `db.r5.4xlarge`, `db.r5.large`, `db.r5.xlarge`, and `db.t3.medium`. (Conflicts with `preferredInstanceClasses`.)
      */
    val instanceClass: js.UndefOr[String] = js.undefined
    
    /**
      * License model. Default: `na`
      */
    val licenseModel: js.UndefOr[String] = js.undefined
    
    /**
      * Ordered list of preferred DocumentDB DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. (Conflicts with `instanceClass`.)
      */
    val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Enable to show only VPC.
      */
    val vpc: js.UndefOr[Boolean] = js.undefined
  }
  object GetOrderableDbInstanceArgs {
    
    inline def apply(): GetOrderableDbInstanceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOrderableDbInstanceArgs]
    }
    
    extension [Self <: GetOrderableDbInstanceArgs](x: Self) {
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      inline def setInstanceClass(value: String): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      inline def setInstanceClassUndefined: Self = StObject.set(x, "instanceClass", js.undefined)
      
      inline def setLicenseModel(value: String): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      inline def setLicenseModelUndefined: Self = StObject.set(x, "licenseModel", js.undefined)
      
      inline def setPreferredInstanceClasses(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceClasses", value.asInstanceOf[js.Any])
      
      inline def setPreferredInstanceClassesUndefined: Self = StObject.set(x, "preferredInstanceClasses", js.undefined)
      
      inline def setPreferredInstanceClassesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceClasses", js.Array(value :_*))
      
      inline def setVpc(value: Boolean): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
      
      inline def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
    }
  }
  
  trait GetOrderableDbInstanceResult extends StObject {
    
    /**
      * Availability zones where the instance is available.
      */
    val availabilityZones: js.Array[String]
    
    val engine: js.UndefOr[String] = js.undefined
    
    val engineVersion: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val instanceClass: String
    
    val licenseModel: js.UndefOr[String] = js.undefined
    
    val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    val vpc: Boolean
  }
  object GetOrderableDbInstanceResult {
    
    inline def apply(
      availabilityZones: js.Array[String],
      engineVersion: String,
      id: String,
      instanceClass: String,
      vpc: Boolean
    ): GetOrderableDbInstanceResult = {
      val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceClass = instanceClass.asInstanceOf[js.Any], vpc = vpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrderableDbInstanceResult]
    }
    
    extension [Self <: GetOrderableDbInstanceResult](x: Self) {
      
      inline def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstanceClass(value: String): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      inline def setLicenseModel(value: String): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      inline def setLicenseModelUndefined: Self = StObject.set(x, "licenseModel", js.undefined)
      
      inline def setPreferredInstanceClasses(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceClasses", value.asInstanceOf[js.Any])
      
      inline def setPreferredInstanceClassesUndefined: Self = StObject.set(x, "preferredInstanceClasses", js.undefined)
      
      inline def setPreferredInstanceClassesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceClasses", js.Array(value :_*))
      
      inline def setVpc(value: Boolean): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    }
  }
}
