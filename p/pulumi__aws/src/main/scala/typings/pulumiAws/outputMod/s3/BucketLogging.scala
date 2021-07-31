package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLogging extends StObject {
  
  /**
    * The name of the bucket that will receive the log objects.
    */
  var targetBucket: String
  
  /**
    * To specify a key prefix for log objects.
    */
  var targetPrefix: js.UndefOr[String] = js.undefined
}
object BucketLogging {
  
  @scala.inline
  def apply(targetBucket: String): BucketLogging = {
    val __obj = js.Dynamic.literal(targetBucket = targetBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLogging]
  }
  
  @scala.inline
  implicit class BucketLoggingMutableBuilder[Self <: BucketLogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetBucket(value: String): Self = StObject.set(x, "targetBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPrefix(value: String): Self = StObject.set(x, "targetPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPrefixUndefined: Self = StObject.set(x, "targetPrefix", js.undefined)
  }
}
