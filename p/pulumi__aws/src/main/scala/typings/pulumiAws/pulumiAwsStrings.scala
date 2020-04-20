package typings.pulumiAws

import typings.pulumiAws.applicationloadbalancingIpAddressTypeMod.IpAddressType
import typings.pulumiAws.applicationloadbalancingLoadBalancerTypeMod.LoadBalancerType
import typings.pulumiAws.cannedAclMod.CannedAcl
import typings.pulumiAws.containerMod.KernelCapability
import typings.pulumiAws.containerMod.LogDriver
import typings.pulumiAws.containerMod.Protocol
import typings.pulumiAws.containerMod.UlimitName
import typings.pulumiAws.documentsMod.Principal
import typings.pulumiAws.engineModeMod.EngineMode
import typings.pulumiAws.engineTypeMod.EngineType
import typings.pulumiAws.instancePlatformMod.InstancePlatform
import typings.pulumiAws.instanceTypeMod.InstanceType
import typings.pulumiAws.metricsMod.Metric
import typings.pulumiAws.notificationTypeMod.NotificationType
import typings.pulumiAws.parameterTypeMod.ParameterType
import typings.pulumiAws.placementStrategyMod.PlacementStrategy
import typings.pulumiAws.protocolTypeMod.ProtocolType
import typings.pulumiAws.recordTypeMod.RecordType
import typings.pulumiAws.regionMod.Region
import typings.pulumiAws.runtimesMod.Runtime
import typings.pulumiAws.storageTypeMod.StorageType
import typings.pulumiAws.tenancyMod.Tenancy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pulumiAwsStrings {
  @js.native
  sealed trait `1Minute` extends js.Object
  
  @js.native
  sealed trait `2008-10-17` extends js.Object
  
  @js.native
  sealed trait `2012-10-17` extends js.Object
  
  @js.native
  sealed trait A extends RecordType
  
  @js.native
  sealed trait AAAA extends RecordType
  
  @js.native
  sealed trait ALL extends KernelCapability
  
  @js.native
  sealed trait AT_TIMESTAMP extends js.Object
  
  @js.native
  sealed trait AUDIT_CONTROL extends KernelCapability
  
  @js.native
  sealed trait AUDIT_WRITE extends KernelCapability
  
  @js.native
  sealed trait Allow extends js.Object
  
  @js.native
  sealed trait Asterisk extends Principal
  
  @js.native
  sealed trait BLOCK_SUSPEND extends KernelCapability
  
  @js.native
  sealed trait CAA extends RecordType
  
  @js.native
  sealed trait CHOWN extends KernelCapability
  
  @js.native
  sealed trait CNAME extends RecordType
  
  @js.native
  sealed trait CompleteMultipartUpload extends js.Object
  
  @js.native
  sealed trait Copy extends js.Object
  
  @js.native
  sealed trait DAC_OVERRIDE extends KernelCapability
  
  @js.native
  sealed trait DAC_READ_SEARCH extends KernelCapability
  
  @js.native
  sealed trait Delete extends js.Object
  
  @js.native
  sealed trait DeleteMarkerCreated extends js.Object
  
  @js.native
  sealed trait Deny extends js.Object
  
  @js.native
  sealed trait FOWNER extends KernelCapability
  
  @js.native
  sealed trait FSETID extends KernelCapability
  
  @js.native
  sealed trait GroupDesiredCapacity extends Metric
  
  @js.native
  sealed trait GroupInServiceInstances extends Metric
  
  @js.native
  sealed trait GroupMaxSize extends Metric
  
  @js.native
  sealed trait GroupMinSize extends Metric
  
  @js.native
  sealed trait GroupPendingInstances extends Metric
  
  @js.native
  sealed trait GroupStandbyInstances extends Metric
  
  @js.native
  sealed trait GroupTerminatingInstances extends Metric
  
  @js.native
  sealed trait GroupTotalInstances extends Metric
  
  @js.native
  sealed trait INSERT extends js.Object
  
  @js.native
  sealed trait IPC_LOCK extends KernelCapability
  
  @js.native
  sealed trait IPC_OWNER extends KernelCapability
  
  @js.native
  sealed trait KILL extends KernelCapability
  
  @js.native
  sealed trait LATEST extends js.Object
  
  @js.native
  sealed trait LEASE extends KernelCapability
  
  @js.native
  sealed trait LINUX_IMMUTABLE extends KernelCapability
  
  @js.native
  sealed trait LinuxSlashUNIX extends InstancePlatform
  
  @js.native
  sealed trait MAC_ADMIN extends KernelCapability
  
  @js.native
  sealed trait MAC_OVERRIDE extends KernelCapability
  
  @js.native
  sealed trait MKNOD extends KernelCapability
  
  @js.native
  sealed trait MODIFY extends js.Object
  
  @js.native
  sealed trait MX extends RecordType
  
  @js.native
  sealed trait NAPTR extends RecordType
  
  @js.native
  sealed trait NET_ADMIN extends KernelCapability
  
  @js.native
  sealed trait NET_BIND_SERVICE extends KernelCapability
  
  @js.native
  sealed trait NET_BROADCAST extends KernelCapability
  
  @js.native
  sealed trait NET_RAW extends KernelCapability
  
  @js.native
  sealed trait NS extends RecordType
  
  @js.native
  sealed trait PTR extends RecordType
  
  @js.native
  sealed trait Post extends js.Object
  
  @js.native
  sealed trait Put extends js.Object
  
  @js.native
  sealed trait REMOVE extends js.Object
  
  @js.native
  sealed trait `Red Hat Enterprise Linux` extends InstancePlatform
  
  @js.native
  sealed trait SETFCAP extends KernelCapability
  
  @js.native
  sealed trait SETGID extends KernelCapability
  
  @js.native
  sealed trait SETPCAP extends KernelCapability
  
  @js.native
  sealed trait SETUID extends KernelCapability
  
  @js.native
  sealed trait SOA extends RecordType
  
  @js.native
  sealed trait SPF extends RecordType
  
  @js.native
  sealed trait SRV extends RecordType
  
  @js.native
  sealed trait `SUSE Linux` extends InstancePlatform
  
  @js.native
  sealed trait SYSLOG extends KernelCapability
  
  @js.native
  sealed trait SYS_ADMIN extends KernelCapability
  
  @js.native
  sealed trait SYS_BOOT extends KernelCapability
  
  @js.native
  sealed trait SYS_CHROOT extends KernelCapability
  
  @js.native
  sealed trait SYS_MODULE extends KernelCapability
  
  @js.native
  sealed trait SYS_NICE extends KernelCapability
  
  @js.native
  sealed trait SYS_PACCT extends KernelCapability
  
  @js.native
  sealed trait SYS_PTRACE extends KernelCapability
  
  @js.native
  sealed trait SYS_RAWIO extends KernelCapability
  
  @js.native
  sealed trait SYS_RESOURCE extends KernelCapability
  
  @js.native
  sealed trait SYS_TIME extends KernelCapability
  
  @js.native
  sealed trait SYS_TTY_CONFIG extends KernelCapability
  
  @js.native
  sealed trait SecureString extends ParameterType
  
  @js.native
  sealed trait String extends ParameterType
  
  @js.native
  sealed trait StringList extends ParameterType
  
  @js.native
  sealed trait TRIM_HORIZON extends js.Object
  
  @js.native
  sealed trait TXT extends RecordType
  
  @js.native
  sealed trait WAKE_ALARM extends KernelCapability
  
  @js.native
  sealed trait Windows extends InstancePlatform
  
  @js.native
  sealed trait `Windows with SQL Server` extends InstancePlatform
  
  @js.native
  sealed trait `Windows with SQL Server Enterprise` extends InstancePlatform
  
  @js.native
  sealed trait `Windows with SQL Server Standard` extends InstancePlatform
  
  @js.native
  sealed trait `Windows with SQL Server Web` extends InstancePlatform
  
  @js.native
  sealed trait a1Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait a1Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait a1Dotlarge extends InstanceType
  
  @js.native
  sealed trait a1Dotmedium extends InstanceType
  
  @js.native
  sealed trait a1Dotxlarge extends InstanceType
  
  @js.native
  sealed trait all_ extends ProtocolType
  
  @js.native
  sealed trait any extends js.Object
  
  @js.native
  sealed trait `ap-east-1` extends Region
  
  @js.native
  sealed trait `ap-northeast-1` extends Region
  
  @js.native
  sealed trait `ap-northeast-2` extends Region
  
  @js.native
  sealed trait `ap-south-1` extends Region
  
  @js.native
  sealed trait `ap-southeast-1` extends Region
  
  @js.native
  sealed trait `ap-southeast-2` extends Region
  
  @js.native
  sealed trait application
    extends LoadBalancerType
       with typings.pulumiAws.loadBalancerTypeMod.LoadBalancerType
  
  @js.native
  sealed trait aurora extends EngineType
  
  @js.native
  sealed trait `aurora-mysql` extends EngineType
  
  @js.native
  sealed trait `aurora-postgresql` extends EngineType
  
  @js.native
  sealed trait `authenticated-read` extends CannedAcl
  
  @js.native
  sealed trait autoscalingColonEC2_INSTANCE_LAUNCH extends NotificationType
  
  @js.native
  sealed trait autoscalingColonEC2_INSTANCE_LAUNCH_ERROR extends NotificationType
  
  @js.native
  sealed trait autoscalingColonEC2_INSTANCE_TERMINATE extends NotificationType
  
  @js.native
  sealed trait autoscalingColonEC2_INSTANCE_TERMINATE_ERROR extends NotificationType
  
  @js.native
  sealed trait autoscalingColonTEST_NOTIFICATION extends NotificationType
  
  @js.native
  sealed trait `aws-exec-read` extends CannedAcl
  
  @js.native
  sealed trait awsColonkinesis extends js.Object
  
  @js.native
  sealed trait awsColonkinesisColonrecord extends js.Object
  
  @js.native
  sealed trait awsfirelens extends LogDriver
  
  @js.native
  sealed trait awslogs extends LogDriver
  
  @js.native
  sealed trait `bucket-owner-full-control` extends CannedAcl
  
  @js.native
  sealed trait `bucket-owner-read` extends CannedAcl
  
  @js.native
  sealed trait c3Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait c3Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait c3Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait c3Dotlarge extends InstanceType
  
  @js.native
  sealed trait c3Dotxlarge extends InstanceType
  
  @js.native
  sealed trait c4Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait c4Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait c4Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait c4Dotlarge extends InstanceType
  
  @js.native
  sealed trait c4Dotxlarge extends InstanceType
  
  @js.native
  sealed trait c5Dot18xlarge extends InstanceType
  
  @js.native
  sealed trait c5Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait c5Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait c5Dot9xlarge extends InstanceType
  
  @js.native
  sealed trait c5Dotlarge extends InstanceType
  
  @js.native
  sealed trait c5Dotxlarge extends InstanceType
  
  @js.native
  sealed trait c5dDot18xlarge extends InstanceType
  
  @js.native
  sealed trait c5dDot2xlarge extends InstanceType
  
  @js.native
  sealed trait c5dDot4xlarge extends InstanceType
  
  @js.native
  sealed trait c5dDot9xlarge extends InstanceType
  
  @js.native
  sealed trait c5dDotlarge extends InstanceType
  
  @js.native
  sealed trait c5dDotxlarge extends InstanceType
  
  @js.native
  sealed trait c5nDot18xlarge extends InstanceType
  
  @js.native
  sealed trait c5nDot2xlarge extends InstanceType
  
  @js.native
  sealed trait c5nDot4xlarge extends InstanceType
  
  @js.native
  sealed trait c5nDot9xlarge extends InstanceType
  
  @js.native
  sealed trait c5nDotlarge extends InstanceType
  
  @js.native
  sealed trait c5nDotxlarge extends InstanceType
  
  @js.native
  sealed trait `ca-central-1` extends Region
  
  @js.native
  sealed trait cluster extends PlacementStrategy
  
  @js.native
  sealed trait `cn-north-1` extends Region
  
  @js.native
  sealed trait `cn-northwest-1` extends Region
  
  @js.native
  sealed trait core extends UlimitName
  
  @js.native
  sealed trait cpu extends UlimitName
  
  @js.native
  sealed trait d2Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait d2Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait d2Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait d2Dotxlarge extends InstanceType
  
  @js.native
  sealed trait data extends UlimitName
  
  @js.native
  sealed trait dbDotm1Dotlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm1Dotmedium
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm1Dotsmall
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm1Dotxlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm2Dot2xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm2Dot4xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm2Dotxlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm3Dot2xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm3Dotlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm3Dotmedium
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm3Dotxlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm4Dot10xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm4Dot16xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm4Dot2xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm4Dot4xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm4Dotlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm4Dotxlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm5Dot12xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm5Dot24xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm5Dot2xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm5Dot4xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm5Dotlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotm5Dotxlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr3Dot2xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr3Dot4xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr3Dot8xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr3Dotlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr3Dotxlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr4Dot16xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr4Dot2xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr4Dot4xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr4Dot8xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr4Dotlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr4Dotxlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr5Dot12xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr5Dot24xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr5Dot2xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr5Dot4xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr5Dotlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotr5Dotxlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott2Dot2xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott2Dotlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott2Dotmedium
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott2Dotmicro
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott2Dotsmall
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott2Dotxlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott3Dot2xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott3Dotlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott3Dotmedium
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott3Dotmicro
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott3Dotsmall
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDott3Dotxlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotx1Dot16xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotx1Dot32xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotx1eDot2xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotx1eDot32xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotx1eDot4xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotx1eDot8xlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dbDotx1eDotxlarge
    extends typings.pulumiAws.rdsInstanceTypeMod.InstanceType
  
  @js.native
  sealed trait dedicated extends Tenancy
  
  @js.native
  sealed trait default extends Tenancy
  
  @js.native
  sealed trait dotnetcore1Dot0 extends Runtime
  
  @js.native
  sealed trait dotnetcore2Dot0 extends Runtime
  
  @js.native
  sealed trait dotnetcore2Dot1 extends Runtime
  
  @js.native
  sealed trait dotnetcore3Dot1 extends Runtime
  
  @js.native
  sealed trait dualstack
    extends IpAddressType
       with typings.pulumiAws.ipAddressTypeMod.IpAddressType
  
  @js.native
  sealed trait `eu-central-1` extends Region
  
  @js.native
  sealed trait `eu-north-1` extends Region
  
  @js.native
  sealed trait `eu-west-1` extends Region
  
  @js.native
  sealed trait `eu-west-2` extends Region
  
  @js.native
  sealed trait `eu-west-3` extends Region
  
  @js.native
  sealed trait expire extends js.Object
  
  @js.native
  sealed trait f1Dot16xlarge extends InstanceType
  
  @js.native
  sealed trait f1Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait fluentd extends LogDriver
  
  @js.native
  sealed trait fsize extends UlimitName
  
  @js.native
  sealed trait g2Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait g2Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait g3Dot16xlarge extends InstanceType
  
  @js.native
  sealed trait g3Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait g3Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait g3sDotxlarge extends InstanceType
  
  @js.native
  sealed trait gelf extends LogDriver
  
  @js.native
  sealed trait global extends EngineMode
  
  @js.native
  sealed trait go1Dotx extends Runtime
  
  @js.native
  sealed trait gp2 extends StorageType
  
  @js.native
  sealed trait h1Dot16xlarge extends InstanceType
  
  @js.native
  sealed trait h1Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait h1Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait h1Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait hs1Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait i3Dot16xlarge extends InstanceType
  
  @js.native
  sealed trait i3Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait i3Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait i3Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait i3Dotlarge extends InstanceType
  
  @js.native
  sealed trait i3Dotmetal extends InstanceType
  
  @js.native
  sealed trait i3Dotxlarge extends InstanceType
  
  @js.native
  sealed trait icmp extends ProtocolType
  
  @js.native
  sealed trait imageCountMoreThan extends js.Object
  
  @js.native
  sealed trait io1 extends StorageType
  
  @js.native
  sealed trait ipv4
    extends IpAddressType
       with typings.pulumiAws.ipAddressTypeMod.IpAddressType
  
  @js.native
  sealed trait java11 extends Runtime
  
  @js.native
  sealed trait java8 extends Runtime
  
  @js.native
  sealed trait journald extends LogDriver
  
  @js.native
  sealed trait `json-file` extends LogDriver
  
  @js.native
  sealed trait locks extends UlimitName
  
  @js.native
  sealed trait `log-delivery-write` extends CannedAcl
  
  @js.native
  sealed trait m3Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait m3Dotlarge extends InstanceType
  
  @js.native
  sealed trait m3Dotmedium extends InstanceType
  
  @js.native
  sealed trait m3Dotxlarge extends InstanceType
  
  @js.native
  sealed trait m4Dot10xlarge extends InstanceType
  
  @js.native
  sealed trait m4Dot16xlarge extends InstanceType
  
  @js.native
  sealed trait m4Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait m4Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait m4Dotlarge extends InstanceType
  
  @js.native
  sealed trait m4Dotxlarge extends InstanceType
  
  @js.native
  sealed trait m5Dot12xlarge extends InstanceType
  
  @js.native
  sealed trait m5Dot24xlarge extends InstanceType
  
  @js.native
  sealed trait m5Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait m5Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait m5Dotlarge extends InstanceType
  
  @js.native
  sealed trait m5Dotxlarge extends InstanceType
  
  @js.native
  sealed trait m5aDot12xlarge extends InstanceType
  
  @js.native
  sealed trait m5aDot24xlarge extends InstanceType
  
  @js.native
  sealed trait m5aDot2xlarge extends InstanceType
  
  @js.native
  sealed trait m5aDot4xlarge extends InstanceType
  
  @js.native
  sealed trait m5aDotlarge extends InstanceType
  
  @js.native
  sealed trait m5aDotxlarge extends InstanceType
  
  @js.native
  sealed trait m5dDot12xlarge extends InstanceType
  
  @js.native
  sealed trait m5dDot24xlarge extends InstanceType
  
  @js.native
  sealed trait m5dDot2xlarge extends InstanceType
  
  @js.native
  sealed trait m5dDot4xlarge extends InstanceType
  
  @js.native
  sealed trait m5dDotlarge extends InstanceType
  
  @js.native
  sealed trait m5dDotxlarge extends InstanceType
  
  @js.native
  sealed trait `me-south-1` extends Region
  
  @js.native
  sealed trait memlock extends UlimitName
  
  @js.native
  sealed trait msgqueue extends UlimitName
  
  @js.native
  sealed trait network
    extends LoadBalancerType
       with typings.pulumiAws.loadBalancerTypeMod.LoadBalancerType
  
  @js.native
  sealed trait nice extends UlimitName
  
  @js.native
  sealed trait nodejs extends Runtime
  
  @js.native
  sealed trait nodejs10Dotx extends Runtime
  
  @js.native
  sealed trait nodejs12Dotx extends Runtime
  
  @js.native
  sealed trait nodejs4Dot3 extends Runtime
  
  @js.native
  sealed trait `nodejs4Dot3-edge` extends Runtime
  
  @js.native
  sealed trait nodejs6Dot10 extends Runtime
  
  @js.native
  sealed trait nodejs8Dot10 extends Runtime
  
  @js.native
  sealed trait nofile extends UlimitName
  
  @js.native
  sealed trait nproc extends UlimitName
  
  @js.native
  sealed trait p2Dot16xlarge extends InstanceType
  
  @js.native
  sealed trait p2Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait p2Dotxlarge extends InstanceType
  
  @js.native
  sealed trait p3Dot16xlarge extends InstanceType
  
  @js.native
  sealed trait p3Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait p3Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait p3dnDot24xlarge extends InstanceType
  
  @js.native
  sealed trait parallelquery extends EngineMode
  
  @js.native
  sealed trait `private` extends CannedAcl
  
  @js.native
  sealed trait provided extends Runtime
  
  @js.native
  sealed trait provisioned extends EngineMode
  
  @js.native
  sealed trait `public-read` extends CannedAcl
  
  @js.native
  sealed trait `public-read-write` extends CannedAcl
  
  @js.native
  sealed trait python2Dot7 extends Runtime
  
  @js.native
  sealed trait python3Dot6 extends Runtime
  
  @js.native
  sealed trait python3Dot7 extends Runtime
  
  @js.native
  sealed trait python3Dot8 extends Runtime
  
  @js.native
  sealed trait r3Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait r3Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait r3Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait r3Dotlarge extends InstanceType
  
  @js.native
  sealed trait r3Dotxlarge extends InstanceType
  
  @js.native
  sealed trait r4Dot16xlarge extends InstanceType
  
  @js.native
  sealed trait r4Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait r4Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait r4Dot8xlarge extends InstanceType
  
  @js.native
  sealed trait r4Dotlarge extends InstanceType
  
  @js.native
  sealed trait r4Dotxlarge extends InstanceType
  
  @js.native
  sealed trait r5Dot12xlarge extends InstanceType
  
  @js.native
  sealed trait r5Dot24xlarge extends InstanceType
  
  @js.native
  sealed trait r5Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait r5Dot4xlarge extends InstanceType
  
  @js.native
  sealed trait r5Dotlarge extends InstanceType
  
  @js.native
  sealed trait r5Dotxlarge extends InstanceType
  
  @js.native
  sealed trait r5aDot12xlarge extends InstanceType
  
  @js.native
  sealed trait r5aDot24xlarge extends InstanceType
  
  @js.native
  sealed trait r5aDot2xlarge extends InstanceType
  
  @js.native
  sealed trait r5aDot4xlarge extends InstanceType
  
  @js.native
  sealed trait r5aDotlarge extends InstanceType
  
  @js.native
  sealed trait r5aDotxlarge extends InstanceType
  
  @js.native
  sealed trait r5dDot12xlarge extends InstanceType
  
  @js.native
  sealed trait r5dDot24xlarge extends InstanceType
  
  @js.native
  sealed trait r5dDot2xlarge extends InstanceType
  
  @js.native
  sealed trait r5dDot4xlarge extends InstanceType
  
  @js.native
  sealed trait r5dDotlarge extends InstanceType
  
  @js.native
  sealed trait r5dDotxlarge extends InstanceType
  
  @js.native
  sealed trait rss extends UlimitName
  
  @js.native
  sealed trait rtprio extends UlimitName
  
  @js.native
  sealed trait rttime extends UlimitName
  
  @js.native
  sealed trait ruby2Dot5 extends Runtime
  
  @js.native
  sealed trait ruby2Dot7 extends Runtime
  
  @js.native
  sealed trait `sa-east-1` extends Region
  
  @js.native
  sealed trait serverless extends EngineMode
  
  @js.native
  sealed trait sigpending extends UlimitName
  
  @js.native
  sealed trait sinceImagePushed extends js.Object
  
  @js.native
  sealed trait splunk extends LogDriver
  
  @js.native
  sealed trait spread extends PlacementStrategy
  
  @js.native
  sealed trait stack extends UlimitName
  
  @js.native
  sealed trait standard extends StorageType
  
  @js.native
  sealed trait syslog_ extends LogDriver
  
  @js.native
  sealed trait t2Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait t2Dotlarge extends InstanceType
  
  @js.native
  sealed trait t2Dotmedium extends InstanceType
  
  @js.native
  sealed trait t2Dotmicro extends InstanceType
  
  @js.native
  sealed trait t2Dotnano extends InstanceType
  
  @js.native
  sealed trait t2Dotsmall extends InstanceType
  
  @js.native
  sealed trait t2Dotxlarge extends InstanceType
  
  @js.native
  sealed trait t3Dot2xlarge extends InstanceType
  
  @js.native
  sealed trait t3Dotlarge extends InstanceType
  
  @js.native
  sealed trait t3Dotmedium extends InstanceType
  
  @js.native
  sealed trait t3Dotmicro extends InstanceType
  
  @js.native
  sealed trait t3Dotnano extends InstanceType
  
  @js.native
  sealed trait t3Dotsmall extends InstanceType
  
  @js.native
  sealed trait t3Dotxlarge extends InstanceType
  
  @js.native
  sealed trait t3aDot2xlarge extends InstanceType
  
  @js.native
  sealed trait t3aDotlarge extends InstanceType
  
  @js.native
  sealed trait t3aDotmedium extends InstanceType
  
  @js.native
  sealed trait t3aDotmicro extends InstanceType
  
  @js.native
  sealed trait t3aDotnano extends InstanceType
  
  @js.native
  sealed trait t3aDotsmall extends InstanceType
  
  @js.native
  sealed trait t3aDotxlarge extends InstanceType
  
  @js.native
  sealed trait tagged extends js.Object
  
  @js.native
  sealed trait tcp
    extends Protocol
       with ProtocolType
  
  @js.native
  sealed trait `u-12tb1Dotmetal` extends InstanceType
  
  @js.native
  sealed trait `u-6tb1Dotmetal` extends InstanceType
  
  @js.native
  sealed trait `u-9tb1Dotmetal` extends InstanceType
  
  @js.native
  sealed trait udp
    extends Protocol
       with ProtocolType
  
  @js.native
  sealed trait untagged extends js.Object
  
  @js.native
  sealed trait `us-east-1` extends Region
  
  @js.native
  sealed trait `us-east-2` extends Region
  
  @js.native
  sealed trait `us-west-1` extends Region
  
  @js.native
  sealed trait `us-west-2` extends Region
  
  @js.native
  sealed trait x1Dot16xlarge extends InstanceType
  
  @js.native
  sealed trait x1Dot32xlarge extends InstanceType
  
  @js.native
  sealed trait x1eDot16xlarge extends InstanceType
  
  @js.native
  sealed trait x1eDot2xlarge extends InstanceType
  
  @js.native
  sealed trait x1eDot32xlarge extends InstanceType
  
  @js.native
  sealed trait x1eDot4xlarge extends InstanceType
  
  @js.native
  sealed trait x1eDot8xlarge extends InstanceType
  
  @js.native
  sealed trait x1eDotxlarge extends InstanceType
  
  @js.native
  sealed trait z1dDot12xlarge extends InstanceType
  
  @js.native
  sealed trait z1dDot2xlarge extends InstanceType
  
  @js.native
  sealed trait z1dDot3xlarge extends InstanceType
  
  @js.native
  sealed trait z1dDot6xlarge extends InstanceType
  
  @js.native
  sealed trait z1dDotlarge extends InstanceType
  
  @js.native
  sealed trait z1dDotxlarge extends InstanceType
  
  @scala.inline
  def `1Minute`: `1Minute` = "1Minute".asInstanceOf[`1Minute`]
  @scala.inline
  def `2008-10-17`: `2008-10-17` = "2008-10-17".asInstanceOf[`2008-10-17`]
  @scala.inline
  def `2012-10-17`: `2012-10-17` = "2012-10-17".asInstanceOf[`2012-10-17`]
  @scala.inline
  def A: A = "A".asInstanceOf[A]
  @scala.inline
  def AAAA: AAAA = "AAAA".asInstanceOf[AAAA]
  @scala.inline
  def ALL: ALL = "ALL".asInstanceOf[ALL]
  @scala.inline
  def AT_TIMESTAMP: AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[AT_TIMESTAMP]
  @scala.inline
  def AUDIT_CONTROL: AUDIT_CONTROL = "AUDIT_CONTROL".asInstanceOf[AUDIT_CONTROL]
  @scala.inline
  def AUDIT_WRITE: AUDIT_WRITE = "AUDIT_WRITE".asInstanceOf[AUDIT_WRITE]
  @scala.inline
  def Allow: Allow = "Allow".asInstanceOf[Allow]
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  @scala.inline
  def BLOCK_SUSPEND: BLOCK_SUSPEND = "BLOCK_SUSPEND".asInstanceOf[BLOCK_SUSPEND]
  @scala.inline
  def CAA: CAA = "CAA".asInstanceOf[CAA]
  @scala.inline
  def CHOWN: CHOWN = "CHOWN".asInstanceOf[CHOWN]
  @scala.inline
  def CNAME: CNAME = "CNAME".asInstanceOf[CNAME]
  @scala.inline
  def CompleteMultipartUpload: CompleteMultipartUpload = "CompleteMultipartUpload".asInstanceOf[CompleteMultipartUpload]
  @scala.inline
  def Copy: Copy = "Copy".asInstanceOf[Copy]
  @scala.inline
  def DAC_OVERRIDE: DAC_OVERRIDE = "DAC_OVERRIDE".asInstanceOf[DAC_OVERRIDE]
  @scala.inline
  def DAC_READ_SEARCH: DAC_READ_SEARCH = "DAC_READ_SEARCH".asInstanceOf[DAC_READ_SEARCH]
  @scala.inline
  def Delete: Delete = "Delete".asInstanceOf[Delete]
  @scala.inline
  def DeleteMarkerCreated: DeleteMarkerCreated = "DeleteMarkerCreated".asInstanceOf[DeleteMarkerCreated]
  @scala.inline
  def Deny: Deny = "Deny".asInstanceOf[Deny]
  @scala.inline
  def FOWNER: FOWNER = "FOWNER".asInstanceOf[FOWNER]
  @scala.inline
  def FSETID: FSETID = "FSETID".asInstanceOf[FSETID]
  @scala.inline
  def GroupDesiredCapacity: GroupDesiredCapacity = "GroupDesiredCapacity".asInstanceOf[GroupDesiredCapacity]
  @scala.inline
  def GroupInServiceInstances: GroupInServiceInstances = "GroupInServiceInstances".asInstanceOf[GroupInServiceInstances]
  @scala.inline
  def GroupMaxSize: GroupMaxSize = "GroupMaxSize".asInstanceOf[GroupMaxSize]
  @scala.inline
  def GroupMinSize: GroupMinSize = "GroupMinSize".asInstanceOf[GroupMinSize]
  @scala.inline
  def GroupPendingInstances: GroupPendingInstances = "GroupPendingInstances".asInstanceOf[GroupPendingInstances]
  @scala.inline
  def GroupStandbyInstances: GroupStandbyInstances = "GroupStandbyInstances".asInstanceOf[GroupStandbyInstances]
  @scala.inline
  def GroupTerminatingInstances: GroupTerminatingInstances = "GroupTerminatingInstances".asInstanceOf[GroupTerminatingInstances]
  @scala.inline
  def GroupTotalInstances: GroupTotalInstances = "GroupTotalInstances".asInstanceOf[GroupTotalInstances]
  @scala.inline
  def INSERT: INSERT = "INSERT".asInstanceOf[INSERT]
  @scala.inline
  def IPC_LOCK: IPC_LOCK = "IPC_LOCK".asInstanceOf[IPC_LOCK]
  @scala.inline
  def IPC_OWNER: IPC_OWNER = "IPC_OWNER".asInstanceOf[IPC_OWNER]
  @scala.inline
  def KILL: KILL = "KILL".asInstanceOf[KILL]
  @scala.inline
  def LATEST: LATEST = "LATEST".asInstanceOf[LATEST]
  @scala.inline
  def LEASE: LEASE = "LEASE".asInstanceOf[LEASE]
  @scala.inline
  def LINUX_IMMUTABLE: LINUX_IMMUTABLE = "LINUX_IMMUTABLE".asInstanceOf[LINUX_IMMUTABLE]
  @scala.inline
  def LinuxSlashUNIX: LinuxSlashUNIX = "Linux/UNIX".asInstanceOf[LinuxSlashUNIX]
  @scala.inline
  def MAC_ADMIN: MAC_ADMIN = "MAC_ADMIN".asInstanceOf[MAC_ADMIN]
  @scala.inline
  def MAC_OVERRIDE: MAC_OVERRIDE = "MAC_OVERRIDE".asInstanceOf[MAC_OVERRIDE]
  @scala.inline
  def MKNOD: MKNOD = "MKNOD".asInstanceOf[MKNOD]
  @scala.inline
  def MODIFY: MODIFY = "MODIFY".asInstanceOf[MODIFY]
  @scala.inline
  def MX: MX = "MX".asInstanceOf[MX]
  @scala.inline
  def NAPTR: NAPTR = "NAPTR".asInstanceOf[NAPTR]
  @scala.inline
  def NET_ADMIN: NET_ADMIN = "NET_ADMIN".asInstanceOf[NET_ADMIN]
  @scala.inline
  def NET_BIND_SERVICE: NET_BIND_SERVICE = "NET_BIND_SERVICE".asInstanceOf[NET_BIND_SERVICE]
  @scala.inline
  def NET_BROADCAST: NET_BROADCAST = "NET_BROADCAST".asInstanceOf[NET_BROADCAST]
  @scala.inline
  def NET_RAW: NET_RAW = "NET_RAW".asInstanceOf[NET_RAW]
  @scala.inline
  def NS: NS = "NS".asInstanceOf[NS]
  @scala.inline
  def PTR: PTR = "PTR".asInstanceOf[PTR]
  @scala.inline
  def Post: Post = "Post".asInstanceOf[Post]
  @scala.inline
  def Put: Put = "Put".asInstanceOf[Put]
  @scala.inline
  def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  @scala.inline
  def `Red Hat Enterprise Linux`: `Red Hat Enterprise Linux` = ("Red Hat Enterprise Linux").asInstanceOf[`Red Hat Enterprise Linux`]
  @scala.inline
  def SETFCAP: SETFCAP = "SETFCAP".asInstanceOf[SETFCAP]
  @scala.inline
  def SETGID: SETGID = "SETGID".asInstanceOf[SETGID]
  @scala.inline
  def SETPCAP: SETPCAP = "SETPCAP".asInstanceOf[SETPCAP]
  @scala.inline
  def SETUID: SETUID = "SETUID".asInstanceOf[SETUID]
  @scala.inline
  def SOA: SOA = "SOA".asInstanceOf[SOA]
  @scala.inline
  def SPF: SPF = "SPF".asInstanceOf[SPF]
  @scala.inline
  def SRV: SRV = "SRV".asInstanceOf[SRV]
  @scala.inline
  def `SUSE Linux`: `SUSE Linux` = ("SUSE Linux").asInstanceOf[`SUSE Linux`]
  @scala.inline
  def SYSLOG: SYSLOG = "SYSLOG".asInstanceOf[SYSLOG]
  @scala.inline
  def SYS_ADMIN: SYS_ADMIN = "SYS_ADMIN".asInstanceOf[SYS_ADMIN]
  @scala.inline
  def SYS_BOOT: SYS_BOOT = "SYS_BOOT".asInstanceOf[SYS_BOOT]
  @scala.inline
  def SYS_CHROOT: SYS_CHROOT = "SYS_CHROOT".asInstanceOf[SYS_CHROOT]
  @scala.inline
  def SYS_MODULE: SYS_MODULE = "SYS_MODULE".asInstanceOf[SYS_MODULE]
  @scala.inline
  def SYS_NICE: SYS_NICE = "SYS_NICE".asInstanceOf[SYS_NICE]
  @scala.inline
  def SYS_PACCT: SYS_PACCT = "SYS_PACCT".asInstanceOf[SYS_PACCT]
  @scala.inline
  def SYS_PTRACE: SYS_PTRACE = "SYS_PTRACE".asInstanceOf[SYS_PTRACE]
  @scala.inline
  def SYS_RAWIO: SYS_RAWIO = "SYS_RAWIO".asInstanceOf[SYS_RAWIO]
  @scala.inline
  def SYS_RESOURCE: SYS_RESOURCE = "SYS_RESOURCE".asInstanceOf[SYS_RESOURCE]
  @scala.inline
  def SYS_TIME: SYS_TIME = "SYS_TIME".asInstanceOf[SYS_TIME]
  @scala.inline
  def SYS_TTY_CONFIG: SYS_TTY_CONFIG = "SYS_TTY_CONFIG".asInstanceOf[SYS_TTY_CONFIG]
  @scala.inline
  def SecureString: SecureString = "SecureString".asInstanceOf[SecureString]
  @scala.inline
  def String: String = "String".asInstanceOf[String]
  @scala.inline
  def StringList: StringList = "StringList".asInstanceOf[StringList]
  @scala.inline
  def TRIM_HORIZON: TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[TRIM_HORIZON]
  @scala.inline
  def TXT: TXT = "TXT".asInstanceOf[TXT]
  @scala.inline
  def WAKE_ALARM: WAKE_ALARM = "WAKE_ALARM".asInstanceOf[WAKE_ALARM]
  @scala.inline
  def Windows: Windows = "Windows".asInstanceOf[Windows]
  @scala.inline
  def `Windows with SQL Server`: `Windows with SQL Server` = ("Windows with SQL Server").asInstanceOf[`Windows with SQL Server`]
  @scala.inline
  def `Windows with SQL Server Enterprise`: `Windows with SQL Server Enterprise` = ("Windows with SQL Server Enterprise").asInstanceOf[`Windows with SQL Server Enterprise`]
  @scala.inline
  def `Windows with SQL Server Standard`: `Windows with SQL Server Standard` = ("Windows with SQL Server Standard").asInstanceOf[`Windows with SQL Server Standard`]
  @scala.inline
  def `Windows with SQL Server Web`: `Windows with SQL Server Web` = ("Windows with SQL Server Web").asInstanceOf[`Windows with SQL Server Web`]
  @scala.inline
  def a1Dot2xlarge: a1Dot2xlarge = "a1.2xlarge".asInstanceOf[a1Dot2xlarge]
  @scala.inline
  def a1Dot4xlarge: a1Dot4xlarge = "a1.4xlarge".asInstanceOf[a1Dot4xlarge]
  @scala.inline
  def a1Dotlarge: a1Dotlarge = "a1.large".asInstanceOf[a1Dotlarge]
  @scala.inline
  def a1Dotmedium: a1Dotmedium = "a1.medium".asInstanceOf[a1Dotmedium]
  @scala.inline
  def a1Dotxlarge: a1Dotxlarge = "a1.xlarge".asInstanceOf[a1Dotxlarge]
  @scala.inline
  def all_ : all_ = "all".asInstanceOf[all_]
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def `ap-east-1`: `ap-east-1` = "ap-east-1".asInstanceOf[`ap-east-1`]
  @scala.inline
  def `ap-northeast-1`: `ap-northeast-1` = "ap-northeast-1".asInstanceOf[`ap-northeast-1`]
  @scala.inline
  def `ap-northeast-2`: `ap-northeast-2` = "ap-northeast-2".asInstanceOf[`ap-northeast-2`]
  @scala.inline
  def `ap-south-1`: `ap-south-1` = "ap-south-1".asInstanceOf[`ap-south-1`]
  @scala.inline
  def `ap-southeast-1`: `ap-southeast-1` = "ap-southeast-1".asInstanceOf[`ap-southeast-1`]
  @scala.inline
  def `ap-southeast-2`: `ap-southeast-2` = "ap-southeast-2".asInstanceOf[`ap-southeast-2`]
  @scala.inline
  def application: application = "application".asInstanceOf[application]
  @scala.inline
  def aurora: aurora = "aurora".asInstanceOf[aurora]
  @scala.inline
  def `aurora-mysql`: `aurora-mysql` = "aurora-mysql".asInstanceOf[`aurora-mysql`]
  @scala.inline
  def `aurora-postgresql`: `aurora-postgresql` = "aurora-postgresql".asInstanceOf[`aurora-postgresql`]
  @scala.inline
  def `authenticated-read`: `authenticated-read` = "authenticated-read".asInstanceOf[`authenticated-read`]
  @scala.inline
  def autoscalingColonEC2_INSTANCE_LAUNCH: autoscalingColonEC2_INSTANCE_LAUNCH = "autoscaling:EC2_INSTANCE_LAUNCH".asInstanceOf[autoscalingColonEC2_INSTANCE_LAUNCH]
  @scala.inline
  def autoscalingColonEC2_INSTANCE_LAUNCH_ERROR: autoscalingColonEC2_INSTANCE_LAUNCH_ERROR = "autoscaling:EC2_INSTANCE_LAUNCH_ERROR".asInstanceOf[autoscalingColonEC2_INSTANCE_LAUNCH_ERROR]
  @scala.inline
  def autoscalingColonEC2_INSTANCE_TERMINATE: autoscalingColonEC2_INSTANCE_TERMINATE = "autoscaling:EC2_INSTANCE_TERMINATE".asInstanceOf[autoscalingColonEC2_INSTANCE_TERMINATE]
  @scala.inline
  def autoscalingColonEC2_INSTANCE_TERMINATE_ERROR: autoscalingColonEC2_INSTANCE_TERMINATE_ERROR = "autoscaling:EC2_INSTANCE_TERMINATE_ERROR".asInstanceOf[autoscalingColonEC2_INSTANCE_TERMINATE_ERROR]
  @scala.inline
  def autoscalingColonTEST_NOTIFICATION: autoscalingColonTEST_NOTIFICATION = "autoscaling:TEST_NOTIFICATION".asInstanceOf[autoscalingColonTEST_NOTIFICATION]
  @scala.inline
  def `aws-exec-read`: `aws-exec-read` = "aws-exec-read".asInstanceOf[`aws-exec-read`]
  @scala.inline
  def awsColonkinesis: awsColonkinesis = "aws:kinesis".asInstanceOf[awsColonkinesis]
  @scala.inline
  def awsColonkinesisColonrecord: awsColonkinesisColonrecord = "aws:kinesis:record".asInstanceOf[awsColonkinesisColonrecord]
  @scala.inline
  def awsfirelens: awsfirelens = "awsfirelens".asInstanceOf[awsfirelens]
  @scala.inline
  def awslogs: awslogs = "awslogs".asInstanceOf[awslogs]
  @scala.inline
  def `bucket-owner-full-control`: `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[`bucket-owner-full-control`]
  @scala.inline
  def `bucket-owner-read`: `bucket-owner-read` = "bucket-owner-read".asInstanceOf[`bucket-owner-read`]
  @scala.inline
  def c3Dot2xlarge: c3Dot2xlarge = "c3.2xlarge".asInstanceOf[c3Dot2xlarge]
  @scala.inline
  def c3Dot4xlarge: c3Dot4xlarge = "c3.4xlarge".asInstanceOf[c3Dot4xlarge]
  @scala.inline
  def c3Dot8xlarge: c3Dot8xlarge = "c3.8xlarge".asInstanceOf[c3Dot8xlarge]
  @scala.inline
  def c3Dotlarge: c3Dotlarge = "c3.large".asInstanceOf[c3Dotlarge]
  @scala.inline
  def c3Dotxlarge: c3Dotxlarge = "c3.xlarge".asInstanceOf[c3Dotxlarge]
  @scala.inline
  def c4Dot2xlarge: c4Dot2xlarge = "c4.2xlarge".asInstanceOf[c4Dot2xlarge]
  @scala.inline
  def c4Dot4xlarge: c4Dot4xlarge = "c4.4xlarge".asInstanceOf[c4Dot4xlarge]
  @scala.inline
  def c4Dot8xlarge: c4Dot8xlarge = "c4.8xlarge".asInstanceOf[c4Dot8xlarge]
  @scala.inline
  def c4Dotlarge: c4Dotlarge = "c4.large".asInstanceOf[c4Dotlarge]
  @scala.inline
  def c4Dotxlarge: c4Dotxlarge = "c4.xlarge".asInstanceOf[c4Dotxlarge]
  @scala.inline
  def c5Dot18xlarge: c5Dot18xlarge = "c5.18xlarge".asInstanceOf[c5Dot18xlarge]
  @scala.inline
  def c5Dot2xlarge: c5Dot2xlarge = "c5.2xlarge".asInstanceOf[c5Dot2xlarge]
  @scala.inline
  def c5Dot4xlarge: c5Dot4xlarge = "c5.4xlarge".asInstanceOf[c5Dot4xlarge]
  @scala.inline
  def c5Dot9xlarge: c5Dot9xlarge = "c5.9xlarge".asInstanceOf[c5Dot9xlarge]
  @scala.inline
  def c5Dotlarge: c5Dotlarge = "c5.large".asInstanceOf[c5Dotlarge]
  @scala.inline
  def c5Dotxlarge: c5Dotxlarge = "c5.xlarge".asInstanceOf[c5Dotxlarge]
  @scala.inline
  def c5dDot18xlarge: c5dDot18xlarge = "c5d.18xlarge".asInstanceOf[c5dDot18xlarge]
  @scala.inline
  def c5dDot2xlarge: c5dDot2xlarge = "c5d.2xlarge".asInstanceOf[c5dDot2xlarge]
  @scala.inline
  def c5dDot4xlarge: c5dDot4xlarge = "c5d.4xlarge".asInstanceOf[c5dDot4xlarge]
  @scala.inline
  def c5dDot9xlarge: c5dDot9xlarge = "c5d.9xlarge".asInstanceOf[c5dDot9xlarge]
  @scala.inline
  def c5dDotlarge: c5dDotlarge = "c5d.large".asInstanceOf[c5dDotlarge]
  @scala.inline
  def c5dDotxlarge: c5dDotxlarge = "c5d.xlarge".asInstanceOf[c5dDotxlarge]
  @scala.inline
  def c5nDot18xlarge: c5nDot18xlarge = "c5n.18xlarge".asInstanceOf[c5nDot18xlarge]
  @scala.inline
  def c5nDot2xlarge: c5nDot2xlarge = "c5n.2xlarge".asInstanceOf[c5nDot2xlarge]
  @scala.inline
  def c5nDot4xlarge: c5nDot4xlarge = "c5n.4xlarge".asInstanceOf[c5nDot4xlarge]
  @scala.inline
  def c5nDot9xlarge: c5nDot9xlarge = "c5n.9xlarge".asInstanceOf[c5nDot9xlarge]
  @scala.inline
  def c5nDotlarge: c5nDotlarge = "c5n.large".asInstanceOf[c5nDotlarge]
  @scala.inline
  def c5nDotxlarge: c5nDotxlarge = "c5n.xlarge".asInstanceOf[c5nDotxlarge]
  @scala.inline
  def `ca-central-1`: `ca-central-1` = "ca-central-1".asInstanceOf[`ca-central-1`]
  @scala.inline
  def cluster: cluster = "cluster".asInstanceOf[cluster]
  @scala.inline
  def `cn-north-1`: `cn-north-1` = "cn-north-1".asInstanceOf[`cn-north-1`]
  @scala.inline
  def `cn-northwest-1`: `cn-northwest-1` = "cn-northwest-1".asInstanceOf[`cn-northwest-1`]
  @scala.inline
  def core: core = "core".asInstanceOf[core]
  @scala.inline
  def cpu: cpu = "cpu".asInstanceOf[cpu]
  @scala.inline
  def d2Dot2xlarge: d2Dot2xlarge = "d2.2xlarge".asInstanceOf[d2Dot2xlarge]
  @scala.inline
  def d2Dot4xlarge: d2Dot4xlarge = "d2.4xlarge".asInstanceOf[d2Dot4xlarge]
  @scala.inline
  def d2Dot8xlarge: d2Dot8xlarge = "d2.8xlarge".asInstanceOf[d2Dot8xlarge]
  @scala.inline
  def d2Dotxlarge: d2Dotxlarge = "d2.xlarge".asInstanceOf[d2Dotxlarge]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def dbDotm1Dotlarge: dbDotm1Dotlarge = "db.m1.large".asInstanceOf[dbDotm1Dotlarge]
  @scala.inline
  def dbDotm1Dotmedium: dbDotm1Dotmedium = "db.m1.medium".asInstanceOf[dbDotm1Dotmedium]
  @scala.inline
  def dbDotm1Dotsmall: dbDotm1Dotsmall = "db.m1.small".asInstanceOf[dbDotm1Dotsmall]
  @scala.inline
  def dbDotm1Dotxlarge: dbDotm1Dotxlarge = "db.m1.xlarge".asInstanceOf[dbDotm1Dotxlarge]
  @scala.inline
  def dbDotm2Dot2xlarge: dbDotm2Dot2xlarge = "db.m2.2xlarge".asInstanceOf[dbDotm2Dot2xlarge]
  @scala.inline
  def dbDotm2Dot4xlarge: dbDotm2Dot4xlarge = "db.m2.4xlarge".asInstanceOf[dbDotm2Dot4xlarge]
  @scala.inline
  def dbDotm2Dotxlarge: dbDotm2Dotxlarge = "db.m2.xlarge".asInstanceOf[dbDotm2Dotxlarge]
  @scala.inline
  def dbDotm3Dot2xlarge: dbDotm3Dot2xlarge = "db.m3.2xlarge".asInstanceOf[dbDotm3Dot2xlarge]
  @scala.inline
  def dbDotm3Dotlarge: dbDotm3Dotlarge = "db.m3.large".asInstanceOf[dbDotm3Dotlarge]
  @scala.inline
  def dbDotm3Dotmedium: dbDotm3Dotmedium = "db.m3.medium".asInstanceOf[dbDotm3Dotmedium]
  @scala.inline
  def dbDotm3Dotxlarge: dbDotm3Dotxlarge = "db.m3.xlarge".asInstanceOf[dbDotm3Dotxlarge]
  @scala.inline
  def dbDotm4Dot10xlarge: dbDotm4Dot10xlarge = "db.m4.10xlarge".asInstanceOf[dbDotm4Dot10xlarge]
  @scala.inline
  def dbDotm4Dot16xlarge: dbDotm4Dot16xlarge = "db.m4.16xlarge".asInstanceOf[dbDotm4Dot16xlarge]
  @scala.inline
  def dbDotm4Dot2xlarge: dbDotm4Dot2xlarge = "db.m4.2xlarge".asInstanceOf[dbDotm4Dot2xlarge]
  @scala.inline
  def dbDotm4Dot4xlarge: dbDotm4Dot4xlarge = "db.m4.4xlarge".asInstanceOf[dbDotm4Dot4xlarge]
  @scala.inline
  def dbDotm4Dotlarge: dbDotm4Dotlarge = "db.m4.large".asInstanceOf[dbDotm4Dotlarge]
  @scala.inline
  def dbDotm4Dotxlarge: dbDotm4Dotxlarge = "db.m4.xlarge".asInstanceOf[dbDotm4Dotxlarge]
  @scala.inline
  def dbDotm5Dot12xlarge: dbDotm5Dot12xlarge = "db.m5.12xlarge".asInstanceOf[dbDotm5Dot12xlarge]
  @scala.inline
  def dbDotm5Dot24xlarge: dbDotm5Dot24xlarge = "db.m5.24xlarge".asInstanceOf[dbDotm5Dot24xlarge]
  @scala.inline
  def dbDotm5Dot2xlarge: dbDotm5Dot2xlarge = "db.m5.2xlarge".asInstanceOf[dbDotm5Dot2xlarge]
  @scala.inline
  def dbDotm5Dot4xlarge: dbDotm5Dot4xlarge = "db.m5.4xlarge".asInstanceOf[dbDotm5Dot4xlarge]
  @scala.inline
  def dbDotm5Dotlarge: dbDotm5Dotlarge = "db.m5.large".asInstanceOf[dbDotm5Dotlarge]
  @scala.inline
  def dbDotm5Dotxlarge: dbDotm5Dotxlarge = "db.m5.xlarge".asInstanceOf[dbDotm5Dotxlarge]
  @scala.inline
  def dbDotr3Dot2xlarge: dbDotr3Dot2xlarge = "db.r3.2xlarge".asInstanceOf[dbDotr3Dot2xlarge]
  @scala.inline
  def dbDotr3Dot4xlarge: dbDotr3Dot4xlarge = "db.r3.4xlarge".asInstanceOf[dbDotr3Dot4xlarge]
  @scala.inline
  def dbDotr3Dot8xlarge: dbDotr3Dot8xlarge = "db.r3.8xlarge".asInstanceOf[dbDotr3Dot8xlarge]
  @scala.inline
  def dbDotr3Dotlarge: dbDotr3Dotlarge = "db.r3.large".asInstanceOf[dbDotr3Dotlarge]
  @scala.inline
  def dbDotr3Dotxlarge: dbDotr3Dotxlarge = "db.r3.xlarge".asInstanceOf[dbDotr3Dotxlarge]
  @scala.inline
  def dbDotr4Dot16xlarge: dbDotr4Dot16xlarge = "db.r4.16xlarge".asInstanceOf[dbDotr4Dot16xlarge]
  @scala.inline
  def dbDotr4Dot2xlarge: dbDotr4Dot2xlarge = "db.r4.2xlarge".asInstanceOf[dbDotr4Dot2xlarge]
  @scala.inline
  def dbDotr4Dot4xlarge: dbDotr4Dot4xlarge = "db.r4.4xlarge".asInstanceOf[dbDotr4Dot4xlarge]
  @scala.inline
  def dbDotr4Dot8xlarge: dbDotr4Dot8xlarge = "db.r4.8xlarge".asInstanceOf[dbDotr4Dot8xlarge]
  @scala.inline
  def dbDotr4Dotlarge: dbDotr4Dotlarge = "db.r4.large".asInstanceOf[dbDotr4Dotlarge]
  @scala.inline
  def dbDotr4Dotxlarge: dbDotr4Dotxlarge = "db.r4.xlarge".asInstanceOf[dbDotr4Dotxlarge]
  @scala.inline
  def dbDotr5Dot12xlarge: dbDotr5Dot12xlarge = "db.r5.12xlarge".asInstanceOf[dbDotr5Dot12xlarge]
  @scala.inline
  def dbDotr5Dot24xlarge: dbDotr5Dot24xlarge = "db.r5.24xlarge".asInstanceOf[dbDotr5Dot24xlarge]
  @scala.inline
  def dbDotr5Dot2xlarge: dbDotr5Dot2xlarge = "db.r5.2xlarge".asInstanceOf[dbDotr5Dot2xlarge]
  @scala.inline
  def dbDotr5Dot4xlarge: dbDotr5Dot4xlarge = "db.r5.4xlarge".asInstanceOf[dbDotr5Dot4xlarge]
  @scala.inline
  def dbDotr5Dotlarge: dbDotr5Dotlarge = "db.r5.large".asInstanceOf[dbDotr5Dotlarge]
  @scala.inline
  def dbDotr5Dotxlarge: dbDotr5Dotxlarge = "db.r5.xlarge".asInstanceOf[dbDotr5Dotxlarge]
  @scala.inline
  def dbDott2Dot2xlarge: dbDott2Dot2xlarge = "db.t2.2xlarge".asInstanceOf[dbDott2Dot2xlarge]
  @scala.inline
  def dbDott2Dotlarge: dbDott2Dotlarge = "db.t2.large".asInstanceOf[dbDott2Dotlarge]
  @scala.inline
  def dbDott2Dotmedium: dbDott2Dotmedium = "db.t2.medium".asInstanceOf[dbDott2Dotmedium]
  @scala.inline
  def dbDott2Dotmicro: dbDott2Dotmicro = "db.t2.micro".asInstanceOf[dbDott2Dotmicro]
  @scala.inline
  def dbDott2Dotsmall: dbDott2Dotsmall = "db.t2.small".asInstanceOf[dbDott2Dotsmall]
  @scala.inline
  def dbDott2Dotxlarge: dbDott2Dotxlarge = "db.t2.xlarge".asInstanceOf[dbDott2Dotxlarge]
  @scala.inline
  def dbDott3Dot2xlarge: dbDott3Dot2xlarge = "db.t3.2xlarge".asInstanceOf[dbDott3Dot2xlarge]
  @scala.inline
  def dbDott3Dotlarge: dbDott3Dotlarge = "db.t3.large".asInstanceOf[dbDott3Dotlarge]
  @scala.inline
  def dbDott3Dotmedium: dbDott3Dotmedium = "db.t3.medium".asInstanceOf[dbDott3Dotmedium]
  @scala.inline
  def dbDott3Dotmicro: dbDott3Dotmicro = "db.t3.micro".asInstanceOf[dbDott3Dotmicro]
  @scala.inline
  def dbDott3Dotsmall: dbDott3Dotsmall = "db.t3.small".asInstanceOf[dbDott3Dotsmall]
  @scala.inline
  def dbDott3Dotxlarge: dbDott3Dotxlarge = "db.t3.xlarge".asInstanceOf[dbDott3Dotxlarge]
  @scala.inline
  def dbDotx1Dot16xlarge: dbDotx1Dot16xlarge = "db.x1.16xlarge".asInstanceOf[dbDotx1Dot16xlarge]
  @scala.inline
  def dbDotx1Dot32xlarge: dbDotx1Dot32xlarge = "db.x1.32xlarge".asInstanceOf[dbDotx1Dot32xlarge]
  @scala.inline
  def dbDotx1eDot2xlarge: dbDotx1eDot2xlarge = "db.x1e.2xlarge".asInstanceOf[dbDotx1eDot2xlarge]
  @scala.inline
  def dbDotx1eDot32xlarge: dbDotx1eDot32xlarge = "db.x1e.32xlarge".asInstanceOf[dbDotx1eDot32xlarge]
  @scala.inline
  def dbDotx1eDot4xlarge: dbDotx1eDot4xlarge = "db.x1e.4xlarge".asInstanceOf[dbDotx1eDot4xlarge]
  @scala.inline
  def dbDotx1eDot8xlarge: dbDotx1eDot8xlarge = "db.x1e.8xlarge".asInstanceOf[dbDotx1eDot8xlarge]
  @scala.inline
  def dbDotx1eDotxlarge: dbDotx1eDotxlarge = "db.x1e.xlarge".asInstanceOf[dbDotx1eDotxlarge]
  @scala.inline
  def dedicated: dedicated = "dedicated".asInstanceOf[dedicated]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def dotnetcore1Dot0: dotnetcore1Dot0 = "dotnetcore1.0".asInstanceOf[dotnetcore1Dot0]
  @scala.inline
  def dotnetcore2Dot0: dotnetcore2Dot0 = "dotnetcore2.0".asInstanceOf[dotnetcore2Dot0]
  @scala.inline
  def dotnetcore2Dot1: dotnetcore2Dot1 = "dotnetcore2.1".asInstanceOf[dotnetcore2Dot1]
  @scala.inline
  def dotnetcore3Dot1: dotnetcore3Dot1 = "dotnetcore3.1".asInstanceOf[dotnetcore3Dot1]
  @scala.inline
  def dualstack: dualstack = "dualstack".asInstanceOf[dualstack]
  @scala.inline
  def `eu-central-1`: `eu-central-1` = "eu-central-1".asInstanceOf[`eu-central-1`]
  @scala.inline
  def `eu-north-1`: `eu-north-1` = "eu-north-1".asInstanceOf[`eu-north-1`]
  @scala.inline
  def `eu-west-1`: `eu-west-1` = "eu-west-1".asInstanceOf[`eu-west-1`]
  @scala.inline
  def `eu-west-2`: `eu-west-2` = "eu-west-2".asInstanceOf[`eu-west-2`]
  @scala.inline
  def `eu-west-3`: `eu-west-3` = "eu-west-3".asInstanceOf[`eu-west-3`]
  @scala.inline
  def expire: expire = "expire".asInstanceOf[expire]
  @scala.inline
  def f1Dot16xlarge: f1Dot16xlarge = "f1.16xlarge".asInstanceOf[f1Dot16xlarge]
  @scala.inline
  def f1Dot2xlarge: f1Dot2xlarge = "f1.2xlarge".asInstanceOf[f1Dot2xlarge]
  @scala.inline
  def fluentd: fluentd = "fluentd".asInstanceOf[fluentd]
  @scala.inline
  def fsize: fsize = "fsize".asInstanceOf[fsize]
  @scala.inline
  def g2Dot2xlarge: g2Dot2xlarge = "g2.2xlarge".asInstanceOf[g2Dot2xlarge]
  @scala.inline
  def g2Dot8xlarge: g2Dot8xlarge = "g2.8xlarge".asInstanceOf[g2Dot8xlarge]
  @scala.inline
  def g3Dot16xlarge: g3Dot16xlarge = "g3.16xlarge".asInstanceOf[g3Dot16xlarge]
  @scala.inline
  def g3Dot4xlarge: g3Dot4xlarge = "g3.4xlarge".asInstanceOf[g3Dot4xlarge]
  @scala.inline
  def g3Dot8xlarge: g3Dot8xlarge = "g3.8xlarge".asInstanceOf[g3Dot8xlarge]
  @scala.inline
  def g3sDotxlarge: g3sDotxlarge = "g3s.xlarge".asInstanceOf[g3sDotxlarge]
  @scala.inline
  def gelf: gelf = "gelf".asInstanceOf[gelf]
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  @scala.inline
  def go1Dotx: go1Dotx = "go1.x".asInstanceOf[go1Dotx]
  @scala.inline
  def gp2: gp2 = "gp2".asInstanceOf[gp2]
  @scala.inline
  def h1Dot16xlarge: h1Dot16xlarge = "h1.16xlarge".asInstanceOf[h1Dot16xlarge]
  @scala.inline
  def h1Dot2xlarge: h1Dot2xlarge = "h1.2xlarge".asInstanceOf[h1Dot2xlarge]
  @scala.inline
  def h1Dot4xlarge: h1Dot4xlarge = "h1.4xlarge".asInstanceOf[h1Dot4xlarge]
  @scala.inline
  def h1Dot8xlarge: h1Dot8xlarge = "h1.8xlarge".asInstanceOf[h1Dot8xlarge]
  @scala.inline
  def hs1Dot8xlarge: hs1Dot8xlarge = "hs1.8xlarge".asInstanceOf[hs1Dot8xlarge]
  @scala.inline
  def i3Dot16xlarge: i3Dot16xlarge = "i3.16xlarge".asInstanceOf[i3Dot16xlarge]
  @scala.inline
  def i3Dot2xlarge: i3Dot2xlarge = "i3.2xlarge".asInstanceOf[i3Dot2xlarge]
  @scala.inline
  def i3Dot4xlarge: i3Dot4xlarge = "i3.4xlarge".asInstanceOf[i3Dot4xlarge]
  @scala.inline
  def i3Dot8xlarge: i3Dot8xlarge = "i3.8xlarge".asInstanceOf[i3Dot8xlarge]
  @scala.inline
  def i3Dotlarge: i3Dotlarge = "i3.large".asInstanceOf[i3Dotlarge]
  @scala.inline
  def i3Dotmetal: i3Dotmetal = "i3.metal".asInstanceOf[i3Dotmetal]
  @scala.inline
  def i3Dotxlarge: i3Dotxlarge = "i3.xlarge".asInstanceOf[i3Dotxlarge]
  @scala.inline
  def icmp: icmp = "icmp".asInstanceOf[icmp]
  @scala.inline
  def imageCountMoreThan: imageCountMoreThan = "imageCountMoreThan".asInstanceOf[imageCountMoreThan]
  @scala.inline
  def io1: io1 = "io1".asInstanceOf[io1]
  @scala.inline
  def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  @scala.inline
  def java11: java11 = "java11".asInstanceOf[java11]
  @scala.inline
  def java8: java8 = "java8".asInstanceOf[java8]
  @scala.inline
  def journald: journald = "journald".asInstanceOf[journald]
  @scala.inline
  def `json-file`: `json-file` = "json-file".asInstanceOf[`json-file`]
  @scala.inline
  def locks: locks = "locks".asInstanceOf[locks]
  @scala.inline
  def `log-delivery-write`: `log-delivery-write` = "log-delivery-write".asInstanceOf[`log-delivery-write`]
  @scala.inline
  def m3Dot2xlarge: m3Dot2xlarge = "m3.2xlarge".asInstanceOf[m3Dot2xlarge]
  @scala.inline
  def m3Dotlarge: m3Dotlarge = "m3.large".asInstanceOf[m3Dotlarge]
  @scala.inline
  def m3Dotmedium: m3Dotmedium = "m3.medium".asInstanceOf[m3Dotmedium]
  @scala.inline
  def m3Dotxlarge: m3Dotxlarge = "m3.xlarge".asInstanceOf[m3Dotxlarge]
  @scala.inline
  def m4Dot10xlarge: m4Dot10xlarge = "m4.10xlarge".asInstanceOf[m4Dot10xlarge]
  @scala.inline
  def m4Dot16xlarge: m4Dot16xlarge = "m4.16xlarge".asInstanceOf[m4Dot16xlarge]
  @scala.inline
  def m4Dot2xlarge: m4Dot2xlarge = "m4.2xlarge".asInstanceOf[m4Dot2xlarge]
  @scala.inline
  def m4Dot4xlarge: m4Dot4xlarge = "m4.4xlarge".asInstanceOf[m4Dot4xlarge]
  @scala.inline
  def m4Dotlarge: m4Dotlarge = "m4.large".asInstanceOf[m4Dotlarge]
  @scala.inline
  def m4Dotxlarge: m4Dotxlarge = "m4.xlarge".asInstanceOf[m4Dotxlarge]
  @scala.inline
  def m5Dot12xlarge: m5Dot12xlarge = "m5.12xlarge".asInstanceOf[m5Dot12xlarge]
  @scala.inline
  def m5Dot24xlarge: m5Dot24xlarge = "m5.24xlarge".asInstanceOf[m5Dot24xlarge]
  @scala.inline
  def m5Dot2xlarge: m5Dot2xlarge = "m5.2xlarge".asInstanceOf[m5Dot2xlarge]
  @scala.inline
  def m5Dot4xlarge: m5Dot4xlarge = "m5.4xlarge".asInstanceOf[m5Dot4xlarge]
  @scala.inline
  def m5Dotlarge: m5Dotlarge = "m5.large".asInstanceOf[m5Dotlarge]
  @scala.inline
  def m5Dotxlarge: m5Dotxlarge = "m5.xlarge".asInstanceOf[m5Dotxlarge]
  @scala.inline
  def m5aDot12xlarge: m5aDot12xlarge = "m5a.12xlarge".asInstanceOf[m5aDot12xlarge]
  @scala.inline
  def m5aDot24xlarge: m5aDot24xlarge = "m5a.24xlarge".asInstanceOf[m5aDot24xlarge]
  @scala.inline
  def m5aDot2xlarge: m5aDot2xlarge = "m5a.2xlarge".asInstanceOf[m5aDot2xlarge]
  @scala.inline
  def m5aDot4xlarge: m5aDot4xlarge = "m5a.4xlarge".asInstanceOf[m5aDot4xlarge]
  @scala.inline
  def m5aDotlarge: m5aDotlarge = "m5a.large".asInstanceOf[m5aDotlarge]
  @scala.inline
  def m5aDotxlarge: m5aDotxlarge = "m5a.xlarge".asInstanceOf[m5aDotxlarge]
  @scala.inline
  def m5dDot12xlarge: m5dDot12xlarge = "m5d.12xlarge".asInstanceOf[m5dDot12xlarge]
  @scala.inline
  def m5dDot24xlarge: m5dDot24xlarge = "m5d.24xlarge".asInstanceOf[m5dDot24xlarge]
  @scala.inline
  def m5dDot2xlarge: m5dDot2xlarge = "m5d.2xlarge".asInstanceOf[m5dDot2xlarge]
  @scala.inline
  def m5dDot4xlarge: m5dDot4xlarge = "m5d.4xlarge".asInstanceOf[m5dDot4xlarge]
  @scala.inline
  def m5dDotlarge: m5dDotlarge = "m5d.large".asInstanceOf[m5dDotlarge]
  @scala.inline
  def m5dDotxlarge: m5dDotxlarge = "m5d.xlarge".asInstanceOf[m5dDotxlarge]
  @scala.inline
  def `me-south-1`: `me-south-1` = "me-south-1".asInstanceOf[`me-south-1`]
  @scala.inline
  def memlock: memlock = "memlock".asInstanceOf[memlock]
  @scala.inline
  def msgqueue: msgqueue = "msgqueue".asInstanceOf[msgqueue]
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  @scala.inline
  def nice: nice = "nice".asInstanceOf[nice]
  @scala.inline
  def nodejs: nodejs = "nodejs".asInstanceOf[nodejs]
  @scala.inline
  def nodejs10Dotx: nodejs10Dotx = "nodejs10.x".asInstanceOf[nodejs10Dotx]
  @scala.inline
  def nodejs12Dotx: nodejs12Dotx = "nodejs12.x".asInstanceOf[nodejs12Dotx]
  @scala.inline
  def nodejs4Dot3: nodejs4Dot3 = "nodejs4.3".asInstanceOf[nodejs4Dot3]
  @scala.inline
  def `nodejs4Dot3-edge`: `nodejs4Dot3-edge` = "nodejs4.3-edge".asInstanceOf[`nodejs4Dot3-edge`]
  @scala.inline
  def nodejs6Dot10: nodejs6Dot10 = "nodejs6.10".asInstanceOf[nodejs6Dot10]
  @scala.inline
  def nodejs8Dot10: nodejs8Dot10 = "nodejs8.10".asInstanceOf[nodejs8Dot10]
  @scala.inline
  def nofile: nofile = "nofile".asInstanceOf[nofile]
  @scala.inline
  def nproc: nproc = "nproc".asInstanceOf[nproc]
  @scala.inline
  def p2Dot16xlarge: p2Dot16xlarge = "p2.16xlarge".asInstanceOf[p2Dot16xlarge]
  @scala.inline
  def p2Dot8xlarge: p2Dot8xlarge = "p2.8xlarge".asInstanceOf[p2Dot8xlarge]
  @scala.inline
  def p2Dotxlarge: p2Dotxlarge = "p2.xlarge".asInstanceOf[p2Dotxlarge]
  @scala.inline
  def p3Dot16xlarge: p3Dot16xlarge = "p3.16xlarge".asInstanceOf[p3Dot16xlarge]
  @scala.inline
  def p3Dot2xlarge: p3Dot2xlarge = "p3.2xlarge".asInstanceOf[p3Dot2xlarge]
  @scala.inline
  def p3Dot8xlarge: p3Dot8xlarge = "p3.8xlarge".asInstanceOf[p3Dot8xlarge]
  @scala.inline
  def p3dnDot24xlarge: p3dnDot24xlarge = "p3dn.24xlarge".asInstanceOf[p3dnDot24xlarge]
  @scala.inline
  def parallelquery: parallelquery = "parallelquery".asInstanceOf[parallelquery]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def provided: provided = "provided".asInstanceOf[provided]
  @scala.inline
  def provisioned: provisioned = "provisioned".asInstanceOf[provisioned]
  @scala.inline
  def `public-read`: `public-read` = "public-read".asInstanceOf[`public-read`]
  @scala.inline
  def `public-read-write`: `public-read-write` = "public-read-write".asInstanceOf[`public-read-write`]
  @scala.inline
  def python2Dot7: python2Dot7 = "python2.7".asInstanceOf[python2Dot7]
  @scala.inline
  def python3Dot6: python3Dot6 = "python3.6".asInstanceOf[python3Dot6]
  @scala.inline
  def python3Dot7: python3Dot7 = "python3.7".asInstanceOf[python3Dot7]
  @scala.inline
  def python3Dot8: python3Dot8 = "python3.8".asInstanceOf[python3Dot8]
  @scala.inline
  def r3Dot2xlarge: r3Dot2xlarge = "r3.2xlarge".asInstanceOf[r3Dot2xlarge]
  @scala.inline
  def r3Dot4xlarge: r3Dot4xlarge = "r3.4xlarge".asInstanceOf[r3Dot4xlarge]
  @scala.inline
  def r3Dot8xlarge: r3Dot8xlarge = "r3.8xlarge".asInstanceOf[r3Dot8xlarge]
  @scala.inline
  def r3Dotlarge: r3Dotlarge = "r3.large".asInstanceOf[r3Dotlarge]
  @scala.inline
  def r3Dotxlarge: r3Dotxlarge = "r3.xlarge".asInstanceOf[r3Dotxlarge]
  @scala.inline
  def r4Dot16xlarge: r4Dot16xlarge = "r4.16xlarge".asInstanceOf[r4Dot16xlarge]
  @scala.inline
  def r4Dot2xlarge: r4Dot2xlarge = "r4.2xlarge".asInstanceOf[r4Dot2xlarge]
  @scala.inline
  def r4Dot4xlarge: r4Dot4xlarge = "r4.4xlarge".asInstanceOf[r4Dot4xlarge]
  @scala.inline
  def r4Dot8xlarge: r4Dot8xlarge = "r4.8xlarge".asInstanceOf[r4Dot8xlarge]
  @scala.inline
  def r4Dotlarge: r4Dotlarge = "r4.large".asInstanceOf[r4Dotlarge]
  @scala.inline
  def r4Dotxlarge: r4Dotxlarge = "r4.xlarge".asInstanceOf[r4Dotxlarge]
  @scala.inline
  def r5Dot12xlarge: r5Dot12xlarge = "r5.12xlarge".asInstanceOf[r5Dot12xlarge]
  @scala.inline
  def r5Dot24xlarge: r5Dot24xlarge = "r5.24xlarge".asInstanceOf[r5Dot24xlarge]
  @scala.inline
  def r5Dot2xlarge: r5Dot2xlarge = "r5.2xlarge".asInstanceOf[r5Dot2xlarge]
  @scala.inline
  def r5Dot4xlarge: r5Dot4xlarge = "r5.4xlarge".asInstanceOf[r5Dot4xlarge]
  @scala.inline
  def r5Dotlarge: r5Dotlarge = "r5.large".asInstanceOf[r5Dotlarge]
  @scala.inline
  def r5Dotxlarge: r5Dotxlarge = "r5.xlarge".asInstanceOf[r5Dotxlarge]
  @scala.inline
  def r5aDot12xlarge: r5aDot12xlarge = "r5a.12xlarge".asInstanceOf[r5aDot12xlarge]
  @scala.inline
  def r5aDot24xlarge: r5aDot24xlarge = "r5a.24xlarge".asInstanceOf[r5aDot24xlarge]
  @scala.inline
  def r5aDot2xlarge: r5aDot2xlarge = "r5a.2xlarge".asInstanceOf[r5aDot2xlarge]
  @scala.inline
  def r5aDot4xlarge: r5aDot4xlarge = "r5a.4xlarge".asInstanceOf[r5aDot4xlarge]
  @scala.inline
  def r5aDotlarge: r5aDotlarge = "r5a.large".asInstanceOf[r5aDotlarge]
  @scala.inline
  def r5aDotxlarge: r5aDotxlarge = "r5a.xlarge".asInstanceOf[r5aDotxlarge]
  @scala.inline
  def r5dDot12xlarge: r5dDot12xlarge = "r5d.12xlarge".asInstanceOf[r5dDot12xlarge]
  @scala.inline
  def r5dDot24xlarge: r5dDot24xlarge = "r5d.24xlarge".asInstanceOf[r5dDot24xlarge]
  @scala.inline
  def r5dDot2xlarge: r5dDot2xlarge = "r5d.2xlarge".asInstanceOf[r5dDot2xlarge]
  @scala.inline
  def r5dDot4xlarge: r5dDot4xlarge = "r5d.4xlarge".asInstanceOf[r5dDot4xlarge]
  @scala.inline
  def r5dDotlarge: r5dDotlarge = "r5d.large".asInstanceOf[r5dDotlarge]
  @scala.inline
  def r5dDotxlarge: r5dDotxlarge = "r5d.xlarge".asInstanceOf[r5dDotxlarge]
  @scala.inline
  def rss: rss = "rss".asInstanceOf[rss]
  @scala.inline
  def rtprio: rtprio = "rtprio".asInstanceOf[rtprio]
  @scala.inline
  def rttime: rttime = "rttime".asInstanceOf[rttime]
  @scala.inline
  def ruby2Dot5: ruby2Dot5 = "ruby2.5".asInstanceOf[ruby2Dot5]
  @scala.inline
  def ruby2Dot7: ruby2Dot7 = "ruby2.7".asInstanceOf[ruby2Dot7]
  @scala.inline
  def `sa-east-1`: `sa-east-1` = "sa-east-1".asInstanceOf[`sa-east-1`]
  @scala.inline
  def serverless: serverless = "serverless".asInstanceOf[serverless]
  @scala.inline
  def sigpending: sigpending = "sigpending".asInstanceOf[sigpending]
  @scala.inline
  def sinceImagePushed: sinceImagePushed = "sinceImagePushed".asInstanceOf[sinceImagePushed]
  @scala.inline
  def splunk: splunk = "splunk".asInstanceOf[splunk]
  @scala.inline
  def spread: spread = "spread".asInstanceOf[spread]
  @scala.inline
  def stack: stack = "stack".asInstanceOf[stack]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  @scala.inline
  def syslog_ : syslog_ = "syslog".asInstanceOf[syslog_]
  @scala.inline
  def t2Dot2xlarge: t2Dot2xlarge = "t2.2xlarge".asInstanceOf[t2Dot2xlarge]
  @scala.inline
  def t2Dotlarge: t2Dotlarge = "t2.large".asInstanceOf[t2Dotlarge]
  @scala.inline
  def t2Dotmedium: t2Dotmedium = "t2.medium".asInstanceOf[t2Dotmedium]
  @scala.inline
  def t2Dotmicro: t2Dotmicro = "t2.micro".asInstanceOf[t2Dotmicro]
  @scala.inline
  def t2Dotnano: t2Dotnano = "t2.nano".asInstanceOf[t2Dotnano]
  @scala.inline
  def t2Dotsmall: t2Dotsmall = "t2.small".asInstanceOf[t2Dotsmall]
  @scala.inline
  def t2Dotxlarge: t2Dotxlarge = "t2.xlarge".asInstanceOf[t2Dotxlarge]
  @scala.inline
  def t3Dot2xlarge: t3Dot2xlarge = "t3.2xlarge".asInstanceOf[t3Dot2xlarge]
  @scala.inline
  def t3Dotlarge: t3Dotlarge = "t3.large".asInstanceOf[t3Dotlarge]
  @scala.inline
  def t3Dotmedium: t3Dotmedium = "t3.medium".asInstanceOf[t3Dotmedium]
  @scala.inline
  def t3Dotmicro: t3Dotmicro = "t3.micro".asInstanceOf[t3Dotmicro]
  @scala.inline
  def t3Dotnano: t3Dotnano = "t3.nano".asInstanceOf[t3Dotnano]
  @scala.inline
  def t3Dotsmall: t3Dotsmall = "t3.small".asInstanceOf[t3Dotsmall]
  @scala.inline
  def t3Dotxlarge: t3Dotxlarge = "t3.xlarge".asInstanceOf[t3Dotxlarge]
  @scala.inline
  def t3aDot2xlarge: t3aDot2xlarge = "t3a.2xlarge".asInstanceOf[t3aDot2xlarge]
  @scala.inline
  def t3aDotlarge: t3aDotlarge = "t3a.large".asInstanceOf[t3aDotlarge]
  @scala.inline
  def t3aDotmedium: t3aDotmedium = "t3a.medium".asInstanceOf[t3aDotmedium]
  @scala.inline
  def t3aDotmicro: t3aDotmicro = "t3a.micro".asInstanceOf[t3aDotmicro]
  @scala.inline
  def t3aDotnano: t3aDotnano = "t3a.nano".asInstanceOf[t3aDotnano]
  @scala.inline
  def t3aDotsmall: t3aDotsmall = "t3a.small".asInstanceOf[t3aDotsmall]
  @scala.inline
  def t3aDotxlarge: t3aDotxlarge = "t3a.xlarge".asInstanceOf[t3aDotxlarge]
  @scala.inline
  def tagged: tagged = "tagged".asInstanceOf[tagged]
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  @scala.inline
  def `u-12tb1Dotmetal`: `u-12tb1Dotmetal` = "u-12tb1.metal".asInstanceOf[`u-12tb1Dotmetal`]
  @scala.inline
  def `u-6tb1Dotmetal`: `u-6tb1Dotmetal` = "u-6tb1.metal".asInstanceOf[`u-6tb1Dotmetal`]
  @scala.inline
  def `u-9tb1Dotmetal`: `u-9tb1Dotmetal` = "u-9tb1.metal".asInstanceOf[`u-9tb1Dotmetal`]
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  @scala.inline
  def untagged: untagged = "untagged".asInstanceOf[untagged]
  @scala.inline
  def `us-east-1`: `us-east-1` = "us-east-1".asInstanceOf[`us-east-1`]
  @scala.inline
  def `us-east-2`: `us-east-2` = "us-east-2".asInstanceOf[`us-east-2`]
  @scala.inline
  def `us-west-1`: `us-west-1` = "us-west-1".asInstanceOf[`us-west-1`]
  @scala.inline
  def `us-west-2`: `us-west-2` = "us-west-2".asInstanceOf[`us-west-2`]
  @scala.inline
  def x1Dot16xlarge: x1Dot16xlarge = "x1.16xlarge".asInstanceOf[x1Dot16xlarge]
  @scala.inline
  def x1Dot32xlarge: x1Dot32xlarge = "x1.32xlarge".asInstanceOf[x1Dot32xlarge]
  @scala.inline
  def x1eDot16xlarge: x1eDot16xlarge = "x1e.16xlarge".asInstanceOf[x1eDot16xlarge]
  @scala.inline
  def x1eDot2xlarge: x1eDot2xlarge = "x1e.2xlarge".asInstanceOf[x1eDot2xlarge]
  @scala.inline
  def x1eDot32xlarge: x1eDot32xlarge = "x1e.32xlarge".asInstanceOf[x1eDot32xlarge]
  @scala.inline
  def x1eDot4xlarge: x1eDot4xlarge = "x1e.4xlarge".asInstanceOf[x1eDot4xlarge]
  @scala.inline
  def x1eDot8xlarge: x1eDot8xlarge = "x1e.8xlarge".asInstanceOf[x1eDot8xlarge]
  @scala.inline
  def x1eDotxlarge: x1eDotxlarge = "x1e.xlarge".asInstanceOf[x1eDotxlarge]
  @scala.inline
  def z1dDot12xlarge: z1dDot12xlarge = "z1d.12xlarge".asInstanceOf[z1dDot12xlarge]
  @scala.inline
  def z1dDot2xlarge: z1dDot2xlarge = "z1d.2xlarge".asInstanceOf[z1dDot2xlarge]
  @scala.inline
  def z1dDot3xlarge: z1dDot3xlarge = "z1d.3xlarge".asInstanceOf[z1dDot3xlarge]
  @scala.inline
  def z1dDot6xlarge: z1dDot6xlarge = "z1d.6xlarge".asInstanceOf[z1dDot6xlarge]
  @scala.inline
  def z1dDotlarge: z1dDotlarge = "z1d.large".asInstanceOf[z1dDotlarge]
  @scala.inline
  def z1dDotxlarge: z1dDotxlarge = "z1d.xlarge".asInstanceOf[z1dDotxlarge]
}

