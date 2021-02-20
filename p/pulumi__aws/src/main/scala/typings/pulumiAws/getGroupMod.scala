package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGroupMod {
  
  @JSImport("@pulumi/aws/autoscaling/getGroup", "getGroup")
  @js.native
  def getGroup(args: GetGroupArgs): js.Promise[GetGroupResult] = js.native
  @JSImport("@pulumi/aws/autoscaling/getGroup", "getGroup")
  @js.native
  def getGroup(args: GetGroupArgs, opts: InvokeOptions): js.Promise[GetGroupResult] = js.native
  
  @js.native
  trait GetGroupArgs extends StObject {
    
    /**
      * Specify the exact name of the desired autoscaling group.
      */
    val name: String = js.native
  }
  object GetGroupArgs {
    
    @scala.inline
    def apply(name: String): GetGroupArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetGroupArgs]
    }
    
    @scala.inline
    implicit class GetGroupArgsMutableBuilder[Self <: GetGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetGroupResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the Auto Scaling group.
      */
    val arn: String = js.native
    
    /**
      * One or more Availability Zones for the group.
      */
    val availabilityZones: js.Array[String] = js.native
    
    val defaultCooldown: Double = js.native
    
    /**
      * The desired size of the group.
      */
    val desiredCapacity: Double = js.native
    
    /**
      * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
      */
    val healthCheckGracePeriod: Double = js.native
    
    /**
      * The service to use for the health checks. The valid values are EC2 and ELB.
      */
    val healthCheckType: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The name of the associated launch configuration.
      */
    val launchConfiguration: String = js.native
    
    /**
      * One or more load balancers associated with the group.
      */
    val loadBalancers: js.Array[String] = js.native
    
    /**
      * The maximum size of the group.
      */
    val maxSize: Double = js.native
    
    /**
      * The minimum size of the group.
      */
    val minSize: Double = js.native
    
    /**
      * Name of the Auto Scaling Group.
      */
    val name: String = js.native
    
    val newInstancesProtectedFromScaleIn: Boolean = js.native
    
    /**
      * The name of the placement group into which to launch your instances, if any. For more information, see Placement Groups (http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the Amazon Elastic Compute Cloud User Guide.
      */
    val placementGroup: String = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
      */
    val serviceLinkedRoleArn: String = js.native
    
    /**
      * The current state of the group when DeleteAutoScalingGroup is in progress.
      */
    val status: String = js.native
    
    /**
      * The Amazon Resource Names (ARN) of the target groups for your load balancer.
      */
    val targetGroupArns: js.Array[String] = js.native
    
    /**
      * The termination policies for the group.
      */
    val terminationPolicies: js.Array[String] = js.native
    
    /**
      * VPC ID for the group.
      */
    val vpcZoneIdentifier: String = js.native
  }
  object GetGroupResult {
    
    @scala.inline
    def apply(
      arn: String,
      availabilityZones: js.Array[String],
      defaultCooldown: Double,
      desiredCapacity: Double,
      healthCheckGracePeriod: Double,
      healthCheckType: String,
      id: String,
      launchConfiguration: String,
      loadBalancers: js.Array[String],
      maxSize: Double,
      minSize: Double,
      name: String,
      newInstancesProtectedFromScaleIn: Boolean,
      placementGroup: String,
      serviceLinkedRoleArn: String,
      status: String,
      targetGroupArns: js.Array[String],
      terminationPolicies: js.Array[String],
      vpcZoneIdentifier: String
    ): GetGroupResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], defaultCooldown = defaultCooldown.asInstanceOf[js.Any], desiredCapacity = desiredCapacity.asInstanceOf[js.Any], healthCheckGracePeriod = healthCheckGracePeriod.asInstanceOf[js.Any], healthCheckType = healthCheckType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], launchConfiguration = launchConfiguration.asInstanceOf[js.Any], loadBalancers = loadBalancers.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn.asInstanceOf[js.Any], placementGroup = placementGroup.asInstanceOf[js.Any], serviceLinkedRoleArn = serviceLinkedRoleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetGroupArns = targetGroupArns.asInstanceOf[js.Any], terminationPolicies = terminationPolicies.asInstanceOf[js.Any], vpcZoneIdentifier = vpcZoneIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetGroupResult]
    }
    
    @scala.inline
    implicit class GetGroupResultMutableBuilder[Self <: GetGroupResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setDefaultCooldown(value: Double): Self = StObject.set(x, "defaultCooldown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesiredCapacity(value: Double): Self = StObject.set(x, "desiredCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckGracePeriod(value: Double): Self = StObject.set(x, "healthCheckGracePeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckType(value: String): Self = StObject.set(x, "healthCheckType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchConfiguration(value: String): Self = StObject.set(x, "launchConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancers(value: js.Array[String]): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancersVarargs(value: String*): Self = StObject.set(x, "loadBalancers", js.Array(value :_*))
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewInstancesProtectedFromScaleIn(value: Boolean): Self = StObject.set(x, "newInstancesProtectedFromScaleIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementGroup(value: String): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceLinkedRoleArn(value: String): Self = StObject.set(x, "serviceLinkedRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGroupArns(value: js.Array[String]): Self = StObject.set(x, "targetGroupArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGroupArnsVarargs(value: String*): Self = StObject.set(x, "targetGroupArns", js.Array(value :_*))
      
      @scala.inline
      def setTerminationPolicies(value: js.Array[String]): Self = StObject.set(x, "terminationPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminationPoliciesVarargs(value: String*): Self = StObject.set(x, "terminationPolicies", js.Array(value :_*))
      
      @scala.inline
      def setVpcZoneIdentifier(value: String): Self = StObject.set(x, "vpcZoneIdentifier", value.asInstanceOf[js.Any])
    }
  }
}
