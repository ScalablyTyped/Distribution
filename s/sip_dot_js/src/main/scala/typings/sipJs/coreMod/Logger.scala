package typings.sipJs.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "Logger")
@js.native
open class Logger protected ()
  extends typings.sipJs.logMod.Logger {
  def this(logger: typings.sipJs.loggerFactoryMod.LoggerFactory, category: String) = this()
  def this(logger: typings.sipJs.loggerFactoryMod.LoggerFactory, category: String, label: String) = this()
}
