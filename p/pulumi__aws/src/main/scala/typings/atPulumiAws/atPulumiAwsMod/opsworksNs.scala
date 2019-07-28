package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.opsworksApplicationMod.ApplicationArgs
import typings.atPulumiAws.opsworksApplicationMod.ApplicationState
import typings.atPulumiAws.opsworksCustomLayerMod.CustomLayerArgs
import typings.atPulumiAws.opsworksCustomLayerMod.CustomLayerState
import typings.atPulumiAws.opsworksGangliaLayerMod.GangliaLayerArgs
import typings.atPulumiAws.opsworksGangliaLayerMod.GangliaLayerState
import typings.atPulumiAws.opsworksHaproxyLayerMod.HaproxyLayerArgs
import typings.atPulumiAws.opsworksHaproxyLayerMod.HaproxyLayerState
import typings.atPulumiAws.opsworksInstanceMod.InstanceArgs
import typings.atPulumiAws.opsworksInstanceMod.InstanceState
import typings.atPulumiAws.opsworksJavaAppLayerMod.JavaAppLayerArgs
import typings.atPulumiAws.opsworksJavaAppLayerMod.JavaAppLayerState
import typings.atPulumiAws.opsworksMemcachedLayerMod.MemcachedLayerArgs
import typings.atPulumiAws.opsworksMemcachedLayerMod.MemcachedLayerState
import typings.atPulumiAws.opsworksMysqlLayerMod.MysqlLayerArgs
import typings.atPulumiAws.opsworksMysqlLayerMod.MysqlLayerState
import typings.atPulumiAws.opsworksNodejsAppLayerMod.NodejsAppLayerArgs
import typings.atPulumiAws.opsworksNodejsAppLayerMod.NodejsAppLayerState
import typings.atPulumiAws.opsworksPermissionMod.PermissionArgs
import typings.atPulumiAws.opsworksPermissionMod.PermissionState
import typings.atPulumiAws.opsworksPhpAppLayerMod.PhpAppLayerArgs
import typings.atPulumiAws.opsworksPhpAppLayerMod.PhpAppLayerState
import typings.atPulumiAws.opsworksRailsAppLayerMod.RailsAppLayerArgs
import typings.atPulumiAws.opsworksRailsAppLayerMod.RailsAppLayerState
import typings.atPulumiAws.opsworksRdsDbInstanceMod.RdsDbInstanceArgs
import typings.atPulumiAws.opsworksRdsDbInstanceMod.RdsDbInstanceState
import typings.atPulumiAws.opsworksStackMod.StackArgs
import typings.atPulumiAws.opsworksStackMod.StackState
import typings.atPulumiAws.opsworksStaticWebLayerMod.StaticWebLayerArgs
import typings.atPulumiAws.opsworksStaticWebLayerMod.StaticWebLayerState
import typings.atPulumiAws.opsworksUserProfileMod.UserProfileArgs
import typings.atPulumiAws.opsworksUserProfileMod.UserProfileState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "opsworks")
@js.native
object opsworksNs extends js.Object {
  @js.native
  class Application protected ()
    extends typings.atPulumiAws.opsworksMod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class CustomLayer protected ()
    extends typings.atPulumiAws.opsworksMod.CustomLayer {
    /**
      * Create a CustomLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CustomLayerArgs) = this()
    def this(name: String, args: CustomLayerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class GangliaLayer protected ()
    extends typings.atPulumiAws.opsworksMod.GangliaLayer {
    /**
      * Create a GangliaLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GangliaLayerArgs) = this()
    def this(name: String, args: GangliaLayerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class HaproxyLayer protected ()
    extends typings.atPulumiAws.opsworksMod.HaproxyLayer {
    /**
      * Create a HaproxyLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HaproxyLayerArgs) = this()
    def this(name: String, args: HaproxyLayerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Instance protected ()
    extends typings.atPulumiAws.opsworksMod.Instance {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceArgs) = this()
    def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class JavaAppLayer protected ()
    extends typings.atPulumiAws.opsworksMod.JavaAppLayer {
    /**
      * Create a JavaAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JavaAppLayerArgs) = this()
    def this(name: String, args: JavaAppLayerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MemcachedLayer protected ()
    extends typings.atPulumiAws.opsworksMod.MemcachedLayer {
    /**
      * Create a MemcachedLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MemcachedLayerArgs) = this()
    def this(name: String, args: MemcachedLayerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MysqlLayer protected ()
    extends typings.atPulumiAws.opsworksMod.MysqlLayer {
    /**
      * Create a MysqlLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MysqlLayerArgs) = this()
    def this(name: String, args: MysqlLayerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NodejsAppLayer protected ()
    extends typings.atPulumiAws.opsworksMod.NodejsAppLayer {
    /**
      * Create a NodejsAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NodejsAppLayerArgs) = this()
    def this(name: String, args: NodejsAppLayerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Permission protected ()
    extends typings.atPulumiAws.opsworksMod.Permission {
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
  
  @js.native
  class PhpAppLayer protected ()
    extends typings.atPulumiAws.opsworksMod.PhpAppLayer {
    /**
      * Create a PhpAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PhpAppLayerArgs) = this()
    def this(name: String, args: PhpAppLayerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RailsAppLayer protected ()
    extends typings.atPulumiAws.opsworksMod.RailsAppLayer {
    /**
      * Create a RailsAppLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RailsAppLayerArgs) = this()
    def this(name: String, args: RailsAppLayerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RdsDbInstance protected ()
    extends typings.atPulumiAws.opsworksMod.RdsDbInstance {
    /**
      * Create a RdsDbInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RdsDbInstanceArgs) = this()
    def this(name: String, args: RdsDbInstanceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Stack protected ()
    extends typings.atPulumiAws.opsworksMod.Stack {
    /**
      * Create a Stack resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StackArgs) = this()
    def this(name: String, args: StackArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class StaticWebLayer protected ()
    extends typings.atPulumiAws.opsworksMod.StaticWebLayer {
    /**
      * Create a StaticWebLayer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StaticWebLayerArgs) = this()
    def this(name: String, args: StaticWebLayerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserProfile protected ()
    extends typings.atPulumiAws.opsworksMod.UserProfile {
    /**
      * Create a UserProfile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserProfileArgs) = this()
    def this(name: String, args: UserProfileArgs, opts: CustomResourceOptions) = this()
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typings.atPulumiAws.opsworksApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksApplicationMod.Application = js.native
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/application.Application */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksCustomLayerMod.CustomLayer = js.native
    def get(name: String, id: Input[ID], state: CustomLayerState): typings.atPulumiAws.opsworksCustomLayerMod.CustomLayer = js.native
    def get(name: String, id: Input[ID], state: CustomLayerState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksCustomLayerMod.CustomLayer = js.native
    /**
      * Returns true if the given object is an instance of CustomLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/customLayer.CustomLayer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksGangliaLayerMod.GangliaLayer = js.native
    def get(name: String, id: Input[ID], state: GangliaLayerState): typings.atPulumiAws.opsworksGangliaLayerMod.GangliaLayer = js.native
    def get(name: String, id: Input[ID], state: GangliaLayerState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksGangliaLayerMod.GangliaLayer = js.native
    /**
      * Returns true if the given object is an instance of GangliaLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/gangliaLayer.GangliaLayer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksHaproxyLayerMod.HaproxyLayer = js.native
    def get(name: String, id: Input[ID], state: HaproxyLayerState): typings.atPulumiAws.opsworksHaproxyLayerMod.HaproxyLayer = js.native
    def get(name: String, id: Input[ID], state: HaproxyLayerState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksHaproxyLayerMod.HaproxyLayer = js.native
    /**
      * Returns true if the given object is an instance of HaproxyLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/haproxyLayer.HaproxyLayer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksInstanceMod.Instance = js.native
    def get(name: String, id: Input[ID], state: InstanceState): typings.atPulumiAws.opsworksInstanceMod.Instance = js.native
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksInstanceMod.Instance = js.native
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/instance.Instance */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksJavaAppLayerMod.JavaAppLayer = js.native
    def get(name: String, id: Input[ID], state: JavaAppLayerState): typings.atPulumiAws.opsworksJavaAppLayerMod.JavaAppLayer = js.native
    def get(name: String, id: Input[ID], state: JavaAppLayerState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksJavaAppLayerMod.JavaAppLayer = js.native
    /**
      * Returns true if the given object is an instance of JavaAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/javaAppLayer.JavaAppLayer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksMemcachedLayerMod.MemcachedLayer = js.native
    def get(name: String, id: Input[ID], state: MemcachedLayerState): typings.atPulumiAws.opsworksMemcachedLayerMod.MemcachedLayer = js.native
    def get(name: String, id: Input[ID], state: MemcachedLayerState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksMemcachedLayerMod.MemcachedLayer = js.native
    /**
      * Returns true if the given object is an instance of MemcachedLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/memcachedLayer.MemcachedLayer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksMysqlLayerMod.MysqlLayer = js.native
    def get(name: String, id: Input[ID], state: MysqlLayerState): typings.atPulumiAws.opsworksMysqlLayerMod.MysqlLayer = js.native
    def get(name: String, id: Input[ID], state: MysqlLayerState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksMysqlLayerMod.MysqlLayer = js.native
    /**
      * Returns true if the given object is an instance of MysqlLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/mysqlLayer.MysqlLayer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksNodejsAppLayerMod.NodejsAppLayer = js.native
    def get(name: String, id: Input[ID], state: NodejsAppLayerState): typings.atPulumiAws.opsworksNodejsAppLayerMod.NodejsAppLayer = js.native
    def get(name: String, id: Input[ID], state: NodejsAppLayerState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksNodejsAppLayerMod.NodejsAppLayer = js.native
    /**
      * Returns true if the given object is an instance of NodejsAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/nodejsAppLayer.NodejsAppLayer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksPermissionMod.Permission = js.native
    def get(name: String, id: Input[ID], state: PermissionState): typings.atPulumiAws.opsworksPermissionMod.Permission = js.native
    def get(name: String, id: Input[ID], state: PermissionState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksPermissionMod.Permission = js.native
    /**
      * Returns true if the given object is an instance of Permission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/permission.Permission */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksPhpAppLayerMod.PhpAppLayer = js.native
    def get(name: String, id: Input[ID], state: PhpAppLayerState): typings.atPulumiAws.opsworksPhpAppLayerMod.PhpAppLayer = js.native
    def get(name: String, id: Input[ID], state: PhpAppLayerState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksPhpAppLayerMod.PhpAppLayer = js.native
    /**
      * Returns true if the given object is an instance of PhpAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/phpAppLayer.PhpAppLayer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksRailsAppLayerMod.RailsAppLayer = js.native
    def get(name: String, id: Input[ID], state: RailsAppLayerState): typings.atPulumiAws.opsworksRailsAppLayerMod.RailsAppLayer = js.native
    def get(name: String, id: Input[ID], state: RailsAppLayerState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksRailsAppLayerMod.RailsAppLayer = js.native
    /**
      * Returns true if the given object is an instance of RailsAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/railsAppLayer.RailsAppLayer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
    def get(name: String, id: Input[ID], state: RdsDbInstanceState): typings.atPulumiAws.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
    def get(name: String, id: Input[ID], state: RdsDbInstanceState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksRdsDbInstanceMod.RdsDbInstance = js.native
    /**
      * Returns true if the given object is an instance of RdsDbInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/rdsDbInstance.RdsDbInstance */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksStackMod.Stack = js.native
    def get(name: String, id: Input[ID], state: StackState): typings.atPulumiAws.opsworksStackMod.Stack = js.native
    def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksStackMod.Stack = js.native
    /**
      * Returns true if the given object is an instance of Stack.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/stack.Stack */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksStaticWebLayerMod.StaticWebLayer = js.native
    def get(name: String, id: Input[ID], state: StaticWebLayerState): typings.atPulumiAws.opsworksStaticWebLayerMod.StaticWebLayer = js.native
    def get(name: String, id: Input[ID], state: StaticWebLayerState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksStaticWebLayerMod.StaticWebLayer = js.native
    /**
      * Returns true if the given object is an instance of StaticWebLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/staticWebLayer.StaticWebLayer */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.opsworksUserProfileMod.UserProfile = js.native
    def get(name: String, id: Input[ID], state: UserProfileState): typings.atPulumiAws.opsworksUserProfileMod.UserProfile = js.native
    def get(name: String, id: Input[ID], state: UserProfileState, opts: CustomResourceOptions): typings.atPulumiAws.opsworksUserProfileMod.UserProfile = js.native
    /**
      * Returns true if the given object is an instance of UserProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/userProfile.UserProfile */ Boolean = js.native
  }
  
}

