package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDetectorMod {
  
  @JSImport("@pulumi/aws/guardduty/getDetector", "getDetector")
  @js.native
  def getDetector(): js.Promise[GetDetectorResult] = js.native
  @JSImport("@pulumi/aws/guardduty/getDetector", "getDetector")
  @js.native
  def getDetector(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetDetectorResult] = js.native
  @JSImport("@pulumi/aws/guardduty/getDetector", "getDetector")
  @js.native
  def getDetector(args: GetDetectorArgs): js.Promise[GetDetectorResult] = js.native
  @JSImport("@pulumi/aws/guardduty/getDetector", "getDetector")
  @js.native
  def getDetector(args: GetDetectorArgs, opts: InvokeOptions): js.Promise[GetDetectorResult] = js.native
  
  @js.native
  trait GetDetectorArgs extends StObject {
    
    /**
      * The ID of the detector.
      */
    val id: js.UndefOr[String] = js.native
  }
  object GetDetectorArgs {
    
    @scala.inline
    def apply(): GetDetectorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDetectorArgs]
    }
    
    @scala.inline
    implicit class GetDetectorArgsMutableBuilder[Self <: GetDetectorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  @js.native
  trait GetDetectorResult extends StObject {
    
    /**
      * The frequency of notifications sent about subsequent finding occurrences.
      */
    val findingPublishingFrequency: String = js.native
    
    val id: js.UndefOr[String] = js.native
    
    /**
      * The service-linked role that grants GuardDuty access to the resources in the AWS account.
      */
    val serviceRoleArn: String = js.native
    
    /**
      * The current status of the detector.
      */
    val status: String = js.native
  }
  object GetDetectorResult {
    
    @scala.inline
    def apply(findingPublishingFrequency: String, serviceRoleArn: String, status: String): GetDetectorResult = {
      val __obj = js.Dynamic.literal(findingPublishingFrequency = findingPublishingFrequency.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDetectorResult]
    }
    
    @scala.inline
    implicit class GetDetectorResultMutableBuilder[Self <: GetDetectorResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindingPublishingFrequency(value: String): Self = StObject.set(x, "findingPublishingFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setServiceRoleArn(value: String): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
