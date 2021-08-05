package typings.pulumiAws

import typings.pulumiAws.containerMod.KernelCapability
import typings.pulumiAws.containerMod.LogDriver
import typings.pulumiAws.containerMod.Protocol
import typings.pulumiAws.containerMod.UlimitName
import typings.pulumiAws.documentsMod.Principal
import typings.pulumiAws.enumsApplicationloadbalancingMod.IpAddressType
import typings.pulumiAws.enumsApplicationloadbalancingMod.LoadBalancerType
import typings.pulumiAws.enumsAutoscalingMod.Metric
import typings.pulumiAws.enumsAutoscalingMod.NotificationType
import typings.pulumiAws.enumsEc2Mod.InstancePlatform
import typings.pulumiAws.enumsEc2Mod.InstanceType
import typings.pulumiAws.enumsEc2Mod.PlacementStrategy
import typings.pulumiAws.enumsEc2Mod.ProtocolType
import typings.pulumiAws.enumsEc2Mod.Tenancy
import typings.pulumiAws.enumsIamMod.ManagedPolicy
import typings.pulumiAws.enumsLambdaMod.Runtime
import typings.pulumiAws.enumsMod.Region
import typings.pulumiAws.enumsRdsMod.EngineMode
import typings.pulumiAws.enumsRdsMod.EngineType
import typings.pulumiAws.enumsRdsMod.StorageType
import typings.pulumiAws.enumsRoute53Mod.RecordType
import typings.pulumiAws.enumsS3Mod.CannedAcl
import typings.pulumiAws.enumsSsmMod.ParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pulumiAwsStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with Tenancy
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `1Minute` extends StObject
  inline def `1Minute`: `1Minute` = "1Minute".asInstanceOf[`1Minute`]
  
  @js.native
  sealed trait `2008-10-17` extends StObject
  inline def `2008-10-17`: `2008-10-17` = "2008-10-17".asInstanceOf[`2008-10-17`]
  
  @js.native
  sealed trait `2012-10-17` extends StObject
  inline def `2012-10-17`: `2012-10-17` = "2012-10-17".asInstanceOf[`2012-10-17`]
  
  @js.native
  sealed trait A
    extends StObject
       with RecordType
  inline def A: A = "A".asInstanceOf[A]
  
  @js.native
  sealed trait AAAA
    extends StObject
       with RecordType
  inline def AAAA: AAAA = "AAAA".asInstanceOf[AAAA]
  
  @js.native
  sealed trait ALL
    extends StObject
       with KernelCapability
  inline def ALL: ALL = "ALL".asInstanceOf[ALL]
  
  @js.native
  sealed trait AT_TIMESTAMP extends StObject
  inline def AT_TIMESTAMP: AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[AT_TIMESTAMP]
  
  @js.native
  sealed trait AUDIT_CONTROL
    extends StObject
       with KernelCapability
  inline def AUDIT_CONTROL: AUDIT_CONTROL = "AUDIT_CONTROL".asInstanceOf[AUDIT_CONTROL]
  
  @js.native
  sealed trait AUDIT_WRITE
    extends StObject
       with KernelCapability
  inline def AUDIT_WRITE: AUDIT_WRITE = "AUDIT_WRITE".asInstanceOf[AUDIT_WRITE]
  
  @js.native
  sealed trait Allow extends StObject
  inline def Allow: Allow = "Allow".asInstanceOf[Allow]
  
  @js.native
  sealed trait Asterisk
    extends StObject
       with Principal
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait BLOCK_SUSPEND
    extends StObject
       with KernelCapability
  inline def BLOCK_SUSPEND: BLOCK_SUSPEND = "BLOCK_SUSPEND".asInstanceOf[BLOCK_SUSPEND]
  
  @js.native
  sealed trait CAA
    extends StObject
       with RecordType
  inline def CAA: CAA = "CAA".asInstanceOf[CAA]
  
  @js.native
  sealed trait CHOWN
    extends StObject
       with KernelCapability
  inline def CHOWN: CHOWN = "CHOWN".asInstanceOf[CHOWN]
  
  @js.native
  sealed trait CNAME
    extends StObject
       with RecordType
  inline def CNAME: CNAME = "CNAME".asInstanceOf[CNAME]
  
  @js.native
  sealed trait CompleteMultipartUpload extends StObject
  inline def CompleteMultipartUpload: CompleteMultipartUpload = "CompleteMultipartUpload".asInstanceOf[CompleteMultipartUpload]
  
  @js.native
  sealed trait Copy extends StObject
  inline def Copy: Copy = "Copy".asInstanceOf[Copy]
  
  @js.native
  sealed trait DAC_OVERRIDE
    extends StObject
       with KernelCapability
  inline def DAC_OVERRIDE: DAC_OVERRIDE = "DAC_OVERRIDE".asInstanceOf[DAC_OVERRIDE]
  
  @js.native
  sealed trait DAC_READ_SEARCH
    extends StObject
       with KernelCapability
  inline def DAC_READ_SEARCH: DAC_READ_SEARCH = "DAC_READ_SEARCH".asInstanceOf[DAC_READ_SEARCH]
  
  @js.native
  sealed trait Delete extends StObject
  inline def Delete: Delete = "Delete".asInstanceOf[Delete]
  
  @js.native
  sealed trait DeleteMarkerCreated extends StObject
  inline def DeleteMarkerCreated: DeleteMarkerCreated = "DeleteMarkerCreated".asInstanceOf[DeleteMarkerCreated]
  
  @js.native
  sealed trait Deny extends StObject
  inline def Deny: Deny = "Deny".asInstanceOf[Deny]
  
  @js.native
  sealed trait FOWNER
    extends StObject
       with KernelCapability
  inline def FOWNER: FOWNER = "FOWNER".asInstanceOf[FOWNER]
  
  @js.native
  sealed trait FSETID
    extends StObject
       with KernelCapability
  inline def FSETID: FSETID = "FSETID".asInstanceOf[FSETID]
  
  @js.native
  sealed trait GroupDesiredCapacity
    extends StObject
       with Metric
  inline def GroupDesiredCapacity: GroupDesiredCapacity = "GroupDesiredCapacity".asInstanceOf[GroupDesiredCapacity]
  
  @js.native
  sealed trait GroupInServiceCapacity
    extends StObject
       with Metric
  inline def GroupInServiceCapacity: GroupInServiceCapacity = "GroupInServiceCapacity".asInstanceOf[GroupInServiceCapacity]
  
  @js.native
  sealed trait GroupInServiceInstances
    extends StObject
       with Metric
  inline def GroupInServiceInstances: GroupInServiceInstances = "GroupInServiceInstances".asInstanceOf[GroupInServiceInstances]
  
  @js.native
  sealed trait GroupMaxSize
    extends StObject
       with Metric
  inline def GroupMaxSize: GroupMaxSize = "GroupMaxSize".asInstanceOf[GroupMaxSize]
  
  @js.native
  sealed trait GroupMinSize
    extends StObject
       with Metric
  inline def GroupMinSize: GroupMinSize = "GroupMinSize".asInstanceOf[GroupMinSize]
  
  @js.native
  sealed trait GroupPendingCapacity
    extends StObject
       with Metric
  inline def GroupPendingCapacity: GroupPendingCapacity = "GroupPendingCapacity".asInstanceOf[GroupPendingCapacity]
  
  @js.native
  sealed trait GroupPendingInstances
    extends StObject
       with Metric
  inline def GroupPendingInstances: GroupPendingInstances = "GroupPendingInstances".asInstanceOf[GroupPendingInstances]
  
  @js.native
  sealed trait GroupStandbyCapacity
    extends StObject
       with Metric
  inline def GroupStandbyCapacity: GroupStandbyCapacity = "GroupStandbyCapacity".asInstanceOf[GroupStandbyCapacity]
  
  @js.native
  sealed trait GroupStandbyInstances
    extends StObject
       with Metric
  inline def GroupStandbyInstances: GroupStandbyInstances = "GroupStandbyInstances".asInstanceOf[GroupStandbyInstances]
  
  @js.native
  sealed trait GroupTerminatingCapacity
    extends StObject
       with Metric
  inline def GroupTerminatingCapacity: GroupTerminatingCapacity = "GroupTerminatingCapacity".asInstanceOf[GroupTerminatingCapacity]
  
  @js.native
  sealed trait GroupTerminatingInstances
    extends StObject
       with Metric
  inline def GroupTerminatingInstances: GroupTerminatingInstances = "GroupTerminatingInstances".asInstanceOf[GroupTerminatingInstances]
  
  @js.native
  sealed trait GroupTotalCapacity
    extends StObject
       with Metric
  inline def GroupTotalCapacity: GroupTotalCapacity = "GroupTotalCapacity".asInstanceOf[GroupTotalCapacity]
  
  @js.native
  sealed trait GroupTotalInstances
    extends StObject
       with Metric
  inline def GroupTotalInstances: GroupTotalInstances = "GroupTotalInstances".asInstanceOf[GroupTotalInstances]
  
  @js.native
  sealed trait INSERT extends StObject
  inline def INSERT: INSERT = "INSERT".asInstanceOf[INSERT]
  
  @js.native
  sealed trait IPC_LOCK
    extends StObject
       with KernelCapability
  inline def IPC_LOCK: IPC_LOCK = "IPC_LOCK".asInstanceOf[IPC_LOCK]
  
  @js.native
  sealed trait IPC_OWNER
    extends StObject
       with KernelCapability
  inline def IPC_OWNER: IPC_OWNER = "IPC_OWNER".asInstanceOf[IPC_OWNER]
  
  @js.native
  sealed trait KILL
    extends StObject
       with KernelCapability
  inline def KILL: KILL = "KILL".asInstanceOf[KILL]
  
  @js.native
  sealed trait LATEST extends StObject
  inline def LATEST: LATEST = "LATEST".asInstanceOf[LATEST]
  
  @js.native
  sealed trait LEASE
    extends StObject
       with KernelCapability
  inline def LEASE: LEASE = "LEASE".asInstanceOf[LEASE]
  
  @js.native
  sealed trait LINUX_IMMUTABLE
    extends StObject
       with KernelCapability
  inline def LINUX_IMMUTABLE: LINUX_IMMUTABLE = "LINUX_IMMUTABLE".asInstanceOf[LINUX_IMMUTABLE]
  
  @js.native
  sealed trait LinuxSlashUNIX
    extends StObject
       with InstancePlatform
  inline def LinuxSlashUNIX: LinuxSlashUNIX = "Linux/UNIX".asInstanceOf[LinuxSlashUNIX]
  
  @js.native
  sealed trait MAC_ADMIN
    extends StObject
       with KernelCapability
  inline def MAC_ADMIN: MAC_ADMIN = "MAC_ADMIN".asInstanceOf[MAC_ADMIN]
  
  @js.native
  sealed trait MAC_OVERRIDE
    extends StObject
       with KernelCapability
  inline def MAC_OVERRIDE: MAC_OVERRIDE = "MAC_OVERRIDE".asInstanceOf[MAC_OVERRIDE]
  
  @js.native
  sealed trait MKNOD
    extends StObject
       with KernelCapability
  inline def MKNOD: MKNOD = "MKNOD".asInstanceOf[MKNOD]
  
  @js.native
  sealed trait MODIFY extends StObject
  inline def MODIFY: MODIFY = "MODIFY".asInstanceOf[MODIFY]
  
  @js.native
  sealed trait MX
    extends StObject
       with RecordType
  inline def MX: MX = "MX".asInstanceOf[MX]
  
  @js.native
  sealed trait NAPTR
    extends StObject
       with RecordType
  inline def NAPTR: NAPTR = "NAPTR".asInstanceOf[NAPTR]
  
  @js.native
  sealed trait NET_ADMIN
    extends StObject
       with KernelCapability
  inline def NET_ADMIN: NET_ADMIN = "NET_ADMIN".asInstanceOf[NET_ADMIN]
  
  @js.native
  sealed trait NET_BIND_SERVICE
    extends StObject
       with KernelCapability
  inline def NET_BIND_SERVICE: NET_BIND_SERVICE = "NET_BIND_SERVICE".asInstanceOf[NET_BIND_SERVICE]
  
  @js.native
  sealed trait NET_BROADCAST
    extends StObject
       with KernelCapability
  inline def NET_BROADCAST: NET_BROADCAST = "NET_BROADCAST".asInstanceOf[NET_BROADCAST]
  
  @js.native
  sealed trait NET_RAW
    extends StObject
       with KernelCapability
  inline def NET_RAW: NET_RAW = "NET_RAW".asInstanceOf[NET_RAW]
  
  @js.native
  sealed trait NS
    extends StObject
       with RecordType
  inline def NS: NS = "NS".asInstanceOf[NS]
  
  @js.native
  sealed trait PTR
    extends StObject
       with RecordType
  inline def PTR: PTR = "PTR".asInstanceOf[PTR]
  
  @js.native
  sealed trait Post extends StObject
  inline def Post: Post = "Post".asInstanceOf[Post]
  
  @js.native
  sealed trait Put extends StObject
  inline def Put: Put = "Put".asInstanceOf[Put]
  
  @js.native
  sealed trait REMOVE extends StObject
  inline def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  
  @js.native
  sealed trait `Red Hat Enterprise Linux`
    extends StObject
       with InstancePlatform
  inline def `Red Hat Enterprise Linux`: `Red Hat Enterprise Linux` = ("Red Hat Enterprise Linux").asInstanceOf[`Red Hat Enterprise Linux`]
  
  @js.native
  sealed trait SETFCAP
    extends StObject
       with KernelCapability
  inline def SETFCAP: SETFCAP = "SETFCAP".asInstanceOf[SETFCAP]
  
  @js.native
  sealed trait SETGID
    extends StObject
       with KernelCapability
  inline def SETGID: SETGID = "SETGID".asInstanceOf[SETGID]
  
  @js.native
  sealed trait SETPCAP
    extends StObject
       with KernelCapability
  inline def SETPCAP: SETPCAP = "SETPCAP".asInstanceOf[SETPCAP]
  
  @js.native
  sealed trait SETUID
    extends StObject
       with KernelCapability
  inline def SETUID: SETUID = "SETUID".asInstanceOf[SETUID]
  
  @js.native
  sealed trait SOA
    extends StObject
       with RecordType
  inline def SOA: SOA = "SOA".asInstanceOf[SOA]
  
  @js.native
  sealed trait SPF
    extends StObject
       with RecordType
  inline def SPF: SPF = "SPF".asInstanceOf[SPF]
  
  @js.native
  sealed trait SRV
    extends StObject
       with RecordType
  inline def SRV: SRV = "SRV".asInstanceOf[SRV]
  
  @js.native
  sealed trait `SUSE Linux`
    extends StObject
       with InstancePlatform
  inline def `SUSE Linux`: `SUSE Linux` = ("SUSE Linux").asInstanceOf[`SUSE Linux`]
  
  @js.native
  sealed trait SYSLOG
    extends StObject
       with KernelCapability
  inline def SYSLOG: SYSLOG = "SYSLOG".asInstanceOf[SYSLOG]
  
  @js.native
  sealed trait SYS_ADMIN
    extends StObject
       with KernelCapability
  inline def SYS_ADMIN: SYS_ADMIN = "SYS_ADMIN".asInstanceOf[SYS_ADMIN]
  
  @js.native
  sealed trait SYS_BOOT
    extends StObject
       with KernelCapability
  inline def SYS_BOOT: SYS_BOOT = "SYS_BOOT".asInstanceOf[SYS_BOOT]
  
  @js.native
  sealed trait SYS_CHROOT
    extends StObject
       with KernelCapability
  inline def SYS_CHROOT: SYS_CHROOT = "SYS_CHROOT".asInstanceOf[SYS_CHROOT]
  
  @js.native
  sealed trait SYS_MODULE
    extends StObject
       with KernelCapability
  inline def SYS_MODULE: SYS_MODULE = "SYS_MODULE".asInstanceOf[SYS_MODULE]
  
  @js.native
  sealed trait SYS_NICE
    extends StObject
       with KernelCapability
  inline def SYS_NICE: SYS_NICE = "SYS_NICE".asInstanceOf[SYS_NICE]
  
  @js.native
  sealed trait SYS_PACCT
    extends StObject
       with KernelCapability
  inline def SYS_PACCT: SYS_PACCT = "SYS_PACCT".asInstanceOf[SYS_PACCT]
  
  @js.native
  sealed trait SYS_PTRACE
    extends StObject
       with KernelCapability
  inline def SYS_PTRACE: SYS_PTRACE = "SYS_PTRACE".asInstanceOf[SYS_PTRACE]
  
  @js.native
  sealed trait SYS_RAWIO
    extends StObject
       with KernelCapability
  inline def SYS_RAWIO: SYS_RAWIO = "SYS_RAWIO".asInstanceOf[SYS_RAWIO]
  
  @js.native
  sealed trait SYS_RESOURCE
    extends StObject
       with KernelCapability
  inline def SYS_RESOURCE: SYS_RESOURCE = "SYS_RESOURCE".asInstanceOf[SYS_RESOURCE]
  
  @js.native
  sealed trait SYS_TIME
    extends StObject
       with KernelCapability
  inline def SYS_TIME: SYS_TIME = "SYS_TIME".asInstanceOf[SYS_TIME]
  
  @js.native
  sealed trait SYS_TTY_CONFIG
    extends StObject
       with KernelCapability
  inline def SYS_TTY_CONFIG: SYS_TTY_CONFIG = "SYS_TTY_CONFIG".asInstanceOf[SYS_TTY_CONFIG]
  
  @js.native
  sealed trait SecureString
    extends StObject
       with ParameterType
  inline def SecureString: SecureString = "SecureString".asInstanceOf[SecureString]
  
  @js.native
  sealed trait String
    extends StObject
       with ParameterType
  inline def String: String = "String".asInstanceOf[String]
  
  @js.native
  sealed trait StringList
    extends StObject
       with ParameterType
  inline def StringList: StringList = "StringList".asInstanceOf[StringList]
  
  @js.native
  sealed trait TRIM_HORIZON extends StObject
  inline def TRIM_HORIZON: TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[TRIM_HORIZON]
  
  @js.native
  sealed trait TXT
    extends StObject
       with RecordType
  inline def TXT: TXT = "TXT".asInstanceOf[TXT]
  
  @js.native
  sealed trait WAKE_ALARM
    extends StObject
       with KernelCapability
  inline def WAKE_ALARM: WAKE_ALARM = "WAKE_ALARM".asInstanceOf[WAKE_ALARM]
  
  @js.native
  sealed trait Windows
    extends StObject
       with InstancePlatform
  inline def Windows: Windows = "Windows".asInstanceOf[Windows]
  
  @js.native
  sealed trait `Windows with SQL Server`
    extends StObject
       with InstancePlatform
  inline def `Windows with SQL Server`: `Windows with SQL Server` = ("Windows with SQL Server").asInstanceOf[`Windows with SQL Server`]
  
  @js.native
  sealed trait `Windows with SQL Server Enterprise`
    extends StObject
       with InstancePlatform
  inline def `Windows with SQL Server Enterprise`: `Windows with SQL Server Enterprise` = ("Windows with SQL Server Enterprise").asInstanceOf[`Windows with SQL Server Enterprise`]
  
  @js.native
  sealed trait `Windows with SQL Server Standard`
    extends StObject
       with InstancePlatform
  inline def `Windows with SQL Server Standard`: `Windows with SQL Server Standard` = ("Windows with SQL Server Standard").asInstanceOf[`Windows with SQL Server Standard`]
  
  @js.native
  sealed trait `Windows with SQL Server Web`
    extends StObject
       with InstancePlatform
  inline def `Windows with SQL Server Web`: `Windows with SQL Server Web` = ("Windows with SQL Server Web").asInstanceOf[`Windows with SQL Server Web`]
  
  @js.native
  sealed trait a1Dot2xlarge
    extends StObject
       with InstanceType
  inline def a1Dot2xlarge: a1Dot2xlarge = "a1.2xlarge".asInstanceOf[a1Dot2xlarge]
  
  @js.native
  sealed trait a1Dot4xlarge
    extends StObject
       with InstanceType
  inline def a1Dot4xlarge: a1Dot4xlarge = "a1.4xlarge".asInstanceOf[a1Dot4xlarge]
  
  @js.native
  sealed trait a1Dotlarge
    extends StObject
       with InstanceType
  inline def a1Dotlarge: a1Dotlarge = "a1.large".asInstanceOf[a1Dotlarge]
  
  @js.native
  sealed trait a1Dotmedium
    extends StObject
       with InstanceType
  inline def a1Dotmedium: a1Dotmedium = "a1.medium".asInstanceOf[a1Dotmedium]
  
  @js.native
  sealed trait a1Dotxlarge
    extends StObject
       with InstanceType
  inline def a1Dotxlarge: a1Dotxlarge = "a1.xlarge".asInstanceOf[a1Dotxlarge]
  
  @js.native
  sealed trait `af-south-1`
    extends StObject
       with Region
  inline def `af-south-1`: `af-south-1` = "af-south-1".asInstanceOf[`af-south-1`]
  
  @js.native
  sealed trait all_
    extends StObject
       with ProtocolType
  inline def all_ : all_ = "all".asInstanceOf[all_]
  
  @js.native
  sealed trait any extends StObject
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait `ap-east-1`
    extends StObject
       with Region
  inline def `ap-east-1`: `ap-east-1` = "ap-east-1".asInstanceOf[`ap-east-1`]
  
  @js.native
  sealed trait `ap-northeast-1`
    extends StObject
       with Region
  inline def `ap-northeast-1`: `ap-northeast-1` = "ap-northeast-1".asInstanceOf[`ap-northeast-1`]
  
  @js.native
  sealed trait `ap-northeast-2`
    extends StObject
       with Region
  inline def `ap-northeast-2`: `ap-northeast-2` = "ap-northeast-2".asInstanceOf[`ap-northeast-2`]
  
  @js.native
  sealed trait `ap-south-1`
    extends StObject
       with Region
  inline def `ap-south-1`: `ap-south-1` = "ap-south-1".asInstanceOf[`ap-south-1`]
  
  @js.native
  sealed trait `ap-southeast-1`
    extends StObject
       with Region
  inline def `ap-southeast-1`: `ap-southeast-1` = "ap-southeast-1".asInstanceOf[`ap-southeast-1`]
  
  @js.native
  sealed trait `ap-southeast-2`
    extends StObject
       with Region
  inline def `ap-southeast-2`: `ap-southeast-2` = "ap-southeast-2".asInstanceOf[`ap-southeast-2`]
  
  @js.native
  sealed trait application
    extends StObject
       with LoadBalancerType
       with typings.pulumiAws.enumsAlbMod.LoadBalancerType
  inline def application: application = "application".asInstanceOf[application]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSAccountActivityAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSAccountActivityAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSAccountActivityAccess = "arn:aws:iam::aws:policy/AWSAccountActivityAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSAccountActivityAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSAccountUsageReportAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSAccountUsageReportAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSAccountUsageReportAccess = "arn:aws:iam::aws:policy/AWSAccountUsageReportAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSAccountUsageReportAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSAgentlessDiscoveryService
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSAgentlessDiscoveryService: arnColonawsColoniamColonColonawsColonpolicySlashAWSAgentlessDiscoveryService = "arn:aws:iam::aws:policy/AWSAgentlessDiscoveryService".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSAgentlessDiscoveryService]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSApplicationDiscoveryAgentAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSApplicationDiscoveryAgentAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSApplicationDiscoveryAgentAccess = "arn:aws:iam::aws:policy/AWSApplicationDiscoveryAgentAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSApplicationDiscoveryAgentAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSApplicationDiscoveryServiceFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSApplicationDiscoveryServiceFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSApplicationDiscoveryServiceFullAccess = "arn:aws:iam::aws:policy/AWSApplicationDiscoveryServiceFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSApplicationDiscoveryServiceFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSBatchFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSBatchFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSBatchFullAccess = "arn:aws:iam::aws:policy/AWSBatchFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSBatchFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCertificateManagerFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCertificateManagerFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCertificateManagerFullAccess = "arn:aws:iam::aws:policy/AWSCertificateManagerFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCertificateManagerFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCertificateManagerReadOnly
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCertificateManagerReadOnly: arnColonawsColoniamColonColonawsColonpolicySlashAWSCertificateManagerReadOnly = "arn:aws:iam::aws:policy/AWSCertificateManagerReadOnly".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCertificateManagerReadOnly]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudFormationReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudFormationReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudFormationReadOnlyAccess = "arn:aws:iam::aws:policy/AWSCloudFormationReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudFormationReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudHSMFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudHSMFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudHSMFullAccess = "arn:aws:iam::aws:policy/AWSCloudHSMFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudHSMFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudHSMReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudHSMReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudHSMReadOnlyAccess = "arn:aws:iam::aws:policy/AWSCloudHSMReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudHSMReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudTrailFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudTrailFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudTrailFullAccess = "arn:aws:iam::aws:policy/AWSCloudTrailFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudTrailFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudTrailReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudTrailReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudTrailReadOnlyAccess = "arn:aws:iam::aws:policy/AWSCloudTrailReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCloudTrailReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildAdminAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildAdminAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildAdminAccess = "arn:aws:iam::aws:policy/AWSCodeBuildAdminAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildAdminAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildDeveloperAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildDeveloperAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildDeveloperAccess = "arn:aws:iam::aws:policy/AWSCodeBuildDeveloperAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildDeveloperAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildReadOnlyAccess = "arn:aws:iam::aws:policy/AWSCodeBuildReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeBuildReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitFullAccess = "arn:aws:iam::aws:policy/AWSCodeCommitFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitPowerUser
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitPowerUser: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitPowerUser = "arn:aws:iam::aws:policy/AWSCodeCommitPowerUser".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitPowerUser]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitReadOnly
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitReadOnly: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitReadOnly = "arn:aws:iam::aws:policy/AWSCodeCommitReadOnly".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeCommitReadOnly]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployDeployerAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployDeployerAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployDeployerAccess = "arn:aws:iam::aws:policy/AWSCodeDeployDeployerAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployDeployerAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployFullAccess = "arn:aws:iam::aws:policy/AWSCodeDeployFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployReadOnlyAccess = "arn:aws:iam::aws:policy/AWSCodeDeployReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployRoleForECS
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployRoleForECS: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployRoleForECS = "arn:aws:iam::aws:policy/AWSCodeDeployRoleForECS".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeDeployRoleForECS]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineApproverAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineApproverAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineApproverAccess = "arn:aws:iam::aws:policy/AWSCodePipelineApproverAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineApproverAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineCustomActionAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineCustomActionAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineCustomActionAccess = "arn:aws:iam::aws:policy/AWSCodePipelineCustomActionAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineCustomActionAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineFullAccess = "arn:aws:iam::aws:policy/AWSCodePipelineFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineReadOnlyAccess = "arn:aws:iam::aws:policy/AWSCodePipelineReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodePipelineReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeStarFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeStarFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeStarFullAccess = "arn:aws:iam::aws:policy/AWSCodeStarFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSCodeStarFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSConfigUserAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSConfigUserAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSConfigUserAccess = "arn:aws:iam::aws:policy/AWSConfigUserAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSConfigUserAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSConnector
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSConnector: arnColonawsColoniamColonColonawsColonpolicySlashAWSConnector = "arn:aws:iam::aws:policy/AWSConnector".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSConnector]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSDataPipeline_FullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSDataPipeline_FullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSDataPipeline_FullAccess = "arn:aws:iam::aws:policy/AWSDataPipeline_FullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSDataPipeline_FullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSDataPipeline_PowerUser
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSDataPipeline_PowerUser: arnColonawsColoniamColonColonawsColonpolicySlashAWSDataPipeline_PowerUser = "arn:aws:iam::aws:policy/AWSDataPipeline_PowerUser".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSDataPipeline_PowerUser]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSDeviceFarmFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSDeviceFarmFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSDeviceFarmFullAccess = "arn:aws:iam::aws:policy/AWSDeviceFarmFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSDeviceFarmFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectConnectFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectConnectFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectConnectFullAccess = "arn:aws:iam::aws:policy/AWSDirectConnectFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectConnectFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectConnectReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectConnectReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectConnectReadOnlyAccess = "arn:aws:iam::aws:policy/AWSDirectConnectReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectConnectReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectoryServiceFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectoryServiceFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectoryServiceFullAccess = "arn:aws:iam::aws:policy/AWSDirectoryServiceFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectoryServiceFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectoryServiceReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectoryServiceReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectoryServiceReadOnlyAccess = "arn:aws:iam::aws:policy/AWSDirectoryServiceReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSDirectoryServiceReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkCustomPlatformforEC2Role
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkCustomPlatformforEC2Role: arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkCustomPlatformforEC2Role = "arn:aws:iam::aws:policy/AWSElasticBeanstalkCustomPlatformforEC2Role".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkCustomPlatformforEC2Role]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkFullAccess = "arn:aws:iam::aws:policy/AWSElasticBeanstalkFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkMulticontainerDocker
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkMulticontainerDocker: arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkMulticontainerDocker = "arn:aws:iam::aws:policy/AWSElasticBeanstalkMulticontainerDocker".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkMulticontainerDocker]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkReadOnlyAccess = "arn:aws:iam::aws:policy/AWSElasticBeanstalkReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkWebTier
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkWebTier: arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkWebTier = "arn:aws:iam::aws:policy/AWSElasticBeanstalkWebTier".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkWebTier]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkWorkerTier
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkWorkerTier: arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkWorkerTier = "arn:aws:iam::aws:policy/AWSElasticBeanstalkWorkerTier".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSElasticBeanstalkWorkerTier]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSGreengrassFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSGreengrassFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSGreengrassFullAccess = "arn:aws:iam::aws:policy/AWSGreengrassFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSGreengrassFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSHealthFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSHealthFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSHealthFullAccess = "arn:aws:iam::aws:policy/AWSHealthFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSHealthFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSImportExportFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSImportExportFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSImportExportFullAccess = "arn:aws:iam::aws:policy/AWSImportExportFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSImportExportFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSImportExportReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSImportExportReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSImportExportReadOnlyAccess = "arn:aws:iam::aws:policy/AWSImportExportReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSImportExportReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTConfigAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTConfigAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTConfigAccess = "arn:aws:iam::aws:policy/AWSIoTConfigAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTConfigAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTConfigReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTConfigReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTConfigReadOnlyAccess = "arn:aws:iam::aws:policy/AWSIoTConfigReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTConfigReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTDataAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTDataAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTDataAccess = "arn:aws:iam::aws:policy/AWSIoTDataAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTDataAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTFullAccess = "arn:aws:iam::aws:policy/AWSIoTFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSIoTFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSKeyManagementServicePowerUser
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSKeyManagementServicePowerUser: arnColonawsColoniamColonColonawsColonpolicySlashAWSKeyManagementServicePowerUser = "arn:aws:iam::aws:policy/AWSKeyManagementServicePowerUser".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSKeyManagementServicePowerUser]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaExecute
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaExecute: arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaExecute = "arn:aws:iam::aws:policy/AWSLambdaExecute".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaExecute]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaFullAccess = "arn:aws:iam::aws:policy/AWSLambdaFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaFullAccess]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaInvocation-DynamoDB`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaInvocation-DynamoDB`: `arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaInvocation-DynamoDB` = "arn:aws:iam::aws:policy/AWSLambdaInvocation-DynamoDB".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaInvocation-DynamoDB`]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaReadOnlyAccess = "arn:aws:iam::aws:policy/AWSLambdaReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSLambdaReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceFullAccess = "arn:aws:iam::aws:policy/AWSMarketplaceFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceGetEntitlements
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceGetEntitlements: arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceGetEntitlements = "arn:aws:iam::aws:policy/AWSMarketplaceGetEntitlements".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceGetEntitlements]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceManageSubscriptions
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceManageSubscriptions: arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceManageSubscriptions = "arn:aws:iam::aws:policy/AWSMarketplaceManageSubscriptions".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceManageSubscriptions]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceMeteringFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceMeteringFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceMeteringFullAccess = "arn:aws:iam::aws:policy/AWSMarketplaceMeteringFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceMeteringFullAccess]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceRead-only`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceRead-only`: `arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceRead-only` = "arn:aws:iam::aws:policy/AWSMarketplaceRead-only".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashAWSMarketplaceRead-only`]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSMobileHub_FullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSMobileHub_FullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSMobileHub_FullAccess = "arn:aws:iam::aws:policy/AWSMobileHub_FullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSMobileHub_FullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSMobileHub_ReadOnly
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSMobileHub_ReadOnly: arnColonawsColoniamColonColonawsColonpolicySlashAWSMobileHub_ReadOnly = "arn:aws:iam::aws:policy/AWSMobileHub_ReadOnly".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSMobileHub_ReadOnly]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksCMInstanceProfileRole
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksCMInstanceProfileRole: arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksCMInstanceProfileRole = "arn:aws:iam::aws:policy/AWSOpsWorksCMInstanceProfileRole".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksCMInstanceProfileRole]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksCloudWatchLogs
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksCloudWatchLogs: arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksCloudWatchLogs = "arn:aws:iam::aws:policy/AWSOpsWorksCloudWatchLogs".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksCloudWatchLogs]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksFullAccess = "arn:aws:iam::aws:policy/AWSOpsWorksFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksInstanceRegistration
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksInstanceRegistration: arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksInstanceRegistration = "arn:aws:iam::aws:policy/AWSOpsWorksInstanceRegistration".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksInstanceRegistration]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksRegisterCLI
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksRegisterCLI: arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksRegisterCLI = "arn:aws:iam::aws:policy/AWSOpsWorksRegisterCLI".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSOpsWorksRegisterCLI]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsConsoleFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsConsoleFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsConsoleFullAccess = "arn:aws:iam::aws:policy/AWSStepFunctionsConsoleFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsConsoleFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsFullAccess = "arn:aws:iam::aws:policy/AWSStepFunctionsFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsReadOnlyAccess = "arn:aws:iam::aws:policy/AWSStepFunctionsReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSStepFunctionsReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSStorageGatewayFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSStorageGatewayFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSStorageGatewayFullAccess = "arn:aws:iam::aws:policy/AWSStorageGatewayFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSStorageGatewayFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSStorageGatewayReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSStorageGatewayReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSStorageGatewayReadOnlyAccess = "arn:aws:iam::aws:policy/AWSStorageGatewayReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSStorageGatewayReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSSupportAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSSupportAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSSupportAccess = "arn:aws:iam::aws:policy/AWSSupportAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSSupportAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSWAFFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSWAFFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSWAFFullAccess = "arn:aws:iam::aws:policy/AWSWAFFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSWAFFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSWAFReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSWAFReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSWAFReadOnlyAccess = "arn:aws:iam::aws:policy/AWSWAFReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSWAFReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSXRayDaemonWriteAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSXRayDaemonWriteAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSXRayDaemonWriteAccess = "arn:aws:iam::aws:policy/AWSXRayDaemonWriteAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSXRayDaemonWriteAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayFullAccess = "arn:aws:iam::aws:policy/AWSXrayFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayReadOnlyAccess = "arn:aws:iam::aws:policy/AWSXrayReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayWriteOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayWriteOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayWriteOnlyAccess = "arn:aws:iam::aws:policy/AWSXrayWriteOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAWSXrayWriteOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAdministratorAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAdministratorAccess: arnColonawsColoniamColonColonawsColonpolicySlashAdministratorAccess = "arn:aws:iam::aws:policy/AdministratorAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAdministratorAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonAPIGatewayAdministrator
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonAPIGatewayAdministrator: arnColonawsColoniamColonColonawsColonpolicySlashAmazonAPIGatewayAdministrator = "arn:aws:iam::aws:policy/AmazonAPIGatewayAdministrator".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonAPIGatewayAdministrator]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonAPIGatewayInvokeFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonAPIGatewayInvokeFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonAPIGatewayInvokeFullAccess = "arn:aws:iam::aws:policy/AmazonAPIGatewayInvokeFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonAPIGatewayInvokeFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonAppStreamFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonAppStreamFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonAppStreamFullAccess = "arn:aws:iam::aws:policy/AmazonAppStreamFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonAppStreamFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonAppStreamReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonAppStreamReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonAppStreamReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonAppStreamReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonAppStreamReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonAthenaFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonAthenaFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonAthenaFullAccess = "arn:aws:iam::aws:policy/AmazonAthenaFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonAthenaFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonCloudDirectoryFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonCloudDirectoryFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonCloudDirectoryFullAccess = "arn:aws:iam::aws:policy/AmazonCloudDirectoryFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonCloudDirectoryFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonCloudDirectoryReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonCloudDirectoryReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonCloudDirectoryReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonCloudDirectoryReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonCloudDirectoryReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoDeveloperAuthenticatedIdentities
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoDeveloperAuthenticatedIdentities: arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoDeveloperAuthenticatedIdentities = "arn:aws:iam::aws:policy/AmazonCognitoDeveloperAuthenticatedIdentities".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoDeveloperAuthenticatedIdentities]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoPowerUser
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoPowerUser: arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoPowerUser = "arn:aws:iam::aws:policy/AmazonCognitoPowerUser".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoPowerUser]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoReadOnly
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoReadOnly: arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoReadOnly = "arn:aws:iam::aws:policy/AmazonCognitoReadOnly".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonCognitoReadOnly]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonDRSVPCManagement
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonDRSVPCManagement: arnColonawsColoniamColonColonawsColonpolicySlashAmazonDRSVPCManagement = "arn:aws:iam::aws:policy/AmazonDRSVPCManagement".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonDRSVPCManagement]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBFullAccess = "arn:aws:iam::aws:policy/AmazonDynamoDBFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBFullAccesswithDataPipeline
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBFullAccesswithDataPipeline: arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBFullAccesswithDataPipeline = "arn:aws:iam::aws:policy/AmazonDynamoDBFullAccesswithDataPipeline".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBFullAccesswithDataPipeline]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonDynamoDBReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonDynamoDBReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryFullAccess = "arn:aws:iam::aws:policy/AmazonEC2ContainerRegistryFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryPowerUser
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryPowerUser: arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryPowerUser = "arn:aws:iam::aws:policy/AmazonEC2ContainerRegistryPowerUser".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryPowerUser]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryReadOnly
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryReadOnly: arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryReadOnly = "arn:aws:iam::aws:policy/AmazonEC2ContainerRegistryReadOnly".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerRegistryReadOnly]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerServiceFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerServiceFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerServiceFullAccess = "arn:aws:iam::aws:policy/AmazonEC2ContainerServiceFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ContainerServiceFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2FullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2FullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2FullAccess = "arn:aws:iam::aws:policy/AmazonEC2FullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2FullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonEC2ReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ReportsAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ReportsAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ReportsAccess = "arn:aws:iam::aws:policy/AmazonEC2ReportsAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonEC2ReportsAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonESFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonESFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonESFullAccess = "arn:aws:iam::aws:policy/AmazonESFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonESFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonESReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonESReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonESReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonESReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonESReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonElastiCacheFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonElastiCacheFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonElastiCacheFullAccess = "arn:aws:iam::aws:policy/AmazonElastiCacheFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonElastiCacheFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonElastiCacheReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonElastiCacheReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonElastiCacheReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonElastiCacheReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonElastiCacheReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticFileSystemFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticFileSystemFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticFileSystemFullAccess = "arn:aws:iam::aws:policy/AmazonElasticFileSystemFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticFileSystemFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticFileSystemReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticFileSystemReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticFileSystemReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonElasticFileSystemReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticFileSystemReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticMapReduceFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticMapReduceFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticMapReduceFullAccess = "arn:aws:iam::aws:policy/AmazonElasticMapReduceFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticMapReduceFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticMapReduceReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticMapReduceReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticMapReduceReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonElasticMapReduceReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticMapReduceReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderFullAccess = "arn:aws:iam::aws:policy/AmazonElasticTranscoderFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderJobsSubmitter
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderJobsSubmitter: arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderJobsSubmitter = "arn:aws:iam::aws:policy/AmazonElasticTranscoderJobsSubmitter".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderJobsSubmitter]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonElasticTranscoderReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonElasticTranscoderReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonGlacierFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonGlacierFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonGlacierFullAccess = "arn:aws:iam::aws:policy/AmazonGlacierFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonGlacierFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonGlacierReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonGlacierReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonGlacierReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonGlacierReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonGlacierReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonInspectorFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonInspectorFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonInspectorFullAccess = "arn:aws:iam::aws:policy/AmazonInspectorFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonInspectorFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonInspectorReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonInspectorReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonInspectorReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonInspectorReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonInspectorReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisAnalyticsFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisAnalyticsFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisAnalyticsFullAccess = "arn:aws:iam::aws:policy/AmazonKinesisAnalyticsFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisAnalyticsFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisAnalyticsReadOnly
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisAnalyticsReadOnly: arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisAnalyticsReadOnly = "arn:aws:iam::aws:policy/AmazonKinesisAnalyticsReadOnly".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisAnalyticsReadOnly]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFirehoseFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFirehoseFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFirehoseFullAccess = "arn:aws:iam::aws:policy/AmazonKinesisFirehoseFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFirehoseFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFirehoseReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFirehoseReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFirehoseReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonKinesisFirehoseReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFirehoseReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFullAccess = "arn:aws:iam::aws:policy/AmazonKinesisFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonKinesisReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonKinesisReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexFullAccess = "arn:aws:iam::aws:policy/AmazonLexFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexReadOnly
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexReadOnly: arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexReadOnly = "arn:aws:iam::aws:policy/AmazonLexReadOnly".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexReadOnly]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexRunBotsOnly
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexRunBotsOnly: arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexRunBotsOnly = "arn:aws:iam::aws:policy/AmazonLexRunBotsOnly".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonLexRunBotsOnly]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningBatchPredictionsAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningBatchPredictionsAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningBatchPredictionsAccess = "arn:aws:iam::aws:policy/AmazonMachineLearningBatchPredictionsAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningBatchPredictionsAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningCreateOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningCreateOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningCreateOnlyAccess = "arn:aws:iam::aws:policy/AmazonMachineLearningCreateOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningCreateOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningFullAccess = "arn:aws:iam::aws:policy/AmazonMachineLearningFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningManageRealTimeEndpointOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningManageRealTimeEndpointOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningManageRealTimeEndpointOnlyAccess = "arn:aws:iam::aws:policy/AmazonMachineLearningManageRealTimeEndpointOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningManageRealTimeEndpointOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonMachineLearningReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningRealTimePredictionOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningRealTimePredictionOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningRealTimePredictionOnlyAccess = "arn:aws:iam::aws:policy/AmazonMachineLearningRealTimePredictionOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonMachineLearningRealTimePredictionOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonMechanicalTurkFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonMechanicalTurkFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonMechanicalTurkFullAccess = "arn:aws:iam::aws:policy/AmazonMechanicalTurkFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonMechanicalTurkFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonMechanicalTurkReadOnly
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonMechanicalTurkReadOnly: arnColonawsColoniamColonColonawsColonpolicySlashAmazonMechanicalTurkReadOnly = "arn:aws:iam::aws:policy/AmazonMechanicalTurkReadOnly".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonMechanicalTurkReadOnly]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsFinancialReportAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsFinancialReportAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsFinancialReportAccess = "arn:aws:iam::aws:policy/AmazonMobileAnalyticsFinancialReportAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsFinancialReportAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsFullAccess = "arn:aws:iam::aws:policy/AmazonMobileAnalyticsFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsFullAccess]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsNon-financialReportAccess`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsNon-financialReportAccess`: `arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsNon-financialReportAccess` = "arn:aws:iam::aws:policy/AmazonMobileAnalyticsNon-financialReportAccess".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsNon-financialReportAccess`]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsWriteOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsWriteOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsWriteOnlyAccess = "arn:aws:iam::aws:policy/AmazonMobileAnalyticsWriteOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonMobileAnalyticsWriteOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonPollyFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonPollyFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonPollyFullAccess = "arn:aws:iam::aws:policy/AmazonPollyFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonPollyFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonPollyReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonPollyReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonPollyReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonPollyReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonPollyReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSDataFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSDataFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSDataFullAccess = "arn:aws:iam::aws:policy/AmazonRDSDataFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSDataFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSFullAccess = "arn:aws:iam::aws:policy/AmazonRDSFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonRDSReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonRDSReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonRedshiftFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonRedshiftFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonRedshiftFullAccess = "arn:aws:iam::aws:policy/AmazonRedshiftFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonRedshiftFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonRedshiftReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonRedshiftReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonRedshiftReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonRedshiftReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonRedshiftReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonRekognitionFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonRekognitionFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonRekognitionFullAccess = "arn:aws:iam::aws:policy/AmazonRekognitionFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonRekognitionFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonRekognitionReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonRekognitionReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonRekognitionReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonRekognitionReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonRekognitionReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53DomainsFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53DomainsFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53DomainsFullAccess = "arn:aws:iam::aws:policy/AmazonRoute53DomainsFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53DomainsFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53DomainsReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53DomainsReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53DomainsReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonRoute53DomainsReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53DomainsReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53FullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53FullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53FullAccess = "arn:aws:iam::aws:policy/AmazonRoute53FullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53FullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53ReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53ReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53ReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonRoute53ReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonRoute53ReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonS3FullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonS3FullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonS3FullAccess = "arn:aws:iam::aws:policy/AmazonS3FullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonS3FullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonS3ReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonS3ReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonS3ReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonS3ReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonS3ReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSESFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSESFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSESFullAccess = "arn:aws:iam::aws:policy/AmazonSESFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSESFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSESReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSESReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSESReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonSESReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSESReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSNSFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSNSFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSNSFullAccess = "arn:aws:iam::aws:policy/AmazonSNSFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSNSFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSNSReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSNSReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSNSReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonSNSReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSNSReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSQSFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSQSFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSQSFullAccess = "arn:aws:iam::aws:policy/AmazonSQSFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSQSFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSQSReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSQSReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSQSReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonSQSReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSQSReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMAutomationApproverAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMAutomationApproverAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMAutomationApproverAccess = "arn:aws:iam::aws:policy/AmazonSSMAutomationApproverAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMAutomationApproverAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMDirectoryServiceAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMDirectoryServiceAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMDirectoryServiceAccess = "arn:aws:iam::aws:policy/AmazonSSMDirectoryServiceAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMDirectoryServiceAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMFullAccess = "arn:aws:iam::aws:policy/AmazonSSMFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMManagedInstanceCore
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMManagedInstanceCore: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMManagedInstanceCore = "arn:aws:iam::aws:policy/AmazonSSMManagedInstanceCore".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMManagedInstanceCore]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMPatchAssociation
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMPatchAssociation: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMPatchAssociation = "arn:aws:iam::aws:policy/AmazonSSMPatchAssociation".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMPatchAssociation]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonSSMReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonSSMReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonVPCFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonVPCFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonVPCFullAccess = "arn:aws:iam::aws:policy/AmazonVPCFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonVPCFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonVPCReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonVPCReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonVPCReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonVPCReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonVPCReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkMailFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkMailFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkMailFullAccess = "arn:aws:iam::aws:policy/AmazonWorkMailFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkMailFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkMailReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkMailReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkMailReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonWorkMailReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkMailReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkSpacesAdmin
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkSpacesAdmin: arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkSpacesAdmin = "arn:aws:iam::aws:policy/AmazonWorkSpacesAdmin".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkSpacesAdmin]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkSpacesApplicationManagerAdminAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkSpacesApplicationManagerAdminAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkSpacesApplicationManagerAdminAccess = "arn:aws:iam::aws:policy/AmazonWorkSpacesApplicationManagerAdminAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonWorkSpacesApplicationManagerAdminAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonZocaloFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonZocaloFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonZocaloFullAccess = "arn:aws:iam::aws:policy/AmazonZocaloFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonZocaloFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAmazonZocaloReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAmazonZocaloReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAmazonZocaloReadOnlyAccess = "arn:aws:iam::aws:policy/AmazonZocaloReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAmazonZocaloReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingConsoleFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingConsoleFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingConsoleFullAccess = "arn:aws:iam::aws:policy/AutoScalingConsoleFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingConsoleFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingConsoleReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingConsoleReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingConsoleReadOnlyAccess = "arn:aws:iam::aws:policy/AutoScalingConsoleReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingConsoleReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingFullAccess = "arn:aws:iam::aws:policy/AutoScalingFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingReadOnlyAccess = "arn:aws:iam::aws:policy/AutoScalingReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashAutoScalingReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashCloudFrontFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashCloudFrontFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashCloudFrontFullAccess = "arn:aws:iam::aws:policy/CloudFrontFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashCloudFrontFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashCloudFrontReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashCloudFrontReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashCloudFrontReadOnlyAccess = "arn:aws:iam::aws:policy/CloudFrontReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashCloudFrontReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashCloudSearchFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashCloudSearchFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashCloudSearchFullAccess = "arn:aws:iam::aws:policy/CloudSearchFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashCloudSearchFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashCloudSearchReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashCloudSearchReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashCloudSearchReadOnlyAccess = "arn:aws:iam::aws:policy/CloudSearchReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashCloudSearchReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchActionsEC2Access
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchActionsEC2Access: arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchActionsEC2Access = "arn:aws:iam::aws:policy/CloudWatchActionsEC2Access".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchActionsEC2Access]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchEventsFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchEventsFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchEventsFullAccess = "arn:aws:iam::aws:policy/CloudWatchEventsFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchEventsFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchEventsReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchEventsReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchEventsReadOnlyAccess = "arn:aws:iam::aws:policy/CloudWatchEventsReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchEventsReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchFullAccess = "arn:aws:iam::aws:policy/CloudWatchFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchLogsFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchLogsFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchLogsFullAccess = "arn:aws:iam::aws:policy/CloudWatchLogsFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchLogsFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchLogsReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchLogsReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchLogsReadOnlyAccess = "arn:aws:iam::aws:policy/CloudWatchLogsReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchLogsReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchReadOnlyAccess = "arn:aws:iam::aws:policy/CloudWatchReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashCloudWatchReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashIAMFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashIAMFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashIAMFullAccess = "arn:aws:iam::aws:policy/IAMFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashIAMFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashIAMReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashIAMReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashIAMReadOnlyAccess = "arn:aws:iam::aws:policy/IAMReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashIAMReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashIAMSelfManageServiceSpecificCredentials
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashIAMSelfManageServiceSpecificCredentials: arnColonawsColoniamColonColonawsColonpolicySlashIAMSelfManageServiceSpecificCredentials = "arn:aws:iam::aws:policy/IAMSelfManageServiceSpecificCredentials".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashIAMSelfManageServiceSpecificCredentials]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashIAMUserChangePassword
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashIAMUserChangePassword: arnColonawsColoniamColonColonawsColonpolicySlashIAMUserChangePassword = "arn:aws:iam::aws:policy/IAMUserChangePassword".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashIAMUserChangePassword]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashIAMUserSSHKeys
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashIAMUserSSHKeys: arnColonawsColoniamColonColonawsColonpolicySlashIAMUserSSHKeys = "arn:aws:iam::aws:policy/IAMUserSSHKeys".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashIAMUserSSHKeys]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashPowerUserAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashPowerUserAccess: arnColonawsColoniamColonColonawsColonpolicySlashPowerUserAccess = "arn:aws:iam::aws:policy/PowerUserAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashPowerUserAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashReadOnlyAccess = "arn:aws:iam::aws:policy/ReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashResourceGroupsandTagEditorFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashResourceGroupsandTagEditorFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashResourceGroupsandTagEditorFullAccess = "arn:aws:iam::aws:policy/ResourceGroupsandTagEditorFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashResourceGroupsandTagEditorFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashResourceGroupsandTagEditorReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashResourceGroupsandTagEditorReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashResourceGroupsandTagEditorReadOnlyAccess = "arn:aws:iam::aws:policy/ResourceGroupsandTagEditorReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashResourceGroupsandTagEditorReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashSecurityAudit
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashSecurityAudit: arnColonawsColoniamColonColonawsColonpolicySlashSecurityAudit = "arn:aws:iam::aws:policy/SecurityAudit".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashSecurityAudit]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashServerMigrationConnector
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashServerMigrationConnector: arnColonawsColoniamColonColonawsColonpolicySlashServerMigrationConnector = "arn:aws:iam::aws:policy/ServerMigrationConnector".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashServerMigrationConnector]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogAdminFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogAdminFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogAdminFullAccess = "arn:aws:iam::aws:policy/ServiceCatalogAdminFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogAdminFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogAdminReadOnlyAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogAdminReadOnlyAccess: arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogAdminReadOnlyAccess = "arn:aws:iam::aws:policy/ServiceCatalogAdminReadOnlyAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogAdminReadOnlyAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogEndUserAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogEndUserAccess: arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogEndUserAccess = "arn:aws:iam::aws:policy/ServiceCatalogEndUserAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogEndUserAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogEndUserFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogEndUserFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogEndUserFullAccess = "arn:aws:iam::aws:policy/ServiceCatalogEndUserFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashServiceCatalogEndUserFullAccess]
  
  @js.native
  sealed trait arnColonawsColoniamColonColonawsColonpolicySlashSimpleWorkflowFullAccess
    extends StObject
       with ManagedPolicy
  inline def arnColonawsColoniamColonColonawsColonpolicySlashSimpleWorkflowFullAccess: arnColonawsColoniamColonColonawsColonpolicySlashSimpleWorkflowFullAccess = "arn:aws:iam::aws:policy/SimpleWorkflowFullAccess".asInstanceOf[arnColonawsColoniamColonColonawsColonpolicySlashSimpleWorkflowFullAccess]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashBilling`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashBilling`: `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashBilling` = "arn:aws:iam::aws:policy/job-function/Billing".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashBilling`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashDataScientist`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashDataScientist`: `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashDataScientist` = "arn:aws:iam::aws:policy/job-function/DataScientist".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashDataScientist`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashDatabaseAdministrator`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashDatabaseAdministrator`: `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashDatabaseAdministrator` = "arn:aws:iam::aws:policy/job-function/DatabaseAdministrator".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashDatabaseAdministrator`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashNetworkAdministrator`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashNetworkAdministrator`: `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashNetworkAdministrator` = "arn:aws:iam::aws:policy/job-function/NetworkAdministrator".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashNetworkAdministrator`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashSupportUser`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashSupportUser`: `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashSupportUser` = "arn:aws:iam::aws:policy/job-function/SupportUser".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashSupportUser`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashSystemAdministrator`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashSystemAdministrator`: `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashSystemAdministrator` = "arn:aws:iam::aws:policy/job-function/SystemAdministrator".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashSystemAdministrator`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashViewOnlyAccess`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashViewOnlyAccess`: `arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashViewOnlyAccess` = "arn:aws:iam::aws:policy/job-function/ViewOnlyAccess".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashjob-functionSlashViewOnlyAccess`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSBatchServiceRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSBatchServiceRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSBatchServiceRole` = "arn:aws:iam::aws:policy/service-role/AWSBatchServiceRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSBatchServiceRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCloudHSMRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCloudHSMRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCloudHSMRole` = "arn:aws:iam::aws:policy/service-role/AWSCloudHSMRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCloudHSMRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCodeDeployRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCodeDeployRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCodeDeployRole` = "arn:aws:iam::aws:policy/service-role/AWSCodeDeployRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCodeDeployRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCodeStarServiceRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCodeStarServiceRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCodeStarServiceRole` = "arn:aws:iam::aws:policy/service-role/AWSCodeStarServiceRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSCodeStarServiceRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSConfigRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSConfigRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSConfigRole` = "arn:aws:iam::aws:policy/service-role/AWSConfigRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSConfigRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSConfigRulesExecutionRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSConfigRulesExecutionRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSConfigRulesExecutionRole` = "arn:aws:iam::aws:policy/service-role/AWSConfigRulesExecutionRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSConfigRulesExecutionRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSDataPipelineRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSDataPipelineRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSDataPipelineRole` = "arn:aws:iam::aws:policy/service-role/AWSDataPipelineRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSDataPipelineRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSElasticBeanstalkEnhancedHealth`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSElasticBeanstalkEnhancedHealth`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSElasticBeanstalkEnhancedHealth` = "arn:aws:iam::aws:policy/service-role/AWSElasticBeanstalkEnhancedHealth".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSElasticBeanstalkEnhancedHealth`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSElasticBeanstalkService`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSElasticBeanstalkService`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSElasticBeanstalkService` = "arn:aws:iam::aws:policy/service-role/AWSElasticBeanstalkService".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSElasticBeanstalkService`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSGreengrassResourceAccessRolePolicy`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSGreengrassResourceAccessRolePolicy`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSGreengrassResourceAccessRolePolicy` = "arn:aws:iam::aws:policy/service-role/AWSGreengrassResourceAccessRolePolicy".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSGreengrassResourceAccessRolePolicy`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSIoTLogging`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSIoTLogging`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSIoTLogging` = "arn:aws:iam::aws:policy/service-role/AWSIoTLogging".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSIoTLogging`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSIoTRuleActions`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSIoTRuleActions`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSIoTRuleActions` = "arn:aws:iam::aws:policy/service-role/AWSIoTRuleActions".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSIoTRuleActions`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaBasicExecutionRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaBasicExecutionRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaBasicExecutionRole` = "arn:aws:iam::aws:policy/service-role/AWSLambdaBasicExecutionRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaBasicExecutionRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaDynamoDBExecutionRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaDynamoDBExecutionRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaDynamoDBExecutionRole` = "arn:aws:iam::aws:policy/service-role/AWSLambdaDynamoDBExecutionRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaDynamoDBExecutionRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaENIManagementAccess`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaENIManagementAccess`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaENIManagementAccess` = "arn:aws:iam::aws:policy/service-role/AWSLambdaENIManagementAccess".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaENIManagementAccess`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaKinesisExecutionRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaKinesisExecutionRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaKinesisExecutionRole` = "arn:aws:iam::aws:policy/service-role/AWSLambdaKinesisExecutionRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaKinesisExecutionRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaRole` = "arn:aws:iam::aws:policy/service-role/AWSLambdaRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaSQSQueueExecutionRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaSQSQueueExecutionRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaSQSQueueExecutionRole` = "arn:aws:iam::aws:policy/service-role/AWSLambdaSQSQueueExecutionRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaSQSQueueExecutionRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaVPCAccessExecutionRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaVPCAccessExecutionRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaVPCAccessExecutionRole` = "arn:aws:iam::aws:policy/service-role/AWSLambdaVPCAccessExecutionRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSLambdaVPCAccessExecutionRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSMobileHub_ServiceUseOnly`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSMobileHub_ServiceUseOnly`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSMobileHub_ServiceUseOnly` = "arn:aws:iam::aws:policy/service-role/AWSMobileHub_ServiceUseOnly".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSMobileHub_ServiceUseOnly`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSOpsWorksCMServiceRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSOpsWorksCMServiceRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSOpsWorksCMServiceRole` = "arn:aws:iam::aws:policy/service-role/AWSOpsWorksCMServiceRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSOpsWorksCMServiceRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSOpsWorksRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSOpsWorksRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSOpsWorksRole` = "arn:aws:iam::aws:policy/service-role/AWSOpsWorksRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSOpsWorksRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightDescribeRDS`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightDescribeRDS`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightDescribeRDS` = "arn:aws:iam::aws:policy/service-role/AWSQuickSightDescribeRDS".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightDescribeRDS`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightDescribeRedshift`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightDescribeRedshift`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightDescribeRedshift` = "arn:aws:iam::aws:policy/service-role/AWSQuickSightDescribeRedshift".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightDescribeRedshift`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightListIAM`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightListIAM`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightListIAM` = "arn:aws:iam::aws:policy/service-role/AWSQuickSightListIAM".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuickSightListIAM`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuicksightAthenaAccess`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuicksightAthenaAccess`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuicksightAthenaAccess` = "arn:aws:iam::aws:policy/service-role/AWSQuicksightAthenaAccess".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAWSQuicksightAthenaAccess`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonAPIGatewayPushToCloudWatchLogs`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonAPIGatewayPushToCloudWatchLogs`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonAPIGatewayPushToCloudWatchLogs` = "arn:aws:iam::aws:policy/service-role/AmazonAPIGatewayPushToCloudWatchLogs".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonAPIGatewayPushToCloudWatchLogs`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonAppStreamServiceAccess`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonAppStreamServiceAccess`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonAppStreamServiceAccess` = "arn:aws:iam::aws:policy/service-role/AmazonAppStreamServiceAccess".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonAppStreamServiceAccess`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSCloudWatchLogsRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSCloudWatchLogsRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSCloudWatchLogsRole` = "arn:aws:iam::aws:policy/service-role/AmazonDMSCloudWatchLogsRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSCloudWatchLogsRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSRedshiftS3Role`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSRedshiftS3Role`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSRedshiftS3Role` = "arn:aws:iam::aws:policy/service-role/AmazonDMSRedshiftS3Role".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSRedshiftS3Role`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSVPCManagementRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSVPCManagementRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSVPCManagementRole` = "arn:aws:iam::aws:policy/service-role/AmazonDMSVPCManagementRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonDMSVPCManagementRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceAutoscaleRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceAutoscaleRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceAutoscaleRole` = "arn:aws:iam::aws:policy/service-role/AmazonEC2ContainerServiceAutoscaleRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceAutoscaleRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceRole` = "arn:aws:iam::aws:policy/service-role/AmazonEC2ContainerServiceRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceforEC2Role`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceforEC2Role`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceforEC2Role` = "arn:aws:iam::aws:policy/service-role/AmazonEC2ContainerServiceforEC2Role".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2ContainerServiceforEC2Role`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforAWSCodeDeploy`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforAWSCodeDeploy`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforAWSCodeDeploy` = "arn:aws:iam::aws:policy/service-role/AmazonEC2RoleforAWSCodeDeploy".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforAWSCodeDeploy`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforDataPipelineRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforDataPipelineRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforDataPipelineRole` = "arn:aws:iam::aws:policy/service-role/AmazonEC2RoleforDataPipelineRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforDataPipelineRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforSSM`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforSSM`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforSSM` = "arn:aws:iam::aws:policy/service-role/AmazonEC2RoleforSSM".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2RoleforSSM`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetAutoscaleRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetAutoscaleRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetAutoscaleRole` = "arn:aws:iam::aws:policy/service-role/AmazonEC2SpotFleetAutoscaleRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetAutoscaleRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetRole` = "arn:aws:iam::aws:policy/service-role/AmazonEC2SpotFleetRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetTaggingRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetTaggingRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetTaggingRole` = "arn:aws:iam::aws:policy/service-role/AmazonEC2SpotFleetTaggingRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonEC2SpotFleetTaggingRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceRole` = "arn:aws:iam::aws:policy/service-role/AmazonElasticMapReduceRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceforAutoScalingRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceforAutoScalingRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceforAutoScalingRole` = "arn:aws:iam::aws:policy/service-role/AmazonElasticMapReduceforAutoScalingRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceforAutoScalingRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceforEC2Role`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceforEC2Role`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceforEC2Role` = "arn:aws:iam::aws:policy/service-role/AmazonElasticMapReduceforEC2Role".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticMapReduceforEC2Role`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticTranscoderRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticTranscoderRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticTranscoderRole` = "arn:aws:iam::aws:policy/service-role/AmazonElasticTranscoderRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonElasticTranscoderRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonMachineLearningRoleforRedshiftDataSource`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonMachineLearningRoleforRedshiftDataSource`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonMachineLearningRoleforRedshiftDataSource` = "arn:aws:iam::aws:policy/service-role/AmazonMachineLearningRoleforRedshiftDataSource".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonMachineLearningRoleforRedshiftDataSource`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonRDSDirectoryServiceAccess`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonRDSDirectoryServiceAccess`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonRDSDirectoryServiceAccess` = "arn:aws:iam::aws:policy/service-role/AmazonRDSDirectoryServiceAccess".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonRDSDirectoryServiceAccess`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonRDSEnhancedMonitoringRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonRDSEnhancedMonitoringRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonRDSEnhancedMonitoringRole` = "arn:aws:iam::aws:policy/service-role/AmazonRDSEnhancedMonitoringRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonRDSEnhancedMonitoringRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSNSRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSNSRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSNSRole` = "arn:aws:iam::aws:policy/service-role/AmazonSNSRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSNSRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSSMAutomationRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSSMAutomationRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSSMAutomationRole` = "arn:aws:iam::aws:policy/service-role/AmazonSSMAutomationRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSSMAutomationRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSSMMaintenanceWindowRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSSMMaintenanceWindowRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSSMMaintenanceWindowRole` = "arn:aws:iam::aws:policy/service-role/AmazonSSMMaintenanceWindowRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAmazonSSMMaintenanceWindowRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashApplicationAutoScalingForAmazonAppStreamAccess`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashApplicationAutoScalingForAmazonAppStreamAccess`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashApplicationAutoScalingForAmazonAppStreamAccess` = "arn:aws:iam::aws:policy/service-role/ApplicationAutoScalingForAmazonAppStreamAccess".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashApplicationAutoScalingForAmazonAppStreamAccess`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAutoScalingNotificationAccessRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAutoScalingNotificationAccessRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAutoScalingNotificationAccessRole` = "arn:aws:iam::aws:policy/service-role/AutoScalingNotificationAccessRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashAutoScalingNotificationAccessRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashCloudWatchEventsBuiltInTargetExecutionAccess`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashCloudWatchEventsBuiltInTargetExecutionAccess`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashCloudWatchEventsBuiltInTargetExecutionAccess` = "arn:aws:iam::aws:policy/service-role/CloudWatchEventsBuiltInTargetExecutionAccess".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashCloudWatchEventsBuiltInTargetExecutionAccess`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashCloudWatchEventsInvocationAccess`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashCloudWatchEventsInvocationAccess`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashCloudWatchEventsInvocationAccess` = "arn:aws:iam::aws:policy/service-role/CloudWatchEventsInvocationAccess".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashCloudWatchEventsInvocationAccess`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashRDSCloudHsmAuthorizationRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashRDSCloudHsmAuthorizationRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashRDSCloudHsmAuthorizationRole` = "arn:aws:iam::aws:policy/service-role/RDSCloudHsmAuthorizationRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashRDSCloudHsmAuthorizationRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashServerMigrationServiceRole`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashServerMigrationServiceRole`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashServerMigrationServiceRole` = "arn:aws:iam::aws:policy/service-role/ServerMigrationServiceRole".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashServerMigrationServiceRole`]
  
  @js.native
  sealed trait `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashVMImportExportRoleForAWSConnector`
    extends StObject
       with ManagedPolicy
  inline def `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashVMImportExportRoleForAWSConnector`: `arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashVMImportExportRoleForAWSConnector` = "arn:aws:iam::aws:policy/service-role/VMImportExportRoleForAWSConnector".asInstanceOf[`arnColonawsColoniamColonColonawsColonpolicySlashservice-roleSlashVMImportExportRoleForAWSConnector`]
  
  @js.native
  sealed trait aurora
    extends StObject
       with EngineType
  inline def aurora: aurora = "aurora".asInstanceOf[aurora]
  
  @js.native
  sealed trait `aurora-mysql`
    extends StObject
       with EngineType
  inline def `aurora-mysql`: `aurora-mysql` = "aurora-mysql".asInstanceOf[`aurora-mysql`]
  
  @js.native
  sealed trait `aurora-postgresql`
    extends StObject
       with EngineType
  inline def `aurora-postgresql`: `aurora-postgresql` = "aurora-postgresql".asInstanceOf[`aurora-postgresql`]
  
  @js.native
  sealed trait `authenticated-read`
    extends StObject
       with CannedAcl
  inline def `authenticated-read`: `authenticated-read` = "authenticated-read".asInstanceOf[`authenticated-read`]
  
  @js.native
  sealed trait autoscalingColonEC2_INSTANCE_LAUNCH
    extends StObject
       with NotificationType
  inline def autoscalingColonEC2_INSTANCE_LAUNCH: autoscalingColonEC2_INSTANCE_LAUNCH = "autoscaling:EC2_INSTANCE_LAUNCH".asInstanceOf[autoscalingColonEC2_INSTANCE_LAUNCH]
  
  @js.native
  sealed trait autoscalingColonEC2_INSTANCE_LAUNCH_ERROR
    extends StObject
       with NotificationType
  inline def autoscalingColonEC2_INSTANCE_LAUNCH_ERROR: autoscalingColonEC2_INSTANCE_LAUNCH_ERROR = "autoscaling:EC2_INSTANCE_LAUNCH_ERROR".asInstanceOf[autoscalingColonEC2_INSTANCE_LAUNCH_ERROR]
  
  @js.native
  sealed trait autoscalingColonEC2_INSTANCE_TERMINATE
    extends StObject
       with NotificationType
  inline def autoscalingColonEC2_INSTANCE_TERMINATE: autoscalingColonEC2_INSTANCE_TERMINATE = "autoscaling:EC2_INSTANCE_TERMINATE".asInstanceOf[autoscalingColonEC2_INSTANCE_TERMINATE]
  
  @js.native
  sealed trait autoscalingColonEC2_INSTANCE_TERMINATE_ERROR
    extends StObject
       with NotificationType
  inline def autoscalingColonEC2_INSTANCE_TERMINATE_ERROR: autoscalingColonEC2_INSTANCE_TERMINATE_ERROR = "autoscaling:EC2_INSTANCE_TERMINATE_ERROR".asInstanceOf[autoscalingColonEC2_INSTANCE_TERMINATE_ERROR]
  
  @js.native
  sealed trait autoscalingColonTEST_NOTIFICATION
    extends StObject
       with NotificationType
  inline def autoscalingColonTEST_NOTIFICATION: autoscalingColonTEST_NOTIFICATION = "autoscaling:TEST_NOTIFICATION".asInstanceOf[autoscalingColonTEST_NOTIFICATION]
  
  @js.native
  sealed trait `aws-exec-read`
    extends StObject
       with CannedAcl
  inline def `aws-exec-read`: `aws-exec-read` = "aws-exec-read".asInstanceOf[`aws-exec-read`]
  
  @js.native
  sealed trait awsColonkinesis extends StObject
  inline def awsColonkinesis: awsColonkinesis = "aws:kinesis".asInstanceOf[awsColonkinesis]
  
  @js.native
  sealed trait awsColonkinesisColonrecord extends StObject
  inline def awsColonkinesisColonrecord: awsColonkinesisColonrecord = "aws:kinesis:record".asInstanceOf[awsColonkinesisColonrecord]
  
  @js.native
  sealed trait awsfirelens
    extends StObject
       with LogDriver
  inline def awsfirelens: awsfirelens = "awsfirelens".asInstanceOf[awsfirelens]
  
  @js.native
  sealed trait awslogs
    extends StObject
       with LogDriver
  inline def awslogs: awslogs = "awslogs".asInstanceOf[awslogs]
  
  @js.native
  sealed trait `bucket-owner-full-control`
    extends StObject
       with CannedAcl
  inline def `bucket-owner-full-control`: `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[`bucket-owner-full-control`]
  
  @js.native
  sealed trait `bucket-owner-read`
    extends StObject
       with CannedAcl
  inline def `bucket-owner-read`: `bucket-owner-read` = "bucket-owner-read".asInstanceOf[`bucket-owner-read`]
  
  @js.native
  sealed trait c3Dot2xlarge
    extends StObject
       with InstanceType
  inline def c3Dot2xlarge: c3Dot2xlarge = "c3.2xlarge".asInstanceOf[c3Dot2xlarge]
  
  @js.native
  sealed trait c3Dot4xlarge
    extends StObject
       with InstanceType
  inline def c3Dot4xlarge: c3Dot4xlarge = "c3.4xlarge".asInstanceOf[c3Dot4xlarge]
  
  @js.native
  sealed trait c3Dot8xlarge
    extends StObject
       with InstanceType
  inline def c3Dot8xlarge: c3Dot8xlarge = "c3.8xlarge".asInstanceOf[c3Dot8xlarge]
  
  @js.native
  sealed trait c3Dotlarge
    extends StObject
       with InstanceType
  inline def c3Dotlarge: c3Dotlarge = "c3.large".asInstanceOf[c3Dotlarge]
  
  @js.native
  sealed trait c3Dotxlarge
    extends StObject
       with InstanceType
  inline def c3Dotxlarge: c3Dotxlarge = "c3.xlarge".asInstanceOf[c3Dotxlarge]
  
  @js.native
  sealed trait c4Dot2xlarge
    extends StObject
       with InstanceType
  inline def c4Dot2xlarge: c4Dot2xlarge = "c4.2xlarge".asInstanceOf[c4Dot2xlarge]
  
  @js.native
  sealed trait c4Dot4xlarge
    extends StObject
       with InstanceType
  inline def c4Dot4xlarge: c4Dot4xlarge = "c4.4xlarge".asInstanceOf[c4Dot4xlarge]
  
  @js.native
  sealed trait c4Dot8xlarge
    extends StObject
       with InstanceType
  inline def c4Dot8xlarge: c4Dot8xlarge = "c4.8xlarge".asInstanceOf[c4Dot8xlarge]
  
  @js.native
  sealed trait c4Dotlarge
    extends StObject
       with InstanceType
  inline def c4Dotlarge: c4Dotlarge = "c4.large".asInstanceOf[c4Dotlarge]
  
  @js.native
  sealed trait c4Dotxlarge
    extends StObject
       with InstanceType
  inline def c4Dotxlarge: c4Dotxlarge = "c4.xlarge".asInstanceOf[c4Dotxlarge]
  
  @js.native
  sealed trait c5Dot18xlarge
    extends StObject
       with InstanceType
  inline def c5Dot18xlarge: c5Dot18xlarge = "c5.18xlarge".asInstanceOf[c5Dot18xlarge]
  
  @js.native
  sealed trait c5Dot2xlarge
    extends StObject
       with InstanceType
  inline def c5Dot2xlarge: c5Dot2xlarge = "c5.2xlarge".asInstanceOf[c5Dot2xlarge]
  
  @js.native
  sealed trait c5Dot4xlarge
    extends StObject
       with InstanceType
  inline def c5Dot4xlarge: c5Dot4xlarge = "c5.4xlarge".asInstanceOf[c5Dot4xlarge]
  
  @js.native
  sealed trait c5Dot9xlarge
    extends StObject
       with InstanceType
  inline def c5Dot9xlarge: c5Dot9xlarge = "c5.9xlarge".asInstanceOf[c5Dot9xlarge]
  
  @js.native
  sealed trait c5Dotlarge
    extends StObject
       with InstanceType
  inline def c5Dotlarge: c5Dotlarge = "c5.large".asInstanceOf[c5Dotlarge]
  
  @js.native
  sealed trait c5Dotxlarge
    extends StObject
       with InstanceType
  inline def c5Dotxlarge: c5Dotxlarge = "c5.xlarge".asInstanceOf[c5Dotxlarge]
  
  @js.native
  sealed trait c5aDot12xlarge
    extends StObject
       with InstanceType
  inline def c5aDot12xlarge: c5aDot12xlarge = "c5a.12xlarge".asInstanceOf[c5aDot12xlarge]
  
  @js.native
  sealed trait c5aDot16xlarge
    extends StObject
       with InstanceType
  inline def c5aDot16xlarge: c5aDot16xlarge = "c5a.16xlarge".asInstanceOf[c5aDot16xlarge]
  
  @js.native
  sealed trait c5aDot24xlarge
    extends StObject
       with InstanceType
  inline def c5aDot24xlarge: c5aDot24xlarge = "c5a.24xlarge".asInstanceOf[c5aDot24xlarge]
  
  @js.native
  sealed trait c5aDot2xlarge
    extends StObject
       with InstanceType
  inline def c5aDot2xlarge: c5aDot2xlarge = "c5a.2xlarge".asInstanceOf[c5aDot2xlarge]
  
  @js.native
  sealed trait c5aDot4xlarge
    extends StObject
       with InstanceType
  inline def c5aDot4xlarge: c5aDot4xlarge = "c5a.4xlarge".asInstanceOf[c5aDot4xlarge]
  
  @js.native
  sealed trait c5aDot8xlarge
    extends StObject
       with InstanceType
  inline def c5aDot8xlarge: c5aDot8xlarge = "c5a.8xlarge".asInstanceOf[c5aDot8xlarge]
  
  @js.native
  sealed trait c5aDotlarge
    extends StObject
       with InstanceType
  inline def c5aDotlarge: c5aDotlarge = "c5a.large".asInstanceOf[c5aDotlarge]
  
  @js.native
  sealed trait c5aDotxlarge
    extends StObject
       with InstanceType
  inline def c5aDotxlarge: c5aDotxlarge = "c5a.xlarge".asInstanceOf[c5aDotxlarge]
  
  @js.native
  sealed trait c5dDot18xlarge
    extends StObject
       with InstanceType
  inline def c5dDot18xlarge: c5dDot18xlarge = "c5d.18xlarge".asInstanceOf[c5dDot18xlarge]
  
  @js.native
  sealed trait c5dDot2xlarge
    extends StObject
       with InstanceType
  inline def c5dDot2xlarge: c5dDot2xlarge = "c5d.2xlarge".asInstanceOf[c5dDot2xlarge]
  
  @js.native
  sealed trait c5dDot4xlarge
    extends StObject
       with InstanceType
  inline def c5dDot4xlarge: c5dDot4xlarge = "c5d.4xlarge".asInstanceOf[c5dDot4xlarge]
  
  @js.native
  sealed trait c5dDot9xlarge
    extends StObject
       with InstanceType
  inline def c5dDot9xlarge: c5dDot9xlarge = "c5d.9xlarge".asInstanceOf[c5dDot9xlarge]
  
  @js.native
  sealed trait c5dDotlarge
    extends StObject
       with InstanceType
  inline def c5dDotlarge: c5dDotlarge = "c5d.large".asInstanceOf[c5dDotlarge]
  
  @js.native
  sealed trait c5dDotxlarge
    extends StObject
       with InstanceType
  inline def c5dDotxlarge: c5dDotxlarge = "c5d.xlarge".asInstanceOf[c5dDotxlarge]
  
  @js.native
  sealed trait c5nDot18xlarge
    extends StObject
       with InstanceType
  inline def c5nDot18xlarge: c5nDot18xlarge = "c5n.18xlarge".asInstanceOf[c5nDot18xlarge]
  
  @js.native
  sealed trait c5nDot2xlarge
    extends StObject
       with InstanceType
  inline def c5nDot2xlarge: c5nDot2xlarge = "c5n.2xlarge".asInstanceOf[c5nDot2xlarge]
  
  @js.native
  sealed trait c5nDot4xlarge
    extends StObject
       with InstanceType
  inline def c5nDot4xlarge: c5nDot4xlarge = "c5n.4xlarge".asInstanceOf[c5nDot4xlarge]
  
  @js.native
  sealed trait c5nDot9xlarge
    extends StObject
       with InstanceType
  inline def c5nDot9xlarge: c5nDot9xlarge = "c5n.9xlarge".asInstanceOf[c5nDot9xlarge]
  
  @js.native
  sealed trait c5nDotlarge
    extends StObject
       with InstanceType
  inline def c5nDotlarge: c5nDotlarge = "c5n.large".asInstanceOf[c5nDotlarge]
  
  @js.native
  sealed trait c5nDotxlarge
    extends StObject
       with InstanceType
  inline def c5nDotxlarge: c5nDotxlarge = "c5n.xlarge".asInstanceOf[c5nDotxlarge]
  
  @js.native
  sealed trait `ca-central-1`
    extends StObject
       with Region
  inline def `ca-central-1`: `ca-central-1` = "ca-central-1".asInstanceOf[`ca-central-1`]
  
  @js.native
  sealed trait cluster
    extends StObject
       with PlacementStrategy
  inline def cluster: cluster = "cluster".asInstanceOf[cluster]
  
  @js.native
  sealed trait `cn-north-1`
    extends StObject
       with Region
  inline def `cn-north-1`: `cn-north-1` = "cn-north-1".asInstanceOf[`cn-north-1`]
  
  @js.native
  sealed trait `cn-northwest-1`
    extends StObject
       with Region
  inline def `cn-northwest-1`: `cn-northwest-1` = "cn-northwest-1".asInstanceOf[`cn-northwest-1`]
  
  @js.native
  sealed trait core
    extends StObject
       with UlimitName
  inline def core: core = "core".asInstanceOf[core]
  
  @js.native
  sealed trait cpu
    extends StObject
       with UlimitName
  inline def cpu: cpu = "cpu".asInstanceOf[cpu]
  
  @js.native
  sealed trait d2Dot2xlarge
    extends StObject
       with InstanceType
  inline def d2Dot2xlarge: d2Dot2xlarge = "d2.2xlarge".asInstanceOf[d2Dot2xlarge]
  
  @js.native
  sealed trait d2Dot4xlarge
    extends StObject
       with InstanceType
  inline def d2Dot4xlarge: d2Dot4xlarge = "d2.4xlarge".asInstanceOf[d2Dot4xlarge]
  
  @js.native
  sealed trait d2Dot8xlarge
    extends StObject
       with InstanceType
  inline def d2Dot8xlarge: d2Dot8xlarge = "d2.8xlarge".asInstanceOf[d2Dot8xlarge]
  
  @js.native
  sealed trait d2Dotxlarge
    extends StObject
       with InstanceType
  inline def d2Dotxlarge: d2Dotxlarge = "d2.xlarge".asInstanceOf[d2Dotxlarge]
  
  @js.native
  sealed trait data
    extends StObject
       with UlimitName
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait dbDotm1Dotlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm1Dotlarge: dbDotm1Dotlarge = "db.m1.large".asInstanceOf[dbDotm1Dotlarge]
  
  @js.native
  sealed trait dbDotm1Dotmedium
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm1Dotmedium: dbDotm1Dotmedium = "db.m1.medium".asInstanceOf[dbDotm1Dotmedium]
  
  @js.native
  sealed trait dbDotm1Dotsmall
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm1Dotsmall: dbDotm1Dotsmall = "db.m1.small".asInstanceOf[dbDotm1Dotsmall]
  
  @js.native
  sealed trait dbDotm1Dotxlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm1Dotxlarge: dbDotm1Dotxlarge = "db.m1.xlarge".asInstanceOf[dbDotm1Dotxlarge]
  
  @js.native
  sealed trait dbDotm2Dot2xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm2Dot2xlarge: dbDotm2Dot2xlarge = "db.m2.2xlarge".asInstanceOf[dbDotm2Dot2xlarge]
  
  @js.native
  sealed trait dbDotm2Dot4xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm2Dot4xlarge: dbDotm2Dot4xlarge = "db.m2.4xlarge".asInstanceOf[dbDotm2Dot4xlarge]
  
  @js.native
  sealed trait dbDotm2Dotxlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm2Dotxlarge: dbDotm2Dotxlarge = "db.m2.xlarge".asInstanceOf[dbDotm2Dotxlarge]
  
  @js.native
  sealed trait dbDotm3Dot2xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm3Dot2xlarge: dbDotm3Dot2xlarge = "db.m3.2xlarge".asInstanceOf[dbDotm3Dot2xlarge]
  
  @js.native
  sealed trait dbDotm3Dotlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm3Dotlarge: dbDotm3Dotlarge = "db.m3.large".asInstanceOf[dbDotm3Dotlarge]
  
  @js.native
  sealed trait dbDotm3Dotmedium
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm3Dotmedium: dbDotm3Dotmedium = "db.m3.medium".asInstanceOf[dbDotm3Dotmedium]
  
  @js.native
  sealed trait dbDotm3Dotxlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm3Dotxlarge: dbDotm3Dotxlarge = "db.m3.xlarge".asInstanceOf[dbDotm3Dotxlarge]
  
  @js.native
  sealed trait dbDotm4Dot10xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm4Dot10xlarge: dbDotm4Dot10xlarge = "db.m4.10xlarge".asInstanceOf[dbDotm4Dot10xlarge]
  
  @js.native
  sealed trait dbDotm4Dot2xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm4Dot2xlarge: dbDotm4Dot2xlarge = "db.m4.2xlarge".asInstanceOf[dbDotm4Dot2xlarge]
  
  @js.native
  sealed trait dbDotm4Dot4xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm4Dot4xlarge: dbDotm4Dot4xlarge = "db.m4.4xlarge".asInstanceOf[dbDotm4Dot4xlarge]
  
  @js.native
  sealed trait dbDotm4Dotlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm4Dotlarge: dbDotm4Dotlarge = "db.m4.large".asInstanceOf[dbDotm4Dotlarge]
  
  @js.native
  sealed trait dbDotm4Dotxlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm4Dotxlarge: dbDotm4Dotxlarge = "db.m4.xlarge".asInstanceOf[dbDotm4Dotxlarge]
  
  @js.native
  sealed trait dbDotm5Dot12xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm5Dot12xlarge: dbDotm5Dot12xlarge = "db.m5.12xlarge".asInstanceOf[dbDotm5Dot12xlarge]
  
  @js.native
  sealed trait dbDotm5Dot24xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm5Dot24xlarge: dbDotm5Dot24xlarge = "db.m5.24xlarge".asInstanceOf[dbDotm5Dot24xlarge]
  
  @js.native
  sealed trait dbDotm5Dot2xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm5Dot2xlarge: dbDotm5Dot2xlarge = "db.m5.2xlarge".asInstanceOf[dbDotm5Dot2xlarge]
  
  @js.native
  sealed trait dbDotm5Dot4xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm5Dot4xlarge: dbDotm5Dot4xlarge = "db.m5.4xlarge".asInstanceOf[dbDotm5Dot4xlarge]
  
  @js.native
  sealed trait dbDotm5Dotlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm5Dotlarge: dbDotm5Dotlarge = "db.m5.large".asInstanceOf[dbDotm5Dotlarge]
  
  @js.native
  sealed trait dbDotm5Dotxlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotm5Dotxlarge: dbDotm5Dotxlarge = "db.m5.xlarge".asInstanceOf[dbDotm5Dotxlarge]
  
  @js.native
  sealed trait dbDotr3Dot2xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr3Dot2xlarge: dbDotr3Dot2xlarge = "db.r3.2xlarge".asInstanceOf[dbDotr3Dot2xlarge]
  
  @js.native
  sealed trait dbDotr3Dot4xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr3Dot4xlarge: dbDotr3Dot4xlarge = "db.r3.4xlarge".asInstanceOf[dbDotr3Dot4xlarge]
  
  @js.native
  sealed trait dbDotr3Dot8xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr3Dot8xlarge: dbDotr3Dot8xlarge = "db.r3.8xlarge".asInstanceOf[dbDotr3Dot8xlarge]
  
  @js.native
  sealed trait dbDotr3Dotlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr3Dotlarge: dbDotr3Dotlarge = "db.r3.large".asInstanceOf[dbDotr3Dotlarge]
  
  @js.native
  sealed trait dbDotr3Dotxlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr3Dotxlarge: dbDotr3Dotxlarge = "db.r3.xlarge".asInstanceOf[dbDotr3Dotxlarge]
  
  @js.native
  sealed trait dbDotr4Dot16xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr4Dot16xlarge: dbDotr4Dot16xlarge = "db.r4.16xlarge".asInstanceOf[dbDotr4Dot16xlarge]
  
  @js.native
  sealed trait dbDotr4Dot2xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr4Dot2xlarge: dbDotr4Dot2xlarge = "db.r4.2xlarge".asInstanceOf[dbDotr4Dot2xlarge]
  
  @js.native
  sealed trait dbDotr4Dot4xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr4Dot4xlarge: dbDotr4Dot4xlarge = "db.r4.4xlarge".asInstanceOf[dbDotr4Dot4xlarge]
  
  @js.native
  sealed trait dbDotr4Dot8xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr4Dot8xlarge: dbDotr4Dot8xlarge = "db.r4.8xlarge".asInstanceOf[dbDotr4Dot8xlarge]
  
  @js.native
  sealed trait dbDotr4Dotlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr4Dotlarge: dbDotr4Dotlarge = "db.r4.large".asInstanceOf[dbDotr4Dotlarge]
  
  @js.native
  sealed trait dbDotr4Dotxlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr4Dotxlarge: dbDotr4Dotxlarge = "db.r4.xlarge".asInstanceOf[dbDotr4Dotxlarge]
  
  @js.native
  sealed trait dbDotr5Dot12xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr5Dot12xlarge: dbDotr5Dot12xlarge = "db.r5.12xlarge".asInstanceOf[dbDotr5Dot12xlarge]
  
  @js.native
  sealed trait dbDotr5Dot24xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr5Dot24xlarge: dbDotr5Dot24xlarge = "db.r5.24xlarge".asInstanceOf[dbDotr5Dot24xlarge]
  
  @js.native
  sealed trait dbDotr5Dot2xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr5Dot2xlarge: dbDotr5Dot2xlarge = "db.r5.2xlarge".asInstanceOf[dbDotr5Dot2xlarge]
  
  @js.native
  sealed trait dbDotr5Dot4xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr5Dot4xlarge: dbDotr5Dot4xlarge = "db.r5.4xlarge".asInstanceOf[dbDotr5Dot4xlarge]
  
  @js.native
  sealed trait dbDotr5Dotlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr5Dotlarge: dbDotr5Dotlarge = "db.r5.large".asInstanceOf[dbDotr5Dotlarge]
  
  @js.native
  sealed trait dbDotr5Dotxlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotr5Dotxlarge: dbDotr5Dotxlarge = "db.r5.xlarge".asInstanceOf[dbDotr5Dotxlarge]
  
  @js.native
  sealed trait dbDott2Dot2xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott2Dot2xlarge: dbDott2Dot2xlarge = "db.t2.2xlarge".asInstanceOf[dbDott2Dot2xlarge]
  
  @js.native
  sealed trait dbDott2Dotlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott2Dotlarge: dbDott2Dotlarge = "db.t2.large".asInstanceOf[dbDott2Dotlarge]
  
  @js.native
  sealed trait dbDott2Dotmedium
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott2Dotmedium: dbDott2Dotmedium = "db.t2.medium".asInstanceOf[dbDott2Dotmedium]
  
  @js.native
  sealed trait dbDott2Dotmicro
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott2Dotmicro: dbDott2Dotmicro = "db.t2.micro".asInstanceOf[dbDott2Dotmicro]
  
  @js.native
  sealed trait dbDott2Dotsmall
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott2Dotsmall: dbDott2Dotsmall = "db.t2.small".asInstanceOf[dbDott2Dotsmall]
  
  @js.native
  sealed trait dbDott2Dotxlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott2Dotxlarge: dbDott2Dotxlarge = "db.t2.xlarge".asInstanceOf[dbDott2Dotxlarge]
  
  @js.native
  sealed trait dbDott3Dot2xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott3Dot2xlarge: dbDott3Dot2xlarge = "db.t3.2xlarge".asInstanceOf[dbDott3Dot2xlarge]
  
  @js.native
  sealed trait dbDott3Dotlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott3Dotlarge: dbDott3Dotlarge = "db.t3.large".asInstanceOf[dbDott3Dotlarge]
  
  @js.native
  sealed trait dbDott3Dotmedium
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott3Dotmedium: dbDott3Dotmedium = "db.t3.medium".asInstanceOf[dbDott3Dotmedium]
  
  @js.native
  sealed trait dbDott3Dotmicro
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott3Dotmicro: dbDott3Dotmicro = "db.t3.micro".asInstanceOf[dbDott3Dotmicro]
  
  @js.native
  sealed trait dbDott3Dotsmall
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott3Dotsmall: dbDott3Dotsmall = "db.t3.small".asInstanceOf[dbDott3Dotsmall]
  
  @js.native
  sealed trait dbDott3Dotxlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDott3Dotxlarge: dbDott3Dotxlarge = "db.t3.xlarge".asInstanceOf[dbDott3Dotxlarge]
  
  @js.native
  sealed trait dbDotx1Dot16xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotx1Dot16xlarge: dbDotx1Dot16xlarge = "db.x1.16xlarge".asInstanceOf[dbDotx1Dot16xlarge]
  
  @js.native
  sealed trait dbDotx1Dot32xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotx1Dot32xlarge: dbDotx1Dot32xlarge = "db.x1.32xlarge".asInstanceOf[dbDotx1Dot32xlarge]
  
  @js.native
  sealed trait dbDotx1eDot2xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotx1eDot2xlarge: dbDotx1eDot2xlarge = "db.x1e.2xlarge".asInstanceOf[dbDotx1eDot2xlarge]
  
  @js.native
  sealed trait dbDotx1eDot32xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotx1eDot32xlarge: dbDotx1eDot32xlarge = "db.x1e.32xlarge".asInstanceOf[dbDotx1eDot32xlarge]
  
  @js.native
  sealed trait dbDotx1eDot4xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotx1eDot4xlarge: dbDotx1eDot4xlarge = "db.x1e.4xlarge".asInstanceOf[dbDotx1eDot4xlarge]
  
  @js.native
  sealed trait dbDotx1eDot8xlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotx1eDot8xlarge: dbDotx1eDot8xlarge = "db.x1e.8xlarge".asInstanceOf[dbDotx1eDot8xlarge]
  
  @js.native
  sealed trait dbDotx1eDotxlarge
    extends StObject
       with typings.pulumiAws.enumsRdsMod.InstanceType
  inline def dbDotx1eDotxlarge: dbDotx1eDotxlarge = "db.x1e.xlarge".asInstanceOf[dbDotx1eDotxlarge]
  
  @js.native
  sealed trait dedicated
    extends StObject
       with Tenancy
  inline def dedicated: dedicated = "dedicated".asInstanceOf[dedicated]
  
  @js.native
  sealed trait dotnetcore2Dot1
    extends StObject
       with Runtime
  inline def dotnetcore2Dot1: dotnetcore2Dot1 = "dotnetcore2.1".asInstanceOf[dotnetcore2Dot1]
  
  @js.native
  sealed trait dotnetcore3Dot1
    extends StObject
       with Runtime
  inline def dotnetcore3Dot1: dotnetcore3Dot1 = "dotnetcore3.1".asInstanceOf[dotnetcore3Dot1]
  
  @js.native
  sealed trait dualstack
    extends StObject
       with IpAddressType
       with typings.pulumiAws.enumsAlbMod.IpAddressType
  inline def dualstack: dualstack = "dualstack".asInstanceOf[dualstack]
  
  @js.native
  sealed trait `eu-central-1`
    extends StObject
       with Region
  inline def `eu-central-1`: `eu-central-1` = "eu-central-1".asInstanceOf[`eu-central-1`]
  
  @js.native
  sealed trait `eu-north-1`
    extends StObject
       with Region
  inline def `eu-north-1`: `eu-north-1` = "eu-north-1".asInstanceOf[`eu-north-1`]
  
  @js.native
  sealed trait `eu-south-1`
    extends StObject
       with Region
  inline def `eu-south-1`: `eu-south-1` = "eu-south-1".asInstanceOf[`eu-south-1`]
  
  @js.native
  sealed trait `eu-west-1`
    extends StObject
       with Region
  inline def `eu-west-1`: `eu-west-1` = "eu-west-1".asInstanceOf[`eu-west-1`]
  
  @js.native
  sealed trait `eu-west-2`
    extends StObject
       with Region
  inline def `eu-west-2`: `eu-west-2` = "eu-west-2".asInstanceOf[`eu-west-2`]
  
  @js.native
  sealed trait `eu-west-3`
    extends StObject
       with Region
  inline def `eu-west-3`: `eu-west-3` = "eu-west-3".asInstanceOf[`eu-west-3`]
  
  @js.native
  sealed trait expire extends StObject
  inline def expire: expire = "expire".asInstanceOf[expire]
  
  @js.native
  sealed trait f1Dot16xlarge
    extends StObject
       with InstanceType
  inline def f1Dot16xlarge: f1Dot16xlarge = "f1.16xlarge".asInstanceOf[f1Dot16xlarge]
  
  @js.native
  sealed trait f1Dot2xlarge
    extends StObject
       with InstanceType
  inline def f1Dot2xlarge: f1Dot2xlarge = "f1.2xlarge".asInstanceOf[f1Dot2xlarge]
  
  @js.native
  sealed trait fluentd
    extends StObject
       with LogDriver
  inline def fluentd: fluentd = "fluentd".asInstanceOf[fluentd]
  
  @js.native
  sealed trait fsize
    extends StObject
       with UlimitName
  inline def fsize: fsize = "fsize".asInstanceOf[fsize]
  
  @js.native
  sealed trait g2Dot2xlarge
    extends StObject
       with InstanceType
  inline def g2Dot2xlarge: g2Dot2xlarge = "g2.2xlarge".asInstanceOf[g2Dot2xlarge]
  
  @js.native
  sealed trait g2Dot8xlarge
    extends StObject
       with InstanceType
  inline def g2Dot8xlarge: g2Dot8xlarge = "g2.8xlarge".asInstanceOf[g2Dot8xlarge]
  
  @js.native
  sealed trait g3Dot16xlarge
    extends StObject
       with InstanceType
  inline def g3Dot16xlarge: g3Dot16xlarge = "g3.16xlarge".asInstanceOf[g3Dot16xlarge]
  
  @js.native
  sealed trait g3Dot4xlarge
    extends StObject
       with InstanceType
  inline def g3Dot4xlarge: g3Dot4xlarge = "g3.4xlarge".asInstanceOf[g3Dot4xlarge]
  
  @js.native
  sealed trait g3Dot8xlarge
    extends StObject
       with InstanceType
  inline def g3Dot8xlarge: g3Dot8xlarge = "g3.8xlarge".asInstanceOf[g3Dot8xlarge]
  
  @js.native
  sealed trait g3sDotxlarge
    extends StObject
       with InstanceType
  inline def g3sDotxlarge: g3sDotxlarge = "g3s.xlarge".asInstanceOf[g3sDotxlarge]
  
  @js.native
  sealed trait gelf
    extends StObject
       with LogDriver
  inline def gelf: gelf = "gelf".asInstanceOf[gelf]
  
  @js.native
  sealed trait global
    extends StObject
       with EngineMode
  inline def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait go1Dotx
    extends StObject
       with Runtime
  inline def go1Dotx: go1Dotx = "go1.x".asInstanceOf[go1Dotx]
  
  @js.native
  sealed trait gp2
    extends StObject
       with StorageType
  inline def gp2: gp2 = "gp2".asInstanceOf[gp2]
  
  @js.native
  sealed trait h1Dot16xlarge
    extends StObject
       with InstanceType
  inline def h1Dot16xlarge: h1Dot16xlarge = "h1.16xlarge".asInstanceOf[h1Dot16xlarge]
  
  @js.native
  sealed trait h1Dot2xlarge
    extends StObject
       with InstanceType
  inline def h1Dot2xlarge: h1Dot2xlarge = "h1.2xlarge".asInstanceOf[h1Dot2xlarge]
  
  @js.native
  sealed trait h1Dot4xlarge
    extends StObject
       with InstanceType
  inline def h1Dot4xlarge: h1Dot4xlarge = "h1.4xlarge".asInstanceOf[h1Dot4xlarge]
  
  @js.native
  sealed trait h1Dot8xlarge
    extends StObject
       with InstanceType
  inline def h1Dot8xlarge: h1Dot8xlarge = "h1.8xlarge".asInstanceOf[h1Dot8xlarge]
  
  @js.native
  sealed trait hs1Dot8xlarge
    extends StObject
       with InstanceType
  inline def hs1Dot8xlarge: hs1Dot8xlarge = "hs1.8xlarge".asInstanceOf[hs1Dot8xlarge]
  
  @js.native
  sealed trait i3Dot16xlarge
    extends StObject
       with InstanceType
  inline def i3Dot16xlarge: i3Dot16xlarge = "i3.16xlarge".asInstanceOf[i3Dot16xlarge]
  
  @js.native
  sealed trait i3Dot2xlarge
    extends StObject
       with InstanceType
  inline def i3Dot2xlarge: i3Dot2xlarge = "i3.2xlarge".asInstanceOf[i3Dot2xlarge]
  
  @js.native
  sealed trait i3Dot4xlarge
    extends StObject
       with InstanceType
  inline def i3Dot4xlarge: i3Dot4xlarge = "i3.4xlarge".asInstanceOf[i3Dot4xlarge]
  
  @js.native
  sealed trait i3Dot8xlarge
    extends StObject
       with InstanceType
  inline def i3Dot8xlarge: i3Dot8xlarge = "i3.8xlarge".asInstanceOf[i3Dot8xlarge]
  
  @js.native
  sealed trait i3Dotlarge
    extends StObject
       with InstanceType
  inline def i3Dotlarge: i3Dotlarge = "i3.large".asInstanceOf[i3Dotlarge]
  
  @js.native
  sealed trait i3Dotmetal
    extends StObject
       with InstanceType
  inline def i3Dotmetal: i3Dotmetal = "i3.metal".asInstanceOf[i3Dotmetal]
  
  @js.native
  sealed trait i3Dotxlarge
    extends StObject
       with InstanceType
  inline def i3Dotxlarge: i3Dotxlarge = "i3.xlarge".asInstanceOf[i3Dotxlarge]
  
  @js.native
  sealed trait icmp
    extends StObject
       with ProtocolType
  inline def icmp: icmp = "icmp".asInstanceOf[icmp]
  
  @js.native
  sealed trait imageCountMoreThan extends StObject
  inline def imageCountMoreThan: imageCountMoreThan = "imageCountMoreThan".asInstanceOf[imageCountMoreThan]
  
  @js.native
  sealed trait io1
    extends StObject
       with StorageType
  inline def io1: io1 = "io1".asInstanceOf[io1]
  
  @js.native
  sealed trait ipv4
    extends StObject
       with IpAddressType
       with typings.pulumiAws.enumsAlbMod.IpAddressType
  inline def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  
  @js.native
  sealed trait java11
    extends StObject
       with Runtime
  inline def java11: java11 = "java11".asInstanceOf[java11]
  
  @js.native
  sealed trait java8
    extends StObject
       with Runtime
  inline def java8: java8 = "java8".asInstanceOf[java8]
  
  @js.native
  sealed trait java8Dotal2
    extends StObject
       with Runtime
  inline def java8Dotal2: java8Dotal2 = "java8.al2".asInstanceOf[java8Dotal2]
  
  @js.native
  sealed trait journald
    extends StObject
       with LogDriver
  inline def journald: journald = "journald".asInstanceOf[journald]
  
  @js.native
  sealed trait `json-file`
    extends StObject
       with LogDriver
  inline def `json-file`: `json-file` = "json-file".asInstanceOf[`json-file`]
  
  @js.native
  sealed trait locks
    extends StObject
       with UlimitName
  inline def locks: locks = "locks".asInstanceOf[locks]
  
  @js.native
  sealed trait `log-delivery-write`
    extends StObject
       with CannedAcl
  inline def `log-delivery-write`: `log-delivery-write` = "log-delivery-write".asInstanceOf[`log-delivery-write`]
  
  @js.native
  sealed trait m3Dot2xlarge
    extends StObject
       with InstanceType
  inline def m3Dot2xlarge: m3Dot2xlarge = "m3.2xlarge".asInstanceOf[m3Dot2xlarge]
  
  @js.native
  sealed trait m3Dotlarge
    extends StObject
       with InstanceType
  inline def m3Dotlarge: m3Dotlarge = "m3.large".asInstanceOf[m3Dotlarge]
  
  @js.native
  sealed trait m3Dotmedium
    extends StObject
       with InstanceType
  inline def m3Dotmedium: m3Dotmedium = "m3.medium".asInstanceOf[m3Dotmedium]
  
  @js.native
  sealed trait m3Dotxlarge
    extends StObject
       with InstanceType
  inline def m3Dotxlarge: m3Dotxlarge = "m3.xlarge".asInstanceOf[m3Dotxlarge]
  
  @js.native
  sealed trait m4Dot10xlarge
    extends StObject
       with InstanceType
  inline def m4Dot10xlarge: m4Dot10xlarge = "m4.10xlarge".asInstanceOf[m4Dot10xlarge]
  
  @js.native
  sealed trait m4Dot16xlarge
    extends StObject
       with InstanceType
  inline def m4Dot16xlarge: m4Dot16xlarge = "m4.16xlarge".asInstanceOf[m4Dot16xlarge]
  
  @js.native
  sealed trait m4Dot2xlarge
    extends StObject
       with InstanceType
  inline def m4Dot2xlarge: m4Dot2xlarge = "m4.2xlarge".asInstanceOf[m4Dot2xlarge]
  
  @js.native
  sealed trait m4Dot4xlarge
    extends StObject
       with InstanceType
  inline def m4Dot4xlarge: m4Dot4xlarge = "m4.4xlarge".asInstanceOf[m4Dot4xlarge]
  
  @js.native
  sealed trait m4Dotlarge
    extends StObject
       with InstanceType
  inline def m4Dotlarge: m4Dotlarge = "m4.large".asInstanceOf[m4Dotlarge]
  
  @js.native
  sealed trait m4Dotxlarge
    extends StObject
       with InstanceType
  inline def m4Dotxlarge: m4Dotxlarge = "m4.xlarge".asInstanceOf[m4Dotxlarge]
  
  @js.native
  sealed trait m5Dot12xlarge
    extends StObject
       with InstanceType
  inline def m5Dot12xlarge: m5Dot12xlarge = "m5.12xlarge".asInstanceOf[m5Dot12xlarge]
  
  @js.native
  sealed trait m5Dot24xlarge
    extends StObject
       with InstanceType
  inline def m5Dot24xlarge: m5Dot24xlarge = "m5.24xlarge".asInstanceOf[m5Dot24xlarge]
  
  @js.native
  sealed trait m5Dot2xlarge
    extends StObject
       with InstanceType
  inline def m5Dot2xlarge: m5Dot2xlarge = "m5.2xlarge".asInstanceOf[m5Dot2xlarge]
  
  @js.native
  sealed trait m5Dot4xlarge
    extends StObject
       with InstanceType
  inline def m5Dot4xlarge: m5Dot4xlarge = "m5.4xlarge".asInstanceOf[m5Dot4xlarge]
  
  @js.native
  sealed trait m5Dotlarge
    extends StObject
       with InstanceType
  inline def m5Dotlarge: m5Dotlarge = "m5.large".asInstanceOf[m5Dotlarge]
  
  @js.native
  sealed trait m5Dotxlarge
    extends StObject
       with InstanceType
  inline def m5Dotxlarge: m5Dotxlarge = "m5.xlarge".asInstanceOf[m5Dotxlarge]
  
  @js.native
  sealed trait m5aDot12xlarge
    extends StObject
       with InstanceType
  inline def m5aDot12xlarge: m5aDot12xlarge = "m5a.12xlarge".asInstanceOf[m5aDot12xlarge]
  
  @js.native
  sealed trait m5aDot24xlarge
    extends StObject
       with InstanceType
  inline def m5aDot24xlarge: m5aDot24xlarge = "m5a.24xlarge".asInstanceOf[m5aDot24xlarge]
  
  @js.native
  sealed trait m5aDot2xlarge
    extends StObject
       with InstanceType
  inline def m5aDot2xlarge: m5aDot2xlarge = "m5a.2xlarge".asInstanceOf[m5aDot2xlarge]
  
  @js.native
  sealed trait m5aDot4xlarge
    extends StObject
       with InstanceType
  inline def m5aDot4xlarge: m5aDot4xlarge = "m5a.4xlarge".asInstanceOf[m5aDot4xlarge]
  
  @js.native
  sealed trait m5aDotlarge
    extends StObject
       with InstanceType
  inline def m5aDotlarge: m5aDotlarge = "m5a.large".asInstanceOf[m5aDotlarge]
  
  @js.native
  sealed trait m5aDotxlarge
    extends StObject
       with InstanceType
  inline def m5aDotxlarge: m5aDotxlarge = "m5a.xlarge".asInstanceOf[m5aDotxlarge]
  
  @js.native
  sealed trait m5dDot12xlarge
    extends StObject
       with InstanceType
  inline def m5dDot12xlarge: m5dDot12xlarge = "m5d.12xlarge".asInstanceOf[m5dDot12xlarge]
  
  @js.native
  sealed trait m5dDot24xlarge
    extends StObject
       with InstanceType
  inline def m5dDot24xlarge: m5dDot24xlarge = "m5d.24xlarge".asInstanceOf[m5dDot24xlarge]
  
  @js.native
  sealed trait m5dDot2xlarge
    extends StObject
       with InstanceType
  inline def m5dDot2xlarge: m5dDot2xlarge = "m5d.2xlarge".asInstanceOf[m5dDot2xlarge]
  
  @js.native
  sealed trait m5dDot4xlarge
    extends StObject
       with InstanceType
  inline def m5dDot4xlarge: m5dDot4xlarge = "m5d.4xlarge".asInstanceOf[m5dDot4xlarge]
  
  @js.native
  sealed trait m5dDotlarge
    extends StObject
       with InstanceType
  inline def m5dDotlarge: m5dDotlarge = "m5d.large".asInstanceOf[m5dDotlarge]
  
  @js.native
  sealed trait m5dDotxlarge
    extends StObject
       with InstanceType
  inline def m5dDotxlarge: m5dDotxlarge = "m5d.xlarge".asInstanceOf[m5dDotxlarge]
  
  @js.native
  sealed trait `me-south-1`
    extends StObject
       with Region
  inline def `me-south-1`: `me-south-1` = "me-south-1".asInstanceOf[`me-south-1`]
  
  @js.native
  sealed trait memlock
    extends StObject
       with UlimitName
  inline def memlock: memlock = "memlock".asInstanceOf[memlock]
  
  @js.native
  sealed trait msgqueue
    extends StObject
       with UlimitName
  inline def msgqueue: msgqueue = "msgqueue".asInstanceOf[msgqueue]
  
  @js.native
  sealed trait network
    extends StObject
       with LoadBalancerType
       with typings.pulumiAws.enumsAlbMod.LoadBalancerType
  inline def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait nice
    extends StObject
       with UlimitName
  inline def nice: nice = "nice".asInstanceOf[nice]
  
  @js.native
  sealed trait nodejs10Dotx
    extends StObject
       with Runtime
  inline def nodejs10Dotx: nodejs10Dotx = "nodejs10.x".asInstanceOf[nodejs10Dotx]
  
  @js.native
  sealed trait nodejs12Dotx
    extends StObject
       with Runtime
  inline def nodejs12Dotx: nodejs12Dotx = "nodejs12.x".asInstanceOf[nodejs12Dotx]
  
  @js.native
  sealed trait nofile
    extends StObject
       with UlimitName
  inline def nofile: nofile = "nofile".asInstanceOf[nofile]
  
  @js.native
  sealed trait nproc
    extends StObject
       with UlimitName
  inline def nproc: nproc = "nproc".asInstanceOf[nproc]
  
  @js.native
  sealed trait p2Dot16xlarge
    extends StObject
       with InstanceType
  inline def p2Dot16xlarge: p2Dot16xlarge = "p2.16xlarge".asInstanceOf[p2Dot16xlarge]
  
  @js.native
  sealed trait p2Dot8xlarge
    extends StObject
       with InstanceType
  inline def p2Dot8xlarge: p2Dot8xlarge = "p2.8xlarge".asInstanceOf[p2Dot8xlarge]
  
  @js.native
  sealed trait p2Dotxlarge
    extends StObject
       with InstanceType
  inline def p2Dotxlarge: p2Dotxlarge = "p2.xlarge".asInstanceOf[p2Dotxlarge]
  
  @js.native
  sealed trait p3Dot16xlarge
    extends StObject
       with InstanceType
  inline def p3Dot16xlarge: p3Dot16xlarge = "p3.16xlarge".asInstanceOf[p3Dot16xlarge]
  
  @js.native
  sealed trait p3Dot2xlarge
    extends StObject
       with InstanceType
  inline def p3Dot2xlarge: p3Dot2xlarge = "p3.2xlarge".asInstanceOf[p3Dot2xlarge]
  
  @js.native
  sealed trait p3Dot8xlarge
    extends StObject
       with InstanceType
  inline def p3Dot8xlarge: p3Dot8xlarge = "p3.8xlarge".asInstanceOf[p3Dot8xlarge]
  
  @js.native
  sealed trait p3dnDot24xlarge
    extends StObject
       with InstanceType
  inline def p3dnDot24xlarge: p3dnDot24xlarge = "p3dn.24xlarge".asInstanceOf[p3dnDot24xlarge]
  
  @js.native
  sealed trait parallelquery
    extends StObject
       with EngineMode
  inline def parallelquery: parallelquery = "parallelquery".asInstanceOf[parallelquery]
  
  @js.native
  sealed trait `private`
    extends StObject
       with CannedAcl
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait provided
    extends StObject
       with Runtime
  inline def provided: provided = "provided".asInstanceOf[provided]
  
  @js.native
  sealed trait providedDotal2
    extends StObject
       with Runtime
  inline def providedDotal2: providedDotal2 = "provided.al2".asInstanceOf[providedDotal2]
  
  @js.native
  sealed trait provisioned
    extends StObject
       with EngineMode
  inline def provisioned: provisioned = "provisioned".asInstanceOf[provisioned]
  
  @js.native
  sealed trait `public-read`
    extends StObject
       with CannedAcl
  inline def `public-read`: `public-read` = "public-read".asInstanceOf[`public-read`]
  
  @js.native
  sealed trait `public-read-write`
    extends StObject
       with CannedAcl
  inline def `public-read-write`: `public-read-write` = "public-read-write".asInstanceOf[`public-read-write`]
  
  @js.native
  sealed trait python2Dot7
    extends StObject
       with Runtime
  inline def python2Dot7: python2Dot7 = "python2.7".asInstanceOf[python2Dot7]
  
  @js.native
  sealed trait python3Dot6
    extends StObject
       with Runtime
  inline def python3Dot6: python3Dot6 = "python3.6".asInstanceOf[python3Dot6]
  
  @js.native
  sealed trait python3Dot7
    extends StObject
       with Runtime
  inline def python3Dot7: python3Dot7 = "python3.7".asInstanceOf[python3Dot7]
  
  @js.native
  sealed trait python3Dot8
    extends StObject
       with Runtime
  inline def python3Dot8: python3Dot8 = "python3.8".asInstanceOf[python3Dot8]
  
  @js.native
  sealed trait r3Dot2xlarge
    extends StObject
       with InstanceType
  inline def r3Dot2xlarge: r3Dot2xlarge = "r3.2xlarge".asInstanceOf[r3Dot2xlarge]
  
  @js.native
  sealed trait r3Dot4xlarge
    extends StObject
       with InstanceType
  inline def r3Dot4xlarge: r3Dot4xlarge = "r3.4xlarge".asInstanceOf[r3Dot4xlarge]
  
  @js.native
  sealed trait r3Dot8xlarge
    extends StObject
       with InstanceType
  inline def r3Dot8xlarge: r3Dot8xlarge = "r3.8xlarge".asInstanceOf[r3Dot8xlarge]
  
  @js.native
  sealed trait r3Dotlarge
    extends StObject
       with InstanceType
  inline def r3Dotlarge: r3Dotlarge = "r3.large".asInstanceOf[r3Dotlarge]
  
  @js.native
  sealed trait r3Dotxlarge
    extends StObject
       with InstanceType
  inline def r3Dotxlarge: r3Dotxlarge = "r3.xlarge".asInstanceOf[r3Dotxlarge]
  
  @js.native
  sealed trait r4Dot16xlarge
    extends StObject
       with InstanceType
  inline def r4Dot16xlarge: r4Dot16xlarge = "r4.16xlarge".asInstanceOf[r4Dot16xlarge]
  
  @js.native
  sealed trait r4Dot2xlarge
    extends StObject
       with InstanceType
  inline def r4Dot2xlarge: r4Dot2xlarge = "r4.2xlarge".asInstanceOf[r4Dot2xlarge]
  
  @js.native
  sealed trait r4Dot4xlarge
    extends StObject
       with InstanceType
  inline def r4Dot4xlarge: r4Dot4xlarge = "r4.4xlarge".asInstanceOf[r4Dot4xlarge]
  
  @js.native
  sealed trait r4Dot8xlarge
    extends StObject
       with InstanceType
  inline def r4Dot8xlarge: r4Dot8xlarge = "r4.8xlarge".asInstanceOf[r4Dot8xlarge]
  
  @js.native
  sealed trait r4Dotlarge
    extends StObject
       with InstanceType
  inline def r4Dotlarge: r4Dotlarge = "r4.large".asInstanceOf[r4Dotlarge]
  
  @js.native
  sealed trait r4Dotxlarge
    extends StObject
       with InstanceType
  inline def r4Dotxlarge: r4Dotxlarge = "r4.xlarge".asInstanceOf[r4Dotxlarge]
  
  @js.native
  sealed trait r5Dot12xlarge
    extends StObject
       with InstanceType
  inline def r5Dot12xlarge: r5Dot12xlarge = "r5.12xlarge".asInstanceOf[r5Dot12xlarge]
  
  @js.native
  sealed trait r5Dot24xlarge
    extends StObject
       with InstanceType
  inline def r5Dot24xlarge: r5Dot24xlarge = "r5.24xlarge".asInstanceOf[r5Dot24xlarge]
  
  @js.native
  sealed trait r5Dot2xlarge
    extends StObject
       with InstanceType
  inline def r5Dot2xlarge: r5Dot2xlarge = "r5.2xlarge".asInstanceOf[r5Dot2xlarge]
  
  @js.native
  sealed trait r5Dot4xlarge
    extends StObject
       with InstanceType
  inline def r5Dot4xlarge: r5Dot4xlarge = "r5.4xlarge".asInstanceOf[r5Dot4xlarge]
  
  @js.native
  sealed trait r5Dotlarge
    extends StObject
       with InstanceType
  inline def r5Dotlarge: r5Dotlarge = "r5.large".asInstanceOf[r5Dotlarge]
  
  @js.native
  sealed trait r5Dotxlarge
    extends StObject
       with InstanceType
  inline def r5Dotxlarge: r5Dotxlarge = "r5.xlarge".asInstanceOf[r5Dotxlarge]
  
  @js.native
  sealed trait r5aDot12xlarge
    extends StObject
       with InstanceType
  inline def r5aDot12xlarge: r5aDot12xlarge = "r5a.12xlarge".asInstanceOf[r5aDot12xlarge]
  
  @js.native
  sealed trait r5aDot24xlarge
    extends StObject
       with InstanceType
  inline def r5aDot24xlarge: r5aDot24xlarge = "r5a.24xlarge".asInstanceOf[r5aDot24xlarge]
  
  @js.native
  sealed trait r5aDot2xlarge
    extends StObject
       with InstanceType
  inline def r5aDot2xlarge: r5aDot2xlarge = "r5a.2xlarge".asInstanceOf[r5aDot2xlarge]
  
  @js.native
  sealed trait r5aDot4xlarge
    extends StObject
       with InstanceType
  inline def r5aDot4xlarge: r5aDot4xlarge = "r5a.4xlarge".asInstanceOf[r5aDot4xlarge]
  
  @js.native
  sealed trait r5aDotlarge
    extends StObject
       with InstanceType
  inline def r5aDotlarge: r5aDotlarge = "r5a.large".asInstanceOf[r5aDotlarge]
  
  @js.native
  sealed trait r5aDotxlarge
    extends StObject
       with InstanceType
  inline def r5aDotxlarge: r5aDotxlarge = "r5a.xlarge".asInstanceOf[r5aDotxlarge]
  
  @js.native
  sealed trait r5dDot12xlarge
    extends StObject
       with InstanceType
  inline def r5dDot12xlarge: r5dDot12xlarge = "r5d.12xlarge".asInstanceOf[r5dDot12xlarge]
  
  @js.native
  sealed trait r5dDot24xlarge
    extends StObject
       with InstanceType
  inline def r5dDot24xlarge: r5dDot24xlarge = "r5d.24xlarge".asInstanceOf[r5dDot24xlarge]
  
  @js.native
  sealed trait r5dDot2xlarge
    extends StObject
       with InstanceType
  inline def r5dDot2xlarge: r5dDot2xlarge = "r5d.2xlarge".asInstanceOf[r5dDot2xlarge]
  
  @js.native
  sealed trait r5dDot4xlarge
    extends StObject
       with InstanceType
  inline def r5dDot4xlarge: r5dDot4xlarge = "r5d.4xlarge".asInstanceOf[r5dDot4xlarge]
  
  @js.native
  sealed trait r5dDotlarge
    extends StObject
       with InstanceType
  inline def r5dDotlarge: r5dDotlarge = "r5d.large".asInstanceOf[r5dDotlarge]
  
  @js.native
  sealed trait r5dDotxlarge
    extends StObject
       with InstanceType
  inline def r5dDotxlarge: r5dDotxlarge = "r5d.xlarge".asInstanceOf[r5dDotxlarge]
  
  @js.native
  sealed trait rss
    extends StObject
       with UlimitName
  inline def rss: rss = "rss".asInstanceOf[rss]
  
  @js.native
  sealed trait rtprio
    extends StObject
       with UlimitName
  inline def rtprio: rtprio = "rtprio".asInstanceOf[rtprio]
  
  @js.native
  sealed trait rttime
    extends StObject
       with UlimitName
  inline def rttime: rttime = "rttime".asInstanceOf[rttime]
  
  @js.native
  sealed trait ruby2Dot5
    extends StObject
       with Runtime
  inline def ruby2Dot5: ruby2Dot5 = "ruby2.5".asInstanceOf[ruby2Dot5]
  
  @js.native
  sealed trait ruby2Dot7
    extends StObject
       with Runtime
  inline def ruby2Dot7: ruby2Dot7 = "ruby2.7".asInstanceOf[ruby2Dot7]
  
  @js.native
  sealed trait `sa-east-1`
    extends StObject
       with Region
  inline def `sa-east-1`: `sa-east-1` = "sa-east-1".asInstanceOf[`sa-east-1`]
  
  @js.native
  sealed trait serverless
    extends StObject
       with EngineMode
  inline def serverless: serverless = "serverless".asInstanceOf[serverless]
  
  @js.native
  sealed trait sigpending
    extends StObject
       with UlimitName
  inline def sigpending: sigpending = "sigpending".asInstanceOf[sigpending]
  
  @js.native
  sealed trait sinceImagePushed extends StObject
  inline def sinceImagePushed: sinceImagePushed = "sinceImagePushed".asInstanceOf[sinceImagePushed]
  
  @js.native
  sealed trait splunk
    extends StObject
       with LogDriver
  inline def splunk: splunk = "splunk".asInstanceOf[splunk]
  
  @js.native
  sealed trait spread
    extends StObject
       with PlacementStrategy
  inline def spread: spread = "spread".asInstanceOf[spread]
  
  @js.native
  sealed trait stack
    extends StObject
       with UlimitName
  inline def stack: stack = "stack".asInstanceOf[stack]
  
  @js.native
  sealed trait standard
    extends StObject
       with StorageType
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait syslog_
    extends StObject
       with LogDriver
  inline def syslog_ : syslog_ = "syslog".asInstanceOf[syslog_]
  
  @js.native
  sealed trait t2Dot2xlarge
    extends StObject
       with InstanceType
  inline def t2Dot2xlarge: t2Dot2xlarge = "t2.2xlarge".asInstanceOf[t2Dot2xlarge]
  
  @js.native
  sealed trait t2Dotlarge
    extends StObject
       with InstanceType
  inline def t2Dotlarge: t2Dotlarge = "t2.large".asInstanceOf[t2Dotlarge]
  
  @js.native
  sealed trait t2Dotmedium
    extends StObject
       with InstanceType
  inline def t2Dotmedium: t2Dotmedium = "t2.medium".asInstanceOf[t2Dotmedium]
  
  @js.native
  sealed trait t2Dotmicro
    extends StObject
       with InstanceType
  inline def t2Dotmicro: t2Dotmicro = "t2.micro".asInstanceOf[t2Dotmicro]
  
  @js.native
  sealed trait t2Dotnano
    extends StObject
       with InstanceType
  inline def t2Dotnano: t2Dotnano = "t2.nano".asInstanceOf[t2Dotnano]
  
  @js.native
  sealed trait t2Dotsmall
    extends StObject
       with InstanceType
  inline def t2Dotsmall: t2Dotsmall = "t2.small".asInstanceOf[t2Dotsmall]
  
  @js.native
  sealed trait t2Dotxlarge
    extends StObject
       with InstanceType
  inline def t2Dotxlarge: t2Dotxlarge = "t2.xlarge".asInstanceOf[t2Dotxlarge]
  
  @js.native
  sealed trait t3Dot2xlarge
    extends StObject
       with InstanceType
  inline def t3Dot2xlarge: t3Dot2xlarge = "t3.2xlarge".asInstanceOf[t3Dot2xlarge]
  
  @js.native
  sealed trait t3Dotlarge
    extends StObject
       with InstanceType
  inline def t3Dotlarge: t3Dotlarge = "t3.large".asInstanceOf[t3Dotlarge]
  
  @js.native
  sealed trait t3Dotmedium
    extends StObject
       with InstanceType
  inline def t3Dotmedium: t3Dotmedium = "t3.medium".asInstanceOf[t3Dotmedium]
  
  @js.native
  sealed trait t3Dotmicro
    extends StObject
       with InstanceType
  inline def t3Dotmicro: t3Dotmicro = "t3.micro".asInstanceOf[t3Dotmicro]
  
  @js.native
  sealed trait t3Dotnano
    extends StObject
       with InstanceType
  inline def t3Dotnano: t3Dotnano = "t3.nano".asInstanceOf[t3Dotnano]
  
  @js.native
  sealed trait t3Dotsmall
    extends StObject
       with InstanceType
  inline def t3Dotsmall: t3Dotsmall = "t3.small".asInstanceOf[t3Dotsmall]
  
  @js.native
  sealed trait t3Dotxlarge
    extends StObject
       with InstanceType
  inline def t3Dotxlarge: t3Dotxlarge = "t3.xlarge".asInstanceOf[t3Dotxlarge]
  
  @js.native
  sealed trait t3aDot2xlarge
    extends StObject
       with InstanceType
  inline def t3aDot2xlarge: t3aDot2xlarge = "t3a.2xlarge".asInstanceOf[t3aDot2xlarge]
  
  @js.native
  sealed trait t3aDotlarge
    extends StObject
       with InstanceType
  inline def t3aDotlarge: t3aDotlarge = "t3a.large".asInstanceOf[t3aDotlarge]
  
  @js.native
  sealed trait t3aDotmedium
    extends StObject
       with InstanceType
  inline def t3aDotmedium: t3aDotmedium = "t3a.medium".asInstanceOf[t3aDotmedium]
  
  @js.native
  sealed trait t3aDotmicro
    extends StObject
       with InstanceType
  inline def t3aDotmicro: t3aDotmicro = "t3a.micro".asInstanceOf[t3aDotmicro]
  
  @js.native
  sealed trait t3aDotnano
    extends StObject
       with InstanceType
  inline def t3aDotnano: t3aDotnano = "t3a.nano".asInstanceOf[t3aDotnano]
  
  @js.native
  sealed trait t3aDotsmall
    extends StObject
       with InstanceType
  inline def t3aDotsmall: t3aDotsmall = "t3a.small".asInstanceOf[t3aDotsmall]
  
  @js.native
  sealed trait t3aDotxlarge
    extends StObject
       with InstanceType
  inline def t3aDotxlarge: t3aDotxlarge = "t3a.xlarge".asInstanceOf[t3aDotxlarge]
  
  @js.native
  sealed trait tagged extends StObject
  inline def tagged: tagged = "tagged".asInstanceOf[tagged]
  
  @js.native
  sealed trait tcp
    extends StObject
       with Protocol
       with ProtocolType
  inline def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @js.native
  sealed trait `u-12tb1Dotmetal`
    extends StObject
       with InstanceType
  inline def `u-12tb1Dotmetal`: `u-12tb1Dotmetal` = "u-12tb1.metal".asInstanceOf[`u-12tb1Dotmetal`]
  
  @js.native
  sealed trait `u-6tb1Dotmetal`
    extends StObject
       with InstanceType
  inline def `u-6tb1Dotmetal`: `u-6tb1Dotmetal` = "u-6tb1.metal".asInstanceOf[`u-6tb1Dotmetal`]
  
  @js.native
  sealed trait `u-9tb1Dotmetal`
    extends StObject
       with InstanceType
  inline def `u-9tb1Dotmetal`: `u-9tb1Dotmetal` = "u-9tb1.metal".asInstanceOf[`u-9tb1Dotmetal`]
  
  @js.native
  sealed trait udp
    extends StObject
       with Protocol
       with ProtocolType
  inline def udp: udp = "udp".asInstanceOf[udp]
  
  @js.native
  sealed trait untagged extends StObject
  inline def untagged: untagged = "untagged".asInstanceOf[untagged]
  
  @js.native
  sealed trait `us-east-1`
    extends StObject
       with Region
  inline def `us-east-1`: `us-east-1` = "us-east-1".asInstanceOf[`us-east-1`]
  
  @js.native
  sealed trait `us-east-2`
    extends StObject
       with Region
  inline def `us-east-2`: `us-east-2` = "us-east-2".asInstanceOf[`us-east-2`]
  
  @js.native
  sealed trait `us-gov-east-1`
    extends StObject
       with Region
  inline def `us-gov-east-1`: `us-gov-east-1` = "us-gov-east-1".asInstanceOf[`us-gov-east-1`]
  
  @js.native
  sealed trait `us-gov-west-1`
    extends StObject
       with Region
  inline def `us-gov-west-1`: `us-gov-west-1` = "us-gov-west-1".asInstanceOf[`us-gov-west-1`]
  
  @js.native
  sealed trait `us-west-1`
    extends StObject
       with Region
  inline def `us-west-1`: `us-west-1` = "us-west-1".asInstanceOf[`us-west-1`]
  
  @js.native
  sealed trait `us-west-2`
    extends StObject
       with Region
  inline def `us-west-2`: `us-west-2` = "us-west-2".asInstanceOf[`us-west-2`]
  
  @js.native
  sealed trait x1Dot16xlarge
    extends StObject
       with InstanceType
  inline def x1Dot16xlarge: x1Dot16xlarge = "x1.16xlarge".asInstanceOf[x1Dot16xlarge]
  
  @js.native
  sealed trait x1Dot32xlarge
    extends StObject
       with InstanceType
  inline def x1Dot32xlarge: x1Dot32xlarge = "x1.32xlarge".asInstanceOf[x1Dot32xlarge]
  
  @js.native
  sealed trait x1eDot16xlarge
    extends StObject
       with InstanceType
  inline def x1eDot16xlarge: x1eDot16xlarge = "x1e.16xlarge".asInstanceOf[x1eDot16xlarge]
  
  @js.native
  sealed trait x1eDot2xlarge
    extends StObject
       with InstanceType
  inline def x1eDot2xlarge: x1eDot2xlarge = "x1e.2xlarge".asInstanceOf[x1eDot2xlarge]
  
  @js.native
  sealed trait x1eDot32xlarge
    extends StObject
       with InstanceType
  inline def x1eDot32xlarge: x1eDot32xlarge = "x1e.32xlarge".asInstanceOf[x1eDot32xlarge]
  
  @js.native
  sealed trait x1eDot4xlarge
    extends StObject
       with InstanceType
  inline def x1eDot4xlarge: x1eDot4xlarge = "x1e.4xlarge".asInstanceOf[x1eDot4xlarge]
  
  @js.native
  sealed trait x1eDot8xlarge
    extends StObject
       with InstanceType
  inline def x1eDot8xlarge: x1eDot8xlarge = "x1e.8xlarge".asInstanceOf[x1eDot8xlarge]
  
  @js.native
  sealed trait x1eDotxlarge
    extends StObject
       with InstanceType
  inline def x1eDotxlarge: x1eDotxlarge = "x1e.xlarge".asInstanceOf[x1eDotxlarge]
  
  @js.native
  sealed trait z1dDot12xlarge
    extends StObject
       with InstanceType
  inline def z1dDot12xlarge: z1dDot12xlarge = "z1d.12xlarge".asInstanceOf[z1dDot12xlarge]
  
  @js.native
  sealed trait z1dDot2xlarge
    extends StObject
       with InstanceType
  inline def z1dDot2xlarge: z1dDot2xlarge = "z1d.2xlarge".asInstanceOf[z1dDot2xlarge]
  
  @js.native
  sealed trait z1dDot3xlarge
    extends StObject
       with InstanceType
  inline def z1dDot3xlarge: z1dDot3xlarge = "z1d.3xlarge".asInstanceOf[z1dDot3xlarge]
  
  @js.native
  sealed trait z1dDot6xlarge
    extends StObject
       with InstanceType
  inline def z1dDot6xlarge: z1dDot6xlarge = "z1d.6xlarge".asInstanceOf[z1dDot6xlarge]
  
  @js.native
  sealed trait z1dDotlarge
    extends StObject
       with InstanceType
  inline def z1dDotlarge: z1dDotlarge = "z1d.large".asInstanceOf[z1dDotlarge]
  
  @js.native
  sealed trait z1dDotxlarge
    extends StObject
       with InstanceType
  inline def z1dDotxlarge: z1dDotxlarge = "z1d.xlarge".asInstanceOf[z1dDotxlarge]
}
