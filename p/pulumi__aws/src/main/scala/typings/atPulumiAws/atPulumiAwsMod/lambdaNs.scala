package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.lambdaAliasMod.AliasArgs
import typings.atPulumiAws.lambdaAliasMod.AliasState
import typings.atPulumiAws.lambdaEventSourceMappingMod.EventSourceMappingArgs
import typings.atPulumiAws.lambdaEventSourceMappingMod.EventSourceMappingState
import typings.atPulumiAws.lambdaFunctionMod.FunctionArgs
import typings.atPulumiAws.lambdaFunctionMod.FunctionState
import typings.atPulumiAws.lambdaGetFunctionMod.GetFunctionArgs
import typings.atPulumiAws.lambdaGetFunctionMod.GetFunctionResult
import typings.atPulumiAws.lambdaGetInvocationMod.GetInvocationArgs
import typings.atPulumiAws.lambdaGetInvocationMod.GetInvocationResult
import typings.atPulumiAws.lambdaGetLayerVersionMod.GetLayerVersionArgs
import typings.atPulumiAws.lambdaGetLayerVersionMod.GetLayerVersionResult
import typings.atPulumiAws.lambdaLambdaMixinsMod.CallbackFunctionArgs
import typings.atPulumiAws.lambdaLambdaMixinsMod.EventHandler
import typings.atPulumiAws.lambdaLayerVersionMod.LayerVersionArgs
import typings.atPulumiAws.lambdaLayerVersionMod.LayerVersionState
import typings.atPulumiAws.lambdaPermissionMod.PermissionArgs
import typings.atPulumiAws.lambdaPermissionMod.PermissionState
import typings.atPulumiAws.lambdaRuntimesMod.Runtime
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lambda")
@js.native
object lambdaNs extends js.Object {
  @js.native
  class Alias protected ()
    extends typings.atPulumiAws.lambdaMod.Alias {
    /**
      * Create a Alias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AliasArgs) = this()
    def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class CallbackFunction[E, R] protected ()
    extends typings.atPulumiAws.lambdaMod.CallbackFunction[E, R] {
    def this(name: String, args: CallbackFunctionArgs[E, R]) = this()
    def this(name: String, args: CallbackFunctionArgs[E, R], opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EventSourceMapping protected ()
    extends typings.atPulumiAws.lambdaMod.EventSourceMapping {
    /**
      * Create a EventSourceMapping resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventSourceMappingArgs) = this()
    def this(name: String, args: EventSourceMappingArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EventSubscription protected ()
    extends typings.atPulumiAws.lambdaMod.EventSubscription {
    def this(`type`: String, name: String) = this()
    def this(`type`: String, name: String, opts: ComponentResourceOptions) = this()
  }
  
  @js.native
  class Function protected ()
    extends typings.atPulumiAws.lambdaMod.Function {
    /**
      * Create a Function resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FunctionArgs) = this()
    def this(name: String, args: FunctionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LayerVersion protected ()
    extends typings.atPulumiAws.lambdaMod.LayerVersion {
    /**
      * Create a LayerVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LayerVersionArgs) = this()
    def this(name: String, args: LayerVersionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Permission protected ()
    extends typings.atPulumiAws.lambdaMod.Permission {
    /**
      * Create a Permission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PermissionArgs) = this()
    def this(name: String, args: PermissionArgs, opts: CustomResourceOptions) = this()
  }
  
  var CustomRuntime: Runtime = js.native
  var DotnetCore1d0Runtime: Runtime = js.native
  var DotnetCore2d0Runtime: Runtime = js.native
  var DotnetCore2d1Runtime: Runtime = js.native
  var Go1dxRuntime: Runtime = js.native
  var Java8Runtime: Runtime = js.native
  var NodeJS10dXRuntime: Runtime = js.native
  var NodeJS4d3EdgeRuntime: Runtime = js.native
  var NodeJS4d3Runtime: Runtime = js.native
  var NodeJS6d10Runtime: Runtime = js.native
  var NodeJS8d10Runtime: Runtime = js.native
  var NodeJSRuntime: Runtime = js.native
  var Python2d7Runtime: Runtime = js.native
  var Python3d6Runtime: Runtime = js.native
  var Python3d7Runtime: Runtime = js.native
  var Ruby2d5Runtime: Runtime = js.native
  def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R]): typings.atPulumiAws.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
  def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): typings.atPulumiAws.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
  def getFunction(args: GetFunctionArgs): js.Promise[GetFunctionResult] with GetFunctionResult = js.native
  def getFunction(args: GetFunctionArgs, opts: InvokeOptions): js.Promise[GetFunctionResult] with GetFunctionResult = js.native
  def getInvocation(args: GetInvocationArgs): js.Promise[GetInvocationResult] with GetInvocationResult = js.native
  def getInvocation(args: GetInvocationArgs, opts: InvokeOptions): js.Promise[GetInvocationResult] with GetInvocationResult = js.native
  def getLayerVersion(args: GetLayerVersionArgs): js.Promise[GetLayerVersionResult] with GetLayerVersionResult = js.native
  def getLayerVersion(args: GetLayerVersionArgs, opts: InvokeOptions): js.Promise[GetLayerVersionResult] with GetLayerVersionResult = js.native
  def isEventHandler(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/lambdaMixins.EventHandler<any, any> */ Boolean = js.native
  /* static members */
  @js.native
  object Alias extends js.Object {
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.lambdaAliasMod.Alias = js.native
    def get(name: String, id: Input[ID], state: AliasState): typings.atPulumiAws.lambdaAliasMod.Alias = js.native
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typings.atPulumiAws.lambdaAliasMod.Alias = js.native
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/alias.Alias */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EventSourceMapping extends js.Object {
    /**
      * Get an existing EventSourceMapping resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.lambdaEventSourceMappingMod.EventSourceMapping = js.native
    def get(name: String, id: Input[ID], state: EventSourceMappingState): typings.atPulumiAws.lambdaEventSourceMappingMod.EventSourceMapping = js.native
    def get(name: String, id: Input[ID], state: EventSourceMappingState, opts: CustomResourceOptions): typings.atPulumiAws.lambdaEventSourceMappingMod.EventSourceMapping = js.native
    /**
      * Returns true if the given object is an instance of EventSourceMapping.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/eventSourceMapping.EventSourceMapping */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Function extends js.Object {
    /**
      * Get an existing Function resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
    def get(name: String, id: Input[ID], state: FunctionState): typings.atPulumiAws.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
    def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): typings.atPulumiAws.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
    /**
      * Returns true if the given object is an instance of Function.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/lambdaMixins.@pulumi/aws/lambda/function.Function */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LayerVersion extends js.Object {
    /**
      * Get an existing LayerVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.lambdaLayerVersionMod.LayerVersion = js.native
    def get(name: String, id: Input[ID], state: LayerVersionState): typings.atPulumiAws.lambdaLayerVersionMod.LayerVersion = js.native
    def get(name: String, id: Input[ID], state: LayerVersionState, opts: CustomResourceOptions): typings.atPulumiAws.lambdaLayerVersionMod.LayerVersion = js.native
    /**
      * Returns true if the given object is an instance of LayerVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/layerVersion.LayerVersion */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Permission extends js.Object {
    /**
      * Get an existing Permission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.lambdaPermissionMod.Permission = js.native
    def get(name: String, id: Input[ID], state: PermissionState): typings.atPulumiAws.lambdaPermissionMod.Permission = js.native
    def get(name: String, id: Input[ID], state: PermissionState, opts: CustomResourceOptions): typings.atPulumiAws.lambdaPermissionMod.Permission = js.native
    /**
      * Returns true if the given object is an instance of Permission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/permission.Permission */ Boolean = js.native
  }
  
}

