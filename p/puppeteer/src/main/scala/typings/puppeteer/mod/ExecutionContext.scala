package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionContext
  extends JSEvalable[js.Any] {
  
  def queryObjects(prototypeHandle: JSHandle[_]): js.Promise[JSHandle[_]] = js.native
}
