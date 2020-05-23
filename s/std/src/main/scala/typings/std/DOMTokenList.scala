package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A set of space-separated tokens. Such a set is returned by Element.classList, HTMLLinkElement.relList, HTMLAnchorElement.relList, HTMLAreaElement.relList, HTMLIframeElement.sandbox, or HTMLOutputElement.htmlFor. It is indexed beginning with 0 as with JavaScript Array objects. DOMTokenList is always case-sensitive. */
@js.native
trait DOMTokenList
  extends /* index */ NumberDictionary[java.lang.String] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  /**
    * Returns the number of tokens.
    */
  val length: Double = js.native
  /**
    * Returns the associated set as string.
    * 
    * Can be set, to change the associated attribute.
    */
  var value: java.lang.String = js.native
  /**
    * Adds all arguments passed, except those already present.
    * 
    * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
    * 
    * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
    */
  def add(tokens: java.lang.String*): Unit = js.native
  /**
    * Returns true if token is present, and false otherwise.
    */
  def contains(token: java.lang.String): scala.Boolean = js.native
  def entries(): IterableIterator[js.Tuple2[Double, java.lang.String]] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ java.lang.String, /* key */ Double, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ java.lang.String, /* key */ Double, /* parent */ this.type, Unit],
    thisArg: js.Any
  ): Unit = js.native
  /**
    * Returns the token with index index.
    */
  def item(index: Double): java.lang.String | Null = js.native
  def keys(): IterableIterator[Double] = js.native
  /**
    * Removes arguments passed, if they are present.
    * 
    * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
    * 
    * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
    */
  def remove(tokens: java.lang.String*): Unit = js.native
  /**
    * Replaces token with newToken.
    * 
    * Returns true if token was replaced with newToken, and false otherwise.
    * 
    * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
    * 
    * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
    */
  def replace(oldToken: java.lang.String, newToken: java.lang.String): Unit = js.native
  /**
    * Returns true if token is in the associated attribute's supported tokens. Returns false otherwise.
    * 
    * Throws a TypeError if the associated attribute has no supported tokens defined.
    */
  def supports(token: java.lang.String): scala.Boolean = js.native
  /**
    * If force is not given, "toggles" token, removing it if it's present and adding it if it's not present. If force is true, adds token (same as add()). If force is false, removes token (same as remove()).
    * 
    * Returns true if token is now present, and false otherwise.
    * 
    * Throws a "SyntaxError" DOMException if token is empty.
    * 
    * Throws an "InvalidCharacterError" DOMException if token contains any spaces.
    */
  def toggle(token: java.lang.String): scala.Boolean = js.native
  def toggle(token: java.lang.String, force: scala.Boolean): scala.Boolean = js.native
  def values(): IterableIterator[java.lang.String] = js.native
}

