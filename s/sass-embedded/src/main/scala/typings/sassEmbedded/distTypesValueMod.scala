package typings.sassEmbedded

import typings.immutable.mod.OrderedMap
import typings.immutable.mod.ValueObject
import typings.sassEmbedded.anon.Alpha
import typings.sassEmbedded.anon.Blackness
import typings.sassEmbedded.anon.Brackets
import typings.sassEmbedded.anon.DenominatorUnits
import typings.sassEmbedded.anon.Hue
import typings.sassEmbedded.anon.Quotes
import typings.sassEmbedded.distTypesValueListMod.ListSeparator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesValueMod {
  
  @JSImport("sass-embedded/dist/types/value", "SassArgumentList")
  @js.native
  open class SassArgumentList protected ()
    extends typings.sassEmbedded.distTypesValueArgumentListMod.SassArgumentList {
    def this(contents: js.Array[Value], keywords: OrderedMap[String, Value]) = this()
    /**
      * Creates a new argument list.
      *
      * @param contents - The positional arguments that make up the primary
      * contents of the list. This may be either a plain JavaScript array or an
      * immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      *
      * @param keywords - The keyword arguments attached to this argument list,
      * whose names should exclude `$`. This can be either a plain JavaScript
      * object with argument names as fields, or an immutable [[OrderedMap]] from
      * the [`immutable` package](https://immutable-js.com/)
      *
      * @param separator - The separator for this list. Defaults to `','`.
      */
    def this(contents: js.Array[Value], keywords: Record[String, Value]) = this()
    def this(contents: typings.immutable.mod.List[Value], keywords: OrderedMap[String, Value]) = this()
    def this(contents: typings.immutable.mod.List[Value], keywords: Record[String, Value]) = this()
    def this(contents: js.Array[Value], keywords: OrderedMap[String, Value], separator: ListSeparator) = this()
    def this(contents: js.Array[Value], keywords: Record[String, Value], separator: ListSeparator) = this()
    def this(
      contents: typings.immutable.mod.List[Value],
      keywords: OrderedMap[String, Value],
      separator: ListSeparator
    ) = this()
    def this(
      contents: typings.immutable.mod.List[Value],
      keywords: Record[String, Value],
      separator: ListSeparator
    ) = this()
  }
  
  @JSImport("sass-embedded/dist/types/value", "SassBoolean")
  @js.native
  /* private */ open class SassBoolean ()
    extends typings.sassEmbedded.distTypesValueBooleanMod.SassBoolean
  
  @JSImport("sass-embedded/dist/types/value", "SassColor")
  @js.native
  open class SassColor protected ()
    extends typings.sassEmbedded.distTypesValueColorMod.SassColor {
    /**
      * Creates an RGB color.
      *
      * @throws `Error` if `red`, `green`, and `blue` aren't between `0` and
      * `255`, or if `alpha` isn't between `0` and `1`.
      */
    def this(options: Alpha) = this()
    /**
      * Creates an HWB color.
      *
      * @throws `Error` if `whiteness` or `blackness` aren't between `0` and `100`,
      * or if `alpha` isn't between `0` and `1`.
      */
    def this(options: Blackness) = this()
    /**
      * Creates an HSL color.
      *
      * @throws `Error` if `saturation` or `lightness` aren't between `0` and
      * `100`, or if `alpha` isn't between `0` and `1`.
      */
    def this(options: Hue) = this()
  }
  
  @JSImport("sass-embedded/dist/types/value", "SassFunction")
  @js.native
  open class SassFunction protected ()
    extends typings.sassEmbedded.distTypesValueFunctionMod.SassFunction {
    /**
      * Creates a new first-class function that can be invoked using
      * [`meta.call()`](https://sass-lang.com/documentation/modules/meta#call).
      *
      * @param signature - The function signature, like you'd write for the
      * [`@function rule`](https://sass-lang.com/documentation/at-rules/function).
      * @param callback - The callback that's invoked when this function is called,
      * just like for a [[CustomFunction]].
      */
    def this(signature: String, callback: js.Function1[/* args */ js.Array[Value], Value]) = this()
  }
  
  @JSImport("sass-embedded/dist/types/value", "SassList")
  @js.native
  /**
    * Creates an empty list.
    *
    * @param options.separator - The separator to use between elements of this
    * list. Defaults to `','`.
    *
    * @param options.brackets - Whether the list has square brackets. Defaults to
    * `false`.
    */
  open class SassList ()
    extends typings.sassEmbedded.distTypesValueListMod.SassList {
    /**
      * Creates a new list.
      *
      * @param contents - The contents of the list. This may be either a plain
      * JavaScript array or an immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      *
      * @param options.separator - The separator to use between elements of this
      * list. Defaults to `','`.
      *
      * @param options.brackets - Whether the list has square brackets. Defaults to
      * `false`.
      */
    def this(contents: js.Array[Value]) = this()
    def this(contents: typings.immutable.mod.List[Value]) = this()
    def this(options: Brackets) = this()
    def this(contents: js.Array[Value], options: Brackets) = this()
    def this(contents: typings.immutable.mod.List[Value], options: Brackets) = this()
  }
  
  @JSImport("sass-embedded/dist/types/value", "SassMap")
  @js.native
  /**
    * Creates a new map.
    *
    * @param contents - The contents of the map. This is an immutable
    * [[OrderedMap]] from the [`immutable` package](https://immutable-js.com/).
    * Defaults to an empty map.
    */
  open class SassMap ()
    extends typings.sassEmbedded.distTypesValueMapMod.SassMap {
    def this(contents: OrderedMap[Value, Value]) = this()
  }
  
  @JSImport("sass-embedded/dist/types/value", "SassNumber")
  @js.native
  open class SassNumber protected ()
    extends typings.sassEmbedded.distTypesValueNumberMod.SassNumber {
    /**
      * Creates a new number with more complex units than just a single numerator.
      *
      * Upon construction, any compatible numerator and denominator units are
      * simplified away according to the conversion factor between them.
      *
      * @param value - The number's numeric value.
      *
      * @param unit - If this is a string, it's used as the single numerator unit
      * for the number.
      *
      * @param unit.numeratorUnits - If passed, these are the numerator units to
      * use for the number. This may be either a plain JavaScript array or an
      * immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      *
      * @param unit.denominatorUnits - If passed, these are the denominator units
      * to use for the number. This may be either a plain JavaScript array or an
      * immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      */
    def this(value: Double) = this()
    def this(value: Double, unit: String) = this()
    def this(value: Double, unit: DenominatorUnits) = this()
  }
  
  @JSImport("sass-embedded/dist/types/value", "SassString")
  @js.native
  /**
    * Creates an empty string.
    *
    * @param options.quotes - Whether the string is quoted. Defaults to `true`.
    */
  open class SassString ()
    extends typings.sassEmbedded.distTypesValueStringMod.SassString {
    def this(options: Quotes) = this()
    /**
      * Creates a new string.
      *
      * @param text - The contents of the string. For quoted strings, this is the
      * semantic content—any escape sequences that were been written in the source
      * text are resolved to their Unicode values. For unquoted strings, though,
      * escape sequences are preserved as literal backslashes.
      *
      * @param options.quotes - Whether the string is quoted. Defaults to `true`.
      */
    def this(text: String) = this()
    def this(text: String, options: Quotes) = this()
  }
  
  /* note: abstract class */ @JSImport("sass-embedded/dist/types/value", "Value")
  @js.native
  /* protected */ open class Value ()
    extends StObject
       with ValueObject {
    
    /**
      * This value as a list.
      *
      * All SassScript values can be used as lists. Maps count as lists of pairs,
      * and all other values count as single-value lists.
      *
      * @returns An immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      */
    def asList: typings.immutable.mod.List[Value] = js.native
    
    /**
      * Throws if `this` isn't a [[SassBoolean]].
      *
      * **Heads up!** Functions should generally use [[isTruthy]] rather than
      * requiring a literal boolean.
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertBoolean(): typings.sassEmbedded.distTypesValueBooleanMod.SassBoolean = js.native
    def assertBoolean(name: String): typings.sassEmbedded.distTypesValueBooleanMod.SassBoolean = js.native
    
    /**
      * Throws if `this` isn't a [[SassColor]].
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertColor(): typings.sassEmbedded.distTypesValueColorMod.SassColor = js.native
    def assertColor(name: String): typings.sassEmbedded.distTypesValueColorMod.SassColor = js.native
    
    /**
      * Throws if `this` isn't a [[SassFunction]].
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertFunction(): typings.sassEmbedded.distTypesValueFunctionMod.SassFunction = js.native
    def assertFunction(name: String): typings.sassEmbedded.distTypesValueFunctionMod.SassFunction = js.native
    
    /**
      * Throws if `this` isn't a [[SassMap]].
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertMap(): typings.sassEmbedded.distTypesValueMapMod.SassMap = js.native
    def assertMap(name: String): typings.sassEmbedded.distTypesValueMapMod.SassMap = js.native
    
    /**
      * Throws if `this` isn't a [[SassNumber]].
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertNumber(): typings.sassEmbedded.distTypesValueNumberMod.SassNumber = js.native
    def assertNumber(name: String): typings.sassEmbedded.distTypesValueNumberMod.SassNumber = js.native
    
    /**
      * Throws if `this` isn't a [[SassString]].
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertString(): typings.sassEmbedded.distTypesValueStringMod.SassString = js.native
    def assertString(name: String): typings.sassEmbedded.distTypesValueStringMod.SassString = js.native
    
    /** Returns whether `this` represents the same value as `other`. */
    def equals(other: Value): Boolean = js.native
    
    /**
      * Returns the value at index `index` in this value as a list, or `undefined`
      * if `index` isn't valid for this list.
      *
      * All SassScript values can be used as lists. Maps count as lists of pairs,
      * and all other values count as single-value lists.
      *
      * This is a shorthand for `this.asList.get(index)`, although it may be more
      * efficient in some cases.
      *
      * **Heads up!** This method uses the same indexing conventions as the
      * `immutable` package: unlike Sass the index of the first element is 0, but
      * like Sass negative numbers index from the end of the list.
      */
    def get(index: Double): js.UndefOr[Value] = js.native
    
    /**
      * Whether this value as a list has brackets.
      *
      * All SassScript values can be used as lists. Maps count as lists of pairs,
      * and all other values count as single-value lists.
      */
    def hasBrackets: Boolean = js.native
    
    /**
      * Whether the value counts as `true` in an `@if` statement and other
      * contexts.
      */
    def isTruthy: Boolean = js.native
    
    /**
      * Returns JavaScript's `null` value if this is [[sassNull]], and returns
      * `this` otherwise.
      */
    def realNull: Null | Value = js.native
    
    /**
      * Converts `sassIndex` into a JavaScript-style index into the list returned
      * by [[asList]].
      *
      * Sass indexes are one-based, while JavaScript indexes are zero-based. Sass
      * indexes may also be negative in order to index from the end of the list.
      *
      * @param sassIndex - The Sass-style index into this as a list.
      * @param name - The name of the function argument `sassIndex` came from
      * (without the `$`) if it came from an argument. Used for error reporting.
      * @throws `Error` If `sassIndex` isn't a number, if that number isn't an
      * integer, or if that integer isn't a valid index for [[asList]].
      */
    def sassIndexToListIndex(sassIndex: Value): Double = js.native
    def sassIndexToListIndex(sassIndex: Value, name: String): Double = js.native
    
    /**
      * The separator for this value as a list.
      *
      * All SassScript values can be used as lists. Maps count as lists of pairs,
      * and all other values count as single-value lists.
      */
    def separator: ListSeparator = js.native
    
    /**
      * Returns `this` as a map if it counts as one (empty lists count as empty
      * maps) or `null` if it doesn't.
      */
    def tryMap(): typings.sassEmbedded.distTypesValueMapMod.SassMap | Null = js.native
  }
  
  @JSImport("sass-embedded/dist/types/value", "sassFalse")
  @js.native
  val sassFalse: typings.sassEmbedded.distTypesValueBooleanMod.SassBoolean = js.native
  
  @JSImport("sass-embedded/dist/types/value", "sassNull")
  @js.native
  val sassNull: Value = js.native
  
  @JSImport("sass-embedded/dist/types/value", "sassTrue")
  @js.native
  val sassTrue: typings.sassEmbedded.distTypesValueBooleanMod.SassBoolean = js.native
}
