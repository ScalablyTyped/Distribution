package typings.sinon

import typings.sinon.mod.SinonSandbox
import typings.sinon.mod.SinonSandboxConfig
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfig extends js.Object {
  /**
    * @deprecated Since 5.0, use `sinon.createSandbox` instead
    */
  def create(): SinonSandbox = js.native
  def create(config: Partial[SinonSandboxConfig]): SinonSandbox = js.native
}

