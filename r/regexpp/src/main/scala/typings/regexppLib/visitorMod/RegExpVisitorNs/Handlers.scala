package typings
package regexppLib.visitorMod.RegExpVisitorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handlers extends js.Object {
  var onAlternativeEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Alternative, scala.Unit]] = js.undefined
  var onAlternativeLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Alternative, scala.Unit]] = js.undefined
  var onAssertionEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Assertion, scala.Unit]] = js.undefined
  var onAssertionLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Assertion, scala.Unit]] = js.undefined
  var onBackreferenceEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Backreference, scala.Unit]] = js.undefined
  var onBackreferenceLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Backreference, scala.Unit]] = js.undefined
  var onCapturingGroupEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.CapturingGroup, scala.Unit]] = js.undefined
  var onCapturingGroupLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.CapturingGroup, scala.Unit]] = js.undefined
  var onCharacterClassEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.CharacterClass, scala.Unit]] = js.undefined
  var onCharacterClassLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.CharacterClass, scala.Unit]] = js.undefined
  var onCharacterClassRangeEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.CharacterClassRange, scala.Unit]] = js.undefined
  var onCharacterClassRangeLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.CharacterClassRange, scala.Unit]] = js.undefined
  var onCharacterEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Character, scala.Unit]] = js.undefined
  var onCharacterLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Character, scala.Unit]] = js.undefined
  var onCharacterSetEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.CharacterSet, scala.Unit]] = js.undefined
  var onCharacterSetLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.CharacterSet, scala.Unit]] = js.undefined
  var onFlagsEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Flags, scala.Unit]] = js.undefined
  var onFlagsLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Flags, scala.Unit]] = js.undefined
  var onGroupEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Group, scala.Unit]] = js.undefined
  var onGroupLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Group, scala.Unit]] = js.undefined
  var onPatternEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Pattern, scala.Unit]] = js.undefined
  var onPatternLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Pattern, scala.Unit]] = js.undefined
  var onQuantifierEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Quantifier, scala.Unit]] = js.undefined
  var onQuantifierLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.Quantifier, scala.Unit]] = js.undefined
  var onRegExpLiteralEnter: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.RegExpLiteral, scala.Unit]] = js.undefined
  var onRegExpLiteralLeave: js.UndefOr[js.Function1[/* node */ regexppLib.astMod.RegExpLiteral, scala.Unit]] = js.undefined
}

object Handlers {
  @scala.inline
  def apply(
    onAlternativeEnter: /* node */ regexppLib.astMod.Alternative => scala.Unit = null,
    onAlternativeLeave: /* node */ regexppLib.astMod.Alternative => scala.Unit = null,
    onAssertionEnter: /* node */ regexppLib.astMod.Assertion => scala.Unit = null,
    onAssertionLeave: /* node */ regexppLib.astMod.Assertion => scala.Unit = null,
    onBackreferenceEnter: /* node */ regexppLib.astMod.Backreference => scala.Unit = null,
    onBackreferenceLeave: /* node */ regexppLib.astMod.Backreference => scala.Unit = null,
    onCapturingGroupEnter: /* node */ regexppLib.astMod.CapturingGroup => scala.Unit = null,
    onCapturingGroupLeave: /* node */ regexppLib.astMod.CapturingGroup => scala.Unit = null,
    onCharacterClassEnter: /* node */ regexppLib.astMod.CharacterClass => scala.Unit = null,
    onCharacterClassLeave: /* node */ regexppLib.astMod.CharacterClass => scala.Unit = null,
    onCharacterClassRangeEnter: /* node */ regexppLib.astMod.CharacterClassRange => scala.Unit = null,
    onCharacterClassRangeLeave: /* node */ regexppLib.astMod.CharacterClassRange => scala.Unit = null,
    onCharacterEnter: /* node */ regexppLib.astMod.Character => scala.Unit = null,
    onCharacterLeave: /* node */ regexppLib.astMod.Character => scala.Unit = null,
    onCharacterSetEnter: /* node */ regexppLib.astMod.CharacterSet => scala.Unit = null,
    onCharacterSetLeave: /* node */ regexppLib.astMod.CharacterSet => scala.Unit = null,
    onFlagsEnter: /* node */ regexppLib.astMod.Flags => scala.Unit = null,
    onFlagsLeave: /* node */ regexppLib.astMod.Flags => scala.Unit = null,
    onGroupEnter: /* node */ regexppLib.astMod.Group => scala.Unit = null,
    onGroupLeave: /* node */ regexppLib.astMod.Group => scala.Unit = null,
    onPatternEnter: /* node */ regexppLib.astMod.Pattern => scala.Unit = null,
    onPatternLeave: /* node */ regexppLib.astMod.Pattern => scala.Unit = null,
    onQuantifierEnter: /* node */ regexppLib.astMod.Quantifier => scala.Unit = null,
    onQuantifierLeave: /* node */ regexppLib.astMod.Quantifier => scala.Unit = null,
    onRegExpLiteralEnter: /* node */ regexppLib.astMod.RegExpLiteral => scala.Unit = null,
    onRegExpLiteralLeave: /* node */ regexppLib.astMod.RegExpLiteral => scala.Unit = null
  ): Handlers = {
    val __obj = js.Dynamic.literal()
    if (onAlternativeEnter != null) __obj.updateDynamic("onAlternativeEnter")(js.Any.fromFunction1(onAlternativeEnter))
    if (onAlternativeLeave != null) __obj.updateDynamic("onAlternativeLeave")(js.Any.fromFunction1(onAlternativeLeave))
    if (onAssertionEnter != null) __obj.updateDynamic("onAssertionEnter")(js.Any.fromFunction1(onAssertionEnter))
    if (onAssertionLeave != null) __obj.updateDynamic("onAssertionLeave")(js.Any.fromFunction1(onAssertionLeave))
    if (onBackreferenceEnter != null) __obj.updateDynamic("onBackreferenceEnter")(js.Any.fromFunction1(onBackreferenceEnter))
    if (onBackreferenceLeave != null) __obj.updateDynamic("onBackreferenceLeave")(js.Any.fromFunction1(onBackreferenceLeave))
    if (onCapturingGroupEnter != null) __obj.updateDynamic("onCapturingGroupEnter")(js.Any.fromFunction1(onCapturingGroupEnter))
    if (onCapturingGroupLeave != null) __obj.updateDynamic("onCapturingGroupLeave")(js.Any.fromFunction1(onCapturingGroupLeave))
    if (onCharacterClassEnter != null) __obj.updateDynamic("onCharacterClassEnter")(js.Any.fromFunction1(onCharacterClassEnter))
    if (onCharacterClassLeave != null) __obj.updateDynamic("onCharacterClassLeave")(js.Any.fromFunction1(onCharacterClassLeave))
    if (onCharacterClassRangeEnter != null) __obj.updateDynamic("onCharacterClassRangeEnter")(js.Any.fromFunction1(onCharacterClassRangeEnter))
    if (onCharacterClassRangeLeave != null) __obj.updateDynamic("onCharacterClassRangeLeave")(js.Any.fromFunction1(onCharacterClassRangeLeave))
    if (onCharacterEnter != null) __obj.updateDynamic("onCharacterEnter")(js.Any.fromFunction1(onCharacterEnter))
    if (onCharacterLeave != null) __obj.updateDynamic("onCharacterLeave")(js.Any.fromFunction1(onCharacterLeave))
    if (onCharacterSetEnter != null) __obj.updateDynamic("onCharacterSetEnter")(js.Any.fromFunction1(onCharacterSetEnter))
    if (onCharacterSetLeave != null) __obj.updateDynamic("onCharacterSetLeave")(js.Any.fromFunction1(onCharacterSetLeave))
    if (onFlagsEnter != null) __obj.updateDynamic("onFlagsEnter")(js.Any.fromFunction1(onFlagsEnter))
    if (onFlagsLeave != null) __obj.updateDynamic("onFlagsLeave")(js.Any.fromFunction1(onFlagsLeave))
    if (onGroupEnter != null) __obj.updateDynamic("onGroupEnter")(js.Any.fromFunction1(onGroupEnter))
    if (onGroupLeave != null) __obj.updateDynamic("onGroupLeave")(js.Any.fromFunction1(onGroupLeave))
    if (onPatternEnter != null) __obj.updateDynamic("onPatternEnter")(js.Any.fromFunction1(onPatternEnter))
    if (onPatternLeave != null) __obj.updateDynamic("onPatternLeave")(js.Any.fromFunction1(onPatternLeave))
    if (onQuantifierEnter != null) __obj.updateDynamic("onQuantifierEnter")(js.Any.fromFunction1(onQuantifierEnter))
    if (onQuantifierLeave != null) __obj.updateDynamic("onQuantifierLeave")(js.Any.fromFunction1(onQuantifierLeave))
    if (onRegExpLiteralEnter != null) __obj.updateDynamic("onRegExpLiteralEnter")(js.Any.fromFunction1(onRegExpLiteralEnter))
    if (onRegExpLiteralLeave != null) __obj.updateDynamic("onRegExpLiteralLeave")(js.Any.fromFunction1(onRegExpLiteralLeave))
    __obj.asInstanceOf[Handlers]
  }
}

