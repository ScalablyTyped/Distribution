package typings.promptly.promptlyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promptly", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def choose(message: String, choices: js.Array[String]): js.Any = js.native
  def choose(message: String, choices: js.Array[String], fn: Callback): js.Any = js.native
  def choose(message: String, choices: js.Array[String], opts: Options): js.Any = js.native
  def choose(message: String, choices: js.Array[String], opts: Options, fn: Callback): js.Any = js.native
  def confirm(message: String): js.Any = js.native
  def confirm(message: String, fn: Callback): js.Any = js.native
  def confirm(message: String, opts: Options): js.Any = js.native
  def confirm(message: String, opts: Options, fn: Callback): js.Any = js.native
  def password(message: String): js.Any = js.native
  def password(message: String, fn: Callback): js.Any = js.native
  def password(message: String, opts: Options): js.Any = js.native
  def password(message: String, opts: Options, fn: Callback): js.Any = js.native
  def prompt(message: String): js.Any = js.native
  def prompt(message: String, fn: Callback): js.Any = js.native
  def prompt(message: String, opts: Options): js.Any = js.native
  def prompt(message: String, opts: Options, fn: Callback): js.Any = js.native
}

