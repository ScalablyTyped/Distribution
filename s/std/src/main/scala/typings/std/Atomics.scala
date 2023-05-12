package typings.std

import typings.std.anon.Async
import typings.std.anon.Value
import typings.std.stdStrings.`not-equal`
import typings.std.stdStrings.`timed-out`
import typings.std.stdStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Atomics extends StObject {
  
  def add(typedArray: js.typedarray.Int16Array, index: Double, value: Double): Double = js.native
  def add(typedArray: js.typedarray.Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Adds a value to the value at the given position in the array, returning the original value.
    * Until this atomic operation completes, any other read or write operation against the array
    * will block.
    */
  /* standard es2017.sharedmemory */
  def add(typedArray: js.typedarray.Int8Array, index: Double, value: Double): Double = js.native
  def add(typedArray: js.typedarray.Uint16Array, index: Double, value: Double): Double = js.native
  def add(typedArray: js.typedarray.Uint32Array, index: Double, value: Double): Double = js.native
  def add(typedArray: js.typedarray.Uint8Array, index: Double, value: Double): Double = js.native
  /**
    * Adds a value to the value at the given position in the array, returning the original value.
    * Until this atomic operation completes, any other read or write operation against the array
    * will block.
    */
  /* standard es2020.sharedmemory */
  def add(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def add(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  
  def and(typedArray: js.typedarray.Int16Array, index: Double, value: Double): Double = js.native
  def and(typedArray: js.typedarray.Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Stores the bitwise AND of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or
    * write operation against the array will block.
    */
  /* standard es2017.sharedmemory */
  def and(typedArray: js.typedarray.Int8Array, index: Double, value: Double): Double = js.native
  def and(typedArray: js.typedarray.Uint16Array, index: Double, value: Double): Double = js.native
  def and(typedArray: js.typedarray.Uint32Array, index: Double, value: Double): Double = js.native
  def and(typedArray: js.typedarray.Uint8Array, index: Double, value: Double): Double = js.native
  /**
    * Stores the bitwise AND of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or
    * write operation against the array will block.
    */
  /* standard es2020.sharedmemory */
  def and(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def and(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  
  def compareExchange(
    typedArray: js.typedarray.Int16Array,
    index: Double,
    expectedValue: Double,
    replacementValue: Double
  ): Double = js.native
  def compareExchange(
    typedArray: js.typedarray.Int32Array,
    index: Double,
    expectedValue: Double,
    replacementValue: Double
  ): Double = js.native
  /**
    * Replaces the value at the given position in the array if the original value equals the given
    * expected value, returning the original value. Until this atomic operation completes, any
    * other read or write operation against the array will block.
    */
  /* standard es2017.sharedmemory */
  def compareExchange(
    typedArray: js.typedarray.Int8Array,
    index: Double,
    expectedValue: Double,
    replacementValue: Double
  ): Double = js.native
  def compareExchange(
    typedArray: js.typedarray.Uint16Array,
    index: Double,
    expectedValue: Double,
    replacementValue: Double
  ): Double = js.native
  def compareExchange(
    typedArray: js.typedarray.Uint32Array,
    index: Double,
    expectedValue: Double,
    replacementValue: Double
  ): Double = js.native
  def compareExchange(
    typedArray: js.typedarray.Uint8Array,
    index: Double,
    expectedValue: Double,
    replacementValue: Double
  ): Double = js.native
  /**
    * Replaces the value at the given position in the array if the original value equals the given
    * expected value, returning the original value. Until this atomic operation completes, any
    * other read or write operation against the array will block.
    */
  /* standard es2020.sharedmemory */
  def compareExchange(typedArray: BigInt64Array, index: Double, expectedValue: js.BigInt, replacementValue: js.BigInt): js.BigInt = js.native
  def compareExchange(typedArray: BigUint64Array, index: Double, expectedValue: js.BigInt, replacementValue: js.BigInt): js.BigInt = js.native
  
  def exchange(typedArray: js.typedarray.Int16Array, index: Double, value: Double): Double = js.native
  def exchange(typedArray: js.typedarray.Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Replaces the value at the given position in the array, returning the original value. Until
    * this atomic operation completes, any other read or write operation against the array will
    * block.
    */
  /* standard es2017.sharedmemory */
  def exchange(typedArray: js.typedarray.Int8Array, index: Double, value: Double): Double = js.native
  def exchange(typedArray: js.typedarray.Uint16Array, index: Double, value: Double): Double = js.native
  def exchange(typedArray: js.typedarray.Uint32Array, index: Double, value: Double): Double = js.native
  def exchange(typedArray: js.typedarray.Uint8Array, index: Double, value: Double): Double = js.native
  /**
    * Replaces the value at the given position in the array, returning the original value. Until
    * this atomic operation completes, any other read or write operation against the array will
    * block.
    */
  /* standard es2020.sharedmemory */
  def exchange(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def exchange(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  
  /**
    * Returns a value indicating whether high-performance algorithms can use atomic operations
    * (`true`) or must use locks (`false`) for the given number of bytes-per-element of a typed
    * array.
    */
  /* standard es2017.sharedmemory */
  def isLockFree(size: Double): scala.Boolean = js.native
  
  def load(typedArray: js.typedarray.Int16Array, index: Double): Double = js.native
  def load(typedArray: js.typedarray.Int32Array, index: Double): Double = js.native
  /**
    * Returns the value at the given position in the array. Until this atomic operation completes,
    * any other read or write operation against the array will block.
    */
  /* standard es2017.sharedmemory */
  def load(typedArray: js.typedarray.Int8Array, index: Double): Double = js.native
  def load(typedArray: js.typedarray.Uint16Array, index: Double): Double = js.native
  def load(typedArray: js.typedarray.Uint32Array, index: Double): Double = js.native
  def load(typedArray: js.typedarray.Uint8Array, index: Double): Double = js.native
  /**
    * Returns the value at the given position in the array. Until this atomic operation completes,
    * any other read or write operation against the array will block.
    */
  /* standard es2020.sharedmemory */
  def load(typedArray: BigInt64Array, index: Double): js.BigInt = js.native
  def load(typedArray: BigUint64Array, index: Double): js.BigInt = js.native
  
  /**
    * Wakes up sleeping agents that are waiting on the given index of the array, returning the
    * number of agents that were awoken.
    * @param typedArray A shared Int32Array.
    * @param index The position in the typedArray to wake up on.
    * @param count The number of sleeping agents to notify. Defaults to +Infinity.
    */
  /* standard es2017.sharedmemory */
  def notify(typedArray: js.typedarray.Int32Array, index: Double): Double = js.native
  def notify(typedArray: js.typedarray.Int32Array, index: Double, count: Double): Double = js.native
  /**
    * Wakes up sleeping agents that are waiting on the given index of the array, returning the
    * number of agents that were awoken.
    * @param typedArray A shared BigInt64Array.
    * @param index The position in the typedArray to wake up on.
    * @param count The number of sleeping agents to notify. Defaults to +Infinity.
    */
  /* standard es2020.sharedmemory */
  def notify(typedArray: BigInt64Array, index: Double): Double = js.native
  def notify(typedArray: BigInt64Array, index: Double, count: Double): Double = js.native
  
  def or(typedArray: js.typedarray.Int16Array, index: Double, value: Double): Double = js.native
  def or(typedArray: js.typedarray.Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Stores the bitwise OR of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or write
    * operation against the array will block.
    */
  /* standard es2017.sharedmemory */
  def or(typedArray: js.typedarray.Int8Array, index: Double, value: Double): Double = js.native
  def or(typedArray: js.typedarray.Uint16Array, index: Double, value: Double): Double = js.native
  def or(typedArray: js.typedarray.Uint32Array, index: Double, value: Double): Double = js.native
  def or(typedArray: js.typedarray.Uint8Array, index: Double, value: Double): Double = js.native
  /**
    * Stores the bitwise OR of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or write
    * operation against the array will block.
    */
  /* standard es2020.sharedmemory */
  def or(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def or(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  
  def store(typedArray: js.typedarray.Int16Array, index: Double, value: Double): Double = js.native
  def store(typedArray: js.typedarray.Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Stores a value at the given position in the array, returning the new value. Until this
    * atomic operation completes, any other read or write operation against the array will block.
    */
  /* standard es2017.sharedmemory */
  def store(typedArray: js.typedarray.Int8Array, index: Double, value: Double): Double = js.native
  def store(typedArray: js.typedarray.Uint16Array, index: Double, value: Double): Double = js.native
  def store(typedArray: js.typedarray.Uint32Array, index: Double, value: Double): Double = js.native
  def store(typedArray: js.typedarray.Uint8Array, index: Double, value: Double): Double = js.native
  /**
    * Stores a value at the given position in the array, returning the new value. Until this
    * atomic operation completes, any other read or write operation against the array will block.
    */
  /* standard es2020.sharedmemory */
  def store(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def store(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  
  def sub(typedArray: js.typedarray.Int16Array, index: Double, value: Double): Double = js.native
  def sub(typedArray: js.typedarray.Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Subtracts a value from the value at the given position in the array, returning the original
    * value. Until this atomic operation completes, any other read or write operation against the
    * array will block.
    */
  /* standard es2017.sharedmemory */
  def sub(typedArray: js.typedarray.Int8Array, index: Double, value: Double): Double = js.native
  def sub(typedArray: js.typedarray.Uint16Array, index: Double, value: Double): Double = js.native
  def sub(typedArray: js.typedarray.Uint32Array, index: Double, value: Double): Double = js.native
  def sub(typedArray: js.typedarray.Uint8Array, index: Double, value: Double): Double = js.native
  /**
    * Subtracts a value from the value at the given position in the array, returning the original
    * value. Until this atomic operation completes, any other read or write operation against the
    * array will block.
    */
  /* standard es2020.sharedmemory */
  def sub(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def sub(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  
  /* standard es2017.sharedmemory */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typings.std.stdStrings.Atomics = js.native
  
  /**
    * If the value at the given position in the array is equal to the provided value, the current
    * agent is put to sleep causing execution to suspend until the timeout expires (returning
    * `"timed-out"`) or until the agent is awoken (returning `"ok"`); otherwise, returns
    * `"not-equal"`.
    */
  /* standard es2017.sharedmemory */
  def wait(typedArray: js.typedarray.Int32Array, index: Double, value: Double): ok | `not-equal` | `timed-out` = js.native
  def wait(typedArray: js.typedarray.Int32Array, index: Double, value: Double, timeout: Double): ok | `not-equal` | `timed-out` = js.native
  /**
    * If the value at the given position in the array is equal to the provided value, the current
    * agent is put to sleep causing execution to suspend until the timeout expires (returning
    * `"timed-out"`) or until the agent is awoken (returning `"ok"`); otherwise, returns
    * `"not-equal"`.
    */
  /* standard es2020.sharedmemory */
  def wait(typedArray: BigInt64Array, index: Double, value: js.BigInt): ok | `not-equal` | `timed-out` = js.native
  def wait(typedArray: BigInt64Array, index: Double, value: js.BigInt, timeout: Double): ok | `not-equal` | `timed-out` = js.native
  
  /**
    * A non-blocking, asynchronous version of wait which is usable on the main thread.
    * Waits asynchronously on a shared memory location and returns a Promise
    * @param typedArray A shared Int32Array or BigInt64Array.
    * @param index The position in the typedArray to wait on.
    * @param value The expected value to test.
    * @param [timeout] The expected value to test.
    */
  /* standard es2022.sharedmemory */
  def waitAsync(typedArray: js.typedarray.Int32Array, index: Double, value: Double): Async | Value = js.native
  def waitAsync(typedArray: js.typedarray.Int32Array, index: Double, value: Double, timeout: Double): Async | Value = js.native
  /**
    * A non-blocking, asynchronous version of wait which is usable on the main thread.
    * Waits asynchronously on a shared memory location and returns a Promise
    * @param typedArray A shared Int32Array or BigInt64Array.
    * @param index The position in the typedArray to wait on.
    * @param value The expected value to test.
    * @param [timeout] The expected value to test.
    */
  /* standard es2022.sharedmemory */
  def waitAsync(typedArray: BigInt64Array, index: Double, value: js.BigInt): Async | Value = js.native
  def waitAsync(typedArray: BigInt64Array, index: Double, value: js.BigInt, timeout: Double): Async | Value = js.native
  
  def xor(typedArray: js.typedarray.Int16Array, index: Double, value: Double): Double = js.native
  def xor(typedArray: js.typedarray.Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Stores the bitwise XOR of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or write
    * operation against the array will block.
    */
  /* standard es2017.sharedmemory */
  def xor(typedArray: js.typedarray.Int8Array, index: Double, value: Double): Double = js.native
  def xor(typedArray: js.typedarray.Uint16Array, index: Double, value: Double): Double = js.native
  def xor(typedArray: js.typedarray.Uint32Array, index: Double, value: Double): Double = js.native
  def xor(typedArray: js.typedarray.Uint8Array, index: Double, value: Double): Double = js.native
  /**
    * Stores the bitwise XOR of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or write
    * operation against the array will block.
    */
  /* standard es2020.sharedmemory */
  def xor(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def xor(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
}
