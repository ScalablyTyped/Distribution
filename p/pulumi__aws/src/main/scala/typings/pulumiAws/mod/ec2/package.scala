package typings.pulumiAws.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ec2 {
  
  @scala.inline
  def AllProtocols: typings.pulumiAws.enumsEc2Mod.ProtocolType = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("AllProtocols").asInstanceOf[typings.pulumiAws.enumsEc2Mod.ProtocolType]
  
  @scala.inline
  def ClusterStrategy: typings.pulumiAws.enumsEc2Mod.PlacementStrategy = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("ClusterStrategy").asInstanceOf[typings.pulumiAws.enumsEc2Mod.PlacementStrategy]
  @scala.inline
  def ClusterStrategy_=(x: typings.pulumiAws.enumsEc2Mod.PlacementStrategy): scala.Unit = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].updateDynamic("ClusterStrategy")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def DedicatedTenancy: typings.pulumiAws.enumsEc2Mod.Tenancy = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("DedicatedTenancy").asInstanceOf[typings.pulumiAws.enumsEc2Mod.Tenancy]
  
  @scala.inline
  def DefaultTenancy: typings.pulumiAws.enumsEc2Mod.Tenancy = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("DefaultTenancy").asInstanceOf[typings.pulumiAws.enumsEc2Mod.Tenancy]
  
  @scala.inline
  def ICMPProtocol: typings.pulumiAws.enumsEc2Mod.ProtocolType = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("ICMPProtocol").asInstanceOf[typings.pulumiAws.enumsEc2Mod.ProtocolType]
  
  @scala.inline
  def LinuxUnixPlatform: typings.pulumiAws.enumsEc2Mod.InstancePlatform = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("LinuxUnixPlatform").asInstanceOf[typings.pulumiAws.enumsEc2Mod.InstancePlatform]
  
  @scala.inline
  def RedHatEnterpriseLinuxPlatform: typings.pulumiAws.enumsEc2Mod.InstancePlatform = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("RedHatEnterpriseLinuxPlatform").asInstanceOf[typings.pulumiAws.enumsEc2Mod.InstancePlatform]
  
  @scala.inline
  def SpreadStrategy: typings.pulumiAws.enumsEc2Mod.PlacementStrategy = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("SpreadStrategy").asInstanceOf[typings.pulumiAws.enumsEc2Mod.PlacementStrategy]
  @scala.inline
  def SpreadStrategy_=(x: typings.pulumiAws.enumsEc2Mod.PlacementStrategy): scala.Unit = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].updateDynamic("SpreadStrategy")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def SuseLinuxPlatform: typings.pulumiAws.enumsEc2Mod.InstancePlatform = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("SuseLinuxPlatform").asInstanceOf[typings.pulumiAws.enumsEc2Mod.InstancePlatform]
  
  @scala.inline
  def TCPProtocol: typings.pulumiAws.enumsEc2Mod.ProtocolType = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("TCPProtocol").asInstanceOf[typings.pulumiAws.enumsEc2Mod.ProtocolType]
  
  @scala.inline
  def UDPProtocol: typings.pulumiAws.enumsEc2Mod.ProtocolType = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("UDPProtocol").asInstanceOf[typings.pulumiAws.enumsEc2Mod.ProtocolType]
  
  @scala.inline
  def WindowsPlatform: typings.pulumiAws.enumsEc2Mod.InstancePlatform = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("WindowsPlatform").asInstanceOf[typings.pulumiAws.enumsEc2Mod.InstancePlatform]
  
  @scala.inline
  def WindowsWithSqlServerEnterprisePlatform: typings.pulumiAws.enumsEc2Mod.InstancePlatform = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("WindowsWithSqlServerEnterprisePlatform").asInstanceOf[typings.pulumiAws.enumsEc2Mod.InstancePlatform]
  
  @scala.inline
  def WindowsWithSqlServerPlatform: typings.pulumiAws.enumsEc2Mod.InstancePlatform = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("WindowsWithSqlServerPlatform").asInstanceOf[typings.pulumiAws.enumsEc2Mod.InstancePlatform]
  
  @scala.inline
  def WindowsWithSqlServerStandardPlatform: typings.pulumiAws.enumsEc2Mod.InstancePlatform = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("WindowsWithSqlServerStandardPlatform").asInstanceOf[typings.pulumiAws.enumsEc2Mod.InstancePlatform]
  
  @scala.inline
  def WindowsWithSqlServerWebPlatform: typings.pulumiAws.enumsEc2Mod.InstancePlatform = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].selectDynamic("WindowsWithSqlServerWebPlatform").asInstanceOf[typings.pulumiAws.enumsEc2Mod.InstancePlatform]
  
  @scala.inline
  def getCoipPool(): js.Promise[typings.pulumiAws.getCoipPoolMod.GetCoipPoolResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPool")().asInstanceOf[js.Promise[typings.pulumiAws.getCoipPoolMod.GetCoipPoolResult]]
  @scala.inline
  def getCoipPool(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getCoipPoolMod.GetCoipPoolResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPool")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getCoipPoolMod.GetCoipPoolResult]]
  @scala.inline
  def getCoipPool(args: typings.pulumiAws.getCoipPoolMod.GetCoipPoolArgs): js.Promise[typings.pulumiAws.getCoipPoolMod.GetCoipPoolResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPool")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getCoipPoolMod.GetCoipPoolResult]]
  @scala.inline
  def getCoipPool(
    args: typings.pulumiAws.getCoipPoolMod.GetCoipPoolArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getCoipPoolMod.GetCoipPoolResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPool")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getCoipPoolMod.GetCoipPoolResult]]
  
  @scala.inline
  def getCoipPools(): js.Promise[typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPools")().asInstanceOf[js.Promise[typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsResult]]
  @scala.inline
  def getCoipPools(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPools")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsResult]]
  @scala.inline
  def getCoipPools(args: typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsArgs): js.Promise[typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPools")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsResult]]
  @scala.inline
  def getCoipPools(
    args: typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCoipPools")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsResult]]
  
  @scala.inline
  def getCustomerGateway(): js.Promise[typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCustomerGateway")().asInstanceOf[js.Promise[typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayResult]]
  @scala.inline
  def getCustomerGateway(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCustomerGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayResult]]
  @scala.inline
  def getCustomerGateway(args: typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayArgs): js.Promise[typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCustomerGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayResult]]
  @scala.inline
  def getCustomerGateway(
    args: typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getCustomerGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getCustomerGatewayMod.GetCustomerGatewayResult]]
  
  @scala.inline
  def getInstance(): js.Promise[typings.pulumiAws.getInstanceMod.GetInstanceResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.Promise[typings.pulumiAws.getInstanceMod.GetInstanceResult]]
  @scala.inline
  def getInstance(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getInstanceMod.GetInstanceResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceMod.GetInstanceResult]]
  @scala.inline
  def getInstance(args: typings.pulumiAws.getInstanceMod.GetInstanceArgs): js.Promise[typings.pulumiAws.getInstanceMod.GetInstanceResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceMod.GetInstanceResult]]
  @scala.inline
  def getInstance(
    args: typings.pulumiAws.getInstanceMod.GetInstanceArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getInstanceMod.GetInstanceResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceMod.GetInstanceResult]]
  
  @scala.inline
  def getInstanceType(args: typings.pulumiAws.getInstanceTypeMod.GetInstanceTypeArgs): js.Promise[typings.pulumiAws.getInstanceTypeMod.GetInstanceTypeResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceType")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceTypeMod.GetInstanceTypeResult]]
  @scala.inline
  def getInstanceType(
    args: typings.pulumiAws.getInstanceTypeMod.GetInstanceTypeArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getInstanceTypeMod.GetInstanceTypeResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceType")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceTypeMod.GetInstanceTypeResult]]
  
  @scala.inline
  def getInstanceTypeOffering(): js.Promise[typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOffering")().asInstanceOf[js.Promise[typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingResult]]
  @scala.inline
  def getInstanceTypeOffering(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOffering")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingResult]]
  @scala.inline
  def getInstanceTypeOffering(args: typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingArgs): js.Promise[typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOffering")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingResult]]
  @scala.inline
  def getInstanceTypeOffering(
    args: typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOffering")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingResult]]
  
  @scala.inline
  def getInstanceTypeOfferings(): js.Promise[typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOfferings")().asInstanceOf[js.Promise[typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsResult]]
  @scala.inline
  def getInstanceTypeOfferings(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOfferings")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsResult]]
  @scala.inline
  def getInstanceTypeOfferings(args: typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsArgs): js.Promise[typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOfferings")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsResult]]
  @scala.inline
  def getInstanceTypeOfferings(
    args: typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOfferings")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsResult]]
  
  @scala.inline
  def getInstances(): js.Promise[typings.pulumiAws.getInstancesMod.GetInstancesResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstances")().asInstanceOf[js.Promise[typings.pulumiAws.getInstancesMod.GetInstancesResult]]
  @scala.inline
  def getInstances(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getInstancesMod.GetInstancesResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstances")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInstancesMod.GetInstancesResult]]
  @scala.inline
  def getInstances(args: typings.pulumiAws.getInstancesMod.GetInstancesArgs): js.Promise[typings.pulumiAws.getInstancesMod.GetInstancesResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstances")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getInstancesMod.GetInstancesResult]]
  @scala.inline
  def getInstances(
    args: typings.pulumiAws.getInstancesMod.GetInstancesArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getInstancesMod.GetInstancesResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInstances")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInstancesMod.GetInstancesResult]]
  
  @scala.inline
  def getInternetGateway(): js.Promise[typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInternetGateway")().asInstanceOf[js.Promise[typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayResult]]
  @scala.inline
  def getInternetGateway(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInternetGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayResult]]
  @scala.inline
  def getInternetGateway(args: typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayArgs): js.Promise[typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInternetGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayResult]]
  @scala.inline
  def getInternetGateway(
    args: typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getInternetGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayResult]]
  
  @scala.inline
  def getLaunchConfiguration(args: typings.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationArgs): js.Promise[typings.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchConfiguration")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationResult]]
  @scala.inline
  def getLaunchConfiguration(
    args: typings.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchConfiguration")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationResult]]
  
  @scala.inline
  def getLaunchTemplate(): js.Promise[typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchTemplate")().asInstanceOf[js.Promise[typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateResult]]
  @scala.inline
  def getLaunchTemplate(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchTemplate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateResult]]
  @scala.inline
  def getLaunchTemplate(args: typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateArgs): js.Promise[typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchTemplate")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateResult]]
  @scala.inline
  def getLaunchTemplate(
    args: typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchTemplate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateResult]]
  
  @scala.inline
  def getLocalGateway(): js.Promise[typings.pulumiAws.getLocalGatewayMod.GetLocalGatewayResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateway")().asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayMod.GetLocalGatewayResult]]
  @scala.inline
  def getLocalGateway(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getLocalGatewayMod.GetLocalGatewayResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayMod.GetLocalGatewayResult]]
  @scala.inline
  def getLocalGateway(args: typings.pulumiAws.getLocalGatewayMod.GetLocalGatewayArgs): js.Promise[typings.pulumiAws.getLocalGatewayMod.GetLocalGatewayResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayMod.GetLocalGatewayResult]]
  @scala.inline
  def getLocalGateway(
    args: typings.pulumiAws.getLocalGatewayMod.GetLocalGatewayArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getLocalGatewayMod.GetLocalGatewayResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayMod.GetLocalGatewayResult]]
  
  @scala.inline
  def getLocalGatewayRouteTable(): js.Promise[typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTable")().asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableResult]]
  @scala.inline
  def getLocalGatewayRouteTable(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableResult]]
  @scala.inline
  def getLocalGatewayRouteTable(args: typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableArgs): js.Promise[typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTable")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableResult]]
  @scala.inline
  def getLocalGatewayRouteTable(
    args: typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableResult]]
  
  @scala.inline
  def getLocalGatewayRouteTables(): js.Promise[typings.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTables")().asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesResult]]
  @scala.inline
  def getLocalGatewayRouteTables(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTables")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesResult]]
  @scala.inline
  def getLocalGatewayRouteTables(args: typings.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesArgs): js.Promise[typings.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTables")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesResult]]
  @scala.inline
  def getLocalGatewayRouteTables(
    args: typings.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTables")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewayRouteTablesMod.GetLocalGatewayRouteTablesResult]]
  
  @scala.inline
  def getLocalGatewayVirtualInterface(): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceMod.GetLocalGatewayVirtualInterfaceResult
  ] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterface")().asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceMod.GetLocalGatewayVirtualInterfaceResult
  ]]
  @scala.inline
  def getLocalGatewayVirtualInterface(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceMod.GetLocalGatewayVirtualInterfaceResult
  ] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterface")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceMod.GetLocalGatewayVirtualInterfaceResult
  ]]
  @scala.inline
  def getLocalGatewayVirtualInterface(args: typings.pulumiAws.getLocalGatewayVirtualInterfaceMod.GetLocalGatewayVirtualInterfaceArgs): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceMod.GetLocalGatewayVirtualInterfaceResult
  ] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterface")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceMod.GetLocalGatewayVirtualInterfaceResult
  ]]
  @scala.inline
  def getLocalGatewayVirtualInterface(
    args: typings.pulumiAws.getLocalGatewayVirtualInterfaceMod.GetLocalGatewayVirtualInterfaceArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceMod.GetLocalGatewayVirtualInterfaceResult
  ] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterface")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceMod.GetLocalGatewayVirtualInterfaceResult
  ]]
  
  @scala.inline
  def getLocalGatewayVirtualInterfaceGroup(): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupMod.GetLocalGatewayVirtualInterfaceGroupResult
  ] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroup")().asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupMod.GetLocalGatewayVirtualInterfaceGroupResult
  ]]
  @scala.inline
  def getLocalGatewayVirtualInterfaceGroup(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupMod.GetLocalGatewayVirtualInterfaceGroupResult
  ] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupMod.GetLocalGatewayVirtualInterfaceGroupResult
  ]]
  @scala.inline
  def getLocalGatewayVirtualInterfaceGroup(
    args: typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupMod.GetLocalGatewayVirtualInterfaceGroupArgs
  ): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupMod.GetLocalGatewayVirtualInterfaceGroupResult
  ] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupMod.GetLocalGatewayVirtualInterfaceGroupResult
  ]]
  @scala.inline
  def getLocalGatewayVirtualInterfaceGroup(
    args: typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupMod.GetLocalGatewayVirtualInterfaceGroupArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupMod.GetLocalGatewayVirtualInterfaceGroupResult
  ] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupMod.GetLocalGatewayVirtualInterfaceGroupResult
  ]]
  
  @scala.inline
  def getLocalGatewayVirtualInterfaceGroups(): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsResult
  ] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroups")().asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsResult
  ]]
  @scala.inline
  def getLocalGatewayVirtualInterfaceGroups(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsResult
  ] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroups")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsResult
  ]]
  @scala.inline
  def getLocalGatewayVirtualInterfaceGroups(
    args: typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsArgs
  ): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsResult
  ] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroups")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsResult
  ]]
  @scala.inline
  def getLocalGatewayVirtualInterfaceGroups(
    args: typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsResult
  ] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroups")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsResult
  ]]
  
  @scala.inline
  def getLocalGateways(): js.Promise[typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateways")().asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysResult]]
  @scala.inline
  def getLocalGateways(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateways")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysResult]]
  @scala.inline
  def getLocalGateways(args: typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysArgs): js.Promise[typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateways")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysResult]]
  @scala.inline
  def getLocalGateways(
    args: typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateways")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysResult]]
  
  @scala.inline
  def getNatGateway(): js.Promise[typings.pulumiAws.getNatGatewayMod.GetNatGatewayResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNatGateway")().asInstanceOf[js.Promise[typings.pulumiAws.getNatGatewayMod.GetNatGatewayResult]]
  @scala.inline
  def getNatGateway(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getNatGatewayMod.GetNatGatewayResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNatGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getNatGatewayMod.GetNatGatewayResult]]
  @scala.inline
  def getNatGateway(args: typings.pulumiAws.getNatGatewayMod.GetNatGatewayArgs): js.Promise[typings.pulumiAws.getNatGatewayMod.GetNatGatewayResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNatGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getNatGatewayMod.GetNatGatewayResult]]
  @scala.inline
  def getNatGateway(
    args: typings.pulumiAws.getNatGatewayMod.GetNatGatewayArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getNatGatewayMod.GetNatGatewayResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNatGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getNatGatewayMod.GetNatGatewayResult]]
  
  @scala.inline
  def getNetworkAcls(): js.Promise[typings.pulumiAws.getNetworkAclsMod.GetNetworkAclsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkAcls")().asInstanceOf[js.Promise[typings.pulumiAws.getNetworkAclsMod.GetNetworkAclsResult]]
  @scala.inline
  def getNetworkAcls(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getNetworkAclsMod.GetNetworkAclsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkAcls")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getNetworkAclsMod.GetNetworkAclsResult]]
  @scala.inline
  def getNetworkAcls(args: typings.pulumiAws.getNetworkAclsMod.GetNetworkAclsArgs): js.Promise[typings.pulumiAws.getNetworkAclsMod.GetNetworkAclsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkAcls")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getNetworkAclsMod.GetNetworkAclsResult]]
  @scala.inline
  def getNetworkAcls(
    args: typings.pulumiAws.getNetworkAclsMod.GetNetworkAclsArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getNetworkAclsMod.GetNetworkAclsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkAcls")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getNetworkAclsMod.GetNetworkAclsResult]]
  
  @scala.inline
  def getNetworkInterface(): js.Promise[typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterface")().asInstanceOf[js.Promise[typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceResult]]
  @scala.inline
  def getNetworkInterface(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterface")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceResult]]
  @scala.inline
  def getNetworkInterface(args: typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceArgs): js.Promise[typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterface")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceResult]]
  @scala.inline
  def getNetworkInterface(
    args: typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterface")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceResult]]
  
  @scala.inline
  def getNetworkInterfaces(): js.Promise[typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterfaces")().asInstanceOf[js.Promise[typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesResult]]
  @scala.inline
  def getNetworkInterfaces(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterfaces")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesResult]]
  @scala.inline
  def getNetworkInterfaces(args: typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesArgs): js.Promise[typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterfaces")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesResult]]
  @scala.inline
  def getNetworkInterfaces(
    args: typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkInterfaces")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesResult]]
  
  @scala.inline
  def getRoute(args: typings.pulumiAws.getRouteMod.GetRouteArgs): js.Promise[typings.pulumiAws.getRouteMod.GetRouteResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getRoute")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getRouteMod.GetRouteResult]]
  @scala.inline
  def getRoute(
    args: typings.pulumiAws.getRouteMod.GetRouteArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getRouteMod.GetRouteResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getRoute")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getRouteMod.GetRouteResult]]
  
  @scala.inline
  def getRouteTable(): js.Promise[typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")().asInstanceOf[js.Promise[typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableResult]]
  @scala.inline
  def getRouteTable(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableResult]]
  @scala.inline
  def getRouteTable(args: typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableArgs): js.Promise[typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableResult]]
  @scala.inline
  def getRouteTable(
    args: typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableResult]]
  
  @scala.inline
  def getRouteTables(): js.Promise[typings.pulumiAws.getRouteTablesMod.GetRouteTablesResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTables")().asInstanceOf[js.Promise[typings.pulumiAws.getRouteTablesMod.GetRouteTablesResult]]
  @scala.inline
  def getRouteTables(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getRouteTablesMod.GetRouteTablesResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTables")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getRouteTablesMod.GetRouteTablesResult]]
  @scala.inline
  def getRouteTables(args: typings.pulumiAws.getRouteTablesMod.GetRouteTablesArgs): js.Promise[typings.pulumiAws.getRouteTablesMod.GetRouteTablesResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTables")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getRouteTablesMod.GetRouteTablesResult]]
  @scala.inline
  def getRouteTables(
    args: typings.pulumiAws.getRouteTablesMod.GetRouteTablesArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getRouteTablesMod.GetRouteTablesResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTables")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getRouteTablesMod.GetRouteTablesResult]]
  
  @scala.inline
  def getSecurityGroup(): js.Promise[typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroup")().asInstanceOf[js.Promise[typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupResult]]
  @scala.inline
  def getSecurityGroup(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupResult]]
  @scala.inline
  def getSecurityGroup(args: typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupArgs): js.Promise[typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupResult]]
  @scala.inline
  def getSecurityGroup(
    args: typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupResult]]
  
  @scala.inline
  def getSecurityGroups(): js.Promise[typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroups")().asInstanceOf[js.Promise[typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsResult]]
  @scala.inline
  def getSecurityGroups(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroups")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsResult]]
  @scala.inline
  def getSecurityGroups(args: typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsArgs): js.Promise[typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroups")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsResult]]
  @scala.inline
  def getSecurityGroups(
    args: typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSecurityGroups")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsResult]]
  
  @scala.inline
  def getSpotPrice(): js.Promise[typings.pulumiAws.getSpotPriceMod.GetSpotPriceResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSpotPrice")().asInstanceOf[js.Promise[typings.pulumiAws.getSpotPriceMod.GetSpotPriceResult]]
  @scala.inline
  def getSpotPrice(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getSpotPriceMod.GetSpotPriceResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSpotPrice")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getSpotPriceMod.GetSpotPriceResult]]
  @scala.inline
  def getSpotPrice(args: typings.pulumiAws.getSpotPriceMod.GetSpotPriceArgs): js.Promise[typings.pulumiAws.getSpotPriceMod.GetSpotPriceResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSpotPrice")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getSpotPriceMod.GetSpotPriceResult]]
  @scala.inline
  def getSpotPrice(
    args: typings.pulumiAws.getSpotPriceMod.GetSpotPriceArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getSpotPriceMod.GetSpotPriceResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSpotPrice")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getSpotPriceMod.GetSpotPriceResult]]
  
  @scala.inline
  def getSubnet(): js.Promise[typings.pulumiAws.getSubnetMod.GetSubnetResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSubnet")().asInstanceOf[js.Promise[typings.pulumiAws.getSubnetMod.GetSubnetResult]]
  @scala.inline
  def getSubnet(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getSubnetMod.GetSubnetResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSubnet")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getSubnetMod.GetSubnetResult]]
  @scala.inline
  def getSubnet(args: typings.pulumiAws.getSubnetMod.GetSubnetArgs): js.Promise[typings.pulumiAws.getSubnetMod.GetSubnetResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSubnet")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getSubnetMod.GetSubnetResult]]
  @scala.inline
  def getSubnet(
    args: typings.pulumiAws.getSubnetMod.GetSubnetArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getSubnetMod.GetSubnetResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSubnet")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getSubnetMod.GetSubnetResult]]
  
  @scala.inline
  def getSubnetIds(args: typings.pulumiAws.getSubnetIdsMod.GetSubnetIdsArgs): js.Promise[typings.pulumiAws.getSubnetIdsMod.GetSubnetIdsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSubnetIds")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getSubnetIdsMod.GetSubnetIdsResult]]
  @scala.inline
  def getSubnetIds(
    args: typings.pulumiAws.getSubnetIdsMod.GetSubnetIdsArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getSubnetIdsMod.GetSubnetIdsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getSubnetIds")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getSubnetIdsMod.GetSubnetIdsResult]]
  
  @scala.inline
  def getVpc(): js.Promise[typings.pulumiAws.getVpcMod.GetVpcResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpc")().asInstanceOf[js.Promise[typings.pulumiAws.getVpcMod.GetVpcResult]]
  @scala.inline
  def getVpc(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getVpcMod.GetVpcResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpc")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcMod.GetVpcResult]]
  @scala.inline
  def getVpc(args: typings.pulumiAws.getVpcMod.GetVpcArgs): js.Promise[typings.pulumiAws.getVpcMod.GetVpcResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpc")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getVpcMod.GetVpcResult]]
  @scala.inline
  def getVpc(args: typings.pulumiAws.getVpcMod.GetVpcArgs, opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getVpcMod.GetVpcResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpc")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcMod.GetVpcResult]]
  
  @scala.inline
  def getVpcDhcpOptions(): js.Promise[typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcDhcpOptions")().asInstanceOf[js.Promise[typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsResult]]
  @scala.inline
  def getVpcDhcpOptions(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcDhcpOptions")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsResult]]
  @scala.inline
  def getVpcDhcpOptions(args: typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsArgs): js.Promise[typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcDhcpOptions")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsResult]]
  @scala.inline
  def getVpcDhcpOptions(
    args: typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcDhcpOptions")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsResult]]
  
  @scala.inline
  def getVpcEndpoint(): js.Promise[typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpoint")().asInstanceOf[js.Promise[typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointResult]]
  @scala.inline
  def getVpcEndpoint(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointResult]]
  @scala.inline
  def getVpcEndpoint(args: typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointArgs): js.Promise[typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpoint")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointResult]]
  @scala.inline
  def getVpcEndpoint(
    args: typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointResult]]
  
  @scala.inline
  def getVpcEndpointService(): js.Promise[typings.pulumiAws.getVpcEndpointServiceMod.GetVpcEndpointServiceResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpointService")().asInstanceOf[js.Promise[typings.pulumiAws.getVpcEndpointServiceMod.GetVpcEndpointServiceResult]]
  @scala.inline
  def getVpcEndpointService(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getVpcEndpointServiceMod.GetVpcEndpointServiceResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpointService")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcEndpointServiceMod.GetVpcEndpointServiceResult]]
  @scala.inline
  def getVpcEndpointService(args: typings.pulumiAws.getVpcEndpointServiceMod.GetVpcEndpointServiceArgs): js.Promise[typings.pulumiAws.getVpcEndpointServiceMod.GetVpcEndpointServiceResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpointService")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getVpcEndpointServiceMod.GetVpcEndpointServiceResult]]
  @scala.inline
  def getVpcEndpointService(
    args: typings.pulumiAws.getVpcEndpointServiceMod.GetVpcEndpointServiceArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getVpcEndpointServiceMod.GetVpcEndpointServiceResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpointService")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcEndpointServiceMod.GetVpcEndpointServiceResult]]
  
  @scala.inline
  def getVpcPeeringConnection(): js.Promise[typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnection")().asInstanceOf[js.Promise[typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionResult]]
  @scala.inline
  def getVpcPeeringConnection(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnection")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionResult]]
  @scala.inline
  def getVpcPeeringConnection(args: typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionArgs): js.Promise[typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnection")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionResult]]
  @scala.inline
  def getVpcPeeringConnection(
    args: typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnection")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcPeeringConnectionMod.GetVpcPeeringConnectionResult]]
  
  @scala.inline
  def getVpcPeeringConnections(): js.Promise[typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnections")().asInstanceOf[js.Promise[typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsResult]]
  @scala.inline
  def getVpcPeeringConnections(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnections")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsResult]]
  @scala.inline
  def getVpcPeeringConnections(args: typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsArgs): js.Promise[typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnections")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsResult]]
  @scala.inline
  def getVpcPeeringConnections(
    args: typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnections")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsResult]]
  
  @scala.inline
  def getVpcs(): js.Promise[typings.pulumiAws.getVpcsMod.GetVpcsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcs")().asInstanceOf[js.Promise[typings.pulumiAws.getVpcsMod.GetVpcsResult]]
  @scala.inline
  def getVpcs(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getVpcsMod.GetVpcsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcsMod.GetVpcsResult]]
  @scala.inline
  def getVpcs(args: typings.pulumiAws.getVpcsMod.GetVpcsArgs): js.Promise[typings.pulumiAws.getVpcsMod.GetVpcsResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcs")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getVpcsMod.GetVpcsResult]]
  @scala.inline
  def getVpcs(args: typings.pulumiAws.getVpcsMod.GetVpcsArgs, opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getVpcsMod.GetVpcsResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpcs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpcsMod.GetVpcsResult]]
  
  @scala.inline
  def getVpnGateway(): js.Promise[typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpnGateway")().asInstanceOf[js.Promise[typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult]]
  @scala.inline
  def getVpnGateway(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpnGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult]]
  @scala.inline
  def getVpnGateway(args: typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayArgs): js.Promise[typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult] = typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpnGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult]]
  @scala.inline
  def getVpnGateway(
    args: typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult] = (typings.pulumiAws.mod.ec2.^.asInstanceOf[js.Dynamic].applyDynamic("getVpnGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult]]
}
