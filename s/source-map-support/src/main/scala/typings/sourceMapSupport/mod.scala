package typings.sourceMapSupport

import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("source-map-support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getErrorSource(error: js.Error): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorSource")(error.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def install(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[Unit]
  inline def install(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mapSourcePosition(position: Position): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("mapSourcePosition")(position.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  inline def resetRetrieveHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetRetrieveHandlers")().asInstanceOf[Unit]
  
  inline def retrieveSourceMap(source: String): UrlAndMap | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSourceMap")(source.asInstanceOf[js.Any]).asInstanceOf[UrlAndMap | Null]
  
  inline def wrapCallSite(frame: CallSite): CallSite = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapCallSite")(frame.asInstanceOf[js.Any]).asInstanceOf[CallSite]
  inline def wrapCallSite(frame: CallSite, state: State): CallSite = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapCallSite")(frame.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[CallSite]
  
  trait CallSite extends StObject {
    
    /**
      * Current column number [if this function was defined in a script]
      */
    def getColumnNumber(): Double | Null
    
    /**
      * A call site object representing the location where eval was called
      * [if this function was created using a call to eval]
      */
    def getEvalOrigin(): js.UndefOr[String]
    
    /**
      * Name of the script [if this function was defined in a script]
      */
    def getFileName(): String | Null
    
    /**
      * Current function
      */
    def getFunction(): js.UndefOr[js.Function1[/* repeated */ Any, Any]]
    
    /**
      * Name of the current function, typically its name property.
      * If a name property is not available an attempt will be made to try
      * to infer a name from the function's context.
      */
    def getFunctionName(): String | Null
    
    /**
      * Current line number [if this function was defined in a script]
      */
    def getLineNumber(): Double | Null
    
    /**
      * Name of the property [of "this" or one of its prototypes] that holds
      * the current function
      */
    def getMethodName(): String | Null
    
    var getScriptNameOrSourceURL: js.UndefOr[js.Function0[String]] = js.undefined
    
    /**
      * Value of "this"
      */
    def getThis(): Any
    
    /**
      * Type of "this" as a string.
      * This is the name of the function stored in the constructor field of
      * "this", if available.  Otherwise the object's [[Class]] internal
      * property.
      */
    def getTypeName(): String | Null
    
    /**
      * Is this a constructor call?
      */
    def isConstructor(): Boolean
    
    /**
      * Does this call take place in code defined by a call to eval?
      */
    def isEval(): Boolean
    
    /**
      * Is this call in native V8 code?
      */
    def isNative(): Boolean
    
    /**
      * Is this a toplevel invocation, that is, is "this" the global object?
      */
    def isToplevel(): Boolean
  }
  object CallSite {
    
    inline def apply(
      getColumnNumber: () => Double | Null,
      getEvalOrigin: () => js.UndefOr[String],
      getFileName: () => String | Null,
      getFunction: () => js.UndefOr[js.Function1[/* repeated */ Any, Any]],
      getFunctionName: () => String | Null,
      getLineNumber: () => Double | Null,
      getMethodName: () => String | Null,
      getThis: () => Any,
      getTypeName: () => String | Null,
      isConstructor: () => Boolean,
      isEval: () => Boolean,
      isNative: () => Boolean,
      isToplevel: () => Boolean
    ): CallSite = {
      val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
      __obj.asInstanceOf[CallSite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallSite] (val x: Self) extends AnyVal {
      
      inline def setGetColumnNumber(value: () => Double | Null): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      inline def setGetEvalOrigin(value: () => js.UndefOr[String]): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      inline def setGetFileName(value: () => String | Null): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      inline def setGetFunction(value: () => js.UndefOr[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
      
      inline def setGetFunctionName(value: () => String | Null): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      inline def setGetLineNumber(value: () => Double | Null): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      inline def setGetMethodName(value: () => String | Null): Self = StObject.set(x, "getMethodName", js.Any.fromFunction0(value))
      
      inline def setGetScriptNameOrSourceURL(value: () => String): Self = StObject.set(x, "getScriptNameOrSourceURL", js.Any.fromFunction0(value))
      
      inline def setGetScriptNameOrSourceURLUndefined: Self = StObject.set(x, "getScriptNameOrSourceURL", js.undefined)
      
      inline def setGetThis(value: () => Any): Self = StObject.set(x, "getThis", js.Any.fromFunction0(value))
      
      inline def setGetTypeName(value: () => String | Null): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      inline def setIsConstructor(value: () => Boolean): Self = StObject.set(x, "isConstructor", js.Any.fromFunction0(value))
      
      inline def setIsEval(value: () => Boolean): Self = StObject.set(x, "isEval", js.Any.fromFunction0(value))
      
      inline def setIsNative(value: () => Boolean): Self = StObject.set(x, "isNative", js.Any.fromFunction0(value))
      
      inline def setIsToplevel(value: () => Boolean): Self = StObject.set(x, "isToplevel", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sourceMapSupport.sourceMapSupportStrings.auto
    - typings.sourceMapSupport.sourceMapSupportStrings.browser
    - typings.sourceMapSupport.sourceMapSupportStrings.node
  */
  trait Environment extends StObject
  object Environment {
    
    inline def auto: typings.sourceMapSupport.sourceMapSupportStrings.auto = "auto".asInstanceOf[typings.sourceMapSupport.sourceMapSupportStrings.auto]
    
    inline def browser: typings.sourceMapSupport.sourceMapSupportStrings.browser = "browser".asInstanceOf[typings.sourceMapSupport.sourceMapSupportStrings.browser]
    
    inline def node: typings.sourceMapSupport.sourceMapSupportStrings.node = "node".asInstanceOf[typings.sourceMapSupport.sourceMapSupportStrings.node]
  }
  
  trait Options extends StObject {
    
    /**
      * If `true`, the caches are reset before a stack trace formatting operation.
      */
    var emptyCacheBetweenOperations: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The module will by default assume a browser environment if `XMLHttpRequest` and `window`
      * are defined. If either of these do not exist it will instead assume a node environment.
      * In some rare cases, e.g. when running a browser emulation and where both variables are
      * also set, you can explicitly specify the environment to be either `'browser'` or `'node'`.
      *
      * @example
      * import { install } from 'source-map-support';
      *
      * install({
      *   environment: 'node'
      * });
      */
    var environment: js.UndefOr[Environment] = js.undefined
    
    /**
      * This module installs two things: a change to the `stack` property on `Error`
      * objects and a handler for uncaught exceptions that mimics node's default exception
      * handler (the handler can be seen in the demos below). You may want to disable the
      * handler if you have your own uncaught exception handler. This can be done by passing
      * an argument to the installer.
      *
      * @example
      * import { install } from 'source-map-support';
      *
      * install({
      *   handleUncaughtExceptions: false
      * });
      */
    var handleUncaughtExceptions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To support files with inline source maps, the `hookRequire` options can be specified,
      * which will monitor all source files for inline source maps.
      *
      * This monkey patches the `require` module loading chain, so is not enabled by default
      * and is not recommended for any sort of production usage.
      *
      * @example
      * import { install } from 'source-map-support';
      *
      * install({
      *   hookRequire: true
      * });
      * ```
      */
    var hookRequire: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable all other means of retrieving file contents and use only the provided
      * `retrieveFile` handler.
      */
    var overrideRetrieveFile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable all other means of retrieving source maps and use only the provided
      * `retrieveSourceMap` handler.
      */
    var overrideRetrieveSourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow sources to be found by methods other than reading the files
      * directly from disk.
      */
    var retrieveFile: js.UndefOr[js.Function1[/* path */ String, String | Null]] = js.undefined
    
    /**
      * This module loads source maps from the filesystem by default. You can provide alternate
      * loading behavior through a callback as shown below. For example, [Meteor](https://github.com/meteor)
      * keeps all source maps cached in memory to avoid disk access.
      *
      * @example
      * import { install } from 'source-map-support';
      *
      * install({
      *   retrieveSourceMap(source) {
      *     if (source === 'compiled.js') {
      *       return {
      *         url: 'original.js',
      *         map: fs.readFileSync('compiled.js.map', 'utf8')
      *       };
      *     }
      *     return null;
      *   }
      * });
      */
    var retrieveSourceMap: js.UndefOr[js.Function1[/* source */ String, UrlAndMap | Null]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEmptyCacheBetweenOperations(value: Boolean): Self = StObject.set(x, "emptyCacheBetweenOperations", value.asInstanceOf[js.Any])
      
      inline def setEmptyCacheBetweenOperationsUndefined: Self = StObject.set(x, "emptyCacheBetweenOperations", js.undefined)
      
      inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setHandleUncaughtExceptions(value: Boolean): Self = StObject.set(x, "handleUncaughtExceptions", value.asInstanceOf[js.Any])
      
      inline def setHandleUncaughtExceptionsUndefined: Self = StObject.set(x, "handleUncaughtExceptions", js.undefined)
      
      inline def setHookRequire(value: Boolean): Self = StObject.set(x, "hookRequire", value.asInstanceOf[js.Any])
      
      inline def setHookRequireUndefined: Self = StObject.set(x, "hookRequire", js.undefined)
      
      inline def setOverrideRetrieveFile(value: Boolean): Self = StObject.set(x, "overrideRetrieveFile", value.asInstanceOf[js.Any])
      
      inline def setOverrideRetrieveFileUndefined: Self = StObject.set(x, "overrideRetrieveFile", js.undefined)
      
      inline def setOverrideRetrieveSourceMap(value: Boolean): Self = StObject.set(x, "overrideRetrieveSourceMap", value.asInstanceOf[js.Any])
      
      inline def setOverrideRetrieveSourceMapUndefined: Self = StObject.set(x, "overrideRetrieveSourceMap", js.undefined)
      
      inline def setRetrieveFile(value: /* path */ String => String | Null): Self = StObject.set(x, "retrieveFile", js.Any.fromFunction1(value))
      
      inline def setRetrieveFileUndefined: Self = StObject.set(x, "retrieveFile", js.undefined)
      
      inline def setRetrieveSourceMap(value: /* source */ String => UrlAndMap | Null): Self = StObject.set(x, "retrieveSourceMap", js.Any.fromFunction1(value))
      
      inline def setRetrieveSourceMapUndefined: Self = StObject.set(x, "retrieveSourceMap", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var column: Double
    
    var line: Double
    
    var source: String
  }
  object Position {
    
    inline def apply(column: Double, line: Double, source: String): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var curPosition: Position | Null
    
    var nextPosition: Position | Null
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal(curPosition = null, nextPosition = null)
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setCurPosition(value: Position): Self = StObject.set(x, "curPosition", value.asInstanceOf[js.Any])
      
      inline def setCurPositionNull: Self = StObject.set(x, "curPosition", null)
      
      inline def setNextPosition(value: Position): Self = StObject.set(x, "nextPosition", value.asInstanceOf[js.Any])
      
      inline def setNextPositionNull: Self = StObject.set(x, "nextPosition", null)
    }
  }
  
  trait UrlAndMap extends StObject {
    
    var map: String | RawSourceMap
    
    var url: js.UndefOr[String] = js.undefined
  }
  object UrlAndMap {
    
    inline def apply(map: String | RawSourceMap): UrlAndMap = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlAndMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlAndMap] (val x: Self) extends AnyVal {
      
      inline def setMap(value: String | RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
