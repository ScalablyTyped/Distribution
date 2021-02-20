package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends StObject {
  
  var arn: String | StringDictionary[js.Any] = js.native
  
  var batchSize: js.UndefOr[Double | String] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var startingPosition: js.UndefOr[Double | String] = js.native
}
object Stream {
  
  @scala.inline
  def apply(arn: String | StringDictionary[js.Any]): Stream = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  
  @scala.inline
  implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSize(value: Double | String): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setStartingPosition(value: Double | String): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingPositionUndefined: Self = StObject.set(x, "startingPosition", js.undefined)
  }
}
