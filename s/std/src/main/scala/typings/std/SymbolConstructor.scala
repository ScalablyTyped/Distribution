package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolConstructor extends StObject {
  
  /**
    * Returns a new unique Symbol value.
    * @param  description Description of the new Symbol object.
    */
  /* standard es2015.symbol */
  def apply(): js.Symbol = js.native
  def apply(description: java.lang.String): js.Symbol = js.native
  def apply(description: Double): js.Symbol = js.native
  
  /**
    * A method that returns the default async iterator for an object. Called by the semantics of
    * the for-await-of statement.
    */
  /* standard es2018.asynciterable */
  val asyncIterator: js.Symbol = js.native
  
  /**
    * Returns a Symbol object from the global symbol registry matching the given key if found.
    * Otherwise, returns a new symbol with this key.
    * @param key key to search for.
    */
  /* standard es2015.symbol */
  def `for`(key: java.lang.String): js.Symbol = js.native
  
  /**
    * A method that determines if a constructor object recognizes an object as one of the
    * constructor’s instances. Called by the semantics of the instanceof operator.
    */
  /* standard es2015.symbol.wellknown */
  val hasInstance: js.Symbol = js.native
  
  /**
    * A Boolean value that if true indicates that an object should flatten to its array elements
    * by Array.prototype.concat.
    */
  /* standard es2015.symbol.wellknown */
  val isConcatSpreadable: js.Symbol = js.native
  
  /**
    * A method that returns the default iterator for an object. Called by the semantics of the
    * for-of statement.
    */
  /* standard es2015.iterable */
  val iterator: js.Symbol = js.native
  
  /**
    * Returns a key from the global symbol registry matching the given Symbol if found.
    * Otherwise, returns a undefined.
    * @param sym Symbol to find the key for.
    */
  /* standard es2015.symbol */
  def keyFor(sym: js.Symbol): js.UndefOr[java.lang.String] = js.native
  
  /**
    * A regular expression method that matches the regular expression against a string. Called
    * by the String.prototype.match method.
    */
  /* standard es2015.symbol.wellknown */
  val `match`: js.Symbol = js.native
  
  /**
    * A regular expression method that matches the regular expression against a string. Called
    * by the String.prototype.matchAll method.
    */
  /* standard es2020.symbol.wellknown */
  val matchAll: js.Symbol = js.native
  
  /**
    * A regular expression method that replaces matched substrings of a string. Called by the
    * String.prototype.replace method.
    */
  /* standard es2015.symbol.wellknown */
  val replace: js.Symbol = js.native
  
  /**
    * A regular expression method that returns the index within a string that matches the
    * regular expression. Called by the String.prototype.search method.
    */
  /* standard es2015.symbol.wellknown */
  val search: js.Symbol = js.native
  
  /**
    * A function valued property that is the constructor function that is used to create
    * derived objects.
    */
  /* standard es2015.symbol.wellknown */
  val species: js.Symbol = js.native
  
  /**
    * A regular expression method that splits a string at the indices that match the regular
    * expression. Called by the String.prototype.split method.
    */
  /* standard es2015.symbol.wellknown */
  val split: js.Symbol = js.native
  
  /**
    * A method that converts an object to a corresponding primitive value.
    * Called by the ToPrimitive abstract operation.
    */
  /* standard es2015.symbol.wellknown */
  val toPrimitive: js.Symbol = js.native
  
  /**
    * A String value that is used in the creation of the default string description of an object.
    * Called by the built-in method Object.prototype.toString.
    */
  /* standard es2015.symbol.wellknown */
  val toStringTag: js.Symbol = js.native
  
  /**
    * An Object whose own property names are property names that are excluded from the 'with'
    * environment bindings of the associated objects.
    */
  /* standard es2015.symbol.wellknown */
  val unscopables: js.Symbol = js.native
}
