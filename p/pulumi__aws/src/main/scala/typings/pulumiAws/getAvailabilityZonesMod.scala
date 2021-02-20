package typings.pulumiAws

import typings.pulumiAws.inputMod.GetAvailabilityZonesFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAvailabilityZonesMod {
  
  @JSImport("@pulumi/aws/getAvailabilityZones", "getAvailabilityZones")
  @js.native
  def getAvailabilityZones(): js.Promise[GetAvailabilityZonesResult] = js.native
  @JSImport("@pulumi/aws/getAvailabilityZones", "getAvailabilityZones")
  @js.native
  def getAvailabilityZones(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetAvailabilityZonesResult] = js.native
  @JSImport("@pulumi/aws/getAvailabilityZones", "getAvailabilityZones")
  @js.native
  def getAvailabilityZones(args: GetAvailabilityZonesArgs): js.Promise[GetAvailabilityZonesResult] = js.native
  @JSImport("@pulumi/aws/getAvailabilityZones", "getAvailabilityZones")
  @js.native
  def getAvailabilityZones(args: GetAvailabilityZonesArgs, opts: InvokeOptions): js.Promise[GetAvailabilityZonesResult] = js.native
  
  @js.native
  trait GetAvailabilityZonesArgs extends StObject {
    
    /**
      * Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
      */
    val allAvailabilityZones: js.UndefOr[Boolean] = js.native
    
    /**
      * List of Availability Zone names to exclude.
      */
    val excludeNames: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * List of Availability Zone IDs to exclude.
      */
    val excludeZoneIds: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Configuration block(s) for filtering. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetAvailabilityZonesFilter]] = js.native
    
    /**
      * Allows to filter list of Availability Zones based on their
      * current state. Can be either `"available"`, `"information"`, `"impaired"` or
      * `"unavailable"`. By default the list includes a complete set of Availability Zones
      * to which the underlying AWS account has access, regardless of their state.
      */
    val state: js.UndefOr[String] = js.native
  }
  object GetAvailabilityZonesArgs {
    
    @scala.inline
    def apply(): GetAvailabilityZonesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAvailabilityZonesArgs]
    }
    
    @scala.inline
    implicit class GetAvailabilityZonesArgsMutableBuilder[Self <: GetAvailabilityZonesArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllAvailabilityZones(value: Boolean): Self = StObject.set(x, "allAvailabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllAvailabilityZonesUndefined: Self = StObject.set(x, "allAvailabilityZones", js.undefined)
      
      @scala.inline
      def setExcludeNames(value: js.Array[String]): Self = StObject.set(x, "excludeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeNamesUndefined: Self = StObject.set(x, "excludeNames", js.undefined)
      
      @scala.inline
      def setExcludeNamesVarargs(value: String*): Self = StObject.set(x, "excludeNames", js.Array(value :_*))
      
      @scala.inline
      def setExcludeZoneIds(value: js.Array[String]): Self = StObject.set(x, "excludeZoneIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeZoneIdsUndefined: Self = StObject.set(x, "excludeZoneIds", js.undefined)
      
      @scala.inline
      def setExcludeZoneIdsVarargs(value: String*): Self = StObject.set(x, "excludeZoneIds", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[GetAvailabilityZonesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetAvailabilityZonesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait GetAvailabilityZonesResult extends StObject {
    
    val allAvailabilityZones: js.UndefOr[Boolean] = js.native
    
    val excludeNames: js.UndefOr[js.Array[String]] = js.native
    
    val excludeZoneIds: js.UndefOr[js.Array[String]] = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.GetAvailabilityZonesFilter]] = js.native
    
    val groupNames: js.Array[String] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * A list of the Availability Zone names available to the account.
      */
    val names: js.Array[String] = js.native
    
    val state: js.UndefOr[String] = js.native
    
    /**
      * A list of the Availability Zone IDs available to the account.
      */
    val zoneIds: js.Array[String] = js.native
  }
  object GetAvailabilityZonesResult {
    
    @scala.inline
    def apply(groupNames: js.Array[String], id: String, names: js.Array[String], zoneIds: js.Array[String]): GetAvailabilityZonesResult = {
      val __obj = js.Dynamic.literal(groupNames = groupNames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], zoneIds = zoneIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAvailabilityZonesResult]
    }
    
    @scala.inline
    implicit class GetAvailabilityZonesResultMutableBuilder[Self <: GetAvailabilityZonesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllAvailabilityZones(value: Boolean): Self = StObject.set(x, "allAvailabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllAvailabilityZonesUndefined: Self = StObject.set(x, "allAvailabilityZones", js.undefined)
      
      @scala.inline
      def setExcludeNames(value: js.Array[String]): Self = StObject.set(x, "excludeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeNamesUndefined: Self = StObject.set(x, "excludeNames", js.undefined)
      
      @scala.inline
      def setExcludeNamesVarargs(value: String*): Self = StObject.set(x, "excludeNames", js.Array(value :_*))
      
      @scala.inline
      def setExcludeZoneIds(value: js.Array[String]): Self = StObject.set(x, "excludeZoneIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeZoneIdsUndefined: Self = StObject.set(x, "excludeZoneIds", js.undefined)
      
      @scala.inline
      def setExcludeZoneIdsVarargs(value: String*): Self = StObject.set(x, "excludeZoneIds", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.GetAvailabilityZonesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.GetAvailabilityZonesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setGroupNames(value: js.Array[String]): Self = StObject.set(x, "groupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNamesVarargs(value: String*): Self = StObject.set(x, "groupNames", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setZoneIds(value: js.Array[String]): Self = StObject.set(x, "zoneIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneIdsVarargs(value: String*): Self = StObject.set(x, "zoneIds", js.Array(value :_*))
    }
  }
}
