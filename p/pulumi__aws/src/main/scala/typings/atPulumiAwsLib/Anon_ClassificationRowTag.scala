package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassificationRowTag extends js.Object {
  var classification: java.lang.String
  var rowTag: java.lang.String
}

object Anon_ClassificationRowTag {
  @scala.inline
  def apply(classification: java.lang.String, rowTag: java.lang.String): Anon_ClassificationRowTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("classification")(classification)
    __obj.updateDynamic("rowTag")(rowTag)
    __obj.asInstanceOf[Anon_ClassificationRowTag]
  }
}

