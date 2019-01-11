package typings
package promptlyLib.promptlyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promptly", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def choose(message: java.lang.String, choices: js.Array[java.lang.String]): js.Any = js.native
  def choose(
    message: java.lang.String,
    choices: js.Array[java.lang.String],
    fn: promptlyLib.promptlyMod.Callback
  ): js.Any = js.native
  def choose(
    message: java.lang.String,
    choices: js.Array[java.lang.String],
    opts: promptlyLib.promptlyMod.Options
  ): js.Any = js.native
  def choose(
    message: java.lang.String,
    choices: js.Array[java.lang.String],
    opts: promptlyLib.promptlyMod.Options,
    fn: promptlyLib.promptlyMod.Callback
  ): js.Any = js.native
  def confirm(message: java.lang.String): js.Any = js.native
  def confirm(message: java.lang.String, fn: promptlyLib.promptlyMod.Callback): js.Any = js.native
  def confirm(message: java.lang.String, opts: promptlyLib.promptlyMod.Options): js.Any = js.native
  def confirm(
    message: java.lang.String,
    opts: promptlyLib.promptlyMod.Options,
    fn: promptlyLib.promptlyMod.Callback
  ): js.Any = js.native
  def password(message: java.lang.String): js.Any = js.native
  def password(message: java.lang.String, fn: promptlyLib.promptlyMod.Callback): js.Any = js.native
  def password(message: java.lang.String, opts: promptlyLib.promptlyMod.Options): js.Any = js.native
  def password(
    message: java.lang.String,
    opts: promptlyLib.promptlyMod.Options,
    fn: promptlyLib.promptlyMod.Callback
  ): js.Any = js.native
  def prompt(message: java.lang.String): js.Any = js.native
  def prompt(message: java.lang.String, fn: promptlyLib.promptlyMod.Callback): js.Any = js.native
  def prompt(message: java.lang.String, opts: promptlyLib.promptlyMod.Options): js.Any = js.native
  def prompt(
    message: java.lang.String,
    opts: promptlyLib.promptlyMod.Options,
    fn: promptlyLib.promptlyMod.Callback
  ): js.Any = js.native
}

