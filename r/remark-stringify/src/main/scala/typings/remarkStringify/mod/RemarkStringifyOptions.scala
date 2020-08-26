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

@js.native
trait RemarkStringifyOptions extends js.Object {
  var bullet: `-_` | Asterisk | Plussign = js.native
  var closeAtx: Boolean = js.native
  var commonmark: Boolean = js.native
  var emphasis: _underscore | Asterisk = js.native
  var entities: Boolean | numbers | escape = js.native
  var fence: Tilde | Graveaccent = js.native
  var fences: Boolean = js.native
  var gfm: Boolean = js.native
  var incrementListMarker: Boolean = js.native
  var listItemIndent: tab | `1` | mixed = js.native
  var rule: `-_` | _underscore | Asterisk = js.native
  var ruleRepetition: Double = js.native
  var ruleSpaces: Boolean = js.native
  var setext: Boolean = js.native
  var strong: _underscore | Asterisk = js.native
  var tableCellPadding: Boolean = js.native
  var tablePipeAlign: Boolean = js.native
  var tightDefinitions: Boolean = js.native
  def stringLength(s: String): Double = js.native
}

object RemarkStringifyOptions {
  @scala.inline
  def apply(
    bullet: `-_` | Asterisk | Plussign,
    closeAtx: Boolean,
    commonmark: Boolean,
    emphasis: _underscore | Asterisk,
    entities: Boolean | numbers | escape,
    fence: Tilde | Graveaccent,
    fences: Boolean,
    gfm: Boolean,
    incrementListMarker: Boolean,
    listItemIndent: tab | `1` | mixed,
    rule: `-_` | _underscore | Asterisk,
    ruleRepetition: Double,
    ruleSpaces: Boolean,
    setext: Boolean,
    stringLength: String => Double,
    strong: _underscore | Asterisk,
    tableCellPadding: Boolean,
    tablePipeAlign: Boolean,
    tightDefinitions: Boolean
  ): RemarkStringifyOptions = {
    val __obj = js.Dynamic.literal(bullet = bullet.asInstanceOf[js.Any], closeAtx = closeAtx.asInstanceOf[js.Any], commonmark = commonmark.asInstanceOf[js.Any], emphasis = emphasis.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], fence = fence.asInstanceOf[js.Any], fences = fences.asInstanceOf[js.Any], gfm = gfm.asInstanceOf[js.Any], incrementListMarker = incrementListMarker.asInstanceOf[js.Any], listItemIndent = listItemIndent.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], ruleRepetition = ruleRepetition.asInstanceOf[js.Any], ruleSpaces = ruleSpaces.asInstanceOf[js.Any], setext = setext.asInstanceOf[js.Any], stringLength = js.Any.fromFunction1(stringLength), strong = strong.asInstanceOf[js.Any], tableCellPadding = tableCellPadding.asInstanceOf[js.Any], tablePipeAlign = tablePipeAlign.asInstanceOf[js.Any], tightDefinitions = tightDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemarkStringifyOptions]
  }
  @scala.inline
  implicit class RemarkStringifyOptionsOps[Self <: RemarkStringifyOptions] (val x: Self) extends AnyVal {
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
    def setCloseAtx(value: Boolean): Self = this.set("closeAtx", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommonmark(value: Boolean): Self = this.set("commonmark", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmphasis(value: _underscore | Asterisk): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntities(value: Boolean | numbers | escape): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def setFence(value: Tilde | Graveaccent): Self = this.set("fence", value.asInstanceOf[js.Any])
    @scala.inline
    def setFences(value: Boolean): Self = this.set("fences", value.asInstanceOf[js.Any])
    @scala.inline
    def setGfm(value: Boolean): Self = this.set("gfm", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncrementListMarker(value: Boolean): Self = this.set("incrementListMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def setListItemIndent(value: tab | `1` | mixed): Self = this.set("listItemIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: `-_` | _underscore | Asterisk): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleRepetition(value: Double): Self = this.set("ruleRepetition", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleSpaces(value: Boolean): Self = this.set("ruleSpaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetext(value: Boolean): Self = this.set("setext", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringLength(value: String => Double): Self = this.set("stringLength", js.Any.fromFunction1(value))
    @scala.inline
    def setStrong(value: _underscore | Asterisk): Self = this.set("strong", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableCellPadding(value: Boolean): Self = this.set("tableCellPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setTablePipeAlign(value: Boolean): Self = this.set("tablePipeAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setTightDefinitions(value: Boolean): Self = this.set("tightDefinitions", value.asInstanceOf[js.Any])
  }
  
}

