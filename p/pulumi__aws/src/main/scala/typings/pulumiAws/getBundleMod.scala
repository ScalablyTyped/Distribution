package typings.pulumiAws

import typings.pulumiAws.outputMod.workspaces.GetBundleComputeType
import typings.pulumiAws.outputMod.workspaces.GetBundleRootStorage
import typings.pulumiAws.outputMod.workspaces.GetBundleUserStorage
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBundleMod {
  
  @JSImport("@pulumi/aws/workspaces/getBundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBundle(): js.Promise[GetBundleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBundle")().asInstanceOf[js.Promise[GetBundleResult]]
  inline def getBundle(args: Unit, opts: InvokeOptions): js.Promise[GetBundleResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBundle")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBundleResult]]
  inline def getBundle(args: GetBundleArgs): js.Promise[GetBundleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBundle")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBundleResult]]
  inline def getBundle(args: GetBundleArgs, opts: InvokeOptions): js.Promise[GetBundleResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBundle")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBundleResult]]
  
  trait GetBundleArgs extends StObject {
    
    /**
      * The ID of the bundle.
      */
    val bundleId: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the bundle. You cannot combine this parameter with `bundleId`.
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * The owner of the bundles. You have to leave it blank for own bundles. You cannot combine this parameter with `bundleId`.
      */
    val owner: js.UndefOr[String] = js.undefined
  }
  object GetBundleArgs {
    
    inline def apply(): GetBundleArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetBundleArgs]
    }
    
    extension [Self <: GetBundleArgs](x: Self) {
      
      inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    }
  }
  
  trait GetBundleResult extends StObject {
    
    /**
      * The ID of the bundle.
      */
    val bundleId: js.UndefOr[String] = js.undefined
    
    /**
      * The compute type. See supported fields below.
      */
    val computeTypes: js.Array[GetBundleComputeType]
    
    /**
      * The description of the bundle.
      */
    val description: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The name of the compute type.
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * The owner of the bundle.
      */
    val owner: js.UndefOr[String] = js.undefined
    
    /**
      * The root volume. See supported fields below.
      */
    val rootStorages: js.Array[GetBundleRootStorage]
    
    /**
      * The user storage. See supported fields below.
      */
    val userStorages: js.Array[GetBundleUserStorage]
  }
  object GetBundleResult {
    
    inline def apply(
      computeTypes: js.Array[GetBundleComputeType],
      description: String,
      id: String,
      rootStorages: js.Array[GetBundleRootStorage],
      userStorages: js.Array[GetBundleUserStorage]
    ): GetBundleResult = {
      val __obj = js.Dynamic.literal(computeTypes = computeTypes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rootStorages = rootStorages.asInstanceOf[js.Any], userStorages = userStorages.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBundleResult]
    }
    
    extension [Self <: GetBundleResult](x: Self) {
      
      inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      inline def setComputeTypes(value: js.Array[GetBundleComputeType]): Self = StObject.set(x, "computeTypes", value.asInstanceOf[js.Any])
      
      inline def setComputeTypesVarargs(value: GetBundleComputeType*): Self = StObject.set(x, "computeTypes", js.Array(value :_*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      inline def setRootStorages(value: js.Array[GetBundleRootStorage]): Self = StObject.set(x, "rootStorages", value.asInstanceOf[js.Any])
      
      inline def setRootStoragesVarargs(value: GetBundleRootStorage*): Self = StObject.set(x, "rootStorages", js.Array(value :_*))
      
      inline def setUserStorages(value: js.Array[GetBundleUserStorage]): Self = StObject.set(x, "userStorages", value.asInstanceOf[js.Any])
      
      inline def setUserStoragesVarargs(value: GetBundleUserStorage*): Self = StObject.set(x, "userStorages", js.Array(value :_*))
    }
  }
}
