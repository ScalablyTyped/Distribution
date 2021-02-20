package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarSdk.stellarSdkNumbers.`400`
import typings.stellarSdk.stellarSdkNumbers.`429`
import typings.stellarSdk.stellarSdkNumbers.`500`
import typings.stellarSdk.stellarSdkStrings.`Internal Server Error`
import typings.stellarSdk.stellarSdkStrings.`Rate Limit Exceeded`
import typings.stellarSdk.stellarSdkStrings.`Transaction Failed`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.RateLimitExceeded
  - typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.InternalServerError
  - typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.TransactionFailed
*/
trait ErrorResponseData extends StObject
object ErrorResponseData {
  
  @js.native
  trait Base extends StObject {
    
    var details: String = js.native
    
    var instance: String = js.native
    
    var status: Double = js.native
    
    var title: String = js.native
    
    var `type`: String = js.native
  }
  object Base {
    
    @scala.inline
    def apply(details: String, instance: String, status: Double, title: String, `type`: String): Base = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InternalServerError
    extends Base
       with ErrorResponseData {
    
    @JSName("status")
    var status_InternalServerError: `500` = js.native
    
    @JSName("title")
    var title_InternalServerError: `Internal Server Error` = js.native
  }
  @scala.inline
  def InternalServerError(details: String, instance: String, status: `500`, title: `Internal Server Error`, `type`: String): typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.InternalServerError = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.InternalServerError]
  }
  object InternalServerError {
    
    @scala.inline
    def apply(details: String, instance: String, status: `500`, title: `Internal Server Error`, `type`: String): InternalServerError = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalServerError]
    }
    
    @scala.inline
    implicit class InternalServerErrorMutableBuilder[Self <: InternalServerError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: `500`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: `Internal Server Error`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RateLimitExceeded
    extends Base
       with ErrorResponseData {
    
    @JSName("status")
    var status_RateLimitExceeded: `429` = js.native
    
    @JSName("title")
    var title_RateLimitExceeded: `Rate Limit Exceeded` = js.native
  }
  @scala.inline
  def RateLimitExceeded(details: String, instance: String, status: `429`, title: `Rate Limit Exceeded`, `type`: String): typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.RateLimitExceeded = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.RateLimitExceeded]
  }
  object RateLimitExceeded {
    
    @scala.inline
    def apply(details: String, instance: String, status: `429`, title: `Rate Limit Exceeded`, `type`: String): RateLimitExceeded = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateLimitExceeded]
    }
    
    @scala.inline
    implicit class RateLimitExceededMutableBuilder[Self <: RateLimitExceeded] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: `429`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: `Rate Limit Exceeded`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransactionFailed
    extends Base
       with ErrorResponseData {
    
    var extras: TransactionFailedExtras = js.native
    
    @JSName("status")
    var status_TransactionFailed: `400` = js.native
    
    @JSName("title")
    var title_TransactionFailed: `Transaction Failed` = js.native
  }
  @scala.inline
  def TransactionFailed(
    details: String,
    extras: TransactionFailedExtras,
    instance: String,
    status: `400`,
    title: `Transaction Failed`,
    `type`: String
  ): typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.TransactionFailed = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.TransactionFailed]
  }
  object TransactionFailed {
    
    @scala.inline
    def apply(
      details: String,
      extras: TransactionFailedExtras,
      instance: String,
      status: `400`,
      title: `Transaction Failed`,
      `type`: String
    ): TransactionFailed = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionFailed]
    }
    
    @scala.inline
    implicit class TransactionFailedMutableBuilder[Self <: TransactionFailed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtras(value: TransactionFailedExtras): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: `400`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: `Transaction Failed`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
