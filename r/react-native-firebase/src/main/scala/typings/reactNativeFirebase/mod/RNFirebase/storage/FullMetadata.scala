package typings.reactNativeFirebase.mod.RNFirebase.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullMetadata extends SettableMetadata {
  var bucket: String = js.native
  var fullPath: String = js.native
  var generation: String = js.native
  var md5Hash: js.UndefOr[String | Null] = js.native
  var metageneration: String = js.native
  var name: String = js.native
  var size: Double = js.native
  var timeCreated: String = js.native
  var updated: String = js.native
}

object FullMetadata {
  @scala.inline
  def apply(
    bucket: String,
    fullPath: String,
    generation: String,
    metageneration: String,
    name: String,
    size: Double,
    timeCreated: String,
    updated: String
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMetadata]
  }
  @scala.inline
  implicit class FullMetadataOps[Self <: FullMetadata] (val x: Self) extends AnyVal {
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullPath(value: String): Self = this.set("fullPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetageneration(value: String): Self = this.set("metageneration", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setMd5Hash(value: String): Self = this.set("md5Hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5Hash: Self = this.set("md5Hash", js.undefined)
    @scala.inline
    def setMd5HashNull: Self = this.set("md5Hash", null)
  }
  
}

