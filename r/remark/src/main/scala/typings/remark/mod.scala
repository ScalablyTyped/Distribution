package typings.remark

import typings.mdastUtilFromMarkdown.mod.Options
import typings.remarkStringify.mod.RemarkStringifyOptions
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @deprecated Use `RemarkOptions` instead.
    */
  type PartialRemarkOptions = RemarkOptions
  
  trait RemarkOptions
    extends StObject
       with Options
       with RemarkStringifyOptions
  object RemarkOptions {
    
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
    ): RemarkOptions = {
      val __obj = js.Dynamic.literal(bullet = bullet.asInstanceOf[js.Any], closeAtx = closeAtx.asInstanceOf[js.Any], commonmark = commonmark.asInstanceOf[js.Any], emphasis = emphasis.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], fence = fence.asInstanceOf[js.Any], fences = fences.asInstanceOf[js.Any], gfm = gfm.asInstanceOf[js.Any], incrementListMarker = incrementListMarker.asInstanceOf[js.Any], listItemIndent = listItemIndent.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], ruleRepetition = ruleRepetition.asInstanceOf[js.Any], ruleSpaces = ruleSpaces.asInstanceOf[js.Any], setext = setext.asInstanceOf[js.Any], stringLength = js.Any.fromFunction1(stringLength), strong = strong.asInstanceOf[js.Any], tableCellPadding = tableCellPadding.asInstanceOf[js.Any], tablePipeAlign = tablePipeAlign.asInstanceOf[js.Any], tightDefinitions = tightDefinitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemarkOptions]
    }
  }
}
