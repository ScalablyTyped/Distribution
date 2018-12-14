package typings
package sheetifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sheetify", JSImport.Namespace)
@js.native
object sheetifyMod extends js.Object {
  def apply(src: java.lang.String | stdLib.TemplateStringsArray): java.lang.String = js.native
  def apply(src: java.lang.String | stdLib.TemplateStringsArray, filename: java.lang.String): java.lang.String = js.native
  def apply(
    src: java.lang.String | stdLib.TemplateStringsArray,
    filename: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): java.lang.String = js.native
  def apply(
    src: java.lang.String | stdLib.TemplateStringsArray,
    filename: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[js.Any],
    done: js.Function3[
      /* err */ stdLib.Error, 
      /* css */ java.lang.String, 
      /* prefix */ java.lang.String, 
      scala.Unit
    ]
  ): java.lang.String = js.native
  def apply(
    src: java.lang.String | stdLib.TemplateStringsArray,
    options: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def getPrefix(css: java.lang.String): java.lang.String = js.native
}

