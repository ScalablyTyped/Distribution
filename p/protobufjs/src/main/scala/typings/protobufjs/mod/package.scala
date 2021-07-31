package typings.protobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def build: java.lang.String = typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("build").asInstanceOf[java.lang.String]

@scala.inline
def configure(): scala.Unit = typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[scala.Unit]

@scala.inline
def decoder(mtype: typings.protobufjs.mod.Type): typings.protobufjs.mod.Codegen = typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("decoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Codegen]

@scala.inline
def encoder(mtype: typings.protobufjs.mod.Type): typings.protobufjs.mod.Codegen = typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("encoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Codegen]

@scala.inline
def load(filename: java.lang.String): js.Promise[typings.protobufjs.mod.Root] = typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.protobufjs.mod.Root]]
@scala.inline
def load(filename: java.lang.String, callback: typings.protobufjs.mod.LoadCallback): scala.Unit = (typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def load(filename: java.lang.String, root: typings.protobufjs.mod.Root): js.Promise[typings.protobufjs.mod.Root] = (typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.protobufjs.mod.Root]]
@scala.inline
def load(
  filename: java.lang.String,
  root: typings.protobufjs.mod.Root,
  callback: typings.protobufjs.mod.LoadCallback
): scala.Unit = (typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def load(filename: js.Array[java.lang.String]): js.Promise[typings.protobufjs.mod.Root] = typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.protobufjs.mod.Root]]
@scala.inline
def load(filename: js.Array[java.lang.String], callback: typings.protobufjs.mod.LoadCallback): scala.Unit = (typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def load(filename: js.Array[java.lang.String], root: typings.protobufjs.mod.Root): js.Promise[typings.protobufjs.mod.Root] = (typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.protobufjs.mod.Root]]
@scala.inline
def load(
  filename: js.Array[java.lang.String],
  root: typings.protobufjs.mod.Root,
  callback: typings.protobufjs.mod.LoadCallback
): scala.Unit = (typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def loadSync(filename: java.lang.String): typings.protobufjs.mod.Root = typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Root]
@scala.inline
def loadSync(filename: java.lang.String, root: typings.protobufjs.mod.Root): typings.protobufjs.mod.Root = (typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Root]
@scala.inline
def loadSync(filename: js.Array[java.lang.String]): typings.protobufjs.mod.Root = typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Root]
@scala.inline
def loadSync(filename: js.Array[java.lang.String], root: typings.protobufjs.mod.Root): typings.protobufjs.mod.Root = (typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Root]

@scala.inline
def parse(source: java.lang.String): typings.protobufjs.mod.IParserResult = typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.IParserResult]
@scala.inline
def parse(source: java.lang.String, options: typings.protobufjs.mod.IParseOptions): typings.protobufjs.mod.IParserResult = (typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.IParserResult]
@scala.inline
def parse(source: java.lang.String, root: typings.protobufjs.mod.Root): typings.protobufjs.mod.IParserResult = (typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.IParserResult]
@scala.inline
def parse(
  source: java.lang.String,
  root: typings.protobufjs.mod.Root,
  options: typings.protobufjs.mod.IParseOptions
): typings.protobufjs.mod.IParserResult = (typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.IParserResult]

@scala.inline
def verifier(mtype: typings.protobufjs.mod.Type): typings.protobufjs.mod.Codegen = typings.protobufjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("verifier")(mtype.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Codegen]

type Buffer = typings.std.Uint8Array

/**
  * Node-style callback as used by {@link util.fetch}.
  * @param error Error, if any, otherwise `null`
  * @param [contents] File contents, if there hasn't been an error
  */
type FetchCallback = js.Function2[
/* error */ typings.std.Error, 
/* contents */ js.UndefOr[java.lang.String], 
scala.Unit]

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
type LoadCallback = js.Function2[
/* error */ typings.std.Error | scala.Null, 
/* root */ js.UndefOr[typings.protobufjs.mod.Root], 
scala.Unit]

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
type PoolAllocator = js.Function1[/* size */ scala.Double, typings.std.Uint8Array]

/**
  * A slicer as used by {@link util.pool}.
  * @param start Start offset
  * @param end End offset
  * @returns Buffer slice
  */
type PoolSlicer = js.ThisFunction2[
/* this */ typings.std.Uint8Array, 
/* start */ scala.Double, 
/* end */ scala.Double, 
typings.std.Uint8Array]

/** Properties type. */
type Properties[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? T[P]}
  */ typings.protobufjs.protobufjsStrings.Properties & org.scalablytyped.runtime.TopLevel[T]

/**
  * RPC implementation passed to {@link Service#create} performing a service request on network level, i.e. by utilizing http requests or websockets.
  * @param method Reflected or static method being called
  * @param requestData Request data
  * @param callback Callback function
  */
type RPCImpl = js.Function3[
/* method */ typings.protobufjs.mod.Method | (typings.protobufjs.mod.rpc.ServiceMethod[
  typings.protobufjs.mod.Message[js.Object], 
  typings.protobufjs.mod.Message[js.Object]
]), 
/* requestData */ typings.std.Uint8Array, 
/* callback */ typings.protobufjs.mod.RPCImplCallback, 
scala.Unit]

/**
  * Node-style callback as used by {@link RPCImpl}.
  * @param error Error, if any, otherwise `null`
  * @param [response] Response data or `null` to signal end of stream, if there hasn't been an error
  */
type RPCImplCallback = js.Function2[
/* error */ typings.std.Error | scala.Null, 
/* response */ js.UndefOr[typings.std.Uint8Array | scala.Null], 
scala.Unit]

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
scala.Boolean]

/**
  * Decorator function as returned by {@link Type.d} (TypeScript).
  * @param target Target constructor
  */
type TypeDecorator[T /* <: typings.protobufjs.mod.Message[T] */] = js.Function1[/* target */ typings.protobufjs.mod.Constructor[T], scala.Unit]

/**
  * From object converter part of an {@link IWrapper}.
  * @param object Plain object
  * @returns Message instance
  */
type WrapperFromObjectConverter = js.ThisFunction1[
/* this */ typings.protobufjs.mod.Type, 
/* object */ org.scalablytyped.runtime.StringDictionary[js.Any], 
typings.protobufjs.mod.Message[js.Object]]

/**
  * To object converter part of an {@link IWrapper}.
  * @param message Message instance
  * @param [options] Conversion options
  * @returns Plain object
  */
type WrapperToObjectConverter = js.ThisFunction2[
/* this */ typings.protobufjs.mod.Type, 
/* message */ typings.protobufjs.mod.Message[js.Object], 
/* options */ js.UndefOr[typings.protobufjs.mod.IConversionOptions], 
org.scalablytyped.runtime.StringDictionary[js.Any]]
