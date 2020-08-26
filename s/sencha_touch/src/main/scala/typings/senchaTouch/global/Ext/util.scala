package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.util.IPoint
import typings.senchaTouch.Ext.util.IRegion
import typings.std.Event
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util")
@js.native
object util extends js.Object {
  @js.native
  class Audio ()
    extends typings.senchaTouch.Ext.util.Audio
  
  @js.native
  class Format ()
    extends typings.senchaTouch.Ext.util.Format
  
  @js.native
  class Functions ()
    extends typings.senchaTouch.Ext.util.Functions
  
  @js.native
  class Inflector ()
    extends typings.senchaTouch.Ext.util.Inflector
  
  @js.native
  class InputBlocker ()
    extends typings.senchaTouch.Ext.util.InputBlocker
  
  @js.native
  class JSONP ()
    extends typings.senchaTouch.Ext.util.JSONP
  
  @js.native
  class Point ()
    extends typings.senchaTouch.Ext.util.Point
  
  @js.native
  class Region ()
    extends typings.senchaTouch.Ext.util.Region
  
  /* static members */
  @js.native
  object Audio extends js.Object {
    /** [Property] (Ext.Class) */
    var self: IClass = js.native
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    def callOverridden(): js.Any = js.native
    def callOverridden(args: js.Any): js.Any = js.native
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    def callParent(): js.Any = js.native
    def callParent(args: js.Any): js.Any = js.native
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    def callSuper(): js.Any = js.native
    def callSuper(args: js.Any): js.Any = js.native
    /** [Method]  */
    def destroy(): Unit = js.native
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    def getInitialConfig(): js.Any = js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    def initConfig(): js.Any = js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
  }
  
  /* static members */
  @js.native
  object Format extends js.Object {
    /** [Property] (String) */
    var defaultDateFormat: java.lang.String = js.native
    /** [Property] (Array) */
    var potentialUndefinedKeys: typings.senchaTouch.Ext.Array = js.native
    /** [Property] (Ext.Class) */
    var self: IClass = js.native
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    def callOverridden(): js.Any = js.native
    def callOverridden(args: js.Any): js.Any = js.native
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    def callParent(): js.Any = js.native
    def callParent(args: js.Any): js.Any = js.native
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    def callSuper(): js.Any = js.native
    def callSuper(args: js.Any): js.Any = js.native
    /** [Method] Parse a value into a formatted date using the specified format pattern
      * @param value String/Date The value to format. Strings must conform to the format expected by the JavaScript Date object's parse() method.
      * @param format String Any valid date format string.
      * @returns String The formatted date string.
      */
    def date(): java.lang.String = js.native
    def date(value: js.UndefOr[scala.Nothing], format: java.lang.String): java.lang.String = js.native
    def date(value: js.Any): java.lang.String = js.native
    def date(value: js.Any, format: java.lang.String): java.lang.String = js.native
    /** [Method]  */
    def destroy(): Unit = js.native
    /** [Method] Truncate a string and add an ellipsis  to the end if it exceeds the specified length
      * @param value String The string to truncate.
      * @param length Number The maximum length to allow before truncating.
      * @param word Boolean True to try to find a common word break.
      * @returns String The converted text.
      */
    def ellipsis(): java.lang.String = js.native
    def ellipsis(value: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], word: Boolean): java.lang.String = js.native
    def ellipsis(value: js.UndefOr[scala.Nothing], length: Double): java.lang.String = js.native
    def ellipsis(value: js.UndefOr[scala.Nothing], length: Double, word: Boolean): java.lang.String = js.native
    def ellipsis(value: java.lang.String): java.lang.String = js.native
    def ellipsis(value: java.lang.String, length: js.UndefOr[scala.Nothing], word: Boolean): java.lang.String = js.native
    def ellipsis(value: java.lang.String, length: Double): java.lang.String = js.native
    def ellipsis(value: java.lang.String, length: Double, word: Boolean): java.lang.String = js.native
    /** [Method] Escapes the passed string for  and
      * @param string String The string to escape.
      * @returns String The escaped string.
      */
    def escape(): java.lang.String = js.native
    def escape(string: java.lang.String): java.lang.String = js.native
    /** [Method] Escapes the passed string for use in a regular expression
      * @param str String
      * @returns String
      */
    def escapeRegex(): java.lang.String = js.native
    def escapeRegex(str: java.lang.String): java.lang.String = js.native
    /** [Method] Allows you to define a tokenized string and pass an arbitrary number of arguments to replace the tokens
      * @param string String The tokenized string to be formatted.
      * @param values String... The values to replace token {0}, {1}, etc.
      * @returns String The formatted string.
      */
    def format(string: java.lang.String, values: js.Any*): java.lang.String = js.native
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    def getInitialConfig(): js.Any = js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    /** [Method] Convert certain characters  amp lt and from their HTML character equivalents
      * @param value String The string to decode.
      * @returns String The decoded text.
      */
    def htmlDecode(): java.lang.String = js.native
    def htmlDecode(value: java.lang.String): java.lang.String = js.native
    /** [Method] Convert certain characters  amp lt and to their HTML character equivalents for literal display in web pages
      * @param value String The string to encode.
      * @returns String The encoded text.
      */
    def htmlEncode(): java.lang.String = js.native
    def htmlEncode(value: java.lang.String): java.lang.String = js.native
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    def initConfig(): js.Any = js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    /** [Method] Pads the left side of a string with a specified character
      * @param string String The original string.
      * @param size Number The total length of the output string.
      * @param char String The character with which to pad the original string.
      * @returns String The padded string.
      */
    def leftPad(): java.lang.String = js.native
    def leftPad(string: js.UndefOr[scala.Nothing], size: js.UndefOr[scala.Nothing], char: java.lang.String): java.lang.String = js.native
    def leftPad(string: js.UndefOr[scala.Nothing], size: Double): java.lang.String = js.native
    def leftPad(string: js.UndefOr[scala.Nothing], size: Double, char: java.lang.String): java.lang.String = js.native
    def leftPad(string: java.lang.String): java.lang.String = js.native
    def leftPad(string: java.lang.String, size: js.UndefOr[scala.Nothing], char: java.lang.String): java.lang.String = js.native
    def leftPad(string: java.lang.String, size: Double): java.lang.String = js.native
    def leftPad(string: java.lang.String, size: Double, char: java.lang.String): java.lang.String = js.native
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
    /** [Method] Utility function that allows you to easily switch a string between two alternating values
      * @param string String The current string
      * @param value String The value to compare to the current string
      * @param other String The new value to use if the string already equals the first value passed in
      * @returns String The new value
      */
    def toggle(): java.lang.String = js.native
    def toggle(string: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], other: java.lang.String): java.lang.String = js.native
    def toggle(string: js.UndefOr[scala.Nothing], value: java.lang.String): java.lang.String = js.native
    def toggle(string: js.UndefOr[scala.Nothing], value: java.lang.String, other: java.lang.String): java.lang.String = js.native
    def toggle(string: java.lang.String): java.lang.String = js.native
    def toggle(string: java.lang.String, value: js.UndefOr[scala.Nothing], other: java.lang.String): java.lang.String = js.native
    def toggle(string: java.lang.String, value: java.lang.String): java.lang.String = js.native
    def toggle(string: java.lang.String, value: java.lang.String, other: java.lang.String): java.lang.String = js.native
    /** [Method] Trims whitespace from either end of a string leaving spaces within the string intact
      * @param string String The string to escape
      * @returns String The trimmed string
      */
    def trim(): java.lang.String = js.native
    def trim(string: java.lang.String): java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object Functions extends js.Object {
    /** [Method] Create an alias to the provided method property with name methodName of object
      * @param object Object/Function
      * @param methodName String
      * @returns Function aliasFn
      */
    def alias(): js.Any = js.native
    def alias(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String): js.Any = js.native
    def alias(`object`: js.Any): js.Any = js.native
    def alias(`object`: js.Any, methodName: java.lang.String): js.Any = js.native
    /** [Method] Create a new function from the provided fn change this to the provided scope optionally overrides arguments for the
      * @param fn Function The function to delegate.
      * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the browser window.
      * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if true args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
      * @returns Function The new function.
      */
    def bind(): js.Any = js.native
    def bind(
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    def bind(
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array
    ): js.Any = js.native
    def bind(
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def bind(fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def bind(fn: js.UndefOr[scala.Nothing], scope: js.Any, args: js.UndefOr[scala.Nothing], appendArgs: js.Any): js.Any = js.native
    def bind(fn: js.UndefOr[scala.Nothing], scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def bind(
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def bind(fn: js.Any): js.Any = js.native
    def bind(fn: js.Any, scope: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], appendArgs: js.Any): js.Any = js.native
    def bind(fn: js.Any, scope: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def bind(
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def bind(fn: js.Any, scope: js.Any): js.Any = js.native
    def bind(fn: js.Any, scope: js.Any, args: js.UndefOr[scala.Nothing], appendArgs: js.Any): js.Any = js.native
    def bind(fn: js.Any, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def bind(fn: js.Any, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = js.native
    def clone(method: js.Any): js.Any = js.native
    /** [Method] Creates a delegate function optionally with a bound scope which when called buffers the execution of the passed fu
      * @param fn Function The function to invoke on a buffered timer.
      * @param buffer Number The number of milliseconds by which to buffer the invocation of the function.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
      * @param args Array Override arguments for the call. Defaults to the arguments passed by the caller.
      * @returns Function A function which invokes the passed function after buffering for the specified time.
      */
    def createBuffered(): js.Any = js.native
    def createBuffered(
      fn: js.UndefOr[scala.Nothing],
      buffer: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array
    ): js.Any = js.native
    def createBuffered(fn: js.UndefOr[scala.Nothing], buffer: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def createBuffered(
      fn: js.UndefOr[scala.Nothing],
      buffer: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.senchaTouch.Ext.Array
    ): js.Any = js.native
    def createBuffered(fn: js.UndefOr[scala.Nothing], buffer: Double): js.Any = js.native
    def createBuffered(
      fn: js.UndefOr[scala.Nothing],
      buffer: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array
    ): js.Any = js.native
    def createBuffered(fn: js.UndefOr[scala.Nothing], buffer: Double, scope: js.Any): js.Any = js.native
    def createBuffered(fn: js.UndefOr[scala.Nothing], buffer: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def createBuffered(fn: js.Any): js.Any = js.native
    def createBuffered(
      fn: js.Any,
      buffer: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array
    ): js.Any = js.native
    def createBuffered(fn: js.Any, buffer: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def createBuffered(fn: js.Any, buffer: js.UndefOr[scala.Nothing], scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def createBuffered(fn: js.Any, buffer: Double): js.Any = js.native
    def createBuffered(fn: js.Any, buffer: Double, scope: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def createBuffered(fn: js.Any, buffer: Double, scope: js.Any): js.Any = js.native
    def createBuffered(fn: js.Any, buffer: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    /** [Method] Creates a delegate callback which when called executes after a specific delay
      * @param fn Function The function which will be called on a delay when the returned function is called. Optionally, a replacement (or additional) argument list may be specified.
      * @param delay Number The number of milliseconds to defer execution by whenever called.
      * @param scope Object The scope (this reference) used by the function at execution time.
      * @param args Array Override arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
      * @returns Function A function which, when called, executes the original function after the specified delay.
      */
    def createDelayed(): js.Any = js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array
    ): js.Any = js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(fn: js.UndefOr[scala.Nothing], delay: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.senchaTouch.Ext.Array
    ): js.Any = js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(fn: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: Double,
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array
    ): js.Any = js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(fn: js.UndefOr[scala.Nothing], delay: Double, scope: js.Any): js.Any = js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: Double,
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(fn: js.UndefOr[scala.Nothing], delay: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def createDelayed(
      fn: js.UndefOr[scala.Nothing],
      delay: Double,
      scope: js.Any,
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(fn: js.Any): js.Any = js.native
    def createDelayed(
      fn: js.Any,
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(
      fn: js.Any,
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array
    ): js.Any = js.native
    def createDelayed(
      fn: js.Any,
      delay: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(fn: js.Any, delay: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def createDelayed(
      fn: js.Any,
      delay: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(fn: js.Any, delay: js.UndefOr[scala.Nothing], scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def createDelayed(
      fn: js.Any,
      delay: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(fn: js.Any, delay: Double): js.Any = js.native
    def createDelayed(
      fn: js.Any,
      delay: Double,
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(fn: js.Any, delay: Double, scope: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def createDelayed(
      fn: js.Any,
      delay: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any): js.Any = js.native
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: js.UndefOr[scala.Nothing], appendArgs: js.Any): js.Any = js.native
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = js.native
    /** [Method] Create a new function from the provided fn change this to the provided scope optionally overrides arguments for the
      * @param fn Function The function to delegate.
      * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the browser window.
      * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if true args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
      * @returns Function The new function.
      */
    def createDelegate(): js.Any = js.native
    def createDelegate(
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelegate(
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array
    ): js.Any = js.native
    def createDelegate(
      fn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelegate(fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def createDelegate(fn: js.UndefOr[scala.Nothing], scope: js.Any, args: js.UndefOr[scala.Nothing], appendArgs: js.Any): js.Any = js.native
    def createDelegate(fn: js.UndefOr[scala.Nothing], scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def createDelegate(
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelegate(fn: js.Any): js.Any = js.native
    def createDelegate(fn: js.Any, scope: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], appendArgs: js.Any): js.Any = js.native
    def createDelegate(fn: js.Any, scope: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def createDelegate(
      fn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): js.Any = js.native
    def createDelegate(fn: js.Any, scope: js.Any): js.Any = js.native
    def createDelegate(fn: js.Any, scope: js.Any, args: js.UndefOr[scala.Nothing], appendArgs: js.Any): js.Any = js.native
    def createDelegate(fn: js.Any, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def createDelegate(fn: js.Any, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = js.native
    /** [Method] Creates an interceptor function
      * @param origFn Function The original function.
      * @param newFn Function The function to call before the original.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the browser window.
      * @param returnValue Object The value to return if the passed function return false.
      * @returns Function The new function.
      */
    def createInterceptor(): js.Any = js.native
    def createInterceptor(
      origFn: js.UndefOr[scala.Nothing],
      newFn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      returnValue: js.Any
    ): js.Any = js.native
    def createInterceptor(origFn: js.UndefOr[scala.Nothing], newFn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def createInterceptor(
      origFn: js.UndefOr[scala.Nothing],
      newFn: js.UndefOr[scala.Nothing],
      scope: js.Any,
      returnValue: js.Any
    ): js.Any = js.native
    def createInterceptor(origFn: js.UndefOr[scala.Nothing], newFn: js.Any): js.Any = js.native
    def createInterceptor(
      origFn: js.UndefOr[scala.Nothing],
      newFn: js.Any,
      scope: js.UndefOr[scala.Nothing],
      returnValue: js.Any
    ): js.Any = js.native
    def createInterceptor(origFn: js.UndefOr[scala.Nothing], newFn: js.Any, scope: js.Any): js.Any = js.native
    def createInterceptor(origFn: js.UndefOr[scala.Nothing], newFn: js.Any, scope: js.Any, returnValue: js.Any): js.Any = js.native
    def createInterceptor(origFn: js.Any): js.Any = js.native
    def createInterceptor(
      origFn: js.Any,
      newFn: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      returnValue: js.Any
    ): js.Any = js.native
    def createInterceptor(origFn: js.Any, newFn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def createInterceptor(origFn: js.Any, newFn: js.UndefOr[scala.Nothing], scope: js.Any, returnValue: js.Any): js.Any = js.native
    def createInterceptor(origFn: js.Any, newFn: js.Any): js.Any = js.native
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.UndefOr[scala.Nothing], returnValue: js.Any): js.Any = js.native
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = js.native
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any, returnValue: js.Any): js.Any = js.native
    /** [Method] Create a combined function call sequence of the original function  the passed function
      * @param originalFn Function The original function.
      * @param newFn Function The function to sequence.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the browser window.
      * @returns Function The new function.
      */
    def createSequence(): js.Any = js.native
    def createSequence(originalFn: js.UndefOr[scala.Nothing], newFn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def createSequence(originalFn: js.UndefOr[scala.Nothing], newFn: js.Any): js.Any = js.native
    def createSequence(originalFn: js.UndefOr[scala.Nothing], newFn: js.Any, scope: js.Any): js.Any = js.native
    def createSequence(originalFn: js.Any): js.Any = js.native
    def createSequence(originalFn: js.Any, newFn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def createSequence(originalFn: js.Any, newFn: js.Any): js.Any = js.native
    def createSequence(originalFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = js.native
    /** [Method] Creates a throttled version of the passed function which when called repeatedly and rapidly invokes the passed func
      * @param fn Function The function to execute at a regular time interval.
      * @param interval Number The interval, in milliseconds, on which the passed function is executed.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
      * @returns Function A function which invokes the passed function at the specified interval.
      */
    def createThrottled(): js.Any = js.native
    def createThrottled(fn: js.UndefOr[scala.Nothing], interval: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def createThrottled(fn: js.UndefOr[scala.Nothing], interval: Double): js.Any = js.native
    def createThrottled(fn: js.UndefOr[scala.Nothing], interval: Double, scope: js.Any): js.Any = js.native
    def createThrottled(fn: js.Any): js.Any = js.native
    def createThrottled(fn: js.Any, interval: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def createThrottled(fn: js.Any, interval: Double): js.Any = js.native
    def createThrottled(fn: js.Any, interval: Double, scope: js.Any): js.Any = js.native
    /** [Method] Calls this function after the number of milliseconds specified optionally in a specific scope
      * @param fn Function The function to defer.
      * @param millis Number The number of milliseconds for the setTimeout() call. If less than or equal to 0 the function is executed immediately.
      * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the browser window.
      * @param args Array Overrides arguments for the call. Defaults to the arguments passed by the caller.
      * @param appendArgs Boolean/Number if true, args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
      * @returns Number The timeout id that can be used with clearTimeout().
      */
    def defer(): Double = js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array
    ): Double = js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    def defer(fn: js.UndefOr[scala.Nothing], millis: js.UndefOr[scala.Nothing], scope: js.Any): Double = js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.senchaTouch.Ext.Array
    ): Double = js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    def defer(fn: js.UndefOr[scala.Nothing], millis: Double): Double = js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: Double,
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array
    ): Double = js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    def defer(fn: js.UndefOr[scala.Nothing], millis: Double, scope: js.Any): Double = js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: Double,
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    def defer(fn: js.UndefOr[scala.Nothing], millis: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): Double = js.native
    def defer(
      fn: js.UndefOr[scala.Nothing],
      millis: Double,
      scope: js.Any,
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    def defer(fn: js.Any): Double = js.native
    def defer(
      fn: js.Any,
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    def defer(
      fn: js.Any,
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array
    ): Double = js.native
    def defer(
      fn: js.Any,
      millis: js.UndefOr[scala.Nothing],
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    def defer(fn: js.Any, millis: js.UndefOr[scala.Nothing], scope: js.Any): Double = js.native
    def defer(
      fn: js.Any,
      millis: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    def defer(fn: js.Any, millis: js.UndefOr[scala.Nothing], scope: js.Any, args: typings.senchaTouch.Ext.Array): Double = js.native
    def defer(
      fn: js.Any,
      millis: js.UndefOr[scala.Nothing],
      scope: js.Any,
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    def defer(fn: js.Any, millis: Double): Double = js.native
    def defer(
      fn: js.Any,
      millis: Double,
      scope: js.UndefOr[scala.Nothing],
      args: js.UndefOr[scala.Nothing],
      appendArgs: js.Any
    ): Double = js.native
    def defer(fn: js.Any, millis: Double, scope: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array): Double = js.native
    def defer(
      fn: js.Any,
      millis: Double,
      scope: js.UndefOr[scala.Nothing],
      args: typings.senchaTouch.Ext.Array,
      appendArgs: js.Any
    ): Double = js.native
    def defer(fn: js.Any, millis: Double, scope: js.Any): Double = js.native
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: js.UndefOr[scala.Nothing], appendArgs: js.Any): Double = js.native
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): Double = js.native
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): Double = js.native
    /** [Method] A very commonly used method throughout the framework
      * @param fn Function
      * @returns Function flexSetter
      */
    def flexSetter(): js.Any = js.native
    def flexSetter(fn: js.Any): js.Any = js.native
    /** [Method] Adds behavior to an existing method that is executed after the original behavior of the function
      * @param object Object The target object
      * @param methodName String Name of the method to override
      * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
      * @param scope Object The scope to execute the interceptor function. Defaults to the object.
      * @returns Function The new function just created.
      */
    def interceptAfter(): js.Any = js.native
    def interceptAfter(
      `object`: js.UndefOr[scala.Nothing],
      methodName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    def interceptAfter(`object`: js.UndefOr[scala.Nothing], methodName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    def interceptAfter(
      `object`: js.UndefOr[scala.Nothing],
      methodName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): js.Any = js.native
    def interceptAfter(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String): js.Any = js.native
    def interceptAfter(
      `object`: js.UndefOr[scala.Nothing],
      methodName: java.lang.String,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    def interceptAfter(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String, fn: js.Any): js.Any = js.native
    def interceptAfter(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = js.native
    def interceptAfter(`object`: js.Any): js.Any = js.native
    def interceptAfter(
      `object`: js.Any,
      methodName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    def interceptAfter(`object`: js.Any, methodName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    def interceptAfter(`object`: js.Any, methodName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    def interceptAfter(`object`: js.Any, methodName: java.lang.String): js.Any = js.native
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = js.native
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = js.native
    /** [Method] Adds behavior to an existing method that is executed before the original behavior of the function
      * @param object Object The target object
      * @param methodName String Name of the method to override
      * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
      * @param scope Object The scope to execute the interceptor function. Defaults to the object.
      * @returns Function The new function just created.
      */
    def interceptBefore(): js.Any = js.native
    def interceptBefore(
      `object`: js.UndefOr[scala.Nothing],
      methodName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    def interceptBefore(`object`: js.UndefOr[scala.Nothing], methodName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    def interceptBefore(
      `object`: js.UndefOr[scala.Nothing],
      methodName: js.UndefOr[scala.Nothing],
      fn: js.Any,
      scope: js.Any
    ): js.Any = js.native
    def interceptBefore(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String): js.Any = js.native
    def interceptBefore(
      `object`: js.UndefOr[scala.Nothing],
      methodName: java.lang.String,
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    def interceptBefore(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String, fn: js.Any): js.Any = js.native
    def interceptBefore(`object`: js.UndefOr[scala.Nothing], methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = js.native
    def interceptBefore(`object`: js.Any): js.Any = js.native
    def interceptBefore(
      `object`: js.Any,
      methodName: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      scope: js.Any
    ): js.Any = js.native
    def interceptBefore(`object`: js.Any, methodName: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
    def interceptBefore(`object`: js.Any, methodName: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
    def interceptBefore(`object`: js.Any, methodName: java.lang.String): js.Any = js.native
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = js.native
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = js.native
    /** [Method] Create a new function from the provided fn the arguments of which are pre set to args
      * @param fn Function The original function.
      * @param args Array The arguments to pass to new callback.
      * @param scope Object The scope (this reference) in which the function is executed.
      * @returns Function The new callback function.
      */
    def pass(): js.Any = js.native
    def pass(fn: js.UndefOr[scala.Nothing], args: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def pass(fn: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def pass(fn: js.UndefOr[scala.Nothing], args: typings.senchaTouch.Ext.Array, scope: js.Any): js.Any = js.native
    def pass(fn: js.Any): js.Any = js.native
    def pass(fn: js.Any, args: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
    def pass(fn: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = js.native
    def pass(fn: js.Any, args: typings.senchaTouch.Ext.Array, scope: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Inflector extends js.Object {
    /** [Property] (Ext.Class) */
    var self: IClass = js.native
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    def callOverridden(): js.Any = js.native
    def callOverridden(args: js.Any): js.Any = js.native
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    def callParent(): js.Any = js.native
    def callParent(args: js.Any): js.Any = js.native
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    def callSuper(): js.Any = js.native
    def callSuper(args: js.Any): js.Any = js.native
    /** [Method] Returns the correct Model name for a given string
      * @param word String The word to classify
      * @returns String The classified version of the word
      */
    def classify(): java.lang.String = js.native
    def classify(word: java.lang.String): java.lang.String = js.native
    /** [Method] Removes all registered pluralization rules */
    def clearPlurals(): Unit = js.native
    /** [Method] Removes all registered singularization rules */
    def clearSingulars(): Unit = js.native
    /** [Method]  */
    def destroy(): Unit = js.native
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    def getInitialConfig(): js.Any = js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    def initConfig(): js.Any = js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    /** [Method] Returns true if the given word is transnumeral the word is its own singular and plural form  e g
      * @param word String The word to test
      * @returns Boolean True if the word is transnumeral
      */
    def isTransnumeral(): Boolean = js.native
    def isTransnumeral(word: java.lang.String): Boolean = js.native
    /** [Method] Ordinalizes a given number by adding a prefix such as st nd rd or th based on the last digit of the number
      * @param number Number The number to ordinalize
      * @returns String The ordinalized number
      */
    def ordinalize(): java.lang.String = js.native
    def ordinalize(number: Double): java.lang.String = js.native
    /** [Method] Adds a new pluralization rule to the Inflector
      * @param matcher RegExp The matcher regex
      * @param replacer String The replacement string, which can reference matches from the matcher argument
      */
    def plural(): Unit = js.native
    def plural(matcher: js.UndefOr[scala.Nothing], replacer: java.lang.String): Unit = js.native
    def plural(matcher: RegExp): Unit = js.native
    def plural(matcher: RegExp, replacer: java.lang.String): Unit = js.native
    /** [Method] Returns the pluralized form of a word e g
      * @param word String The word to pluralize
      * @returns String The pluralized form of the word
      */
    def pluralize(): java.lang.String = js.native
    def pluralize(word: java.lang.String): java.lang.String = js.native
    /** [Method] Adds a new singularization rule to the Inflector
      * @param matcher RegExp The matcher regex
      * @param replacer String The replacement string, which can reference matches from the matcher argument
      */
    def singular(): Unit = js.native
    def singular(matcher: js.UndefOr[scala.Nothing], replacer: java.lang.String): Unit = js.native
    def singular(matcher: RegExp): Unit = js.native
    def singular(matcher: RegExp, replacer: java.lang.String): Unit = js.native
    /** [Method] Returns the singularized form of a word e g
      * @param word String The word to singularize
      * @returns String The singularized form of the word
      */
    def singularize(): java.lang.String = js.native
    def singularize(word: java.lang.String): java.lang.String = js.native
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
  }
  
  /* static members */
  @js.native
  object InputBlocker extends js.Object {
    /** [Property] (Ext.Class) */
    var self: IClass = js.native
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    def callOverridden(): js.Any = js.native
    def callOverridden(args: js.Any): js.Any = js.native
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    def callParent(): js.Any = js.native
    def callParent(args: js.Any): js.Any = js.native
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    def callSuper(): js.Any = js.native
    def callSuper(args: js.Any): js.Any = js.native
    /** [Method]  */
    def destroy(): Unit = js.native
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    def getInitialConfig(): js.Any = js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    def initConfig(): js.Any = js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
  }
  
  /* static members */
  @js.native
  object JSONP extends js.Object {
    /** [Property] (String) */
    var callbackKey: java.lang.String = js.native
    /** [Property] (Boolean) */
    var disableCaching: Boolean = js.native
    /** [Property] (String) */
    var disableCachingParam: java.lang.String = js.native
    /** [Property] (Ext.Class) */
    var self: IClass = js.native
    /** [Property] (Number) */
    var timeout: Double = js.native
    /** [Method] Abort a request
      * @param request Object/String The request to abort.
      */
    def abort(): Unit = js.native
    def abort(request: js.Any): Unit = js.native
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    def callOverridden(): js.Any = js.native
    def callOverridden(args: js.Any): js.Any = js.native
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    def callParent(): js.Any = js.native
    def callParent(args: js.Any): js.Any = js.native
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    def callSuper(): js.Any = js.native
    def callSuper(args: js.Any): js.Any = js.native
    /** [Method]  */
    def destroy(): Unit = js.native
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    def getInitialConfig(): js.Any = js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    def initConfig(): js.Any = js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    /** [Method] Makes a JSONP request
      * @param options Object An object which may contain the following properties. Note that options will take priority over any defaults that are specified in the class.
      * @returns Object request An object containing the request details.
      */
    def request(): js.Any = js.native
    def request(options: js.Any): js.Any = js.native
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    def statics(): IClass = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    def addMembers(): Unit = js.native
    def addMembers(members: js.Any): Unit = js.native
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    def addStatics(): IBase = js.native
    def addStatics(members: js.Any): IBase = js.native
    /** [Method]
      * @param args Object
      */
    def callParent(): Unit = js.native
    def callParent(args: js.Any): Unit = js.native
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    def create(): js.Any = js.native
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    def createAlias(): Unit = js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    def createAlias(alias: js.Any): Unit = js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    /** [Method] Returns a new point from an object that has x and y properties if that object is not an instance of Ext util Point
      * @param object Object
      * @returns Ext.util.Point
      */
    def from(): IPoint = js.native
    def from(`object`: js.Any): IPoint = js.native
    /** [Method] Returns a new instance of Ext util Point based on the pageX  pageY values of the given event
      * @param e Event The event.
      * @returns Ext.util.Point
      */
    def fromEvent(): IPoint = js.native
    def fromEvent(e: Event): IPoint = js.native
    /** [Method] Returns a new instance of Ext util Point based on the pageX  pageY values of the given touch
      * @param touch Event
      * @returns Ext.util.Point
      */
    def fromTouch(): IPoint = js.native
    def fromTouch(touch: Event): IPoint = js.native
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    def getName(): java.lang.String = js.native
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    def `override`(): IBase = js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
  /* static members */
  @js.native
  object Region extends js.Object {
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    def addMembers(): Unit = js.native
    def addMembers(members: js.Any): Unit = js.native
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    def addStatics(): IBase = js.native
    def addStatics(members: js.Any): IBase = js.native
    /** [Method]
      * @param args Object
      */
    def callParent(): Unit = js.native
    def callParent(args: js.Any): Unit = js.native
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    def create(): js.Any = js.native
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    def createAlias(): Unit = js.native
    def createAlias(alias: js.UndefOr[scala.Nothing], origin: js.Any): Unit = js.native
    def createAlias(alias: js.Any): Unit = js.native
    def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
    /** [Method] Creates new Region from an object  Ext util Region from top 0 right 5 bottom 3 left  1  the above is eq
      * @param o Object An object with top, right, bottom, and left properties.
      * @returns Ext.util.Region The region constructed based on the passed object.
      */
    def from(): IRegion = js.native
    def from(o: js.Any): IRegion = js.native
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    def getName(): java.lang.String = js.native
    /** [Method] Retrieves an Ext util Region for a particular element
      * @param el String/HTMLElement/Ext.Element The element or its ID.
      * @returns Ext.util.Region region
      */
    def getRegion(): IRegion = js.native
    def getRegion(el: js.Any): IRegion = js.native
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    def `override`(): IBase = js.native
    def `override`(members: js.Any): IBase = js.native
  }
  
}

