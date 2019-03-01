package typings
package prosemirrorDashSchemaDashBasicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkSpec
  var em: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkSpec
  var link: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkSpec
  var strong: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkSpec
}

object Anon_Code {
  @scala.inline
  def apply(
    code: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkSpec,
    em: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkSpec,
    link: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkSpec,
    strong: prosemirrorDashModelLib.prosemirrorDashModelMod.MarkSpec
  ): Anon_Code = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("em")(em)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("strong")(strong)
    __obj.asInstanceOf[Anon_Code]
  }
}

