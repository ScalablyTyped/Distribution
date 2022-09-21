package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamVersion extends StObject
@JSImport("steam-user", "EStreamVersion")
@js.native
object EStreamVersion extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamVersion & Double] = js.native
  
  @js.native
  sealed trait Current
    extends StObject
       with EStreamVersion
  /* 1 */ val Current: typings.steamUser.mod.EStreamVersion.Current & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EStreamVersion
  /* 0 */ val None: typings.steamUser.mod.EStreamVersion.None & Double = js.native
}
