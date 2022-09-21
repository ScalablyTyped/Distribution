package typings.puppeteer

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDescription
import typings.puppeteer.commonConnectionMod.CDPSession
import typings.puppeteer.isolatedWorldMod.IsolatedWorld
import typings.puppeteer.typesMod.EvaluateFunc
import typings.puppeteer.typesMod.HandleFor
import typings.std.Awaited
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executionContextMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/ExecutionContext", "EVALUATION_SCRIPT_URL")
  @js.native
  val EVALUATION_SCRIPT_URL: /* "pptr://__puppeteer_evaluation_script__" */ String = js.native
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/ExecutionContext", "ExecutionContext")
  @js.native
  open class ExecutionContext protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession, contextPayload: ExecutionContextDescription) = this()
    def this(client: CDPSession, contextPayload: ExecutionContextDescription, world: IsolatedWorld) = this()
    
    /**
      * @internal
      */
    var _client: CDPSession = js.native
    
    /**
      * @internal
      */
    var _contextId: Double = js.native
    
    /**
      * @internal
      */
    var _contextName: String = js.native
    
    /**
      * @internal
      */
    var _world: js.UndefOr[IsolatedWorld] = js.native
    
    /**
      * Evaluates the given function.
      *
      * @example
      *
      * ```ts
      * const executionContext = await page.mainFrame().executionContext();
      * const result = await executionContext.evaluate(() => Promise.resolve(8 * 7))* ;
      * console.log(result); // prints "56"
      * ```
      *
      * @example
      * A string can also be passed in instead of a function:
      *
      * ```ts
      * console.log(await executionContext.evaluate('1 + 2')); // prints "3"
      * ```
      *
      * @example
      * Handles can also be passed as `args`. They resolve to their referenced object:
      *
      * ```ts
      * const oneHandle = await executionContext.evaluateHandle(() => 1);
      * const twoHandle = await executionContext.evaluateHandle(() => 2);
      * const result = await executionContext.evaluate(
      *   (a, b) => a + b,
      *   oneHandle,
      *   twoHandle
      * );
      * await oneHandle.dispose();
      * await twoHandle.dispose();
      * console.log(result); // prints '3'.
      * ```
      *
      * @param pageFunction - The function to evaluate.
      * @param args - Additional arguments to pass into the function.
      * @returns The result of evaluating the function. If the result is an object,
      * a vanilla object containing the serializable properties of the result is
      * returned.
      */
    def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    
    /**
      * Evaluates the given function.
      *
      * Unlike {@link ExecutionContext.evaluate | evaluate}, this method returns a
      * handle to the result of the function.
      *
      * This method may be better suited if the object cannot be serialized (e.g.
      * `Map`) and requires further manipulation.
      *
      * @example
      *
      * ```ts
      * const context = await page.mainFrame().executionContext();
      * const handle: JSHandle<typeof globalThis> = await context.evaluateHandle(
      *   () => Promise.resolve(self)
      * );
      * ```
      *
      * @example
      * A string can also be passed in instead of a function.
      *
      * ```ts
      * const handle: JSHandle<number> = await context.evaluateHandle('1 + 2');
      * ```
      *
      * @example
      * Handles can also be passed as `args`. They resolve to their referenced object:
      *
      * ```ts
      * const bodyHandle: ElementHandle<HTMLBodyElement> =
      *   await context.evaluateHandle(() => {
      *     return document.body;
      *   });
      * const stringHandle: JSHandle<string> = await context.evaluateHandle(
      *   body => body.innerHTML,
      *   body
      * );
      * console.log(await stringHandle.jsonValue()); // prints body's innerHTML
      * // Always dispose your garbage! :)
      * await bodyHandle.dispose();
      * await stringHandle.dispose();
      * ```
      *
      * @param pageFunction - The function to evaluate.
      * @param args - Additional arguments to pass into the function.
      * @returns A {@link JSHandle | handle} to the result of evaluating the
      * function. If the result is a `Node`, then this will return an
      * {@link ElementHandle | element handle}.
      */
    def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
