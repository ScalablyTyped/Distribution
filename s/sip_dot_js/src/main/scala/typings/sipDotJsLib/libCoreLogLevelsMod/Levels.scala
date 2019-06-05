package typings
package sipDotJsLib.libCoreLogLevelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Levels extends js.Object

@JSImport("sip.js/lib/core/log/levels", "Levels")
@js.native
object Levels extends js.Object {
  @js.native
  sealed trait debug
    extends sipDotJsLib.libCoreLogLevelsMod.Levels
  
  @js.native
  sealed trait error
    extends sipDotJsLib.libCoreLogLevelsMod.Levels
  
  @js.native
  sealed trait log
    extends sipDotJsLib.libCoreLogLevelsMod.Levels
  
  @js.native
  sealed trait warn
    extends sipDotJsLib.libCoreLogLevelsMod.Levels
  
  /* 3 */ val debug: debug with scala.Double = js.native
  /* 0 */ val error: error with scala.Double = js.native
  /* 2 */ val log: log with scala.Double = js.native
  /* 1 */ val warn: warn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sipDotJsLib.libCoreLogLevelsMod.Levels with scala.Double] = js.native
}

