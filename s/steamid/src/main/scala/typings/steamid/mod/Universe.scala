package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Universe extends StObject
// Universe constants
@JSImport("steamid", "Universe")
@js.native
object Universe extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Universe with Double] = js.native
  
  @js.native
  sealed trait BETA extends Universe
  /* 2 */ val BETA: typings.steamid.mod.Universe.BETA with Double = js.native
  
  @js.native
  sealed trait DEV extends Universe
  /* 4 */ val DEV: typings.steamid.mod.Universe.DEV with Double = js.native
  
  @js.native
  sealed trait INTERNAL extends Universe
  /* 3 */ val INTERNAL: typings.steamid.mod.Universe.INTERNAL with Double = js.native
  
  @js.native
  sealed trait INVALID extends Universe
  /* 0 */ val INVALID: typings.steamid.mod.Universe.INVALID with Double = js.native
  
  @js.native
  sealed trait PUBLIC extends Universe
  /* 1 */ val PUBLIC: typings.steamid.mod.Universe.PUBLIC with Double = js.native
}
