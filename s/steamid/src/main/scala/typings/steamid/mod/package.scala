package typings.steamid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type getSteam2RenderedID = js.Function1[/* newerFormat */ js.UndefOr[scala.Boolean], java.lang.String]
  
  /**
    * Render this SteamID into Steam3 textual format
    */
  type getSteam3RenderedID = js.Function0[java.lang.String]
  
  /**
    * Render this SteamID into 64-bit numeric format
    */
  type getSteamID64 = js.Function0[java.lang.String]
}
