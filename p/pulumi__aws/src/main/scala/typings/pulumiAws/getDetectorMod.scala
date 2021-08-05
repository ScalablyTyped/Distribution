package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDetectorMod {
  
  @JSImport("@pulumi/aws/guardduty/getDetector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDetector(): js.Promise[GetDetectorResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetector")().asInstanceOf[js.Promise[GetDetectorResult]]
  inline def getDetector(args: Unit, opts: InvokeOptions): js.Promise[GetDetectorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDetector")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDetectorResult]]
  inline def getDetector(args: GetDetectorArgs): js.Promise[GetDetectorResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDetector")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDetectorResult]]
  inline def getDetector(args: GetDetectorArgs, opts: InvokeOptions): js.Promise[GetDetectorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDetector")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDetectorResult]]
  
  trait GetDetectorArgs extends StObject {
    
    /**
      * The ID of the detector.
      */
    val id: js.UndefOr[String] = js.undefined
  }
  object GetDetectorArgs {
    
    inline def apply(): GetDetectorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDetectorArgs]
    }
    
    extension [Self <: GetDetectorArgs](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait GetDetectorResult extends StObject {
    
    /**
      * The frequency of notifications sent about subsequent finding occurrences.
      */
    val findingPublishingFrequency: String
    
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * The service-linked role that grants GuardDuty access to the resources in the AWS account.
      */
    val serviceRoleArn: String
    
    /**
      * The current status of the detector.
      */
    val status: String
  }
  object GetDetectorResult {
    
    inline def apply(findingPublishingFrequency: String, serviceRoleArn: String, status: String): GetDetectorResult = {
      val __obj = js.Dynamic.literal(findingPublishingFrequency = findingPublishingFrequency.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDetectorResult]
    }
    
    extension [Self <: GetDetectorResult](x: Self) {
      
      inline def setFindingPublishingFrequency(value: String): Self = StObject.set(x, "findingPublishingFrequency", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setServiceRoleArn(value: String): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
