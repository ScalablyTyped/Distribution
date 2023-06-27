package typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtraFont
  extends StObject
     with SemanticFont
@JSImport("speech-rule-engine/js/semantic_tree/semantic_meaning", "ExtraFont")
@js.native
object ExtraFont extends StObject {
  
  @js.native
  sealed trait CALIGRAPHIC
    extends StObject
       with ExtraFont
  
  @js.native
  sealed trait CALIGRAPHICBOLD
    extends StObject
       with ExtraFont
  
  @js.native
  sealed trait OLDSTYLE
    extends StObject
       with ExtraFont
  
  @js.native
  sealed trait OLDSTYLEBOLD
    extends StObject
       with ExtraFont
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with ExtraFont
}
