package typings.speechRuleEngine

import typings.speechRuleEngine.anon.Focus
import typings.speechRuleEngine.jsCommonEventUtilMod.KeyCode
import typings.speechRuleEngine.jsHighlighterHighlighterMod.Highlighter
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticRole
import typings.speechRuleEngine.jsSemanticTreeSemanticMeaningMod.SemanticType
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.speechRuleEngine.jsSemanticTreeSemanticSkeletonMod.SemanticSkeleton
import typings.speechRuleEngine.jsSpeechGeneratorSpeechGeneratorMod.SpeechGenerator
import typings.speechRuleEngine.jsWalkerLevelsMod.Levels
import typings.speechRuleEngine.jsWalkerWalkerMod.Walker
import typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves
import typings.std.Element
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWalkerAbstractWalkerMod {
  
  /* note: abstract class */ @JSImport("speech-rule-engine/js/walker/abstract_walker", "AbstractWalker")
  @js.native
  open class AbstractWalker[T] protected ()
    extends StObject
       with Walker {
    def this(node: Element, generator: SpeechGenerator, highlighter: Highlighter, xml: String) = this()
    
    /* private */ var actionable_ : Any = js.native
    
    /* private */ var active_ : Any = js.native
    
    def collapsible(node: Element): Boolean = js.native
    
    def combineContentChildren(`type`: SemanticType, role: SemanticRole, content: js.Array[String], children: js.Array[String]): js.Array[T] = js.native
    
    var cursors: js.Array[Focus[T]] = js.native
    
    /* protected */ def depth(): typings.speechRuleEngine.jsWalkerFocusMod.Focus | Null = js.native
    
    /* private */ var depth_ : Any = js.native
    
    /* protected */ def detail(): typings.speechRuleEngine.jsWalkerFocusMod.Focus | Null = js.native
    
    /* private */ var detail_ : Any = js.native
    
    /* protected */ def down(): typings.speechRuleEngine.jsWalkerFocusMod.Focus | Null = js.native
    
    def expand(): typings.speechRuleEngine.jsWalkerFocusMod.Focus = js.native
    
    def expandable(node: Element): Boolean = js.native
    
    def findFocusOnLevel(id: Double): typings.speechRuleEngine.jsWalkerFocusMod.Focus = js.native
    
    def focusDomNodes(): js.Array[Element] = js.native
    
    def focusFromId(id: String, ids: js.Array[String]): typings.speechRuleEngine.jsWalkerFocusMod.Focus = js.native
    
    def focusSemanticNodes(): js.Array[SemanticNode] = js.native
    
    /* private */ var focus_ : Any = js.native
    
    var generator: SpeechGenerator = js.native
    
    def getBySemanticId(id: String): Element = js.native
    
    var highlighter: Highlighter = js.native
    
    /* protected */ def home(): typings.speechRuleEngine.jsWalkerFocusMod.Focus | Null = js.native
    
    var id: Any = js.native
    
    def initLevels(): Levels[T] = js.native
    
    def isSpeech(): Boolean = js.native
    
    var keyMapping: Map[KeyCode, js.Function0[Any]] = js.native
    
    /* protected */ def left(): typings.speechRuleEngine.jsWalkerFocusMod.Focus | Null = js.native
    
    var levels: Any = js.native
    
    /* private */ var mergePrefix_ : Any = js.native
    
    var moved: WalkerMoves = js.native
    
    def nextLevel(): js.Array[T] = js.native
    
    def nextRules(): typings.speechRuleEngine.jsWalkerFocusMod.Focus = js.native
    
    def nextStyle(domain: String, style: String): String = js.native
    
    var node: Element = js.native
    
    /* private */ var postfix_ : Any = js.native
    
    /* private */ var prefix_ : Any = js.native
    
    def previous(): typings.speechRuleEngine.jsWalkerFocusMod.Focus = js.native
    
    def previousLevel(): String | Null = js.native
    
    def previousRules(): typings.speechRuleEngine.jsWalkerFocusMod.Focus = js.native
    
    def primaryId(): String = js.native
    
    /* protected */ def rebuildStree(): Unit = js.native
    
    /* private */ var rebuilt_ : Any = js.native
    
    /* protected */ def repeat(): typings.speechRuleEngine.jsWalkerFocusMod.Focus | Null = js.native
    
    def restoreState(): Unit = js.native
    
    /* private */ var retrieveVisuals: Any = js.native
    
    /* protected */ def right(): typings.speechRuleEngine.jsWalkerFocusMod.Focus | Null = js.native
    
    var rootId: String = js.native
    
    var rootNode: Element = js.native
    
    def singletonFocus(id: String): typings.speechRuleEngine.jsWalkerFocusMod.Focus = js.native
    
    var skeleton: SemanticSkeleton = js.native
    
    /* protected */ def specialMove(): String | Null = js.native
    
    /* private */ var subtreeIds: Any = js.native
    
    /* protected */ def summary(): typings.speechRuleEngine.jsWalkerFocusMod.Focus | Null = js.native
    
    /* private */ var summary_ : Any = js.native
    
    /* private */ var toggleActive_ : Any = js.native
    
    def undo(): typings.speechRuleEngine.jsWalkerFocusMod.Focus = js.native
    
    /* protected */ def up(): typings.speechRuleEngine.jsWalkerFocusMod.Focus | Null = js.native
    
    def updateFocus(): Unit = js.native
    
    def virtualize(): typings.speechRuleEngine.jsWalkerFocusMod.Focus = js.native
    def virtualize(opt_undo: Boolean): typings.speechRuleEngine.jsWalkerFocusMod.Focus = js.native
    
    /* private */ var xmlString_ : Any = js.native
    
    /* private */ var xml_ : Any = js.native
  }
  /* static members */
  object AbstractWalker {
    
    @JSImport("speech-rule-engine/js/walker/abstract_walker", "AbstractWalker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/walker/abstract_walker", "AbstractWalker.ID_COUNTER")
    @js.native
    def ID_COUNTER: Double = js.native
    inline def ID_COUNTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ID_COUNTER")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/walker/abstract_walker", "AbstractWalker.SRE_ID_ATTR")
    @js.native
    def SRE_ID_ATTR: String = js.native
    inline def SRE_ID_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SRE_ID_ATTR")(x.asInstanceOf[js.Any])
  }
}
