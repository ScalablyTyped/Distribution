package typings.samchon.templatesSlaveSlaveClientMod

import typings.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlaveClient extends SlaveSystem {
  def connect(ip: String, port: Double): Unit = js.native
}

