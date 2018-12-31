package typings
package reactDashAceLib.reactDashAceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var bindKey: CommandBindKey
  var name: java.lang.String
  def exec(editor: js.Any): scala.Unit
}

