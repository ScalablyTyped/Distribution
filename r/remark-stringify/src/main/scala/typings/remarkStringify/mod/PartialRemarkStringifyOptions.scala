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
trait PartialRemarkStringifyOptions extends js.Object {
  var bullet: js.UndefOr[`-_` | Asterisk | Plussign] = js.undefined
  var closeAtx: js.UndefOr[Boolean] = js.undefined
  var commonmark: js.UndefOr[Boolean] = js.undefined
  var emphasis: js.UndefOr[_underscore | Asterisk] = js.undefined
  var entities: js.UndefOr[Boolean | numbers | escape] = js.undefined
  var fence: js.UndefOr[Tilde | Graveaccent] = js.undefined
  var fences: js.UndefOr[Boolean] = js.undefined
  var gfm: js.UndefOr[Boolean] = js.undefined
  var incrementListMarker: js.UndefOr[Boolean] = js.undefined
  var listItemIndent: js.UndefOr[tab | `1` | mixed] = js.undefined
  var rule: js.UndefOr[`-_` | _underscore | Asterisk] = js.undefined
  var ruleRepetition: js.UndefOr[Double] = js.undefined
  var ruleSpaces: js.UndefOr[Boolean] = js.undefined
  var setext: js.UndefOr[Boolean] = js.undefined
  var stringLength: js.UndefOr[js.Function1[/* s */ String, Double]] = js.undefined
  var strong: js.UndefOr[_underscore | Asterisk] = js.undefined
  var tableCellPadding: js.UndefOr[Boolean] = js.undefined
  var tablePipeAlign: js.UndefOr[Boolean] = js.undefined
  var tightDefinitions: js.UndefOr[Boolean] = js.undefined
}

object PartialRemarkStringifyOptions {
  @scala.inline
  def apply(
    bullet: `-_` | Asterisk | Plussign = null,
    closeAtx: js.UndefOr[Boolean] = js.undefined,
    commonmark: js.UndefOr[Boolean] = js.undefined,
    emphasis: _underscore | Asterisk = null,
    entities: Boolean | numbers | escape = null,
    fence: Tilde | Graveaccent = null,
    fences: js.UndefOr[Boolean] = js.undefined,
    gfm: js.UndefOr[Boolean] = js.undefined,
    incrementListMarker: js.UndefOr[Boolean] = js.undefined,
    listItemIndent: tab | `1` | mixed = null,
    rule: `-_` | _underscore | Asterisk = null,
    ruleRepetition: js.UndefOr[Double] = js.undefined,
    ruleSpaces: js.UndefOr[Boolean] = js.undefined,
    setext: js.UndefOr[Boolean] = js.undefined,
    stringLength: /* s */ String => Double = null,
    strong: _underscore | Asterisk = null,
    tableCellPadding: js.UndefOr[Boolean] = js.undefined,
    tablePipeAlign: js.UndefOr[Boolean] = js.undefined,
    tightDefinitions: js.UndefOr[Boolean] = js.undefined
  ): PartialRemarkStringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (bullet != null) __obj.updateDynamic("bullet")(bullet.asInstanceOf[js.Any])
    if (!js.isUndefined(closeAtx)) __obj.updateDynamic("closeAtx")(closeAtx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(commonmark)) __obj.updateDynamic("commonmark")(commonmark.get.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (fence != null) __obj.updateDynamic("fence")(fence.asInstanceOf[js.Any])
    if (!js.isUndefined(fences)) __obj.updateDynamic("fences")(fences.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(incrementListMarker)) __obj.updateDynamic("incrementListMarker")(incrementListMarker.get.asInstanceOf[js.Any])
    if (listItemIndent != null) __obj.updateDynamic("listItemIndent")(listItemIndent.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (!js.isUndefined(ruleRepetition)) __obj.updateDynamic("ruleRepetition")(ruleRepetition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ruleSpaces)) __obj.updateDynamic("ruleSpaces")(ruleSpaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setext)) __obj.updateDynamic("setext")(setext.get.asInstanceOf[js.Any])
    if (stringLength != null) __obj.updateDynamic("stringLength")(js.Any.fromFunction1(stringLength))
    if (strong != null) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (!js.isUndefined(tableCellPadding)) __obj.updateDynamic("tableCellPadding")(tableCellPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tablePipeAlign)) __obj.updateDynamic("tablePipeAlign")(tablePipeAlign.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tightDefinitions)) __obj.updateDynamic("tightDefinitions")(tightDefinitions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRemarkStringifyOptions]
  }
}

