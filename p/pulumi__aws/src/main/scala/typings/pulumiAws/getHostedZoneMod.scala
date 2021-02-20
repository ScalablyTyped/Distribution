package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getHostedZoneMod {
  
  @JSImport("@pulumi/aws/elasticbeanstalk/getHostedZone", "getHostedZone")
  @js.native
  def getHostedZone(): js.Promise[GetHostedZoneResult] = js.native
  @JSImport("@pulumi/aws/elasticbeanstalk/getHostedZone", "getHostedZone")
  @js.native
  def getHostedZone(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetHostedZoneResult] = js.native
  @JSImport("@pulumi/aws/elasticbeanstalk/getHostedZone", "getHostedZone")
  @js.native
  def getHostedZone(args: GetHostedZoneArgs): js.Promise[GetHostedZoneResult] = js.native
  @JSImport("@pulumi/aws/elasticbeanstalk/getHostedZone", "getHostedZone")
  @js.native
  def getHostedZone(args: GetHostedZoneArgs, opts: InvokeOptions): js.Promise[GetHostedZoneResult] = js.native
  
  @js.native
  trait GetHostedZoneArgs extends StObject {
    
    /**
      * The region you'd like the zone for. By default, fetches the current region.
      */
    val region: js.UndefOr[String] = js.native
  }
  object GetHostedZoneArgs {
    
    @scala.inline
    def apply(): GetHostedZoneArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetHostedZoneArgs]
    }
    
    @scala.inline
    implicit class GetHostedZoneArgsMutableBuilder[Self <: GetHostedZoneArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  @js.native
  trait GetHostedZoneResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The region of the hosted zone.
      */
    val region: js.UndefOr[String] = js.native
  }
  object GetHostedZoneResult {
    
    @scala.inline
    def apply(id: String): GetHostedZoneResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetHostedZoneResult]
    }
    
    @scala.inline
    implicit class GetHostedZoneResultMutableBuilder[Self <: GetHostedZoneResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
}
