package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.and
import typings.sinclairTypebox.sinclairTypeboxStrings.const
import typings.sinclairTypebox.sinclairTypeboxStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TemplateLiteralParser {
  
  @JSImport("@sinclair/typebox", "TemplateLiteralParser")
  @js.native
  val ^ : js.Any = js.native
  
  /** Parses a pattern and returns an expression tree */
  inline def Parse(pattern: String): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(pattern.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  /** Parses a pattern and strips forward and trailing ^ and $ */
  inline def ParseExact(pattern: String): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseExact")(pattern.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  trait And
    extends StObject
       with Expression {
    
    var expr: js.Array[Expression]
    
    var `type`: and
  }
  object And {
    
    inline def apply(expr: js.Array[Expression]): And = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("and")
      __obj.asInstanceOf[And]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: And] (val x: Self) extends AnyVal {
      
      inline def setExpr(value: js.Array[Expression]): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
      
      inline def setExprVarargs(value: Expression*): Self = StObject.set(x, "expr", js.Array(value*))
      
      inline def setType(value: and): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Const
    extends StObject
       with Expression {
    
    var const: String
    
    var `type`: const
  }
  object Const {
    
    inline def apply(const: String): Const = {
      val __obj = js.Dynamic.literal(const = const.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("const")
      __obj.asInstanceOf[Const]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Const] (val x: Self) extends AnyVal {
      
      inline def setConst(value: String): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
      
      inline def setType(value: const): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sinclairTypebox.mod.TemplateLiteralParser.And
    - typings.sinclairTypebox.mod.TemplateLiteralParser.Or
    - typings.sinclairTypebox.mod.TemplateLiteralParser.Const
  */
  trait Expression extends StObject
  object Expression {
    
    inline def And(expr: js.Array[Expression]): typings.sinclairTypebox.mod.TemplateLiteralParser.And = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("and")
      __obj.asInstanceOf[typings.sinclairTypebox.mod.TemplateLiteralParser.And]
    }
    
    inline def Const(const: String): typings.sinclairTypebox.mod.TemplateLiteralParser.Const = {
      val __obj = js.Dynamic.literal(const = const.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("const")
      __obj.asInstanceOf[typings.sinclairTypebox.mod.TemplateLiteralParser.Const]
    }
    
    inline def Or(expr: js.Array[Expression]): typings.sinclairTypebox.mod.TemplateLiteralParser.Or = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("or")
      __obj.asInstanceOf[typings.sinclairTypebox.mod.TemplateLiteralParser.Or]
    }
  }
  
  trait Or
    extends StObject
       with Expression {
    
    var expr: js.Array[Expression]
    
    var `type`: or
  }
  object Or {
    
    inline def apply(expr: js.Array[Expression]): Or = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("or")
      __obj.asInstanceOf[Or]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Or] (val x: Self) extends AnyVal {
      
      inline def setExpr(value: js.Array[Expression]): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
      
      inline def setExprVarargs(value: Expression*): Self = StObject.set(x, "expr", js.Array(value*))
      
      inline def setType(value: or): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
