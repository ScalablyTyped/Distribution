package typings.qs

import org.scalablytyped.runtime.StringDictionary
import typings.qs.anon.IParseOptionsdecodernever
import typings.qs.mod.IParseOptions
import typings.qs.mod.IStringifyOptions
import typings.qs.mod.ParsedQs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object qs {
    
    @JSGlobal("qs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(str: String): ParsedQs = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[ParsedQs]
    inline def parse(str: String, options: IParseOptionsdecodernever): ParsedQs = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedQs]
    inline def parse(str: String, options: IParseOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    inline def parse(str: Record[String, String]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def parse(str: Record[String, String], options: IParseOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    inline def parse_StringDictionary(str: String): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    
    inline def stringify(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(obj: Any, options: IStringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
