package typings.rc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(name: String): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def apply(name: String, defaults: StringDictionary[js.Any]): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def apply(
    name: String,
    defaults: StringDictionary[js.Any],
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: StringDictionary[js.Any]
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def apply(
    name: String,
    defaults: StringDictionary[js.Any],
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: StringDictionary[js.Any],
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, StringDictionary[js.Any]]
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def apply(
    name: String,
    defaults: StringDictionary[js.Any],
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Null,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, StringDictionary[js.Any]]
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def apply(
    name: String,
    defaults: StringDictionary[js.Any],
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Unit,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, StringDictionary[js.Any]]
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def apply(
    name: String,
    defaults: Unit,
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: StringDictionary[js.Any]
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def apply(
    name: String,
    defaults: Unit,
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: StringDictionary[js.Any],
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, StringDictionary[js.Any]]
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def apply(
    name: String,
    defaults: Unit,
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Null,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, StringDictionary[js.Any]]
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def apply(
    name: String,
    defaults: Unit,
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Unit,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, StringDictionary[js.Any]]
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  @JSImport("rc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
