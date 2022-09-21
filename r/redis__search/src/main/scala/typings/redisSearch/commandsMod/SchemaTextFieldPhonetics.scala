package typings.redisSearch.commandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SchemaTextFieldPhonetics extends StObject
@JSImport("@redis/search/dist/commands", "SchemaTextFieldPhonetics")
@js.native
object SchemaTextFieldPhonetics extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SchemaTextFieldPhonetics & String] = js.native
  
  @js.native
  sealed trait DM_EN
    extends StObject
       with SchemaTextFieldPhonetics
  /* "dm:en" */ val DM_EN: typings.redisSearch.commandsMod.SchemaTextFieldPhonetics.DM_EN & String = js.native
  
  @js.native
  sealed trait DM_ES
    extends StObject
       with SchemaTextFieldPhonetics
  /* "dm:es" */ val DM_ES: typings.redisSearch.commandsMod.SchemaTextFieldPhonetics.DM_ES & String = js.native
  
  @js.native
  sealed trait DM_FR
    extends StObject
       with SchemaTextFieldPhonetics
  /* "dm:fr" */ val DM_FR: typings.redisSearch.commandsMod.SchemaTextFieldPhonetics.DM_FR & String = js.native
  
  @js.native
  sealed trait FM_PT
    extends StObject
       with SchemaTextFieldPhonetics
  /* "dm:pt" */ val FM_PT: typings.redisSearch.commandsMod.SchemaTextFieldPhonetics.FM_PT & String = js.native
}
