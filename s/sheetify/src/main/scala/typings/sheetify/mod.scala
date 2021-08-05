package typings.sheetify

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(src: String): String = ^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(src: String, filename: String): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(src: String, filename: String, options: StringDictionary[js.Any]): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    src: String,
    filename: String,
    options: StringDictionary[js.Any],
    done: js.Function3[/* err */ Error, /* css */ String, /* prefix */ String, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    src: String,
    filename: String,
    options: Unit,
    done: js.Function3[/* err */ Error, /* css */ String, /* prefix */ String, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(src: String, filename: Unit, options: StringDictionary[js.Any]): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    src: String,
    filename: Unit,
    options: StringDictionary[js.Any],
    done: js.Function3[/* err */ Error, /* css */ String, /* prefix */ String, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    src: String,
    filename: Unit,
    options: Unit,
    done: js.Function3[/* err */ Error, /* css */ String, /* prefix */ String, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(src: String, options: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(src: TemplateStringsArray): String = ^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(src: TemplateStringsArray, filename: String): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(src: TemplateStringsArray, filename: String, options: StringDictionary[js.Any]): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    src: TemplateStringsArray,
    filename: String,
    options: StringDictionary[js.Any],
    done: js.Function3[/* err */ Error, /* css */ String, /* prefix */ String, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    src: TemplateStringsArray,
    filename: String,
    options: Unit,
    done: js.Function3[/* err */ Error, /* css */ String, /* prefix */ String, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(src: TemplateStringsArray, filename: Unit, options: StringDictionary[js.Any]): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    src: TemplateStringsArray,
    filename: Unit,
    options: StringDictionary[js.Any],
    done: js.Function3[/* err */ Error, /* css */ String, /* prefix */ String, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    src: TemplateStringsArray,
    filename: Unit,
    options: Unit,
    done: js.Function3[/* err */ Error, /* css */ String, /* prefix */ String, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(src: TemplateStringsArray, options: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sheetify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPrefix(css: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefix")(css.asInstanceOf[js.Any]).asInstanceOf[String]
}
