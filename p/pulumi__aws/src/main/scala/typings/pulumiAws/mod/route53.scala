package typings.pulumiAws.mod

import typings.pulumiAws.delegationSetMod.DelegationSetArgs
import typings.pulumiAws.delegationSetMod.DelegationSetState
import typings.pulumiAws.enumsRoute53Mod.RecordType
import typings.pulumiAws.getDelegationSetMod.GetDelegationSetArgs
import typings.pulumiAws.getDelegationSetMod.GetDelegationSetResult
import typings.pulumiAws.getResolverEndpointMod.GetResolverEndpointArgs
import typings.pulumiAws.getResolverEndpointMod.GetResolverEndpointResult
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
import typings.pulumiAws.resolverEndpointMod.ResolverEndpointArgs
import typings.pulumiAws.resolverEndpointMod.ResolverEndpointState
import typings.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociationArgs
import typings.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociationState
import typings.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfigArgs
import typings.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfigState
import typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociationArgs
import typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociationState
import typings.pulumiAws.resolverRuleMod.ResolverRuleArgs
import typings.pulumiAws.resolverRuleMod.ResolverRuleState
import typings.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorizationArgs
import typings.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorizationState
import typings.pulumiAws.zoneAssociationMod.ZoneAssociationArgs
import typings.pulumiAws.zoneAssociationMod.ZoneAssociationState
import typings.pulumiAws.zoneMod.ZoneArgs
import typings.pulumiAws.zoneMod.ZoneState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object route53 {
  
  @JSImport("@pulumi/aws", "route53")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "route53.DelegationSet")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: DelegationSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DelegationSet {
    
    @JSImport("@pulumi/aws", "route53.DelegationSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DelegationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.delegationSetMod.DelegationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.delegationSetMod.DelegationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.delegationSetMod.DelegationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.delegationSetMod.DelegationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: DelegationSetState): typings.pulumiAws.delegationSetMod.DelegationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.delegationSetMod.DelegationSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: DelegationSetState, opts: CustomResourceOptions): typings.pulumiAws.delegationSetMod.DelegationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.delegationSetMod.DelegationSet]
    
    /**
      * Returns true if the given object is an instance of DelegationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/delegationSet.DelegationSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/delegationSet.DelegationSet */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "route53.HealthCheck")
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
  /* static members */
  object HealthCheck {
    
    @JSImport("@pulumi/aws", "route53.HealthCheck")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HealthCheck resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.healthCheckMod.HealthCheck = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.healthCheckMod.HealthCheck]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.healthCheckMod.HealthCheck = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.healthCheckMod.HealthCheck]
    @scala.inline
    def get(name: String, id: Input[ID], state: HealthCheckState): typings.pulumiAws.healthCheckMod.HealthCheck = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.healthCheckMod.HealthCheck]
    @scala.inline
    def get(name: String, id: Input[ID], state: HealthCheckState, opts: CustomResourceOptions): typings.pulumiAws.healthCheckMod.HealthCheck = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.healthCheckMod.HealthCheck]
    
    /**
      * Returns true if the given object is an instance of HealthCheck.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/healthCheck.HealthCheck */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/healthCheck.HealthCheck */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "route53.QueryLog")
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
  /* static members */
  object QueryLog {
    
    @JSImport("@pulumi/aws", "route53.QueryLog")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing QueryLog resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.queryLogMod.QueryLog = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.queryLogMod.QueryLog]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.queryLogMod.QueryLog = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.queryLogMod.QueryLog]
    @scala.inline
    def get(name: String, id: Input[ID], state: QueryLogState): typings.pulumiAws.queryLogMod.QueryLog = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.queryLogMod.QueryLog]
    @scala.inline
    def get(name: String, id: Input[ID], state: QueryLogState, opts: CustomResourceOptions): typings.pulumiAws.queryLogMod.QueryLog = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.queryLogMod.QueryLog]
    
    /**
      * Returns true if the given object is an instance of QueryLog.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/queryLog.QueryLog */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "route53.Record")
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
  /* static members */
  object Record {
    
    @JSImport("@pulumi/aws", "route53.Record")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Record resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.recordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recordMod.Record]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.recordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recordMod.Record]
    @scala.inline
    def get(name: String, id: Input[ID], state: RecordState): typings.pulumiAws.recordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recordMod.Record]
    @scala.inline
    def get(name: String, id: Input[ID], state: RecordState, opts: CustomResourceOptions): typings.pulumiAws.recordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recordMod.Record]
    
    /**
      * Returns true if the given object is an instance of Record.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/record.Record */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/record.Record */ Boolean]
  }
  
  object RecordType {
    
    @JSImport("@pulumi/aws", "route53.RecordType.A")
    @js.native
    val A: typings.pulumiAws.pulumiAwsStrings.A = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.AAAA")
    @js.native
    val AAAA: typings.pulumiAws.pulumiAwsStrings.AAAA = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.CAA")
    @js.native
    val CAA: typings.pulumiAws.pulumiAwsStrings.CAA = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.CNAME")
    @js.native
    val CNAME: typings.pulumiAws.pulumiAwsStrings.CNAME = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.MX")
    @js.native
    val MX: typings.pulumiAws.pulumiAwsStrings.MX = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.NAPTR")
    @js.native
    val NAPTR: typings.pulumiAws.pulumiAwsStrings.NAPTR = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.NS")
    @js.native
    val NS: typings.pulumiAws.pulumiAwsStrings.NS = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.PTR")
    @js.native
    val PTR: typings.pulumiAws.pulumiAwsStrings.PTR = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.SOA")
    @js.native
    val SOA: typings.pulumiAws.pulumiAwsStrings.SOA = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.SPF")
    @js.native
    val SPF: typings.pulumiAws.pulumiAwsStrings.SPF = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.SRV")
    @js.native
    val SRV: typings.pulumiAws.pulumiAwsStrings.SRV = js.native
    
    @JSImport("@pulumi/aws", "route53.RecordType.TXT")
    @js.native
    val TXT: typings.pulumiAws.pulumiAwsStrings.TXT = js.native
  }
  
  object RecordTypes {
    
    /** Use RecordType.A instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.A")
    @js.native
    val A: RecordType = js.native
    
    /** Use RecordType.AAAA instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.AAAA")
    @js.native
    val AAAA: RecordType = js.native
    
    /** Use RecordType.CAA instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.CAA")
    @js.native
    val CAA: RecordType = js.native
    
    /** Use RecordType.CNAME instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.CNAME")
    @js.native
    val CNAME: RecordType = js.native
    
    /** Use RecordType.MX instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.MX")
    @js.native
    val MX: RecordType = js.native
    
    /** Use RecordType.NAPTR instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.NAPTR")
    @js.native
    val NAPTR: RecordType = js.native
    
    /** Use RecordType.NS instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.NS")
    @js.native
    val NS: RecordType = js.native
    
    /** Use RecordType.PTR instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.PTR")
    @js.native
    val PTR: RecordType = js.native
    
    /** Use RecordType.SOA instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.SOA")
    @js.native
    val SOA: RecordType = js.native
    
    /** Use RecordType.SPF instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.SPF")
    @js.native
    val SPF: RecordType = js.native
    
    /** Use RecordType.SRV instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.SRV")
    @js.native
    val SRV: RecordType = js.native
    
    /** Use RecordType.TXT instead. */
    @JSImport("@pulumi/aws", "route53.RecordTypes.TXT")
    @js.native
    val TXT: RecordType = js.native
  }
  
  @JSImport("@pulumi/aws", "route53.ResolverEndpoint")
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
  /* static members */
  object ResolverEndpoint {
    
    @JSImport("@pulumi/aws", "route53.ResolverEndpoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResolverEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.resolverEndpointMod.ResolverEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverEndpointMod.ResolverEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.resolverEndpointMod.ResolverEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverEndpointMod.ResolverEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverEndpointState): typings.pulumiAws.resolverEndpointMod.ResolverEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverEndpointMod.ResolverEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverEndpointState, opts: CustomResourceOptions): typings.pulumiAws.resolverEndpointMod.ResolverEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverEndpointMod.ResolverEndpoint]
    
    /**
      * Returns true if the given object is an instance of ResolverEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfig")
  @js.native
  class ResolverQueryLogConfig protected ()
    extends typings.pulumiAws.route53Mod.ResolverQueryLogConfig {
    /**
      * Create a ResolverQueryLogConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverQueryLogConfigArgs) = this()
    def this(name: String, args: ResolverQueryLogConfigArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ResolverQueryLogConfig {
    
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResolverQueryLogConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverQueryLogConfigState): typings.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverQueryLogConfigState, opts: CustomResourceOptions): typings.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverQueryLogConfigMod.ResolverQueryLogConfig]
    
    /**
      * Returns true if the given object is an instance of ResolverQueryLogConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverQueryLogConfig.ResolverQueryLogConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/resolverQueryLogConfig.ResolverQueryLogConfig */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfigAssociation")
  @js.native
  class ResolverQueryLogConfigAssociation protected ()
    extends typings.pulumiAws.route53Mod.ResolverQueryLogConfigAssociation {
    /**
      * Create a ResolverQueryLogConfigAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverQueryLogConfigAssociationArgs) = this()
    def this(name: String, args: ResolverQueryLogConfigAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ResolverQueryLogConfigAssociation {
    
    @JSImport("@pulumi/aws", "route53.ResolverQueryLogConfigAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResolverQueryLogConfigAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverQueryLogConfigAssociationState): typings.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation]
    @scala.inline
    def get(
      name: String,
      id: Input[ID],
      state: ResolverQueryLogConfigAssociationState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverQueryLogConfigAssociationMod.ResolverQueryLogConfigAssociation]
    
    /**
      * Returns true if the given object is an instance of ResolverQueryLogConfigAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverQueryLogConfigAssociation.ResolverQueryLogConfigAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/resolverQueryLogConfigAssociation.ResolverQueryLogConfigAssociation */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "route53.ResolverRule")
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
  /* static members */
  object ResolverRule {
    
    @JSImport("@pulumi/aws", "route53.ResolverRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResolverRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.resolverRuleMod.ResolverRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverRuleMod.ResolverRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.resolverRuleMod.ResolverRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverRuleMod.ResolverRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverRuleState): typings.pulumiAws.resolverRuleMod.ResolverRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverRuleMod.ResolverRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverRuleState, opts: CustomResourceOptions): typings.pulumiAws.resolverRuleMod.ResolverRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverRuleMod.ResolverRule]
    
    /**
      * Returns true if the given object is an instance of ResolverRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/resolverRule.ResolverRule */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "route53.ResolverRuleAssociation")
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
  /* static members */
  object ResolverRuleAssociation {
    
    @JSImport("@pulumi/aws", "route53.ResolverRuleAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResolverRuleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState): typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResolverRuleAssociationState, opts: CustomResourceOptions): typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resolverRuleAssociationMod.ResolverRuleAssociation]
    
    /**
      * Returns true if the given object is an instance of ResolverRuleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "route53.VpcAssociationAuthorization")
  @js.native
  class VpcAssociationAuthorization protected ()
    extends typings.pulumiAws.route53Mod.VpcAssociationAuthorization {
    /**
      * Create a VpcAssociationAuthorization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAssociationAuthorizationArgs) = this()
    def this(name: String, args: VpcAssociationAuthorizationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VpcAssociationAuthorization {
    
    @JSImport("@pulumi/aws", "route53.VpcAssociationAuthorization")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcAssociationAuthorization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcAssociationAuthorizationState): typings.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcAssociationAuthorizationState, opts: CustomResourceOptions): typings.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.vpcAssociationAuthorizationMod.VpcAssociationAuthorization]
    
    /**
      * Returns true if the given object is an instance of VpcAssociationAuthorization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/vpcAssociationAuthorization.VpcAssociationAuthorization */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/vpcAssociationAuthorization.VpcAssociationAuthorization */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "route53.Zone")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ZoneArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Zone {
    
    @JSImport("@pulumi/aws", "route53.Zone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Zone resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.zoneMod.Zone = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.zoneMod.Zone]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.zoneMod.Zone = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.zoneMod.Zone]
    @scala.inline
    def get(name: String, id: Input[ID], state: ZoneState): typings.pulumiAws.zoneMod.Zone = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.zoneMod.Zone]
    @scala.inline
    def get(name: String, id: Input[ID], state: ZoneState, opts: CustomResourceOptions): typings.pulumiAws.zoneMod.Zone = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.zoneMod.Zone]
    
    /**
      * Returns true if the given object is an instance of Zone.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zone.Zone */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/zone.Zone */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "route53.ZoneAssociation")
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
  /* static members */
  object ZoneAssociation {
    
    @JSImport("@pulumi/aws", "route53.ZoneAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ZoneAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.zoneAssociationMod.ZoneAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.zoneAssociationMod.ZoneAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.zoneAssociationMod.ZoneAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.zoneAssociationMod.ZoneAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: ZoneAssociationState): typings.pulumiAws.zoneAssociationMod.ZoneAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.zoneAssociationMod.ZoneAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: ZoneAssociationState, opts: CustomResourceOptions): typings.pulumiAws.zoneAssociationMod.ZoneAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.zoneAssociationMod.ZoneAssociation]
    
    /**
      * Returns true if the given object is an instance of ZoneAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ Boolean]
  }
  
  @scala.inline
  def getDelegationSet(args: GetDelegationSetArgs): js.Promise[GetDelegationSetResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDelegationSet")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDelegationSetResult]]
  @scala.inline
  def getDelegationSet(args: GetDelegationSetArgs, opts: InvokeOptions): js.Promise[GetDelegationSetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDelegationSet")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDelegationSetResult]]
  
  @scala.inline
  def getResolverEndpoint(): js.Promise[GetResolverEndpointResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverEndpoint")().asInstanceOf[js.Promise[GetResolverEndpointResult]]
  @scala.inline
  def getResolverEndpoint(args: Unit, opts: InvokeOptions): js.Promise[GetResolverEndpointResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverEndpoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverEndpointResult]]
  @scala.inline
  def getResolverEndpoint(args: GetResolverEndpointArgs): js.Promise[GetResolverEndpointResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverEndpoint")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetResolverEndpointResult]]
  @scala.inline
  def getResolverEndpoint(args: GetResolverEndpointArgs, opts: InvokeOptions): js.Promise[GetResolverEndpointResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverEndpoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverEndpointResult]]
  
  @scala.inline
  def getResolverRule(): js.Promise[GetResolverRuleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRule")().asInstanceOf[js.Promise[GetResolverRuleResult]]
  @scala.inline
  def getResolverRule(args: Unit, opts: InvokeOptions): js.Promise[GetResolverRuleResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRule")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverRuleResult]]
  @scala.inline
  def getResolverRule(args: GetResolverRuleArgs): js.Promise[GetResolverRuleResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRule")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetResolverRuleResult]]
  @scala.inline
  def getResolverRule(args: GetResolverRuleArgs, opts: InvokeOptions): js.Promise[GetResolverRuleResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRule")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverRuleResult]]
  
  @scala.inline
  def getResolverRules(): js.Promise[GetResolverRulesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRules")().asInstanceOf[js.Promise[GetResolverRulesResult]]
  @scala.inline
  def getResolverRules(args: Unit, opts: InvokeOptions): js.Promise[GetResolverRulesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRules")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverRulesResult]]
  @scala.inline
  def getResolverRules(args: GetResolverRulesArgs): js.Promise[GetResolverRulesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRules")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetResolverRulesResult]]
  @scala.inline
  def getResolverRules(args: GetResolverRulesArgs, opts: InvokeOptions): js.Promise[GetResolverRulesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverRules")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverRulesResult]]
  
  @scala.inline
  def getZone(): js.Promise[GetZoneResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZone")().asInstanceOf[js.Promise[GetZoneResult]]
  @scala.inline
  def getZone(args: Unit, opts: InvokeOptions): js.Promise[GetZoneResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getZone")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetZoneResult]]
  @scala.inline
  def getZone(args: GetZoneArgs): js.Promise[GetZoneResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZone")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetZoneResult]]
  @scala.inline
  def getZone(args: GetZoneArgs, opts: InvokeOptions): js.Promise[GetZoneResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getZone")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetZoneResult]]
}
