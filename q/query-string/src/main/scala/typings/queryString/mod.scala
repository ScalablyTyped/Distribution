package typings.queryString

import typings.queryString.anon.parseBooleanstrueParseOpt
import typings.queryString.anon.parseBooleanstrueParseOptArrayFormat
import typings.queryString.anon.parseBooleanstrueparseNum
import typings.queryString.anon.parseBooleanstrueparseNumArrayFormat
import typings.queryString.anon.parseNumberstrueParseOpti
import typings.queryString.anon.parseNumberstrueParseOptiArrayFormat
import typings.queryString.baseMod.ParseOptions
import typings.queryString.baseMod.ParsedQuery
import typings.queryString.baseMod.ParsedUrl
import typings.queryString.baseMod.StringifyOptions
import typings.queryString.baseMod.UrlObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("query-string", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def exclude(url: String, filter: js.Function2[/* key */ String, Boolean | Double | String, Boolean]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(url.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def exclude(
      url: String,
      filter: js.Function2[/* key */ String, /* value */ String | Boolean, Boolean],
      options: parseBooleanstrueParseOptArrayFormat
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(url.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def exclude(
      url: String,
      filter: js.Function2[/* key */ String, /* value */ String | Boolean | Double, Boolean],
      options: parseBooleanstrueparseNumArrayFormat
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(url.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def exclude(
      url: String,
      filter: js.Function2[/* key */ String, /* value */ String | Double, Boolean],
      options: parseNumberstrueParseOptiArrayFormat
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(url.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def exclude(url: String, keys: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(url.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def exclude(url: String, keys: js.Array[String], options: ParseOptions & StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(url.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def extract(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parse(query: String): ParsedQuery[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(query.asInstanceOf[js.Any]).asInstanceOf[ParsedQuery[String]]
    inline def parse(query: String, options: parseBooleanstrueParseOpt): ParsedQuery[String | Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedQuery[String | Boolean]]
    inline def parse(query: String, options: parseBooleanstrueparseNum): ParsedQuery[String | Boolean | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedQuery[String | Boolean | Double]]
    inline def parse(query: String, options: parseNumberstrueParseOpti): ParsedQuery[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedQuery[String | Double]]
    inline def parse(query: String, options: ParseOptions): ParsedQuery[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedQuery[String]]
    
    inline def parseUrl(url: String): ParsedUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[ParsedUrl]
    inline def parseUrl(url: String, options: ParseOptions): ParsedUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedUrl]
    
    inline def pick(url: String, filter: js.Function2[/* key */ String, Boolean | Double | String, Boolean]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(url.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pick(
      url: String,
      filter: js.Function2[/* key */ String, /* value */ String | Boolean, Boolean],
      options: parseBooleanstrueParseOptArrayFormat
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(url.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pick(
      url: String,
      filter: js.Function2[/* key */ String, /* value */ String | Boolean | Double, Boolean],
      options: parseBooleanstrueparseNumArrayFormat
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(url.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pick(
      url: String,
      filter: js.Function2[/* key */ String, /* value */ String | Double, Boolean],
      options: parseNumberstrueParseOptiArrayFormat
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(url.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pick(url: String, keys: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(url.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pick(url: String, keys: js.Array[String], options: ParseOptions & StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(url.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def stringify(
      // TODO: Use the below instead when the following TS issues are fixed:
    // - https://github.com/microsoft/TypeScript/issues/15300
    // - https://github.com/microsoft/TypeScript/issues/42021
    // Context: https://github.com/sindresorhus/query-string/issues/298
    // object: StringifiableRecord,
    `object`: Record[String, Any]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(
      // TODO: Use the below instead when the following TS issues are fixed:
    // - https://github.com/microsoft/TypeScript/issues/15300
    // - https://github.com/microsoft/TypeScript/issues/42021
    // Context: https://github.com/sindresorhus/query-string/issues/298
    // object: StringifiableRecord,
    `object`: Record[String, Any],
      options: StringifyOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def stringifyUrl(`object`: UrlObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyUrl")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringifyUrl(`object`: UrlObject, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyUrl")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
