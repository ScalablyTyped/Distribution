package typings.ramlTypesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypeExpressionUtilMod {
  
  @JSImport("raml-typesystem/dist/src/typeExpressionUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(str: String): BaseNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[BaseNode]
  
  inline def serializeToString(node: BaseNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeToString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def visit(node: BaseNode, action: js.Function1[/* n */ BaseNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BaseNode extends StObject {
    
    var `type`: String
  }
  object BaseNode {
    
    inline def apply(`type`: String): BaseNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseNode] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Literal
    extends StObject
       with BaseNode {
    
    var arr: js.UndefOr[Double] = js.undefined
    
    var params: js.UndefOr[js.Array[BaseNode]] = js.undefined
    
    var value: String
  }
  object Literal {
    
    inline def apply(`type`: String, value: String): Literal = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Literal] (val x: Self) extends AnyVal {
      
      inline def setArr(value: Double): Self = StObject.set(x, "arr", value.asInstanceOf[js.Any])
      
      inline def setArrUndefined: Self = StObject.set(x, "arr", js.undefined)
      
      inline def setParams(value: js.Array[BaseNode]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: BaseNode*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parens
    extends StObject
       with BaseNode {
    
    var arr: Double
    
    var expr: BaseNode
  }
  object Parens {
    
    inline def apply(arr: Double, expr: BaseNode, `type`: String): Parens = {
      val __obj = js.Dynamic.literal(arr = arr.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parens]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parens] (val x: Self) extends AnyVal {
      
      inline def setArr(value: Double): Self = StObject.set(x, "arr", value.asInstanceOf[js.Any])
      
      inline def setExpr(value: BaseNode): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    }
  }
  
  trait Union
    extends StObject
       with BaseNode {
    
    var first: BaseNode
    
    var rest: BaseNode
  }
  object Union {
    
    inline def apply(first: BaseNode, rest: BaseNode, `type`: String): Union = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Union]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Union] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: BaseNode): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setRest(value: BaseNode): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    }
  }
}
