package typings.smartFoxServer.global.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.LogLevel")
@js.native
class LogLevel ()
  extends StObject
     with typings.smartFoxServer.SFS2X.LogLevel
/* static members */
object LogLevel {
  
  @JSGlobal("SFS2X.LogLevel")
  @js.native
  val ^ : js.Any = js.native
  
  /** @type {number} A DEBUG message is a fine-grained information on the client activity. */
  @JSGlobal("SFS2X.LogLevel.DEBUG")
  @js.native
  def DEBUG: Double = js.native
  @scala.inline
  def DEBUG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /** @type {number} An ERROR message contains informations on a problem that occurred during the client activities. Client operations might be compromised when an error is raised. */
  @JSGlobal("SFS2X.LogLevel.ERROR")
  @js.native
  def ERROR: Double = js.native
  @scala.inline
  def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  /** @type {number} An INFO message contains informations on the standard client activities. */
  @JSGlobal("SFS2X.LogLevel.INFO")
  @js.native
  def INFO: Double = js.native
  @scala.inline
  def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
  
  /** @type {number} A WARN message is a warning caused by an unexpected behavior of the client. Client operations are not compromised when a warning is raised. */
  @JSGlobal("SFS2X.LogLevel.WARN")
  @js.native
  def WARN: Double = js.native
  @scala.inline
  def WARN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARN")(x.asInstanceOf[js.Any])
}
