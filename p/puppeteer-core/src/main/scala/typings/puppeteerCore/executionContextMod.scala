package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import typings.puppeteerCore.connectionMod.CDPSession
import typings.puppeteerCore.domworldMod.DOMWorld
import typings.puppeteerCore.evalTypesMod.EvaluateHandleFn
import typings.puppeteerCore.evalTypesMod.SerializableOrJSHandle
import typings.puppeteerCore.frameManagerMod.Frame
import typings.puppeteerCore.jshandleMod.ElementHandle
import typings.puppeteerCore.jshandleMod.JSHandle
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executionContextMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/ExecutionContext", "EVALUATION_SCRIPT_URL")
  @js.native
  val EVALUATION_SCRIPT_URL: /* "__puppeteer_evaluation_script__" */ String = js.native
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/ExecutionContext", "ExecutionContext")
  @js.native
  class ExecutionContext protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession, contextPayload: ExecutionContextDescription, world: DOMWorld) = this()
    
    /**
      * @internal
      */
    def _adoptBackendNodeId(backendNodeId: BackendNodeId): js.Promise[ElementHandle[Element]] = js.native
    
    /**
      * @internal
      */
    def _adoptElementHandle(elementHandle: ElementHandle[Element]): js.Promise[ElementHandle[Element]] = js.native
    
    /**
      * @internal
      */
    var _client: CDPSession = js.native
    
    /**
      * @internal
      */
    var _contextId: Double = js.native
    
    /* private */ var _evaluateInternal: js.Any = js.native
    
    /**
      * @internal
      */
    var _world: DOMWorld = js.native
    
    def evaluate[ReturnType /* <: js.Any */](pageFunction: String, args: js.Any*): js.Promise[ReturnType] = js.native
    /**
      * @remarks
      * If the function passed to the `executionContext.evaluate` returns a
      * Promise, then `executionContext.evaluate` would wait for the promise to
      * resolve and return its value. If the function passed to the
      * `executionContext.evaluate` returns a non-serializable value, then
      * `executionContext.evaluate` resolves to `undefined`. DevTools Protocol also
      * supports transferring some additional values that are not serializable by
      * `JSON`: `-0`, `NaN`, `Infinity`, `-Infinity`, and bigint literals.
      *
      *
      * @example
      * ```js
      * const executionContext = await page.mainFrame().executionContext();
      * const result = await executionContext.evaluate(() => Promise.resolve(8 * 7))* ;
      * console.log(result); // prints "56"
      * ```
      *
      * @example
      * A string can also be passed in instead of a function.
      *
      * ```js
      * console.log(await executionContext.evaluate('1 + 2')); // prints "3"
      * ```
      *
      * @example
      * {@link JSHandle} instances can be passed as arguments to the
      * `executionContext.* evaluate`:
      * ```js
      * const oneHandle = await executionContext.evaluateHandle(() => 1);
      * const twoHandle = await executionContext.evaluateHandle(() => 2);
      * const result = await executionContext.evaluate(
      *    (a, b) => a + b, oneHandle, * twoHandle
      * );
      * await oneHandle.dispose();
      * await twoHandle.dispose();
      * console.log(result); // prints '3'.
      * ```
      * @param pageFunction a function to be evaluated in the `executionContext`
      * @param args argument to pass to the page function
      *
      * @returns A promise that resolves to the return value of the given function.
      */
    def evaluate[ReturnType /* <: js.Any */](pageFunction: js.Function, args: js.Any*): js.Promise[ReturnType] = js.native
    
    /**
      * @remarks
      * The only difference between `executionContext.evaluate` and
      * `executionContext.evaluateHandle` is that `executionContext.evaluateHandle`
      * returns an in-page object (a {@link JSHandle}).
      * If the function passed to the `executionContext.evaluateHandle` returns a
      * Promise, then `executionContext.evaluateHandle` would wait for the
      * promise to resolve and return its value.
      *
      * @example
      * ```js
      * const context = await page.mainFrame().executionContext();
      * const aHandle = await context.evaluateHandle(() => Promise.resolve(self));
      * aHandle; // Handle for the global object.
      * ```
      *
      * @example
      * A string can also be passed in instead of a function.
      *
      * ```js
      * // Handle for the '3' * object.
      * const aHandle = await context.evaluateHandle('1 + 2');
      * ```
      *
      * @example
      * JSHandle instances can be passed as arguments
      * to the `executionContext.* evaluateHandle`:
      *
      * ```js
      * const aHandle = await context.evaluateHandle(() => document.body);
      * const resultHandle = await context.evaluateHandle(body => body.innerHTML, * aHandle);
      * console.log(await resultHandle.jsonValue()); // prints body's innerHTML
      * await aHandle.dispose();
      * await resultHandle.dispose();
      * ```
      *
      * @param pageFunction a function to be evaluated in the `executionContext`
      * @param args argument to pass to the page function
      *
      * @returns A promise that resolves to the return value of the given function
      * as an in-page object (a {@link JSHandle}).
      */
    def evaluateHandle[HandleType /* <: JSHandle | ElementHandle[Element] */](pageFunction: EvaluateHandleFn, args: SerializableOrJSHandle*): js.Promise[HandleType] = js.native
    
    /**
      * @remarks
      *
      * Not every execution context is associated with a frame. For
      * example, workers and extensions have execution contexts that are not
      * associated with frames.
      *
      * @returns The frame associated with this execution context.
      */
    def frame(): Frame | Null = js.native
    
    /**
      * This method iterates the JavaScript heap and finds all the objects with the
      * given prototype.
      * @remarks
      * @example
      * ```js
      * // Create a Map object
      * await page.evaluate(() => window.map = new Map());
      * // Get a handle to the Map object prototype
      * const mapPrototype = await page.evaluateHandle(() => Map.prototype);
      * // Query all map instances into an array
      * const mapInstances = await page.queryObjects(mapPrototype);
      * // Count amount of map objects in heap
      * const count = await page.evaluate(maps => maps.length, mapInstances);
      * await mapInstances.dispose();
      * await mapPrototype.dispose();
      * ```
      *
      * @param prototypeHandle a handle to the object prototype
      *
      * @returns A handle to an array of objects with the given prototype.
      */
    def queryObjects(prototypeHandle: JSHandle): js.Promise[JSHandle] = js.native
  }
}
