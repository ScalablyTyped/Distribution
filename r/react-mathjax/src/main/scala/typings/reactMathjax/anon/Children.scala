package typings.reactMathjax.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: ReactNode
  var options: js.UndefOr[js.Object] = js.undefined
  var script: js.UndefOr[String | Boolean] = js.undefined
}

object Children {
  @scala.inline
  def apply(children: ReactNode = null, options: js.Object = null, script: String | Boolean = null): Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

