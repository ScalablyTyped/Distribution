package typings.pulumiAws

import typings.pulumiAws.outputMod.workspaces.GetBundleComputeType
import typings.pulumiAws.outputMod.workspaces.GetBundleRootStorage
import typings.pulumiAws.outputMod.workspaces.GetBundleUserStorage
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBundleMod {
  
  @JSImport("@pulumi/aws/workspaces/getBundle", "getBundle")
  @js.native
  def getBundle(): js.Promise[GetBundleResult] = js.native
  @JSImport("@pulumi/aws/workspaces/getBundle", "getBundle")
  @js.native
  def getBundle(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetBundleResult] = js.native
  @JSImport("@pulumi/aws/workspaces/getBundle", "getBundle")
  @js.native
  def getBundle(args: GetBundleArgs): js.Promise[GetBundleResult] = js.native
  @JSImport("@pulumi/aws/workspaces/getBundle", "getBundle")
  @js.native
  def getBundle(args: GetBundleArgs, opts: InvokeOptions): js.Promise[GetBundleResult] = js.native
  
  @js.native
  trait GetBundleArgs extends StObject {
    
    /**
      * The ID of the bundle.
      */
    val bundleId: js.UndefOr[String] = js.native
    
    /**
      * The name of the bundle. You cannot combine this parameter with `bundleId`.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * The owner of the bundles. You have to leave it blank for own bundles. You cannot combine this parameter with `bundleId`.
      */
    val owner: js.UndefOr[String] = js.native
  }
  object GetBundleArgs {
    
    @scala.inline
    def apply(): GetBundleArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetBundleArgs]
    }
    
    @scala.inline
    implicit class GetBundleArgsMutableBuilder[Self <: GetBundleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    }
  }
  
  @js.native
  trait GetBundleResult extends StObject {
    
    /**
      * The ID of the bundle.
      */
    val bundleId: js.UndefOr[String] = js.native
    
    /**
      * The compute type. See supported fields below.
      */
    val computeTypes: js.Array[GetBundleComputeType] = js.native
    
    /**
      * The description of the bundle.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The name of the compute type.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * The owner of the bundle.
      */
    val owner: js.UndefOr[String] = js.native
    
    /**
      * The root volume. See supported fields below.
      */
    val rootStorages: js.Array[GetBundleRootStorage] = js.native
    
    /**
      * The user storage. See supported fields below.
      */
    val userStorages: js.Array[GetBundleUserStorage] = js.native
  }
  object GetBundleResult {
    
    @scala.inline
    def apply(
      computeTypes: js.Array[GetBundleComputeType],
      description: String,
      id: String,
      rootStorages: js.Array[GetBundleRootStorage],
      userStorages: js.Array[GetBundleUserStorage]
    ): GetBundleResult = {
      val __obj = js.Dynamic.literal(computeTypes = computeTypes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rootStorages = rootStorages.asInstanceOf[js.Any], userStorages = userStorages.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBundleResult]
    }
    
    @scala.inline
    implicit class GetBundleResultMutableBuilder[Self <: GetBundleResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      @scala.inline
      def setComputeTypes(value: js.Array[GetBundleComputeType]): Self = StObject.set(x, "computeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeTypesVarargs(value: GetBundleComputeType*): Self = StObject.set(x, "computeTypes", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setRootStorages(value: js.Array[GetBundleRootStorage]): Self = StObject.set(x, "rootStorages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootStoragesVarargs(value: GetBundleRootStorage*): Self = StObject.set(x, "rootStorages", js.Array(value :_*))
      
      @scala.inline
      def setUserStorages(value: js.Array[GetBundleUserStorage]): Self = StObject.set(x, "userStorages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserStoragesVarargs(value: GetBundleUserStorage*): Self = StObject.set(x, "userStorages", js.Array(value :_*))
    }
  }
}
