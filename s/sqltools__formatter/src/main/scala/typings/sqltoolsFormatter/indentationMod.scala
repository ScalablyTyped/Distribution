package typings.sqltoolsFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indentationMod {
  
  @JSImport("@sqltools/formatter/lib/core/Indentation", JSImport.Default)
  @js.native
  class default () extends Indentation {
    def this(indent: String) = this()
  }
  
  @js.native
  trait Indentation extends StObject {
    
    def decreaseBlockLevel(): Unit = js.native
    
    def decreaseTopLevel(): Unit = js.native
    
    def getIndent(): String = js.native
    
    def increaseBlockLevel(): Unit = js.native
    
    def increaseTopLevel(): Unit = js.native
    
    var indent: js.UndefOr[String] = js.native
    
    var indentTypes: js.Array[_] = js.native
    
    def resetIndentation(): Unit = js.native
  }
  object Indentation {
    
    @scala.inline
    def apply(
      decreaseBlockLevel: () => Unit,
      decreaseTopLevel: () => Unit,
      getIndent: () => String,
      increaseBlockLevel: () => Unit,
      increaseTopLevel: () => Unit,
      indentTypes: js.Array[_],
      resetIndentation: () => Unit
    ): Indentation = {
      val __obj = js.Dynamic.literal(decreaseBlockLevel = js.Any.fromFunction0(decreaseBlockLevel), decreaseTopLevel = js.Any.fromFunction0(decreaseTopLevel), getIndent = js.Any.fromFunction0(getIndent), increaseBlockLevel = js.Any.fromFunction0(increaseBlockLevel), increaseTopLevel = js.Any.fromFunction0(increaseTopLevel), indentTypes = indentTypes.asInstanceOf[js.Any], resetIndentation = js.Any.fromFunction0(resetIndentation))
      __obj.asInstanceOf[Indentation]
    }
    
    @scala.inline
    implicit class IndentationMutableBuilder[Self <: Indentation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecreaseBlockLevel(value: () => Unit): Self = StObject.set(x, "decreaseBlockLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDecreaseTopLevel(value: () => Unit): Self = StObject.set(x, "decreaseTopLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIndent(value: () => String): Self = StObject.set(x, "getIndent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIncreaseBlockLevel(value: () => Unit): Self = StObject.set(x, "increaseBlockLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIncreaseTopLevel(value: () => Unit): Self = StObject.set(x, "increaseTopLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentTypes(value: js.Array[_]): Self = StObject.set(x, "indentTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentTypesVarargs(value: js.Any*): Self = StObject.set(x, "indentTypes", js.Array(value :_*))
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setResetIndentation(value: () => Unit): Self = StObject.set(x, "resetIndentation", js.Any.fromFunction0(value))
    }
  }
}
