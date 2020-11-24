package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLogging extends js.Object {
  
  /**
    * The name of the bucket that will receive the log objects.
    */
  var targetBucket: String = js.native
  
  /**
    * To specify a key prefix for log objects.
    */
  var targetPrefix: js.UndefOr[String] = js.native
}
object BucketLogging {
  
  @scala.inline
  def apply(targetBucket: String): BucketLogging = {
    val __obj = js.Dynamic.literal(targetBucket = targetBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLogging]
  }
  
  @scala.inline
  implicit class BucketLoggingOps[Self <: BucketLogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTargetBucket(value: String): Self = this.set("targetBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPrefix(value: String): Self = this.set("targetPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPrefix: Self = this.set("targetPrefix", js.undefined)
  }
}
