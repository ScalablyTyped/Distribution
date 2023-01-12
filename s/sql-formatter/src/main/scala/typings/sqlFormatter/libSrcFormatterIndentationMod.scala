package typings.sqlFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatterIndentationMod {
  
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
  }
  object Indentation {
    
    inline def apply(
      decreaseBlockLevel: () => Unit,
      decreaseTopLevel: () => Unit,
      getLevel: () => Double,
      getSingleIndent: () => String,
      increaseBlockLevel: () => Unit,
      increaseTopLevel: () => Unit,
      indent: Any,
      indentTypes: Any
    ): Indentation = {
      val __obj = js.Dynamic.literal(decreaseBlockLevel = js.Any.fromFunction0(decreaseBlockLevel), decreaseTopLevel = js.Any.fromFunction0(decreaseTopLevel), getLevel = js.Any.fromFunction0(getLevel), getSingleIndent = js.Any.fromFunction0(getSingleIndent), increaseBlockLevel = js.Any.fromFunction0(increaseBlockLevel), increaseTopLevel = js.Any.fromFunction0(increaseTopLevel), indent = indent.asInstanceOf[js.Any], indentTypes = indentTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Indentation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Indentation] (val x: Self) extends AnyVal {
      
      inline def setDecreaseBlockLevel(value: () => Unit): Self = StObject.set(x, "decreaseBlockLevel", js.Any.fromFunction0(value))
      
      inline def setDecreaseTopLevel(value: () => Unit): Self = StObject.set(x, "decreaseTopLevel", js.Any.fromFunction0(value))
      
      inline def setGetLevel(value: () => Double): Self = StObject.set(x, "getLevel", js.Any.fromFunction0(value))
      
      inline def setGetSingleIndent(value: () => String): Self = StObject.set(x, "getSingleIndent", js.Any.fromFunction0(value))
      
      inline def setIncreaseBlockLevel(value: () => Unit): Self = StObject.set(x, "increaseBlockLevel", js.Any.fromFunction0(value))
      
      inline def setIncreaseTopLevel(value: () => Unit): Self = StObject.set(x, "increaseTopLevel", js.Any.fromFunction0(value))
      
      inline def setIndent(value: Any): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentTypes(value: Any): Self = StObject.set(x, "indentTypes", value.asInstanceOf[js.Any])
    }
  }
}
