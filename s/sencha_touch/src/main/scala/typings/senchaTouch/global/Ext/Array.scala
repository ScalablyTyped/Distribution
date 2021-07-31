package typings.senchaTouch.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Array")
@js.native
class Array ()
  extends StObject
     with typings.senchaTouch.Ext.Array
/* static members */
object Array {
  
  @JSGlobal("Ext.Array")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Filter through an array and remove empty item as defined in Ext isEmpty
    * @param array Array
    * @returns Array results
    */
  @scala.inline
  def clean(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def clean(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  @scala.inline
  def clone(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Checks whether or not the given array contains the specified item
    * @param array Array The array to check.
    * @param item Object The item to look for.
    * @returns Boolean true if the array contains the item, false otherwise.
    */
  @scala.inline
  def contains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")().asInstanceOf[Boolean]
  @scala.inline
  def contains(array: Unit, item: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def contains(array: typings.senchaTouch.Ext.Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def contains(array: typings.senchaTouch.Ext.Array, item: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Perform a set difference A B by subtracting all items in array B from array A
    * @param arrayA Array
    * @param arrayB Array
    * @returns Array difference
    */
  @scala.inline
  def difference(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def difference(arrayA: Unit, arrayB: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arrayA.asInstanceOf[js.Any], arrayB.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def difference(arrayA: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arrayA.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def difference(arrayA: typings.senchaTouch.Ext.Array, arrayB: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arrayA.asInstanceOf[js.Any], arrayB.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Iterates an array or an iterable value and invoke the given callback function for each item
    * @param iterable Array/NodeList/Object The value to be iterated. If this argument is not iterable, the callback function is called once.
    * @param fn Function The callback function. If it returns false, the iteration stops and this method returns the current index.
    * @param scope Object The scope (this reference) in which the specified function is executed.
    * @param reverse Boolean Reverse the iteration order (loop from the end to the beginning).
    * @returns Boolean See description for the fn parameter.
    */
  @scala.inline
  def each(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: js.Any, fn: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: js.Any, fn: js.Any, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: js.Any, fn: js.Any, scope: js.Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: js.Any, fn: js.Any, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: js.Any, fn: Unit, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: js.Any, fn: Unit, scope: js.Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: js.Any, fn: Unit, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: Unit, fn: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: Unit, fn: js.Any, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: Unit, fn: js.Any, scope: js.Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: Unit, fn: js.Any, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: Unit, fn: Unit, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: Unit, fn: Unit, scope: js.Any, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def each(iterable: Unit, fn: Unit, scope: Unit, reverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(iterable.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Removes items from an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index.
    * @returns Array The array passed.
    */
  @scala.inline
  def erase(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("erase")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def erase(array: Unit, index: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def erase(array: Unit, index: Double, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def erase(array: Unit, index: Unit, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def erase(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def erase(array: typings.senchaTouch.Ext.Array, index: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def erase(array: typings.senchaTouch.Ext.Array, index: Double, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def erase(array: typings.senchaTouch.Ext.Array, index: Unit, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("erase")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Executes the specified function for each array element until the function returns a falsy value
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Boolean true if no false value is returned by the callback function.
    */
  @scala.inline
  def every(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")().asInstanceOf[Boolean]
  @scala.inline
  def every(array: Unit, fn: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def every(array: Unit, fn: js.Any, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def every(array: Unit, fn: Unit, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def every(array: typings.senchaTouch.Ext.Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def every(array: typings.senchaTouch.Ext.Array, fn: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def every(array: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def every(array: typings.senchaTouch.Ext.Array, fn: Unit, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Creates a new array with all of the elements of this array for which the provided filtering function returns true
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Array results
    */
  @scala.inline
  def filter(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(array: Unit, fn: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(array: Unit, fn: js.Any, scope: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(array: Unit, fn: Unit, scope: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(array: typings.senchaTouch.Ext.Array, fn: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(array: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(array: typings.senchaTouch.Ext.Array, fn: Unit, scope: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Recursively flattens into 1 d Array
    * @param array Array The array to flatten
    * @returns Array The 1-d array.
    */
  @scala.inline
  def flatten(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def flatten(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Iterates an array and invoke the given callback function for each item
    * @param array Array The array to iterate.
    * @param fn Function The callback function.
    * @param scope Object The execution scope (this) in which the specified function is executed.
    */
  @scala.inline
  def forEach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")().asInstanceOf[Unit]
  @scala.inline
  def forEach(array: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def forEach(array: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def forEach(array: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def forEach(array: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def forEach(array: typings.senchaTouch.Ext.Array, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def forEach(array: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def forEach(array: typings.senchaTouch.Ext.Array, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Converts a value to an array if it s not already an array returns An empty array if given value is undefined or n
    * @param value Object The value to convert to an array if it's not already is an array.
    * @param newReference Boolean true to clone the given array and return a new reference if necessary.
    * @returns Array array
    */
  @scala.inline
  def from(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def from(value: js.Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def from(value: js.Any, newReference: Boolean): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], newReference.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def from(value: Unit, newReference: Boolean): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], newReference.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Push an item into the array only if the array doesn t contain it yet
    * @param array Array The array.
    * @param item Object The item to include.
    */
  @scala.inline
  def include(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("include")().asInstanceOf[Unit]
  @scala.inline
  def include(array: Unit, item: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("include")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def include(array: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("include")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def include(array: typings.senchaTouch.Ext.Array, item: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("include")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Get the index of the provided item in the given array a supplement for the missing arrayPrototype indexOf in Interne
    * @param array Array The array to check.
    * @param item Object The item to look for.
    * @param from Number The index at which to begin the search.
    * @returns Number The index of item in the array (or -1 if it is not found).
    */
  @scala.inline
  def indexOf(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")().asInstanceOf[Double]
  @scala.inline
  def indexOf(array: Unit, item: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def indexOf(array: Unit, item: js.Any, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def indexOf(array: Unit, item: Unit, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def indexOf(array: typings.senchaTouch.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def indexOf(array: typings.senchaTouch.Ext.Array, item: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def indexOf(array: typings.senchaTouch.Ext.Array, item: js.Any, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def indexOf(array: typings.senchaTouch.Ext.Array, item: Unit, from: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Inserts items in to an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param items Array The array of items to insert at index.
    * @returns Array The array passed.
    */
  @scala.inline
  def insert(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def insert(array: Unit, index: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def insert(array: Unit, index: Double, items: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def insert(array: Unit, index: Unit, items: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def insert(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def insert(array: typings.senchaTouch.Ext.Array, index: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def insert(array: typings.senchaTouch.Ext.Array, index: Double, items: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def insert(array: typings.senchaTouch.Ext.Array, index: Unit, items: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Merge multiple arrays into one with unique items that exist in all of the arrays
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array intersect
    */
  @scala.inline
  def intersect(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def intersect(array1: Unit, array2: Unit, etc: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def intersect(array1: Unit, array2: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def intersect(array1: Unit, array2: typings.senchaTouch.Ext.Array, etc: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def intersect(array1: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def intersect(array1: typings.senchaTouch.Ext.Array, array2: Unit, etc: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def intersect(array1: typings.senchaTouch.Ext.Array, array2: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def intersect(
    array1: typings.senchaTouch.Ext.Array,
    array2: typings.senchaTouch.Ext.Array,
    etc: typings.senchaTouch.Ext.Array
  ): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Creates a new array with the results of calling a provided function on every element in this array
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Array results
    */
  @scala.inline
  def map(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def map(array: Unit, fn: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def map(array: Unit, fn: js.Any, scope: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def map(array: Unit, fn: Unit, scope: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def map(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def map(array: typings.senchaTouch.Ext.Array, fn: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def map(array: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def map(array: typings.senchaTouch.Ext.Array, fn: Unit, scope: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Returns the maximum value in the Array
    * @param array Array/NodeList The Array from which to select the maximum value.
    * @param comparisonFn Function a function to perform the comparison which determines maximization. If omitted the ">" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object maxValue The maximum value
    */
  @scala.inline
  def max(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[js.Any]
  @scala.inline
  def max(array: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def max(array: js.Any, comparisonFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def max(array: Unit, comparisonFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Calculates the mean of all items in the array
    * @param array Array The Array to calculate the mean value of.
    * @returns Number The mean.
    */
  @scala.inline
  def mean(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")().asInstanceOf[Double]
  @scala.inline
  def mean(array: typings.senchaTouch.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  @scala.inline
  def merge(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def merge(array1: Unit, array2: Unit, etc: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def merge(array1: Unit, array2: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def merge(array1: Unit, array2: typings.senchaTouch.Ext.Array, etc: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def merge(array1: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def merge(array1: typings.senchaTouch.Ext.Array, array2: Unit, etc: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def merge(array1: typings.senchaTouch.Ext.Array, array2: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def merge(
    array1: typings.senchaTouch.Ext.Array,
    array2: typings.senchaTouch.Ext.Array,
    etc: typings.senchaTouch.Ext.Array
  ): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Returns the minimum value in the Array
    * @param array Array/NodeList The Array from which to select the minimum value.
    * @param comparisonFn Function a function to perform the comparison which determines minimization. If omitted the "&lt;" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object minValue The minimum value.
    */
  @scala.inline
  def min(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[js.Any]
  @scala.inline
  def min(array: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def min(array: js.Any, comparisonFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def min(array: Unit, comparisonFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any], comparisonFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Plucks the value of a property from each item in the Array
    * @param array Array/NodeList The Array of items to pluck the value from.
    * @param propertyName String The property name to pluck from each element.
    * @returns Array The value from each item in the Array.
    */
  @scala.inline
  def pluck(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def pluck(array: js.Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def pluck(array: js.Any, propertyName: java.lang.String): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(array.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def pluck(array: Unit, propertyName: java.lang.String): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(array.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Removes the specified item from the array if it exists
    * @param array Array The array.
    * @param item Object The item to remove.
    * @returns Array The passed array itself.
    */
  @scala.inline
  def remove(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def remove(array: Unit, item: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def remove(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def remove(array: typings.senchaTouch.Ext.Array, item: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @param insert Array An array of items to insert at index.
    * @returns Array The array passed.
    */
  @scala.inline
  def replace(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(array: Unit, index: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(array: Unit, index: Double, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(array: Unit, index: Double, removeCount: Double, insert: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(array: Unit, index: Double, removeCount: Unit, insert: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(array: Unit, index: Unit, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(array: Unit, index: Unit, removeCount: Double, insert: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(array: Unit, index: Unit, removeCount: Unit, insert: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(array: typings.senchaTouch.Ext.Array, index: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(array: typings.senchaTouch.Ext.Array, index: Double, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(
    array: typings.senchaTouch.Ext.Array,
    index: Double,
    removeCount: Double,
    insert: typings.senchaTouch.Ext.Array
  ): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(
    array: typings.senchaTouch.Ext.Array,
    index: Double,
    removeCount: Unit,
    insert: typings.senchaTouch.Ext.Array
  ): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(array: typings.senchaTouch.Ext.Array, index: Unit, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(
    array: typings.senchaTouch.Ext.Array,
    index: Unit,
    removeCount: Double,
    insert: typings.senchaTouch.Ext.Array
  ): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def replace(
    array: typings.senchaTouch.Ext.Array,
    index: Unit,
    removeCount: Unit,
    insert: typings.senchaTouch.Ext.Array
  ): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Returns a shallow copy of a part of an array
    * @param array Array The array (or arguments object).
    * @param begin Number The index at which to begin. Negative values are offsets from the end of the array.
    * @param end Number The index at which to end. The copied items do not include end. Negative values are offsets from the end of the array. If end is omitted, all items up to the end of the array are copied.
    * @returns Array The copied piece of the array.
    */
  @scala.inline
  def slice(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def slice(array: Unit, begin: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def slice(array: Unit, begin: Double, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def slice(array: Unit, begin: Unit, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def slice(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def slice(array: typings.senchaTouch.Ext.Array, begin: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def slice(array: typings.senchaTouch.Ext.Array, begin: Double, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def slice(array: typings.senchaTouch.Ext.Array, begin: Unit, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Executes the specified function for each array element until the function returns a truthy value
    * @param array Array
    * @param fn Function Callback function for each item.
    * @param scope Object Callback function scope.
    * @returns Boolean true if the callback function returns a truthy value.
    */
  @scala.inline
  def some(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")().asInstanceOf[Boolean]
  @scala.inline
  def some(array: Unit, fn: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def some(array: Unit, fn: js.Any, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def some(array: Unit, fn: Unit, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def some(array: typings.senchaTouch.Ext.Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def some(array: typings.senchaTouch.Ext.Array, fn: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def some(array: typings.senchaTouch.Ext.Array, fn: js.Any, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def some(array: typings.senchaTouch.Ext.Array, fn: Unit, scope: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Sorts the elements of an Array
    * @param array Array The array to sort.
    * @param sortFn Function The comparison function.
    * @returns Array The sorted array.
    */
  @scala.inline
  def sort(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def sort(array: Unit, sortFn: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], sortFn.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def sort(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def sort(array: typings.senchaTouch.Ext.Array, sortFn: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], sortFn.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @returns Array An array containing the removed items.
    */
  @scala.inline
  def splice(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def splice(array: Unit, index: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def splice(array: Unit, index: Double, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def splice(array: Unit, index: Unit, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def splice(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def splice(array: typings.senchaTouch.Ext.Array, index: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def splice(array: typings.senchaTouch.Ext.Array, index: Double, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def splice(array: typings.senchaTouch.Ext.Array, index: Unit, removeCount: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeCount.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Calculates the sum of all items in the given array
    * @param array Array The Array to calculate the sum value of.
    * @returns Number The sum.
    */
  @scala.inline
  def sum(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")().asInstanceOf[Double]
  @scala.inline
  def sum(array: typings.senchaTouch.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Converts any iterable numeric indices and a length property into a true array
    * @param iterable Object the iterable object to be turned into a true Array.
    * @param start Number a zero-based index that specifies the start of extraction.
    * @param end Number a zero-based index that specifies the end of extraction.
    * @returns Array
    */
  @scala.inline
  def toArray(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def toArray(iterable: js.Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def toArray(iterable: js.Any, start: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def toArray(iterable: js.Any, start: Double, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def toArray(iterable: js.Any, start: Unit, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def toArray(iterable: Unit, start: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def toArray(iterable: Unit, start: Double, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def toArray(iterable: Unit, start: Unit, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  @scala.inline
  def union(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("union")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def union(array1: Unit, array2: Unit, etc: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def union(array1: Unit, array2: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def union(array1: Unit, array2: typings.senchaTouch.Ext.Array, etc: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def union(array1: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def union(array1: typings.senchaTouch.Ext.Array, array2: Unit, etc: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def union(array1: typings.senchaTouch.Ext.Array, array2: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def union(
    array1: typings.senchaTouch.Ext.Array,
    array2: typings.senchaTouch.Ext.Array,
    etc: typings.senchaTouch.Ext.Array
  ): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], etc.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Returns a new array with unique items
    * @param array Array
    * @returns Array results
    */
  @scala.inline
  def unique(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def unique(array: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(array.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
}
