package typings.rc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc", JSImport.Namespace)
  @js.native
  def apply(name: String): StringDictionary[js.Any] = js.native
  @JSImport("rc", JSImport.Namespace)
  @js.native
  def apply(
    name: String,
    defaults: js.UndefOr[scala.Nothing],
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: js.UndefOr[scala.Nothing],
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  @JSImport("rc", JSImport.Namespace)
  @js.native
  def apply(
    name: String,
    defaults: js.UndefOr[scala.Nothing],
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: StringDictionary[js.Any]
  ): StringDictionary[js.Any] = js.native
  @JSImport("rc", JSImport.Namespace)
  @js.native
  def apply(
    name: String,
    defaults: js.UndefOr[scala.Nothing],
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
  parse: js.Function1[/* content */ String, StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  @JSImport("rc", JSImport.Namespace)
  @js.native
  def apply(
    name: String,
    defaults: js.UndefOr[scala.Nothing],
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
  parse: js.Function1[/* content */ String, StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  @JSImport("rc", JSImport.Namespace)
  @js.native
  def apply(name: String, defaults: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  @JSImport("rc", JSImport.Namespace)
  @js.native
  def apply(
    name: String,
    defaults: StringDictionary[js.Any],
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: js.UndefOr[scala.Nothing],
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  @JSImport("rc", JSImport.Namespace)
  @js.native
  def apply(
    name: String,
    defaults: StringDictionary[js.Any],
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: StringDictionary[js.Any]
  ): StringDictionary[js.Any] = js.native
  @JSImport("rc", JSImport.Namespace)
  @js.native
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
  parse: js.Function1[/* content */ String, StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  @JSImport("rc", JSImport.Namespace)
  @js.native
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
  parse: js.Function1[/* content */ String, StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
}
