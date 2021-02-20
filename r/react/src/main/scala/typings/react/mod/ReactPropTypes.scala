package typings.react.mod

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.react.anon.Fn0
import typings.react.anon.Fn1
import typings.react.anon.Fn2
import typings.react.anon.Fn3
import typings.react.anon.FnCall
import typings.react.anon.FnCallType
import typings.react.anon.FnCallTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactPropTypes extends StObject {
  
  var any: typings.propTypes.mod.Requireable[_] = js.native
  
  var array: typings.propTypes.mod.Requireable[js.Array[_]] = js.native
  
  var arrayOf: FnCallType = js.native
  
  var bool: typings.propTypes.mod.Requireable[Boolean] = js.native
  
  var element: typings.propTypes.mod.Requireable[ReactElementLike] = js.native
  
  var exact: Fn3 = js.native
  
  var func: typings.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var instanceOf: FnCall = js.native
  
  var node: typings.propTypes.mod.Requireable[ReactNodeLike] = js.native
  
  var number: typings.propTypes.mod.Requireable[Double] = js.native
  
  var `object`: typings.propTypes.mod.Requireable[js.Object] = js.native
  
  var objectOf: Fn1 = js.native
  
  var oneOf: FnCallTypes = js.native
  
  var oneOfType: Fn0 = js.native
  
  var shape: Fn2 = js.native
  
  var string: typings.propTypes.mod.Requireable[String] = js.native
}
object ReactPropTypes {
  
  @scala.inline
  def apply(
    any: typings.propTypes.mod.Requireable[_],
    array: typings.propTypes.mod.Requireable[js.Array[_]],
    arrayOf: FnCallType,
    bool: typings.propTypes.mod.Requireable[Boolean],
    element: typings.propTypes.mod.Requireable[ReactElementLike],
    exact: Fn3,
    func: typings.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]],
    instanceOf: FnCall,
    node: typings.propTypes.mod.Requireable[ReactNodeLike],
    number: typings.propTypes.mod.Requireable[Double],
    `object`: typings.propTypes.mod.Requireable[js.Object],
    objectOf: Fn1,
    oneOf: FnCallTypes,
    oneOfType: Fn0,
    shape: Fn2,
    string: typings.propTypes.mod.Requireable[String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPropTypes]
  }
  
  @scala.inline
  implicit class ReactPropTypesMutableBuilder[Self <: ReactPropTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAny(value: typings.propTypes.mod.Requireable[_]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArray(value: typings.propTypes.mod.Requireable[js.Array[_]]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayOf(value: FnCallType): Self = StObject.set(x, "arrayOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBool(value: typings.propTypes.mod.Requireable[Boolean]): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: typings.propTypes.mod.Requireable[ReactElementLike]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExact(value: Fn3): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunc(value: typings.propTypes.mod.Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceOf(value: FnCall): Self = StObject.set(x, "instanceOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: typings.propTypes.mod.Requireable[ReactNodeLike]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: typings.propTypes.mod.Requireable[Double]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: typings.propTypes.mod.Requireable[js.Object]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectOf(value: Fn1): Self = StObject.set(x, "objectOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOf(value: FnCallTypes): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOfType(value: Fn0): Self = StObject.set(x, "oneOfType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: Fn2): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: typings.propTypes.mod.Requireable[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
