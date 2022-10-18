package typings.rc

import typings.minimist.mod.ParsedArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String
  ): RcResultType & ParsedArgs = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[RcResultType & ParsedArgs]
  inline def apply(
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: String
  ): RcResultType & ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[RcResultType & ParsedArgs]
  inline def apply(
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: String,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Null,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): RcResultType & ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[RcResultType & ParsedArgs]
  inline def apply(
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: String,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Unit,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): RcResultType & ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[RcResultType & ParsedArgs]
  inline def apply(
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: Null,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Null,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): RcResultType & ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[RcResultType & ParsedArgs]
  inline def apply(
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: Null,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Unit,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): RcResultType & ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[RcResultType & ParsedArgs]
  inline def apply(
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: Unit,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Null,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): RcResultType & ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[RcResultType & ParsedArgs]
  inline def apply(
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: Unit,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Unit,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): RcResultType & ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[RcResultType & ParsedArgs]
  inline def apply[T /* <: js.Object */](
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: T
  ): T & RcResultType & ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[T & RcResultType & ParsedArgs]
  inline def apply[T /* <: js.Object */](
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: T,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Null,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): T & RcResultType & ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[T & RcResultType & ParsedArgs]
  inline def apply[T /* <: js.Object */](
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: T,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: Unit,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): T & RcResultType & ParsedArgs = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[T & RcResultType & ParsedArgs]
  inline def apply[U /* <: js.Object */](
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: String,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: U
  ): U & RcResultType = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[U & RcResultType]
  inline def apply[U /* <: js.Object */](
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: String,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: U,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): U & RcResultType = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[U & RcResultType]
  inline def apply[U /* <: js.Object */](
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: Null,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: U
  ): U & RcResultType = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[U & RcResultType]
  inline def apply[U /* <: js.Object */](
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: Null,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: U,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): U & RcResultType = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[U & RcResultType]
  inline def apply[U /* <: js.Object */](
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: Unit,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: U
  ): U & RcResultType = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[U & RcResultType]
  inline def apply[U /* <: js.Object */](
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: Unit,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: U,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): U & RcResultType = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[U & RcResultType]
  inline def apply[T /* <: js.UndefOr[js.Object | String | Null] */, U /* <: js.UndefOr[js.Object | Null] */](
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: T,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: U
  ): /* import warning: importer.ImportType#apply Failed type conversion: T extends string | null | undefined ? U extends null | undefined ? minimist.minimist.ParsedArgs : U & rc.rc.RcResultType : T & U extends null | undefined ? minimist.minimist.ParsedArgs : U & rc.rc.RcResultType */ js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends string | null | undefined ? U extends null | undefined ? minimist.minimist.ParsedArgs : U & rc.rc.RcResultType : T & U extends null | undefined ? minimist.minimist.ParsedArgs : U & rc.rc.RcResultType */ js.Any]
  inline def apply[T /* <: js.UndefOr[js.Object | String | Null] */, U /* <: js.UndefOr[js.Object | Null] */](
    /**
    * The name of the app to configure, rc will search for this files :
    * `/etc/${name}/config`,
    * `/etc/${name}rc`,
    * `~/.config/${name}/config`,
    * `~/.config/${name}`,
    * `~/.${name}/config`,
    * `~/.${name}rc` and
    * `.${name}rc` in CWD and its ancestors
    */
  name: String,
    /**
    * Default config values.
    * Can be an Object that contains the default values for the config,
    * the path of a JSON or INI file to use as default config or
    * can be `null` or `undefined` for no default values
    */
  defaults: T,
    /**
    * Parsed argv object.
    * For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: U,
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file, should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ String, js.Object]
  ): /* import warning: importer.ImportType#apply Failed type conversion: T extends string | null | undefined ? U extends null | undefined ? minimist.minimist.ParsedArgs : U & rc.rc.RcResultType : T & U extends null | undefined ? minimist.minimist.ParsedArgs : U & rc.rc.RcResultType */ js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], argv.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends string | null | undefined ? U extends null | undefined ? minimist.minimist.ParsedArgs : U & rc.rc.RcResultType : T & U extends null | undefined ? minimist.minimist.ParsedArgs : U & rc.rc.RcResultType */ js.Any]
  
  @JSImport("rc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in number | string | symbol ]: unknown} */ trait RcResultType extends StObject {
    
    /**
      * same as RcResultType.configs[RcResultType.configs.length - 1]
      */
    var config: js.UndefOr[String] = js.undefined
    
    /**
      * Contains file path of all parsed configurations from different sources
      * like '/etc/${appname}rc', '/etc/${appname}/config', and other.
      */
    var configs: js.UndefOr[js.Array[String]] = js.undefined
  }
  object RcResultType {
    
    inline def apply(): RcResultType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RcResultType]
    }
    
    extension [Self <: RcResultType](x: Self) {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setConfigs(value: js.Array[String]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      inline def setConfigsVarargs(value: String*): Self = StObject.set(x, "configs", js.Array(value*))
    }
  }
}
