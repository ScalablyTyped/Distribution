package typings.senchaTouch.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.String")
@js.native
class String ()
  extends StObject
     with typings.senchaTouch.Ext.String
/* static members */
object String {
  
  @JSGlobal("Ext.String")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Capitalize the given string
    * @param string String
    * @returns String
    */
  @scala.inline
  def capitalize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")().asInstanceOf[java.lang.String]
  @scala.inline
  def capitalize(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Truncate a string and add an ellipsis  to the end if it exceeds the specified length
    * @param value String The string to truncate.
    * @param length Number The maximum length to allow before truncating.
    * @param word Boolean true to try to find a common word break.
    * @returns String The converted text.
    */
  @scala.inline
  def ellipsis(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")().asInstanceOf[java.lang.String]
  @scala.inline
  def ellipsis(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def ellipsis(value: java.lang.String, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def ellipsis(value: java.lang.String, length: Double, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def ellipsis(value: java.lang.String, length: Unit, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def ellipsis(value: Unit, length: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def ellipsis(value: Unit, length: Double, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def ellipsis(value: Unit, length: Unit, word: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsis")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any], word.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Escapes the passed string for  and
    * @param string String The string to escape.
    * @returns String The escaped string.
    */
  @scala.inline
  def escape(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")().asInstanceOf[java.lang.String]
  @scala.inline
  def escape(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Escapes the passed string for use in a regular expression
    * @param string String
    * @returns String
    */
  @scala.inline
  def escapeRegex(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")().asInstanceOf[java.lang.String]
  @scala.inline
  def escapeRegex(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Allows you to define a tokenized string and pass an arbitrary number of arguments to replace the tokens
    * @param string String The tokenized string to be formatted.
    * @param values String... First param value to replace token {0}, then next param to replace {1} etc.
    * @returns String The formatted string.
    */
  @scala.inline
  def format(string: java.lang.String, values: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(string.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Convert certain characters  amp lt and from their HTML character equivalents
    * @param value String The string to decode.
    * @returns String The decoded text.
    */
  @scala.inline
  def htmlDecode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlDecode")().asInstanceOf[java.lang.String]
  @scala.inline
  def htmlDecode(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlDecode")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Convert certain characters  amp lt and to their HTML character equivalents for literal display in web pages
    * @param value String The string to encode.
    * @returns String The encoded text.
    */
  @scala.inline
  def htmlEncode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncode")().asInstanceOf[java.lang.String]
  @scala.inline
  def htmlEncode(value: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncode")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Pads the left side of a string with a specified character
    * @param string String The original string.
    * @param size Number The total length of the output string.
    * @param character String The character with which to pad the original string (defaults to empty string " ").
    * @returns String The padded string.
    */
  @scala.inline
  def leftPad(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")().asInstanceOf[java.lang.String]
  @scala.inline
  def leftPad(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def leftPad(string: java.lang.String, size: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def leftPad(string: java.lang.String, size: Double, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def leftPad(string: java.lang.String, size: Unit, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def leftPad(string: Unit, size: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def leftPad(string: Unit, size: Double, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def leftPad(string: Unit, size: Unit, character: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Returns a string with a specified number of repetitions a given string pattern
    * @param pattern String The pattern to repeat.
    * @param count Number The number of times to repeat the pattern (may be 0).
    * @param sep String An option string to separate each pattern.
    */
  @scala.inline
  def repeat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")().asInstanceOf[Unit]
  @scala.inline
  def repeat(pattern: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def repeat(pattern: java.lang.String, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def repeat(pattern: java.lang.String, count: Double, sep: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def repeat(pattern: java.lang.String, count: Unit, sep: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def repeat(pattern: Unit, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def repeat(pattern: Unit, count: Double, sep: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def repeat(pattern: Unit, count: Unit, sep: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(pattern.asInstanceOf[js.Any], count.asInstanceOf[js.Any], sep.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Utility function that allows you to easily switch a string between two alternating values
    * @param string String The current string.
    * @param value String The value to compare to the current string.
    * @param other String The new value to use if the string already equals the first value passed in.
    * @returns String The new value.
    */
  @scala.inline
  def toggle(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")().asInstanceOf[java.lang.String]
  @scala.inline
  def toggle(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def toggle(string: java.lang.String, value: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def toggle(string: java.lang.String, value: java.lang.String, other: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def toggle(string: java.lang.String, value: Unit, other: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def toggle(string: Unit, value: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def toggle(string: Unit, value: java.lang.String, other: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def toggle(string: Unit, value: Unit, other: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(string.asInstanceOf[js.Any], value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Trims whitespace from either end of a string leaving spaces within the string intact
    * @param string String The string to escape
    * @returns String The trimmed string
    */
  @scala.inline
  def trim(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")().asInstanceOf[java.lang.String]
  @scala.inline
  def trim(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Appends content to the query string of a URL handling logic for whether to place a question mark or ampersand
    * @param url String The URL to append to.
    * @param string String The content to append to the URL.
    * @returns String The resulting URL.
    */
  @scala.inline
  def urlAppend(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlAppend")().asInstanceOf[java.lang.String]
  @scala.inline
  def urlAppend(url: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlAppend")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def urlAppend(url: java.lang.String, string: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("urlAppend")(url.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def urlAppend(url: Unit, string: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("urlAppend")(url.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
