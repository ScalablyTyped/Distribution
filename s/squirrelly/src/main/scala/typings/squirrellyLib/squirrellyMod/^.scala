package typings
package squirrellyLib.squirrellyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("squirrelly", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Compile(str: java.lang.String): SqrlFn = js.native
  def Render(template: java.lang.String, options: TemplateOptions): java.lang.String = js.native
  def Render(template: SqrlFn, options: TemplateOptions): java.lang.String = js.native
  def __express(
    filePath: java.lang.String,
    options: TemplateOptions,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): scala.Unit = js.native
  def autoEscaping[T /* <: scala.Boolean */](bool: T): T = js.native
  def defaultTags(tagArray: js.Array[java.lang.String]): scala.Unit = js.native
  def defineFilter(name: java.lang.String, callback: js.Function1[/* str */ java.lang.String, java.lang.String]): scala.Unit = js.native
  def defineHelper(
    name: java.lang.String,
    callback: js.Function3[
      /* args */ js.Array[java.lang.String], 
      /* content */ js.Function0[java.lang.String], 
      /* blocks */ Blocks, 
      java.lang.String
    ]
  ): scala.Unit = js.native
  def defineNativeHelper(name: java.lang.String, obj: NativeHelper): scala.Unit = js.native
  def definePartial(name: java.lang.String, str: java.lang.String): scala.Unit = js.native
  def load(options: Options): SqrlFn = js.native
  def load(options: Options, str: java.lang.String): SqrlFn = js.native
  def renderFile(filePath: java.lang.String, options: TemplateOptions): java.lang.String = js.native
  def setDefaultFilters(obj: stdLib.Record[java.lang.String, scala.Boolean]): scala.Unit = js.native
  @JSName("setDefaultFilters")
  def setDefaultFilters_clear(obj: squirrellyLib.squirrellyLibStrings.clear): scala.Unit = js.native
}

