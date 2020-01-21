package typings.rc

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(name: String): StringDictionary[js.Any] = js.native
  def apply(name: String, defaults: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  def apply(
    name: String,
    defaults: StringDictionary[js.Any],
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: StringDictionary[js.Any]
  ): StringDictionary[js.Any] = js.native
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

