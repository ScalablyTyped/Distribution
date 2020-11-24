package typings.riotApiNodejs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait regionE extends js.Object
@JSImport("riot-api-nodejs", "region_e")
@js.native
object regionE extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[regionE with Double] = js.native
  
  @js.native
  sealed trait BR extends regionE
  /* 0 */ @js.native
  object BR extends TopLevel[BR with Double]
  
  @js.native
  sealed trait EUNE extends regionE
  /* 1 */ @js.native
  object EUNE extends TopLevel[EUNE with Double]
  
  @js.native
  sealed trait EUW extends regionE
  /* 2 */ @js.native
  object EUW extends TopLevel[EUW with Double]
  
  @js.native
  sealed trait KR extends regionE
  /* 3 */ @js.native
  object KR extends TopLevel[KR with Double]
  
  @js.native
  sealed trait LAN extends regionE
  /* 4 */ @js.native
  object LAN extends TopLevel[LAN with Double]
  
  @js.native
  sealed trait LAS extends regionE
  /* 5 */ @js.native
  object LAS extends TopLevel[LAS with Double]
  
  @js.native
  sealed trait NA extends regionE
  /* 6 */ @js.native
  object NA extends TopLevel[NA with Double]
  
  @js.native
  sealed trait OCE extends regionE
  /* 7 */ @js.native
  object OCE extends TopLevel[OCE with Double]
  
  @js.native
  sealed trait PBE extends regionE
  /* 10 */ @js.native
  object PBE extends TopLevel[PBE with Double]
  
  @js.native
  sealed trait RU extends regionE
  /* 9 */ @js.native
  object RU extends TopLevel[RU with Double]
  
  @js.native
  sealed trait TR extends regionE
  /* 8 */ @js.native
  object TR extends TopLevel[TR with Double]
}
