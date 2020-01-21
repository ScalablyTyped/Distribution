package typings.reactNativeNavigation.layoutTreeCrawlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var passProps: js.UndefOr[js.Any] = js.undefined
}

object Data {
  @scala.inline
  def apply(name: String = null, options: js.Any = null, passProps: js.Any = null): Data = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (passProps != null) __obj.updateDynamic("passProps")(passProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

