package typings.redisDashScripto.redisDashScriptoMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scripto extends js.Object {
  def eval(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit
  def evalSha(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit
  def load(scripts: Scripts): Unit
  def loadFromDir(scriptsDir: String): Unit
  def loadFromFile(name: String, filepath: String): Unit
  def run(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit
}

object Scripto {
  @scala.inline
  def apply(
    eval: (String, js.Array[String], js.Array[_], js.Function2[/* err */ Error, /* result */ js.Any, Unit]) => Unit,
    evalSha: (String, js.Array[String], js.Array[_], js.Function2[/* err */ Error, /* result */ js.Any, Unit]) => Unit,
    load: Scripts => Unit,
    loadFromDir: String => Unit,
    loadFromFile: (String, String) => Unit,
    run: (String, js.Array[String], js.Array[_], js.Function2[/* err */ Error, /* result */ js.Any, Unit]) => Unit
  ): Scripto = {
    val __obj = js.Dynamic.literal(eval = js.Any.fromFunction4(eval), evalSha = js.Any.fromFunction4(evalSha), load = js.Any.fromFunction1(load), loadFromDir = js.Any.fromFunction1(loadFromDir), loadFromFile = js.Any.fromFunction2(loadFromFile), run = js.Any.fromFunction4(run))
  
    __obj.asInstanceOf[Scripto]
  }
}

