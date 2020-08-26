package typings.reactAce.typesMod

import typings.aceBuilds.mod.Ace.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommand extends js.Object {
  var bindKey: ICommandBindKey = js.native
  var name: String = js.native
  def exec(editor: Editor): js.Any = js.native
  def exec(editor: Editor, args: js.Any): js.Any = js.native
}

