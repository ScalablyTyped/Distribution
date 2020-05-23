package typings.storybookReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformArray extends js.Object {
  var transform: js.Array[TranslateY | TranslateXTranslateY]
}

object TransformArray {
  @scala.inline
  def apply(transform: js.Array[TranslateY | TranslateXTranslateY]): TransformArray = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformArray]
  }
}

