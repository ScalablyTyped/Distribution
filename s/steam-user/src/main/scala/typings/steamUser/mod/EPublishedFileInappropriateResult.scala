package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPublishedFileInappropriateResult extends StObject
@JSImport("steam-user", "EPublishedFileInappropriateResult")
@js.native
object EPublishedFileInappropriateResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileInappropriateResult & Double] = js.native
  
  @js.native
  sealed trait Likely
    extends StObject
       with EPublishedFileInappropriateResult
  /* 75 */ val Likely: typings.steamUser.mod.EPublishedFileInappropriateResult.Likely & Double = js.native
  
  @js.native
  sealed trait NotScanned
    extends StObject
       with EPublishedFileInappropriateResult
  /* 0 */ val NotScanned: typings.steamUser.mod.EPublishedFileInappropriateResult.NotScanned & Double = js.native
  
  @js.native
  sealed trait Possible
    extends StObject
       with EPublishedFileInappropriateResult
  /* 50 */ val Possible: typings.steamUser.mod.EPublishedFileInappropriateResult.Possible & Double = js.native
  
  @js.native
  sealed trait Unlikely
    extends StObject
       with EPublishedFileInappropriateResult
  /* 30 */ val Unlikely: typings.steamUser.mod.EPublishedFileInappropriateResult.Unlikely & Double = js.native
  
  @js.native
  sealed trait VeryLikely
    extends StObject
       with EPublishedFileInappropriateResult
  /* 100 */ val VeryLikely: typings.steamUser.mod.EPublishedFileInappropriateResult.VeryLikely & Double = js.native
  
  @js.native
  sealed trait VeryUnlikely
    extends StObject
       with EPublishedFileInappropriateResult
  /* 1 */ val VeryUnlikely: typings.steamUser.mod.EPublishedFileInappropriateResult.VeryUnlikely & Double = js.native
}
