package typings
package redisDashScriptoLib.redisDashScriptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scripto extends js.Object {
  def eval(
    scriptName: java.lang.String,
    keys: js.Array[java.lang.String],
    args: js.Array[_],
    callback: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit
  def evalSha(
    scriptName: java.lang.String,
    keys: js.Array[java.lang.String],
    args: js.Array[_],
    callback: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit
  def load(scripts: redisDashScriptoLib.redisDashScriptoMod.ScriptoNs.Scripts): scala.Unit
  def loadFromDir(scriptsDir: java.lang.String): scala.Unit
  def loadFromFile(name: java.lang.String, filepath: java.lang.String): scala.Unit
  def run(
    scriptName: java.lang.String,
    keys: js.Array[java.lang.String],
    args: js.Array[_],
    callback: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit
}

object Scripto {
  @scala.inline
  def apply(
    eval: (java.lang.String, js.Array[java.lang.String], js.Array[_], js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]) => scala.Unit,
    evalSha: (java.lang.String, js.Array[java.lang.String], js.Array[_], js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]) => scala.Unit,
    load: redisDashScriptoLib.redisDashScriptoMod.ScriptoNs.Scripts => scala.Unit,
    loadFromDir: java.lang.String => scala.Unit,
    loadFromFile: (java.lang.String, java.lang.String) => scala.Unit,
    run: (java.lang.String, js.Array[java.lang.String], js.Array[_], js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]) => scala.Unit
  ): Scripto = {
    val __obj = js.Dynamic.literal(eval = js.Any.fromFunction4(eval), evalSha = js.Any.fromFunction4(evalSha), load = js.Any.fromFunction1(load), loadFromDir = js.Any.fromFunction1(loadFromDir), loadFromFile = js.Any.fromFunction2(loadFromFile), run = js.Any.fromFunction4(run))
  
    __obj.asInstanceOf[Scripto]
  }
}

