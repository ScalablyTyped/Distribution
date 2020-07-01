package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionContext
  extends JSEvalable[js.Any] {
  def queryObjects(prototypeHandle: JSHandle[_]): js.Promise[JSHandle[_]] = js.native
}

