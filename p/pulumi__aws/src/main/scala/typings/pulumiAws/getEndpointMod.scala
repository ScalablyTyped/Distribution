package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEndpointMod {
  
  @JSImport("@pulumi/aws/iot/getEndpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpoint(): js.Promise[GetEndpointResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpoint")().asInstanceOf[js.Promise[GetEndpointResult]]
  inline def getEndpoint(args: Unit, opts: InvokeOptions): js.Promise[GetEndpointResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEndpointResult]]
  inline def getEndpoint(args: GetEndpointArgs): js.Promise[GetEndpointResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpoint")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEndpointResult]]
  inline def getEndpoint(args: GetEndpointArgs, opts: InvokeOptions): js.Promise[GetEndpointResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEndpointResult]]
  
  trait GetEndpointArgs extends StObject {
    
    /**
      * Endpoint type. Valid values: `iot:CredentialProvider`, `iot:Data`, `iot:Data-ATS`, `iot:Job`.
      */
    val endpointType: js.UndefOr[String] = js.undefined
  }
  object GetEndpointArgs {
    
    inline def apply(): GetEndpointArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetEndpointArgs]
    }
    
    extension [Self <: GetEndpointArgs](x: Self) {
      
      inline def setEndpointType(value: String): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
      
      inline def setEndpointTypeUndefined: Self = StObject.set(x, "endpointType", js.undefined)
    }
  }
  
  trait GetEndpointResult extends StObject {
    
    /**
      * The endpoint based on `endpointType`:
      * * No `endpointType`: Either `iot:Data` or `iot:Data-ATS` [depending on region](https://aws.amazon.com/blogs/iot/aws-iot-core-ats-endpoints/)
      * * `iot:CredentialsProvider`: `IDENTIFIER.credentials.iot.REGION.amazonaws.com`
      * * `iot:Data`: `IDENTIFIER.iot.REGION.amazonaws.com`
      * * `iot:Data-ATS`: `IDENTIFIER-ats.iot.REGION.amazonaws.com`
      * * `iot:Job`: `IDENTIFIER.jobs.iot.REGION.amazonaws.com`
      */
    val endpointAddress: String
    
    val endpointType: js.UndefOr[String] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
  }
  object GetEndpointResult {
    
    inline def apply(endpointAddress: String, id: String): GetEndpointResult = {
      val __obj = js.Dynamic.literal(endpointAddress = endpointAddress.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEndpointResult]
    }
    
    extension [Self <: GetEndpointResult](x: Self) {
      
      inline def setEndpointAddress(value: String): Self = StObject.set(x, "endpointAddress", value.asInstanceOf[js.Any])
      
      inline def setEndpointType(value: String): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
      
      inline def setEndpointTypeUndefined: Self = StObject.set(x, "endpointType", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
