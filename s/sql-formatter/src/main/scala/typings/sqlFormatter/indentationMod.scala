package typings.sqlFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indentationMod {
  
  @JSImport("sql-formatter/lib/src/formatter/Indentation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Indentation {
    /**
      * @param {string} indent A string to indent with
      */
    def this(indent: String) = this()
    
    /**
      * Decreases indentation by one block-level indent.
      * If there are top-level indents within the block-level indent,
      * throws away these as well.
      */
    /* CompleteClass */
    override def decreaseBlockLevel(): Unit = js.native
    
    /**
      * Decreases indentation by one top-level indent.
      * Does nothing when the previous indent is not top-level.
      */
    /* CompleteClass */
    override def decreaseTopLevel(): Unit = js.native
    
    /**
      * Returns current indentation string.
      * @return {string} indentation string based on indentTypes
      */
    /* CompleteClass */
    override def getIndent(): String = js.native
    
    /**
      * Returns current indentation level
      */
    /* CompleteClass */
    override def getLevel(): Double = js.native
    
    /**
      * Returns indentation string for single indentation step.
      */
    /* CompleteClass */
    override def getSingleIndent(): String = js.native
    
    /**
      * Increases indentation by one block-level indent.
      */
    /* CompleteClass */
    override def increaseBlockLevel(): Unit = js.native
    
    /**
      * Increases indentation by one top-level indent.
      */
    /* CompleteClass */
    override def increaseTopLevel(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var indent: Any = js.native
    
    /* private */ /* CompleteClass */
    var indentTypes: Any = js.native
    
    /** Clears all indentation */
    /* CompleteClass */
    override def resetIndentation(): Unit = js.native
  }
  
  trait Indentation extends StObject {
    
    /**
      * Decreases indentation by one block-level indent.
      * If there are top-level indents within the block-level indent,
      * throws away these as well.
      */
    def decreaseBlockLevel(): Unit
    
    /**
      * Decreases indentation by one top-level indent.
      * Does nothing when the previous indent is not top-level.
      */
    def decreaseTopLevel(): Unit
    
    /**
      * Returns current indentation string.
      * @return {string} indentation string based on indentTypes
      */
    def getIndent(): String
    
    /**
      * Returns current indentation level
      */
    def getLevel(): Double
    
    /**
      * Returns indentation string for single indentation step.
      */
    def getSingleIndent(): String
    
    /**
      * Increases indentation by one block-level indent.
      */
    def increaseBlockLevel(): Unit
    
    /**
      * Increases indentation by one top-level indent.
      */
    def increaseTopLevel(): Unit
    
    /* private */ var indent: Any
    
    /* private */ var indentTypes: Any
    
    /** Clears all indentation */
    def resetIndentation(): Unit
  }
  object Indentation {
    
    inline def apply(
      decreaseBlockLevel: () => Unit,
      decreaseTopLevel: () => Unit,
      getIndent: () => String,
      getLevel: () => Double,
      getSingleIndent: () => String,
      increaseBlockLevel: () => Unit,
      increaseTopLevel: () => Unit,
      indent: Any,
      indentTypes: Any,
      resetIndentation: () => Unit
    ): Indentation = {
      val __obj = js.Dynamic.literal(decreaseBlockLevel = js.Any.fromFunction0(decreaseBlockLevel), decreaseTopLevel = js.Any.fromFunction0(decreaseTopLevel), getIndent = js.Any.fromFunction0(getIndent), getLevel = js.Any.fromFunction0(getLevel), getSingleIndent = js.Any.fromFunction0(getSingleIndent), increaseBlockLevel = js.Any.fromFunction0(increaseBlockLevel), increaseTopLevel = js.Any.fromFunction0(increaseTopLevel), indent = indent.asInstanceOf[js.Any], indentTypes = indentTypes.asInstanceOf[js.Any], resetIndentation = js.Any.fromFunction0(resetIndentation))
      __obj.asInstanceOf[Indentation]
    }
    
    extension [Self <: Indentation](x: Self) {
      
      inline def setDecreaseBlockLevel(value: () => Unit): Self = StObject.set(x, "decreaseBlockLevel", js.Any.fromFunction0(value))
      
      inline def setDecreaseTopLevel(value: () => Unit): Self = StObject.set(x, "decreaseTopLevel", js.Any.fromFunction0(value))
      
      inline def setGetIndent(value: () => String): Self = StObject.set(x, "getIndent", js.Any.fromFunction0(value))
      
      inline def setGetLevel(value: () => Double): Self = StObject.set(x, "getLevel", js.Any.fromFunction0(value))
      
      inline def setGetSingleIndent(value: () => String): Self = StObject.set(x, "getSingleIndent", js.Any.fromFunction0(value))
      
      inline def setIncreaseBlockLevel(value: () => Unit): Self = StObject.set(x, "increaseBlockLevel", js.Any.fromFunction0(value))
      
      inline def setIncreaseTopLevel(value: () => Unit): Self = StObject.set(x, "increaseTopLevel", js.Any.fromFunction0(value))
      
      inline def setIndent(value: Any): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentTypes(value: Any): Self = StObject.set(x, "indentTypes", value.asInstanceOf[js.Any])
      
      inline def setResetIndentation(value: () => Unit): Self = StObject.set(x, "resetIndentation", js.Any.fromFunction0(value))
    }
  }
}
