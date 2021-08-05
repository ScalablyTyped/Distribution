package typings.smartFoxServer.global.SFS2X.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.BanMode")
@js.native
class BanMode ()
  extends StObject
     with typings.smartFoxServer.SFS2X.Requests.BanMode
/* static members */
object BanMode {
  
  @JSGlobal("SFS2X.Requests.BanMode")
  @js.native
  val ^ : js.Any = js.native
  
  /** @type {number} User is banned by IP address. */
  @JSGlobal("SFS2X.Requests.BanMode.BY_ADDRESS")
  @js.native
  def BY_ADDRESS: Double = js.native
  inline def BY_ADDRESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BY_ADDRESS")(x.asInstanceOf[js.Any])
  
  /** @type {number} User is banned by name. */
  @JSGlobal("SFS2X.Requests.BanMode.BY_NAME")
  @js.native
  def BY_NAME: Double = js.native
  inline def BY_NAME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BY_NAME")(x.asInstanceOf[js.Any])
}
