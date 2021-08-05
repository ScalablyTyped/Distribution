package typings.qunit

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actual extends StObject {
    
    var actual: js.Any
    
    var expected: js.Any
    
    var message: String
    
    var result: Boolean
  }
  object Actual {
    
    inline def apply(actual: js.Any, expected: js.Any, message: String, result: Boolean): Actual = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Actual]
    }
    
    extension [Self <: Actual](x: Self) {
      
      inline def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Failed extends StObject {
    
    var failed: Double
    
    var module: String
    
    var name: String
    
    var passed: Double
    
    var runtime: Double
    
    var total: Double
  }
  object Failed {
    
    inline def apply(failed: Double, module: String, name: String, passed: Double, runtime: Double, total: Double): Failed = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failed]
    }
    
    extension [Self <: Failed](x: Self) {
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | StringDictionary[String]] = js.undefined
  }
  object Id {
    
    inline def apply(): Id = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValue(value: String | js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait MaxDepth extends StObject {
    
    var maxDepth: Double
    
    def parse(data: js.Any): String
  }
  object MaxDepth {
    
    inline def apply(maxDepth: Double, parse: js.Any => String): MaxDepth = {
      val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[MaxDepth]
    }
    
    extension [Self <: MaxDepth](x: Self) {
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Any => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
