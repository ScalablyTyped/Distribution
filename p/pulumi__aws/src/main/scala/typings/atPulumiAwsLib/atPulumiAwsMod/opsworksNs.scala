package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "opsworks")
@js.native
object opsworksNs extends js.Object {
  @js.native
  class Application protected ()
    extends atPulumiAwsLib.opsworksMod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksApplicationMod.ApplicationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksApplicationMod.ApplicationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class CustomLayer protected ()
    extends atPulumiAwsLib.opsworksMod.CustomLayer {
    /**
      * Create a CustomLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksCustomLayerMod.CustomLayerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksCustomLayerMod.CustomLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class GangliaLayer protected ()
    extends atPulumiAwsLib.opsworksMod.GangliaLayer {
    /**
      * Create a GangliaLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksGangliaLayerMod.GangliaLayerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksGangliaLayerMod.GangliaLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class HaproxyLayer protected ()
    extends atPulumiAwsLib.opsworksMod.HaproxyLayer {
    /**
      * Create a HaproxyLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksHaproxyLayerMod.HaproxyLayerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksHaproxyLayerMod.HaproxyLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Instance protected ()
    extends atPulumiAwsLib.opsworksMod.Instance {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksInstanceMod.InstanceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksInstanceMod.InstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class JavaAppLayer protected ()
    extends atPulumiAwsLib.opsworksMod.JavaAppLayer {
    /**
      * Create a JavaAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksJavaAppLayerMod.JavaAppLayerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksJavaAppLayerMod.JavaAppLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class MemcachedLayer protected ()
    extends atPulumiAwsLib.opsworksMod.MemcachedLayer {
    /**
      * Create a MemcachedLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class MysqlLayer protected ()
    extends atPulumiAwsLib.opsworksMod.MysqlLayer {
    /**
      * Create a MysqlLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class NodejsAppLayer protected ()
    extends atPulumiAwsLib.opsworksMod.NodejsAppLayer {
    /**
      * Create a NodejsAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksNodejsAppLayerMod.NodejsAppLayerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksNodejsAppLayerMod.NodejsAppLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Permission protected ()
    extends atPulumiAwsLib.opsworksMod.Permission {
    /**
      * Create a Permission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksPermissionMod.PermissionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksPermissionMod.PermissionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class PhpAppLayer protected ()
    extends atPulumiAwsLib.opsworksMod.PhpAppLayer {
    /**
      * Create a PhpAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksPhpAppLayerMod.PhpAppLayerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksPhpAppLayerMod.PhpAppLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RailsAppLayer protected ()
    extends atPulumiAwsLib.opsworksMod.RailsAppLayer {
    /**
      * Create a RailsAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RdsDbInstance protected ()
    extends atPulumiAwsLib.opsworksMod.RdsDbInstance {
    /**
      * Create a RdsDbInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstanceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Stack protected ()
    extends atPulumiAwsLib.opsworksMod.Stack {
    /**
      * Create a Stack resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksStackMod.StackArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksStackMod.StackArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class StaticWebLayer protected ()
    extends atPulumiAwsLib.opsworksMod.StaticWebLayer {
    /**
      * Create a StaticWebLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UserProfile protected ()
    extends atPulumiAwsLib.opsworksMod.UserProfile {
    /**
      * Create a UserProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksUserProfileMod.UserProfileArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.opsworksUserProfileMod.UserProfileArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Application extends js.Object {
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksApplicationMod.Application = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksApplicationMod.ApplicationState
    ): atPulumiAwsLib.opsworksApplicationMod.Application = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksApplicationMod.ApplicationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksApplicationMod.Application = js.native
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/application.Application */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CustomLayer extends js.Object {
    /**
      * Get an existing CustomLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksCustomLayerMod.CustomLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksCustomLayerMod.CustomLayerState
    ): atPulumiAwsLib.opsworksCustomLayerMod.CustomLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksCustomLayerMod.CustomLayerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksCustomLayerMod.CustomLayer = js.native
    /**
      * Returns true if the given object is an instance of CustomLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/customLayer.CustomLayer */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GangliaLayer extends js.Object {
    /**
      * Get an existing GangliaLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksGangliaLayerMod.GangliaLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksGangliaLayerMod.GangliaLayerState
    ): atPulumiAwsLib.opsworksGangliaLayerMod.GangliaLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksGangliaLayerMod.GangliaLayerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksGangliaLayerMod.GangliaLayer = js.native
    /**
      * Returns true if the given object is an instance of GangliaLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/gangliaLayer.GangliaLayer */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object HaproxyLayer extends js.Object {
    /**
      * Get an existing HaproxyLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksHaproxyLayerMod.HaproxyLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksHaproxyLayerMod.HaproxyLayerState
    ): atPulumiAwsLib.opsworksHaproxyLayerMod.HaproxyLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksHaproxyLayerMod.HaproxyLayerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksHaproxyLayerMod.HaproxyLayer = js.native
    /**
      * Returns true if the given object is an instance of HaproxyLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/haproxyLayer.HaproxyLayer */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Instance extends js.Object {
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksInstanceMod.Instance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksInstanceMod.InstanceState
    ): atPulumiAwsLib.opsworksInstanceMod.Instance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksInstanceMod.InstanceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksInstanceMod.Instance = js.native
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/instance.Instance */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object JavaAppLayer extends js.Object {
    /**
      * Get an existing JavaAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksJavaAppLayerMod.JavaAppLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksJavaAppLayerMod.JavaAppLayerState
    ): atPulumiAwsLib.opsworksJavaAppLayerMod.JavaAppLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksJavaAppLayerMod.JavaAppLayerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksJavaAppLayerMod.JavaAppLayer = js.native
    /**
      * Returns true if the given object is an instance of JavaAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/javaAppLayer.JavaAppLayer */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MemcachedLayer extends js.Object {
    /**
      * Get an existing MemcachedLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayerState
    ): atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayer = js.native
    /**
      * Returns true if the given object is an instance of MemcachedLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/memcachedLayer.MemcachedLayer */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MysqlLayer extends js.Object {
    /**
      * Get an existing MysqlLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayerState
    ): atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayer = js.native
    /**
      * Returns true if the given object is an instance of MysqlLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/mysqlLayer.MysqlLayer */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NodejsAppLayer extends js.Object {
    /**
      * Get an existing NodejsAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksNodejsAppLayerMod.NodejsAppLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksNodejsAppLayerMod.NodejsAppLayerState
    ): atPulumiAwsLib.opsworksNodejsAppLayerMod.NodejsAppLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksNodejsAppLayerMod.NodejsAppLayerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksNodejsAppLayerMod.NodejsAppLayer = js.native
    /**
      * Returns true if the given object is an instance of NodejsAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/nodejsAppLayer.NodejsAppLayer */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksPermissionMod.Permission = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksPermissionMod.PermissionState
    ): atPulumiAwsLib.opsworksPermissionMod.Permission = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksPermissionMod.PermissionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksPermissionMod.Permission = js.native
    /**
      * Returns true if the given object is an instance of Permission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/permission.Permission */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PhpAppLayer extends js.Object {
    /**
      * Get an existing PhpAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksPhpAppLayerMod.PhpAppLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksPhpAppLayerMod.PhpAppLayerState
    ): atPulumiAwsLib.opsworksPhpAppLayerMod.PhpAppLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksPhpAppLayerMod.PhpAppLayerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksPhpAppLayerMod.PhpAppLayer = js.native
    /**
      * Returns true if the given object is an instance of PhpAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/phpAppLayer.PhpAppLayer */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RailsAppLayer extends js.Object {
    /**
      * Get an existing RailsAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayerState
    ): atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksRailsAppLayerMod.RailsAppLayer = js.native
    /**
      * Returns true if the given object is an instance of RailsAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/railsAppLayer.RailsAppLayer */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RdsDbInstance extends js.Object {
    /**
      * Get an existing RdsDbInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstanceState
    ): atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstanceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
    /**
      * Returns true if the given object is an instance of RdsDbInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/rdsDbInstance.RdsDbInstance */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Stack extends js.Object {
    /**
      * Get an existing Stack resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksStackMod.Stack = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksStackMod.StackState
    ): atPulumiAwsLib.opsworksStackMod.Stack = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksStackMod.StackState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksStackMod.Stack = js.native
    /**
      * Returns true if the given object is an instance of Stack.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/stack.Stack */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StaticWebLayer extends js.Object {
    /**
      * Get an existing StaticWebLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayerState
    ): atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayer = js.native
    /**
      * Returns true if the given object is an instance of StaticWebLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/staticWebLayer.StaticWebLayer */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserProfile extends js.Object {
    /**
      * Get an existing UserProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksUserProfileMod.UserProfile = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksUserProfileMod.UserProfileState
    ): atPulumiAwsLib.opsworksUserProfileMod.UserProfile = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.opsworksUserProfileMod.UserProfileState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.opsworksUserProfileMod.UserProfile = js.native
    /**
      * Returns true if the given object is an instance of UserProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/userProfile.UserProfile */ scala.Boolean = js.native
  }
  
}

