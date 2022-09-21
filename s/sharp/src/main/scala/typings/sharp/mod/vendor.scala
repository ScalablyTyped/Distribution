package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An Object containing the platform and architecture of the current and installed vendored binaries. */
object vendor {
  
  @JSImport("sharp", "vendor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sharp", "vendor.current")
  @js.native
  def current: String = js.native
  inline def current_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  
  @JSImport("sharp", "vendor.installed")
  @js.native
  def installed: js.Array[String] = js.native
  inline def installed_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("installed")(x.asInstanceOf[js.Any])
}
