package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslatableProvided extends js.Object {
  def translate(key: String, params: js.Any*): String
}

object TranslatableProvided {
  @scala.inline
  def apply(translate: (String, /* repeated */ js.Any) => String): TranslatableProvided = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction2(translate))
  
    __obj.asInstanceOf[TranslatableProvided]
  }
}

