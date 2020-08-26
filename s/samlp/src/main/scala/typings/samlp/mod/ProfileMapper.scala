package typings.samlp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileMapper extends js.Object {
  var metadata: js.Array[MetadataItem] = js.native
  def getClaims(): js.Any = js.native
  def getNameIdentifier(): js.Any = js.native
}

object ProfileMapper {
  @scala.inline
  def apply(getClaims: () => js.Any, getNameIdentifier: () => js.Any, metadata: js.Array[MetadataItem]): ProfileMapper = {
    val __obj = js.Dynamic.literal(getClaims = js.Any.fromFunction0(getClaims), getNameIdentifier = js.Any.fromFunction0(getNameIdentifier), metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileMapper]
  }
  @scala.inline
  implicit class ProfileMapperOps[Self <: ProfileMapper] (val x: Self) extends AnyVal {
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
    def setGetClaims(value: () => js.Any): Self = this.set("getClaims", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNameIdentifier(value: () => js.Any): Self = this.set("getNameIdentifier", js.Any.fromFunction0(value))
    @scala.inline
    def setMetadataVarargs(value: MetadataItem*): Self = this.set("metadata", js.Array(value :_*))
    @scala.inline
    def setMetadata(value: js.Array[MetadataItem]): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}

