package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEndpointMod {
  
  @JSImport("@pulumi/aws/iot/getEndpoint", "getEndpoint")
  @js.native
  def getEndpoint(): js.Promise[GetEndpointResult] = js.native
  @JSImport("@pulumi/aws/iot/getEndpoint", "getEndpoint")
  @js.native
  def getEndpoint(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEndpointResult] = js.native
  @JSImport("@pulumi/aws/iot/getEndpoint", "getEndpoint")
  @js.native
  def getEndpoint(args: GetEndpointArgs): js.Promise[GetEndpointResult] = js.native
  @JSImport("@pulumi/aws/iot/getEndpoint", "getEndpoint")
  @js.native
  def getEndpoint(args: GetEndpointArgs, opts: InvokeOptions): js.Promise[GetEndpointResult] = js.native
  
  @js.native
  trait GetEndpointArgs extends StObject {
    
    /**
      * Endpoint type. Valid values: `iot:CredentialProvider`, `iot:Data`, `iot:Data-ATS`, `iot:Job`.
      */
    val endpointType: js.UndefOr[String] = js.native
  }
  object GetEndpointArgs {
    
    @scala.inline
    def apply(): GetEndpointArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetEndpointArgs]
    }
    
    @scala.inline
    implicit class GetEndpointArgsMutableBuilder[Self <: GetEndpointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointType(value: String): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointTypeUndefined: Self = StObject.set(x, "endpointType", js.undefined)
    }
  }
  
  @js.native
  trait GetEndpointResult extends StObject {
    
    /**
      * The endpoint based on `endpointType`:
      * * No `endpointType`: Either `iot:Data` or `iot:Data-ATS` [depending on region](https://aws.amazon.com/blogs/iot/aws-iot-core-ats-endpoints/)
      * * `iot:CredentialsProvider`: `IDENTIFIER.credentials.iot.REGION.amazonaws.com`
      * * `iot:Data`: `IDENTIFIER.iot.REGION.amazonaws.com`
      * * `iot:Data-ATS`: `IDENTIFIER-ats.iot.REGION.amazonaws.com`
      * * `iot:Job`: `IDENTIFIER.jobs.iot.REGION.amazonaws.com`
      */
    val endpointAddress: String = js.native
    
    val endpointType: js.UndefOr[String] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
  }
  object GetEndpointResult {
    
    @scala.inline
    def apply(endpointAddress: String, id: String): GetEndpointResult = {
      val __obj = js.Dynamic.literal(endpointAddress = endpointAddress.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEndpointResult]
    }
    
    @scala.inline
    implicit class GetEndpointResultMutableBuilder[Self <: GetEndpointResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointAddress(value: String): Self = StObject.set(x, "endpointAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointType(value: String): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointTypeUndefined: Self = StObject.set(x, "endpointType", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
