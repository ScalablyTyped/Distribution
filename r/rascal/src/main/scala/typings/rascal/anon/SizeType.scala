package typings.rascal.anon

import typings.rascal.rascalStrings.inMemory
import typings.rascal.rascalStrings.inMemoryCluster
import typings.rascal.rascalStrings.stub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeType extends js.Object {
  var size: js.UndefOr[Double] = js.undefined
  var `type`: stub | inMemory | inMemoryCluster
}

object SizeType {
  @scala.inline
  def apply(`type`: stub | inMemory | inMemoryCluster, size: js.UndefOr[Double] = js.undefined): SizeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeType]
  }
}

