package typings
package pugLib.pugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pug", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(template: java.lang.String): pugLib.pugMod.compileTemplate = js.native
  def compile(template: java.lang.String, options: pugLib.pugMod.Options): pugLib.pugMod.compileTemplate = js.native
  def compileClient(template: java.lang.String): java.lang.String = js.native
  def compileClient(template: java.lang.String, options: pugLib.pugMod.Options): java.lang.String = js.native
  def compileClientWithDependenciesTracked(template: java.lang.String): pugLib.Anon_Body = js.native
  def compileClientWithDependenciesTracked(template: java.lang.String, options: pugLib.pugMod.Options): pugLib.Anon_Body = js.native
  def compileFile(path: java.lang.String): pugLib.pugMod.compileTemplate = js.native
  def compileFile(path: java.lang.String, options: pugLib.pugMod.Options): pugLib.pugMod.compileTemplate = js.native
  def compileFileClient(path: java.lang.String): java.lang.String = js.native
  def compileFileClient(path: java.lang.String, options: pugLib.pugMod.Options): java.lang.String = js.native
  def render(template: java.lang.String): java.lang.String = js.native
  def render(
    template: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* html */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def render(template: java.lang.String, options: pugLib.pugMod.Options with pugLib.pugMod.LocalsObject): java.lang.String = js.native
  def render(
    template: java.lang.String,
    options: pugLib.pugMod.Options with pugLib.pugMod.LocalsObject,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* html */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def renderFile(path: java.lang.String): java.lang.String = js.native
  def renderFile(
    path: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* html */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def renderFile(path: java.lang.String, options: pugLib.pugMod.Options with pugLib.pugMod.LocalsObject): java.lang.String = js.native
  def renderFile(
    path: java.lang.String,
    options: pugLib.pugMod.Options with pugLib.pugMod.LocalsObject,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* html */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

