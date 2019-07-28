package typings.reactDashJsonDashPretty.reactDashJsonDashPrettyMod

import typings.react.reactMod.HTMLProps
import typings.reactDashJsonDashPretty.JSONPretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPrettyProps extends HTMLProps[JSONPretty] {
  var json: js.Object | String
}

object JSONPrettyProps {
  @scala.inline
  def apply(json: js.Object | String, HTMLProps: HTMLProps[JSONPretty] = null): JSONPrettyProps = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    __obj.asInstanceOf[JSONPrettyProps]
  }
}

