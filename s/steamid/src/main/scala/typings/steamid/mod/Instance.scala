package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Instance extends StObject
// Instance constants
@JSImport("steamid", "Instance")
@js.native
object Instance extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Instance with Double] = js.native
  
  @js.native
  sealed trait ALL extends Instance
  /* 0 */ val ALL: typings.steamid.mod.Instance.ALL with Double = js.native
  
  @js.native
  sealed trait CONSOLE extends Instance
  /* 2 */ val CONSOLE: typings.steamid.mod.Instance.CONSOLE with Double = js.native
  
  @js.native
  sealed trait DESKTOP extends Instance
  /* 1 */ val DESKTOP: typings.steamid.mod.Instance.DESKTOP with Double = js.native
  
  @js.native
  sealed trait WEB extends Instance
  /* 4 */ val WEB: typings.steamid.mod.Instance.WEB with Double = js.native
}
