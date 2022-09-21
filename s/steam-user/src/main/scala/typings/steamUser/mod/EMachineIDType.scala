package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMachineIDType extends StObject
@JSImport("steam-user", "EMachineIDType")
@js.native
object EMachineIDType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMachineIDType & Double] = js.native
  
  @js.native
  sealed trait AccountNameGenerated
    extends StObject
       with EMachineIDType
  /* 3 */ val AccountNameGenerated: typings.steamUser.mod.EMachineIDType.AccountNameGenerated & Double = js.native
  
  @js.native
  sealed trait AlwaysRandom
    extends StObject
       with EMachineIDType
  /* 2 */ val AlwaysRandom: typings.steamUser.mod.EMachineIDType.AlwaysRandom & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EMachineIDType
  /* 1 */ val None: typings.steamUser.mod.EMachineIDType.None & Double = js.native
  
  @js.native
  sealed trait PersistentRandom
    extends StObject
       with EMachineIDType
  /* 4 */ val PersistentRandom: typings.steamUser.mod.EMachineIDType.PersistentRandom & Double = js.native
}
