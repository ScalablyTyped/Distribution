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
    
    @scala.inline
    def apply(actual: js.Any, expected: js.Any, message: String, result: Boolean): Actual = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Actual]
    }
    
    @scala.inline
    implicit class ActualMutableBuilder[Self <: Actual] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(failed: Double, module: String, name: String, passed: Double, runtime: Double, total: Double): Failed = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failed]
    }
    
    @scala.inline
    implicit class FailedMutableBuilder[Self <: Failed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String] | StringDictionary[String]] = js.undefined
  }
  object Id {
    
    @scala.inline
    def apply(): Id = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait MaxDepth extends StObject {
    
    var maxDepth: Double
    
    def parse(data: js.Any): String
  }
  object MaxDepth {
    
    @scala.inline
    def apply(maxDepth: Double, parse: js.Any => String): MaxDepth = {
      val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[MaxDepth]
    }
    
    @scala.inline
    implicit class MaxDepthMutableBuilder[Self <: MaxDepth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParse(value: js.Any => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
