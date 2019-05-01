package typings
package reactDashMceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMceMod {
  type EventHandler = js.Function2[/* event */ js.Any, /* editor */ tinymceLib.tinymceMod.Editor, scala.Unit]
  type TinyMCE = reactLib.reactMod.Component[ReactMCEProps, js.Object, js.Any]
}
