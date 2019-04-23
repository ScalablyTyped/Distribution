package typings
package sipDotJsLib.libLoggerFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Levels extends js.Object

@JSImport("sip.js/lib/LoggerFactory", "Levels")
@js.native
object Levels extends js.Object {
  @js.native
  sealed trait debug
    extends sipDotJsLib.libLoggerFactoryMod.Levels
  
  @js.native
  sealed trait error
    extends sipDotJsLib.libLoggerFactoryMod.Levels
  
  @js.native
  sealed trait log
    extends sipDotJsLib.libLoggerFactoryMod.Levels
  
  @js.native
  sealed trait warn
    extends sipDotJsLib.libLoggerFactoryMod.Levels
  
  /* 3 */ val debug: debug with scala.Double = js.native
  /* 0 */ val error: error with scala.Double = js.native
  /* 2 */ val log: log with scala.Double = js.native
  /* 1 */ val warn: warn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sipDotJsLib.libLoggerFactoryMod.Levels with scala.Double] = js.native
}

