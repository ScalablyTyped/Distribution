package typings
package prismjsLib.prismjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prismjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val hooks: prismjsLib.prismjsMod.Hooks = js.native
  val languages: prismjsLib.prismjsMod.Languages = js.native
  val plugins: js.Any = js.native
  val util: prismjsLib.prismjsMod.Util = js.native
  def fileHighlight(): scala.Unit = js.native
  def highlight(text: java.lang.String, grammar: prismjsLib.prismjsMod.LanguageDefinition): java.lang.String = js.native
  def highlight(
    text: java.lang.String,
    grammar: prismjsLib.prismjsMod.LanguageDefinition,
    language: prismjsLib.prismjsMod.LanguageDefinition
  ): java.lang.String = js.native
  def highlightAll(): scala.Unit = js.native
  def highlightAll(async: scala.Boolean): scala.Unit = js.native
  def highlightAll(async: scala.Boolean, callback: js.Function1[/* element */ stdLib.Element, scala.Unit]): scala.Unit = js.native
  def highlightAllUnder(container: stdLib.Element): scala.Unit = js.native
  def highlightAllUnder(container: stdLib.Element, async: scala.Boolean): scala.Unit = js.native
  def highlightAllUnder(
    container: stdLib.Element,
    async: scala.Boolean,
    callback: js.Function1[/* element */ stdLib.Element, scala.Unit]
  ): scala.Unit = js.native
  def highlightElement(element: stdLib.Element): scala.Unit = js.native
  def highlightElement(element: stdLib.Element, async: scala.Boolean): scala.Unit = js.native
  def highlightElement(
    element: stdLib.Element,
    async: scala.Boolean,
    callback: js.Function1[/* element */ stdLib.Element, scala.Unit]
  ): scala.Unit = js.native
  def tokenize(text: java.lang.String, grammar: prismjsLib.prismjsMod.LanguageDefinition): js.Array[prismjsLib.prismjsMod.Token | java.lang.String] = js.native
}

