package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "route53")
@js.native
object route53Ns extends js.Object {
  @js.native
  class DelegationSet protected ()
    extends atPulumiAwsLib.route53Mod.DelegationSet {
    /**
      * Create a DelegationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53DelegationSetMod.DelegationSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53DelegationSetMod.DelegationSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class HealthCheck protected ()
    extends atPulumiAwsLib.route53Mod.HealthCheck {
    /**
      * Create a HealthCheck resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.route53HealthCheckMod.HealthCheckArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53HealthCheckMod.HealthCheckArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class QueryLog protected ()
    extends atPulumiAwsLib.route53Mod.QueryLog {
    /**
      * Create a QueryLog resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.route53QueryLogMod.QueryLogArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53QueryLogMod.QueryLogArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Record protected ()
    extends atPulumiAwsLib.route53Mod.Record {
    /**
      * Create a Record resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.route53RecordMod.RecordArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53RecordMod.RecordArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Zone protected ()
    extends atPulumiAwsLib.route53Mod.Zone {
    /**
      * Create a Zone resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ZoneMod.ZoneArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ZoneMod.ZoneArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ZoneAssociation protected ()
    extends atPulumiAwsLib.route53Mod.ZoneAssociation {
    /**
      * Create a ZoneAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getDelegationSet(args: atPulumiAwsLib.route53GetDelegationSetMod.GetDelegationSetArgs): js.Promise[atPulumiAwsLib.route53GetDelegationSetMod.GetDelegationSetResult] = js.native
  def getDelegationSet(
    args: atPulumiAwsLib.route53GetDelegationSetMod.GetDelegationSetArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.route53GetDelegationSetMod.GetDelegationSetResult] = js.native
  def getZone(): js.Promise[atPulumiAwsLib.route53GetZoneMod.GetZoneResult] = js.native
  def getZone(args: atPulumiAwsLib.route53GetZoneMod.GetZoneArgs): js.Promise[atPulumiAwsLib.route53GetZoneMod.GetZoneResult] = js.native
  def getZone(
    args: atPulumiAwsLib.route53GetZoneMod.GetZoneArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.route53GetZoneMod.GetZoneResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53DelegationSetMod.DelegationSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53DelegationSetMod.DelegationSetState
    ): atPulumiAwsLib.route53DelegationSetMod.DelegationSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53DelegationSetMod.DelegationSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53DelegationSetMod.DelegationSet = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53HealthCheckMod.HealthCheck = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53HealthCheckMod.HealthCheckState
    ): atPulumiAwsLib.route53HealthCheckMod.HealthCheck = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53HealthCheckMod.HealthCheckState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53HealthCheckMod.HealthCheck = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53QueryLogMod.QueryLog = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53QueryLogMod.QueryLogState
    ): atPulumiAwsLib.route53QueryLogMod.QueryLog = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53QueryLogMod.QueryLogState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53QueryLogMod.QueryLog = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53RecordMod.Record = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53RecordMod.RecordState
    ): atPulumiAwsLib.route53RecordMod.Record = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53RecordMod.RecordState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53RecordMod.Record = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53ZoneMod.Zone = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ZoneMod.ZoneState
    ): atPulumiAwsLib.route53ZoneMod.Zone = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ZoneMod.ZoneState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53ZoneMod.Zone = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationState
    ): atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.route53ZoneAssociationMod.ZoneAssociation = js.native
  }
  
}

