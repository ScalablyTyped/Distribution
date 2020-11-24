package typings.regeneratorRuntime.mod

import org.scalablytyped.runtime.StringDictionary
import typings.regeneratorRuntime.anon.ReadonlyCompletionRecord
import typings.regeneratorRuntime.anon.`0`
import typings.regeneratorRuntime.anon.readonlytryLocrootOmitTry
import typings.regeneratorRuntime.regeneratorRuntimeStrings.`return`
import typings.regeneratorRuntime.regeneratorRuntimeStrings.`throw`
import typings.regeneratorRuntime.regeneratorRuntimeStrings.break
import typings.regeneratorRuntime.regeneratorRuntimeStrings.continue
import typings.regeneratorRuntime.regeneratorRuntimeStrings.end
import typings.regeneratorRuntime.regeneratorRuntimeStrings.next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context[TYield, TReturn, TNext]
  extends /* temp */ StringDictionary[js.Any] {
  
  /**
    * @param type The completion type.
    * @param arg The [[Value]] or [[Target]] of the completion record.
    */
  def abrupt(`type`: CompletionType): js.Any = js.native
  def abrupt(`type`: CompletionType, arg: js.Any): js.Any = js.native
  /**
    * @param type The completion type.
    * @param nextLoc The location label to resume iteration at.
    */
  @JSName("abrupt")
  def abrupt_break(`type`: break, nextLoc: Double): js.Any = js.native
  @JSName("abrupt")
  def abrupt_continue(`type`: continue, nextLoc: Double): js.Any = js.native
  /**
    * @param type The completion type.
    * @param rval The return value.
    */
  @JSName("abrupt")
  def abrupt_return(`type`: `return`): js.Any = js.native
  @JSName("abrupt")
  def abrupt_return(`type`: `return`, rval: TReturn): js.Any = js.native
  /**
    * @param type The completion type.
    * @param exception The exception to throw.
    */
  @JSName("abrupt")
  def abrupt_throw(`type`: `throw`): scala.Nothing = js.native
  @JSName("abrupt")
  def abrupt_throw(`type`: `throw`, exception: js.Any): scala.Nothing = js.native
  
  /**
    * The argument passed to the generator method.
    */
  var arg: js.Any = js.native
  
  /**
    * Used to obtain the exception that was thrown in the associated try block.
    *
    * @param tryLoc The label of the beginning of the try block.
    */
  def `catch`(tryLoc: Double): js.Any = js.native
  
  /**
    * @param record The completion record.
    * @param afterLoc The location to resume the generator at, only used by normal completions.
    */
  def complete(record: ReadonlyCompletionRecord): js.Any = js.native
  def complete(record: ReadonlyCompletionRecord, afterLoc: ContextLocation): js.Any = js.native
  
  /**
    * If truthy, then it contains information about the currently `yield*` delegated iterator.
    */
  var delegate: js.UndefOr[DelegatedIterator] = js.native
  
  /**
    * @param iterable The iterable to delegate to.
    * @param resultName The name of the property to assign to on this context.
    * @param nextLoc The label of the location where to resume iteration.
    */
  def delegateYield(iterable: `0`[TYield], resultName: String, nextLoc: ContextLocation): js.Any = js.native
  
  /**
    * Dispatches an exception to `innerFn`
    *
    * @param exception The exception to dispatch.
    */
  def dispatchException(exception: js.Any): Boolean = js.native
  
  /**
    * Whether the generator has finished.
    */
  var done: Boolean = js.native
  
  /**
    * Used to signify the end of a finally block.
    *
    * @param finallyLoc The label of the beginning of the finally block.
    */
  def finish(finallyLoc: Double): js.Any = js.native
  
  /**
    * The generator method.
    */
  var method: next | `return` | `throw` = js.native
  
  /**
    * The label of the next location, is set to `'end'` when the generator needs to close abruptly.
    */
  var next: Double | end = js.native
  
  /**
    * The label of the previous location, needs to be set to `next` at the start of user code.
    */
  var prev: js.Any = js.native
  
  def reset(): Unit = js.native
  def reset(skipTempReset: Boolean): Unit = js.native
  
  /**
    * The return value, set by `abrupt("return")`.
    */
  var rval: TReturn = js.native
  
  /**
    * The value passed to `next()`.
    */
  var sent: TNext = js.native
  
  /**
    * Ends the iteration.
    */
  def stop(): TReturn = js.native
  
  val tryEntries: Array[readonlytryLocrootOmitTry | TryEntry] = js.native
}
