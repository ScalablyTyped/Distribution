package typings.pulumiAws.mod

import typings.pulumiAws.delegationSetMod.DelegationSetArgs
import typings.pulumiAws.delegationSetMod.DelegationSetState
import typings.pulumiAws.getDelegationSetMod.GetDelegationSetArgs
import typings.pulumiAws.getDelegationSetMod.GetDelegationSetResult
import typings.pulumiAws.getResolverRuleMod.GetResolverRuleArgs
import typings.pulumiAws.getResolverRuleMod.GetResolverRuleResult
import typings.pulumiAws.getResolverRulesMod.GetResolverRulesArgs
import typings.pulumiAws.getResolverRulesMod.GetResolverRulesResult
import typings.pulumiAws.getZoneMod.GetZoneArgs
import typings.pulumiAws.getZoneMod.GetZoneResult
import typings.pulumiAws.healthCheckMod.HealthCheckArgs
import typings.pulumiAws.healthCheckMod.HealthCheckState
import typings.pulumiAws.queryLogMod.QueryLogArgs
import typings.pulumiAws.queryLogMod.QueryLogState
import typings.pulumiAws.recordMod.RecordArgs
import typings.pulumiAws.recordMod.RecordState
import typings.pulumiAws.recordTypeMod.RecordType
import typings.pulumiAws.resolverEndpointMod.ResolverEndpointArgs
import typings.pulumiAws.resolverEndpointMod.ResolverEndpointState
import typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociationArgs
import typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociationState
import typings.pulumiAws.resolverRuleMod.ResolverRuleArgs
import typings.pulumiAws.resolverRuleMod.ResolverRuleState
import typings.pulumiAws.zoneAssociationMod.ZoneAssociationArgs
import typings.pulumiAws.zoneAssociationMod.ZoneAssociationState
import typings.pulumiAws.zoneMod.ZoneArgs
import typings.pulumiAws.zoneMod.ZoneState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "route53")
@js.native
object route53 extends js.Object {
  @js.native
  class DelegationSet protected ()
    extends typings.pulumiAws.route53Mod.DelegationSet {
    /**
      * Create a DelegationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DelegationSetArgs) = this()
    def this(name: String, args: DelegationSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class HealthCheck protected ()
    extends typings.pulumiAws.route53Mod.HealthCheck {
    /**
      * Create a HealthCheck resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HealthCheckArgs) = this()
    def this(name: String, args: HealthCheckArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class QueryLog protected ()
    extends typings.pulumiAws.route53Mod.QueryLog {
    /**
      * Create a QueryLog resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: QueryLogArgs) = this()
    def this(name: String, args: QueryLogArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Record protected ()
    extends typings.pulumiAws.route53Mod.Record {
    /**
      * Create a Record resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RecordArgs) = this()
    def this(name: String, args: RecordArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResolverEndpoint protected ()
    extends typings.pulumiAws.route53Mod.ResolverEndpoint {
    /**
      * Create a ResolverEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverEndpointArgs) = this()
    def this(name: String, args: ResolverEndpointArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResolverRule protected ()
    extends typings.pulumiAws.route53Mod.ResolverRule {
    /**
      * Create a ResolverRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverRuleArgs) = this()
    def this(name: String, args: ResolverRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResolverRuleAssociation protected ()
    extends typings.pulumiAws.route53Mod.ResolverRuleAssociation {
    /**
      * Create a ResolverRuleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverRuleAssociationArgs) = this()
    def this(name: String, args: ResolverRuleAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Zone protected ()
    extends typings.pulumiAws.route53Mod.Zone {
    /**
      * Create a Zone resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ZoneArgs) = this()
    def this(name: String, args: ZoneArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ZoneAssociation protected ()
    extends typings.pulumiAws.route53Mod.ZoneAssociation {
    /**
      * Create a ZoneAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ZoneAssociationArgs) = this()
    def this(name: String, args: ZoneAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  def getDelegationSet(args: GetDelegationSetArgs): js.Promise[GetDelegationSetResult] with GetDelegationSetResult = js.native
  def getDelegationSet(args: GetDelegationSetArgs, opts: InvokeOptions): js.Promise[GetDelegationSetResult] with GetDelegationSetResult = js.native
  def getResolverRule(): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRule(args: GetResolverRuleArgs): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRule(args: GetResolverRuleArgs, opts: InvokeOptions): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRules(): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getResolverRules(args: GetResolverRulesArgs): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getResolverRules(args: GetResolverRulesArgs, opts: InvokeOptions): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getZone(): js.Promise[GetZoneResult] with GetZoneResult = js.native
  def getZone(args: GetZoneArgs): js.Promise[GetZoneResult] with GetZoneResult = js.native
  def getZone(args: GetZoneArgs, opts: InvokeOptions): js.Promise[GetZoneResult] with GetZoneResult = js.native
  /* static members */
  @js.native
  object DelegationSet extends js.Object {
    /**
      * Get an existing DelegationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.delegationSetMod.DelegationSet = js.native
    def get(name: String, id: Input[ID], state: DelegationSetState): typings.pulumiAws.delegationSetMod.DelegationSet = js.native
    def get(name: String, id: Input[ID], state: DelegationSetState, opts: CustomResourceOptions): typings.pulumiAws.delegationSetMod.DelegationSet = js.native
    /**
      * Returns true if the given object is an instance of DelegationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/delegationSet.DelegationSet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object HealthCheck extends js.Object {
    /**
      * Get an existing HealthCheck resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.healthCheckMod.HealthCheck = js.native
    def get(name: String, id: Input[ID], state: HealthCheckState): typings.pulumiAws.healthCheckMod.HealthCheck = js.native
    def get(name: String, id: Input[ID], state: HealthCheckState, opts: CustomResourceOptions): typings.pulumiAws.healthCheckMod.HealthCheck = js.native
    /**
      * Returns true if the given object is an instance of HealthCheck.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/healthCheck.HealthCheck */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object QueryLog extends js.Object {
    /**
      * Get an existing QueryLog resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.queryLogMod.QueryLog = js.native
    def get(name: String, id: Input[ID], state: QueryLogState): typings.pulumiAws.queryLogMod.QueryLog = js.native
    def get(name: String, id: Input[ID], state: QueryLogState, opts: CustomResourceOptions): typings.pulumiAws.queryLogMod.QueryLog = js.native
    /**
      * Returns true if the given object is an instance of QueryLog.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Record extends js.Object {
    /**
      * Get an existing Record resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.recordMod.Record = js.native
    def get(name: String, id: Input[ID], state: RecordState): typings.pulumiAws.recordMod.Record = js.native
    def get(name: String, id: Input[ID], state: RecordState, opts: CustomResourceOptions): typings.pulumiAws.recordMod.Record = js.native
    /**
      * Returns true if the given object is an instance of Record.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/record.Record */ Boolean = js.native
  }
  
  @js.native
  object RecordTypes extends js.Object {
    val A: RecordType = js.native
    val AAAA: RecordType = js.native
    val CAA: RecordType = js.native
    val CNAME: RecordType = js.native
    val MX: RecordType = js.native
    val NAPTR: RecordType = js.native
    val NS: RecordType = js.native
    val PTR: RecordType = js.native
    val SOA: RecordType = js.native
    val SPF: RecordType = js.native
    val SRV: RecordType = js.native
    val TXT: RecordType = js.native
  }
  
  /* static members */
  @js.native
  object ResolverEndpoint extends js.Object {
    /**
      * Get an existing ResolverEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState): typings.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState, opts: CustomResourceOptions): typings.pulumiAws.resolverEndpointMod.ResolverEndpoint = js.native
    /**
      * Returns true if the given object is an instance of ResolverEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResolverRule extends js.Object {
    /**
      * Get an existing ResolverRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.resolverRuleMod.ResolverRule = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleState): typings.pulumiAws.resolverRuleMod.ResolverRule = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleState, opts: CustomResourceOptions): typings.pulumiAws.resolverRuleMod.ResolverRule = js.native
    /**
      * Returns true if the given object is an instance of ResolverRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResolverRuleAssociation extends js.Object {
    /**
      * Get an existing ResolverRuleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState): typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState, opts: CustomResourceOptions): typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = js.native
    /**
      * Returns true if the given object is an instance of ResolverRuleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Zone extends js.Object {
    /**
      * Get an existing Zone resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.zoneMod.Zone = js.native
    def get(name: String, id: Input[ID], state: ZoneState): typings.pulumiAws.zoneMod.Zone = js.native
    def get(name: String, id: Input[ID], state: ZoneState, opts: CustomResourceOptions): typings.pulumiAws.zoneMod.Zone = js.native
    /**
      * Returns true if the given object is an instance of Zone.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zone.Zone */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ZoneAssociation extends js.Object {
    /**
      * Get an existing ZoneAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState): typings.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState, opts: CustomResourceOptions): typings.pulumiAws.zoneAssociationMod.ZoneAssociation = js.native
    /**
      * Returns true if the given object is an instance of ZoneAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ Boolean = js.native
  }
  
}

