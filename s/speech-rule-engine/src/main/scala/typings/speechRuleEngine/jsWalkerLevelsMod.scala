package typings.speechRuleEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsWalkerLevelsMod {
  
  @JSImport("speech-rule-engine/js/walker/levels", "Levels")
  @js.native
  open class Levels[T] () extends StObject {
    
    def depth(): Double = js.native
    
    def find(pred: js.Function1[/* p1 */ T, Boolean]): T | Null = js.native
    
    def get(index: Double): T | Null = js.native
    
    def indexOf(element: T): Double | Null = js.native
    
    /* private */ var level_ : Any = js.native
    
    def peek(): js.Array[T] = js.native
    
    def pop(): js.Array[T] = js.native
    
    def push(level: js.Array[T]): Unit = js.native
  }
}
