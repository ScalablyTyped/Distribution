package typings.sindresorhusIs

import org.scalablytyped.runtime.Instantiable1
import typings.sindresorhusIs.sindresorhusIsNumbers.`1`
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Symbol
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(value: js.Any): TypeName = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[TypeName]
    
    @JSImport("@sindresorhus/is", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def all(predicate: js.Any, values: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(predicate.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def any(predicate: js.Any, values: js.Any*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(predicate.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def array(arg: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
    
    inline def arrayBuffer(value: js.Any): /* is std.ArrayBuffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayBuffer */ Boolean]
    
    inline def arrayLike(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.ArrayLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @sindresorhus/is.@sindresorhus/is.ArrayLike */ Boolean]
    
    inline def asyncFunction(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    
    inline def asyncIterable(value: js.Any): /* is std.AsyncIterableIterator<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncIterable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.AsyncIterableIterator<unknown> */ Boolean]
    
    inline def boolean(value: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
    
    inline def boundFunction(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boundFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    
    inline def buffer(input: js.Any): /* is node.Buffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(input.asInstanceOf[js.Any]).asInstanceOf[/* is node.Buffer */ Boolean]
    
    inline def `class`(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.Class<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("class_")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @sindresorhus/is.@sindresorhus/is.Class<unknown> */ Boolean]
    
    inline def dataView(value: js.Any): /* is std.DataView */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dataView")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.DataView */ Boolean]
    
    inline def date(value: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    inline def directInstanceOf[T](instance: js.Any, klass: Class[T]): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("directInstanceOf")(instance.asInstanceOf[js.Any], klass.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
    
    inline def domElement(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.DomElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("domElement")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @sindresorhus/is.@sindresorhus/is.DomElement */ Boolean]
    
    inline def emptyArray(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def emptyMap(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyMap")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def emptyObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def emptySet(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emptySet")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def emptyString(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def emptyStringOrWhitespace(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyStringOrWhitespace")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def error(value: js.Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
    
    inline def even(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("even")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def falsy(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("falsy")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def float32Array(value: js.Any): /* is std.Float32Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("float32Array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Float32Array */ Boolean]
    
    inline def float64Array(value: js.Any): /* is std.Float64Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("float64Array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Float64Array */ Boolean]
    
    inline def function(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("function_")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    
    inline def generator(value: js.Any): /* is std.Generator<unknown, any, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("generator")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Generator<unknown, any, unknown> */ Boolean]
    
    inline def generatorFunction(value: js.Any): /* is std.GeneratorFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("generatorFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.GeneratorFunction */ Boolean]
    
    inline def inRange(value: Double, range: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(value.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def inRange(value: Double, range: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(value.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def infinite(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("infinite")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def int16Array(value: js.Any): /* is std.Int16Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("int16Array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Int16Array */ Boolean]
    
    inline def int32Array(value: js.Any): /* is std.Int32Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("int32Array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Int32Array */ Boolean]
    
    inline def int8Array(value: js.Any): /* is std.Int8Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("int8Array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Int8Array */ Boolean]
    
    inline def integer(value: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def iterable(value: js.Any): /* is std.IterableIterator<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("iterable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.IterableIterator<unknown> */ Boolean]
    
    inline def map(value: js.Any): /* is std.Map<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Map<unknown, unknown> */ Boolean]
    
    inline def nan(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nan")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def nativePromise(value: js.Any): /* is std.Promise<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nativePromise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<unknown> */ Boolean]
    
    inline def nodeStream(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.NodeStream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeStream")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @sindresorhus/is.@sindresorhus/is.NodeStream */ Boolean]
    
    inline def nonEmptyArray(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nonEmptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def nonEmptyMap(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nonEmptyMap")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def nonEmptyObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nonEmptyObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def nonEmptySet(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nonEmptySet")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def nonEmptyString(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nonEmptyString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def `null`(value: js.Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("null_")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
    
    inline def nullOrUndefined(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nullOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def number(value: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def numericString(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("numericString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def `object`(value: js.Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
    
    inline def observable(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def odd(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("odd")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def plainObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("plainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def primitive(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.Primitive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("primitive")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @sindresorhus/is.@sindresorhus/is.Primitive */ Boolean]
    
    inline def promise(value: js.Any): /* is std.Promise<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<unknown> */ Boolean]
    
    inline def regExp(value: js.Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("regExp")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
    
    inline def safeInteger(value: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("safeInteger")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def set(value: js.Any): /* is std.Set<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Set<unknown> */ Boolean]
    
    inline def sharedArrayBuffer(value: js.Any): /* is std.SharedArrayBuffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sharedArrayBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.SharedArrayBuffer */ Boolean]
    
    inline def string(value: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def symbol(value: js.Any): /* is std.Symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Symbol */ Boolean]
    
    inline def truthy(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("truthy")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def typedArray(value: js.Any): /* is @sindresorhus/is.@sindresorhus/is.TypedArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("typedArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @sindresorhus/is.@sindresorhus/is.TypedArray */ Boolean]
    
    inline def uint16Array(value: js.Any): /* is std.Uint16Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("uint16Array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint16Array */ Boolean]
    
    inline def uint32Array(value: js.Any): /* is std.Uint32Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("uint32Array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint32Array */ Boolean]
    
    inline def uint8Array(value: js.Any): /* is std.Uint8Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("uint8Array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint8Array */ Boolean]
    
    inline def uint8ClampedArray(value: js.Any): /* is std.Uint8ClampedArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("uint8ClampedArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint8ClampedArray */ Boolean]
    
    inline def undefined(value: js.Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("undefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
    
    inline def urlInstance(value: js.Any): /* is std.URL */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("urlInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.URL */ Boolean]
    
    inline def urlString(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("urlString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def weakMap(value: js.Any): /* is std.WeakMap<object, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("weakMap")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.WeakMap<object, unknown> */ Boolean]
    
    inline def weakSet(value: js.Any): /* is std.WeakSet<object> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("weakSet")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.WeakSet<object> */ Boolean]
  }
  
  trait ArrayLike extends StObject {
    
    var length: Double
  }
  object ArrayLike {
    
    inline def apply(length: Double): ArrayLike = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayLike]
    }
    
    extension [Self <: ArrayLike](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Class[T]
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, T]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait DomElement extends StObject {
    
    var nodeName: String
    
    var nodeType: `1`
  }
  object DomElement {
    
    inline def apply(nodeName: String): DomElement = {
      val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeType = 1)
      __obj.asInstanceOf[DomElement]
    }
    
    extension [Self <: DomElement](x: Self) {
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: `1`): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait NodeStream extends StObject {
    
    var pipe: js.Function
  }
  object NodeStream {
    
    inline def apply(pipe: js.Function): NodeStream = {
      val __obj = js.Dynamic.literal(pipe = pipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeStream]
    }
    
    extension [Self <: NodeStream](x: Self) {
      
      inline def setPipe(value: js.Function): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
    }
  }
  
  type Primitive = js.UndefOr[Null | String | Double | Boolean | Symbol]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sindresorhusIs.sindresorhusIsStrings.`null`
    - typings.sindresorhusIs.sindresorhusIsStrings.boolean
    - typings.sindresorhusIs.sindresorhusIsStrings.undefined
    - typings.sindresorhusIs.sindresorhusIsStrings.string
    - typings.sindresorhusIs.sindresorhusIsStrings.number
    - typings.sindresorhusIs.sindresorhusIsStrings.symbol
    - typings.sindresorhusIs.sindresorhusIsStrings.Function
    - typings.sindresorhusIs.sindresorhusIsStrings.GeneratorFunction
    - typings.sindresorhusIs.sindresorhusIsStrings.AsyncFunction
    - typings.sindresorhusIs.sindresorhusIsStrings.Observable
    - typings.sindresorhusIs.sindresorhusIsStrings.Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Buffer
    - typings.sindresorhusIs.sindresorhusIsStrings.Object
    - typings.sindresorhusIs.sindresorhusIsStrings.RegExp
    - typings.sindresorhusIs.sindresorhusIsStrings.Date
    - typings.sindresorhusIs.sindresorhusIsStrings.Error
    - typings.sindresorhusIs.sindresorhusIsStrings.Map
    - typings.sindresorhusIs.sindresorhusIsStrings.Set
    - typings.sindresorhusIs.sindresorhusIsStrings.WeakMap
    - typings.sindresorhusIs.sindresorhusIsStrings.WeakSet
    - typings.sindresorhusIs.sindresorhusIsStrings.Int8Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Uint8Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Uint8ClampedArray
    - typings.sindresorhusIs.sindresorhusIsStrings.Int16Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Uint16Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Int32Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Uint32Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Float32Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Float64Array
    - typings.sindresorhusIs.sindresorhusIsStrings.ArrayBuffer
    - typings.sindresorhusIs.sindresorhusIsStrings.SharedArrayBuffer
    - typings.sindresorhusIs.sindresorhusIsStrings.DataView
    - typings.sindresorhusIs.sindresorhusIsStrings.Promise
    - typings.sindresorhusIs.sindresorhusIsStrings.URL
  */
  trait TypeName extends StObject
  object TypeName {
    
    inline def Array: typings.sindresorhusIs.sindresorhusIsStrings.Array = "Array".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Array]
    
    inline def ArrayBuffer: typings.sindresorhusIs.sindresorhusIsStrings.ArrayBuffer = "ArrayBuffer".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.ArrayBuffer]
    
    inline def AsyncFunction: typings.sindresorhusIs.sindresorhusIsStrings.AsyncFunction = "AsyncFunction".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.AsyncFunction]
    
    inline def Buffer: typings.sindresorhusIs.sindresorhusIsStrings.Buffer = "Buffer".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Buffer]
    
    inline def DataView: typings.sindresorhusIs.sindresorhusIsStrings.DataView = "DataView".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.DataView]
    
    inline def Date: typings.sindresorhusIs.sindresorhusIsStrings.Date = "Date".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Date]
    
    inline def Error: typings.sindresorhusIs.sindresorhusIsStrings.Error = "Error".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Error]
    
    inline def Float32Array: typings.sindresorhusIs.sindresorhusIsStrings.Float32Array = "Float32Array".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Float32Array]
    
    inline def Float64Array: typings.sindresorhusIs.sindresorhusIsStrings.Float64Array = "Float64Array".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Float64Array]
    
    inline def Function: typings.sindresorhusIs.sindresorhusIsStrings.Function = "Function".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Function]
    
    inline def GeneratorFunction: typings.sindresorhusIs.sindresorhusIsStrings.GeneratorFunction = "GeneratorFunction".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.GeneratorFunction]
    
    inline def Int16Array: typings.sindresorhusIs.sindresorhusIsStrings.Int16Array = "Int16Array".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Int16Array]
    
    inline def Int32Array: typings.sindresorhusIs.sindresorhusIsStrings.Int32Array = "Int32Array".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Int32Array]
    
    inline def Int8Array: typings.sindresorhusIs.sindresorhusIsStrings.Int8Array = "Int8Array".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Int8Array]
    
    inline def Map: typings.sindresorhusIs.sindresorhusIsStrings.Map = "Map".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Map]
    
    inline def Object: typings.sindresorhusIs.sindresorhusIsStrings.Object = "Object".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Object]
    
    inline def Observable: typings.sindresorhusIs.sindresorhusIsStrings.Observable = "Observable".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Observable]
    
    inline def Promise: typings.sindresorhusIs.sindresorhusIsStrings.Promise = "Promise".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Promise]
    
    inline def RegExp: typings.sindresorhusIs.sindresorhusIsStrings.RegExp = "RegExp".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.RegExp]
    
    inline def Set: typings.sindresorhusIs.sindresorhusIsStrings.Set = "Set".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Set]
    
    inline def SharedArrayBuffer: typings.sindresorhusIs.sindresorhusIsStrings.SharedArrayBuffer = "SharedArrayBuffer".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.SharedArrayBuffer]
    
    inline def URL: typings.sindresorhusIs.sindresorhusIsStrings.URL = "URL".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.URL]
    
    inline def Uint16Array: typings.sindresorhusIs.sindresorhusIsStrings.Uint16Array = "Uint16Array".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Uint16Array]
    
    inline def Uint32Array: typings.sindresorhusIs.sindresorhusIsStrings.Uint32Array = "Uint32Array".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Uint32Array]
    
    inline def Uint8Array: typings.sindresorhusIs.sindresorhusIsStrings.Uint8Array = "Uint8Array".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Uint8Array]
    
    inline def Uint8ClampedArray: typings.sindresorhusIs.sindresorhusIsStrings.Uint8ClampedArray = "Uint8ClampedArray".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Uint8ClampedArray]
    
    inline def WeakMap: typings.sindresorhusIs.sindresorhusIsStrings.WeakMap = "WeakMap".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.WeakMap]
    
    inline def WeakSet: typings.sindresorhusIs.sindresorhusIsStrings.WeakSet = "WeakSet".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.WeakSet]
    
    inline def boolean: typings.sindresorhusIs.sindresorhusIsStrings.boolean = "boolean".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.boolean]
    
    inline def `null`: typings.sindresorhusIs.sindresorhusIsStrings.`null` = "null".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.`null`]
    
    inline def number: typings.sindresorhusIs.sindresorhusIsStrings.number = "number".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.number]
    
    inline def string: typings.sindresorhusIs.sindresorhusIsStrings.string = "string".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.string]
    
    inline def symbol: typings.sindresorhusIs.sindresorhusIsStrings.symbol = "symbol".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.symbol]
    
    inline def undefined: typings.sindresorhusIs.sindresorhusIsStrings.undefined = "undefined".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.undefined]
  }
  
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
}
