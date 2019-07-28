package typings.pug.pugMod

import typings.pug.Anon_Body
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pug", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(template: String): compileTemplate = js.native
  def compile(template: String, options: Options): compileTemplate = js.native
  def compileClient(template: String): String = js.native
  def compileClient(template: String, options: Options): String = js.native
  def compileClientWithDependenciesTracked(template: String): Anon_Body = js.native
  def compileClientWithDependenciesTracked(template: String, options: Options): Anon_Body = js.native
  def compileFile(path: String): compileTemplate = js.native
  def compileFile(path: String, options: Options): compileTemplate = js.native
  def compileFileClient(path: String): String = js.native
  def compileFileClient(path: String, options: Options): String = js.native
  def render(template: String): String = js.native
  def render(template: String, callback: js.Function2[/* err */ Error | Null, /* html */ String, Unit]): Unit = js.native
  def render(template: String, options: Options with LocalsObject): String = js.native
  def render(
    template: String,
    options: Options with LocalsObject,
    callback: js.Function2[/* err */ Error | Null, /* html */ String, Unit]
  ): Unit = js.native
  def renderFile(path: String): String = js.native
  def renderFile(path: String, callback: js.Function2[/* err */ Error | Null, /* html */ String, Unit]): Unit = js.native
  def renderFile(path: String, options: Options with LocalsObject): String = js.native
  def renderFile(
    path: String,
    options: Options with LocalsObject,
    callback: js.Function2[/* err */ Error | Null, /* html */ String, Unit]
  ): Unit = js.native
}

