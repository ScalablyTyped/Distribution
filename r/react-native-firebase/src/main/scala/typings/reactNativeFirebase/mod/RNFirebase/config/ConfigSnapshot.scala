package typings.reactNativeFirebase.mod.RNFirebase.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigSnapshot extends js.Object {
  var source: String
  def `val`(): js.Any
}

object ConfigSnapshot {
  @scala.inline
  def apply(source: String, `val`: () => js.Any): ConfigSnapshot = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
    __obj.asInstanceOf[ConfigSnapshot]
  }
}

