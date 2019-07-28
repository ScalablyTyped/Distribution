package typings.reactDashMce

import typings.react.reactMod.Component
import typings.tinymce.tinymceMod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMceMod {
  type EventHandler = js.Function2[/* event */ js.Any, /* editor */ Editor, Unit]
  type TinyMCE = Component[ReactMCEProps, js.Object, js.Any]
}
