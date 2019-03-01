package typings
package prosemirrorDashSchemaDashBasicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blockquote extends js.Object {
  var blockquote: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  var code_block: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  var doc: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  var hard_break: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  var heading: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  var horizontal_rule: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  var image: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  var paragraph: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  var text: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
}

object Anon_Blockquote {
  @scala.inline
  def apply(
    blockquote: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec,
    code_block: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec,
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec,
    hard_break: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec,
    heading: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec,
    horizontal_rule: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec,
    image: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec,
    paragraph: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec,
    text: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec
  ): Anon_Blockquote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockquote")(blockquote)
    __obj.updateDynamic("code_block")(code_block)
    __obj.updateDynamic("doc")(doc)
    __obj.updateDynamic("hard_break")(hard_break)
    __obj.updateDynamic("heading")(heading)
    __obj.updateDynamic("horizontal_rule")(horizontal_rule)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("paragraph")(paragraph)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Blockquote]
  }
}

