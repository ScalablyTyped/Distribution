package typings.speechRuleEngine

import typings.speechRuleEngine.jsCommonEventUtilMod.KeyCode
import typings.speechRuleEngine.jsRuleEngineDynamicCstrMod.AxisMap
import typings.speechRuleEngine.jsWalkerFocusMod.Focus
import typings.speechRuleEngine.jsWalkerRebuildStreeMod.RebuildStree
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWalkerWalkerMod {
  
  @js.native
  sealed trait WalkerMoves extends StObject
  @JSImport("speech-rule-engine/js/walker/walker", "WalkerMoves")
  @js.native
  object WalkerMoves extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WalkerMoves & String] = js.native
    
    @js.native
    sealed trait CELL
      extends StObject
         with WalkerMoves
    /* "cell" */ val CELL: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.CELL & String = js.native
    
    @js.native
    sealed trait DEPTH
      extends StObject
         with WalkerMoves
    /* "depth" */ val DEPTH: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.DEPTH & String = js.native
    
    @js.native
    sealed trait DETAIL
      extends StObject
         with WalkerMoves
    /* "detail" */ val DETAIL: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.DETAIL & String = js.native
    
    @js.native
    sealed trait DOWN
      extends StObject
         with WalkerMoves
    /* "down" */ val DOWN: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.DOWN & String = js.native
    
    @js.native
    sealed trait ENTER
      extends StObject
         with WalkerMoves
    /* "enter" */ val ENTER: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.ENTER & String = js.native
    
    @js.native
    sealed trait EXPAND
      extends StObject
         with WalkerMoves
    /* "expand" */ val EXPAND: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.EXPAND & String = js.native
    
    @js.native
    sealed trait HOME
      extends StObject
         with WalkerMoves
    /* "home" */ val HOME: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.HOME & String = js.native
    
    @js.native
    sealed trait LEFT
      extends StObject
         with WalkerMoves
    /* "left" */ val LEFT: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.LEFT & String = js.native
    
    @js.native
    sealed trait REPEAT
      extends StObject
         with WalkerMoves
    /* "repeat" */ val REPEAT: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.REPEAT & String = js.native
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with WalkerMoves
    /* "right" */ val RIGHT: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.RIGHT & String = js.native
    
    @js.native
    sealed trait ROW
      extends StObject
         with WalkerMoves
    /* "row" */ val ROW: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.ROW & String = js.native
    
    @js.native
    sealed trait SUMMARY
      extends StObject
         with WalkerMoves
    /* "summary" */ val SUMMARY: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.SUMMARY & String = js.native
    
    @js.native
    sealed trait UP
      extends StObject
         with WalkerMoves
    /* "up" */ val UP: typings.speechRuleEngine.jsWalkerWalkerMod.WalkerMoves.UP & String = js.native
  }
  
  @JSImport("speech-rule-engine/js/walker/walker", "WalkerState")
  @js.native
  open class WalkerState () extends StObject
  /* static members */
  object WalkerState {
    
    @JSImport("speech-rule-engine/js/walker/walker", "WalkerState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/walker/walker", "WalkerState.STATE")
    @js.native
    def STATE: Any = js.native
    inline def STATE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE")(x.asInstanceOf[js.Any])
    
    inline def getState(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")(id.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def resetState(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetState")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setState(id: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setState")(id.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait Walker extends StObject {
    
    def activate(): Unit = js.native
    
    def deactivate(): Unit = js.native
    
    def getDepth(): Double = js.native
    
    def getFocus(): Focus = js.native
    def getFocus(opt_update: Boolean): Focus = js.native
    
    def getRebuilt(): RebuildStree = js.native
    
    def getXml(): Element = js.native
    
    def isActive(): Boolean = js.native
    
    var modifier: Boolean = js.native
    
    def move(key: KeyCode): Boolean | Null = js.native
    
    def refocus(): Unit = js.native
    
    def setFocus(focus: Focus): Unit = js.native
    
    def speech(): String = js.native
    
    def update(options: AxisMap): Unit = js.native
  }
}
