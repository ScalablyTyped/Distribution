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
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit
  def evalSha(
    scriptName: java.lang.String,
    keys: js.Array[java.lang.String],
    args: js.Array[_],
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit
  def load(scripts: redisDashScriptoLib.redisDashScriptoMod.ScriptoNs.Scripts): scala.Unit
  def loadFromDir(scriptsDir: java.lang.String): scala.Unit
  def loadFromFile(name: java.lang.String, filepath: java.lang.String): scala.Unit
  def run(
    scriptName: java.lang.String,
    keys: js.Array[java.lang.String],
    args: js.Array[_],
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit
}

object Scripto {
  @scala.inline
  def apply(
    eval: js.Function4[
      java.lang.String, 
      js.Array[java.lang.String], 
      js.Array[_], 
      js.Function2[/* err */ nodeLib.Error, /* result */ js.Any, scala.Unit], 
      scala.Unit
    ],
    evalSha: js.Function4[
      java.lang.String, 
      js.Array[java.lang.String], 
      js.Array[_], 
      js.Function2[/* err */ nodeLib.Error, /* result */ js.Any, scala.Unit], 
      scala.Unit
    ],
    load: js.Function1[redisDashScriptoLib.redisDashScriptoMod.ScriptoNs.Scripts, scala.Unit],
    loadFromDir: js.Function1[java.lang.String, scala.Unit],
    loadFromFile: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    run: js.Function4[
      java.lang.String, 
      js.Array[java.lang.String], 
      js.Array[_], 
      js.Function2[/* err */ nodeLib.Error, /* result */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): Scripto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("evalSha")(evalSha)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadFromDir")(loadFromDir)
    __obj.updateDynamic("loadFromFile")(loadFromFile)
    __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[Scripto]
  }
}

