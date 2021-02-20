package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getHostedZoneIdMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancing/getHostedZoneId", "getHostedZoneId")
  @js.native
  def getHostedZoneId(): js.Promise[GetHostedZoneIdResult] = js.native
  @JSImport("@pulumi/aws/elasticloadbalancing/getHostedZoneId", "getHostedZoneId")
  @js.native
  def getHostedZoneId(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = js.native
  @JSImport("@pulumi/aws/elasticloadbalancing/getHostedZoneId", "getHostedZoneId")
  @js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs): js.Promise[GetHostedZoneIdResult] = js.native
  @JSImport("@pulumi/aws/elasticloadbalancing/getHostedZoneId", "getHostedZoneId")
  @js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs, opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = js.native
  
  @js.native
  trait GetHostedZoneIdArgs extends StObject {
    
    /**
      * Name of the region whose AWS ELB HostedZoneId is desired.
      * Defaults to the region from the AWS provider configuration.
      */
    val region: js.UndefOr[String] = js.native
  }
  object GetHostedZoneIdArgs {
    
    @scala.inline
    def apply(): GetHostedZoneIdArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetHostedZoneIdArgs]
    }
    
    @scala.inline
    implicit class GetHostedZoneIdArgsMutableBuilder[Self <: GetHostedZoneIdArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  @js.native
  trait GetHostedZoneIdResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val region: js.UndefOr[String] = js.native
  }
  object GetHostedZoneIdResult {
    
    @scala.inline
    def apply(id: String): GetHostedZoneIdResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetHostedZoneIdResult]
    }
    
    @scala.inline
    implicit class GetHostedZoneIdResultMutableBuilder[Self <: GetHostedZoneIdResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
}
