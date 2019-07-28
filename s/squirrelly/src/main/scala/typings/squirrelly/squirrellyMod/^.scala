package typings.squirrelly.squirrellyMod

import typings.squirrelly.squirrellyStrings.clear
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("squirrelly", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Compile(str: String): SqrlFn = js.native
  def Render(template: String, options: TemplateOptions): String = js.native
  def Render(template: SqrlFn, options: TemplateOptions): String = js.native
  def __express(filePath: String, options: TemplateOptions, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def autoEscaping[T /* <: Boolean */](bool: T): T = js.native
  def defaultTags(tagArray: js.Array[String]): Unit = js.native
  def defineFilter(name: String, callback: js.Function1[/* str */ String, String]): Unit = js.native
  def defineHelper(
    name: String,
    callback: js.Function3[
      /* args */ js.Array[String], 
      /* content */ js.Function0[String], 
      /* blocks */ Blocks, 
      String
    ]
  ): Unit = js.native
  def defineNativeHelper(name: String, obj: NativeHelper): Unit = js.native
  def definePartial(name: String, str: String): Unit = js.native
  def load(options: Options): SqrlFn = js.native
  def load(options: Options, str: String): SqrlFn = js.native
  def renderFile(filePath: String, options: TemplateOptions): String = js.native
  def setDefaultFilters(obj: Record[String, Boolean]): Unit = js.native
  @JSName("setDefaultFilters")
  def setDefaultFilters_clear(obj: clear): Unit = js.native
}

