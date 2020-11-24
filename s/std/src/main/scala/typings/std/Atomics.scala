package typings.std

import typings.std.stdStrings.`not-equal`
import typings.std.stdStrings.`timed-out`
import typings.std.stdStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Atomics extends js.Object {
  
  /**
    * Adds a value to the value at the given position in the array, returning the original value.
    * Until this atomic operation completes, any other read or write operation against the array
    * will block.
    */
  def add(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def add(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def add(typedArray: Int16Array, index: Double, value: Double): Double = js.native
  def add(typedArray: Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Adds a value to the value at the given position in the array, returning the original value.
    * Until this atomic operation completes, any other read or write operation against the array
    * will block.
    */
  def add(typedArray: Int8Array, index: Double, value: Double): Double = js.native
  def add(typedArray: Uint16Array, index: Double, value: Double): Double = js.native
  def add(typedArray: Uint32Array, index: Double, value: Double): Double = js.native
  def add(typedArray: Uint8Array, index: Double, value: Double): Double = js.native
  
  /**
    * Stores the bitwise AND of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or
    * write operation against the array will block.
    */
  def and(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def and(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def and(typedArray: Int16Array, index: Double, value: Double): Double = js.native
  def and(typedArray: Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Stores the bitwise AND of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or
    * write operation against the array will block.
    */
  def and(typedArray: Int8Array, index: Double, value: Double): Double = js.native
  def and(typedArray: Uint16Array, index: Double, value: Double): Double = js.native
  def and(typedArray: Uint32Array, index: Double, value: Double): Double = js.native
  def and(typedArray: Uint8Array, index: Double, value: Double): Double = js.native
  
  /**
    * Replaces the value at the given position in the array if the original value equals the given
    * expected value, returning the original value. Until this atomic operation completes, any
    * other read or write operation against the array will block.
    */
  def compareExchange(typedArray: BigInt64Array, index: Double, expectedValue: js.BigInt, replacementValue: js.BigInt): js.BigInt = js.native
  def compareExchange(typedArray: BigUint64Array, index: Double, expectedValue: js.BigInt, replacementValue: js.BigInt): js.BigInt = js.native
  def compareExchange(typedArray: Int16Array, index: Double, expectedValue: Double, replacementValue: Double): Double = js.native
  def compareExchange(typedArray: Int32Array, index: Double, expectedValue: Double, replacementValue: Double): Double = js.native
  /**
    * Replaces the value at the given position in the array if the original value equals the given
    * expected value, returning the original value. Until this atomic operation completes, any
    * other read or write operation against the array will block.
    */
  def compareExchange(typedArray: Int8Array, index: Double, expectedValue: Double, replacementValue: Double): Double = js.native
  def compareExchange(typedArray: Uint16Array, index: Double, expectedValue: Double, replacementValue: Double): Double = js.native
  def compareExchange(typedArray: Uint32Array, index: Double, expectedValue: Double, replacementValue: Double): Double = js.native
  def compareExchange(typedArray: Uint8Array, index: Double, expectedValue: Double, replacementValue: Double): Double = js.native
  
  /**
    * Replaces the value at the given position in the array, returning the original value. Until
    * this atomic operation completes, any other read or write operation against the array will
    * block.
    */
  def exchange(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def exchange(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def exchange(typedArray: Int16Array, index: Double, value: Double): Double = js.native
  def exchange(typedArray: Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Replaces the value at the given position in the array, returning the original value. Until
    * this atomic operation completes, any other read or write operation against the array will
    * block.
    */
  def exchange(typedArray: Int8Array, index: Double, value: Double): Double = js.native
  def exchange(typedArray: Uint16Array, index: Double, value: Double): Double = js.native
  def exchange(typedArray: Uint32Array, index: Double, value: Double): Double = js.native
  def exchange(typedArray: Uint8Array, index: Double, value: Double): Double = js.native
  
  /**
    * Returns a value indicating whether high-performance algorithms can use atomic operations
    * (`true`) or must use locks (`false`) for the given number of bytes-per-element of a typed
    * array.
    */
  def isLockFree(size: Double): scala.Boolean = js.native
  
  /**
    * Returns the value at the given position in the array. Until this atomic operation completes,
    * any other read or write operation against the array will block.
    */
  def load(typedArray: BigInt64Array, index: Double): js.BigInt = js.native
  def load(typedArray: BigUint64Array, index: Double): js.BigInt = js.native
  def load(typedArray: Int16Array, index: Double): Double = js.native
  def load(typedArray: Int32Array, index: Double): Double = js.native
  /**
    * Returns the value at the given position in the array. Until this atomic operation completes,
    * any other read or write operation against the array will block.
    */
  def load(typedArray: Int8Array, index: Double): Double = js.native
  def load(typedArray: Uint16Array, index: Double): Double = js.native
  def load(typedArray: Uint32Array, index: Double): Double = js.native
  def load(typedArray: Uint8Array, index: Double): Double = js.native
  
  /**
    * Wakes up sleeping agents that are waiting on the given index of the array, returning the
    * number of agents that were awoken.
    * @param typedArray A shared BigInt64Array.
    * @param index The position in the typedArray to wake up on.
    * @param count The number of sleeping agents to notify. Defaults to +Infinity.
    */
  def notify(typedArray: BigInt64Array, index: Double): Double = js.native
  def notify(typedArray: BigInt64Array, index: Double, count: Double): Double = js.native
  /**
    * Wakes up sleeping agents that are waiting on the given index of the array, returning the
    * number of agents that were awoken.
    * @param typedArray A shared Int32Array.
    * @param index The position in the typedArray to wake up on.
    * @param count The number of sleeping agents to notify. Defaults to +Infinity.
    */
  def notify(typedArray: Int32Array, index: Double): Double = js.native
  def notify(typedArray: Int32Array, index: Double, count: Double): Double = js.native
  
  /**
    * Stores the bitwise OR of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or write
    * operation against the array will block.
    */
  def or(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def or(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def or(typedArray: Int16Array, index: Double, value: Double): Double = js.native
  def or(typedArray: Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Stores the bitwise OR of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or write
    * operation against the array will block.
    */
  def or(typedArray: Int8Array, index: Double, value: Double): Double = js.native
  def or(typedArray: Uint16Array, index: Double, value: Double): Double = js.native
  def or(typedArray: Uint32Array, index: Double, value: Double): Double = js.native
  def or(typedArray: Uint8Array, index: Double, value: Double): Double = js.native
  
  /**
    * Stores a value at the given position in the array, returning the new value. Until this
    * atomic operation completes, any other read or write operation against the array will block.
    */
  def store(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def store(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def store(typedArray: Int16Array, index: Double, value: Double): Double = js.native
  def store(typedArray: Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Stores a value at the given position in the array, returning the new value. Until this
    * atomic operation completes, any other read or write operation against the array will block.
    */
  def store(typedArray: Int8Array, index: Double, value: Double): Double = js.native
  def store(typedArray: Uint16Array, index: Double, value: Double): Double = js.native
  def store(typedArray: Uint32Array, index: Double, value: Double): Double = js.native
  def store(typedArray: Uint8Array, index: Double, value: Double): Double = js.native
  
  /**
    * Subtracts a value from the value at the given position in the array, returning the original
    * value. Until this atomic operation completes, any other read or write operation against the
    * array will block.
    */
  def sub(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def sub(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def sub(typedArray: Int16Array, index: Double, value: Double): Double = js.native
  def sub(typedArray: Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Subtracts a value from the value at the given position in the array, returning the original
    * value. Until this atomic operation completes, any other read or write operation against the
    * array will block.
    */
  def sub(typedArray: Int8Array, index: Double, value: Double): Double = js.native
  def sub(typedArray: Uint16Array, index: Double, value: Double): Double = js.native
  def sub(typedArray: Uint32Array, index: Double, value: Double): Double = js.native
  def sub(typedArray: Uint8Array, index: Double, value: Double): Double = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typings.std.stdStrings.Atomics = js.native
  
  /**
    * If the value at the given position in the array is equal to the provided value, the current
    * agent is put to sleep causing execution to suspend until the timeout expires (returning
    * `"timed-out"`) or until the agent is awoken (returning `"ok"`); otherwise, returns
    * `"not-equal"`.
    */
  def wait(typedArray: BigInt64Array, index: Double, value: js.BigInt): ok | `not-equal` | `timed-out` = js.native
  def wait(typedArray: BigInt64Array, index: Double, value: js.BigInt, timeout: Double): ok | `not-equal` | `timed-out` = js.native
  /**
    * If the value at the given position in the array is equal to the provided value, the current
    * agent is put to sleep causing execution to suspend until the timeout expires (returning
    * `"timed-out"`) or until the agent is awoken (returning `"ok"`); otherwise, returns
    * `"not-equal"`.
    */
  def wait(typedArray: Int32Array, index: Double, value: Double): ok | `not-equal` | `timed-out` = js.native
  def wait(typedArray: Int32Array, index: Double, value: Double, timeout: Double): ok | `not-equal` | `timed-out` = js.native
  
  /**
    * Stores the bitwise XOR of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or write
    * operation against the array will block.
    */
  def xor(typedArray: BigInt64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def xor(typedArray: BigUint64Array, index: Double, value: js.BigInt): js.BigInt = js.native
  def xor(typedArray: Int16Array, index: Double, value: Double): Double = js.native
  def xor(typedArray: Int32Array, index: Double, value: Double): Double = js.native
  /**
    * Stores the bitwise XOR of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or write
    * operation against the array will block.
    */
  def xor(typedArray: Int8Array, index: Double, value: Double): Double = js.native
  def xor(typedArray: Uint16Array, index: Double, value: Double): Double = js.native
  def xor(typedArray: Uint32Array, index: Double, value: Double): Double = js.native
  def xor(typedArray: Uint8Array, index: Double, value: Double): Double = js.native
}
