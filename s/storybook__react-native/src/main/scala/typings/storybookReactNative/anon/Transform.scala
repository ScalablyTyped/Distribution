package typings.storybookReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var transform: js.Array[TranslateX]
  var width: Double
}

object Transform {
  @scala.inline
  def apply(transform: js.Array[TranslateX], width: Double): Transform = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
}

