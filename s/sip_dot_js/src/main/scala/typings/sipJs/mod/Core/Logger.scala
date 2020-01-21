package typings.sipJs.mod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.Logger")
@js.native
class Logger protected ()
  extends typings.sipJs.coreMod.Logger {
  def this(logger: typings.sipJs.loggerFactoryMod.LoggerFactory, category: String) = this()
  def this(logger: typings.sipJs.loggerFactoryMod.LoggerFactory, category: String, label: String) = this()
}

