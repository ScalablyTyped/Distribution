package typings
package prismjsLib.prismjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var classes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var code: js.UndefOr[js.Any] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var element: js.UndefOr[stdLib.Element] = js.undefined
  var grammar: js.UndefOr[js.Any] = js.undefined
  var highlightedCode: js.UndefOr[js.Any] = js.undefined
  var language: js.UndefOr[LanguageDefinition] = js.undefined
  var parent: js.UndefOr[stdLib.Element] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Environment {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    classes: js.Array[java.lang.String] = null,
    code: js.Any = null,
    content: java.lang.String = null,
    element: stdLib.Element = null,
    grammar: js.Any = null,
    highlightedCode: js.Any = null,
    language: LanguageDefinition = null,
    parent: stdLib.Element = null,
    tag: java.lang.String = null,
    `type`: java.lang.String = null
  ): Environment = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (code != null) __obj.updateDynamic("code")(code)
    if (content != null) __obj.updateDynamic("content")(content)
    if (element != null) __obj.updateDynamic("element")(element)
    if (grammar != null) __obj.updateDynamic("grammar")(grammar)
    if (highlightedCode != null) __obj.updateDynamic("highlightedCode")(highlightedCode)
    if (language != null) __obj.updateDynamic("language")(language)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Environment]
  }
}

