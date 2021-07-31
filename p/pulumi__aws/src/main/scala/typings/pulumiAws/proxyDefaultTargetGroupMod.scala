package typings.pulumiAws

import typings.pulumiAws.outputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyDefaultTargetGroupMod {
  
  @JSImport("@pulumi/aws/rds/proxyDefaultTargetGroup", "ProxyDefaultTargetGroup")
  @js.native
  class ProxyDefaultTargetGroup protected () extends CustomResource {
    /**
      * Create a ProxyDefaultTargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProxyDefaultTargetGroupArgs) = this()
    def this(name: String, args: ProxyDefaultTargetGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) representing the target group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The settings that determine the size and behavior of the connection pool for the target group.
      */
    val connectionPoolConfig: Output_[ProxyDefaultTargetGroupConnectionPoolConfig] = js.native
    
    /**
      * Name of the RDS DB Proxy.
      */
    val dbProxyName: Output_[String] = js.native
    
    /**
      * The name of the default target group.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object ProxyDefaultTargetGroup {
    
    @JSImport("@pulumi/aws/rds/proxyDefaultTargetGroup", "ProxyDefaultTargetGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ProxyDefaultTargetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ProxyDefaultTargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ProxyDefaultTargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ProxyDefaultTargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ProxyDefaultTargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyDefaultTargetGroupState): ProxyDefaultTargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ProxyDefaultTargetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyDefaultTargetGroupState, opts: CustomResourceOptions): ProxyDefaultTargetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ProxyDefaultTargetGroup]
    
    /**
      * Returns true if the given object is an instance of ProxyDefaultTargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxyDefaultTargetGroup.ProxyDefaultTargetGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/proxyDefaultTargetGroup.ProxyDefaultTargetGroup */ Boolean]
  }
  
  trait ProxyDefaultTargetGroupArgs extends StObject {
    
    /**
      * The settings that determine the size and behavior of the connection pool for the target group.
      */
    val connectionPoolConfig: Input[typings.pulumiAws.inputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig]
    
    /**
      * Name of the RDS DB Proxy.
      */
    val dbProxyName: Input[String]
  }
  object ProxyDefaultTargetGroupArgs {
    
    @scala.inline
    def apply(
      connectionPoolConfig: Input[typings.pulumiAws.inputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig],
      dbProxyName: Input[String]
    ): ProxyDefaultTargetGroupArgs = {
      val __obj = js.Dynamic.literal(connectionPoolConfig = connectionPoolConfig.asInstanceOf[js.Any], dbProxyName = dbProxyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyDefaultTargetGroupArgs]
    }
    
    @scala.inline
    implicit class ProxyDefaultTargetGroupArgsMutableBuilder[Self <: ProxyDefaultTargetGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionPoolConfig(value: Input[typings.pulumiAws.inputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig]): Self = StObject.set(x, "connectionPoolConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbProxyName(value: Input[String]): Self = StObject.set(x, "dbProxyName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProxyDefaultTargetGroupState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) representing the target group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The settings that determine the size and behavior of the connection pool for the target group.
      */
    val connectionPoolConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig]
      ] = js.undefined
    
    /**
      * Name of the RDS DB Proxy.
      */
    val dbProxyName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the default target group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object ProxyDefaultTargetGroupState {
    
    @scala.inline
    def apply(): ProxyDefaultTargetGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyDefaultTargetGroupState]
    }
    
    @scala.inline
    implicit class ProxyDefaultTargetGroupStateMutableBuilder[Self <: ProxyDefaultTargetGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setConnectionPoolConfig(value: Input[typings.pulumiAws.inputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig]): Self = StObject.set(x, "connectionPoolConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionPoolConfigUndefined: Self = StObject.set(x, "connectionPoolConfig", js.undefined)
      
      @scala.inline
      def setDbProxyName(value: Input[String]): Self = StObject.set(x, "dbProxyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbProxyNameUndefined: Self = StObject.set(x, "dbProxyName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
