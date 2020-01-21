package typings.solidReact

import typings.solidReact.solidReactStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  var subscribe: js.UndefOr[Asterisk | String | js.Array[String]] = js.undefined
}

object Anon {
  @scala.inline
  def apply(subscribe: Asterisk | String | js.Array[String] = null): Anon = {
    val __obj = js.Dynamic.literal()
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon]
  }
}

