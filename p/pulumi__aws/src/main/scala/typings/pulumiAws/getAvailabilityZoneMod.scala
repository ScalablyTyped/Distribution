package typings.pulumiAws

import typings.pulumiAws.inputMod.GetAvailabilityZoneFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAvailabilityZoneMod {
  
  @JSImport("@pulumi/aws/getAvailabilityZone", "getAvailabilityZone")
  @js.native
  def getAvailabilityZone(): js.Promise[GetAvailabilityZoneResult] = js.native
  @JSImport("@pulumi/aws/getAvailabilityZone", "getAvailabilityZone")
  @js.native
  def getAvailabilityZone(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetAvailabilityZoneResult] = js.native
  @JSImport("@pulumi/aws/getAvailabilityZone", "getAvailabilityZone")
  @js.native
  def getAvailabilityZone(args: GetAvailabilityZoneArgs): js.Promise[GetAvailabilityZoneResult] = js.native
  @JSImport("@pulumi/aws/getAvailabilityZone", "getAvailabilityZone")
  @js.native
  def getAvailabilityZone(args: GetAvailabilityZoneArgs, opts: InvokeOptions): js.Promise[GetAvailabilityZoneResult] = js.native
  
  @js.native
  trait GetAvailabilityZoneArgs extends StObject {
    
    /**
      * Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
      */
    val allAvailabilityZones: js.UndefOr[Boolean] = js.native
    
    /**
      * Configuration block(s) for filtering. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetAvailabilityZoneFilter]] = js.native
    
    /**
      * The name of the filter field. Valid values can be found in the [EC2 DescribeAvailabilityZones API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html).
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * A specific availability zone state to require. May be any of `"available"`, `"information"` or `"impaired"`.
      */
    val state: js.UndefOr[String] = js.native
    
    /**
      * The zone ID of the availability zone to select.
      */
    val zoneId: js.UndefOr[String] = js.native
  }
  object GetAvailabilityZoneArgs {
    
    @scala.inline
    def apply(): GetAvailabilityZoneArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAvailabilityZoneArgs]
    }
    
    @scala.inline
    implicit class GetAvailabilityZoneArgsMutableBuilder[Self <: GetAvailabilityZoneArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllAvailabilityZones(value: Boolean): Self = StObject.set(x, "allAvailabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllAvailabilityZonesUndefined: Self = StObject.set(x, "allAvailabilityZones", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[GetAvailabilityZoneFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetAvailabilityZoneFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
    }
  }
  
  @js.native
  trait GetAvailabilityZoneResult extends StObject {
    
    val allAvailabilityZones: js.UndefOr[Boolean] = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.GetAvailabilityZoneFilter]] = js.native
    
    /**
      * For Availability Zones, this is the same value as the Region name. For Local Zones, the name of the associated group, for example `us-west-2-lax-1`.
      */
    val groupName: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * The part of the AZ name that appears after the region name, uniquely identifying the AZ within its region.
      */
    val nameSuffix: String = js.native
    
    /**
      * The name of the location from which the address is advertised.
      */
    val networkBorderGroup: String = js.native
    
    /**
      * For Availability Zones, this always has the value of `opt-in-not-required`. For Local Zones, this is the opt in status. The possible values are `opted-in` and `not-opted-in`.
      */
    val optInStatus: String = js.native
    
    /**
      * The region where the selected availability zone resides. This is always the region selected on the provider, since this data source searches only within that region.
      */
    val region: String = js.native
    
    val state: String = js.native
    
    val zoneId: String = js.native
  }
  object GetAvailabilityZoneResult {
    
    @scala.inline
    def apply(
      groupName: String,
      id: String,
      name: String,
      nameSuffix: String,
      networkBorderGroup: String,
      optInStatus: String,
      region: String,
      state: String,
      zoneId: String
    ): GetAvailabilityZoneResult = {
      val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameSuffix = nameSuffix.asInstanceOf[js.Any], networkBorderGroup = networkBorderGroup.asInstanceOf[js.Any], optInStatus = optInStatus.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAvailabilityZoneResult]
    }
    
    @scala.inline
    implicit class GetAvailabilityZoneResultMutableBuilder[Self <: GetAvailabilityZoneResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllAvailabilityZones(value: Boolean): Self = StObject.set(x, "allAvailabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllAvailabilityZonesUndefined: Self = StObject.set(x, "allAvailabilityZones", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.GetAvailabilityZoneFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.GetAvailabilityZoneFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameSuffix(value: String): Self = StObject.set(x, "nameSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkBorderGroup(value: String): Self = StObject.set(x, "networkBorderGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptInStatus(value: String): Self = StObject.set(x, "optInStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
}
