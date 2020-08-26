package typings.remotedevServer.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("remotedev-server", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait ERROR extends LogLevel
  
  @js.native
  sealed trait INFO extends LogLevel
  
  @js.native
  sealed trait NONE extends LogLevel
  
  @js.native
  sealed trait WARN extends LogLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  /* 1 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 3 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 2 */ @js.native
  object WARN extends TopLevel[WARN with Double]
  
}

