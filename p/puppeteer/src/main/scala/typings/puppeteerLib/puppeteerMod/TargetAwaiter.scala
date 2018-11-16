package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TargetAwaiter extends js.Object {
  def waitForTarget(predicate: js.Function1[/* target */ Target, scala.Boolean], options: Timeoutable): stdLib.Promise[scala.Unit]
}

