package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteSourceFromS3MaxAgeInDaysMaxCount extends js.Object {
  var deleteSourceFromS3: scala.Boolean
  var maxAgeInDays: scala.Double
  var maxCount: scala.Double
  var serviceRole: java.lang.String
}

object Anon_DeleteSourceFromS3MaxAgeInDaysMaxCount {
  @scala.inline
  def apply(
    deleteSourceFromS3: scala.Boolean,
    maxAgeInDays: scala.Double,
    maxCount: scala.Double,
    serviceRole: java.lang.String
  ): Anon_DeleteSourceFromS3MaxAgeInDaysMaxCount = {
    val __obj = js.Dynamic.literal(deleteSourceFromS3 = deleteSourceFromS3, maxAgeInDays = maxAgeInDays, maxCount = maxCount, serviceRole = serviceRole)
  
    __obj.asInstanceOf[Anon_DeleteSourceFromS3MaxAgeInDaysMaxCount]
  }
}

