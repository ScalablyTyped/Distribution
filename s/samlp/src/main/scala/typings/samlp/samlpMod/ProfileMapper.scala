package typings.samlp.samlpMod

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
  def apply(getClaims: () => js.Any, getNameIdentifier: () => js.Any, metadata: js.Array[MetadataItem]): ProfileMapper = {
    val __obj = js.Dynamic.literal(getClaims = js.Any.fromFunction0(getClaims), getNameIdentifier = js.Any.fromFunction0(getNameIdentifier), metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProfileMapper]
  }
}

