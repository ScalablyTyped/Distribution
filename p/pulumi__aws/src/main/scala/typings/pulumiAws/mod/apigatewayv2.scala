package typings.pulumiAws.mod

import typings.pulumiAws.apiMod.ApiArgs
import typings.pulumiAws.apiMod.ApiState
import typings.pulumiAws.authorizerMod.AuthorizerArgs
import typings.pulumiAws.authorizerMod.AuthorizerState
import typings.pulumiAws.integrationMod.IntegrationArgs
import typings.pulumiAws.integrationMod.IntegrationState
import typings.pulumiAws.modelMod.ModelArgs
import typings.pulumiAws.modelMod.ModelState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigatewayv2")
@js.native
object apigatewayv2 extends js.Object {
  @js.native
  class Api protected ()
    extends typings.pulumiAws.apigatewayv2Mod.Api {
    /**
      * Create a Api resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApiArgs) = this()
    def this(name: String, args: ApiArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Authorizer protected ()
    extends typings.pulumiAws.apigatewayv2Mod.Authorizer {
    /**
      * Create a Authorizer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AuthorizerArgs) = this()
    def this(name: String, args: AuthorizerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Integration protected ()
    extends typings.pulumiAws.apigatewayv2Mod.Integration {
    /**
      * Create a Integration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IntegrationArgs) = this()
    def this(name: String, args: IntegrationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Model protected ()
    extends typings.pulumiAws.apigatewayv2Mod.Model {
    /**
      * Create a Model resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ModelArgs) = this()
    def this(name: String, args: ModelArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Api extends js.Object {
    /**
      * Get an existing Api resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.apiMod.Api = js.native
    def get(name: String, id: Input[ID], state: ApiState): typings.pulumiAws.apiMod.Api = js.native
    def get(name: String, id: Input[ID], state: ApiState, opts: CustomResourceOptions): typings.pulumiAws.apiMod.Api = js.native
    /**
      * Returns true if the given object is an instance of Api.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/api.Api */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Authorizer extends js.Object {
    /**
      * Get an existing Authorizer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.authorizerMod.Authorizer = js.native
    def get(name: String, id: Input[ID], state: AuthorizerState): typings.pulumiAws.authorizerMod.Authorizer = js.native
    def get(name: String, id: Input[ID], state: AuthorizerState, opts: CustomResourceOptions): typings.pulumiAws.authorizerMod.Authorizer = js.native
    /**
      * Returns true if the given object is an instance of Authorizer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/authorizer.Authorizer */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Integration extends js.Object {
    /**
      * Get an existing Integration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.integrationMod.Integration = js.native
    def get(name: String, id: Input[ID], state: IntegrationState): typings.pulumiAws.integrationMod.Integration = js.native
    def get(name: String, id: Input[ID], state: IntegrationState, opts: CustomResourceOptions): typings.pulumiAws.integrationMod.Integration = js.native
    /**
      * Returns true if the given object is an instance of Integration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/integration.Integration */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Model extends js.Object {
    /**
      * Get an existing Model resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.modelMod.Model = js.native
    def get(name: String, id: Input[ID], state: ModelState): typings.pulumiAws.modelMod.Model = js.native
    def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): typings.pulumiAws.modelMod.Model = js.native
    /**
      * Returns true if the given object is an instance of Model.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/model.Model */ Boolean = js.native
  }
  
}

