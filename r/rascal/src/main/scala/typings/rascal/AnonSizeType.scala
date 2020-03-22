package typings.rascal

import typings.rascal.rascalStrings.inMemory
import typings.rascal.rascalStrings.inMemoryCluster
import typings.rascal.rascalStrings.stub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSizeType extends js.Object {
  var size: js.UndefOr[Double] = js.undefined
  var `type`: stub | inMemory | inMemoryCluster
}

object AnonSizeType {
  @scala.inline
  def apply(`type`: stub | inMemory | inMemoryCluster, size: Int | Double = null): AnonSizeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizeType]
  }
}

