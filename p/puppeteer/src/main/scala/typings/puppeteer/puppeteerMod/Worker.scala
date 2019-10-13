package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worker
  extends JSEvalable[js.Any] {
  def executionContext(): js.Promise[ExecutionContext] = js.native
  def url(): String = js.native
}

