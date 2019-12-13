package typings.soundmanager2.soundmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundManagerAudioFormat extends js.Object {
  var related: js.UndefOr[js.Array[String]] = js.undefined
  var required: Boolean
  var `type`: js.Array[String]
}

object SoundManagerAudioFormat {
  @scala.inline
  def apply(required: Boolean, `type`: js.Array[String], related: js.Array[String] = null): SoundManagerAudioFormat = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundManagerAudioFormat]
  }
}

