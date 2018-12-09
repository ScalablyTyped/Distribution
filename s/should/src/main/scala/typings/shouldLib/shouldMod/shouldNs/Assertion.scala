package typings
package shouldLib.shouldMod.shouldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  var a: this.type = js.native
  //chain
  var an: this.type = js.native
  var and: this.type = js.native
  var any: this.type = js.native
  var be: this.type = js.native
  var been: this.type = js.native
  var eventually: PromisedAssertion = js.native
  var `finally`: PromisedAssertion = js.native
  var has: this.type = js.native
  var have: this.type = js.native
  var is: this.type = js.native
  var it: this.type = js.native
  var not: this.type = js.native
  var of: this.type = js.native
  var only: this.type = js.native
  var the: this.type = js.native
  var which: this.type = js.native
  var `with`: this.type = js.native
  def Arguments(): this.type = js.native
  def Array(): this.type = js.native
  def Boolean(): this.type = js.native
  def Class(className: java.lang.String): this.type = js.native
  def Date(): this.type = js.native
  def Error(): this.type = js.native
  def False(): this.type = js.native
  def False(message: java.lang.String): this.type = js.native
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
  def True(message: java.lang.String): this.type = js.native
  def Undefined(): this.type = js.native
  def above(value: scala.Double): this.type = js.native
  def above(value: scala.Double, description: java.lang.String): this.type = js.native
  def aboveOrEqual(value: scala.Double): this.type = js.native
  def aboveOrEqual(value: scala.Double, description: java.lang.String): this.type = js.native
  def approximately(value: scala.Double, delta: scala.Double): this.type = js.native
  def approximately(value: scala.Double, delta: scala.Double, description: java.lang.String): this.type = js.native
  def arguments(): this.type = js.native
  def assert(expr: scala.Boolean): this.type = js.native
  def below(value: scala.Double): this.type = js.native
  def below(value: scala.Double, description: java.lang.String): this.type = js.native
  def belowOrEqual(value: scala.Double): this.type = js.native
  def belowOrEqual(value: scala.Double, description: java.lang.String): this.type = js.native
  def `class`(className: java.lang.String): this.type = js.native
  def containDeep(obj: js.Any): this.type = js.native
  def containDeepOrdered(obj: js.Any): this.type = js.native
  //contain
  def containEql(obj: js.Any): this.type = js.native
  def deepEqual(obj: js.Any): this.type = js.native
  def deepEqual(obj: js.Any, description: java.lang.String): this.type = js.native
  def empty(): this.type = js.native
  def endWith(postfix: java.lang.String): this.type = js.native
  def endWith(postfix: java.lang.String, description: java.lang.String): this.type = js.native
  // eql
  def eql(obj: js.Any): this.type = js.native
  // eql
  def eql(obj: js.Any, description: java.lang.String): this.type = js.native
  def eqls(obj: js.Any): this.type = js.native
  def eqls(obj: js.Any, description: java.lang.String): this.type = js.native
  def equal(obj: js.Any): this.type = js.native
  def equal(obj: js.Any, description: java.lang.String): this.type = js.native
  def equalOneOf(obj: js.Array[_]): this.type = js.native
  def equalOneOf(objs: js.Any*): this.type = js.native
  def equals(obj: js.Any): this.type = js.native
  def equals(obj: js.Any, description: java.lang.String): this.type = js.native
  def exactly(obj: js.Any): this.type = js.native
  def exactly(obj: js.Any, description: java.lang.String): this.type = js.native
  def fail(): this.type = js.native
  def `false`(): this.type = js.native
  def `false`(message: java.lang.String): this.type = js.native
  def fulfilled(): js.Promise[_] = js.native
  def fulfilledWith(obj: js.Any): js.Promise[_] = js.native
  def generator(): this.type = js.native
  def greaterThan(value: scala.Double): this.type = js.native
  def greaterThan(value: scala.Double, description: java.lang.String): this.type = js.native
  def greaterThanOrEqual(value: scala.Double): this.type = js.native
  def greaterThanOrEqual(value: scala.Double, description: java.lang.String): this.type = js.native
  def hasOwnProperty(name: java.lang.String, description: java.lang.String): this.type = js.native
  def instanceOf(constructor: js.Function): this.type = js.native
  def instanceOf(constructor: js.Function, description: java.lang.String): this.type = js.native
  def instanceof(constructor: js.Function): this.type = js.native
  def instanceof(constructor: js.Function, description: java.lang.String): this.type = js.native
  def iterable(): this.type = js.native
  def iterator(): this.type = js.native
  def key(key: js.Any): this.type = js.native
  def keys(keys: js.Any*): this.type = js.native
  def length(value: scala.Double): this.type = js.native
  def length(value: scala.Double, description: java.lang.String): this.type = js.native
  def lengthOf(value: scala.Double): this.type = js.native
  def lengthOf(value: scala.Double, description: java.lang.String): this.type = js.native
  def lessThan(value: scala.Double): this.type = js.native
  def lessThan(value: scala.Double, description: java.lang.String): this.type = js.native
  def lessThanOrEqual(value: scala.Double): this.type = js.native
  def lessThanOrEqual(value: scala.Double, description: java.lang.String): this.type = js.native
  // match
  def `match`(obj: js.Function2[/* value */ js.Any, /* key */ js.Any, scala.Boolean | scala.Unit]): this.type = js.native
  // match
  def `match`(
    obj: js.Function2[/* value */ js.Any, /* key */ js.Any, scala.Boolean | scala.Unit],
    description: java.lang.String
  ): this.type = js.native
  // match
  def `match`(obj: js.Object): this.type = js.native
  // match
  def `match`(obj: js.Object, description: java.lang.String): this.type = js.native
  // match
  def `match`(obj: stdLib.RegExp): this.type = js.native
  // match
  def `match`(obj: stdLib.RegExp, description: java.lang.String): this.type = js.native
  def matchAny(obj: js.Function2[/* value */ js.Any, /* key */ js.Any, scala.Boolean | scala.Unit]): this.type = js.native
  def matchAny(
    obj: js.Function2[/* value */ js.Any, /* key */ js.Any, scala.Boolean | scala.Unit],
    description: java.lang.String
  ): this.type = js.native
  def matchAny(obj: js.Object): this.type = js.native
  def matchAny(obj: js.Object, description: java.lang.String): this.type = js.native
  def matchAny(obj: stdLib.RegExp): this.type = js.native
  def matchAny(obj: stdLib.RegExp, description: java.lang.String): this.type = js.native
  def matchEach(obj: js.Function2[/* value */ js.Any, /* key */ js.Any, scala.Boolean | scala.Unit]): this.type = js.native
  def matchEach(
    obj: js.Function2[/* value */ js.Any, /* key */ js.Any, scala.Boolean | scala.Unit],
    description: java.lang.String
  ): this.type = js.native
  def matchEach(obj: js.Object): this.type = js.native
  def matchEach(obj: js.Object, description: java.lang.String): this.type = js.native
  def matchEach(obj: stdLib.RegExp): this.type = js.native
  def matchEach(obj: stdLib.RegExp, description: java.lang.String): this.type = js.native
  def matchEvery(obj: js.Function2[/* value */ js.Any, /* key */ js.Any, scala.Boolean | scala.Unit]): this.type = js.native
  def matchEvery(
    obj: js.Function2[/* value */ js.Any, /* key */ js.Any, scala.Boolean | scala.Unit],
    description: java.lang.String
  ): this.type = js.native
  def matchEvery(obj: js.Object): this.type = js.native
  def matchEvery(obj: js.Object, description: java.lang.String): this.type = js.native
  def matchEvery(obj: stdLib.RegExp): this.type = js.native
  def matchEvery(obj: stdLib.RegExp, description: java.lang.String): this.type = js.native
  def matchSome(obj: js.Function2[/* value */ js.Any, /* key */ js.Any, scala.Boolean | scala.Unit]): this.type = js.native
  def matchSome(
    obj: js.Function2[/* value */ js.Any, /* key */ js.Any, scala.Boolean | scala.Unit],
    description: java.lang.String
  ): this.type = js.native
  def matchSome(obj: js.Object): this.type = js.native
  def matchSome(obj: js.Object, description: java.lang.String): this.type = js.native
  def matchSome(obj: stdLib.RegExp): this.type = js.native
  def matchSome(obj: stdLib.RegExp, description: java.lang.String): this.type = js.native
  def `null`(): this.type = js.native
  def ok(): this.type = js.native
  def oneOf(obj: js.Array[_]): this.type = js.native
  def oneOf(objs: js.Any*): this.type = js.native
  def ownProperty(name: java.lang.String): this.type = js.native
  def ownProperty(name: java.lang.String, description: java.lang.String): this.type = js.native
  def properties(names: java.lang.String*): this.type = js.native
  def properties(names: js.Array[java.lang.String]): this.type = js.native
  def properties(props: js.Object): this.type = js.native
  def property(name: java.lang.String): this.type = js.native
  def property(name: java.lang.String, value: js.Any): this.type = js.native
  def propertyByPath(path: java.lang.String*): this.type = js.native
  def propertyByPath(path: js.Array[java.lang.String]): this.type = js.native
  // property
  def propertyWithDescriptor(name: java.lang.String, descriptor: js.Object): this.type = js.native
  def rejected(): js.Promise[_] = js.native
  def rejectedWith(msg: java.lang.String): js.Promise[_] = js.native
  def rejectedWith(msg: java.lang.String, properties: js.Object): js.Promise[_] = js.native
  def rejectedWith(msg: stdLib.Error): js.Promise[_] = js.native
  def rejectedWith(msg: stdLib.Error, properties: js.Object): js.Promise[_] = js.native
  def rejectedWith(msg: stdLib.RegExp): js.Promise[_] = js.native
  def rejectedWith(msg: stdLib.RegExp, properties: js.Object): js.Promise[_] = js.native
  def rejectedWith(properties: js.Object): js.Promise[_] = js.native
  def resolved(): js.Promise[_] = js.native
  def resolvedWith(obj: js.Any): js.Promise[_] = js.native
  def size(value: scala.Double): this.type = js.native
  //string
  def startWith(prefix: java.lang.String): this.type = js.native
  //string
  def startWith(prefix: java.lang.String, description: java.lang.String): this.type = js.native
  //error
  def `throw`(): this.type = js.native
  def `throw`(msg: java.lang.String): this.type = js.native
  def `throw`(msg: java.lang.String, properties: js.Object): this.type = js.native
  def `throw`(msg: js.Function): this.type = js.native
  def `throw`(msg: js.Function, properties: js.Object): this.type = js.native
  def `throw`(msg: stdLib.RegExp): this.type = js.native
  def `throw`(msg: stdLib.RegExp, properties: js.Object): this.type = js.native
  def `throw`(properties: js.Object): this.type = js.native
  //TODO how to express generators???
  def throwError(): this.type = js.native
  def throwError(msg: java.lang.String): this.type = js.native
  def throwError(msg: java.lang.String, properties: js.Object): this.type = js.native
  def throwError(msg: js.Function): this.type = js.native
  def throwError(msg: js.Function, properties: js.Object): this.type = js.native
  def throwError(msg: stdLib.RegExp): this.type = js.native
  def throwError(msg: stdLib.RegExp, properties: js.Object): this.type = js.native
  def throwError(properties: js.Object): this.type = js.native
  // bool
  def `true`(): this.type = js.native
  // bool
  def `true`(message: java.lang.String): this.type = js.native
  def `type`(typeName: java.lang.String): this.type = js.native
  def `type`(typeName: java.lang.String, description: java.lang.String): this.type = js.native
  def undefined(): this.type = js.native
  def value(key: js.Any, value: js.Any): this.type = js.native
  def within(start: scala.Double, finish: scala.Double): this.type = js.native
  def within(start: scala.Double, finish: scala.Double, description: java.lang.String): this.type = js.native
}

