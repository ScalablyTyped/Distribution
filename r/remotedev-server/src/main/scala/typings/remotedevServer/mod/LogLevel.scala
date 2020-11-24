package typings.remotedevServer.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends js.Object
@JSImport("remotedev-server", "LogLevel")
@js.native
object LogLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  
  @js.native
  sealed trait ERROR extends LogLevel
  /* 1 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  @js.native
  sealed trait INFO extends LogLevel
  /* 3 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
  @js.native
  sealed trait NONE extends LogLevel
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait WARN extends LogLevel
  /* 2 */ @js.native
  object WARN extends TopLevel[WARN with Double]
}
