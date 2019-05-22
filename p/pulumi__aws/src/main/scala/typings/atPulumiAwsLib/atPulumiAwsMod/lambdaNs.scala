package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lambda")
@js.native
object lambdaNs extends js.Object {
  @js.native
  class Alias protected ()
    extends atPulumiAwsLib.lambdaMod.Alias {
    /**
      * Create a Alias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaAliasMod.AliasArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaAliasMod.AliasArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class CallbackFunction[E, R] protected ()
    extends atPulumiAwsLib.lambdaMod.CallbackFunction[E, R] {
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaLambdaMixinsMod.CallbackFunctionArgs[E, R]) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaLambdaMixinsMod.CallbackFunctionArgs[E, R], opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class EventSourceMapping protected ()
    extends atPulumiAwsLib.lambdaMod.EventSourceMapping {
    /**
      * Create a EventSourceMapping resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMappingArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMappingArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class EventSubscription protected ()
    extends atPulumiAwsLib.lambdaMod.EventSubscription {
    def this(`type`: java.lang.String, name: java.lang.String) = this()
    def this(`type`: java.lang.String, name: java.lang.String, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  @js.native
  class Function protected ()
    extends atPulumiAwsLib.lambdaMod.Function {
    /**
      * Create a Function resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaFunctionMod.FunctionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaFunctionMod.FunctionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LayerVersion protected ()
    extends atPulumiAwsLib.lambdaMod.LayerVersion {
    /**
      * Create a LayerVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaLayerVersionMod.LayerVersionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaLayerVersionMod.LayerVersionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Permission protected ()
    extends atPulumiAwsLib.lambdaMod.Permission {
    /**
      * Create a Permission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaPermissionMod.PermissionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.lambdaPermissionMod.PermissionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  var CustomRuntime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var DotnetCore1d0Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var DotnetCore2d0Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var DotnetCore2d1Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var Go1dxRuntime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var Java8Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJS10dXRuntime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJS4d3EdgeRuntime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJS4d3Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJS6d10Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJS8d10Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJSRuntime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var Python2d7Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var Python3d6Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  def getFunction(args: atPulumiAwsLib.lambdaGetFunctionMod.GetFunctionArgs): js.Promise[atPulumiAwsLib.lambdaGetFunctionMod.GetFunctionResult] = js.native
  def getFunction(
    args: atPulumiAwsLib.lambdaGetFunctionMod.GetFunctionArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.lambdaGetFunctionMod.GetFunctionResult] = js.native
  def getInvocation(args: atPulumiAwsLib.lambdaGetInvocationMod.GetInvocationArgs): js.Promise[atPulumiAwsLib.lambdaGetInvocationMod.GetInvocationResult] = js.native
  def getInvocation(
    args: atPulumiAwsLib.lambdaGetInvocationMod.GetInvocationArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.lambdaGetInvocationMod.GetInvocationResult] = js.native
  def getLayerVersion(args: atPulumiAwsLib.lambdaGetLayerVersionMod.GetLayerVersionArgs): js.Promise[atPulumiAwsLib.lambdaGetLayerVersionMod.GetLayerVersionResult] = js.native
  def getLayerVersion(
    args: atPulumiAwsLib.lambdaGetLayerVersionMod.GetLayerVersionArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.lambdaGetLayerVersionMod.GetLayerVersionResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lambdaAliasMod.Alias = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lambdaAliasMod.AliasState
    ): atPulumiAwsLib.lambdaAliasMod.Alias = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lambdaAliasMod.AliasState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.lambdaAliasMod.Alias = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMapping = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMappingState
    ): atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMapping = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMappingState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMapping = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lambdaFunctionMod.FunctionState
    ): atPulumiAwsLib.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lambdaFunctionMod.FunctionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lambdaLayerVersionMod.LayerVersion = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lambdaLayerVersionMod.LayerVersionState
    ): atPulumiAwsLib.lambdaLayerVersionMod.LayerVersion = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lambdaLayerVersionMod.LayerVersionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.lambdaLayerVersionMod.LayerVersion = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lambdaPermissionMod.Permission = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lambdaPermissionMod.PermissionState
    ): atPulumiAwsLib.lambdaPermissionMod.Permission = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.lambdaPermissionMod.PermissionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.lambdaPermissionMod.Permission = js.native
  }
  
}

