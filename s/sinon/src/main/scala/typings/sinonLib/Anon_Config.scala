package typings
package sinonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Config extends js.Object {
  /**
    * @deprecated Since 5.0, use `sinon.createSandbox` instead
    */
  def create(): sinonLib.sinonMod.SinonSandbox = js.native
  def create(config: stdLib.Partial[sinonLib.sinonMod.SinonSandboxConfig]): sinonLib.sinonMod.SinonSandbox = js.native
}

