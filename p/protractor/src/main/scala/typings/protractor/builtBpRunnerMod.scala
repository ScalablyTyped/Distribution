package typings.protractor

import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.protractor.builtConfigMod.Config
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/bpRunner", JSImport.Namespace)
@js.native
object builtBpRunnerMod extends js.Object {
  @js.native
  class BlockingProxyRunner protected () extends js.Object {
    def this(config: Config) = this()
    var bpProcess: ChildProcess = js.native
    var config: js.Any = js.native
    var port: Double = js.native
    def checkSupportedConfig(): Unit = js.native
    def start(): Promise[js.Object] = js.native
  }
  
}

