package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getHostedZoneMod {
  
  @JSImport("@pulumi/aws/elasticbeanstalk/getHostedZone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getHostedZone(): js.Promise[GetHostedZoneResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZone")().asInstanceOf[js.Promise[GetHostedZoneResult]]
  @scala.inline
  def getHostedZone(args: Unit, opts: InvokeOptions): js.Promise[GetHostedZoneResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZone")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetHostedZoneResult]]
  @scala.inline
  def getHostedZone(args: GetHostedZoneArgs): js.Promise[GetHostedZoneResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZone")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetHostedZoneResult]]
  @scala.inline
  def getHostedZone(args: GetHostedZoneArgs, opts: InvokeOptions): js.Promise[GetHostedZoneResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZone")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetHostedZoneResult]]
  
  trait GetHostedZoneArgs extends StObject {
    
    /**
      * The region you'd like the zone for. By default, fetches the current region.
      */
    val region: js.UndefOr[String] = js.undefined
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
  
  trait GetHostedZoneResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The region of the hosted zone.
      */
    val region: js.UndefOr[String] = js.undefined
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
