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

trait RemarkStringifyOptions extends js.Object {
  var bullet: `-_` | Asterisk | Plussign
  var closeAtx: Boolean
  var commonmark: Boolean
  var emphasis: _underscore | Asterisk
  var entities: Boolean | numbers | escape
  var fence: Tilde | Graveaccent
  var fences: Boolean
  var gfm: Boolean
  var incrementListMarker: Boolean
  var listItemIndent: tab | `1` | mixed
  var rule: `-_` | _underscore | Asterisk
  var ruleRepetition: Double
  var ruleSpaces: Boolean
  var setext: Boolean
  var strong: _underscore | Asterisk
  var tableCellPadding: Boolean
  var tablePipeAlign: Boolean
  var tightDefinitions: Boolean
  def stringLength(s: String): Double
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
}

