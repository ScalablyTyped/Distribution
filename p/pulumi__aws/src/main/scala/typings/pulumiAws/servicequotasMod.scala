package typings.pulumiAws

import typings.pulumiAws.getServiceQuotaMod.GetServiceQuotaArgs
import typings.pulumiAws.getServiceQuotaMod.GetServiceQuotaResult
import typings.pulumiAws.serviceQuotaMod.ServiceQuotaArgs
import typings.pulumiAws.serviceQuotaMod.ServiceQuotaState
import typings.pulumiAws.servicequotasGetServiceMod.GetServiceArgs
import typings.pulumiAws.servicequotasGetServiceMod.GetServiceResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicequotasMod {
  
  @JSImport("@pulumi/aws/servicequotas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/servicequotas", "ServiceQuota")
  @js.native
  class ServiceQuota protected ()
    extends typings.pulumiAws.serviceQuotaMod.ServiceQuota {
    /**
      * Create a ServiceQuota resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ServiceQuotaArgs) = this()
    def this(name: String, args: ServiceQuotaArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ServiceQuota {
    
    @JSImport("@pulumi/aws/servicequotas", "ServiceQuota")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ServiceQuota resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.serviceQuotaMod.ServiceQuota = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.serviceQuotaMod.ServiceQuota]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.serviceQuotaMod.ServiceQuota = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.serviceQuotaMod.ServiceQuota]
    inline def get(name: String, id: Input[ID], state: ServiceQuotaState): typings.pulumiAws.serviceQuotaMod.ServiceQuota = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.serviceQuotaMod.ServiceQuota]
    inline def get(name: String, id: Input[ID], state: ServiceQuotaState, opts: CustomResourceOptions): typings.pulumiAws.serviceQuotaMod.ServiceQuota = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.serviceQuotaMod.ServiceQuota]
    
    /**
      * Returns true if the given object is an instance of ServiceQuota.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicequotas/serviceQuota.ServiceQuota */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/servicequotas/serviceQuota.ServiceQuota */ Boolean]
  }
  
  inline def getService(args: GetServiceArgs): js.Promise[GetServiceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getService")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetServiceResult]]
  inline def getService(args: GetServiceArgs, opts: InvokeOptions): js.Promise[GetServiceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getService")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceResult]]
  
  inline def getServiceQuota(args: GetServiceQuotaArgs): js.Promise[GetServiceQuotaResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceQuota")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetServiceQuotaResult]]
  inline def getServiceQuota(args: GetServiceQuotaArgs, opts: InvokeOptions): js.Promise[GetServiceQuotaResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServiceQuota")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceQuotaResult]]
}
