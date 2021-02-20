package typings.pulumiAws

import typings.pulumiAws.outputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing ProxyDefaultTargetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds/proxyDefaultTargetGroup", "ProxyDefaultTargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): ProxyDefaultTargetGroup = js.native
    @JSImport("@pulumi/aws/rds/proxyDefaultTargetGroup", "ProxyDefaultTargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ProxyDefaultTargetGroup = js.native
    @JSImport("@pulumi/aws/rds/proxyDefaultTargetGroup", "ProxyDefaultTargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyDefaultTargetGroupState): ProxyDefaultTargetGroup = js.native
    @JSImport("@pulumi/aws/rds/proxyDefaultTargetGroup", "ProxyDefaultTargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyDefaultTargetGroupState, opts: CustomResourceOptions): ProxyDefaultTargetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ProxyDefaultTargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds/proxyDefaultTargetGroup", "ProxyDefaultTargetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxyDefaultTargetGroup.ProxyDefaultTargetGroup */ Boolean = js.native
  }
  
  @js.native
  trait ProxyDefaultTargetGroupArgs extends StObject {
    
    /**
      * The settings that determine the size and behavior of the connection pool for the target group.
      */
    val connectionPoolConfig: Input[typings.pulumiAws.inputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig] = js.native
    
    /**
      * Name of the RDS DB Proxy.
      */
    val dbProxyName: Input[String] = js.native
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
  
  @js.native
  trait ProxyDefaultTargetGroupState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) representing the target group.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The settings that determine the size and behavior of the connection pool for the target group.
      */
    val connectionPoolConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig]
      ] = js.native
    
    /**
      * Name of the RDS DB Proxy.
      */
    val dbProxyName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the default target group.
      */
    val name: js.UndefOr[Input[String]] = js.native
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
