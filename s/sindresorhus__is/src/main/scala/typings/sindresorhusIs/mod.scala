package typings.sindresorhusIs

import org.scalablytyped.runtime.NumberDictionary
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.sindresorhusIs.anon.End
import typings.sindresorhusIs.sindresorhusIsStrings.AsyncIterable
import typings.sindresorhusIs.sindresorhusIsStrings.HTMLElement
import typings.sindresorhusIs.sindresorhusIsStrings.Iterable
import typings.sindresorhusIs.sindresorhusIsStrings.NaN
import typings.sindresorhusIs.sindresorhusIsStrings.T
import typings.sindresorhusIs.sindresorhusIsStrings.TypedArray
import typings.sindresorhusIs.sindresorhusIsStrings.`NodeDotjs Stream`
import typings.sindresorhusIs.sindresorhusIsStrings.`array-like`
import typings.sindresorhusIs.sindresorhusIsStrings.`empty array`
import typings.sindresorhusIs.sindresorhusIsStrings.`empty map`
import typings.sindresorhusIs.sindresorhusIsStrings.`empty object`
import typings.sindresorhusIs.sindresorhusIsStrings.`empty set`
import typings.sindresorhusIs.sindresorhusIsStrings.`empty string or whitespace`
import typings.sindresorhusIs.sindresorhusIsStrings.`empty string`
import typings.sindresorhusIs.sindresorhusIsStrings.`even integer`
import typings.sindresorhusIs.sindresorhusIsStrings.`in range`
import typings.sindresorhusIs.sindresorhusIsStrings.`infinite number`
import typings.sindresorhusIs.sindresorhusIsStrings.`native Promise`
import typings.sindresorhusIs.sindresorhusIsStrings.`non-empty array`
import typings.sindresorhusIs.sindresorhusIsStrings.`non-empty map`
import typings.sindresorhusIs.sindresorhusIsStrings.`non-empty object`
import typings.sindresorhusIs.sindresorhusIsStrings.`non-empty set`
import typings.sindresorhusIs.sindresorhusIsStrings.`non-empty string and not whitespace`
import typings.sindresorhusIs.sindresorhusIsStrings.`non-empty string`
import typings.sindresorhusIs.sindresorhusIsStrings.`null or undefined`
import typings.sindresorhusIs.sindresorhusIsStrings.`odd integer`
import typings.sindresorhusIs.sindresorhusIsStrings.`plain object`
import typings.sindresorhusIs.sindresorhusIsStrings.`predicate returns truthy for all values`
import typings.sindresorhusIs.sindresorhusIsStrings.`predicate returns truthy for any value`
import typings.sindresorhusIs.sindresorhusIsStrings.`string with a URL`
import typings.sindresorhusIs.sindresorhusIsStrings.`string with a number`
import typings.sindresorhusIs.sindresorhusIsStrings.integer
import typings.sindresorhusIs.typesMod.Class
import typings.sindresorhusIs.typesMod.Falsy
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(value: Any): TypeName = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[TypeName]
    
    @JSImport("@sindresorhus/is", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@sindresorhus/is", "default.all")
    @js.native
    def all: js.Function2[/* predicate */ Predicate, /* repeated */ Any, Boolean] = js.native
    inline def all_=(x: js.Function2[/* predicate */ Predicate, /* repeated */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.any")
    @js.native
    def any: js.Function2[/* predicate */ Predicate | js.Array[Predicate], /* repeated */ Any, Boolean] = js.native
    inline def any_=(x: js.Function2[/* predicate */ Predicate | js.Array[Predicate], /* repeated */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.array")
    @js.native
    def array: js.Function2[
        /* value */ Any, 
        /* assertion */ js.UndefOr[js.Function1[/* value */ Any, /* is unknown */ Boolean]], 
        /* is std.Array<unknown> */ Boolean
      ] = js.native
    
    @JSImport("@sindresorhus/is", "default.arrayBuffer")
    @js.native
    def arrayBuffer: js.Function1[/* value */ Any, /* is std.ArrayBuffer */ Boolean] = js.native
    inline def arrayBuffer_=(x: js.Function1[/* value */ Any, /* is std.ArrayBuffer */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.arrayLike")
    @js.native
    def arrayLike: js.Function1[
        /* value */ Any, 
        /* is @sindresorhus/is.@sindresorhus/is.ArrayLike<unknown> */ Boolean
      ] = js.native
    inline def arrayLike_=(
      x: js.Function1[
          /* value */ Any, 
          /* is @sindresorhus/is.@sindresorhus/is.ArrayLike<unknown> */ Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayLike")(x.asInstanceOf[js.Any])
    
    inline def array_=(
      x: js.Function2[
          /* value */ Any, 
          /* assertion */ js.UndefOr[js.Function1[/* value */ Any, /* is unknown */ Boolean]], 
          /* is std.Array<unknown> */ Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.asyncFunction")
    @js.native
    def asyncFunction: js.Function1[/* value */ Any, Boolean] = js.native
    inline def asyncFunction_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asyncFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.asyncGenerator")
    @js.native
    def asyncGenerator: js.Function1[/* value */ Any, /* is std.AsyncGenerator<unknown, any, unknown> */ Boolean] = js.native
    
    @JSImport("@sindresorhus/is", "default.asyncGeneratorFunction")
    @js.native
    def asyncGeneratorFunction: js.Function1[/* value */ Any, Boolean] = js.native
    inline def asyncGeneratorFunction_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asyncGeneratorFunction")(x.asInstanceOf[js.Any])
    
    inline def asyncGenerator_=(x: js.Function1[/* value */ Any, /* is std.AsyncGenerator<unknown, any, unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asyncGenerator")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.asyncIterable")
    @js.native
    def asyncIterable: js.Function1[/* value */ Any, /* is std.AsyncIterable<unknown> */ Boolean] = js.native
    inline def asyncIterable_=(x: js.Function1[/* value */ Any, /* is std.AsyncIterable<unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asyncIterable")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.bigInt64Array")
    @js.native
    def bigInt64Array: js.Function1[/* value */ Any, /* is std.BigInt64Array */ Boolean] = js.native
    inline def bigInt64Array_=(x: js.Function1[/* value */ Any, /* is std.BigInt64Array */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigInt64Array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.bigUint64Array")
    @js.native
    def bigUint64Array: js.Function1[/* value */ Any, /* is std.BigUint64Array */ Boolean] = js.native
    inline def bigUint64Array_=(x: js.Function1[/* value */ Any, /* is std.BigUint64Array */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigUint64Array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.bigint")
    @js.native
    def bigint: js.Function1[/* value */ Any, /* is bigint */ Boolean] = js.native
    inline def bigint_=(x: js.Function1[/* value */ Any, /* is bigint */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigint")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.blob")
    @js.native
    def blob: js.Function1[/* value */ Any, /* is std.Blob */ Boolean] = js.native
    inline def blob_=(x: js.Function1[/* value */ Any, /* is std.Blob */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blob")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.boolean")
    @js.native
    def boolean: js.Function1[/* value */ Any, /* is boolean */ Boolean] = js.native
    inline def boolean_=(x: js.Function1[/* value */ Any, /* is boolean */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.boundFunction")
    @js.native
    def boundFunction: js.Function1[/* value */ Any, /* is std.Function */ Boolean] = js.native
    inline def boundFunction_=(x: js.Function1[/* value */ Any, /* is std.Function */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.buffer")
    @js.native
    def buffer: js.Function1[/* value */ Any, /* is node.buffer.<global>.Buffer */ Boolean] = js.native
    inline def buffer_=(x: js.Function1[/* value */ Any, /* is node.buffer.<global>.Buffer */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffer")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.class_")
    @js.native
    val `class`: js.Function1[
        /* value */ Any, 
        /* is @sindresorhus/is.@sindresorhus/is/dist/types.Class<unknown, std.Array<any>> */ Boolean
      ] = js.native
    
    @JSImport("@sindresorhus/is", "default.dataView")
    @js.native
    def dataView: js.Function1[/* value */ Any, /* is std.DataView */ Boolean] = js.native
    inline def dataView_=(x: js.Function1[/* value */ Any, /* is std.DataView */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataView")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.date")
    @js.native
    def date: js.Function1[/* value */ Any, /* is std.Date */ Boolean] = js.native
    inline def date_=(x: js.Function1[/* value */ Any, /* is std.Date */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.directInstanceOf")
    @js.native
    def directInstanceOf: js.Function2[/* instance */ Any, /* class_ */ Class[Any, js.Array[Any]], /* is any */ Boolean] = js.native
    inline def directInstanceOf_=(x: js.Function2[/* instance */ Any, /* class_ */ Class[Any, js.Array[Any]], /* is any */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directInstanceOf")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.domElement")
    @js.native
    def domElement: js.Function1[/* value */ Any, /* is std.HTMLElement */ Boolean] = js.native
    inline def domElement_=(x: js.Function1[/* value */ Any, /* is std.HTMLElement */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domElement")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.emptyArray")
    @js.native
    def emptyArray: js.Function1[/* value */ Any, /* is std.Array<never> */ Boolean] = js.native
    inline def emptyArray_=(x: js.Function1[/* value */ Any, /* is std.Array<never> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyArray")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.emptyMap")
    @js.native
    def emptyMap: js.Function1[/* value */ Any, /* is std.Map<never, never> */ Boolean] = js.native
    inline def emptyMap_=(x: js.Function1[/* value */ Any, /* is std.Map<never, never> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyMap")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.emptyObject")
    @js.native
    def emptyObject: js.Function1[/* value */ Any, /* is std.Record<string, never> */ Boolean] = js.native
    inline def emptyObject_=(x: js.Function1[/* value */ Any, /* is std.Record<string, never> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyObject")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.emptySet")
    @js.native
    def emptySet: js.Function1[/* value */ Any, /* is std.Set<never> */ Boolean] = js.native
    inline def emptySet_=(x: js.Function1[/* value */ Any, /* is std.Set<never> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptySet")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.emptyString")
    @js.native
    def emptyString: js.Function1[/* value */ Any, Boolean] = js.native
    
    @JSImport("@sindresorhus/is", "default.emptyStringOrWhitespace")
    @js.native
    def emptyStringOrWhitespace: js.Function1[/* value */ Any, /* is string */ Boolean] = js.native
    inline def emptyStringOrWhitespace_=(x: js.Function1[/* value */ Any, /* is string */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyStringOrWhitespace")(x.asInstanceOf[js.Any])
    
    inline def emptyString_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyString")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.enumCase")
    @js.native
    def enumCase: js.Function2[/* value */ Any, /* targetEnum */ Any, Boolean] = js.native
    inline def enumCase_=(x: js.Function2[/* value */ Any, /* targetEnum */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enumCase")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.error")
    @js.native
    def error: js.Function1[/* value */ Any, /* is std.Error */ Boolean] = js.native
    inline def error_=(x: js.Function1[/* value */ Any, /* is std.Error */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.evenInteger")
    @js.native
    def evenInteger: js.Function1[/* value */ Double, /* is number */ Boolean] = js.native
    inline def evenInteger_=(x: js.Function1[/* value */ Double, /* is number */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("evenInteger")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.falsy")
    @js.native
    def falsy: js.Function1[
        /* value */ Falsy | Any, 
        /* is @sindresorhus/is.@sindresorhus/is/dist/types.Falsy */ Boolean
      ] = js.native
    inline def falsy_=(
      x: js.Function1[
          /* value */ Falsy | Any, 
          /* is @sindresorhus/is.@sindresorhus/is/dist/types.Falsy */ Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("falsy")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.float32Array")
    @js.native
    def float32Array: js.Function1[/* value */ Any, /* is std.Float32Array */ Boolean] = js.native
    inline def float32Array_=(x: js.Function1[/* value */ Any, /* is std.Float32Array */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float32Array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.float64Array")
    @js.native
    def float64Array: js.Function1[/* value */ Any, /* is std.Float64Array */ Boolean] = js.native
    inline def float64Array_=(x: js.Function1[/* value */ Any, /* is std.Float64Array */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float64Array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.formData")
    @js.native
    def formData: js.Function1[/* value */ Any, /* is std.FormData */ Boolean] = js.native
    inline def formData_=(x: js.Function1[/* value */ Any, /* is std.FormData */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formData")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.function_")
    @js.native
    def function: js.Function1[/* value */ Any, /* is std.Function */ Boolean] = js.native
    
    inline def function_=(x: js.Function1[/* value */ Any, /* is std.Function */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("function_")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.generator")
    @js.native
    def generator: js.Function1[/* value */ Any, /* is std.Generator<unknown, any, unknown> */ Boolean] = js.native
    
    @JSImport("@sindresorhus/is", "default.generatorFunction")
    @js.native
    def generatorFunction: js.Function1[/* value */ Any, /* is std.GeneratorFunction */ Boolean] = js.native
    inline def generatorFunction_=(x: js.Function1[/* value */ Any, /* is std.GeneratorFunction */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generatorFunction")(x.asInstanceOf[js.Any])
    
    inline def generator_=(x: js.Function1[/* value */ Any, /* is std.Generator<unknown, any, unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generator")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.inRange")
    @js.native
    def inRange: js.Function2[/* value */ Double, /* range */ Double | js.Array[Double], /* is number */ Boolean] = js.native
    inline def inRange_=(
      x: js.Function2[/* value */ Double, /* range */ Double | js.Array[Double], /* is number */ Boolean]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inRange")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.infinite")
    @js.native
    def infinite: js.Function1[/* value */ Any, /* is number */ Boolean] = js.native
    inline def infinite_=(x: js.Function1[/* value */ Any, /* is number */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infinite")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.int16Array")
    @js.native
    def int16Array: js.Function1[/* value */ Any, /* is std.Int16Array */ Boolean] = js.native
    inline def int16Array_=(x: js.Function1[/* value */ Any, /* is std.Int16Array */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int16Array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.int32Array")
    @js.native
    def int32Array: js.Function1[/* value */ Any, /* is std.Int32Array */ Boolean] = js.native
    inline def int32Array_=(x: js.Function1[/* value */ Any, /* is std.Int32Array */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int32Array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.int8Array")
    @js.native
    def int8Array: js.Function1[/* value */ Any, /* is std.Int8Array */ Boolean] = js.native
    inline def int8Array_=(x: js.Function1[/* value */ Any, /* is std.Int8Array */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int8Array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.integer")
    @js.native
    def integer: js.Function1[/* value */ Any, /* is number */ Boolean] = js.native
    inline def integer_=(x: js.Function1[/* value */ Any, /* is number */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integer")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.iterable")
    @js.native
    def iterable: js.Function1[/* value */ Any, /* is std.Iterable<unknown> */ Boolean] = js.native
    inline def iterable_=(x: js.Function1[/* value */ Any, /* is std.Iterable<unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterable")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.map")
    @js.native
    def map: js.Function1[/* value */ Any, /* is std.Map<unknown, unknown> */ Boolean] = js.native
    inline def map_=(x: js.Function1[/* value */ Any, /* is std.Map<unknown, unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.nan")
    @js.native
    def nan: js.Function1[/* value */ Any, Boolean] = js.native
    inline def nan_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nan")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.nativePromise")
    @js.native
    def nativePromise: js.Function1[/* value */ Any, /* is std.Promise<unknown> */ Boolean] = js.native
    inline def nativePromise_=(x: js.Function1[/* value */ Any, /* is std.Promise<unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativePromise")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.nodeStream")
    @js.native
    def nodeStream: js.Function1[/* value */ Any, /* is @sindresorhus/is.@sindresorhus/is.NodeStream */ Boolean] = js.native
    inline def nodeStream_=(x: js.Function1[/* value */ Any, /* is @sindresorhus/is.@sindresorhus/is.NodeStream */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeStream")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.nonEmptyArray")
    @js.native
    def nonEmptyArray: js.Function1[/* value */ Any, Boolean] = js.native
    inline def nonEmptyArray_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonEmptyArray")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.nonEmptyMap")
    @js.native
    def nonEmptyMap: js.Function1[/* value */ Any, /* is std.Map<unknown, unknown> */ Boolean] = js.native
    inline def nonEmptyMap_=(x: js.Function1[/* value */ Any, /* is std.Map<unknown, unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonEmptyMap")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.nonEmptyObject")
    @js.native
    def nonEmptyObject: js.Function1[/* value */ Any, /* is std.Record<string, unknown> */ Boolean] = js.native
    inline def nonEmptyObject_=(x: js.Function1[/* value */ Any, /* is std.Record<string, unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonEmptyObject")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.nonEmptySet")
    @js.native
    def nonEmptySet: js.Function1[/* value */ Any, /* is std.Set<unknown> */ Boolean] = js.native
    inline def nonEmptySet_=(x: js.Function1[/* value */ Any, /* is std.Set<unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonEmptySet")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.nonEmptyString")
    @js.native
    def nonEmptyString: js.Function1[/* value */ Any, /* is string */ Boolean] = js.native
    
    @JSImport("@sindresorhus/is", "default.nonEmptyStringAndNotWhitespace")
    @js.native
    def nonEmptyStringAndNotWhitespace: js.Function1[/* value */ Any, /* is string */ Boolean] = js.native
    inline def nonEmptyStringAndNotWhitespace_=(x: js.Function1[/* value */ Any, /* is string */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonEmptyStringAndNotWhitespace")(x.asInstanceOf[js.Any])
    
    inline def nonEmptyString_=(x: js.Function1[/* value */ Any, /* is string */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonEmptyString")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.null_")
    @js.native
    val `null`: js.Function1[/* value */ Any, /* is null */ Boolean] = js.native
    
    @JSImport("@sindresorhus/is", "default.nullOrUndefined")
    @js.native
    def nullOrUndefined: js.Function1[/* value */ Any, Boolean] = js.native
    inline def nullOrUndefined_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nullOrUndefined")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.number")
    @js.native
    def number: js.Function1[/* value */ Any, /* is number */ Boolean] = js.native
    inline def number_=(x: js.Function1[/* value */ Any, /* is number */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.numericString")
    @js.native
    def numericString: js.Function1[/* value */ Any, /* is string */ Boolean] = js.native
    inline def numericString_=(x: js.Function1[/* value */ Any, /* is string */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numericString")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.object")
    @js.native
    val `object`: js.Function1[/* value */ Any, /* is object */ Boolean] = js.native
    
    @JSImport("@sindresorhus/is", "default.observable")
    @js.native
    def observable: js.Function1[
        /* value */ Any, 
        /* is @sindresorhus/is.@sindresorhus/is/dist/types.ObservableLike */ Boolean
      ] = js.native
    inline def observable_=(
      x: js.Function1[
          /* value */ Any, 
          /* is @sindresorhus/is.@sindresorhus/is/dist/types.ObservableLike */ Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observable")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.oddInteger")
    @js.native
    def oddInteger: js.Function1[/* value */ Double, /* is number */ Boolean] = js.native
    inline def oddInteger_=(x: js.Function1[/* value */ Double, /* is number */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oddInteger")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.plainObject")
    @js.native
    def plainObject: js.Function1[/* value */ Any, /* is std.Record<std.PropertyKey, unknown> */ Boolean] = js.native
    inline def plainObject_=(x: js.Function1[/* value */ Any, /* is std.Record<std.PropertyKey, unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plainObject")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.primitive")
    @js.native
    def primitive: js.Function1[
        /* value */ Any, 
        /* is @sindresorhus/is.@sindresorhus/is/dist/types.Primitive */ Boolean
      ] = js.native
    inline def primitive_=(
      x: js.Function1[
          /* value */ Any, 
          /* is @sindresorhus/is.@sindresorhus/is/dist/types.Primitive */ Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primitive")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.promise")
    @js.native
    def promise: js.Function1[/* value */ Any, /* is std.Promise<unknown> */ Boolean] = js.native
    inline def promise_=(x: js.Function1[/* value */ Any, /* is std.Promise<unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promise")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.propertyKey")
    @js.native
    def propertyKey: js.Function1[/* value */ Any, /* is std.PropertyKey */ Boolean] = js.native
    inline def propertyKey_=(x: js.Function1[/* value */ Any, /* is std.PropertyKey */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propertyKey")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.regExp")
    @js.native
    def regExp: js.Function1[/* value */ Any, /* is std.RegExp */ Boolean] = js.native
    inline def regExp_=(x: js.Function1[/* value */ Any, /* is std.RegExp */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regExp")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.safeInteger")
    @js.native
    def safeInteger: js.Function1[/* value */ Any, /* is number */ Boolean] = js.native
    inline def safeInteger_=(x: js.Function1[/* value */ Any, /* is number */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safeInteger")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.set")
    @js.native
    def set: js.Function1[/* value */ Any, /* is std.Set<unknown> */ Boolean] = js.native
    inline def set_=(x: js.Function1[/* value */ Any, /* is std.Set<unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.sharedArrayBuffer")
    @js.native
    def sharedArrayBuffer: js.Function1[/* value */ Any, /* is std.SharedArrayBuffer */ Boolean] = js.native
    inline def sharedArrayBuffer_=(x: js.Function1[/* value */ Any, /* is std.SharedArrayBuffer */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sharedArrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.string")
    @js.native
    def string: js.Function1[/* value */ Any, /* is string */ Boolean] = js.native
    inline def string_=(x: js.Function1[/* value */ Any, /* is string */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.symbol")
    @js.native
    def symbol: js.Function1[/* value */ Any, /* is symbol */ Boolean] = js.native
    inline def symbol_=(x: js.Function1[/* value */ Any, /* is symbol */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.truthy")
    @js.native
    def truthy: js.Function1[/* value */ Falsy | Any, /* is any */ Boolean] = js.native
    inline def truthy_=(x: js.Function1[/* value */ Falsy | Any, /* is any */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("truthy")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.typedArray")
    @js.native
    def typedArray: js.Function1[
        /* value */ Any, 
        /* is @sindresorhus/is.@sindresorhus/is/dist/types.TypedArray */ Boolean
      ] = js.native
    inline def typedArray_=(
      x: js.Function1[
          /* value */ Any, 
          /* is @sindresorhus/is.@sindresorhus/is/dist/types.TypedArray */ Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typedArray")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.uint16Array")
    @js.native
    def uint16Array: js.Function1[/* value */ Any, /* is std.Uint16Array */ Boolean] = js.native
    inline def uint16Array_=(x: js.Function1[/* value */ Any, /* is std.Uint16Array */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint16Array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.uint32Array")
    @js.native
    def uint32Array: js.Function1[/* value */ Any, /* is std.Uint32Array */ Boolean] = js.native
    inline def uint32Array_=(x: js.Function1[/* value */ Any, /* is std.Uint32Array */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint32Array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.uint8Array")
    @js.native
    def uint8Array: js.Function1[/* value */ Any, /* is std.Uint8Array */ Boolean] = js.native
    inline def uint8Array_=(x: js.Function1[/* value */ Any, /* is std.Uint8Array */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint8Array")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.uint8ClampedArray")
    @js.native
    def uint8ClampedArray: js.Function1[/* value */ Any, /* is std.Uint8ClampedArray */ Boolean] = js.native
    inline def uint8ClampedArray_=(x: js.Function1[/* value */ Any, /* is std.Uint8ClampedArray */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint8ClampedArray")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.undefined")
    @js.native
    def undefined: js.Function1[/* value */ Any, /* is undefined */ Boolean] = js.native
    inline def undefined_=(x: js.Function1[/* value */ Any, /* is undefined */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.urlInstance")
    @js.native
    def urlInstance: js.Function1[/* value */ Any, /* is std.URL */ Boolean] = js.native
    inline def urlInstance_=(x: js.Function1[/* value */ Any, /* is std.URL */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlInstance")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.urlSearchParams")
    @js.native
    def urlSearchParams: js.Function1[/* value */ Any, /* is std.URLSearchParams */ Boolean] = js.native
    inline def urlSearchParams_=(x: js.Function1[/* value */ Any, /* is std.URLSearchParams */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlSearchParams")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.urlString")
    @js.native
    def urlString: js.Function1[/* value */ Any, /* is string */ Boolean] = js.native
    inline def urlString_=(x: js.Function1[/* value */ Any, /* is string */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlString")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.weakMap")
    @js.native
    def weakMap: js.Function1[/* value */ Any, /* is std.WeakMap<object, unknown> */ Boolean] = js.native
    inline def weakMap_=(x: js.Function1[/* value */ Any, /* is std.WeakMap<object, unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weakMap")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.weakRef")
    @js.native
    def weakRef: js.Function1[
        /* value */ Any, 
        /* is @sindresorhus/is.@sindresorhus/is/dist/types.WeakRef<object> */ Boolean
      ] = js.native
    inline def weakRef_=(
      x: js.Function1[
          /* value */ Any, 
          /* is @sindresorhus/is.@sindresorhus/is/dist/types.WeakRef<object> */ Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weakRef")(x.asInstanceOf[js.Any])
    
    @JSImport("@sindresorhus/is", "default.weakSet")
    @js.native
    def weakSet: js.Function1[/* value */ Any, /* is std.WeakSet<object> */ Boolean] = js.native
    inline def weakSet_=(x: js.Function1[/* value */ Any, /* is std.WeakSet<object> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weakSet")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sindresorhus/is", "assert")
  @js.native
  val assert: Assert_ = js.native
  
  trait ArrayLike[T]
    extends StObject
       with /* index */ NumberDictionary[T] {
    
    val length: Double
  }
  object ArrayLike {
    
    inline def apply[T](length: Double): ArrayLike[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayLike[T]]
    }
    
    extension [Self <: ArrayLike[?], T](x: Self & ArrayLike[T]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Assert_ extends StObject {
    
    def all(predicate: Predicate, values: Any*): Unit | scala.Nothing = js.native
    
    def any(predicate: js.Array[Predicate], values: Any*): Unit | scala.Nothing = js.native
    def any(predicate: Predicate, values: Any*): Unit | scala.Nothing = js.native
    
    def array[T](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Array))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
    def array[T](
      value: Any,
      assertion: js.Function1[
          /* element */ Any, 
          /* asserts element is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean
        ]
    ): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Array))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
    
    def arrayBuffer(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ArrayBuffer))),IArray())*/ Boolean = js.native
    
    def arrayLike[T](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(sindresorhus,is), TsIdentModule(Some(sindresorhus),List(is)), TsIdentSimple(ArrayLike))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
    
    def asyncFunction(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    
    def asyncGenerator(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(AsyncGenerator))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(unknown))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(any))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(unknown))),IArray())))*/ Boolean = js.native
    
    def asyncGeneratorFunction(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(AsyncGeneratorFunction))),IArray())*/ Boolean = js.native
    
    def asyncIterable[T](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(AsyncIterable))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
    
    def bigInt64Array(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(BigInt64Array))),IArray())*/ Boolean = js.native
    
    def bigUint64Array(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(BigUint64Array))),IArray())*/ Boolean = js.native
    
    def bigint(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(bigint))),IArray())*/ Boolean = js.native
    
    def blob(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Blob))),IArray())*/ Boolean = js.native
    
    def boolean(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(boolean))),IArray())*/ Boolean = js.native
    
    def boundFunction(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    
    def buffer(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(node), TsIdentModule(None,List(buffer)), TsIdentSimple(<global>), TsIdentSimple(Buffer))),IArray())*/ Boolean = js.native
    
    def class_(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(sindresorhus,is), TsIdentModule(Some(sindresorhus),List(is, dist, types)), TsIdentSimple(Class))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(unknown))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Array))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(any))),IArray())))))*/ Boolean = js.native
    
    def dataView(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(DataView))),IArray())*/ Boolean = js.native
    
    def date(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Date))),IArray())*/ Boolean = js.native
    
    def directInstanceOf[T](instance: Any, class_ : Class[T, js.Array[Any]]): /* asserts instance is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    
    def domElement(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(HTMLElement))),IArray())*/ Boolean = js.native
    
    def emptyArray(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Array))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(never))),IArray())))*/ Boolean = js.native
    
    def emptyMap(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Map))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(never))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(never))),IArray())))*/ Boolean = js.native
    
    def emptyObject[Key /* <: /* keyof any */ String */](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Record))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Key))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(never))),IArray())))*/ Boolean = js.native
    
    def emptySet(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Set))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(never))),IArray())))*/ Boolean = js.native
    
    def emptyString(value: Any): /* asserts value is TsTypeLiteral(Str())*/ Boolean = js.native
    
    def emptyStringOrWhitespace(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = js.native
    
    def enumCase[T](value: Any, targetEnum: T): /* asserts value is TsTypeLookup(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray()),TsTypeKeyOf(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
    
    def error(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Error))),IArray())*/ Boolean = js.native
    
    def evenInteger(value: Double): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = js.native
    
    def falsy(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(unknown))),IArray())*/ Boolean = js.native
    
    def float32Array(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Float32Array))),IArray())*/ Boolean = js.native
    
    def float64Array(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Float64Array))),IArray())*/ Boolean = js.native
    
    def formData(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(FormData))),IArray())*/ Boolean = js.native
    
    def function_(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Function))),IArray())*/ Boolean = js.native
    
    def generator(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Generator))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(unknown))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(any))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(unknown))),IArray())))*/ Boolean = js.native
    
    def generatorFunction(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(GeneratorFunction))),IArray())*/ Boolean = js.native
    
    def inRange(value: Double, range: js.Array[Double]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = js.native
    def inRange(value: Double, range: Double): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = js.native
    
    def infinite(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = js.native
    
    def int16Array(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Int16Array))),IArray())*/ Boolean = js.native
    
    def int32Array(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Int32Array))),IArray())*/ Boolean = js.native
    
    def int8Array(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Int8Array))),IArray())*/ Boolean = js.native
    
    def integer(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = js.native
    
    def iterable[T](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Iterable))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
    
    def map[Key, Value](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Map))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Key))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Value))),IArray())))*/ Boolean = js.native
    
    def nan(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(unknown))),IArray())*/ Boolean = js.native
    
    def nativePromise[T](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Promise))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
    
    def nodeStream(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(sindresorhus,is), TsIdentModule(Some(sindresorhus),List(is)), TsIdentSimple(NodeStream))),IArray())*/ Boolean = js.native
    
    def nonEmptyArray(value: Any): /* asserts value is TsTypeTuple(IArray(TsTupleElement(None,TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(unknown))),IArray())), TsTupleElement(None,TsTypeRepeated(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Array))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(unknown))),IArray())))))))*/ Boolean = js.native
    
    def nonEmptyMap[Key, Value](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Map))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Key))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Value))),IArray())))*/ Boolean = js.native
    
    def nonEmptyObject[Key /* <: /* keyof any */ String */, Value](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Record))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Key))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Value))),IArray())))*/ Boolean = js.native
    
    def nonEmptySet[T](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Set))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
    
    def nonEmptyString(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = js.native
    
    def nonEmptyStringAndNotWhitespace(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = js.native
    
    def nullOrUndefined(value: Any): /* asserts value is TsTypeUnion(IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean = js.native
    
    def null_(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean = js.native
    
    def number(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = js.native
    
    def numericString(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = js.native
    
    def `object`[Key /* <: /* keyof any */ String */, Value](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Record))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Key))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Value))),IArray())))*/ Boolean = js.native
    
    def observable(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(sindresorhus,is), TsIdentModule(Some(sindresorhus),List(is, dist, types)), TsIdentSimple(ObservableLike))),IArray())*/ Boolean = js.native
    
    def oddInteger(value: Double): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = js.native
    
    def plainObject[Value](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Record))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(PropertyKey))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Value))),IArray())))*/ Boolean = js.native
    
    def primitive(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(sindresorhus,is), TsIdentModule(Some(sindresorhus),List(is, dist, types)), TsIdentSimple(Primitive))),IArray())*/ Boolean = js.native
    
    def promise[T](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Promise))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
    
    def propertyKey(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(PropertyKey))),IArray())*/ Boolean = js.native
    
    def regExp(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(RegExp))),IArray())*/ Boolean = js.native
    
    def safeInteger(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())*/ Boolean = js.native
    
    def set[T](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Set))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
    
    def sharedArrayBuffer(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(SharedArrayBuffer))),IArray())*/ Boolean = js.native
    
    def string(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = js.native
    
    def symbol(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(symbol))),IArray())*/ Boolean = js.native
    
    def truthy(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(unknown))),IArray())*/ Boolean = js.native
    
    def typedArray(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(sindresorhus,is), TsIdentModule(Some(sindresorhus),List(is, dist, types)), TsIdentSimple(TypedArray))),IArray())*/ Boolean = js.native
    
    def uint16Array(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Uint16Array))),IArray())*/ Boolean = js.native
    
    def uint32Array(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Uint32Array))),IArray())*/ Boolean = js.native
    
    def uint8Array(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Uint8Array))),IArray())*/ Boolean = js.native
    
    def uint8ClampedArray(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Uint8ClampedArray))),IArray())*/ Boolean = js.native
    
    def undefined(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())*/ Boolean = js.native
    
    def urlInstance(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(URL))),IArray())*/ Boolean = js.native
    
    def urlSearchParams(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(URLSearchParams))),IArray())*/ Boolean = js.native
    
    def urlString(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())*/ Boolean = js.native
    
    def weakMap[Key /* <: js.Object */, Value](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(WeakMap))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Key))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(Value))),IArray())))*/ Boolean = js.native
    
    def weakRef[T /* <: js.Object */](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(sindresorhus,is), TsIdentModule(Some(sindresorhus),List(is, dist, types)), TsIdentSimple(WeakRef))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
    
    def weakSet[T /* <: js.Object */](value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(WeakSet))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sindresorhusIs.sindresorhusIsStrings.Class
    - typings.sindresorhusIs.sindresorhusIsStrings.`string with a number`
    - typings.sindresorhusIs.sindresorhusIsStrings.`null or undefined`
    - typings.sindresorhusIs.sindresorhusIsStrings.Iterable
    - typings.sindresorhusIs.sindresorhusIsStrings.AsyncIterable
    - typings.sindresorhusIs.sindresorhusIsStrings.`native Promise`
    - typings.sindresorhusIs.sindresorhusIsStrings.`string with a URL`
    - typings.sindresorhusIs.sindresorhusIsStrings.truthy
    - typings.sindresorhusIs.sindresorhusIsStrings.falsy
    - typings.sindresorhusIs.sindresorhusIsStrings.NaN
    - typings.sindresorhusIs.sindresorhusIsStrings.primitive
    - typings.sindresorhusIs.sindresorhusIsStrings.integer
    - typings.sindresorhusIs.sindresorhusIsStrings.`plain object`
    - typings.sindresorhusIs.sindresorhusIsStrings.`array-like`
    - typings.sindresorhusIs.sindresorhusIsStrings.TypedArray
    - typings.sindresorhusIs.sindresorhusIsStrings.HTMLElement
    - typings.sindresorhusIs.sindresorhusIsStrings.`NodeDotjs Stream`
    - typings.sindresorhusIs.sindresorhusIsStrings.`infinite number`
    - typings.sindresorhusIs.sindresorhusIsStrings.`empty array`
    - typings.sindresorhusIs.sindresorhusIsStrings.`non-empty array`
    - typings.sindresorhusIs.sindresorhusIsStrings.`empty string`
    - typings.sindresorhusIs.sindresorhusIsStrings.`empty string or whitespace`
    - typings.sindresorhusIs.sindresorhusIsStrings.`non-empty string`
    - typings.sindresorhusIs.sindresorhusIsStrings.`non-empty string and not whitespace`
    - typings.sindresorhusIs.sindresorhusIsStrings.`empty object`
    - typings.sindresorhusIs.sindresorhusIsStrings.`non-empty object`
    - typings.sindresorhusIs.sindresorhusIsStrings.`empty set`
    - typings.sindresorhusIs.sindresorhusIsStrings.`non-empty set`
    - typings.sindresorhusIs.sindresorhusIsStrings.`empty map`
    - typings.sindresorhusIs.sindresorhusIsStrings.`non-empty map`
    - typings.sindresorhusIs.sindresorhusIsStrings.`even integer`
    - typings.sindresorhusIs.sindresorhusIsStrings.`odd integer`
    - typings.sindresorhusIs.sindresorhusIsStrings.T
    - typings.sindresorhusIs.sindresorhusIsStrings.`in range`
    - typings.sindresorhusIs.sindresorhusIsStrings.`predicate returns truthy for any value`
    - typings.sindresorhusIs.sindresorhusIsStrings.`predicate returns truthy for all values`
  */
  trait AssertionTypeDescription extends StObject
  object AssertionTypeDescription {
    
    inline def all: `predicate returns truthy for all values` = ("predicate returns truthy for all values").asInstanceOf[`predicate returns truthy for all values`]
    
    inline def any: `predicate returns truthy for any value` = ("predicate returns truthy for any value").asInstanceOf[`predicate returns truthy for any value`]
    
    inline def arrayLike: `array-like` = "array-like".asInstanceOf[`array-like`]
    
    inline def asyncIterable: AsyncIterable = "AsyncIterable".asInstanceOf[AsyncIterable]
    
    inline def class_ : typings.sindresorhusIs.sindresorhusIsStrings.Class = "Class".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.Class]
    
    inline def directInstanceOf: T = "T".asInstanceOf[T]
    
    inline def domElement: HTMLElement = "HTMLElement".asInstanceOf[HTMLElement]
    
    inline def emptyArray: `empty array` = ("empty array").asInstanceOf[`empty array`]
    
    inline def emptyMap: `empty map` = ("empty map").asInstanceOf[`empty map`]
    
    inline def emptyObject: `empty object` = ("empty object").asInstanceOf[`empty object`]
    
    inline def emptySet: `empty set` = ("empty set").asInstanceOf[`empty set`]
    
    inline def emptyString: `empty string` = ("empty string").asInstanceOf[`empty string`]
    
    inline def emptyStringOrWhitespace: `empty string or whitespace` = ("empty string or whitespace").asInstanceOf[`empty string or whitespace`]
    
    inline def evenInteger: `even integer` = ("even integer").asInstanceOf[`even integer`]
    
    inline def falsy: typings.sindresorhusIs.sindresorhusIsStrings.falsy = "falsy".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.falsy]
    
    inline def inRange: `in range` = ("in range").asInstanceOf[`in range`]
    
    inline def infinite: `infinite number` = ("infinite number").asInstanceOf[`infinite number`]
    
    inline def integer: typings.sindresorhusIs.sindresorhusIsStrings.integer = "integer".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.integer]
    
    inline def iterable: Iterable = "Iterable".asInstanceOf[Iterable]
    
    inline def nan: NaN = "NaN".asInstanceOf[NaN]
    
    inline def nativePromise: `native Promise` = ("native Promise").asInstanceOf[`native Promise`]
    
    inline def nodeStream: `NodeDotjs Stream` = ("Node.js Stream").asInstanceOf[`NodeDotjs Stream`]
    
    inline def nonEmptyArray: `non-empty array` = ("non-empty array").asInstanceOf[`non-empty array`]
    
    inline def nonEmptyMap: `non-empty map` = ("non-empty map").asInstanceOf[`non-empty map`]
    
    inline def nonEmptyObject: `non-empty object` = ("non-empty object").asInstanceOf[`non-empty object`]
    
    inline def nonEmptySet: `non-empty set` = ("non-empty set").asInstanceOf[`non-empty set`]
    
    inline def nonEmptyString: `non-empty string` = ("non-empty string").asInstanceOf[`non-empty string`]
    
    inline def nonEmptyStringAndNotWhitespace: `non-empty string and not whitespace` = ("non-empty string and not whitespace").asInstanceOf[`non-empty string and not whitespace`]
    
    inline def nullOrUndefined: `null or undefined` = ("null or undefined").asInstanceOf[`null or undefined`]
    
    inline def numericString: `string with a number` = ("string with a number").asInstanceOf[`string with a number`]
    
    inline def oddInteger: `odd integer` = ("odd integer").asInstanceOf[`odd integer`]
    
    inline def plainObject: `plain object` = ("plain object").asInstanceOf[`plain object`]
    
    inline def primitive: typings.sindresorhusIs.sindresorhusIsStrings.primitive = "primitive".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.primitive]
    
    inline def safeInteger: integer = "integer".asInstanceOf[integer]
    
    inline def truthy: typings.sindresorhusIs.sindresorhusIsStrings.truthy = "truthy".asInstanceOf[typings.sindresorhusIs.sindresorhusIsStrings.truthy]
    
    inline def typedArray: TypedArray = "TypedArray".asInstanceOf[TypedArray]
    
    inline def urlString: `string with a URL` = ("string with a URL").asInstanceOf[`string with a URL`]
  }
  
  @js.native
  trait NodeStream
    extends StObject
       with EventEmitter {
    
    def pipe[T /* <: WritableStream[Any] */](destination: T): T = js.native
    def pipe[T /* <: WritableStream[Any] */](destination: T, options: End): T = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sindresorhusIs.sindresorhusIsStrings.Function
    - typings.sindresorhusIs.sindresorhusIsStrings.Generator
    - typings.sindresorhusIs.sindresorhusIsStrings.AsyncGenerator
    - typings.sindresorhusIs.sindresorhusIsStrings.GeneratorFunction
    - typings.sindresorhusIs.sindresorhusIsStrings.AsyncGeneratorFunction
    - typings.sindresorhusIs.sindresorhusIsStrings.AsyncFunction
    - typings.sindresorhusIs.sindresorhusIsStrings.Observable
    - typings.sindresorhusIs.sindresorhusIsStrings.Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Buffer
    - typings.sindresorhusIs.sindresorhusIsStrings.Blob
    - typings.sindresorhusIs.sindresorhusIsStrings.Object
    - typings.sindresorhusIs.sindresorhusIsStrings.RegExp
    - typings.sindresorhusIs.sindresorhusIsStrings.Date
    - typings.sindresorhusIs.sindresorhusIsStrings.Error
    - typings.sindresorhusIs.sindresorhusIsStrings.Map
    - typings.sindresorhusIs.sindresorhusIsStrings.Set
    - typings.sindresorhusIs.sindresorhusIsStrings.WeakMap
    - typings.sindresorhusIs.sindresorhusIsStrings.WeakSet
    - typings.sindresorhusIs.sindresorhusIsStrings.WeakRef
    - typings.sindresorhusIs.sindresorhusIsStrings.ArrayBuffer
    - typings.sindresorhusIs.sindresorhusIsStrings.SharedArrayBuffer
    - typings.sindresorhusIs.sindresorhusIsStrings.DataView
    - typings.sindresorhusIs.sindresorhusIsStrings.Promise
    - typings.sindresorhusIs.sindresorhusIsStrings.URL
    - typings.sindresorhusIs.sindresorhusIsStrings.FormData
    - typings.sindresorhusIs.sindresorhusIsStrings.URLSearchParams
    - typings.sindresorhusIs.sindresorhusIsStrings.HTMLElement
    - typings.sindresorhusIs.sindresorhusIsStrings.NaN
    - typings.sindresorhusIs.sindresorhusIsStrings.Int8Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Uint8Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Uint8ClampedArray
    - typings.sindresorhusIs.sindresorhusIsStrings.Int16Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Uint16Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Int32Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Uint32Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Float32Array
    - typings.sindresorhusIs.sindresorhusIsStrings.Float64Array
    - typings.sindresorhusIs.sindresorhusIsStrings.BigInt64Array
    - typings.sindresorhusIs.sindresorhusIsStrings.BigUint64Array
  */
  trait ObjectTypeName
    extends StObject
       with TypeName
  
  type Predicate = js.Function1[/* value */ Any, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sindresorhusIs.sindresorhusIsStrings.`null`
    - typings.sindresorhusIs.sindresorhusIsStrings.undefined
    - typings.sindresorhusIs.sindresorhusIsStrings.string
    - typings.sindresorhusIs.sindresorhusIsStrings.number
    - typings.sindresorhusIs.sindresorhusIsStrings.bigint
    - typings.sindresorhusIs.sindresorhusIsStrings.boolean
    - typings.sindresorhusIs.sindresorhusIsStrings.symbol
  */
  trait PrimitiveTypeName
    extends StObject
       with TypeName
  
  /* Rewritten from type alias, can be one of: 
    - typings.sindresorhusIs.mod.ObjectTypeName
    - typings.sindresorhusIs.mod.PrimitiveTypeName
  */
  trait TypeName extends StObject
}
