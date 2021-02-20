package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyTargetMod {
  
  @JSImport("@pulumi/aws/rds/proxyTarget", "ProxyTarget")
  @js.native
  class ProxyTarget protected () extends CustomResource {
    /**
      * Create a ProxyTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProxyTargetArgs) = this()
    def this(name: String, args: ProxyTargetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * DB cluster identifier.
      */
    val dbClusterIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * DB instance identifier.
      */
    val dbInstanceIdentifier: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the DB proxy.
      */
    val dbProxyName: Output_[String] = js.native
    
    /**
      * Hostname for the target RDS DB Instance. Only returned for `RDS_INSTANCE` type.
      */
    val endpoint: Output_[String] = js.native
    
    /**
      * Port for the target RDS DB Instance or Aurora DB Cluster.
      */
    val port: Output_[Double] = js.native
    
    /**
      * Identifier representing the DB Instance or DB Cluster target.
      */
    val rdsResourceId: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) for the DB instance or DB cluster. Currently not returned by the RDS API.
      */
    val targetArn: Output_[String] = js.native
    
    /**
      * The name of the target group.
      */
    val targetGroupName: Output_[String] = js.native
    
    /**
      * DB Cluster identifier for the DB Instance target. Not returned unless manually importing an `RDS_INSTANCE` target that is part of a DB Cluster.
      */
    val trackedClusterId: Output_[String] = js.native
    
    /**
      * Type of target. e.g. `RDS_INSTANCE` or `TRACKED_CLUSTER`
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object ProxyTarget {
    
    /**
      * Get an existing ProxyTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds/proxyTarget", "ProxyTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): ProxyTarget = js.native
    @JSImport("@pulumi/aws/rds/proxyTarget", "ProxyTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ProxyTarget = js.native
    @JSImport("@pulumi/aws/rds/proxyTarget", "ProxyTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyTargetState): ProxyTarget = js.native
    @JSImport("@pulumi/aws/rds/proxyTarget", "ProxyTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyTargetState, opts: CustomResourceOptions): ProxyTarget = js.native
    
    /**
      * Returns true if the given object is an instance of ProxyTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds/proxyTarget", "ProxyTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxyTarget.ProxyTarget */ Boolean = js.native
  }
  
  @js.native
  trait ProxyTargetArgs extends StObject {
    
    /**
      * DB cluster identifier.
      */
    val dbClusterIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * DB instance identifier.
      */
    val dbInstanceIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the DB proxy.
      */
    val dbProxyName: Input[String] = js.native
    
    /**
      * The name of the target group.
      */
    val targetGroupName: Input[String] = js.native
  }
  object ProxyTargetArgs {
    
    @scala.inline
    def apply(dbProxyName: Input[String], targetGroupName: Input[String]): ProxyTargetArgs = {
      val __obj = js.Dynamic.literal(dbProxyName = dbProxyName.asInstanceOf[js.Any], targetGroupName = targetGroupName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyTargetArgs]
    }
    
    @scala.inline
    implicit class ProxyTargetArgsMutableBuilder[Self <: ProxyTargetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbClusterIdentifier(value: Input[String]): Self = StObject.set(x, "dbClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterIdentifierUndefined: Self = StObject.set(x, "dbClusterIdentifier", js.undefined)
      
      @scala.inline
      def setDbInstanceIdentifier(value: Input[String]): Self = StObject.set(x, "dbInstanceIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "dbInstanceIdentifier", js.undefined)
      
      @scala.inline
      def setDbProxyName(value: Input[String]): Self = StObject.set(x, "dbProxyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGroupName(value: Input[String]): Self = StObject.set(x, "targetGroupName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProxyTargetState extends StObject {
    
    /**
      * DB cluster identifier.
      */
    val dbClusterIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * DB instance identifier.
      */
    val dbInstanceIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the DB proxy.
      */
    val dbProxyName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Hostname for the target RDS DB Instance. Only returned for `RDS_INSTANCE` type.
      */
    val endpoint: js.UndefOr[Input[String]] = js.native
    
    /**
      * Port for the target RDS DB Instance or Aurora DB Cluster.
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Identifier representing the DB Instance or DB Cluster target.
      */
    val rdsResourceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) for the DB instance or DB cluster. Currently not returned by the RDS API.
      */
    val targetArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the target group.
      */
    val targetGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * DB Cluster identifier for the DB Instance target. Not returned unless manually importing an `RDS_INSTANCE` target that is part of a DB Cluster.
      */
    val trackedClusterId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Type of target. e.g. `RDS_INSTANCE` or `TRACKED_CLUSTER`
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object ProxyTargetState {
    
    @scala.inline
    def apply(): ProxyTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyTargetState]
    }
    
    @scala.inline
    implicit class ProxyTargetStateMutableBuilder[Self <: ProxyTargetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbClusterIdentifier(value: Input[String]): Self = StObject.set(x, "dbClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterIdentifierUndefined: Self = StObject.set(x, "dbClusterIdentifier", js.undefined)
      
      @scala.inline
      def setDbInstanceIdentifier(value: Input[String]): Self = StObject.set(x, "dbInstanceIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "dbInstanceIdentifier", js.undefined)
      
      @scala.inline
      def setDbProxyName(value: Input[String]): Self = StObject.set(x, "dbProxyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbProxyNameUndefined: Self = StObject.set(x, "dbProxyName", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRdsResourceId(value: Input[String]): Self = StObject.set(x, "rdsResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRdsResourceIdUndefined: Self = StObject.set(x, "rdsResourceId", js.undefined)
      
      @scala.inline
      def setTargetArn(value: Input[String]): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
      
      @scala.inline
      def setTargetGroupName(value: Input[String]): Self = StObject.set(x, "targetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGroupNameUndefined: Self = StObject.set(x, "targetGroupName", js.undefined)
      
      @scala.inline
      def setTrackedClusterId(value: Input[String]): Self = StObject.set(x, "trackedClusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackedClusterIdUndefined: Self = StObject.set(x, "trackedClusterId", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
