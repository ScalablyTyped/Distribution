package typings
package samlpLib.samlpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileMapper extends js.Object {
  var metadata: js.Array[MetadataItem]
  def getClaims(): js.Any
  def getNameIdentifier(): js.Any
}

object ProfileMapper {
  @scala.inline
  def apply(
    getClaims: js.Function0[js.Any],
    getNameIdentifier: js.Function0[js.Any],
    metadata: js.Array[MetadataItem]
  ): ProfileMapper = {
    val __obj = js.Dynamic.literal(getClaims = getClaims, getNameIdentifier = getNameIdentifier, metadata = metadata)
  
    __obj.asInstanceOf[ProfileMapper]
  }
}

