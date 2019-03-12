package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslatableProvided extends js.Object {
  def translate(key: java.lang.String, params: js.Any*): java.lang.String
}

object TranslatableProvided {
  @scala.inline
  def apply(translate: (java.lang.String, /* repeated */ js.Any) => java.lang.String): TranslatableProvided = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction2(translate))
  
    __obj.asInstanceOf[TranslatableProvided]
  }
}

