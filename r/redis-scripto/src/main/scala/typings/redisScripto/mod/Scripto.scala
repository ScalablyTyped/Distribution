package typings.redisScripto.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scripto extends js.Object {
  def eval(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
  def evalSha(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
  def load(scripts: Scripts): Unit = js.native
  def loadFromDir(scriptsDir: String): Unit = js.native
  def loadFromFile(name: String, filepath: String): Unit = js.native
  def run(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
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
  @scala.inline
  implicit class ScriptoOps[Self <: Scripto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEval(
      value: (String, js.Array[String], js.Array[_], js.Function2[/* err */ Error, /* result */ js.Any, Unit]) => Unit
    ): Self = this.set("eval", js.Any.fromFunction4(value))
    @scala.inline
    def setEvalSha(
      value: (String, js.Array[String], js.Array[_], js.Function2[/* err */ Error, /* result */ js.Any, Unit]) => Unit
    ): Self = this.set("evalSha", js.Any.fromFunction4(value))
    @scala.inline
    def setLoad(value: Scripts => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadFromDir(value: String => Unit): Self = this.set("loadFromDir", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadFromFile(value: (String, String) => Unit): Self = this.set("loadFromFile", js.Any.fromFunction2(value))
    @scala.inline
    def setRun(
      value: (String, js.Array[String], js.Array[_], js.Function2[/* err */ Error, /* result */ js.Any, Unit]) => Unit
    ): Self = this.set("run", js.Any.fromFunction4(value))
  }
  
}

