package typings.roarr

import org.scalablytyped.runtime.StringDictionary
import typings.node.asyncHooksMod.AsyncLocalStorage
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.roarr.distSrcTypesMod.NestedAsyncLocalContext
    - typings.roarr.distSrcTypesMod.TopLevelAsyncLocalContext
  */
  trait AsyncLocalContext extends StObject
  object AsyncLocalContext {
    
    inline def NestedAsyncLocalContext(
      messageContext: StringDictionary[JsonValue],
      sequence: Double,
      sequenceRoot: String,
      transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
    ): typings.roarr.distSrcTypesMod.NestedAsyncLocalContext = {
      val __obj = js.Dynamic.literal(messageContext = messageContext.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequenceRoot = sequenceRoot.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.roarr.distSrcTypesMod.NestedAsyncLocalContext]
    }
    
    inline def TopLevelAsyncLocalContext(
      messageContext: StringDictionary[JsonValue],
      transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
    ): typings.roarr.distSrcTypesMod.TopLevelAsyncLocalContext = {
      val __obj = js.Dynamic.literal(messageContext = messageContext.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.roarr.distSrcTypesMod.TopLevelAsyncLocalContext]
    }
  }
  
  @js.native
  trait Child[Z] extends StObject {
    
    def apply(context: StringDictionary[JsonValue]): Logger[Z] = js.native
    def apply[T](context: TransformMessageFunction[MessageContext[T]]): Logger[T | Z] = js.native
  }
  
  trait JsonObject
    extends StObject
       with /* k */ StringDictionary[JsonValue]
  object JsonObject {
    
    inline def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  type JsonValue = js.UndefOr[JsonObject | js.Array[Any] | Boolean | Double | String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.roarr.roarrStrings.trace
    - typings.roarr.roarrStrings.debug
    - typings.roarr.roarrStrings.info
    - typings.roarr.roarrStrings.error
    - typings.roarr.roarrStrings.fatal
    - typings.roarr.roarrStrings.warn
  */
  trait LogLevelName extends StObject
  object LogLevelName {
    
    inline def debug: typings.roarr.roarrStrings.debug = "debug".asInstanceOf[typings.roarr.roarrStrings.debug]
    
    inline def error: typings.roarr.roarrStrings.error = "error".asInstanceOf[typings.roarr.roarrStrings.error]
    
    inline def fatal: typings.roarr.roarrStrings.fatal = "fatal".asInstanceOf[typings.roarr.roarrStrings.fatal]
    
    inline def info: typings.roarr.roarrStrings.info = "info".asInstanceOf[typings.roarr.roarrStrings.info]
    
    inline def trace: typings.roarr.roarrStrings.trace = "trace".asInstanceOf[typings.roarr.roarrStrings.trace]
    
    inline def warn: typings.roarr.roarrStrings.warn = "warn".asInstanceOf[typings.roarr.roarrStrings.warn]
  }
  
  @js.native
  trait LogMethod[Z] extends StObject {
    
    def apply[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
  }
  
  type LogWriter = js.Function1[/* message */ String, Unit]
  
  @js.native
  trait Logger[Z]
    extends StObject
       with LogMethod[Z] {
    
    def adopt[T](routine: js.Function0[T]): js.Promise[T] = js.native
    def adopt[T](routine: js.Function0[T], context: StringDictionary[JsonValue]): js.Promise[T] = js.native
    def adopt[T](routine: js.Function0[T], context: TransformMessageFunction[StringDictionary[JsonValue]]): js.Promise[T] = js.native
    
    def child(context: StringDictionary[JsonValue]): Logger[Z] = js.native
    def child[T](context: TransformMessageFunction[MessageContext[T]]): Logger[T | Z] = js.native
    @JSName("child")
    var child_Original: Child[Z] = js.native
    
    def debug[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    
    def debugOnce[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("debugOnce")
    var debugOnce_Original: LogMethod[Z] = js.native
    
    @JSName("debug")
    var debug_Original: LogMethod[Z] = js.native
    
    def error[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    
    def errorOnce[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("errorOnce")
    var errorOnce_Original: LogMethod[Z] = js.native
    
    @JSName("error")
    var error_Original: LogMethod[Z] = js.native
    
    def fatal[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    
    def fatalOnce[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("fatalOnce")
    var fatalOnce_Original: LogMethod[Z] = js.native
    
    @JSName("fatal")
    var fatal_Original: LogMethod[Z] = js.native
    
    def getContext(): StringDictionary[JsonValue] = js.native
    
    def info[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    
    def infoOnce[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("infoOnce")
    var infoOnce_Original: LogMethod[Z] = js.native
    
    @JSName("info")
    var info_Original: LogMethod[Z] = js.native
    
    def trace[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    
    def traceOnce[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("traceOnce")
    var traceOnce_Original: LogMethod[Z] = js.native
    
    @JSName("trace")
    var trace_Original: LogMethod[Z] = js.native
    
    def warn[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    
    def warnOnce[T /* <: String */](
      context: T | Z,
      message: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | T
        ],
      c: js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: T extends / * template literal string: ${string}%${string} * / string ? roarr.roarr/dist/src/types.SprintfArgument : never */ js.Any) | SprintfArgument
        ],
      d: js.UndefOr[SprintfArgument],
      e: js.UndefOr[SprintfArgument],
      f: js.UndefOr[SprintfArgument],
      g: js.UndefOr[SprintfArgument],
      h: js.UndefOr[SprintfArgument],
      i: js.UndefOr[SprintfArgument],
      j: js.UndefOr[SprintfArgument]
    ): Unit = js.native
    @JSName("warnOnce")
    var warnOnce_Original: LogMethod[Z] = js.native
    
    @JSName("warn")
    var warn_Original: LogMethod[Z] = js.native
  }
  
  trait Message[T] extends StObject {
    
    val context: T
    
    val message: String
    
    val sequence: String
    
    val time: Double
    
    val version: String
  }
  object Message {
    
    inline def apply[T](context: T, message: String, sequence: String, time: Double, version: String): Message[T] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message[T]]
    }
    
    extension [Self <: Message[?], T](x: Self & Message[T]) {
      
      inline def setContext(value: T): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageContext[T] = JsonObject & T
  
  @js.native
  trait MessageEventHandler extends StObject {
    
    def apply(message: Message[StringDictionary[JsonValue]]): Unit = js.native
  }
  
  @js.native
  trait MessageSerializer extends StObject {
    
    def apply(message: Message[StringDictionary[JsonValue]]): String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.roarr.distSrcTypesMod.AsyncLocalContext because Already inherited */ trait NestedAsyncLocalContext
    extends StObject
       with TopLevelAsyncLocalContext {
    
    var sequence: Double
    
    var sequenceRoot: String
  }
  object NestedAsyncLocalContext {
    
    inline def apply(
      messageContext: StringDictionary[JsonValue],
      sequence: Double,
      sequenceRoot: String,
      transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
    ): NestedAsyncLocalContext = {
      val __obj = js.Dynamic.literal(messageContext = messageContext.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequenceRoot = sequenceRoot.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedAsyncLocalContext]
    }
    
    extension [Self <: NestedAsyncLocalContext](x: Self) {
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceRoot(value: String): Self = StObject.set(x, "sequenceRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoarrGlobalState extends StObject {
    
    var asyncLocalStorage: js.UndefOr[AsyncLocalStorage[AsyncLocalContext]] = js.undefined
    
    var onceLog: Set[String]
    
    var sequence: Double
    
    var serializeMessage: js.UndefOr[MessageSerializer] = js.undefined
    
    var versions: js.Array[String]
    
    def write(message: String): Unit
    @JSName("write")
    var write_Original: LogWriter
  }
  object RoarrGlobalState {
    
    inline def apply(
      onceLog: Set[String],
      sequence: Double,
      versions: js.Array[String],
      write: /* message */ String => Unit
    ): RoarrGlobalState = {
      val __obj = js.Dynamic.literal(onceLog = onceLog.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[RoarrGlobalState]
    }
    
    extension [Self <: RoarrGlobalState](x: Self) {
      
      inline def setAsyncLocalStorage(value: AsyncLocalStorage[AsyncLocalContext]): Self = StObject.set(x, "asyncLocalStorage", value.asInstanceOf[js.Any])
      
      inline def setAsyncLocalStorageUndefined: Self = StObject.set(x, "asyncLocalStorage", js.undefined)
      
      inline def setOnceLog(value: Set[String]): Self = StObject.set(x, "onceLog", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSerializeMessage(value: MessageSerializer): Self = StObject.set(x, "serializeMessage", value.asInstanceOf[js.Any])
      
      inline def setSerializeMessageUndefined: Self = StObject.set(x, "serializeMessage", js.undefined)
      
      inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
      
      inline def setWrite(value: /* message */ String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  type SprintfArgument = Boolean | Double | String | Null
  
  trait TopLevelAsyncLocalContext
    extends StObject
       with AsyncLocalContext {
    
    var messageContext: StringDictionary[JsonValue]
    
    var transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
  }
  object TopLevelAsyncLocalContext {
    
    inline def apply(
      messageContext: StringDictionary[JsonValue],
      transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
    ): TopLevelAsyncLocalContext = {
      val __obj = js.Dynamic.literal(messageContext = messageContext.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelAsyncLocalContext]
    }
    
    extension [Self <: TopLevelAsyncLocalContext](x: Self) {
      
      inline def setMessageContext(value: StringDictionary[JsonValue]): Self = StObject.set(x, "messageContext", value.asInstanceOf[js.Any])
      
      inline def setTransforms(value: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsVarargs(value: TransformMessageFunction[StringDictionary[JsonValue]]*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  @js.native
  trait TransformMessageFunction[T] extends StObject {
    
    def apply(message: Message[T]): Message[StringDictionary[JsonValue]] = js.native
  }
}
