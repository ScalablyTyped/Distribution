package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A set of space-separated tokens. Such a set is returned by Element.classList, HTMLLinkElement.relList, HTMLAnchorElement.relList, HTMLAreaElement.relList, HTMLIframeElement.sandbox, or HTMLOutputElement.htmlFor. It is indexed beginning with 0 as with JavaScript Array objects. DOMTokenList is always case-sensitive. */
@js.native
trait DOMTokenList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[java.lang.String] {
  
  /**
    * Adds all arguments passed, except those already present.
    *
    * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
    *
    * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
    */
  /* standard dom */
  def add(tokens: java.lang.String*): Unit = js.native
  
  /** Returns true if token is present, and false otherwise. */
  /* standard dom */
  def contains(token: java.lang.String): scala.Boolean = js.native
  
  /* standard dom.iterable */
  def entries(): IterableIterator[js.Tuple2[Double, java.lang.String]] = js.native
  
  /* standard dom */
  def forEach(
    callbackfn: js.Function3[/* value */ java.lang.String, /* key */ Double, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ java.lang.String, /* key */ Double, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /** Returns the token with index index. */
  /* standard dom */
  def item(index: Double): java.lang.String | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  
  /* standard dom.iterable */
  def keys(): IterableIterator[Double] = js.native
  
  /** Returns the number of tokens. */
  /* standard dom */
  val length: Double = js.native
  
  /**
    * Removes arguments passed, if they are present.
    *
    * Throws a "SyntaxError" DOMException if one of the arguments is the empty string.
    *
    * Throws an "InvalidCharacterError" DOMException if one of the arguments contains any ASCII whitespace.
    */
  /* standard dom */
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
  /* standard dom */
  def replace(token: java.lang.String, newToken: java.lang.String): scala.Boolean = js.native
  
  /**
    * Returns true if token is in the associated attribute's supported tokens. Returns false otherwise.
    *
    * Throws a TypeError if the associated attribute has no supported tokens defined.
    */
  /* standard dom */
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
  /* standard dom */
  def toggle(token: java.lang.String): scala.Boolean = js.native
  def toggle(token: java.lang.String, force: scala.Boolean): scala.Boolean = js.native
  
  /**
    * Returns the associated set as string.
    *
    * Can be set, to change the associated attribute.
    */
  /* standard dom */
  var value: java.lang.String = js.native
  
  /* standard dom.iterable */
  def values(): IterableIterator[java.lang.String] = js.native
}
