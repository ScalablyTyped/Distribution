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

