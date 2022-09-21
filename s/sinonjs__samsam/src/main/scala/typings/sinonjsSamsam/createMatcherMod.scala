package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMatcherMod {
  
  /**
    * Creates a matcher object for the passed expectation
    *
    * @alias module:samsam.createMatcher
    * @param {*} expectation An expecttation
    * @param {string} message A message for the expectation
    * @returns {object} A matcher object
    */
  inline def apply(expectation: Any, message: String, args: Any*): js.Object = (^.asInstanceOf[js.Dynamic].apply((List(expectation.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
  
  @JSImport("@sinonjs/samsam/types/create-matcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _in(arrayOfExpectations: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_in")(arrayOfExpectations.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "any")
  @js.native
  val any: Any = js.native
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "array")
  @js.native
  val array: Any = js.native
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "bool")
  @js.native
  val bool: Any = js.native
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "date")
  @js.native
  val date: Any = js.native
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "defined")
  @js.native
  val defined: Any = js.native
  
  inline def every(predicate: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "falsy")
  @js.native
  val falsy: Any = js.native
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "func")
  @js.native
  val func: Any = js.native
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "has")
  @js.native
  val has: Any = js.native
  
  inline def hasNested(property: Any, value: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasNested")((List(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "hasOwn")
  @js.native
  val hasOwn: Any = js.native
  
  inline def in(arrayOfExpectations: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("in")(arrayOfExpectations.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def instanceOf(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns `true` when `object` is a matcher
    *
    * @private
    * @param {*} object A value to examine
    * @returns {boolean} Returns `true` when `object` is a matcher
    */
  /* was `typeof imported_is-matcher` */
  inline def isMatcher(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMatcher")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def json(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "map")
  @js.native
  val map: Any = js.native
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "number")
  @js.native
  val number: Any = js.native
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "object")
  @js.native
  val `object`: Any = js.native
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "regexp")
  @js.native
  val regexp: Any = js.native
  
  inline def same(expectation: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("same")(expectation.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "set")
  @js.native
  val set: Any = js.native
  
  inline def some(predicate: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "string")
  @js.native
  val string: Any = js.native
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "symbol")
  @js.native
  val symbol: Any = js.native
  
  @JSImport("@sinonjs/samsam/types/create-matcher", "truthy")
  @js.native
  val truthy: Any = js.native
  
  inline def typeOf(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
