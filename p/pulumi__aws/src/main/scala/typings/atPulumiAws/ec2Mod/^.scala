package typings.atPulumiAws.ec2Mod

import typings.atPulumiAws.ec2GetCustomerGatewayMod.GetCustomerGatewayArgs
import typings.atPulumiAws.ec2GetCustomerGatewayMod.GetCustomerGatewayResult
import typings.atPulumiAws.ec2GetInstanceMod.GetInstanceArgs
import typings.atPulumiAws.ec2GetInstanceMod.GetInstanceResult
import typings.atPulumiAws.ec2GetInstancesMod.GetInstancesArgs
import typings.atPulumiAws.ec2GetInstancesMod.GetInstancesResult
import typings.atPulumiAws.ec2GetInternetGatewayMod.GetInternetGatewayArgs
import typings.atPulumiAws.ec2GetInternetGatewayMod.GetInternetGatewayResult
import typings.atPulumiAws.ec2GetLaunchConfigurationMod.GetLaunchConfigurationArgs
import typings.atPulumiAws.ec2GetLaunchConfigurationMod.GetLaunchConfigurationResult
import typings.atPulumiAws.ec2GetLaunchTemplateMod.GetLaunchTemplateArgs
import typings.atPulumiAws.ec2GetLaunchTemplateMod.GetLaunchTemplateResult
import typings.atPulumiAws.ec2GetNatGatewayMod.GetNatGatewayArgs
import typings.atPulumiAws.ec2GetNatGatewayMod.GetNatGatewayResult
import typings.atPulumiAws.ec2GetNetworkAclsMod.GetNetworkAclsArgs
import typings.atPulumiAws.ec2GetNetworkAclsMod.GetNetworkAclsResult
import typings.atPulumiAws.ec2GetNetworkInterfaceMod.GetNetworkInterfaceArgs
import typings.atPulumiAws.ec2GetNetworkInterfaceMod.GetNetworkInterfaceResult
import typings.atPulumiAws.ec2GetNetworkInterfacesMod.GetNetworkInterfacesArgs
import typings.atPulumiAws.ec2GetNetworkInterfacesMod.GetNetworkInterfacesResult
import typings.atPulumiAws.ec2GetRouteMod.GetRouteArgs
import typings.atPulumiAws.ec2GetRouteMod.GetRouteResult
import typings.atPulumiAws.ec2GetRouteTableMod.GetRouteTableArgs
import typings.atPulumiAws.ec2GetRouteTableMod.GetRouteTableResult
import typings.atPulumiAws.ec2GetRouteTablesMod.GetRouteTablesArgs
import typings.atPulumiAws.ec2GetRouteTablesMod.GetRouteTablesResult
import typings.atPulumiAws.ec2GetSecurityGroupMod.GetSecurityGroupArgs
import typings.atPulumiAws.ec2GetSecurityGroupMod.GetSecurityGroupResult
import typings.atPulumiAws.ec2GetSecurityGroupsMod.GetSecurityGroupsArgs
import typings.atPulumiAws.ec2GetSecurityGroupsMod.GetSecurityGroupsResult
import typings.atPulumiAws.ec2GetSubnetIdsMod.GetSubnetIdsArgs
import typings.atPulumiAws.ec2GetSubnetIdsMod.GetSubnetIdsResult
import typings.atPulumiAws.ec2GetSubnetMod.GetSubnetArgs
import typings.atPulumiAws.ec2GetSubnetMod.GetSubnetResult
import typings.atPulumiAws.ec2GetVpcDhcpOptionsMod.GetVpcDhcpOptionsArgs
import typings.atPulumiAws.ec2GetVpcDhcpOptionsMod.GetVpcDhcpOptionsResult
import typings.atPulumiAws.ec2GetVpcEndpointMod.GetVpcEndpointArgs
import typings.atPulumiAws.ec2GetVpcEndpointMod.GetVpcEndpointResult
import typings.atPulumiAws.ec2GetVpcEndpointServiceMod.GetVpcEndpointServiceArgs
import typings.atPulumiAws.ec2GetVpcEndpointServiceMod.GetVpcEndpointServiceResult
import typings.atPulumiAws.ec2GetVpcMod.GetVpcArgs
import typings.atPulumiAws.ec2GetVpcMod.GetVpcResult
import typings.atPulumiAws.ec2GetVpcPeeringConnectionMod.GetVpcPeeringConnectionArgs
import typings.atPulumiAws.ec2GetVpcPeeringConnectionMod.GetVpcPeeringConnectionResult
import typings.atPulumiAws.ec2GetVpcsMod.GetVpcsArgs
import typings.atPulumiAws.ec2GetVpcsMod.GetVpcsResult
import typings.atPulumiAws.ec2GetVpnGatewayMod.GetVpnGatewayArgs
import typings.atPulumiAws.ec2GetVpnGatewayMod.GetVpnGatewayResult
import typings.atPulumiAws.ec2InstancePlatformMod.InstancePlatform
import typings.atPulumiAws.ec2InstanceTypeMod.InstanceType
import typings.atPulumiAws.ec2PlacementStrategyMod.PlacementStrategy
import typings.atPulumiAws.ec2ProtocolTypeMod.ProtocolType
import typings.atPulumiAws.ec2TenancyMod.Tenancy
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val A1Instance2XLarge: InstanceType = js.native
  val A1Instance4XLarge: InstanceType = js.native
  val A1InstanceLarge: InstanceType = js.native
  val A1InstanceMedium: InstanceType = js.native
  val A1InstanceXLarge: InstanceType = js.native
  val AllProtocols: ProtocolType = js.native
  val C3Instance2XLarge: InstanceType = js.native
  val C3Instance4XLarge: InstanceType = js.native
  val C3Instance8XLarge: InstanceType = js.native
  val C3InstanceLarge: InstanceType = js.native
  val C3InstanceXLarge: InstanceType = js.native
  val C4Instance2XLarge: InstanceType = js.native
  val C4Instance4XLarge: InstanceType = js.native
  val C4Instance8XLarge: InstanceType = js.native
  val C4InstanceLarge: InstanceType = js.native
  val C4InstanceXLarge: InstanceType = js.native
  val C5Instance18XLarge: InstanceType = js.native
  val C5Instance2XLarge: InstanceType = js.native
  val C5Instance4XLarge: InstanceType = js.native
  val C5Instance9XLarge: InstanceType = js.native
  val C5InstanceLarge: InstanceType = js.native
  val C5InstanceXLarge: InstanceType = js.native
  val C5dInstance18XLarge: InstanceType = js.native
  val C5dInstance2XLarge: InstanceType = js.native
  val C5dInstance4XLarge: InstanceType = js.native
  val C5dInstance9XLarge: InstanceType = js.native
  val C5dInstanceLarge: InstanceType = js.native
  val C5dInstanceXLarge: InstanceType = js.native
  val C5nInstance18XLarge: InstanceType = js.native
  val C5nInstance2XLarge: InstanceType = js.native
  val C5nInstance4XLarge: InstanceType = js.native
  val C5nInstance9XLarge: InstanceType = js.native
  val C5nInstanceLarge: InstanceType = js.native
  val C5nInstanceXLarge: InstanceType = js.native
  var ClusterStrategy: PlacementStrategy = js.native
  val D2Instance2XLarge: InstanceType = js.native
  val D2Instance4XLarge: InstanceType = js.native
  val D2Instance8XLarge: InstanceType = js.native
  val D2InstanceXLarge: InstanceType = js.native
  val DedicatedTenancy: Tenancy = js.native
  val DefaultTenancy: Tenancy = js.native
  val F1Instance16XLarge: InstanceType = js.native
  val F1Instance2XLarge: InstanceType = js.native
  val G2Instance2XLarge: InstanceType = js.native
  val G2Instance8XLarge: InstanceType = js.native
  val G3Instance16XLarge: InstanceType = js.native
  val G3Instance4XLarge: InstanceType = js.native
  val G3Instance8XLarge: InstanceType = js.native
  val G3sInstanceXLarge: InstanceType = js.native
  val H1Instance16XLarge: InstanceType = js.native
  val H1Instance2XLarge: InstanceType = js.native
  val H1Instance4XLarge: InstanceType = js.native
  val H1Instance8XLarge: InstanceType = js.native
  val Hs1Instance8XLarge: InstanceType = js.native
  val I3Instance16XLarge: InstanceType = js.native
  val I3Instance2XLarge: InstanceType = js.native
  val I3Instance4XLarge: InstanceType = js.native
  val I3Instance8XLarge: InstanceType = js.native
  val I3InstanceLarge: InstanceType = js.native
  val I3InstanceMetal: InstanceType = js.native
  val I3InstanceXLarge: InstanceType = js.native
  val ICMPProtocol: ProtocolType = js.native
  val LinuxUnixPlatform: InstancePlatform = js.native
  val M3Instance2XLarge: InstanceType = js.native
  val M3InstanceLarge: InstanceType = js.native
  val M3InstanceMedium: InstanceType = js.native
  val M3InstanceXLarge: InstanceType = js.native
  val M4Instance10XLarge: InstanceType = js.native
  val M4Instance16XLarge: InstanceType = js.native
  val M4Instance2XLarge: InstanceType = js.native
  val M4Instance4XLarge: InstanceType = js.native
  val M4InstanceLarge: InstanceType = js.native
  val M4InstanceXLarge: InstanceType = js.native
  val M5Instance12XLarge: InstanceType = js.native
  val M5Instance24XLarge: InstanceType = js.native
  val M5Instance2XLarge: InstanceType = js.native
  val M5Instance4XLarge: InstanceType = js.native
  val M5InstanceLarge: InstanceType = js.native
  val M5InstanceXLarge: InstanceType = js.native
  val M5aInstance12XLarge: InstanceType = js.native
  val M5aInstance24XLarge: InstanceType = js.native
  val M5aInstance2XLarge: InstanceType = js.native
  val M5aInstance4XLarge: InstanceType = js.native
  val M5aInstanceLarge: InstanceType = js.native
  val M5aInstanceXLarge: InstanceType = js.native
  val M5dInstance12XLarge: InstanceType = js.native
  val M5dInstance24XLarge: InstanceType = js.native
  val M5dInstance2XLarge: InstanceType = js.native
  val M5dInstance4XLarge: InstanceType = js.native
  val M5dInstanceLarge: InstanceType = js.native
  val M5dInstanceXLarge: InstanceType = js.native
  val P2Instance16XLarge: InstanceType = js.native
  val P2Instance8XLarge: InstanceType = js.native
  val P2InstanceXLarge: InstanceType = js.native
  val P3Instance16XLarge: InstanceType = js.native
  val P3Instance2XLarge: InstanceType = js.native
  val P3Instance8XLarge: InstanceType = js.native
  val P3dnInstance24XLarge: InstanceType = js.native
  val R3Instance2XLarge: InstanceType = js.native
  val R3Instance4XLarge: InstanceType = js.native
  val R3Instance8XLarge: InstanceType = js.native
  val R3InstanceLarge: InstanceType = js.native
  val R3InstanceXLarge: InstanceType = js.native
  val R4Instance16XLarge: InstanceType = js.native
  val R4Instance2XLarge: InstanceType = js.native
  val R4Instance4XLarge: InstanceType = js.native
  val R4Instance8XLarge: InstanceType = js.native
  val R4InstanceLarge: InstanceType = js.native
  val R4InstanceXLarge: InstanceType = js.native
  val R5Instance12XLarge: InstanceType = js.native
  val R5Instance24XLarge: InstanceType = js.native
  val R5Instance2XLarge: InstanceType = js.native
  val R5Instance4XLarge: InstanceType = js.native
  val R5InstanceLarge: InstanceType = js.native
  val R5InstanceXLarge: InstanceType = js.native
  val R5aInstance12XLarge: InstanceType = js.native
  val R5aInstance24XLarge: InstanceType = js.native
  val R5aInstance2XLarge: InstanceType = js.native
  val R5aInstance4XLarge: InstanceType = js.native
  val R5aInstanceLarge: InstanceType = js.native
  val R5aInstanceXLarge: InstanceType = js.native
  val R5dInstance12XLarge: InstanceType = js.native
  val R5dInstance24XLarge: InstanceType = js.native
  val R5dInstance2XLarge: InstanceType = js.native
  val R5dInstance4XLarge: InstanceType = js.native
  val R5dInstanceLarge: InstanceType = js.native
  val R5dInstanceXLarge: InstanceType = js.native
  val RedHatEnterpriseLinuxPlatform: InstancePlatform = js.native
  var SpreadStrategy: PlacementStrategy = js.native
  val SuseLinuxPlatform: InstancePlatform = js.native
  val T2Instance2XLarge: InstanceType = js.native
  val T2InstanceLarge: InstanceType = js.native
  val T2InstanceMedium: InstanceType = js.native
  val T2InstanceMicro: InstanceType = js.native
  val T2InstanceNano: InstanceType = js.native
  val T2InstanceSmall: InstanceType = js.native
  val T2InstanceXLarge: InstanceType = js.native
  val T3Instance2XLarge: InstanceType = js.native
  val T3InstanceLarge: InstanceType = js.native
  val T3InstanceMedium: InstanceType = js.native
  val T3InstanceMicro: InstanceType = js.native
  val T3InstanceNano: InstanceType = js.native
  val T3InstanceSmall: InstanceType = js.native
  val T3InstanceXLarge: InstanceType = js.native
  val TCPProtocol: ProtocolType = js.native
  val UDPProtocol: ProtocolType = js.native
  val UInstance12tb1Metal: InstanceType = js.native
  val UInstance6tb1Metal: InstanceType = js.native
  val UInstance9tb1Metal: InstanceType = js.native
  val WindowsPlatform: InstancePlatform = js.native
  val WindowsWithSqlServerEnterprisePlatform: InstancePlatform = js.native
  val WindowsWithSqlServerPlatform: InstancePlatform = js.native
  val WindowsWithSqlServerStandardPlatform: InstancePlatform = js.native
  val WindowsWithSqlServerWebPlatform: InstancePlatform = js.native
  val X1Instance16XLarge: InstanceType = js.native
  val X1Instance32XLarge: InstanceType = js.native
  val X1eInstance16XLarge: InstanceType = js.native
  val X1eInstance2XLarge: InstanceType = js.native
  val X1eInstance32XLarge: InstanceType = js.native
  val X1eInstance4XLarge: InstanceType = js.native
  val X1eInstance8XLarge: InstanceType = js.native
  val X1eInstanceXLarge: InstanceType = js.native
  val Z1dInstance12XLarge: InstanceType = js.native
  val Z1dInstance2XLarge: InstanceType = js.native
  val Z1dInstance3XLarge: InstanceType = js.native
  val Z1dInstance6XLarge: InstanceType = js.native
  val Z1dInstanceLarge: InstanceType = js.native
  val Z1dInstanceXLarge: InstanceType = js.native
  def getCustomerGateway(): js.Promise[GetCustomerGatewayResult] with GetCustomerGatewayResult = js.native
  def getCustomerGateway(args: GetCustomerGatewayArgs): js.Promise[GetCustomerGatewayResult] with GetCustomerGatewayResult = js.native
  def getCustomerGateway(args: GetCustomerGatewayArgs, opts: InvokeOptions): js.Promise[GetCustomerGatewayResult] with GetCustomerGatewayResult = js.native
  def getInstance(): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def getInstance(args: GetInstanceArgs): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def getInstance(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def getInstances(): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
  def getInstances(args: GetInstancesArgs): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
  def getInstances(args: GetInstancesArgs, opts: InvokeOptions): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
  def getInternetGateway(): js.Promise[GetInternetGatewayResult] with GetInternetGatewayResult = js.native
  def getInternetGateway(args: GetInternetGatewayArgs): js.Promise[GetInternetGatewayResult] with GetInternetGatewayResult = js.native
  def getInternetGateway(args: GetInternetGatewayArgs, opts: InvokeOptions): js.Promise[GetInternetGatewayResult] with GetInternetGatewayResult = js.native
  def getLaunchConfiguration(args: GetLaunchConfigurationArgs): js.Promise[GetLaunchConfigurationResult] with GetLaunchConfigurationResult = js.native
  def getLaunchConfiguration(args: GetLaunchConfigurationArgs, opts: InvokeOptions): js.Promise[GetLaunchConfigurationResult] with GetLaunchConfigurationResult = js.native
  def getLaunchTemplate(args: GetLaunchTemplateArgs): js.Promise[GetLaunchTemplateResult] with GetLaunchTemplateResult = js.native
  def getLaunchTemplate(args: GetLaunchTemplateArgs, opts: InvokeOptions): js.Promise[GetLaunchTemplateResult] with GetLaunchTemplateResult = js.native
  def getNatGateway(): js.Promise[GetNatGatewayResult] with GetNatGatewayResult = js.native
  def getNatGateway(args: GetNatGatewayArgs): js.Promise[GetNatGatewayResult] with GetNatGatewayResult = js.native
  def getNatGateway(args: GetNatGatewayArgs, opts: InvokeOptions): js.Promise[GetNatGatewayResult] with GetNatGatewayResult = js.native
  def getNetworkAcls(): js.Promise[GetNetworkAclsResult] with GetNetworkAclsResult = js.native
  def getNetworkAcls(args: GetNetworkAclsArgs): js.Promise[GetNetworkAclsResult] with GetNetworkAclsResult = js.native
  def getNetworkAcls(args: GetNetworkAclsArgs, opts: InvokeOptions): js.Promise[GetNetworkAclsResult] with GetNetworkAclsResult = js.native
  def getNetworkInterface(): js.Promise[GetNetworkInterfaceResult] with GetNetworkInterfaceResult = js.native
  def getNetworkInterface(args: GetNetworkInterfaceArgs): js.Promise[GetNetworkInterfaceResult] with GetNetworkInterfaceResult = js.native
  def getNetworkInterface(args: GetNetworkInterfaceArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfaceResult] with GetNetworkInterfaceResult = js.native
  def getNetworkInterfaces(): js.Promise[GetNetworkInterfacesResult] with GetNetworkInterfacesResult = js.native
  def getNetworkInterfaces(args: GetNetworkInterfacesArgs): js.Promise[GetNetworkInterfacesResult] with GetNetworkInterfacesResult = js.native
  def getNetworkInterfaces(args: GetNetworkInterfacesArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfacesResult] with GetNetworkInterfacesResult = js.native
  def getRoute(args: GetRouteArgs): js.Promise[GetRouteResult] with GetRouteResult = js.native
  def getRoute(args: GetRouteArgs, opts: InvokeOptions): js.Promise[GetRouteResult] with GetRouteResult = js.native
  def getRouteTable(): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] with GetRouteTableResult = js.native
  def getRouteTables(): js.Promise[GetRouteTablesResult] with GetRouteTablesResult = js.native
  def getRouteTables(args: GetRouteTablesArgs): js.Promise[GetRouteTablesResult] with GetRouteTablesResult = js.native
  def getRouteTables(args: GetRouteTablesArgs, opts: InvokeOptions): js.Promise[GetRouteTablesResult] with GetRouteTablesResult = js.native
  def getSecurityGroup(): js.Promise[GetSecurityGroupResult] with GetSecurityGroupResult = js.native
  def getSecurityGroup(args: GetSecurityGroupArgs): js.Promise[GetSecurityGroupResult] with GetSecurityGroupResult = js.native
  def getSecurityGroup(args: GetSecurityGroupArgs, opts: InvokeOptions): js.Promise[GetSecurityGroupResult] with GetSecurityGroupResult = js.native
  def getSecurityGroups(): js.Promise[GetSecurityGroupsResult] with GetSecurityGroupsResult = js.native
  def getSecurityGroups(args: GetSecurityGroupsArgs): js.Promise[GetSecurityGroupsResult] with GetSecurityGroupsResult = js.native
  def getSecurityGroups(args: GetSecurityGroupsArgs, opts: InvokeOptions): js.Promise[GetSecurityGroupsResult] with GetSecurityGroupsResult = js.native
  def getSubnet(): js.Promise[GetSubnetResult] with GetSubnetResult = js.native
  def getSubnet(args: GetSubnetArgs): js.Promise[GetSubnetResult] with GetSubnetResult = js.native
  def getSubnet(args: GetSubnetArgs, opts: InvokeOptions): js.Promise[GetSubnetResult] with GetSubnetResult = js.native
  def getSubnetIds(args: GetSubnetIdsArgs): js.Promise[GetSubnetIdsResult] with GetSubnetIdsResult = js.native
  def getSubnetIds(args: GetSubnetIdsArgs, opts: InvokeOptions): js.Promise[GetSubnetIdsResult] with GetSubnetIdsResult = js.native
  def getVpc(): js.Promise[GetVpcResult] with GetVpcResult = js.native
  def getVpc(args: GetVpcArgs): js.Promise[GetVpcResult] with GetVpcResult = js.native
  def getVpc(args: GetVpcArgs, opts: InvokeOptions): js.Promise[GetVpcResult] with GetVpcResult = js.native
  def getVpcDhcpOptions(): js.Promise[GetVpcDhcpOptionsResult] with GetVpcDhcpOptionsResult = js.native
  def getVpcDhcpOptions(args: GetVpcDhcpOptionsArgs): js.Promise[GetVpcDhcpOptionsResult] with GetVpcDhcpOptionsResult = js.native
  def getVpcDhcpOptions(args: GetVpcDhcpOptionsArgs, opts: InvokeOptions): js.Promise[GetVpcDhcpOptionsResult] with GetVpcDhcpOptionsResult = js.native
  def getVpcEndpoint(): js.Promise[GetVpcEndpointResult] with GetVpcEndpointResult = js.native
  def getVpcEndpoint(args: GetVpcEndpointArgs): js.Promise[GetVpcEndpointResult] with GetVpcEndpointResult = js.native
  def getVpcEndpoint(args: GetVpcEndpointArgs, opts: InvokeOptions): js.Promise[GetVpcEndpointResult] with GetVpcEndpointResult = js.native
  def getVpcEndpointService(): js.Promise[GetVpcEndpointServiceResult] with GetVpcEndpointServiceResult = js.native
  def getVpcEndpointService(args: GetVpcEndpointServiceArgs): js.Promise[GetVpcEndpointServiceResult] with GetVpcEndpointServiceResult = js.native
  def getVpcEndpointService(args: GetVpcEndpointServiceArgs, opts: InvokeOptions): js.Promise[GetVpcEndpointServiceResult] with GetVpcEndpointServiceResult = js.native
  def getVpcPeeringConnection(): js.Promise[GetVpcPeeringConnectionResult] with GetVpcPeeringConnectionResult = js.native
  def getVpcPeeringConnection(args: GetVpcPeeringConnectionArgs): js.Promise[GetVpcPeeringConnectionResult] with GetVpcPeeringConnectionResult = js.native
  def getVpcPeeringConnection(args: GetVpcPeeringConnectionArgs, opts: InvokeOptions): js.Promise[GetVpcPeeringConnectionResult] with GetVpcPeeringConnectionResult = js.native
  def getVpcs(): js.Promise[GetVpcsResult] with GetVpcsResult = js.native
  def getVpcs(args: GetVpcsArgs): js.Promise[GetVpcsResult] with GetVpcsResult = js.native
  def getVpcs(args: GetVpcsArgs, opts: InvokeOptions): js.Promise[GetVpcsResult] with GetVpcsResult = js.native
  def getVpnGateway(): js.Promise[GetVpnGatewayResult] with GetVpnGatewayResult = js.native
  def getVpnGateway(args: GetVpnGatewayArgs): js.Promise[GetVpnGatewayResult] with GetVpnGatewayResult = js.native
  def getVpnGateway(args: GetVpnGatewayArgs, opts: InvokeOptions): js.Promise[GetVpnGatewayResult] with GetVpnGatewayResult = js.native
}

