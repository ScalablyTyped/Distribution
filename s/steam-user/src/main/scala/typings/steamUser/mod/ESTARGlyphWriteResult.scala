package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESTARGlyphWriteResult extends StObject
@JSImport("steam-user", "E_STAR_GlyphWriteResult")
@js.native
object ESTARGlyphWriteResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESTARGlyphWriteResult & Double] = js.native
  
  @js.native
  sealed trait InvalidJSON
    extends StObject
       with ESTARGlyphWriteResult
  /* 2 */ val InvalidJSON: typings.steamUser.mod.ESTARGlyphWriteResult.InvalidJSON & Double = js.native
  
  @js.native
  sealed trait InvalidMessage
    extends StObject
       with ESTARGlyphWriteResult
  /* 1 */ val InvalidMessage: typings.steamUser.mod.ESTARGlyphWriteResult.InvalidMessage & Double = js.native
  
  @js.native
  sealed trait SQLError
    extends StObject
       with ESTARGlyphWriteResult
  /* 3 */ val SQLError: typings.steamUser.mod.ESTARGlyphWriteResult.SQLError & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with ESTARGlyphWriteResult
  /* 0 */ val Success: typings.steamUser.mod.ESTARGlyphWriteResult.Success & Double = js.native
}
