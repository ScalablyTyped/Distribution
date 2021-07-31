package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Universe extends StObject
// Universe constants
@JSImport("steamid", "Universe")
@js.native
object Universe extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Universe & Double] = js.native
  
  @js.native
  sealed trait BETA
    extends StObject
       with Universe
  /* 2 */ val BETA: typings.steamid.mod.Universe.BETA & Double = js.native
  
  @js.native
  sealed trait DEV
    extends StObject
       with Universe
  /* 4 */ val DEV: typings.steamid.mod.Universe.DEV & Double = js.native
  
  @js.native
  sealed trait INTERNAL
    extends StObject
       with Universe
  /* 3 */ val INTERNAL: typings.steamid.mod.Universe.INTERNAL & Double = js.native
  
  @js.native
  sealed trait INVALID
    extends StObject
       with Universe
  /* 0 */ val INVALID: typings.steamid.mod.Universe.INVALID & Double = js.native
  
  @js.native
  sealed trait PUBLIC
    extends StObject
       with Universe
  /* 1 */ val PUBLIC: typings.steamid.mod.Universe.PUBLIC & Double = js.native
}
