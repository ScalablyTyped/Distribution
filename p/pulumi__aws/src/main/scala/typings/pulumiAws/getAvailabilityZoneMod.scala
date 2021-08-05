package typings.pulumiAws

import typings.pulumiAws.inputMod.GetAvailabilityZoneFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAvailabilityZoneMod {
  
  @JSImport("@pulumi/aws/getAvailabilityZone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAvailabilityZone(): js.Promise[GetAvailabilityZoneResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailabilityZone")().asInstanceOf[js.Promise[GetAvailabilityZoneResult]]
  inline def getAvailabilityZone(args: Unit, opts: InvokeOptions): js.Promise[GetAvailabilityZoneResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAvailabilityZone")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAvailabilityZoneResult]]
  inline def getAvailabilityZone(args: GetAvailabilityZoneArgs): js.Promise[GetAvailabilityZoneResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailabilityZone")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAvailabilityZoneResult]]
  inline def getAvailabilityZone(args: GetAvailabilityZoneArgs, opts: InvokeOptions): js.Promise[GetAvailabilityZoneResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAvailabilityZone")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAvailabilityZoneResult]]
  
  trait GetAvailabilityZoneArgs extends StObject {
    
    /**
      * Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
      */
    val allAvailabilityZones: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configuration block(s) for filtering. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetAvailabilityZoneFilter]] = js.undefined
    
    /**
      * The name of the filter field. Valid values can be found in the [EC2 DescribeAvailabilityZones API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html).
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * A specific availability zone state to require. May be any of `"available"`, `"information"` or `"impaired"`.
      */
    val state: js.UndefOr[String] = js.undefined
    
    /**
      * The zone ID of the availability zone to select.
      */
    val zoneId: js.UndefOr[String] = js.undefined
  }
  object GetAvailabilityZoneArgs {
    
    inline def apply(): GetAvailabilityZoneArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAvailabilityZoneArgs]
    }
    
    extension [Self <: GetAvailabilityZoneArgs](x: Self) {
      
      inline def setAllAvailabilityZones(value: Boolean): Self = StObject.set(x, "allAvailabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAllAvailabilityZonesUndefined: Self = StObject.set(x, "allAvailabilityZones", js.undefined)
      
      inline def setFilters(value: js.Array[GetAvailabilityZoneFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetAvailabilityZoneFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
      
      inline def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
    }
  }
  
  trait GetAvailabilityZoneResult extends StObject {
    
    val allAvailabilityZones: js.UndefOr[Boolean] = js.undefined
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.GetAvailabilityZoneFilter]] = js.undefined
    
    /**
      * For Availability Zones, this is the same value as the Region name. For Local Zones, the name of the associated group, for example `us-west-2-lax-1`.
      */
    val groupName: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    /**
      * The part of the AZ name that appears after the region name, uniquely identifying the AZ within its region.
      */
    val nameSuffix: String
    
    /**
      * The name of the location from which the address is advertised.
      */
    val networkBorderGroup: String
    
    /**
      * For Availability Zones, this always has the value of `opt-in-not-required`. For Local Zones, this is the opt in status. The possible values are `opted-in` and `not-opted-in`.
      */
    val optInStatus: String
    
    /**
      * The region where the selected availability zone resides. This is always the region selected on the provider, since this data source searches only within that region.
      */
    val region: String
    
    val state: String
    
    val zoneId: String
  }
  object GetAvailabilityZoneResult {
    
    inline def apply(
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
    
    extension [Self <: GetAvailabilityZoneResult](x: Self) {
      
      inline def setAllAvailabilityZones(value: Boolean): Self = StObject.set(x, "allAvailabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAllAvailabilityZonesUndefined: Self = StObject.set(x, "allAvailabilityZones", js.undefined)
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.GetAvailabilityZoneFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.GetAvailabilityZoneFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameSuffix(value: String): Self = StObject.set(x, "nameSuffix", value.asInstanceOf[js.Any])
      
      inline def setNetworkBorderGroup(value: String): Self = StObject.set(x, "networkBorderGroup", value.asInstanceOf[js.Any])
      
      inline def setOptInStatus(value: String): Self = StObject.set(x, "optInStatus", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setZoneId(value: String): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
}
