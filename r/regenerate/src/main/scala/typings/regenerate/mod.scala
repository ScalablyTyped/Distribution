package typings.regenerate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The main Regenerate constructor. Calling this function creates a new set that gets a chainable API.
    *
    * Any arguments passed to `regenerate()` will be added to the set right away.
    *
    * Both code points (numbers) and symbols (strings consisting of a single Unicode symbol)
    * are accepted, as well as arrays containing values of these types.
    *
    * It’s also possible to pass in a Regenerate instance.
    * Doing so adds all code points in that instance to the new set.
    */
  inline def apply(values: RegenerateArgValueOrArray*): typings.regenerate.mod.regenerate = ^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.regenerate.mod.regenerate]
  
  @JSImport("regenerate", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.regenerate.mod.regenerate {
    def this(values: RegenerateArgValueOrArray*) = this()
  }
  @JSImport("regenerate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** A string representing the semantic version number. */
  /* static member */
  @JSImport("regenerate", "version")
  @js.native
  val version: String = js.native
  
  type RegenerateArgValue = String | Double | typings.regenerate.mod.regenerate
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type RegenerateArgValueOrArray = regenerate.regenerate.RegenerateArgValue | std.Array<regenerate.regenerate.RegenerateArgValueOrArray>
  }}}
  to avoid circular code involving: 
  - regenerate.regenerate.RegenerateArgValueOrArray
  */
  type RegenerateArgValueOrArray = RegenerateArgValue | js.Array[Any]
  
  trait ToStringOptions extends StObject {
    
    /**
      * When `bmpOnly` is set to `true`, the output matches surrogates individually,
      * regardless of whether they’re lone surrogates or just part of a surrogate pair.
      *
      * This simplifies the output, but it can only be used in case you’re certain
      * the strings it will be used on don’t contain any astral symbols.
      */
    val bmpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `hasUnicodeFlag` is set to `true`, the output makes use
      * of Unicode code point escapes (`\\u{…}`) where applicable.
      *
      * This simplifies the output at the cost of compatibility and portability,
      * since it means the output can only be used as a pattern in a regular expression
      * with the ES6 `u` flag enabled.
      *
      * @see https://mathiasbynens.be/notes/es6-unicode-regex
      */
    val hasUnicodeFlag: js.UndefOr[Boolean] = js.undefined
  }
  object ToStringOptions {
    
    inline def apply(): ToStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToStringOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToStringOptions] (val x: Self) extends AnyVal {
      
      inline def setBmpOnly(value: Boolean): Self = StObject.set(x, "bmpOnly", value.asInstanceOf[js.Any])
      
      inline def setBmpOnlyUndefined: Self = StObject.set(x, "bmpOnly", js.undefined)
      
      inline def setHasUnicodeFlag(value: Boolean): Self = StObject.set(x, "hasUnicodeFlag", value.asInstanceOf[js.Any])
      
      inline def setHasUnicodeFlagUndefined: Self = StObject.set(x, "hasUnicodeFlag", js.undefined)
    }
  }
  
  @js.native
  trait regenerate extends StObject {
    
    /**
      * Any arguments passed to `add()` are added to the set.
      *
      * Both code points (numbers) and symbols (strings consisting of a single Unicode symbol)
      * are accepted, as well as arrays containing values of these types.
      *
      * It’s also possible to pass in a Regenerate instance.
      * Doing so adds all code points in that instance to the current set.
      */
    def add(value: RegenerateArgValueOrArray, rest: RegenerateArgValueOrArray*): this.type = js.native
    
    /**
      * Adds a range of code points from `start` to `end` (inclusive) from the set.
      *
      * Both code points (numbers) and symbols (strings consisting of a single Unicode symbol) are accepted.
      *
      * @param start The start of the range to add.
      * @param end The end of the range to add.
      */
    def addRange(start: String, end: String): this.type = js.native
    def addRange(start: String, end: Double): this.type = js.native
    def addRange(start: Double, end: String): this.type = js.native
    def addRange(start: Double, end: Double): this.type = js.native
    
    /**
      * Returns `true` if the given value is part of the set, and `false` otherwise.
      *
      * Both code points (numbers) and symbols (strings consisting of a single Unicode symbol) are accepted.
      *
      * @param codePoint The codepoint to check for
      */
    def contains(codePoint: String): Boolean = js.native
    def contains(codePoint: Double): Boolean = js.native
    
    def intersection(argument: js.Array[Double]): this.type = js.native
    /**
      * Removes any code points from the set that are not present in both the set and the given `codePoints` array.
      *
      * @param argument must be an array of numeric code point values, i.e. numbers, or a Regenerate instance.
      */
    def intersection(argument: typings.regenerate.mod.regenerate): this.type = js.native
    
    /**
      * Any arguments passed to `remove()` are removed from the set.
      *
      * Both code points (numbers) and symbols (strings consisting of a single Unicode symbol)
      * are accepted, as well as arrays containing values of these types.
      *
      * It’s also possible to pass in a Regenerate instance.
      * Doing so removes all code points in that instance from the current set.
      */
    def remove(value: RegenerateArgValueOrArray, rest: RegenerateArgValueOrArray*): this.type = js.native
    
    /**
      * Removes a range of code points from `start` to `end` (inclusive) from the set.
      *
      * Both code points (numbers) and symbols (strings consisting of a single Unicode symbol) are accepted.
      *
      * @param start The start of the range to remove.
      * @param end The end of the range to remove.
      */
    def removeRange(start: String, end: String): this.type = js.native
    def removeRange(start: String, end: Double): this.type = js.native
    def removeRange(start: Double, end: String): this.type = js.native
    def removeRange(start: Double, end: Double): this.type = js.native
    
    /**
      * Returns a sorted array of unique code points in the set.
      *
      * @alias valueOf
      */
    def toArray(): js.Array[Double] = js.native
    
    /**
      * Returns a regular expression that matches all the symbols
      * mapped to the code points within the set.
      *
      * @param flags The `flags` parameter to be passed to the regular expression.
      */
    def toRegExp(): js.RegExp = js.native
    def toRegExp(flags: String): js.RegExp = js.native
    
    def toString(options: ToStringOptions): String = js.native
  }
}
