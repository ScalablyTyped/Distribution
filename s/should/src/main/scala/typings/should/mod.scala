package typings.should

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: Any): Assertion = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Assertion]
  
  @JSImport("should", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deepEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def doesNotThrow(block: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function, error: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function, error: js.Function1[/* err */ Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function, error: js.Function1[/* err */ Any, Boolean], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function, error: js.Function, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function, error: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function, error: js.RegExp, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def doesNotThrow(block: js.Function, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def equal(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def exist(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exist")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exist(obj: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exist")(obj.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def exists(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exists(obj: Any, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(obj.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fail(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fail(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fail(actual: Any, expected: Any, message: String, operator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fail(actual: Any, expected: Any, message: Unit, operator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ifError(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("should", "not")
  @js.native
  val not: ShouldAssertExt = js.native
  
  inline def notDeepEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notDeepEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notStrictEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notStrictEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ok(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ok(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def strictEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def strictEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def throws(block: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def throws(block: js.Function, error: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(block: js.Function, error: js.Function1[/* err */ Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(block: js.Function, error: js.Function1[/* err */ Any, Boolean], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(block: js.Function, error: js.Function, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(block: js.Function, error: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(block: js.Function, error: js.RegExp, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(block: js.Function, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Assertion extends StObject {
    
    def Arguments(): this.type = js.native
    
    def Array(): this.type = js.native
    
    def Boolean(): this.type = js.native
    
    def Class(className: String): this.type = js.native
    
    def Date(): this.type = js.native
    
    def Error(): this.type = js.native
    
    def False(): this.type = js.native
    def False(message: String): this.type = js.native
    
    def Function(): this.type = js.native
    
    def Infinity(): this.type = js.native
    
    //number
    def NaN(): this.type = js.native
    
    def Null(): this.type = js.native
    
    //type
    def Number(): this.type = js.native
    
    def Object(): this.type = js.native
    
    //promise
    def Promise(): this.type = js.native
    
    def String(): this.type = js.native
    
    def True(): this.type = js.native
    def True(message: String): this.type = js.native
    
    def Undefined(): this.type = js.native
    
    var a: this.type = js.native
    
    def above(value: Double): this.type = js.native
    def above(value: Double, description: String): this.type = js.native
    
    def aboveOrEqual(value: Double): this.type = js.native
    def aboveOrEqual(value: Double, description: String): this.type = js.native
    
    //chain
    var an: this.type = js.native
    
    var and: this.type = js.native
    
    var any: this.type = js.native
    
    def approximately(value: Double, delta: Double): this.type = js.native
    def approximately(value: Double, delta: Double, description: String): this.type = js.native
    
    def arguments(): this.type = js.native
    
    def assert(expr: Boolean): this.type = js.native
    
    var be: this.type = js.native
    
    var been: this.type = js.native
    
    def below(value: Double): this.type = js.native
    def below(value: Double, description: String): this.type = js.native
    
    def belowOrEqual(value: Double): this.type = js.native
    def belowOrEqual(value: Double, description: String): this.type = js.native
    
    def `class`(className: String): this.type = js.native
    
    def containDeep(obj: Any): this.type = js.native
    
    def containDeepOrdered(obj: Any): this.type = js.native
    
    //contain
    def containEql(obj: Any): this.type = js.native
    
    def deepEqual(obj: Any): this.type = js.native
    def deepEqual(obj: Any, description: String): this.type = js.native
    
    def empty(): this.type = js.native
    
    def endWith(postfix: String): this.type = js.native
    def endWith(postfix: String, description: String): this.type = js.native
    
    // eql
    def eql(obj: Any): this.type = js.native
    def eql(obj: Any, description: String): this.type = js.native
    
    def eqls(obj: Any): this.type = js.native
    def eqls(obj: Any, description: String): this.type = js.native
    
    def equal(obj: Any): this.type = js.native
    def equal(obj: Any, description: String): this.type = js.native
    
    def equalOneOf(obj: js.Array[Any]): this.type = js.native
    def equalOneOf(objs: Any*): this.type = js.native
    
    def equals(obj: Any, description: String): this.type = js.native
    
    var eventually: PromisedAssertion = js.native
    
    def exactly(obj: Any): this.type = js.native
    def exactly(obj: Any, description: String): this.type = js.native
    
    def fail(): this.type = js.native
    
    def `false`(): this.type = js.native
    def `false`(message: String): this.type = js.native
    
    var `finally`: PromisedAssertion = js.native
    
    def fulfilled(): js.Promise[Any] = js.native
    
    def fulfilledWith(obj: Any): js.Promise[Any] = js.native
    
    def generator(): this.type = js.native
    
    def greaterThan(value: Double): this.type = js.native
    def greaterThan(value: Double, description: String): this.type = js.native
    
    def greaterThanOrEqual(value: Double): this.type = js.native
    def greaterThanOrEqual(value: Double, description: String): this.type = js.native
    
    var has: this.type = js.native
    
    def hasOwnProperty(name: String, description: String): this.type = js.native
    
    var have: this.type = js.native
    
    def instanceOf(constructor: js.Function): this.type = js.native
    def instanceOf(constructor: js.Function, description: String): this.type = js.native
    
    def instanceof(constructor: js.Function): this.type = js.native
    def instanceof(constructor: js.Function, description: String): this.type = js.native
    
    var is: this.type = js.native
    
    var it: this.type = js.native
    
    def iterable(): this.type = js.native
    
    def iterator(): this.type = js.native
    
    def key(key: Any): this.type = js.native
    
    def keys(keys: Any*): this.type = js.native
    
    def length(value: Double): this.type = js.native
    def length(value: Double, description: String): this.type = js.native
    
    def lengthOf(value: Double): this.type = js.native
    def lengthOf(value: Double, description: String): this.type = js.native
    
    def lessThan(value: Double): this.type = js.native
    def lessThan(value: Double, description: String): this.type = js.native
    
    def lessThanOrEqual(value: Double): this.type = js.native
    def lessThanOrEqual(value: Double, description: String): this.type = js.native
    
    def `match`(obj: js.Function2[/* value */ Any, /* key */ Any, Boolean | Unit]): this.type = js.native
    def `match`(obj: js.Function2[/* value */ Any, /* key */ Any, Boolean | Unit], description: String): this.type = js.native
    def `match`(obj: js.Object): this.type = js.native
    def `match`(obj: js.Object, description: String): this.type = js.native
    // match
    def `match`(obj: js.RegExp): this.type = js.native
    def `match`(obj: js.RegExp, description: String): this.type = js.native
    
    def matchAny(obj: js.Function2[/* value */ Any, /* key */ Any, Boolean | Unit]): this.type = js.native
    def matchAny(obj: js.Function2[/* value */ Any, /* key */ Any, Boolean | Unit], description: String): this.type = js.native
    def matchAny(obj: js.Object): this.type = js.native
    def matchAny(obj: js.Object, description: String): this.type = js.native
    def matchAny(obj: js.RegExp): this.type = js.native
    def matchAny(obj: js.RegExp, description: String): this.type = js.native
    
    def matchEach(obj: js.Function2[/* value */ Any, /* key */ Any, Boolean | Unit]): this.type = js.native
    def matchEach(obj: js.Function2[/* value */ Any, /* key */ Any, Boolean | Unit], description: String): this.type = js.native
    def matchEach(obj: js.Object): this.type = js.native
    def matchEach(obj: js.Object, description: String): this.type = js.native
    def matchEach(obj: js.RegExp): this.type = js.native
    def matchEach(obj: js.RegExp, description: String): this.type = js.native
    
    def matchEvery(obj: js.Function2[/* value */ Any, /* key */ Any, Boolean | Unit]): this.type = js.native
    def matchEvery(obj: js.Function2[/* value */ Any, /* key */ Any, Boolean | Unit], description: String): this.type = js.native
    def matchEvery(obj: js.Object): this.type = js.native
    def matchEvery(obj: js.Object, description: String): this.type = js.native
    def matchEvery(obj: js.RegExp): this.type = js.native
    def matchEvery(obj: js.RegExp, description: String): this.type = js.native
    
    def matchSome(obj: js.Function2[/* value */ Any, /* key */ Any, Boolean | Unit]): this.type = js.native
    def matchSome(obj: js.Function2[/* value */ Any, /* key */ Any, Boolean | Unit], description: String): this.type = js.native
    def matchSome(obj: js.Object): this.type = js.native
    def matchSome(obj: js.Object, description: String): this.type = js.native
    def matchSome(obj: js.RegExp): this.type = js.native
    def matchSome(obj: js.RegExp, description: String): this.type = js.native
    
    var not: this.type = js.native
    
    def `null`(): this.type = js.native
    
    var of: this.type = js.native
    
    def ok(): this.type = js.native
    
    def oneOf(obj: js.Array[Any]): this.type = js.native
    def oneOf(objs: Any*): this.type = js.native
    
    var only: this.type = js.native
    
    def ownProperty(name: String): this.type = js.native
    def ownProperty(name: String, description: String): this.type = js.native
    
    def properties(names: String*): this.type = js.native
    def properties(names: js.Array[String]): this.type = js.native
    def properties(props: js.Object): this.type = js.native
    
    def property(name: String): this.type = js.native
    def property(name: String, value: Any): this.type = js.native
    
    def propertyByPath(path: String*): this.type = js.native
    def propertyByPath(path: js.Array[String]): this.type = js.native
    
    // property
    def propertyWithDescriptor(name: String, descriptor: js.Object): this.type = js.native
    
    def rejected(): js.Promise[Any] = js.native
    
    def rejectedWith(msg: String): js.Promise[Any] = js.native
    def rejectedWith(msg: String, properties: js.Object): js.Promise[Any] = js.native
    def rejectedWith(msg: js.Error): js.Promise[Any] = js.native
    def rejectedWith(msg: js.Error, properties: js.Object): js.Promise[Any] = js.native
    def rejectedWith(msg: js.RegExp): js.Promise[Any] = js.native
    def rejectedWith(msg: js.RegExp, properties: js.Object): js.Promise[Any] = js.native
    def rejectedWith(properties: js.Object): js.Promise[Any] = js.native
    
    def resolved(): js.Promise[Any] = js.native
    
    def resolvedWith(obj: Any): js.Promise[Any] = js.native
    
    def size(value: Double): this.type = js.native
    
    //string
    def startWith(prefix: String): this.type = js.native
    def startWith(prefix: String, description: String): this.type = js.native
    
    var the: this.type = js.native
    
    //error
    def `throw`(): this.type = js.native
    def `throw`(msg: String): this.type = js.native
    def `throw`(msg: String, properties: js.Object): this.type = js.native
    def `throw`(msg: js.Function): this.type = js.native
    def `throw`(msg: js.Function, properties: js.Object): this.type = js.native
    def `throw`(msg: js.RegExp): this.type = js.native
    def `throw`(msg: js.RegExp, properties: js.Object): this.type = js.native
    def `throw`(properties: js.Object): this.type = js.native
    
    //TODO how to express generators???
    def throwError(): this.type = js.native
    def throwError(msg: String): this.type = js.native
    def throwError(msg: String, properties: js.Object): this.type = js.native
    def throwError(msg: js.Function): this.type = js.native
    def throwError(msg: js.Function, properties: js.Object): this.type = js.native
    def throwError(msg: js.RegExp): this.type = js.native
    def throwError(msg: js.RegExp, properties: js.Object): this.type = js.native
    def throwError(properties: js.Object): this.type = js.native
    
    // bool
    def `true`(): this.type = js.native
    def `true`(message: String): this.type = js.native
    
    def `type`(typeName: String): this.type = js.native
    def `type`(typeName: String, description: String): this.type = js.native
    
    def undefined(): this.type = js.native
    
    def value(key: Any, value: Any): this.type = js.native
    
    var which: this.type = js.native
    
    var `with`: this.type = js.native
    
    def within(start: Double, finish: Double): this.type = js.native
    def within(start: Double, finish: Double, description: String): this.type = js.native
  }
  
  @js.native
  trait PromisedAssertion
    extends StObject
       with Assertion
       with PromiseLike[Any]
  
  @js.native
  trait ShouldAssertExt extends StObject {
    
    def exist(obj: Any): Unit = js.native
    def exist(obj: Any, msg: String): Unit = js.native
    
    def exists(obj: Any): Unit = js.native
    def exists(obj: Any, msg: String): Unit = js.native
  }
  
  object global {
    
    trait Object extends StObject {
      
      var should: Assertion
    }
    object Object {
      
      inline def apply(should: Assertion): Object = {
        val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
        __obj.asInstanceOf[Object]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
        
        inline def setShould(value: Assertion): Self = StObject.set(x, "should", value.asInstanceOf[js.Any])
      }
    }
  }
}
