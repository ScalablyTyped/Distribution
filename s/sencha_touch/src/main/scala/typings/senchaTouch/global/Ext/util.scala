package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.util.IPoint
import typings.senchaTouch.Ext.util.IRegion
import typings.std.Event
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSGlobal("Ext.util.Audio")
  @js.native
  class Audio ()
    extends StObject
       with typings.senchaTouch.Ext.util.Audio
  /* static members */
  object Audio {
    
    @JSGlobal("Ext.util.Audio")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @scala.inline
    def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    @scala.inline
    def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @scala.inline
    def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    @scala.inline
    def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @scala.inline
    def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    @scala.inline
    def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method]  */
    @scala.inline
    def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @scala.inline
    def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    @scala.inline
    def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.Audio.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.util.Format")
  @js.native
  class Format ()
    extends StObject
       with typings.senchaTouch.Ext.util.Format
  /* static members */
  object Format {
    
    @JSGlobal("Ext.util.Format")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @scala.inline
    def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    @scala.inline
    def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @scala.inline
    def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    @scala.inline
    def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @scala.inline
    def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    @scala.inline
    def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Parse a value into a formatted date using the specified format pattern
      * @param value String/Date The value to format. Strings must conform to the format expected by the JavaScript Date object's parse() method.
      * @param format String Any valid date format string.
      * @returns String The formatted date string.
      */
    @scala.inline
    def date(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[java.lang.String]
    @scala.inline
    def date(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def date(value: js.Any, format: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def date(value: Unit, format: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Property] (String) */
    @JSGlobal("Ext.util.Format.defaultDateFormat")
    @js.native
    def defaultDateFormat: java.lang.String = js.native
    @scala.inline
    def defaultDateFormat_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDateFormat")(x.asInstanceOf[js.Any])
    
    /** [Method]  */
    @scala.inline
    def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Truncate a string and add an ellipsis  to the end if it exceeds the specified length
      * @param value String The string to truncate.
      * @param length Number The maximum length to allow before truncating.
      * @param word Boolean True to try to find a common word break.
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
      * @param str String
      * @returns String
      */
    @scala.inline
    def escapeRegex(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")().asInstanceOf[java.lang.String]
    @scala.inline
    def escapeRegex(str: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Allows you to define a tokenized string and pass an arbitrary number of arguments to replace the tokens
      * @param string String The tokenized string to be formatted.
      * @param values String... The values to replace token {0}, {1}, etc.
      * @returns String The formatted string.
      */
    @scala.inline
    def format(string: java.lang.String, values: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(string.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
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
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @scala.inline
    def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    @scala.inline
    def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Pads the left side of a string with a specified character
      * @param string String The original string.
      * @param size Number The total length of the output string.
      * @param char String The character with which to pad the original string.
      * @returns String The padded string.
      */
    @scala.inline
    def leftPad(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")().asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: java.lang.String, size: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: java.lang.String, size: Double, char: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: java.lang.String, size: Unit, char: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: Unit, size: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: Unit, size: Double, char: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def leftPad(string: Unit, size: Unit, char: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], size.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    /** [Property] (Array) */
    @JSGlobal("Ext.util.Format.potentialUndefinedKeys")
    @js.native
    def potentialUndefinedKeys: typings.senchaTouch.Ext.Array = js.native
    @scala.inline
    def potentialUndefinedKeys_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("potentialUndefinedKeys")(x.asInstanceOf[js.Any])
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.Format.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Method] Utility function that allows you to easily switch a string between two alternating values
      * @param string String The current string
      * @param value String The value to compare to the current string
      * @param other String The new value to use if the string already equals the first value passed in
      * @returns String The new value
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
  }
  
  @JSGlobal("Ext.util.Functions")
  @js.native
  class Functions ()
    extends StObject
       with typings.senchaTouch.Ext.util.Functions
  /* static members */
  object Functions {
    
    @JSGlobal("Ext.util.Functions")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Create an alias to the provided method property with name methodName of object
      * @param object Object/Function
      * @param methodName String
      * @returns Function aliasFn
      */
    @scala.inline
    def alias(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")().asInstanceOf[js.Any]
    @scala.inline
    def alias(`object`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def alias(`object`: js.Any, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def alias(`object`: Unit, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alias")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Create a new function from the provided fn change this to the provided scope optionally overrides arguments for the
      * @param fn Function The function to delegate.
      * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the browser window.
      * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if true args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
      * @returns Function The new function.
      */
    @scala.inline
    def bind(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")().asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: js.Any, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def bind(fn: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def clone(method: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(method.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Creates a delegate function optionally with a bound scope which when called buffers the execution of the passed fu
      * @param fn Function The function to invoke on a buffered timer.
      * @param buffer Number The number of milliseconds by which to buffer the invocation of the function.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
      * @param args Array Override arguments for the call. Defaults to the arguments passed by the caller.
      * @returns Function A function which invokes the passed function after buffering for the specified time.
      */
    @scala.inline
    def createBuffered(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")().asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Double, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: js.Any, buffer: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Double, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createBuffered(fn: Unit, buffer: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuffered")(fn.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Creates a delegate callback which when called executes after a specific delay
      * @param fn Function The function which will be called on a delay when the returned function is called. Optionally, a replacement (or additional) argument list may be specified.
      * @param delay Number The number of milliseconds to defer execution by whenever called.
      * @param scope Object The scope (this reference) used by the function at execution time.
      * @param args Array Override arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if True args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
      * @returns Function A function which, when called, executes the original function after the specified delay.
      */
    @scala.inline
    def createDelayed(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")().asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Double, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: js.Any, delay: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Double, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelayed(fn: Unit, delay: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelayed")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Create a new function from the provided fn change this to the provided scope optionally overrides arguments for the
      * @param fn Function The function to delegate.
      * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the browser window.
      * @param args Array Overrides arguments for the call. (Defaults to the arguments passed by the caller)
      * @param appendArgs Boolean/Number if true args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
      * @returns Function The new function.
      */
    @scala.inline
    def createDelegate(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")().asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: js.Any, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: js.Any, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: js.Any, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: js.Any, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: js.Any, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: js.Any, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: Unit, scope: Unit, args: Unit, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createDelegate(fn: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Creates an interceptor function
      * @param origFn Function The original function.
      * @param newFn Function The function to call before the original.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the browser window.
      * @param returnValue Object The value to return if the passed function return false.
      * @returns Function The new function.
      */
    @scala.inline
    def createInterceptor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")().asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: js.Any, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: Unit, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: js.Any, newFn: Unit, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: js.Any, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: js.Any, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: Unit, scope: js.Any, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createInterceptor(origFn: Unit, newFn: Unit, scope: Unit, returnValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterceptor")(origFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Create a combined function call sequence of the original function  the passed function
      * @param originalFn Function The original function.
      * @param newFn Function The function to sequence.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope in which the original function is called or the browser window.
      * @returns Function The new function.
      */
    @scala.inline
    def createSequence(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")().asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: js.Any, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: js.Any, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: js.Any, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: Unit, newFn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: Unit, newFn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createSequence(originalFn: Unit, newFn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(originalFn.asInstanceOf[js.Any], newFn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Creates a throttled version of the passed function which when called repeatedly and rapidly invokes the passed func
      * @param fn Function The function to execute at a regular time interval.
      * @param interval Number The interval, in milliseconds, on which the passed function is executed.
      * @param scope Object The scope (this reference) in which the passed function is executed. If omitted, defaults to the scope specified by the caller.
      * @returns Function A function which invokes the passed function at the specified interval.
      */
    @scala.inline
    def createThrottled(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")().asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: js.Any, interval: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: js.Any, interval: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: js.Any, interval: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: Unit, interval: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: Unit, interval: Double, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def createThrottled(fn: Unit, interval: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createThrottled")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Calls this function after the number of milliseconds specified optionally in a specific scope
      * @param fn Function The function to defer.
      * @param millis Number The number of milliseconds for the setTimeout() call. If less than or equal to 0 the function is executed immediately.
      * @param scope Object The scope (this reference) in which the function is executed. If omitted, defaults to the browser window.
      * @param args Array Overrides arguments for the call. Defaults to the arguments passed by the caller.
      * @param appendArgs Boolean/Number if true, args are appended to call args instead of overriding, if a number the args are inserted at the specified position.
      * @returns Number The timeout id that can be used with clearTimeout().
      */
    @scala.inline
    def defer(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: Unit, args: typings.senchaTouch.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Double, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: js.Any, millis: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: Unit, args: typings.senchaTouch.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Double, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: js.Any, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: js.Any, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: Unit, args: Unit, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def defer(fn: Unit, millis: Unit, scope: Unit, args: typings.senchaTouch.Ext.Array, appendArgs: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defer")(fn.asInstanceOf[js.Any], millis.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], args.asInstanceOf[js.Any], appendArgs.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** [Method] A very commonly used method throughout the framework
      * @param fn Function
      * @returns Function flexSetter
      */
    @scala.inline
    def flexSetter(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flexSetter")().asInstanceOf[js.Any]
    @scala.inline
    def flexSetter(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flexSetter")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Adds behavior to an existing method that is executed after the original behavior of the function
      * @param object Object The target object
      * @param methodName String Name of the method to override
      * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
      * @param scope Object The scope to execute the interceptor function. Defaults to the object.
      * @returns Function The new function just created.
      */
    @scala.inline
    def interceptAfter(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")().asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: js.Any, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptAfter(`object`: Unit, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptAfter")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Adds behavior to an existing method that is executed before the original behavior of the function
      * @param object Object The target object
      * @param methodName String Name of the method to override
      * @param fn Function Function with the new behavior. It will be called with the same arguments as the original method. The return value of this function will be the return value of the new method.
      * @param scope Object The scope to execute the interceptor function. Defaults to the object.
      * @returns Function The new function just created.
      */
    @scala.inline
    def interceptBefore(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")().asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: js.Any, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: java.lang.String, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: Unit, fn: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: Unit, fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def interceptBefore(`object`: Unit, methodName: Unit, fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptBefore")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /** [Method] Create a new function from the provided fn the arguments of which are pre set to args
      * @param fn Function The original function.
      * @param args Array The arguments to pass to new callback.
      * @param scope Object The scope (this reference) in which the function is executed.
      * @returns Function The new callback function.
      */
    @scala.inline
    def pass(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pass")().asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: js.Any, args: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: js.Any, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: js.Any, args: typings.senchaTouch.Ext.Array, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: Unit, args: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: Unit, args: typings.senchaTouch.Ext.Array): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def pass(fn: Unit, args: typings.senchaTouch.Ext.Array, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pass")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @JSGlobal("Ext.util.Inflector")
  @js.native
  class Inflector ()
    extends StObject
       with typings.senchaTouch.Ext.util.Inflector
  /* static members */
  object Inflector {
    
    @JSGlobal("Ext.util.Inflector")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @scala.inline
    def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    @scala.inline
    def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @scala.inline
    def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    @scala.inline
    def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @scala.inline
    def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    @scala.inline
    def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns the correct Model name for a given string
      * @param word String The word to classify
      * @returns String The classified version of the word
      */
    @scala.inline
    def classify(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("classify")().asInstanceOf[java.lang.String]
    @scala.inline
    def classify(word: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("classify")(word.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Removes all registered pluralization rules */
    @scala.inline
    def clearPlurals(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPlurals")().asInstanceOf[Unit]
    
    /** [Method] Removes all registered singularization rules */
    @scala.inline
    def clearSingulars(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSingulars")().asInstanceOf[Unit]
    
    /** [Method]  */
    @scala.inline
    def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @scala.inline
    def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    @scala.inline
    def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Returns true if the given word is transnumeral the word is its own singular and plural form  e g
      * @param word String The word to test
      * @returns Boolean True if the word is transnumeral
      */
    @scala.inline
    def isTransnumeral(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransnumeral")().asInstanceOf[Boolean]
    @scala.inline
    def isTransnumeral(word: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransnumeral")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** [Method] Ordinalizes a given number by adding a prefix such as st nd rd or th based on the last digit of the number
      * @param number Number The number to ordinalize
      * @returns String The ordinalized number
      */
    @scala.inline
    def ordinalize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinalize")().asInstanceOf[java.lang.String]
    @scala.inline
    def ordinalize(number: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinalize")(number.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Adds a new pluralization rule to the Inflector
      * @param matcher RegExp The matcher regex
      * @param replacer String The replacement string, which can reference matches from the matcher argument
      */
    @scala.inline
    def plural(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plural")().asInstanceOf[Unit]
    @scala.inline
    def plural(matcher: Unit, replacer: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(matcher.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def plural(matcher: RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plural")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def plural(matcher: RegExp, replacer: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plural")(matcher.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns the pluralized form of a word e g
      * @param word String The word to pluralize
      * @returns String The pluralized form of the word
      */
    @scala.inline
    def pluralize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")().asInstanceOf[java.lang.String]
    @scala.inline
    def pluralize(word: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(word.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.Inflector.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Adds a new singularization rule to the Inflector
      * @param matcher RegExp The matcher regex
      * @param replacer String The replacement string, which can reference matches from the matcher argument
      */
    @scala.inline
    def singular(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("singular")().asInstanceOf[Unit]
    @scala.inline
    def singular(matcher: Unit, replacer: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("singular")(matcher.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def singular(matcher: RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("singular")(matcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def singular(matcher: RegExp, replacer: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("singular")(matcher.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns the singularized form of a word e g
      * @param word String The word to singularize
      * @returns String The singularized form of the word
      */
    @scala.inline
    def singularize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("singularize")().asInstanceOf[java.lang.String]
    @scala.inline
    def singularize(word: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("singularize")(word.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.util.InputBlocker")
  @js.native
  class InputBlocker ()
    extends StObject
       with typings.senchaTouch.Ext.util.InputBlocker
  /* static members */
  object InputBlocker {
    
    @JSGlobal("Ext.util.InputBlocker")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @scala.inline
    def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    @scala.inline
    def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @scala.inline
    def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    @scala.inline
    def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @scala.inline
    def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    @scala.inline
    def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method]  */
    @scala.inline
    def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @scala.inline
    def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    @scala.inline
    def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.InputBlocker.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  }
  
  @JSGlobal("Ext.util.JSONP")
  @js.native
  class JSONP ()
    extends StObject
       with typings.senchaTouch.Ext.util.JSONP
  /* static members */
  object JSONP {
    
    @JSGlobal("Ext.util.JSONP")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Abort a request
      * @param request Object/String The request to abort.
      */
    @scala.inline
    def abort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")().asInstanceOf[Unit]
    @scala.inline
    def abort(request: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @scala.inline
    def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
    @scala.inline
    def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @scala.inline
    def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
    @scala.inline
    def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @scala.inline
    def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
    @scala.inline
    def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (String) */
    @JSGlobal("Ext.util.JSONP.callbackKey")
    @js.native
    def callbackKey: java.lang.String = js.native
    @scala.inline
    def callbackKey_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callbackKey")(x.asInstanceOf[js.Any])
    
    /** [Method]  */
    @scala.inline
    def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** [Property] (Boolean) */
    @JSGlobal("Ext.util.JSONP.disableCaching")
    @js.native
    def disableCaching: Boolean = js.native
    
    /** [Property] (String) */
    @JSGlobal("Ext.util.JSONP.disableCachingParam")
    @js.native
    def disableCachingParam: java.lang.String = js.native
    @scala.inline
    def disableCachingParam_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCachingParam")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def disableCaching_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(x.asInstanceOf[js.Any])
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @scala.inline
    def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
    @scala.inline
    def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @scala.inline
    def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
    @scala.inline
    def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Method] Makes a JSONP request
      * @param options Object An object which may contain the following properties. Note that options will take priority over any defaults that are specified in the class.
      * @returns Object request An object containing the request details.
      */
    @scala.inline
    def request(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("request")().asInstanceOf[js.Any]
    @scala.inline
    def request(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.util.JSONP.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @scala.inline
    def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
    
    /** [Property] (Number) */
    @JSGlobal("Ext.util.JSONP.timeout")
    @js.native
    def timeout: Double = js.native
    @scala.inline
    def timeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Ext.util.Point")
  @js.native
  class Point ()
    extends StObject
       with typings.senchaTouch.Ext.util.Point
  /* static members */
  object Point {
    
    @JSGlobal("Ext.util.Point")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @scala.inline
    def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    @scala.inline
    def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @scala.inline
    def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    @scala.inline
    def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method]
      * @param args Object
      */
    @scala.inline
    def callParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Unit]
    @scala.inline
    def callParent(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @scala.inline
    def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @scala.inline
    def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Returns a new point from an object that has x and y properties if that object is not an instance of Ext util Point
      * @param object Object
      * @returns Ext.util.Point
      */
    @scala.inline
    def from(): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[IPoint]
    @scala.inline
    def from(`object`: js.Any): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(`object`.asInstanceOf[js.Any]).asInstanceOf[IPoint]
    
    /** [Method] Returns a new instance of Ext util Point based on the pageX  pageY values of the given event
      * @param e Event The event.
      * @returns Ext.util.Point
      */
    @scala.inline
    def fromEvent(): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")().asInstanceOf[IPoint]
    @scala.inline
    def fromEvent(e: Event): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(e.asInstanceOf[js.Any]).asInstanceOf[IPoint]
    
    /** [Method] Returns a new instance of Ext util Point based on the pageX  pageY values of the given touch
      * @param touch Event
      * @returns Ext.util.Point
      */
    @scala.inline
    def fromTouch(): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTouch")().asInstanceOf[IPoint]
    @scala.inline
    def fromTouch(touch: Event): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTouch")(touch.asInstanceOf[js.Any]).asInstanceOf[IPoint]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @scala.inline
    def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @scala.inline
    def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    @scala.inline
    def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
  
  @JSGlobal("Ext.util.Region")
  @js.native
  class Region ()
    extends StObject
       with typings.senchaTouch.Ext.util.Region
  /* static members */
  object Region {
    
    @JSGlobal("Ext.util.Region")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Add methods  properties to the prototype of this class
      * @param members Object
      */
    @scala.inline
    def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
    @scala.inline
    def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Add  override static properties of this class
      * @param members Object
      * @returns Ext.Base this
      */
    @scala.inline
    def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
    @scala.inline
    def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
    
    /** [Method]
      * @param args Object
      */
    @scala.inline
    def callParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Unit]
    @scala.inline
    def callParent(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** [Method] Create a new instance of this Class
      * @returns Object the created instance.
      */
    @scala.inline
    def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
    
    /** [Method] Create aliases for existing prototype methods
      * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
      * @param origin String/Object The original method name
      */
    @scala.inline
    def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** [Method] Creates new Region from an object  Ext util Region from top 0 right 5 bottom 3 left  1  the above is eq
      * @param o Object An object with top, right, bottom, and left properties.
      * @returns Ext.util.Region The region constructed based on the passed object.
      */
    @scala.inline
    def from(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[IRegion]
    @scala.inline
    def from(o: js.Any): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(o.asInstanceOf[js.Any]).asInstanceOf[IRegion]
    
    /** [Method] Get the current class name in string format
      * @returns String className
      */
    @scala.inline
    def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
    
    /** [Method] Retrieves an Ext util Region for a particular element
      * @param el String/HTMLElement/Ext.Element The element or its ID.
      * @returns Ext.util.Region region
      */
    @scala.inline
    def getRegion(): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegion")().asInstanceOf[IRegion]
    @scala.inline
    def getRegion(el: js.Any): IRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegion")(el.asInstanceOf[js.Any]).asInstanceOf[IRegion]
    
    /** [Method] Override members of this class
      * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
      * @returns Ext.Base this class
      */
    @scala.inline
    def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
    @scala.inline
    def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  }
}
