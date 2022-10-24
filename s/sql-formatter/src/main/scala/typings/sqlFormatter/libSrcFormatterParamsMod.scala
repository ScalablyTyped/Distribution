package typings.sqlFormatter

import org.scalablytyped.runtime.StringDictionary
import typings.sqlFormatter.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatterParamsMod {
  
  @JSImport("sql-formatter/lib/src/formatter/Params", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Params {
    def this(params: js.Array[String]) = this()
    def this(params: ParamItems) = this()
    
    /**
      * Returns param value that matches given placeholder with param key.
      */
    /* CompleteClass */
    override def get(param0: Key): String = js.native
    
    /**
      * Returns index of current positional parameter.
      */
    /* CompleteClass */
    override def getPositionalParameterIndex(): Double = js.native
    
    /* private */ /* CompleteClass */
    var index: Any = js.native
    
    /* private */ /* CompleteClass */
    var params: Any = js.native
    
    /**
      * Sets index of current positional parameter.
      */
    /* CompleteClass */
    override def setPositionalParameterIndex(i: Double): Unit = js.native
  }
  
  type ParamItems = StringDictionary[String]
  
  trait Params extends StObject {
    
    /**
      * Returns param value that matches given placeholder with param key.
      */
    def get(param0: Key): String
    
    /**
      * Returns index of current positional parameter.
      */
    def getPositionalParameterIndex(): Double
    
    /* private */ var index: Any
    
    /* private */ var params: Any
    
    /**
      * Sets index of current positional parameter.
      */
    def setPositionalParameterIndex(i: Double): Unit
  }
  object Params {
    
    inline def apply(
      get: Key => String,
      getPositionalParameterIndex: () => Double,
      index: Any,
      params: Any,
      setPositionalParameterIndex: Double => Unit
    ): Params = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getPositionalParameterIndex = js.Any.fromFunction0(getPositionalParameterIndex), index = index.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], setPositionalParameterIndex = js.Any.fromFunction1(setPositionalParameterIndex))
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setGet(value: Key => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetPositionalParameterIndex(value: () => Double): Self = StObject.set(x, "getPositionalParameterIndex", js.Any.fromFunction0(value))
      
      inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setSetPositionalParameterIndex(value: Double => Unit): Self = StObject.set(x, "setPositionalParameterIndex", js.Any.fromFunction1(value))
    }
  }
}
