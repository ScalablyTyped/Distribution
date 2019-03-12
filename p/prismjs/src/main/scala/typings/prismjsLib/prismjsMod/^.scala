package typings
package prismjsLib.prismjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prismjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val hooks: Hooks = js.native
  val languages: Languages = js.native
  val plugins: js.Any = js.native
  val util: Util = js.native
  def fileHighlight(): scala.Unit = js.native
  def highlight(text: java.lang.String, grammar: LanguageDefinition): java.lang.String = js.native
  def highlight(text: java.lang.String, grammar: LanguageDefinition, language: LanguageDefinition): java.lang.String = js.native
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
  def tokenize(text: java.lang.String, grammar: LanguageDefinition): js.Array[Token | java.lang.String] = js.native
}

