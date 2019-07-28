package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ETag extends js.Object {
  var eTag: String
  var key: String
  var sequencer: String
  var size: Double
  var versionId: js.UndefOr[String] = js.undefined
}

object Anon_ETag {
  @scala.inline
  def apply(eTag: String, key: String, sequencer: String, size: Double, versionId: String = null): Anon_ETag = {
    val __obj = js.Dynamic.literal(eTag = eTag, key = key, sequencer = sequencer, size = size)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[Anon_ETag]
  }
}

