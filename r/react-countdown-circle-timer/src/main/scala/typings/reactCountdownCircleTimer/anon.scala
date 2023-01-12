package typings.reactCountdownCircleTimer

import org.scalablytyped.runtime.NumberDictionary
import typings.react.mod.ReactNode
import typings.reactCountdownCircleTimer.libMod.ColorFormat
import typings.reactCountdownCircleTimer.libMod.ColorHex
import typings.reactCountdownCircleTimer.libMod.OnComplete
import typings.reactCountdownCircleTimer.libMod.Props
import typings.reactCountdownCircleTimer.libMod.TimeProps
import typings.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.butt
import typings.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.clockwise
import typings.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.counterclockwise
import typings.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.round
import typings.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.square
import typings.std.FlatArray
import typings.std.IterableIterator
import typings.std.anon.CopyWithin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  0 :react-countdown-circle-timer.react-countdown-circle-timer/lib.ColorHex,   1 :react-countdown-circle-timer.react-countdown-circle-timer/lib.ColorHex} & std.Array<react-countdown-circle-timer.react-countdown-circle-timer/lib.ColorHex> */
  @js.native
  trait `0ColorHex1ColorHexArrayCo`
    extends StObject
       with /* standard es5 */
  /* n */ NumberDictionary[ColorHex] {
    
    var `0`: ColorHex = js.native
    
    var `1`: ColorHex = js.native
    
    /**
      * Returns the item located at the specified index.
      * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
      */
    /* standard es2022.array */
    def at(index: Double): js.UndefOr[ColorHex] = js.native
    
    /**
      * Combines two or more arrays.
      * This method returns a new array without modifying any existing arrays.
      * @param items Additional arrays and/or items to add to the end of the array.
      */
    /* standard es5 */
    def concat(items: (js.Array[ColorHex] | ColorHex)*): js.Array[ColorHex] = js.native
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    /* standard es2015.core */
    def copyWithin(target: Double, start: Double): this.type = js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    /* standard es2015.iterable */
    def entries(): IterableIterator[js.Tuple2[Double, ColorHex]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def every(
      predicate: js.Function3[/* value */ ColorHex, /* index */ Double, /* array */ js.Array[ColorHex], Any]
    ): Boolean = js.native
    def every(
      predicate: js.Function3[/* value */ ColorHex, /* index */ Double, /* array */ js.Array[ColorHex], Any],
      thisArg: Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("every")
    def every_S[S /* <: ColorHex */](
      predicate: js.Function3[
          /* value */ ColorHex, 
          /* index */ Double, 
          /* array */ js.Array[ColorHex], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSName("every")
    def every_S[S /* <: ColorHex */](
      predicate: js.Function3[
          /* value */ ColorHex, 
          /* index */ Double, 
          /* array */ js.Array[ColorHex], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Changes all array elements from `start` to `end` index to a static `value` and returns the modified array
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    /* standard es2015.core */
    def fill(value: ColorHex): this.type = js.native
    def fill(value: ColorHex, start: Double): this.type = js.native
    def fill(value: ColorHex, start: Double, end: Double): this.type = js.native
    def fill(value: ColorHex, start: Unit, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def filter(
      predicate: js.Function3[/* value */ ColorHex, /* index */ Double, /* array */ js.Array[ColorHex], Any]
    ): js.Array[ColorHex] = js.native
    def filter(
      predicate: js.Function3[/* value */ ColorHex, /* index */ Double, /* array */ js.Array[ColorHex], Any],
      thisArg: Any
    ): js.Array[ColorHex] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("filter")
    def filter_S[S /* <: ColorHex */](
      predicate: js.Function3[
          /* value */ ColorHex, 
          /* index */ Double, 
          /* array */ js.Array[ColorHex], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSName("filter")
    def filter_S[S /* <: ColorHex */](
      predicate: js.Function3[
          /* value */ ColorHex, 
          /* index */ Double, 
          /* array */ js.Array[ColorHex], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.Array[S] = js.native
    
    /* standard es2015.core */
    def find(
      predicate: js.Function3[/* value */ ColorHex, /* index */ Double, /* obj */ js.Array[ColorHex], Any]
    ): js.UndefOr[ColorHex] = js.native
    def find(
      predicate: js.Function3[/* value */ ColorHex, /* index */ Double, /* obj */ js.Array[ColorHex], Any],
      thisArg: Any
    ): js.UndefOr[ColorHex] = js.native
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    def find[S /* <: ColorHex */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ ColorHex, 
          /* index */ Double, 
          /* obj */ js.Array[ColorHex], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    def find[S /* <: ColorHex */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ ColorHex, 
          /* index */ Double, 
          /* obj */ js.Array[ColorHex], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.UndefOr[S] = js.native
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    def findIndex(
      predicate: js.Function3[/* value */ ColorHex, /* index */ Double, /* obj */ js.Array[ColorHex], Any]
    ): Double = js.native
    def findIndex(
      predicate: js.Function3[/* value */ ColorHex, /* index */ Double, /* obj */ js.Array[ColorHex], Any],
      thisArg: Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    /* standard es2019.array */
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
    /**
      * Calls a defined callback function on each element of an array. Then, flattens the result into
      * a new array.
      * This is identical to a map followed by flat with depth 1.
      *
      * @param callback A function that accepts up to three arguments. The flatMap method calls the
      * callback function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callback function. If
      * thisArg is omitted, undefined is used as the this value.
      */
    /* standard es2019.array */
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ ColorHex, 
          /* index */ Double, 
          /* array */ js.Array[ColorHex], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ ColorHex, 
          /* index */ Double, 
          /* array */ js.Array[ColorHex], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = js.native
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def forEach(
      callbackfn: js.Function3[/* value */ ColorHex, /* index */ Double, /* array */ js.Array[ColorHex], Unit]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ ColorHex, /* index */ Double, /* array */ js.Array[ColorHex], Unit],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    /* standard es2016.array.include */
    def includes(searchElement: ColorHex): Boolean = js.native
    def includes(searchElement: ColorHex, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    /* standard es5 */
    def indexOf(searchElement: ColorHex): Double = js.native
    def indexOf(searchElement: ColorHex, fromIndex: Double): Double = js.native
    
    /** Iterator */
    /* standard es2015.iterable */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[ColorHex]] = js.native
    
    /**
      * Adds all the elements of an array into a string, separated by the specified separator string.
      * @param separator A string used to separate one element of the array from the next in the resulting string. If omitted, the array elements are separated with a comma.
      */
    /* standard es5 */
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    /* standard es2015.iterable */
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin searching backward. If fromIndex is omitted, the search starts at the last index in the array.
      */
    /* standard es5 */
    def lastIndexOf(searchElement: ColorHex): Double = js.native
    def lastIndexOf(searchElement: ColorHex, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest index in the array.
      */
    /* standard es5 */
    var length: Double = js.native
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def map[U](
      callbackfn: js.Function3[/* value */ ColorHex, /* index */ Double, /* array */ js.Array[ColorHex], U]
    ): js.Array[U] = js.native
    def map[U](
      callbackfn: js.Function3[/* value */ ColorHex, /* index */ Double, /* array */ js.Array[ColorHex], U],
      thisArg: Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def pop(): js.UndefOr[ColorHex] = js.native
    
    /**
      * Appends new elements to the end of an array, and returns the new length of the array.
      * @param items New elements to add to the array.
      */
    /* standard es5 */
    def push(items: ColorHex*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ ColorHex, 
          /* currentValue */ ColorHex, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ColorHex], 
          ColorHex
        ]
    ): ColorHex = js.native
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ ColorHex, 
          /* currentValue */ ColorHex, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ColorHex], 
          ColorHex
        ],
      initialValue: ColorHex
    ): ColorHex = js.native
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ ColorHex, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ColorHex], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ ColorHex, 
          /* currentValue */ ColorHex, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ColorHex], 
          ColorHex
        ]
    ): ColorHex = js.native
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ ColorHex, 
          /* currentValue */ ColorHex, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ColorHex], 
          ColorHex
        ],
      initialValue: ColorHex
    ): ColorHex = js.native
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ ColorHex, 
          /* currentIndex */ Double, 
          /* array */ js.Array[ColorHex], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Reverses the elements in an array in place.
      * This method mutates the array and returns a reference to the same array.
      */
    /* standard es5 */
    def reverse(): js.Array[ColorHex] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def shift(): js.UndefOr[ColorHex] = js.native
    
    /**
      * Returns a copy of a section of an array.
      * For both start and end, a negative index can be used to indicate an offset from the end of the array.
      * For example, -2 refers to the second to last element of the array.
      * @param start The beginning index of the specified portion of the array.
      * If start is undefined, then the slice begins at index 0.
      * @param end The end index of the specified portion of the array. This is exclusive of the element at the index 'end'.
      * If end is undefined, then the slice extends to the end of the array.
      */
    /* standard es5 */
    def slice(): js.Array[ColorHex] = js.native
    def slice(start: Double): js.Array[ColorHex] = js.native
    def slice(start: Double, end: Double): js.Array[ColorHex] = js.native
    def slice(start: Unit, end: Double): js.Array[ColorHex] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def some(
      predicate: js.Function3[/* value */ ColorHex, /* index */ Double, /* array */ js.Array[ColorHex], Any]
    ): Boolean = js.native
    def some(
      predicate: js.Function3[/* value */ ColorHex, /* index */ Double, /* array */ js.Array[ColorHex], Any],
      thisArg: Any
    ): Boolean = js.native
    
    /**
      * Sorts an array in place.
      * This method mutates the array and returns a reference to the same array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if the first argument is less than the second argument, zero if they're equal, and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    /* standard es5 */
    def sort(): this.type = js.native
    def sort(compareFn: js.Function2[/* a */ ColorHex, /* b */ ColorHex, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double): js.Array[ColorHex] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[ColorHex] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double, deleteCount: Double, items: ColorHex*): js.Array[ColorHex] = js.native
    
    /**
      * Returns an object whose properties have the value 'true'
      * when they will be absent when used in a 'with' statement.
      */
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.unscopables)
    var unscopables: js.Function0[CopyWithin] = js.native
    
    /**
      * Inserts new elements at the start of an array, and returns the new length of the array.
      * @param items Elements to insert at the start of the array.
      */
    /* standard es5 */
    def unshift(items: ColorHex*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    /* standard es2015.iterable */
    def values(): IterableIterator[ColorHex] = js.native
  }
  
  /* Inlined {  0 :number,   1 :number} & std.Array<number> */
  @js.native
  trait `0number1numberArraynumber`
    extends StObject
       with /* standard es5 */
  /* n */ NumberDictionary[Double] {
    
    var `0`: Double = js.native
    
    var `1`: Double = js.native
    
    /**
      * Returns the item located at the specified index.
      * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
      */
    /* standard es2022.array */
    def at(index: Double): js.UndefOr[Double] = js.native
    
    /**
      * Combines two or more arrays.
      * This method returns a new array without modifying any existing arrays.
      * @param items Additional arrays and/or items to add to the end of the array.
      */
    /* standard es5 */
    def concat(items: (js.Array[Double] | Double)*): js.Array[Double] = js.native
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    /* standard es2015.core */
    def copyWithin(target: Double, start: Double): this.type = js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    /* standard es2015.iterable */
    def entries(): IterableIterator[js.Tuple2[Double, Double]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def every(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any]): Boolean = js.native
    def every(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any],
      thisArg: Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("every")
    def every_S[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSName("every")
    def every_S[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Changes all array elements from `start` to `end` index to a static `value` and returns the modified array
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    /* standard es2015.core */
    def fill(value: Double): this.type = js.native
    def fill(value: Double, start: Double): this.type = js.native
    def fill(value: Double, start: Double, end: Double): this.type = js.native
    def fill(value: Double, start: Unit, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def filter(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any]): js.Array[Double] = js.native
    def filter(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any],
      thisArg: Any
    ): js.Array[Double] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("filter")
    def filter_S[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSName("filter")
    def filter_S[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.Array[S] = js.native
    
    /* standard es2015.core */
    def find(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ js.Array[Double], Any]): js.UndefOr[Double] = js.native
    def find(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ js.Array[Double], Any],
      thisArg: Any
    ): js.UndefOr[Double] = js.native
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    def find[S /* <: Double */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Double, 
          /* index */ Double, 
          /* obj */ js.Array[Double], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    def find[S /* <: Double */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Double, 
          /* index */ Double, 
          /* obj */ js.Array[Double], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.UndefOr[S] = js.native
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    def findIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ js.Array[Double], Any]): Double = js.native
    def findIndex(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ js.Array[Double], Any],
      thisArg: Any
    ): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    /* standard es2019.array */
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
    /**
      * Calls a defined callback function on each element of an array. Then, flattens the result into
      * a new array.
      * This is identical to a map followed by flat with depth 1.
      *
      * @param callback A function that accepts up to three arguments. The flatMap method calls the
      * callback function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callback function. If
      * thisArg is omitted, undefined is used as the this value.
      */
    /* standard es2019.array */
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = js.native
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def forEach(
      callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Unit]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Unit],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    /* standard es2016.array.include */
    def includes(searchElement: Double): Boolean = js.native
    def includes(searchElement: Double, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    /* standard es5 */
    def indexOf(searchElement: Double): Double = js.native
    def indexOf(searchElement: Double, fromIndex: Double): Double = js.native
    
    /** Iterator */
    /* standard es2015.iterable */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[Double]] = js.native
    
    /**
      * Adds all the elements of an array into a string, separated by the specified separator string.
      * @param separator A string used to separate one element of the array from the next in the resulting string. If omitted, the array elements are separated with a comma.
      */
    /* standard es5 */
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    /* standard es2015.iterable */
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin searching backward. If fromIndex is omitted, the search starts at the last index in the array.
      */
    /* standard es5 */
    def lastIndexOf(searchElement: Double): Double = js.native
    def lastIndexOf(searchElement: Double, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest index in the array.
      */
    /* standard es5 */
    var length: Double = js.native
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def map[U](callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], U]): js.Array[U] = js.native
    def map[U](
      callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], U],
      thisArg: Any
    ): js.Array[U] = js.native
    
    /**
      * Removes the last element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def pop(): js.UndefOr[Double] = js.native
    
    /**
      * Appends new elements to the end of an array, and returns the new length of the array.
      * @param items New elements to add to the array.
      */
    /* standard es5 */
    def push(items: Double*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          Double
        ]
    ): Double = js.native
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          Double
        ],
      initialValue: Double
    ): Double = js.native
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          Double
        ]
    ): Double = js.native
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          Double
        ],
      initialValue: Double
    ): Double = js.native
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Reverses the elements in an array in place.
      * This method mutates the array and returns a reference to the same array.
      */
    /* standard es5 */
    def reverse(): js.Array[Double] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def shift(): js.UndefOr[Double] = js.native
    
    /**
      * Returns a copy of a section of an array.
      * For both start and end, a negative index can be used to indicate an offset from the end of the array.
      * For example, -2 refers to the second to last element of the array.
      * @param start The beginning index of the specified portion of the array.
      * If start is undefined, then the slice begins at index 0.
      * @param end The end index of the specified portion of the array. This is exclusive of the element at the index 'end'.
      * If end is undefined, then the slice extends to the end of the array.
      */
    /* standard es5 */
    def slice(): js.Array[Double] = js.native
    def slice(start: Double): js.Array[Double] = js.native
    def slice(start: Double, end: Double): js.Array[Double] = js.native
    def slice(start: Unit, end: Double): js.Array[Double] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def some(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any]): Boolean = js.native
    def some(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any],
      thisArg: Any
    ): Boolean = js.native
    
    /**
      * Sorts an array in place.
      * This method mutates the array and returns a reference to the same array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if the first argument is less than the second argument, zero if they're equal, and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    /* standard es5 */
    def sort(): this.type = js.native
    def sort(compareFn: js.Function2[/* a */ Double, /* b */ Double, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double): js.Array[Double] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[Double] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double, deleteCount: Double, items: Double*): js.Array[Double] = js.native
    
    /**
      * Returns an object whose properties have the value 'true'
      * when they will be absent when used in a 'with' statement.
      */
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.unscopables)
    var unscopables: js.Function0[CopyWithin] = js.native
    
    /**
      * Inserts new elements at the start of an array, and returns the new length of the array.
      * @param items Elements to insert at the start of the array.
      */
    /* standard es5 */
    def unshift(items: Double*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    /* standard es2015.iterable */
    def values(): IterableIterator[Double] = js.native
  }
  
  trait ElapsedTime extends StObject {
    
    var elapsedTime: Double
    
    var path: String
    
    var pathLength: Double
    
    var remainingTime: Double
    
    var rotation: clockwise | counterclockwise
    
    var size: Double
    
    var stroke: ColorFormat
    
    var strokeDashoffset: Double
    
    var strokeWidth: Double
  }
  object ElapsedTime {
    
    inline def apply(
      elapsedTime: Double,
      path: String,
      pathLength: Double,
      remainingTime: Double,
      rotation: clockwise | counterclockwise,
      size: Double,
      stroke: ColorFormat,
      strokeDashoffset: Double,
      strokeWidth: Double
    ): ElapsedTime = {
      val __obj = js.Dynamic.literal(elapsedTime = elapsedTime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathLength = pathLength.asInstanceOf[js.Any], remainingTime = remainingTime.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeDashoffset = strokeDashoffset.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElapsedTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElapsedTime] (val x: Self) extends AnyVal {
      
      inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathLength(value: Double): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
      
      inline def setRemainingTime(value: Double): Self = StObject.set(x, "remainingTime", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: clockwise | counterclockwise): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStroke(value: ColorFormat): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashoffset(value: Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-countdown-circle-timer.react-countdown-circle-timer/lib.MultipleColors & {  duration :number,   initialRemainingTime :number | undefined,   updateInterval :number | undefined,   size :number | undefined,   strokeWidth :number | undefined,   trailStrokeWidth :number | undefined,   strokeLinecap :'round' | 'square' | 'butt' | undefined,   rotation :'clockwise' | 'counterclockwise' | undefined,   trailColor :react-countdown-circle-timer.react-countdown-circle-timer/lib.ColorFormat | undefined,   isPlaying :boolean | undefined,   isSmoothColorTransition :boolean | undefined,   children :(props : react-countdown-circle-timer.react-countdown-circle-timer/lib.TimeProps): react.react.ReactNode | undefined,   onComplete :(totalElapsedTime : number): react-countdown-circle-timer.react-countdown-circle-timer/lib.OnComplete | void | undefined,   onUpdate :(remainingTime : number): void | undefined} */
  trait MultipleColorsdurationnum
    extends StObject
       with Props {
    
    /** Render function to customize the time/content in the center of the circle */
    var children: js.UndefOr[js.Function1[/* props */ TimeProps, ReactNode]] = js.undefined
    
    /** Array of colors in HEX format. At least 2 colors should be provided */
    var colors: `0ColorHex1ColorHexArrayCo`
    
    /** Indicates the time when a color should switch to the next color. The first item should be the duration and the last one should be 0/goal. Example with duration of 10 seconds: [10, 6, 3, 0]  */
    var colorsTime: `0number1numberArraynumber`
    
    /** Countdown duration in seconds */
    var duration: Double
    
    /** Set the initial remaining time if it is different than the duration */
    var initialRemainingTime: js.UndefOr[Double] = js.undefined
    
    /** Play or pause animation. Default: false */
    var isPlaying: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates if the colors should smoothly transition to the next color. Default: true */
    var isSmoothColorTransition: js.UndefOr[Boolean] = js.undefined
    
    /** On animation complete event handler */
    var onComplete: js.UndefOr[js.Function1[/* totalElapsedTime */ Double, OnComplete | Unit]] = js.undefined
    
    /** On remaining time update event handler */
    var onUpdate: js.UndefOr[js.Function1[/* remainingTime */ Double, Unit]] = js.undefined
    
    /** Progress path rotation direction. Default: "clockwise" */
    var rotation: js.UndefOr[clockwise | counterclockwise] = js.undefined
    
    /** Width and height of the SVG element. Default: 180 */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Path stroke line cap. Default: "round" */
    var strokeLinecap: js.UndefOr[round | square | butt] = js.undefined
    
    /** Path stroke width. Default: 12 */
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    /** Circle trail color - takes any valid color format (HEX, rgb, rgba, etc.). Default: #d9d9d9 */
    var trailColor: js.UndefOr[ColorFormat] = js.undefined
    
    /** Trail stroke width */
    var trailStrokeWidth: js.UndefOr[Double] = js.undefined
    
    /** Update interval in seconds. Determines how often the timer updates. When set to 0 the value will update on each key frame. Default: 0 */
    var updateInterval: js.UndefOr[Double] = js.undefined
  }
  object MultipleColorsdurationnum {
    
    inline def apply(colors: `0ColorHex1ColorHexArrayCo`, colorsTime: `0number1numberArraynumber`, duration: Double): MultipleColorsdurationnum = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsTime = colorsTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipleColorsdurationnum]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultipleColorsdurationnum] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: /* props */ TimeProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColors(value: `0ColorHex1ColorHexArrayCo`): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsTime(value: `0number1numberArraynumber`): Self = StObject.set(x, "colorsTime", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setInitialRemainingTime(value: Double): Self = StObject.set(x, "initialRemainingTime", value.asInstanceOf[js.Any])
      
      inline def setInitialRemainingTimeUndefined: Self = StObject.set(x, "initialRemainingTime", js.undefined)
      
      inline def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
      
      inline def setIsPlayingUndefined: Self = StObject.set(x, "isPlaying", js.undefined)
      
      inline def setIsSmoothColorTransition(value: Boolean): Self = StObject.set(x, "isSmoothColorTransition", value.asInstanceOf[js.Any])
      
      inline def setIsSmoothColorTransitionUndefined: Self = StObject.set(x, "isSmoothColorTransition", js.undefined)
      
      inline def setOnComplete(value: /* totalElapsedTime */ Double => OnComplete | Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnUpdate(value: /* remainingTime */ Double => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRotation(value: clockwise | counterclockwise): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStrokeLinecap(value: round | square | butt): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTrailColor(value: ColorFormat): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      inline def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
      
      inline def setTrailStrokeWidth(value: Double): Self = StObject.set(x, "trailStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setTrailStrokeWidthUndefined: Self = StObject.set(x, "trailStrokeWidth", js.undefined)
      
      inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
      
      inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
    }
  }
  
  /* Inlined react-countdown-circle-timer.react-countdown-circle-timer/lib.SingleColor & {  duration :number,   initialRemainingTime :number | undefined,   updateInterval :number | undefined,   size :number | undefined,   strokeWidth :number | undefined,   trailStrokeWidth :number | undefined,   strokeLinecap :'round' | 'square' | 'butt' | undefined,   rotation :'clockwise' | 'counterclockwise' | undefined,   trailColor :react-countdown-circle-timer.react-countdown-circle-timer/lib.ColorFormat | undefined,   isPlaying :boolean | undefined,   isSmoothColorTransition :boolean | undefined,   children :(props : react-countdown-circle-timer.react-countdown-circle-timer/lib.TimeProps): react.react.ReactNode | undefined,   onComplete :(totalElapsedTime : number): react-countdown-circle-timer.react-countdown-circle-timer/lib.OnComplete | void | undefined,   onUpdate :(remainingTime : number): void | undefined} */
  trait SingleColordurationnumber
    extends StObject
       with Props {
    
    /** Render function to customize the time/content in the center of the circle */
    var children: js.UndefOr[js.Function1[/* props */ TimeProps, ReactNode]] = js.undefined
    
    /** Single valid color or url to a gradient */
    var colors: ColorFormat
    
    /** Colors time works only when the colors prop is an array of colors*/
    var colorsTime: js.UndefOr[scala.Nothing] = js.undefined
    
    /** Countdown duration in seconds */
    var duration: Double
    
    /** Set the initial remaining time if it is different than the duration */
    var initialRemainingTime: js.UndefOr[Double] = js.undefined
    
    /** Play or pause animation. Default: false */
    var isPlaying: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates if the colors should smoothly transition to the next color. Default: true */
    var isSmoothColorTransition: js.UndefOr[Boolean] = js.undefined
    
    /** On animation complete event handler */
    var onComplete: js.UndefOr[js.Function1[/* totalElapsedTime */ Double, OnComplete | Unit]] = js.undefined
    
    /** On remaining time update event handler */
    var onUpdate: js.UndefOr[js.Function1[/* remainingTime */ Double, Unit]] = js.undefined
    
    /** Progress path rotation direction. Default: "clockwise" */
    var rotation: js.UndefOr[clockwise | counterclockwise] = js.undefined
    
    /** Width and height of the SVG element. Default: 180 */
    var size: js.UndefOr[Double] = js.undefined
    
    /** Path stroke line cap. Default: "round" */
    var strokeLinecap: js.UndefOr[round | square | butt] = js.undefined
    
    /** Path stroke width. Default: 12 */
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    /** Circle trail color - takes any valid color format (HEX, rgb, rgba, etc.). Default: #d9d9d9 */
    var trailColor: js.UndefOr[ColorFormat] = js.undefined
    
    /** Trail stroke width */
    var trailStrokeWidth: js.UndefOr[Double] = js.undefined
    
    /** Update interval in seconds. Determines how often the timer updates. When set to 0 the value will update on each key frame. Default: 0 */
    var updateInterval: js.UndefOr[Double] = js.undefined
  }
  object SingleColordurationnumber {
    
    inline def apply(colors: ColorFormat, duration: Double): SingleColordurationnumber = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleColordurationnumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingleColordurationnumber] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: /* props */ TimeProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColors(value: ColorFormat): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setInitialRemainingTime(value: Double): Self = StObject.set(x, "initialRemainingTime", value.asInstanceOf[js.Any])
      
      inline def setInitialRemainingTimeUndefined: Self = StObject.set(x, "initialRemainingTime", js.undefined)
      
      inline def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
      
      inline def setIsPlayingUndefined: Self = StObject.set(x, "isPlaying", js.undefined)
      
      inline def setIsSmoothColorTransition(value: Boolean): Self = StObject.set(x, "isSmoothColorTransition", value.asInstanceOf[js.Any])
      
      inline def setIsSmoothColorTransitionUndefined: Self = StObject.set(x, "isSmoothColorTransition", js.undefined)
      
      inline def setOnComplete(value: /* totalElapsedTime */ Double => OnComplete | Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnUpdate(value: /* remainingTime */ Double => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRotation(value: clockwise | counterclockwise): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStrokeLinecap(value: round | square | butt): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTrailColor(value: ColorFormat): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      inline def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
      
      inline def setTrailStrokeWidth(value: Double): Self = StObject.set(x, "trailStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setTrailStrokeWidthUndefined: Self = StObject.set(x, "trailStrokeWidth", js.undefined)
      
      inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
      
      inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
    }
  }
}
