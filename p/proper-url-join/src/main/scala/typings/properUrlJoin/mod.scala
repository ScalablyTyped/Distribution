package typings.properUrlJoin

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.properUrlJoin.properUrlJoinStrings.keep
import typings.queryString.mod.StringifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("proper-url-join", JSImport.Default)
  @js.native
  val default: urlJoin = js.native
  
  trait Options extends StObject {
    
    /**
      * Add a leading slash.
      *
      * **Default**: `true`
      */
    var leadingSlash: js.UndefOr[Boolean | keep] = js.undefined
    
    /**
      * Protocol relative URLs.
      *
      * **Default**: `false`
      */
    var protocolRelative: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Query string object that will be properly stringified and appended to the url.
      * It will be merged with the query string in the url, if it exists.
      */
    var query: js.UndefOr[StringDictionary[String | Double | (js.Array[String | Double])]] = js.undefined
    
    /**
      * [query-string](https://github.com/sindresorhus/query-string#stringifyobject-options) singify method options to be considered when stringifying the query.
      */
    var queryOptions: js.UndefOr[StringifyOptions] = js.undefined
    
    /**
      * Add a trailing slash.
      *
      * **Default**: `false`
      */
    var trailingSlash: js.UndefOr[Boolean | keep] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLeadingSlash(value: Boolean | keep): Self = StObject.set(x, "leadingSlash", value.asInstanceOf[js.Any])
      
      inline def setLeadingSlashUndefined: Self = StObject.set(x, "leadingSlash", js.undefined)
      
      inline def setProtocolRelative(value: Boolean): Self = StObject.set(x, "protocolRelative", value.asInstanceOf[js.Any])
      
      inline def setProtocolRelativeUndefined: Self = StObject.set(x, "protocolRelative", js.undefined)
      
      inline def setQuery(value: StringDictionary[String | Double | (js.Array[String | Double])]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryOptions(value: StringifyOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
      
      inline def setQueryOptionsUndefined: Self = StObject.set(x, "queryOptions", js.undefined)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setTrailingSlash(value: Boolean | keep): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
      
      inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
    }
  }
  
  type PathArg = js.UndefOr[String | Null | Double]
  
  type _To = urlJoin
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: urlJoin = default
  
  @js.native
  trait urlJoin extends StObject {
    
    def apply(p1: PathArg): String = js.native
    def apply(p1: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg): String = js.native
    def apply(p1: PathArg, p2: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, p5: PathArg): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, p5: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, p5: PathArg, p6: PathArg): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, p5: PathArg, p6: PathArg, options: Options): String = js.native
    def apply(p1: PathArg, p2: PathArg, p3: PathArg, p4: PathArg, p5: PathArg, p6: PathArg, p7: PathArg): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      options: Options
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      options: Options
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      p9: PathArg
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      p9: PathArg,
      options: Options
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      p9: PathArg,
      p10: PathArg
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      p9: PathArg,
      p10: PathArg,
      options: Options
    ): String = js.native
    def apply(
      p1: PathArg,
      p2: PathArg,
      p3: PathArg,
      p4: PathArg,
      p5: PathArg,
      p6: PathArg,
      p7: PathArg,
      p8: PathArg,
      p9: PathArg,
      p10: PathArg,
      p11: PathArg,
      args: (PathArg | Options)*
    ): String = js.native
  }
}
