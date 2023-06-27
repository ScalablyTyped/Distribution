package typings.speechRuleEngine

import typings.speechRuleEngine.jsHighlighterHighlighterMod.Highlighter
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticRole
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticType
import typings.speechRuleEngine.jsSpeechGeneratorSpeechGeneratorMod.SpeechGenerator
import typings.speechRuleEngine.jsWalkerFocusMod.Focus
import typings.speechRuleEngine.jsWalkerSyntaxWalkerMod.SyntaxWalker
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWalkerTableWalkerMod {
  
  @JSImport("speech-rule-engine/js/walker/table_walker", "TableWalker")
  @js.native
  open class TableWalker protected () extends SyntaxWalker {
    def this(node: Element, generator: SpeechGenerator, highlighter: Highlighter, xml: String) = this()
    
    /* private */ var currentTable_ : Any = js.native
    
    /* private */ var eligibleCell_ : Any = js.native
    
    var firstJump: Focus = js.native
    
    /* private */ var isInTable_ : Any = js.native
    
    /* private */ var isLegalJump_ : Any = js.native
    
    /* protected */ def jumpCell(): Focus | Null = js.native
    
    /* private */ var jumpCell_ : Any = js.native
    
    /* private */ var key_ : Any = js.native
    
    /* private */ var row_ : Any = js.native
    
    /* private */ var verticalMove_ : Any = js.native
  }
  /* static members */
  object TableWalker {
    
    @JSImport("speech-rule-engine/js/walker/table_walker", "TableWalker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/walker/table_walker", "TableWalker.ELIGIBLE_CELL_ROLES")
    @js.native
    def ELIGIBLE_CELL_ROLES: js.Array[SemanticRole] = js.native
    inline def ELIGIBLE_CELL_ROLES_=(x: js.Array[SemanticRole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELIGIBLE_CELL_ROLES")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/walker/table_walker", "TableWalker.ELIGIBLE_TABLE_TYPES")
    @js.native
    def ELIGIBLE_TABLE_TYPES: js.Array[SemanticType] = js.native
    inline def ELIGIBLE_TABLE_TYPES_=(x: js.Array[SemanticType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELIGIBLE_TABLE_TYPES")(x.asInstanceOf[js.Any])
  }
}
