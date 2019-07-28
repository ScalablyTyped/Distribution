package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.getAmiIdsMod.GetAmiIdsArgs
import typings.atPulumiAws.getAmiIdsMod.GetAmiIdsResult
import typings.atPulumiAws.getAmiMod.GetAmiArgs
import typings.atPulumiAws.getAmiMod.GetAmiResult
import typings.atPulumiAws.getArnMod.GetArnArgs
import typings.atPulumiAws.getArnMod.GetArnResult
import typings.atPulumiAws.getAutoscalingGroupsMod.GetAutoscalingGroupsArgs
import typings.atPulumiAws.getAutoscalingGroupsMod.GetAutoscalingGroupsResult
import typings.atPulumiAws.getAvailabilityZoneMod.GetAvailabilityZoneArgs
import typings.atPulumiAws.getAvailabilityZoneMod.GetAvailabilityZoneResult
import typings.atPulumiAws.getAvailabilityZonesMod.GetAvailabilityZonesArgs
import typings.atPulumiAws.getAvailabilityZonesMod.GetAvailabilityZonesResult
import typings.atPulumiAws.getBillingServiceAccountMod.GetBillingServiceAccountResult
import typings.atPulumiAws.getCallerIdentityMod.GetCallerIdentityResult
import typings.atPulumiAws.getCanonicalUserIdMod.GetCanonicalUserIdResult
import typings.atPulumiAws.getElasticIpMod.GetElasticIpArgs
import typings.atPulumiAws.getElasticIpMod.GetElasticIpResult
import typings.atPulumiAws.getIpRangesMod.GetIpRangesArgs
import typings.atPulumiAws.getIpRangesMod.GetIpRangesResult
import typings.atPulumiAws.getPartitionMod.GetPartitionResult
import typings.atPulumiAws.getPrefixListMod.GetPrefixListArgs
import typings.atPulumiAws.getPrefixListMod.GetPrefixListResult
import typings.atPulumiAws.getRegionMod.GetRegionArgs
import typings.atPulumiAws.getRegionMod.GetRegionResult
import typings.atPulumiAws.regionMod.Region
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var APNortheast1Region: Region = js.native
  var APNortheast2Region: Region = js.native
  var APSouth1Region: Region = js.native
  var APSouthEast2Region: Region = js.native
  var APSoutheast1Region: Region = js.native
  var CACentralRegion: Region = js.native
  var EUCentral1Region: Region = js.native
  var EUWest1Region: Region = js.native
  var EUWest2Region: Region = js.native
  var EUWest3Region: Region = js.native
  var SAEast1Region: Region = js.native
  var USEast1Region: Region = js.native
  var USEast2Region: Region = js.native
  var USWest1Region: Region = js.native
  var USWest2Region: Region = js.native
  def getAmi(args: GetAmiArgs): js.Promise[GetAmiResult] with GetAmiResult = js.native
  def getAmi(args: GetAmiArgs, opts: InvokeOptions): js.Promise[GetAmiResult] with GetAmiResult = js.native
  def getAmiIds(args: GetAmiIdsArgs): js.Promise[GetAmiIdsResult] with GetAmiIdsResult = js.native
  def getAmiIds(args: GetAmiIdsArgs, opts: InvokeOptions): js.Promise[GetAmiIdsResult] with GetAmiIdsResult = js.native
  def getArn(args: GetArnArgs): js.Promise[GetArnResult] with GetArnResult = js.native
  def getArn(args: GetArnArgs, opts: InvokeOptions): js.Promise[GetArnResult] with GetArnResult = js.native
  def getAutoscalingGroups(): js.Promise[GetAutoscalingGroupsResult] with GetAutoscalingGroupsResult = js.native
  def getAutoscalingGroups(args: GetAutoscalingGroupsArgs): js.Promise[GetAutoscalingGroupsResult] with GetAutoscalingGroupsResult = js.native
  def getAutoscalingGroups(args: GetAutoscalingGroupsArgs, opts: InvokeOptions): js.Promise[GetAutoscalingGroupsResult] with GetAutoscalingGroupsResult = js.native
  def getAvailabilityZone(): js.Promise[GetAvailabilityZoneResult] with GetAvailabilityZoneResult = js.native
  def getAvailabilityZone(args: GetAvailabilityZoneArgs): js.Promise[GetAvailabilityZoneResult] with GetAvailabilityZoneResult = js.native
  def getAvailabilityZone(args: GetAvailabilityZoneArgs, opts: InvokeOptions): js.Promise[GetAvailabilityZoneResult] with GetAvailabilityZoneResult = js.native
  def getAvailabilityZones(): js.Promise[GetAvailabilityZonesResult] with GetAvailabilityZonesResult = js.native
  def getAvailabilityZones(args: GetAvailabilityZonesArgs): js.Promise[GetAvailabilityZonesResult] with GetAvailabilityZonesResult = js.native
  def getAvailabilityZones(args: GetAvailabilityZonesArgs, opts: InvokeOptions): js.Promise[GetAvailabilityZonesResult] with GetAvailabilityZonesResult = js.native
  def getBillingServiceAccount(): js.Promise[GetBillingServiceAccountResult] with GetBillingServiceAccountResult = js.native
  def getBillingServiceAccount(opts: InvokeOptions): js.Promise[GetBillingServiceAccountResult] with GetBillingServiceAccountResult = js.native
  def getCallerIdentity(): js.Promise[GetCallerIdentityResult] with GetCallerIdentityResult = js.native
  def getCallerIdentity(opts: InvokeOptions): js.Promise[GetCallerIdentityResult] with GetCallerIdentityResult = js.native
  def getCanonicalUserId(): js.Promise[GetCanonicalUserIdResult] with GetCanonicalUserIdResult = js.native
  def getCanonicalUserId(opts: InvokeOptions): js.Promise[GetCanonicalUserIdResult] with GetCanonicalUserIdResult = js.native
  def getElasticIp(): js.Promise[GetElasticIpResult] with GetElasticIpResult = js.native
  def getElasticIp(args: GetElasticIpArgs): js.Promise[GetElasticIpResult] with GetElasticIpResult = js.native
  def getElasticIp(args: GetElasticIpArgs, opts: InvokeOptions): js.Promise[GetElasticIpResult] with GetElasticIpResult = js.native
  def getIpRanges(args: GetIpRangesArgs): js.Promise[GetIpRangesResult] with GetIpRangesResult = js.native
  def getIpRanges(args: GetIpRangesArgs, opts: InvokeOptions): js.Promise[GetIpRangesResult] with GetIpRangesResult = js.native
  def getPartition(): js.Promise[GetPartitionResult] with GetPartitionResult = js.native
  def getPartition(opts: InvokeOptions): js.Promise[GetPartitionResult] with GetPartitionResult = js.native
  def getPrefixList(): js.Promise[GetPrefixListResult] with GetPrefixListResult = js.native
  def getPrefixList(args: GetPrefixListArgs): js.Promise[GetPrefixListResult] with GetPrefixListResult = js.native
  def getPrefixList(args: GetPrefixListArgs, opts: InvokeOptions): js.Promise[GetPrefixListResult] with GetPrefixListResult = js.native
  def getRegion(): js.Promise[GetRegionResult] with GetRegionResult = js.native
  def getRegion(args: GetRegionArgs): js.Promise[GetRegionResult] with GetRegionResult = js.native
  def getRegion(args: GetRegionArgs, opts: InvokeOptions): js.Promise[GetRegionResult] with GetRegionResult = js.native
}

