package typings.remarkStringify.mod

import typings.remarkStringify.remarkStringifyStrings.Asterisk
import typings.remarkStringify.remarkStringifyStrings.Graveaccent
import typings.remarkStringify.remarkStringifyStrings.Plussign
import typings.remarkStringify.remarkStringifyStrings.Tilde
import typings.remarkStringify.remarkStringifyStrings._underscore
import typings.remarkStringify.remarkStringifyStrings.`-_`
import typings.remarkStringify.remarkStringifyStrings.`1`
import typings.remarkStringify.remarkStringifyStrings.escape
import typings.remarkStringify.remarkStringifyStrings.mixed
import typings.remarkStringify.remarkStringifyStrings.numbers
import typings.remarkStringify.remarkStringifyStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<remark-stringify.remark-stringify.RemarkStringifyOptions> */
@js.native
trait PartialRemarkStringifyOptions extends js.Object {
  var bullet: js.UndefOr[`-_` | Asterisk | Plussign] = js.native
  var closeAtx: js.UndefOr[Boolean] = js.native
  var commonmark: js.UndefOr[Boolean] = js.native
  var emphasis: js.UndefOr[_underscore | Asterisk] = js.native
  var entities: js.UndefOr[Boolean | numbers | escape] = js.native
  var fence: js.UndefOr[Tilde | Graveaccent] = js.native
  var fences: js.UndefOr[Boolean] = js.native
  var gfm: js.UndefOr[Boolean] = js.native
  var incrementListMarker: js.UndefOr[Boolean] = js.native
  var listItemIndent: js.UndefOr[tab | `1` | mixed] = js.native
  var rule: js.UndefOr[`-_` | _underscore | Asterisk] = js.native
  var ruleRepetition: js.UndefOr[Double] = js.native
  var ruleSpaces: js.UndefOr[Boolean] = js.native
  var setext: js.UndefOr[Boolean] = js.native
  var stringLength: js.UndefOr[js.Function1[/* s */ String, Double]] = js.native
  var strong: js.UndefOr[_underscore | Asterisk] = js.native
  var tableCellPadding: js.UndefOr[Boolean] = js.native
  var tablePipeAlign: js.UndefOr[Boolean] = js.native
  var tightDefinitions: js.UndefOr[Boolean] = js.native
}

object PartialRemarkStringifyOptions {
  @scala.inline
  def apply(): PartialRemarkStringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRemarkStringifyOptions]
  }
  @scala.inline
  implicit class PartialRemarkStringifyOptionsOps[Self <: PartialRemarkStringifyOptions] (val x: Self) extends AnyVal {
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
    def setBullet(value: `-_` | Asterisk | Plussign): Self = this.set("bullet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBullet: Self = this.set("bullet", js.undefined)
    @scala.inline
    def setCloseAtx(value: Boolean): Self = this.set("closeAtx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseAtx: Self = this.set("closeAtx", js.undefined)
    @scala.inline
    def setCommonmark(value: Boolean): Self = this.set("commonmark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonmark: Self = this.set("commonmark", js.undefined)
    @scala.inline
    def setEmphasis(value: _underscore | Asterisk): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setEntities(value: Boolean | numbers | escape): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setFence(value: Tilde | Graveaccent): Self = this.set("fence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFence: Self = this.set("fence", js.undefined)
    @scala.inline
    def setFences(value: Boolean): Self = this.set("fences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFences: Self = this.set("fences", js.undefined)
    @scala.inline
    def setGfm(value: Boolean): Self = this.set("gfm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGfm: Self = this.set("gfm", js.undefined)
    @scala.inline
    def setIncrementListMarker(value: Boolean): Self = this.set("incrementListMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrementListMarker: Self = this.set("incrementListMarker", js.undefined)
    @scala.inline
    def setListItemIndent(value: tab | `1` | mixed): Self = this.set("listItemIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItemIndent: Self = this.set("listItemIndent", js.undefined)
    @scala.inline
    def setRule(value: `-_` | _underscore | Asterisk): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    @scala.inline
    def setRuleRepetition(value: Double): Self = this.set("ruleRepetition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleRepetition: Self = this.set("ruleRepetition", js.undefined)
    @scala.inline
    def setRuleSpaces(value: Boolean): Self = this.set("ruleSpaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleSpaces: Self = this.set("ruleSpaces", js.undefined)
    @scala.inline
    def setSetext(value: Boolean): Self = this.set("setext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetext: Self = this.set("setext", js.undefined)
    @scala.inline
    def setStringLength(value: /* s */ String => Double): Self = this.set("stringLength", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStringLength: Self = this.set("stringLength", js.undefined)
    @scala.inline
    def setStrong(value: _underscore | Asterisk): Self = this.set("strong", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
    @scala.inline
    def setTableCellPadding(value: Boolean): Self = this.set("tableCellPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCellPadding: Self = this.set("tableCellPadding", js.undefined)
    @scala.inline
    def setTablePipeAlign(value: Boolean): Self = this.set("tablePipeAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablePipeAlign: Self = this.set("tablePipeAlign", js.undefined)
    @scala.inline
    def setTightDefinitions(value: Boolean): Self = this.set("tightDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTightDefinitions: Self = this.set("tightDefinitions", js.undefined)
  }
  
}

