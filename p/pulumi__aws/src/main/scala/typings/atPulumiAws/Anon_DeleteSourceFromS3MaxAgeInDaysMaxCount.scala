package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteSourceFromS3MaxAgeInDaysMaxCount extends js.Object {
  var deleteSourceFromS3: Boolean
  var maxAgeInDays: Double
  var maxCount: Double
  var serviceRole: String
}

object Anon_DeleteSourceFromS3MaxAgeInDaysMaxCount {
  @scala.inline
  def apply(deleteSourceFromS3: Boolean, maxAgeInDays: Double, maxCount: Double, serviceRole: String): Anon_DeleteSourceFromS3MaxAgeInDaysMaxCount = {
    val __obj = js.Dynamic.literal(deleteSourceFromS3 = deleteSourceFromS3, maxAgeInDays = maxAgeInDays, maxCount = maxCount, serviceRole = serviceRole)
  
    __obj.asInstanceOf[Anon_DeleteSourceFromS3MaxAgeInDaysMaxCount]
  }
}

