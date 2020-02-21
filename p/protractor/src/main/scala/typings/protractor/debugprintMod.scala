package typings.protractor

import typings.protractor.runnerMod.Runner
import typings.protractor.taskRunnerMod.RunResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/frameworks/debugprint", JSImport.Namespace)
@js.native
object debugprintMod extends js.Object {
  def run(runner: Runner, specs: js.Array[String]): js.Promise[RunResults] = js.native
}

