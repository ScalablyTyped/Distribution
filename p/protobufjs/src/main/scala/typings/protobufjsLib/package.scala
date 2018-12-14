package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protobufjsLib {
  /** Any extension field descriptor. */
  type AnyExtensionField = js.Any
  /** Any nested object descriptor. */
  type AnyNestedObject = js.Any | AnyExtensionField
  /**
   * Appends code to the function's body or finishes generation.
   * @param [formatStringOrScope] Format string or, to finish the function, an object of additional scope variables, if any
   * @param [formatParams] Format parameters
   * @returns Itself or the generated function if finished
   * @throws {Error} If format parameter counts do not match
   */
  type Codegen = js.Function2[
    /* formatStringOrScope */ js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* repeated */js.Any, 
    js.Object | js.Function
  ]
  /**
   * Event listener as used by {@link util.EventEmitter}.
   * @param args Arguments
   */
  type EventEmitterListener = js.Function1[/* repeated */js.Any, scala.Unit]
  /**
   * Node-style callback as used by {@link util.fetch}.
   * @param error Error, if any, otherwise `null`
   * @param [contents] File contents, if there hasn't been an error
   */
  type FetchCallback = js.Function2[/* error */ nodeLib.Error, /* contents */ js.UndefOr[java.lang.String], scala.Unit]
  /**
   * Decorator function as returned by {@link Field.d} and {@link MapField.d} (TypeScript).
   * @param prototype Target prototype
   * @param fieldName Field name
   */
  type FieldDecorator = js.Function2[/* prototype */ js.Object, /* fieldName */ java.lang.String, scala.Unit]
  /**
   * A node-style callback as used by {@link load} and {@link Root#load}.
   * @param error Error, if any, otherwise `null`
   * @param [root] Root, if there hasn't been an error
   */
  type LoadCallback = js.Function2[/* error */ nodeLib.Error | scala.Null, /* root */ js.UndefOr[js.Any], scala.Unit]
  /**
   * Decorator function as returned by {@link OneOf.d} (TypeScript).
   * @param prototype Target prototype
   * @param oneofName OneOf name
   */
  type OneOfDecorator = js.Function2[/* prototype */ js.Object, /* oneofName */ java.lang.String, scala.Unit]
  /**
   * A OneOf getter as returned by {@link util.oneOfGetter}.
   * @returns Set field name, if any
   */
  type OneOfGetter = js.Function0[js.UndefOr[java.lang.String]]
  /**
   * A OneOf setter as returned by {@link util.oneOfSetter}.
   * @param value Field name
   */
  type OneOfSetter = js.Function1[/* value */ js.UndefOr[java.lang.String], scala.Unit]
  /**
   * An allocator as used by {@link util.pool}.
   * @param size Buffer size
   * @returns Buffer
   */
  type PoolAllocator = js.Function1[/* size */ scala.Double, stdLib.Uint8Array]
  /**
   * A slicer as used by {@link util.pool}.
   * @param start Start offset
   * @param end End offset
   * @returns Buffer slice
   */
  type PoolSlicer = js.ThisFunction2[
    /* this */ stdLib.Uint8Array, 
    /* start */ scala.Double, 
    /* end */ scala.Double, 
    stdLib.Uint8Array
  ]
  /** Properties type. */
  type Properties[T] = protobufjsLib.protobufjsLibStrings.Properties with T
  /**
   * RPC implementation passed to {@link Service#create} performing a service request on network level, i.e. by utilizing http requests or websockets.
   * @param method Reflected or static method being called
   * @param requestData Request data
   * @param callback Callback function
   */
  type RPCImpl = js.Function3[
    /* method */ js.Any, 
    /* requestData */ stdLib.Uint8Array, 
    /* callback */ RPCImplCallback, 
    scala.Unit
  ]
  /**
   * Node-style callback as used by {@link RPCImpl}.
   * @param error Error, if any, otherwise `null`
   * @param [response] Response data or `null` to signal end of stream, if there hasn't been an error
   */
  type RPCImplCallback = js.Function2[
    /* error */ nodeLib.Error | scala.Null, 
    /* response */ js.UndefOr[stdLib.Uint8Array | scala.Null], 
    scala.Unit
  ]
  /**
   * Gets the comment on the previous line or, alternatively, the line comment on the specified line.
   * @param [line] Line number
   * @returns Comment text or `null` if none
   */
  type TokenizerHandleCmnt = js.Function1[/* line */ js.UndefOr[scala.Double], java.lang.String | scala.Null]
  /**
   * Gets the next token and advances.
   * @returns Next token or `null` on eof
   */
  type TokenizerHandleNext = js.Function0[java.lang.String | scala.Null]
  /**
   * Peeks for the next token.
   * @returns Next token or `null` on eof
   */
  type TokenizerHandlePeek = js.Function0[java.lang.String | scala.Null]
  /**
   * Pushes a token back to the stack.
   * @param token Token
   */
  type TokenizerHandlePush = js.Function1[/* token */ java.lang.String, scala.Unit]
  /**
   * Skips the next token.
   * @param expected Expected token
   * @param [optional=false] If optional
   * @returns Whether the token matched
   * @throws {Error} If the token didn't match and is not optional
   */
  type TokenizerHandleSkip = js.Function2[
    /* expected */ java.lang.String, 
    /* optional */ js.UndefOr[scala.Boolean], 
    scala.Boolean
  ]
  /**
   * Decorator function as returned by {@link Type.d} (TypeScript).
   * @param target Target constructor
   */
  type TypeDecorator[T /* <: js.Any */] = js.Function1[/* target */ js.Any, scala.Unit]
  /**
   * From object converter part of an {@link IWrapper}.
   * @param object Plain object
   * @returns Message instance
   */
  type WrapperFromObjectConverter = js.ThisFunction1[
    /* this */ js.Any, 
    /* object */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    js.Any
  ]
  /**
   * To object converter part of an {@link IWrapper}.
   * @param message Message instance
   * @param [options] Conversion options
   * @returns Plain object
   */
  type WrapperToObjectConverter = js.ThisFunction2[
    /* this */ js.Any, 
    /* message */ js.Any, 
    /* options */ js.UndefOr[js.Any], 
    org.scalablytyped.runtime.StringDictionary[js.Any]
  ]
  /**
   * Callback as used by {@link util.asPromise}.
   * @param error Error, if any
   * @param params Additional arguments
   */
  type asPromiseCallback = js.Function2[/* error */ nodeLib.Error | scala.Null, /* repeated */js.Any, scala.Unit]
}
