package typings.regexpp.visitorMod.RegExpVisitorNs

import typings.regexpp.astMod.Alternative
import typings.regexpp.astMod.Assertion
import typings.regexpp.astMod.Backreference
import typings.regexpp.astMod.CapturingGroup
import typings.regexpp.astMod.Character
import typings.regexpp.astMod.CharacterClass
import typings.regexpp.astMod.CharacterClassRange
import typings.regexpp.astMod.CharacterSet
import typings.regexpp.astMod.Flags
import typings.regexpp.astMod.Group
import typings.regexpp.astMod.Pattern
import typings.regexpp.astMod.Quantifier
import typings.regexpp.astMod.RegExpLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handlers extends js.Object {
  var onAlternativeEnter: js.UndefOr[js.Function1[/* node */ Alternative, Unit]] = js.undefined
  var onAlternativeLeave: js.UndefOr[js.Function1[/* node */ Alternative, Unit]] = js.undefined
  var onAssertionEnter: js.UndefOr[js.Function1[/* node */ Assertion, Unit]] = js.undefined
  var onAssertionLeave: js.UndefOr[js.Function1[/* node */ Assertion, Unit]] = js.undefined
  var onBackreferenceEnter: js.UndefOr[js.Function1[/* node */ Backreference, Unit]] = js.undefined
  var onBackreferenceLeave: js.UndefOr[js.Function1[/* node */ Backreference, Unit]] = js.undefined
  var onCapturingGroupEnter: js.UndefOr[js.Function1[/* node */ CapturingGroup, Unit]] = js.undefined
  var onCapturingGroupLeave: js.UndefOr[js.Function1[/* node */ CapturingGroup, Unit]] = js.undefined
  var onCharacterClassEnter: js.UndefOr[js.Function1[/* node */ CharacterClass, Unit]] = js.undefined
  var onCharacterClassLeave: js.UndefOr[js.Function1[/* node */ CharacterClass, Unit]] = js.undefined
  var onCharacterClassRangeEnter: js.UndefOr[js.Function1[/* node */ CharacterClassRange, Unit]] = js.undefined
  var onCharacterClassRangeLeave: js.UndefOr[js.Function1[/* node */ CharacterClassRange, Unit]] = js.undefined
  var onCharacterEnter: js.UndefOr[js.Function1[/* node */ Character, Unit]] = js.undefined
  var onCharacterLeave: js.UndefOr[js.Function1[/* node */ Character, Unit]] = js.undefined
  var onCharacterSetEnter: js.UndefOr[js.Function1[/* node */ CharacterSet, Unit]] = js.undefined
  var onCharacterSetLeave: js.UndefOr[js.Function1[/* node */ CharacterSet, Unit]] = js.undefined
  var onFlagsEnter: js.UndefOr[js.Function1[/* node */ Flags, Unit]] = js.undefined
  var onFlagsLeave: js.UndefOr[js.Function1[/* node */ Flags, Unit]] = js.undefined
  var onGroupEnter: js.UndefOr[js.Function1[/* node */ Group, Unit]] = js.undefined
  var onGroupLeave: js.UndefOr[js.Function1[/* node */ Group, Unit]] = js.undefined
  var onPatternEnter: js.UndefOr[js.Function1[/* node */ Pattern, Unit]] = js.undefined
  var onPatternLeave: js.UndefOr[js.Function1[/* node */ Pattern, Unit]] = js.undefined
  var onQuantifierEnter: js.UndefOr[js.Function1[/* node */ Quantifier, Unit]] = js.undefined
  var onQuantifierLeave: js.UndefOr[js.Function1[/* node */ Quantifier, Unit]] = js.undefined
  var onRegExpLiteralEnter: js.UndefOr[js.Function1[/* node */ RegExpLiteral, Unit]] = js.undefined
  var onRegExpLiteralLeave: js.UndefOr[js.Function1[/* node */ RegExpLiteral, Unit]] = js.undefined
}

object Handlers {
  @scala.inline
  def apply(
    onAlternativeEnter: /* node */ Alternative => Unit = null,
    onAlternativeLeave: /* node */ Alternative => Unit = null,
    onAssertionEnter: /* node */ Assertion => Unit = null,
    onAssertionLeave: /* node */ Assertion => Unit = null,
    onBackreferenceEnter: /* node */ Backreference => Unit = null,
    onBackreferenceLeave: /* node */ Backreference => Unit = null,
    onCapturingGroupEnter: /* node */ CapturingGroup => Unit = null,
    onCapturingGroupLeave: /* node */ CapturingGroup => Unit = null,
    onCharacterClassEnter: /* node */ CharacterClass => Unit = null,
    onCharacterClassLeave: /* node */ CharacterClass => Unit = null,
    onCharacterClassRangeEnter: /* node */ CharacterClassRange => Unit = null,
    onCharacterClassRangeLeave: /* node */ CharacterClassRange => Unit = null,
    onCharacterEnter: /* node */ Character => Unit = null,
    onCharacterLeave: /* node */ Character => Unit = null,
    onCharacterSetEnter: /* node */ CharacterSet => Unit = null,
    onCharacterSetLeave: /* node */ CharacterSet => Unit = null,
    onFlagsEnter: /* node */ Flags => Unit = null,
    onFlagsLeave: /* node */ Flags => Unit = null,
    onGroupEnter: /* node */ Group => Unit = null,
    onGroupLeave: /* node */ Group => Unit = null,
    onPatternEnter: /* node */ Pattern => Unit = null,
    onPatternLeave: /* node */ Pattern => Unit = null,
    onQuantifierEnter: /* node */ Quantifier => Unit = null,
    onQuantifierLeave: /* node */ Quantifier => Unit = null,
    onRegExpLiteralEnter: /* node */ RegExpLiteral => Unit = null,
    onRegExpLiteralLeave: /* node */ RegExpLiteral => Unit = null
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

