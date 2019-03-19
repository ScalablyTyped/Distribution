package typings
package regexppLib.validatorMod.RegExpValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ecmaVersion: js.UndefOr[
    regexppLib.regexppLibNumbers.`5` | regexppLib.regexppLibNumbers.`2015` | regexppLib.regexppLibNumbers.`2016` | regexppLib.regexppLibNumbers.`2017` | regexppLib.regexppLibNumbers.`2018`
  ] = js.undefined
  var onAlternativeEnter: js.UndefOr[js.Function2[/* start */ scala.Double, /* index */ scala.Double, scala.Unit]] = js.undefined
  var onAlternativeLeave: js.UndefOr[
    js.Function3[/* start */ scala.Double, /* end */ scala.Double, /* index */ scala.Double, scala.Unit]
  ] = js.undefined
  var onAnyCharacterSet: js.UndefOr[
    js.Function3[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      regexppLib.regexppLibStrings.any, 
      scala.Unit
    ]
  ] = js.undefined
  var onBackreference: js.UndefOr[
    js.Function3[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* ref */ scala.Double | java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onCapturingGroupEnter: js.UndefOr[
    js.Function2[/* start */ scala.Double, /* name */ java.lang.String | scala.Null, scala.Unit]
  ] = js.undefined
  var onCapturingGroupLeave: js.UndefOr[
    js.Function3[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* name */ java.lang.String | scala.Null, 
      scala.Unit
    ]
  ] = js.undefined
  var onCharacter: js.UndefOr[
    js.Function3[/* start */ scala.Double, /* end */ scala.Double, /* value */ scala.Double, scala.Unit]
  ] = js.undefined
  var onCharacterClassEnter: js.UndefOr[js.Function2[/* start */ scala.Double, /* negate */ scala.Boolean, scala.Unit]] = js.undefined
  var onCharacterClassLeave: js.UndefOr[
    js.Function3[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* negate */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var onCharacterClassRange: js.UndefOr[
    js.Function4[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* min */ scala.Double, 
      /* max */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var onDisjunctionEnter: js.UndefOr[js.Function1[/* start */ scala.Double, scala.Unit]] = js.undefined
  var onDisjunctionLeave: js.UndefOr[js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit]] = js.undefined
  var onEdgeAssertion: js.UndefOr[
    js.Function3[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ regexppLib.regexppLibStrings.start | regexppLib.regexppLibStrings.end, 
      scala.Unit
    ]
  ] = js.undefined
  var onEscapeCharacterSet: js.UndefOr[
    js.Function4[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ regexppLib.regexppLibStrings.digit | regexppLib.regexppLibStrings.space | regexppLib.regexppLibStrings.word, 
      /* negate */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var onFlags: js.UndefOr[
    js.Function8[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* global */ scala.Boolean, 
      /* ignoreCase */ scala.Boolean, 
      /* multiline */ scala.Boolean, 
      /* unicode */ scala.Boolean, 
      /* sticky */ scala.Boolean, 
      /* dotAll */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var onGroupEnter: js.UndefOr[js.Function1[/* start */ scala.Double, scala.Unit]] = js.undefined
  var onGroupLeave: js.UndefOr[js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit]] = js.undefined
  var onLiteralEnter: js.UndefOr[js.Function1[/* start */ scala.Double, scala.Unit]] = js.undefined
  var onLiteralLeave: js.UndefOr[js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit]] = js.undefined
  var onLookaroundAssertionEnter: js.UndefOr[
    js.Function3[
      /* start */ scala.Double, 
      /* kind */ regexppLib.regexppLibStrings.lookahead | regexppLib.regexppLibStrings.lookbehind, 
      /* negate */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var onLookaroundAssertionLeave: js.UndefOr[
    js.Function4[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ regexppLib.regexppLibStrings.lookahead | regexppLib.regexppLibStrings.lookbehind, 
      /* negate */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var onPatternEnter: js.UndefOr[js.Function1[/* start */ scala.Double, scala.Unit]] = js.undefined
  var onPatternLeave: js.UndefOr[js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit]] = js.undefined
  var onQuantifier: js.UndefOr[
    js.Function5[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      /* min */ scala.Double, 
      /* max */ scala.Double, 
      /* greedy */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var onUnicodePropertyCharacterSet: js.UndefOr[
    js.Function6[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      regexppLib.regexppLibStrings.property, 
      /* key */ java.lang.String, 
      /* value */ java.lang.String | scala.Null, 
      /* negate */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var onWordBoundaryAssertion: js.UndefOr[
    js.Function4[
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      regexppLib.regexppLibStrings.word, 
      /* negate */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ecmaVersion: regexppLib.regexppLibNumbers.`5` | regexppLib.regexppLibNumbers.`2015` | regexppLib.regexppLibNumbers.`2016` | regexppLib.regexppLibNumbers.`2017` | regexppLib.regexppLibNumbers.`2018` = null,
    onAlternativeEnter: (/* start */ scala.Double, /* index */ scala.Double) => scala.Unit = null,
    onAlternativeLeave: (/* start */ scala.Double, /* end */ scala.Double, /* index */ scala.Double) => scala.Unit = null,
    onAnyCharacterSet: (/* start */ scala.Double, /* end */ scala.Double, regexppLib.regexppLibStrings.any) => scala.Unit = null,
    onBackreference: (/* start */ scala.Double, /* end */ scala.Double, /* ref */ scala.Double | java.lang.String) => scala.Unit = null,
    onCapturingGroupEnter: (/* start */ scala.Double, /* name */ java.lang.String | scala.Null) => scala.Unit = null,
    onCapturingGroupLeave: (/* start */ scala.Double, /* end */ scala.Double, /* name */ java.lang.String | scala.Null) => scala.Unit = null,
    onCharacter: (/* start */ scala.Double, /* end */ scala.Double, /* value */ scala.Double) => scala.Unit = null,
    onCharacterClassEnter: (/* start */ scala.Double, /* negate */ scala.Boolean) => scala.Unit = null,
    onCharacterClassLeave: (/* start */ scala.Double, /* end */ scala.Double, /* negate */ scala.Boolean) => scala.Unit = null,
    onCharacterClassRange: (/* start */ scala.Double, /* end */ scala.Double, /* min */ scala.Double, /* max */ scala.Double) => scala.Unit = null,
    onDisjunctionEnter: /* start */ scala.Double => scala.Unit = null,
    onDisjunctionLeave: (/* start */ scala.Double, /* end */ scala.Double) => scala.Unit = null,
    onEdgeAssertion: (/* start */ scala.Double, /* end */ scala.Double, /* kind */ regexppLib.regexppLibStrings.start | regexppLib.regexppLibStrings.end) => scala.Unit = null,
    onEscapeCharacterSet: (/* start */ scala.Double, /* end */ scala.Double, /* kind */ regexppLib.regexppLibStrings.digit | regexppLib.regexppLibStrings.space | regexppLib.regexppLibStrings.word, /* negate */ scala.Boolean) => scala.Unit = null,
    onFlags: (/* start */ scala.Double, /* end */ scala.Double, /* global */ scala.Boolean, /* ignoreCase */ scala.Boolean, /* multiline */ scala.Boolean, /* unicode */ scala.Boolean, /* sticky */ scala.Boolean, /* dotAll */ scala.Boolean) => scala.Unit = null,
    onGroupEnter: /* start */ scala.Double => scala.Unit = null,
    onGroupLeave: (/* start */ scala.Double, /* end */ scala.Double) => scala.Unit = null,
    onLiteralEnter: /* start */ scala.Double => scala.Unit = null,
    onLiteralLeave: (/* start */ scala.Double, /* end */ scala.Double) => scala.Unit = null,
    onLookaroundAssertionEnter: (/* start */ scala.Double, /* kind */ regexppLib.regexppLibStrings.lookahead | regexppLib.regexppLibStrings.lookbehind, /* negate */ scala.Boolean) => scala.Unit = null,
    onLookaroundAssertionLeave: (/* start */ scala.Double, /* end */ scala.Double, /* kind */ regexppLib.regexppLibStrings.lookahead | regexppLib.regexppLibStrings.lookbehind, /* negate */ scala.Boolean) => scala.Unit = null,
    onPatternEnter: /* start */ scala.Double => scala.Unit = null,
    onPatternLeave: (/* start */ scala.Double, /* end */ scala.Double) => scala.Unit = null,
    onQuantifier: (/* start */ scala.Double, /* end */ scala.Double, /* min */ scala.Double, /* max */ scala.Double, /* greedy */ scala.Boolean) => scala.Unit = null,
    onUnicodePropertyCharacterSet: (/* start */ scala.Double, /* end */ scala.Double, regexppLib.regexppLibStrings.property, /* key */ java.lang.String, /* value */ java.lang.String | scala.Null, /* negate */ scala.Boolean) => scala.Unit = null,
    onWordBoundaryAssertion: (/* start */ scala.Double, /* end */ scala.Double, regexppLib.regexppLibStrings.word, /* negate */ scala.Boolean) => scala.Unit = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
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

