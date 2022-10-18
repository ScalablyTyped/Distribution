package typings.sass

import typings.sass.sassBooleans.`false`
import typings.sass.sassBooleans.`true`
import typings.sass.sassStrings.async
import typings.sass.typesLegacyFunctionMod.types.Boolean
import typings.sass.typesLegacyFunctionMod.types.Error
import typings.sass.typesLegacyFunctionMod.types.Null
import typings.sass.typesLegacyPluginThisMod.LegacyPluginThis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLegacyFunctionMod {
  
  @JSImport("sass/types/legacy/function", "FALSE")
  @js.native
  val FALSE: Boolean[`false`] = js.native
  
  @JSImport("sass/types/legacy/function", "NULL")
  @js.native
  val NULL: Null = js.native
  
  @JSImport("sass/types/legacy/function", "TRUE")
  @js.native
  val TRUE: Boolean[`true`] = js.native
  
  object types {
    
    @JSImport("sass/types/legacy/function", "types.Boolean")
    @js.native
    open class Boolean[T /* <: scala.Boolean */] () extends StObject {
      
      /**
        * Returns `true` if this is Sass's `true` value and `false` if this is
        * Sass's `false` value.
        *
        * @example
        *
        * ```js
        * // boolean is `true`.
        * boolean.getValue(); // true
        * boolean === sass.types.Boolean.TRUE; // true
        *
        * // boolean is `false`.
        * boolean.getValue(); // false
        * boolean === sass.types.Boolean.FALSE; // true
        * ```
        */
      def getValue(): T = js.native
    }
    /* static members */
    object Boolean {
      
      /** Sass's `false` value. */
      @JSImport("sass/types/legacy/function", "types.Boolean.FALSE")
      @js.native
      val FALSE: Boolean[`false`] = js.native
      
      /** Sass's `true` value. */
      @JSImport("sass/types/legacy/function", "types.Boolean.TRUE")
      @js.native
      val TRUE: Boolean[`true`] = js.native
    }
    
    @JSImport("sass/types/legacy/function", "types.Color")
    @js.native
    open class Color protected ()
      extends StObject
         with _LegacyValue {
      /**
        * Creates a new Sass color with alpha, red, green, and blue channels taken
        * from respective two-byte chunks of a hexidecimal number.
        *
        * @example
        *
        * ```js
        * new sass.types.Color(0xff6b717f); // #6b717f
        * new sass.types.Color(0x00000000); // rgba(0, 0, 0, 0)
        * ```
        */
      def this(argb: Double) = this()
      /**
        * Creates a new Sass color with the given red, green, blue, and alpha
        * channels. The red, green, and blue channels must be integers between 0
        * and 255 (inclusive), and alpha must be between 0 and 1 (inclusive).
        *
        * @example
        *
        * ```js
        * new sass.types.Color(107, 113, 127); // #6b717f
        * new sass.types.Color(0, 0, 0, 0); // rgba(0, 0, 0, 0)
        * ```
        */
      def this(r: Double, g: Double, b: Double) = this()
      def this(r: Double, g: Double, b: Double, a: Double) = this()
      
      /**
        * Returns the alpha channel of the color as a number from 0 to 1.
        *
        * @example
        *
        * ```js
        * // color is `#6b717f`.
        * color.getA(); // 1
        *
        * // color is `transparent`.
        * color.getA(); // 0
        * ```
        */
      def getA(): Double = js.native
      
      /**
        * Returns the blue channel of the color as an integer from 0 to 255.
        *
        * @example
        *
        * ```js
        * // color is `#6b717f`.
        * color.getB(); // 127
        *
        * // color is `#b37399`.
        * color.getB(); // 153
        * ```
        */
      def getB(): Double = js.native
      
      /**
        * Returns the green channel of the color as an integer from 0 to 255.
        *
        * @example
        *
        * ```js
        * // color is `#6b717f`.
        * color.getG(); // 113
        *
        * // color is `#b37399`.
        * color.getG(); // 115
        * ```
        */
      def getG(): Double = js.native
      
      /**
        * Returns the red channel of the color as an integer from 0 to 255.
        *
        * @example
        *
        * ```js
        * // color is `#6b717f`.
        * color.getR(); // 107
        *
        * // color is `#b37399`.
        * color.getR(); // 179
        * ```
        */
      def getR(): Double = js.native
      
      /**
        * Sets the alpha channel of the color. The value must be between 0 and 1
        * (inclusive).
        *
        * @deprecated Use [[constructor]] instead.
        */
      def setA(value: Double): Unit = js.native
      
      /**
        * Sets the blue channel of the color. The value must be an integer between
        * 0 and 255 (inclusive).
        *
        * @deprecated Use [[constructor]] instead.
        */
      def setB(value: Double): Unit = js.native
      
      /**
        * Sets the green channel of the color. The value must be an integer between
        * 0 and 255 (inclusive).
        *
        * @deprecated Use [[constructor]] instead.
        */
      def setG(value: Double): Unit = js.native
      
      /**
        * Sets the red channel of the color. The value must be an integer between 0
        * and 255 (inclusive).
        *
        * @deprecated Use [[constructor]] instead.
        */
      def setR(value: Double): Unit = js.native
    }
    
    @JSImport("sass/types/legacy/function", "types.Error")
    @js.native
    open class Error protected () extends StObject {
      def this(message: java.lang.String) = this()
    }
    
    @JSImport("sass/types/legacy/function", "types.List")
    @js.native
    open class List protected ()
      extends StObject
         with _LegacyValue {
      /**
        * Creates a new Sass list.
        *
        * **Heads up!** The initial values of the list elements are undefined.
        * These elements must be set using [[setValue]] before accessing them or
        * passing the list back to Sass.
        *
        * @example
        *
        * ```js
        * const list = new sass.types.List(3);
        * list.setValue(0, new sass.types.Number(10, "px"));
        * list.setValue(1, new sass.types.Number(15, "px"));
        * list.setValue(2, new sass.types.Number(32, "px"));
        * list; // 10px, 15px, 32px
        * ```
        *
        * @param length - The number of (initially undefined) elements in the list.
        * @param commaSeparator - If `true`, the list is comma-separated; otherwise,
        * it's space-separated. Defaults to `true`.
        */
      def this(length: Double) = this()
      def this(length: Double, commaSeparator: scala.Boolean) = this()
      
      /**
        * Returns the number of elements in the list.
        *
        * @example
        *
        * ```js
        * // list is `10px, 15px, 32px`
        * list.getLength(); // 3
        *
        * // list is `1px solid`
        * list.getLength(); // 2
        * ```
        */
      def getLength(): Double = js.native
      
      /**
        * Returns `true` if this list is comma-separated and `false` otherwise.
        *
        * @example
        *
        * ```js
        * // list is `10px, 15px, 32px`
        * list.getSeparator(); // true
        *
        * // list is `1px solid`
        * list.getSeparator(); // false
        * ```
        */
      def getSeparator(): scala.Boolean = js.native
      
      /**
        * Returns the element at `index`, or `undefined` if that value hasn't yet
        * been set.
        *
        * @example
        *
        * ```js
        * // list is `10px, 15px, 32px`
        * list.getValue(0); // 10px
        * list.getValue(2); // 32px
        * ```
        *
        * @param index - A (0-based) index into this list.
        * @throws `Error` if `index` is less than 0 or greater than or equal to the
        * number of elements in this list.
        */
      def getValue(index: Double): js.UndefOr[LegacyValue] = js.native
      
      /**
        * Sets whether the list is comma-separated.
        *
        * @param isComma - `true` to make the list comma-separated, `false` otherwise.
        */
      def setSeparator(isComma: scala.Boolean): Unit = js.native
      
      /**
        * Sets the element at `index` to `value`.
        *
        * @example
        *
        * ```js
        * // list is `10px, 15px, 32px`
        * list.setValue(1, new sass.types.Number(18, "px"));
        * list; // 10px, 18px, 32px
        * ```
        *
        * @param index - A (0-based) index into this list.
        * @throws `Error` if `index` is less than 0 or greater than or equal to the
        * number of elements in this list.
        */
      def setValue(index: Double, value: LegacyValue): Unit = js.native
    }
    
    @JSImport("sass/types/legacy/function", "types.Map")
    @js.native
    open class Map protected ()
      extends StObject
         with _LegacyValue {
      /**
        * Creates a new Sass map.
        *
        * **Heads up!** The initial keys and values of the map are undefined. They
        * must be set using [[setKey]] and [[setValue]] before accessing them or
        * passing the map back to Sass.
        *
        * @example
        *
        * ```js
        * const map = new sass.types.Map(2);
        * map.setKey(0, new sass.types.String("width"));
        * map.setValue(0, new sass.types.Number(300, "px"));
        * map.setKey(1, new sass.types.String("height"));
        * map.setValue(1, new sass.types.Number(100, "px"));
        * map; // (width: 300px, height: 100px)
        * ```
        *
        * @param length - The number of (initially undefined) key/value pairs in the map.
        */
      def this(length: Double) = this()
      
      /**
        * Returns the key in the key/value pair at `index`.
        *
        * @example
        *
        * ```js
        * // map is `(width: 300px, height: 100px)`
        * map.getKey(0); // width
        * map.getKey(1); // height
        * ```
        *
        * @param index -  A (0-based) index of a key/value pair in this map.
        * @throws `Error` if `index` is less than 0 or greater than or equal to the
        * number of pairs in this map.
        */
      def getKey(index: Double): LegacyValue = js.native
      
      /**
        * Returns the number of key/value pairs in this map.
        *
        * @example
        *
        * ```js
        * // map is `("light": 200, "medium": 400, "bold": 600)`
        * map.getLength(); // 3
        *
        * // map is `(width: 300px, height: 100px)`
        * map.getLength(); // 2
        * ```
        */
      def getLength(): Double = js.native
      
      /**
        * Returns the value in the key/value pair at `index`.
        *
        * @example
        *
        * ```js
        * // map is `(width: 300px, height: 100px)`
        * map.getValue(0); // 300px
        * map.getValue(1); // 100px
        * ```
        *
        * @param index -  A (0-based) index of a key/value pair in this map.
        * @throws `Error` if `index` is less than 0 or greater than or equal to the
        * number of pairs in this map.
        */
      def getValue(index: Double): LegacyValue = js.native
      
      /**
        * Sets the value in the key/value pair at `index` to `value`.
        *
        * @example
        *
        * ```js
        * // map is `("light": 200, "medium": 400, "bold": 600)`
        * map.setValue(1, new sass.types.String("lighter"));
        * map; // ("lighter": 200, "medium": 300, "bold": 600)
        * ```
        *
        * @param index -  A (0-based) index of a key/value pair in this map.
        * @throws `Error` if `index` is less than 0 or greater than or equal to the
        * number of pairs in this map.
        */
      def setKey(index: Double, key: LegacyValue): Unit = js.native
      
      /**
        * Sets the value in the key/value pair at `index` to `value`.
        *
        * @example
        *
        * ```js
        * // map is `("light": 200, "medium": 400, "bold": 600)`
        * map.setValue(1, new sass.types.Number(300));
        * map; // ("light": 200, "medium": 300, "bold": 600)
        * ```
        *
        * @param index -  A (0-based) index of a key/value pair in this map.
        * @throws `Error` if `index` is less than 0 or greater than or equal to the
        * number of pairs in this map.
        */
      def setValue(index: Double, value: LegacyValue): Unit = js.native
    }
    
    @JSImport("sass/types/legacy/function", "types.Null")
    @js.native
    open class Null ()
      extends StObject
         with _LegacyValue
    /* static members */
    object Null {
      
      /** Sass's singleton `null` value. */
      @JSImport("sass/types/legacy/function", "types.Null.NULL")
      @js.native
      val NULL: Null = js.native
    }
    
    @JSImport("sass/types/legacy/function", "types.Number")
    @js.native
    open class Number protected ()
      extends StObject
         with _LegacyValue {
      /**
        * @param value - The numeric value of the number.
        *
        * @param unit - If passed, the number's unit.
        *
        * Complex units can be represented as
        * `<unit>*<unit>*.../<unit>*<unit>*...`, with numerator units on the
        * left-hand side of the `/` and denominator units on the right. A number
        * with only numerator units may omit the `/` and the units after it, and a
        * number with only denominator units may be represented
        * with no units before the `/`.
        *
        * @example
        *
        * ```scss
        * new sass.types.Number(0.5); // == 0.5
        * new sass.types.Number(10, "px"); // == 10px
        * new sass.types.Number(10, "px*px"); // == 10px * 1px
        * new sass.types.Number(10, "px/s"); // == math.div(10px, 1s)
        * new sass.types.Number(10, "px*px/s*s"); // == 10px * math.div(math.div(1px, 1s), 1s)
        * ```
        */
      def this(value: Double) = this()
      def this(value: Double, unit: java.lang.String) = this()
      
      /**
        * Returns a string representation of this number's units. Complex units are
        * returned in the same format that [[constructor]] accepts them.
        *
        * @example
        *
        * ```js
        * // number is `10px`.
        * number.getUnit(); // "px"
        *
        * // number is `math.div(10px, 1s)`.
        * number.getUnit(); // "px/s"
        * ```
        */
      def getUnit(): java.lang.String = js.native
      
      /**
        * Returns the value of the number, ignoring units.
        *
        * **Heads up!** This means that `96px` and `1in` will return different
        * values, even though they represent the same length.
        *
        * @example
        *
        * ```js
        * const number = new sass.types.Number(10, "px");
        * number.getValue(); // 10
        * ```
        */
      def getValue(): Double = js.native
      
      /**
        * Destructively modifies this number by setting its units to `unit`,
        * independent of its numeric value. Complex units are specified in the same
        * format as [[constructor]].
        *
        * @deprecated Use [[constructor]] instead.
        */
      def setUnit(unit: java.lang.String): Unit = js.native
      
      /**
        * Destructively modifies this number by setting its numeric value to
        * `value`, independent of its units.
        *
        * @deprecated Use [[constructor]] instead.
        */
      def setValue(value: Double): Unit = js.native
    }
    
    @JSImport("sass/types/legacy/function", "types.String")
    @js.native
    open class String protected ()
      extends StObject
         with _LegacyValue {
      /**
        * Creates an unquoted string with the given contents.
        *
        * **Heads up!** This API currently provides no way of creating a
        * [quoted](https://sass-lang.com/documentation/values/strings#quoted)
        * string.
        */
      def this(value: java.lang.String) = this()
      
      /**
        * Returns the contents of the string. If the string contains escapes,
        * those escapes are included literally if it’s
        * [unquoted](https://sass-lang.com/documentation/values/strings#unquoted),
        * while the values of the escapes are included if it’s
        * [quoted](https://sass-lang.com/documentation/values/strings#quoted).
        *
        * @example
        *
        * ```
        * // string is `Arial`.
        * string.getValue(); // "Arial"
        *
        * // string is `"Helvetica Neue"`.
        * string.getValue(); // "Helvetica Neue"
        *
        * // string is `\1F46D`.
        * string.getValue(); // "\\1F46D"
        *
        * // string is `"\1F46D"`.
        * string.getValue(); // "👭"
        * ```
        */
      def getValue(): java.lang.String = js.native
      
      /**
        * Destructively modifies this string by setting its numeric value to
        * `value`.
        *
        * **Heads up!** Even if the string was originally quoted, this will cause
        * it to become unquoted.
        *
        * @deprecated Use [[constructor]] instead.
        */
      def setValue(value: java.lang.String): Unit = js.native
    }
  }
  
  type LegacyAsyncFunction = (js.ThisFunction1[
    /* this */ LegacyPluginThis, 
    (/* args */ Array[LegacyAsyncFunctionDone | LegacyValue]) | (/* done */ js.Function1[/* result */ LegacyValue, Unit]), 
    Unit
  ]) | (js.ThisFunction2[
    /* this */ LegacyPluginThis, 
    /* arg1 */ LegacyValue, 
    /* done */ LegacyAsyncFunctionDone, 
    Unit
  ]) | (js.ThisFunction3[
    /* this */ LegacyPluginThis, 
    /* arg1 */ LegacyValue, 
    /* arg2 */ LegacyValue, 
    /* done */ LegacyAsyncFunctionDone, 
    Unit
  ]) | (js.ThisFunction4[
    /* this */ LegacyPluginThis, 
    /* arg1 */ LegacyValue, 
    /* arg2 */ LegacyValue, 
    /* arg3 */ LegacyValue, 
    /* done */ LegacyAsyncFunctionDone, 
    Unit
  ]) | (js.ThisFunction5[
    /* this */ LegacyPluginThis, 
    /* arg1 */ LegacyValue, 
    /* arg2 */ LegacyValue, 
    /* arg3 */ LegacyValue, 
    /* arg4 */ LegacyValue, 
    /* done */ LegacyAsyncFunctionDone, 
    Unit
  ]) | (js.ThisFunction6[
    /* this */ LegacyPluginThis, 
    /* arg1 */ LegacyValue, 
    /* arg2 */ LegacyValue, 
    /* arg3 */ LegacyValue, 
    /* arg4 */ LegacyValue, 
    /* arg5 */ LegacyValue, 
    /* done */ LegacyAsyncFunctionDone, 
    Unit
  ]) | (js.ThisFunction7[
    /* this */ LegacyPluginThis, 
    /* arg1 */ LegacyValue, 
    /* arg2 */ LegacyValue, 
    /* arg3 */ LegacyValue, 
    /* arg4 */ LegacyValue, 
    /* arg5 */ LegacyValue, 
    /* arg6 */ LegacyValue, 
    /* done */ LegacyAsyncFunctionDone, 
    Unit
  ])
  
  type LegacyAsyncFunctionDone = js.Function1[/* result */ LegacyValue | Error, Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    sync extends 'async' ? sass.sass/types/legacy/function.LegacySyncFunction | sass.sass/types/legacy/function.LegacyAsyncFunction : sass.sass/types/legacy/function.LegacySyncFunction
    }}}
    */
  @js.native
  trait LegacyFunction[sync /* <: typings.sass.sassStrings.sync | async */] extends StObject
  
  @js.native
  trait LegacySyncFunction extends StObject {
    
    def apply(args: LegacyValue*): LegacyValue = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sass.typesLegacyFunctionMod.types.Null
    - typings.sass.typesLegacyFunctionMod.types.Number
    - typings.sass.typesLegacyFunctionMod.types.String
    - typings.sass.typesLegacyFunctionMod.types.Boolean[scala.Boolean]
    - typings.sass.typesLegacyFunctionMod.types.Color
    - typings.sass.typesLegacyFunctionMod.types.List
    - typings.sass.typesLegacyFunctionMod.types.Map
  */
  type LegacyValue = _LegacyValue | Boolean[scala.Boolean]
  
  trait _LegacyValue extends StObject
}
