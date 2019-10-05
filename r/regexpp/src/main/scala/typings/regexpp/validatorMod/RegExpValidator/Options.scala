package typings.regexpp.validatorMod.RegExpValidator

import typings.regexpp.regexppNumbers.`2015`
import typings.regexpp.regexppNumbers.`2016`
import typings.regexpp.regexppNumbers.`2017`
import typings.regexpp.regexppNumbers.`2018`
import typings.regexpp.regexppNumbers.`5`
import typings.regexpp.regexppStrings.any
import typings.regexpp.regexppStrings.digit
import typings.regexpp.regexppStrings.end
import typings.regexpp.regexppStrings.lookahead
import typings.regexpp.regexppStrings.lookbehind
import typings.regexpp.regexppStrings.property
import typings.regexpp.regexppStrings.space
import typings.regexpp.regexppStrings.start
import typings.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ecmaVersion: js.UndefOr[`5` | `2015` | `2016` | `2017` | `2018`] = js.undefined
  var onAlternativeEnter: js.UndefOr[js.Function2[/* start */ Double, /* index */ Double, Unit]] = js.undefined
  var onAlternativeLeave: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* index */ Double, Unit]] = js.undefined
  var onAnyCharacterSet: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, any, Unit]] = js.undefined
  var onBackreference: js.UndefOr[
    js.Function3[/* start */ Double, /* end */ Double, /* ref */ Double | String, Unit]
  ] = js.undefined
  var onCapturingGroupEnter: js.UndefOr[js.Function2[/* start */ Double, /* name */ String | Null, Unit]] = js.undefined
  var onCapturingGroupLeave: js.UndefOr[
    js.Function3[/* start */ Double, /* end */ Double, /* name */ String | Null, Unit]
  ] = js.undefined
  var onCharacter: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* value */ Double, Unit]] = js.undefined
  var onCharacterClassEnter: js.UndefOr[js.Function2[/* start */ Double, /* negate */ Boolean, Unit]] = js.undefined
  var onCharacterClassLeave: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* negate */ Boolean, Unit]] = js.undefined
  var onCharacterClassRange: js.UndefOr[
    js.Function4[/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, Unit]
  ] = js.undefined
  var onDisjunctionEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
  var onDisjunctionLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
  var onEdgeAssertion: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* kind */ start | end, Unit]] = js.undefined
  var onEscapeCharacterSet: js.UndefOr[
    js.Function4[
      /* start */ Double, 
      /* end */ Double, 
      /* kind */ digit | space | word, 
      /* negate */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onFlags: js.UndefOr[
    js.Function8[
      /* start */ Double, 
      /* end */ Double, 
      /* global */ Boolean, 
      /* ignoreCase */ Boolean, 
      /* multiline */ Boolean, 
      /* unicode */ Boolean, 
      /* sticky */ Boolean, 
      /* dotAll */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onGroupEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
  var onGroupLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
  var onLiteralEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
  var onLiteralLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
  var onLookaroundAssertionEnter: js.UndefOr[
    js.Function3[/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean, Unit]
  ] = js.undefined
  var onLookaroundAssertionLeave: js.UndefOr[
    js.Function4[
      /* start */ Double, 
      /* end */ Double, 
      /* kind */ lookahead | lookbehind, 
      /* negate */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onPatternEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.undefined
  var onPatternLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
  var onQuantifier: js.UndefOr[
    js.Function5[
      /* start */ Double, 
      /* end */ Double, 
      /* min */ Double, 
      /* max */ Double, 
      /* greedy */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onUnicodePropertyCharacterSet: js.UndefOr[
    js.Function6[
      /* start */ Double, 
      /* end */ Double, 
      property, 
      /* key */ String, 
      /* value */ String | Null, 
      /* negate */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var onWordBoundaryAssertion: js.UndefOr[
    js.Function4[/* start */ Double, /* end */ Double, word, /* negate */ Boolean, Unit]
  ] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ecmaVersion: `5` | `2015` | `2016` | `2017` | `2018` = null,
    onAlternativeEnter: (/* start */ Double, /* index */ Double) => Unit = null,
    onAlternativeLeave: (/* start */ Double, /* end */ Double, /* index */ Double) => Unit = null,
    onAnyCharacterSet: (/* start */ Double, /* end */ Double, any) => Unit = null,
    onBackreference: (/* start */ Double, /* end */ Double, /* ref */ Double | String) => Unit = null,
    onCapturingGroupEnter: (/* start */ Double, /* name */ String | Null) => Unit = null,
    onCapturingGroupLeave: (/* start */ Double, /* end */ Double, /* name */ String | Null) => Unit = null,
    onCharacter: (/* start */ Double, /* end */ Double, /* value */ Double) => Unit = null,
    onCharacterClassEnter: (/* start */ Double, /* negate */ Boolean) => Unit = null,
    onCharacterClassLeave: (/* start */ Double, /* end */ Double, /* negate */ Boolean) => Unit = null,
    onCharacterClassRange: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double) => Unit = null,
    onDisjunctionEnter: /* start */ Double => Unit = null,
    onDisjunctionLeave: (/* start */ Double, /* end */ Double) => Unit = null,
    onEdgeAssertion: (/* start */ Double, /* end */ Double, /* kind */ start | end) => Unit = null,
    onEscapeCharacterSet: (/* start */ Double, /* end */ Double, /* kind */ digit | space | word, /* negate */ Boolean) => Unit = null,
    onFlags: (/* start */ Double, /* end */ Double, /* global */ Boolean, /* ignoreCase */ Boolean, /* multiline */ Boolean, /* unicode */ Boolean, /* sticky */ Boolean, /* dotAll */ Boolean) => Unit = null,
    onGroupEnter: /* start */ Double => Unit = null,
    onGroupLeave: (/* start */ Double, /* end */ Double) => Unit = null,
    onLiteralEnter: /* start */ Double => Unit = null,
    onLiteralLeave: (/* start */ Double, /* end */ Double) => Unit = null,
    onLookaroundAssertionEnter: (/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit = null,
    onLookaroundAssertionLeave: (/* start */ Double, /* end */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit = null,
    onPatternEnter: /* start */ Double => Unit = null,
    onPatternLeave: (/* start */ Double, /* end */ Double) => Unit = null,
    onQuantifier: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, /* greedy */ Boolean) => Unit = null,
    onUnicodePropertyCharacterSet: (/* start */ Double, /* end */ Double, property, /* key */ String, /* value */ String | Null, /* negate */ Boolean) => Unit = null,
    onWordBoundaryAssertion: (/* start */ Double, /* end */ Double, word, /* negate */ Boolean) => Unit = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (onAlternativeEnter != null) __obj.updateDynamic("onAlternativeEnter")(js.Any.fromFunction2(onAlternativeEnter))
    if (onAlternativeLeave != null) __obj.updateDynamic("onAlternativeLeave")(js.Any.fromFunction3(onAlternativeLeave))
    if (onAnyCharacterSet != null) __obj.updateDynamic("onAnyCharacterSet")(js.Any.fromFunction3(onAnyCharacterSet))
    if (onBackreference != null) __obj.updateDynamic("onBackreference")(js.Any.fromFunction3(onBackreference))
    if (onCapturingGroupEnter != null) __obj.updateDynamic("onCapturingGroupEnter")(js.Any.fromFunction2(onCapturingGroupEnter))
    if (onCapturingGroupLeave != null) __obj.updateDynamic("onCapturingGroupLeave")(js.Any.fromFunction3(onCapturingGroupLeave))
    if (onCharacter != null) __obj.updateDynamic("onCharacter")(js.Any.fromFunction3(onCharacter))
    if (onCharacterClassEnter != null) __obj.updateDynamic("onCharacterClassEnter")(js.Any.fromFunction2(onCharacterClassEnter))
    if (onCharacterClassLeave != null) __obj.updateDynamic("onCharacterClassLeave")(js.Any.fromFunction3(onCharacterClassLeave))
    if (onCharacterClassRange != null) __obj.updateDynamic("onCharacterClassRange")(js.Any.fromFunction4(onCharacterClassRange))
    if (onDisjunctionEnter != null) __obj.updateDynamic("onDisjunctionEnter")(js.Any.fromFunction1(onDisjunctionEnter))
    if (onDisjunctionLeave != null) __obj.updateDynamic("onDisjunctionLeave")(js.Any.fromFunction2(onDisjunctionLeave))
    if (onEdgeAssertion != null) __obj.updateDynamic("onEdgeAssertion")(js.Any.fromFunction3(onEdgeAssertion))
    if (onEscapeCharacterSet != null) __obj.updateDynamic("onEscapeCharacterSet")(js.Any.fromFunction4(onEscapeCharacterSet))
    if (onFlags != null) __obj.updateDynamic("onFlags")(js.Any.fromFunction8(onFlags))
    if (onGroupEnter != null) __obj.updateDynamic("onGroupEnter")(js.Any.fromFunction1(onGroupEnter))
    if (onGroupLeave != null) __obj.updateDynamic("onGroupLeave")(js.Any.fromFunction2(onGroupLeave))
    if (onLiteralEnter != null) __obj.updateDynamic("onLiteralEnter")(js.Any.fromFunction1(onLiteralEnter))
    if (onLiteralLeave != null) __obj.updateDynamic("onLiteralLeave")(js.Any.fromFunction2(onLiteralLeave))
    if (onLookaroundAssertionEnter != null) __obj.updateDynamic("onLookaroundAssertionEnter")(js.Any.fromFunction3(onLookaroundAssertionEnter))
    if (onLookaroundAssertionLeave != null) __obj.updateDynamic("onLookaroundAssertionLeave")(js.Any.fromFunction4(onLookaroundAssertionLeave))
    if (onPatternEnter != null) __obj.updateDynamic("onPatternEnter")(js.Any.fromFunction1(onPatternEnter))
    if (onPatternLeave != null) __obj.updateDynamic("onPatternLeave")(js.Any.fromFunction2(onPatternLeave))
    if (onQuantifier != null) __obj.updateDynamic("onQuantifier")(js.Any.fromFunction5(onQuantifier))
    if (onUnicodePropertyCharacterSet != null) __obj.updateDynamic("onUnicodePropertyCharacterSet")(js.Any.fromFunction6(onUnicodePropertyCharacterSet))
    if (onWordBoundaryAssertion != null) __obj.updateDynamic("onWordBoundaryAssertion")(js.Any.fromFunction4(onWordBoundaryAssertion))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Options]
  }
}

