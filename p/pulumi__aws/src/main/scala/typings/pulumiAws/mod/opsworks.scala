package typings.pulumiAws.mod

import typings.pulumiAws.customLayerMod.CustomLayerArgs
import typings.pulumiAws.customLayerMod.CustomLayerState
import typings.pulumiAws.gangliaLayerMod.GangliaLayerArgs
import typings.pulumiAws.gangliaLayerMod.GangliaLayerState
import typings.pulumiAws.haproxyLayerMod.HaproxyLayerArgs
import typings.pulumiAws.haproxyLayerMod.HaproxyLayerState
import typings.pulumiAws.javaAppLayerMod.JavaAppLayerArgs
import typings.pulumiAws.javaAppLayerMod.JavaAppLayerState
import typings.pulumiAws.memcachedLayerMod.MemcachedLayerArgs
import typings.pulumiAws.memcachedLayerMod.MemcachedLayerState
import typings.pulumiAws.mysqlLayerMod.MysqlLayerArgs
import typings.pulumiAws.mysqlLayerMod.MysqlLayerState
import typings.pulumiAws.nodejsAppLayerMod.NodejsAppLayerArgs
import typings.pulumiAws.nodejsAppLayerMod.NodejsAppLayerState
import typings.pulumiAws.opsworksApplicationMod.ApplicationArgs
import typings.pulumiAws.opsworksApplicationMod.ApplicationState
import typings.pulumiAws.opsworksInstanceMod.InstanceArgs
import typings.pulumiAws.opsworksInstanceMod.InstanceState
import typings.pulumiAws.opsworksPermissionMod.PermissionArgs
import typings.pulumiAws.opsworksPermissionMod.PermissionState
import typings.pulumiAws.opsworksStackMod.StackArgs
import typings.pulumiAws.opsworksStackMod.StackState
import typings.pulumiAws.phpAppLayerMod.PhpAppLayerArgs
import typings.pulumiAws.phpAppLayerMod.PhpAppLayerState
import typings.pulumiAws.railsAppLayerMod.RailsAppLayerArgs
import typings.pulumiAws.railsAppLayerMod.RailsAppLayerState
import typings.pulumiAws.rdsDbInstanceMod.RdsDbInstanceArgs
import typings.pulumiAws.rdsDbInstanceMod.RdsDbInstanceState
import typings.pulumiAws.staticWebLayerMod.StaticWebLayerArgs
import typings.pulumiAws.staticWebLayerMod.StaticWebLayerState
import typings.pulumiAws.userProfileMod.UserProfileArgs
import typings.pulumiAws.userProfileMod.UserProfileState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opsworks {
  
  @JSImport("@pulumi/aws", "opsworks.Application")
  @js.native
  class Application protected ()
    extends typings.pulumiAws.opsworksMod.Application {
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
  /* static members */
  object Application {
    
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.Application.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.opsworksApplicationMod.Application = js.native
    @JSImport("@pulumi/aws", "opsworks.Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.opsworksApplicationMod.Application = js.native
    @JSImport("@pulumi/aws", "opsworks.Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typings.pulumiAws.opsworksApplicationMod.Application = js.native
    @JSImport("@pulumi/aws", "opsworks.Application.get")
    @js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typings.pulumiAws.opsworksApplicationMod.Application = js.native
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.Application.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/application.Application */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.CustomLayer")
  @js.native
  class CustomLayer protected ()
    extends typings.pulumiAws.opsworksMod.CustomLayer {
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
  /* static members */
  object CustomLayer {
    
    /**
      * Get an existing CustomLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.CustomLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.customLayerMod.CustomLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.CustomLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.customLayerMod.CustomLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.CustomLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: CustomLayerState): typings.pulumiAws.customLayerMod.CustomLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.CustomLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: CustomLayerState, opts: CustomResourceOptions): typings.pulumiAws.customLayerMod.CustomLayer = js.native
    
    /**
      * Returns true if the given object is an instance of CustomLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.CustomLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/customLayer.CustomLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.GangliaLayer")
  @js.native
  class GangliaLayer protected ()
    extends typings.pulumiAws.opsworksMod.GangliaLayer {
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
  /* static members */
  object GangliaLayer {
    
    /**
      * Get an existing GangliaLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.GangliaLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.gangliaLayerMod.GangliaLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.GangliaLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.gangliaLayerMod.GangliaLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.GangliaLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: GangliaLayerState): typings.pulumiAws.gangliaLayerMod.GangliaLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.GangliaLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: GangliaLayerState, opts: CustomResourceOptions): typings.pulumiAws.gangliaLayerMod.GangliaLayer = js.native
    
    /**
      * Returns true if the given object is an instance of GangliaLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.GangliaLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/gangliaLayer.GangliaLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.HaproxyLayer")
  @js.native
  class HaproxyLayer protected ()
    extends typings.pulumiAws.opsworksMod.HaproxyLayer {
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
  /* static members */
  object HaproxyLayer {
    
    /**
      * Get an existing HaproxyLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: HaproxyLayerState): typings.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.HaproxyLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: HaproxyLayerState, opts: CustomResourceOptions): typings.pulumiAws.haproxyLayerMod.HaproxyLayer = js.native
    
    /**
      * Returns true if the given object is an instance of HaproxyLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.HaproxyLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/haproxyLayer.HaproxyLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.Instance")
  @js.native
  class Instance protected ()
    extends typings.pulumiAws.opsworksMod.Instance {
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
  /* static members */
  object Instance {
    
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.Instance.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.opsworksInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws", "opsworks.Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.opsworksInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws", "opsworks.Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState): typings.pulumiAws.opsworksInstanceMod.Instance = js.native
    @JSImport("@pulumi/aws", "opsworks.Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typings.pulumiAws.opsworksInstanceMod.Instance = js.native
    
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.Instance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/instance.Instance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.JavaAppLayer")
  @js.native
  class JavaAppLayer protected ()
    extends typings.pulumiAws.opsworksMod.JavaAppLayer {
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
  /* static members */
  object JavaAppLayer {
    
    /**
      * Get an existing JavaAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.JavaAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.javaAppLayerMod.JavaAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.JavaAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.javaAppLayerMod.JavaAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.JavaAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: JavaAppLayerState): typings.pulumiAws.javaAppLayerMod.JavaAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.JavaAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: JavaAppLayerState, opts: CustomResourceOptions): typings.pulumiAws.javaAppLayerMod.JavaAppLayer = js.native
    
    /**
      * Returns true if the given object is an instance of JavaAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.JavaAppLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/javaAppLayer.JavaAppLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.MemcachedLayer")
  @js.native
  class MemcachedLayer protected ()
    extends typings.pulumiAws.opsworksMod.MemcachedLayer {
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
  /* static members */
  object MemcachedLayer {
    
    /**
      * Get an existing MemcachedLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.MemcachedLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.MemcachedLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.MemcachedLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemcachedLayerState): typings.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.MemcachedLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemcachedLayerState, opts: CustomResourceOptions): typings.pulumiAws.memcachedLayerMod.MemcachedLayer = js.native
    
    /**
      * Returns true if the given object is an instance of MemcachedLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.MemcachedLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/memcachedLayer.MemcachedLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.MysqlLayer")
  @js.native
  class MysqlLayer protected ()
    extends typings.pulumiAws.opsworksMod.MysqlLayer {
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
  /* static members */
  object MysqlLayer {
    
    /**
      * Get an existing MysqlLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.MysqlLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.mysqlLayerMod.MysqlLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.MysqlLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.mysqlLayerMod.MysqlLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.MysqlLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: MysqlLayerState): typings.pulumiAws.mysqlLayerMod.MysqlLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.MysqlLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: MysqlLayerState, opts: CustomResourceOptions): typings.pulumiAws.mysqlLayerMod.MysqlLayer = js.native
    
    /**
      * Returns true if the given object is an instance of MysqlLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.MysqlLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/mysqlLayer.MysqlLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.NodejsAppLayer")
  @js.native
  class NodejsAppLayer protected ()
    extends typings.pulumiAws.opsworksMod.NodejsAppLayer {
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
  /* static members */
  object NodejsAppLayer {
    
    /**
      * Get an existing NodejsAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.NodejsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.nodejsAppLayerMod.NodejsAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.NodejsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.nodejsAppLayerMod.NodejsAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.NodejsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: NodejsAppLayerState): typings.pulumiAws.nodejsAppLayerMod.NodejsAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.NodejsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: NodejsAppLayerState, opts: CustomResourceOptions): typings.pulumiAws.nodejsAppLayerMod.NodejsAppLayer = js.native
    
    /**
      * Returns true if the given object is an instance of NodejsAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.NodejsAppLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/nodejsAppLayer.NodejsAppLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.Permission")
  @js.native
  class Permission protected ()
    extends typings.pulumiAws.opsworksMod.Permission {
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
  /* static members */
  object Permission {
    
    /**
      * Get an existing Permission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.Permission.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.opsworksPermissionMod.Permission = js.native
    @JSImport("@pulumi/aws", "opsworks.Permission.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.opsworksPermissionMod.Permission = js.native
    @JSImport("@pulumi/aws", "opsworks.Permission.get")
    @js.native
    def get(name: String, id: Input[ID], state: PermissionState): typings.pulumiAws.opsworksPermissionMod.Permission = js.native
    @JSImport("@pulumi/aws", "opsworks.Permission.get")
    @js.native
    def get(name: String, id: Input[ID], state: PermissionState, opts: CustomResourceOptions): typings.pulumiAws.opsworksPermissionMod.Permission = js.native
    
    /**
      * Returns true if the given object is an instance of Permission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.Permission.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/permission.Permission */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.PhpAppLayer")
  @js.native
  class PhpAppLayer protected ()
    extends typings.pulumiAws.opsworksMod.PhpAppLayer {
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
  /* static members */
  object PhpAppLayer {
    
    /**
      * Get an existing PhpAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.PhpAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.phpAppLayerMod.PhpAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.PhpAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.phpAppLayerMod.PhpAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.PhpAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: PhpAppLayerState): typings.pulumiAws.phpAppLayerMod.PhpAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.PhpAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: PhpAppLayerState, opts: CustomResourceOptions): typings.pulumiAws.phpAppLayerMod.PhpAppLayer = js.native
    
    /**
      * Returns true if the given object is an instance of PhpAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.PhpAppLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/phpAppLayer.PhpAppLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.RailsAppLayer")
  @js.native
  class RailsAppLayer protected ()
    extends typings.pulumiAws.opsworksMod.RailsAppLayer {
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
  /* static members */
  object RailsAppLayer {
    
    /**
      * Get an existing RailsAppLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.RailsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.railsAppLayerMod.RailsAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.RailsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.railsAppLayerMod.RailsAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.RailsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: RailsAppLayerState): typings.pulumiAws.railsAppLayerMod.RailsAppLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.RailsAppLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: RailsAppLayerState, opts: CustomResourceOptions): typings.pulumiAws.railsAppLayerMod.RailsAppLayer = js.native
    
    /**
      * Returns true if the given object is an instance of RailsAppLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.RailsAppLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/railsAppLayer.RailsAppLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.RdsDbInstance")
  @js.native
  class RdsDbInstance protected ()
    extends typings.pulumiAws.opsworksMod.RdsDbInstance {
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
  /* static members */
  object RdsDbInstance {
    
    /**
      * Get an existing RdsDbInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.rdsDbInstanceMod.RdsDbInstance = js.native
    @JSImport("@pulumi/aws", "opsworks.RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.rdsDbInstanceMod.RdsDbInstance = js.native
    @JSImport("@pulumi/aws", "opsworks.RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: RdsDbInstanceState): typings.pulumiAws.rdsDbInstanceMod.RdsDbInstance = js.native
    @JSImport("@pulumi/aws", "opsworks.RdsDbInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: RdsDbInstanceState, opts: CustomResourceOptions): typings.pulumiAws.rdsDbInstanceMod.RdsDbInstance = js.native
    
    /**
      * Returns true if the given object is an instance of RdsDbInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.RdsDbInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/rdsDbInstance.RdsDbInstance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.Stack")
  @js.native
  class Stack protected ()
    extends typings.pulumiAws.opsworksMod.Stack {
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
  /* static members */
  object Stack {
    
    /**
      * Get an existing Stack resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.Stack.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.opsworksStackMod.Stack = js.native
    @JSImport("@pulumi/aws", "opsworks.Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.opsworksStackMod.Stack = js.native
    @JSImport("@pulumi/aws", "opsworks.Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackState): typings.pulumiAws.opsworksStackMod.Stack = js.native
    @JSImport("@pulumi/aws", "opsworks.Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): typings.pulumiAws.opsworksStackMod.Stack = js.native
    
    /**
      * Returns true if the given object is an instance of Stack.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.Stack.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/stack.Stack */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.StaticWebLayer")
  @js.native
  class StaticWebLayer protected ()
    extends typings.pulumiAws.opsworksMod.StaticWebLayer {
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
  /* static members */
  object StaticWebLayer {
    
    /**
      * Get an existing StaticWebLayer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.StaticWebLayer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.StaticWebLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.StaticWebLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: StaticWebLayerState): typings.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
    @JSImport("@pulumi/aws", "opsworks.StaticWebLayer.get")
    @js.native
    def get(name: String, id: Input[ID], state: StaticWebLayerState, opts: CustomResourceOptions): typings.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
    
    /**
      * Returns true if the given object is an instance of StaticWebLayer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.StaticWebLayer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/staticWebLayer.StaticWebLayer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "opsworks.UserProfile")
  @js.native
  class UserProfile protected ()
    extends typings.pulumiAws.opsworksMod.UserProfile {
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
  object UserProfile {
    
    /**
      * Get an existing UserProfile resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "opsworks.UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.userProfileMod.UserProfile = js.native
    @JSImport("@pulumi/aws", "opsworks.UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.userProfileMod.UserProfile = js.native
    @JSImport("@pulumi/aws", "opsworks.UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserProfileState): typings.pulumiAws.userProfileMod.UserProfile = js.native
    @JSImport("@pulumi/aws", "opsworks.UserProfile.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserProfileState, opts: CustomResourceOptions): typings.pulumiAws.userProfileMod.UserProfile = js.native
    
    /**
      * Returns true if the given object is an instance of UserProfile.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "opsworks.UserProfile.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/userProfile.UserProfile */ Boolean = js.native
  }
}
