package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_reference_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait FootnoteReferenceOpenToken extends FootnoteGenericToken {
  var label: String = js.native
  @JSName("type")
  var type_FootnoteReferenceOpenToken: footnote_reference_open = js.native
}

object FootnoteReferenceOpenToken {
  @scala.inline
  def apply(id: Double, label: String, level: Double, `type`: footnote_reference_open): FootnoteReferenceOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteReferenceOpenToken]
  }
  @scala.inline
  implicit class FootnoteReferenceOpenTokenOps[Self <: FootnoteReferenceOpenToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: footnote_reference_open): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

