package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetAwaiter extends js.Object {
  
  def waitForTarget(predicate: js.Function1[/* target */ Target, Boolean]): js.Promise[Target] = js.native
  def waitForTarget(predicate: js.Function1[/* target */ Target, Boolean], options: Timeoutable): js.Promise[Target] = js.native
}
