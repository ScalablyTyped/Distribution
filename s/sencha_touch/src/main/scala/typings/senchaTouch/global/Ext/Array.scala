package typings.senchaTouch.global.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Array")
@js.native
class Array ()
  extends typings.senchaTouch.Ext.Array

/* static members */
@JSGlobal("Ext.Array")
@js.native
object Array extends js.Object {
  /** [Method] Filter through an array and remove empty item as defined in Ext isEmpty
    * @param array Array
    * @returns Array results
    */
  def clean(): typings.senchaTouch.Ext.Array = js.native
  def clean(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def clone(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Checks whether or not the given array contains the specified item
    * @param array Array The array to check.
    * @param item Object The item to look for.
    * @returns Boolean true if the array contains the item, false otherwise.
    */
  def contains(): Boolean = js.native
  def contains(array: typings.senchaTouch.Ext.Array): Boolean = js.native
  def contains(array: typings.senchaTouch.Ext.Array, item: js.Any): Boolean = js.native
  /** [Method] Perform a set difference A B by subtracting all items in array B from array A
    * @param arrayA Array
    * @param arrayB Array
    * @returns Array difference
    */
  def difference(): typings.senchaTouch.Ext.Array = js.native
  def difference(arrayA: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def difference(arrayA: typings.senchaTouch.Ext.Array, arrayB: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Iterates an array or an iterable value and invoke the given callback function for each item
    * @param iterable Array/NodeList/Object The value to be iterated. If this argument is not iterable, the callback function is called once.
    * @param fn Function The callback function. If it returns false, the iteration stops and this method returns the current index.
    * @param scope Object The scope (this reference) in which the specified function is executed.
    * @param reverse Boolean Reverse the iteration order (loop from the end to the beginning).
    * @returns Boolean See description for the fn parameter.
    */
  def each(): Boolean = js.native
  def each(iterable: js.Any): Boolean = js.native
  def each(iterable: js.Any, fn: js.Any): Boolean = js.native
  def each(iterable: js.Any, fn: js.Any, scope: js.Any): Boolean = js.native
  def each(iterable: js.Any, fn: js.Any, scope: js.Any, reverse: Boolean): Boolean = js.native
  /** [Method] Removes items from an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index.
    * @returns Array The array passed.
    */
  def erase(): typings.senchaTouch.Ext.Array = js.native
  def erase(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def erase(array: typings.senchaTouch.Ext.Array, index: Double): typings.senchaTouch.Ext.Array = js.native
  def erase(array: typings.senchaTouch.Ext.Array, index: Double, removeCount: Double): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Executes the specified function for each array element until the function returns a falsy value
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Boolean true if no false value is returned by the callback function.
    */
  def every(): Boolean = js.native
  def every(array: typings.senchaTouch.Ext.Array): Boolean = js.native
  def every(array: typings.senchaTouch.Ext.Array, fn: js.Any): Boolean = js.native
  def every(array: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): Boolean = js.native
  /** [Method] Creates a new array with all of the elements of this array for which the provided filtering function returns true
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Array results
    */
  def filter(): typings.senchaTouch.Ext.Array = js.native
  def filter(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def filter(array: typings.senchaTouch.Ext.Array, fn: js.Any): typings.senchaTouch.Ext.Array = js.native
  def filter(array: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Recursively flattens into 1 d Array
    * @param array Array The array to flatten
    * @returns Array The 1-d array.
    */
  def flatten(): typings.senchaTouch.Ext.Array = js.native
  def flatten(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Iterates an array and invoke the given callback function for each item
    * @param array Array The array to iterate.
    * @param fn Function The callback function.
    * @param scope Object The execution scope (this) in which the specified function is executed.
    */
  def forEach(): Unit = js.native
  def forEach(array: typings.senchaTouch.Ext.Array): Unit = js.native
  def forEach(array: typings.senchaTouch.Ext.Array, fn: js.Any): Unit = js.native
  def forEach(array: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Converts a value to an array if it s not already an array returns An empty array if given value is undefined or n
    * @param value Object The value to convert to an array if it's not already is an array.
    * @param newReference Boolean true to clone the given array and return a new reference if necessary.
    * @returns Array array
    */
  def from(): typings.senchaTouch.Ext.Array = js.native
  def from(value: js.Any): typings.senchaTouch.Ext.Array = js.native
  def from(value: js.Any, newReference: Boolean): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Push an item into the array only if the array doesn t contain it yet
    * @param array Array The array.
    * @param item Object The item to include.
    */
  def include(): Unit = js.native
  def include(array: typings.senchaTouch.Ext.Array): Unit = js.native
  def include(array: typings.senchaTouch.Ext.Array, item: js.Any): Unit = js.native
  /** [Method] Get the index of the provided item in the given array a supplement for the missing arrayPrototype indexOf in Interne
    * @param array Array The array to check.
    * @param item Object The item to look for.
    * @param from Number The index at which to begin the search.
    * @returns Number The index of item in the array (or -1 if it is not found).
    */
  def indexOf(): Double = js.native
  def indexOf(array: typings.senchaTouch.Ext.Array): Double = js.native
  def indexOf(array: typings.senchaTouch.Ext.Array, item: js.Any): Double = js.native
  def indexOf(array: typings.senchaTouch.Ext.Array, item: js.Any, from: Double): Double = js.native
  /** [Method] Inserts items in to an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param items Array The array of items to insert at index.
    * @returns Array The array passed.
    */
  def insert(): typings.senchaTouch.Ext.Array = js.native
  def insert(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def insert(array: typings.senchaTouch.Ext.Array, index: Double): typings.senchaTouch.Ext.Array = js.native
  def insert(array: typings.senchaTouch.Ext.Array, index: Double, items: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Merge multiple arrays into one with unique items that exist in all of the arrays
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array intersect
    */
  def intersect(): typings.senchaTouch.Ext.Array = js.native
  def intersect(array1: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def intersect(array1: typings.senchaTouch.Ext.Array, array2: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def intersect(
    array1: typings.senchaTouch.Ext.Array,
    array2: typings.senchaTouch.Ext.Array,
    etc: typings.senchaTouch.Ext.Array
  ): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Creates a new array with the results of calling a provided function on every element in this array
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Array results
    */
  def map(): typings.senchaTouch.Ext.Array = js.native
  def map(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def map(array: typings.senchaTouch.Ext.Array, fn: js.Any): typings.senchaTouch.Ext.Array = js.native
  def map(array: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Returns the maximum value in the Array
    * @param array Array/NodeList The Array from which to select the maximum value.
    * @param comparisonFn Function a function to perform the comparison which determines maximization. If omitted the ">" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object maxValue The maximum value
    */
  def max(): js.Any = js.native
  def max(array: js.Any): js.Any = js.native
  def max(array: js.Any, comparisonFn: js.Any): js.Any = js.native
  /** [Method] Calculates the mean of all items in the array
    * @param array Array The Array to calculate the mean value of.
    * @returns Number The mean.
    */
  def mean(): Double = js.native
  def mean(array: typings.senchaTouch.Ext.Array): Double = js.native
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  def merge(): typings.senchaTouch.Ext.Array = js.native
  def merge(array1: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def merge(array1: typings.senchaTouch.Ext.Array, array2: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def merge(
    array1: typings.senchaTouch.Ext.Array,
    array2: typings.senchaTouch.Ext.Array,
    etc: typings.senchaTouch.Ext.Array
  ): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Returns the minimum value in the Array
    * @param array Array/NodeList The Array from which to select the minimum value.
    * @param comparisonFn Function a function to perform the comparison which determines minimization. If omitted the "&lt;" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object minValue The minimum value.
    */
  def min(): js.Any = js.native
  def min(array: js.Any): js.Any = js.native
  def min(array: js.Any, comparisonFn: js.Any): js.Any = js.native
  /** [Method] Plucks the value of a property from each item in the Array
    * @param array Array/NodeList The Array of items to pluck the value from.
    * @param propertyName String The property name to pluck from each element.
    * @returns Array The value from each item in the Array.
    */
  def pluck(): typings.senchaTouch.Ext.Array = js.native
  def pluck(array: js.Any): typings.senchaTouch.Ext.Array = js.native
  def pluck(array: js.Any, propertyName: java.lang.String): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Removes the specified item from the array if it exists
    * @param array Array The array.
    * @param item Object The item to remove.
    * @returns Array The passed array itself.
    */
  def remove(): typings.senchaTouch.Ext.Array = js.native
  def remove(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def remove(array: typings.senchaTouch.Ext.Array, item: js.Any): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @param insert Array An array of items to insert at index.
    * @returns Array The array passed.
    */
  def replace(): typings.senchaTouch.Ext.Array = js.native
  def replace(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def replace(array: typings.senchaTouch.Ext.Array, index: Double): typings.senchaTouch.Ext.Array = js.native
  def replace(array: typings.senchaTouch.Ext.Array, index: Double, removeCount: Double): typings.senchaTouch.Ext.Array = js.native
  def replace(
    array: typings.senchaTouch.Ext.Array,
    index: Double,
    removeCount: Double,
    insert: typings.senchaTouch.Ext.Array
  ): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Returns a shallow copy of a part of an array
    * @param array Array The array (or arguments object).
    * @param begin Number The index at which to begin. Negative values are offsets from the end of the array.
    * @param end Number The index at which to end. The copied items do not include end. Negative values are offsets from the end of the array. If end is omitted, all items up to the end of the array are copied.
    * @returns Array The copied piece of the array.
    */
  def slice(): typings.senchaTouch.Ext.Array = js.native
  def slice(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def slice(array: typings.senchaTouch.Ext.Array, begin: Double): typings.senchaTouch.Ext.Array = js.native
  def slice(array: typings.senchaTouch.Ext.Array, begin: Double, end: Double): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Executes the specified function for each array element until the function returns a truthy value
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Boolean true if the callback function returns a truthy value.
    */
  def some(): Boolean = js.native
  def some(array: typings.senchaTouch.Ext.Array): Boolean = js.native
  def some(array: typings.senchaTouch.Ext.Array, fn: js.Any): Boolean = js.native
  def some(array: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): Boolean = js.native
  /** [Method] Sorts the elements of an Array
    * @param array Array The array to sort.
    * @param sortFn Function The comparison function.
    * @returns Array The sorted array.
    */
  def sort(): typings.senchaTouch.Ext.Array = js.native
  def sort(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def sort(array: typings.senchaTouch.Ext.Array, sortFn: js.Any): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @returns Array An array containing the removed items.
    */
  def splice(): typings.senchaTouch.Ext.Array = js.native
  def splice(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def splice(array: typings.senchaTouch.Ext.Array, index: Double): typings.senchaTouch.Ext.Array = js.native
  def splice(array: typings.senchaTouch.Ext.Array, index: Double, removeCount: Double): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Calculates the sum of all items in the given array
    * @param array Array The Array to calculate the sum value of.
    * @returns Number The sum.
    */
  def sum(): Double = js.native
  def sum(array: typings.senchaTouch.Ext.Array): Double = js.native
  /** [Method] Converts any iterable numeric indices and a length property into a true array
    * @param iterable Object the iterable object to be turned into a true Array.
    * @param start Number a zero-based index that specifies the start of extraction.
    * @param end Number a zero-based index that specifies the end of extraction.
    * @returns Array
    */
  def toArray(): typings.senchaTouch.Ext.Array = js.native
  def toArray(iterable: js.Any): typings.senchaTouch.Ext.Array = js.native
  def toArray(iterable: js.Any, start: Double): typings.senchaTouch.Ext.Array = js.native
  def toArray(iterable: js.Any, start: Double, end: Double): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  def union(): typings.senchaTouch.Ext.Array = js.native
  def union(array1: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def union(array1: typings.senchaTouch.Ext.Array, array2: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
  def union(
    array1: typings.senchaTouch.Ext.Array,
    array2: typings.senchaTouch.Ext.Array,
    etc: typings.senchaTouch.Ext.Array
  ): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Returns a new array with unique items
    * @param array Array
    * @returns Array results
    */
  def unique(): typings.senchaTouch.Ext.Array = js.native
  def unique(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = js.native
}

