package typings.regexpp.validatorMod.RegExpValidator

import typings.regexpp.ecmaVersionsMod.EcmaVersion
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var ecmaVersion: js.UndefOr[EcmaVersion] = js.native
  
  var onAlternativeEnter: js.UndefOr[js.Function2[/* start */ Double, /* index */ Double, Unit]] = js.native
  
  var onAlternativeLeave: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* index */ Double, Unit]] = js.native
  
  var onAnyCharacterSet: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, any, Unit]] = js.native
  
  var onBackreference: js.UndefOr[
    js.Function3[/* start */ Double, /* end */ Double, /* ref */ Double | String, Unit]
  ] = js.native
  
  var onCapturingGroupEnter: js.UndefOr[js.Function2[/* start */ Double, /* name */ String | Null, Unit]] = js.native
  
  var onCapturingGroupLeave: js.UndefOr[
    js.Function3[/* start */ Double, /* end */ Double, /* name */ String | Null, Unit]
  ] = js.native
  
  var onCharacter: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* value */ Double, Unit]] = js.native
  
  var onCharacterClassEnter: js.UndefOr[js.Function2[/* start */ Double, /* negate */ Boolean, Unit]] = js.native
  
  var onCharacterClassLeave: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* negate */ Boolean, Unit]] = js.native
  
  var onCharacterClassRange: js.UndefOr[
    js.Function4[/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, Unit]
  ] = js.native
  
  var onDisjunctionEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.native
  
  var onDisjunctionLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.native
  
  var onEdgeAssertion: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* kind */ start | end, Unit]] = js.native
  
  var onEscapeCharacterSet: js.UndefOr[
    js.Function4[
      /* start */ Double, 
      /* end */ Double, 
      /* kind */ digit | space | word, 
      /* negate */ Boolean, 
      Unit
    ]
  ] = js.native
  
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
  ] = js.native
  
  var onGroupEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.native
  
  var onGroupLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.native
  
  var onLiteralEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.native
  
  var onLiteralLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.native
  
  var onLookaroundAssertionEnter: js.UndefOr[
    js.Function3[/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean, Unit]
  ] = js.native
  
  var onLookaroundAssertionLeave: js.UndefOr[
    js.Function4[
      /* start */ Double, 
      /* end */ Double, 
      /* kind */ lookahead | lookbehind, 
      /* negate */ Boolean, 
      Unit
    ]
  ] = js.native
  
  var onPatternEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.native
  
  var onPatternLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.native
  
  var onQuantifier: js.UndefOr[
    js.Function5[
      /* start */ Double, 
      /* end */ Double, 
      /* min */ Double, 
      /* max */ Double, 
      /* greedy */ Boolean, 
      Unit
    ]
  ] = js.native
  
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
  ] = js.native
  
  var onWordBoundaryAssertion: js.UndefOr[
    js.Function4[/* start */ Double, /* end */ Double, word, /* negate */ Boolean, Unit]
  ] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setEcmaVersion(value: EcmaVersion): Self = this.set("ecmaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcmaVersion: Self = this.set("ecmaVersion", js.undefined)
    
    @scala.inline
    def setOnAlternativeEnter(value: (/* start */ Double, /* index */ Double) => Unit): Self = this.set("onAlternativeEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAlternativeEnter: Self = this.set("onAlternativeEnter", js.undefined)
    
    @scala.inline
    def setOnAlternativeLeave(value: (/* start */ Double, /* end */ Double, /* index */ Double) => Unit): Self = this.set("onAlternativeLeave", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnAlternativeLeave: Self = this.set("onAlternativeLeave", js.undefined)
    
    @scala.inline
    def setOnAnyCharacterSet(value: (/* start */ Double, /* end */ Double, any) => Unit): Self = this.set("onAnyCharacterSet", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnAnyCharacterSet: Self = this.set("onAnyCharacterSet", js.undefined)
    
    @scala.inline
    def setOnBackreference(value: (/* start */ Double, /* end */ Double, /* ref */ Double | String) => Unit): Self = this.set("onBackreference", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnBackreference: Self = this.set("onBackreference", js.undefined)
    
    @scala.inline
    def setOnCapturingGroupEnter(value: (/* start */ Double, /* name */ String | Null) => Unit): Self = this.set("onCapturingGroupEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCapturingGroupEnter: Self = this.set("onCapturingGroupEnter", js.undefined)
    
    @scala.inline
    def setOnCapturingGroupLeave(value: (/* start */ Double, /* end */ Double, /* name */ String | Null) => Unit): Self = this.set("onCapturingGroupLeave", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnCapturingGroupLeave: Self = this.set("onCapturingGroupLeave", js.undefined)
    
    @scala.inline
    def setOnCharacter(value: (/* start */ Double, /* end */ Double, /* value */ Double) => Unit): Self = this.set("onCharacter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnCharacter: Self = this.set("onCharacter", js.undefined)
    
    @scala.inline
    def setOnCharacterClassEnter(value: (/* start */ Double, /* negate */ Boolean) => Unit): Self = this.set("onCharacterClassEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCharacterClassEnter: Self = this.set("onCharacterClassEnter", js.undefined)
    
    @scala.inline
    def setOnCharacterClassLeave(value: (/* start */ Double, /* end */ Double, /* negate */ Boolean) => Unit): Self = this.set("onCharacterClassLeave", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnCharacterClassLeave: Self = this.set("onCharacterClassLeave", js.undefined)
    
    @scala.inline
    def setOnCharacterClassRange(value: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double) => Unit): Self = this.set("onCharacterClassRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnCharacterClassRange: Self = this.set("onCharacterClassRange", js.undefined)
    
    @scala.inline
    def setOnDisjunctionEnter(value: /* start */ Double => Unit): Self = this.set("onDisjunctionEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDisjunctionEnter: Self = this.set("onDisjunctionEnter", js.undefined)
    
    @scala.inline
    def setOnDisjunctionLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = this.set("onDisjunctionLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDisjunctionLeave: Self = this.set("onDisjunctionLeave", js.undefined)
    
    @scala.inline
    def setOnEdgeAssertion(value: (/* start */ Double, /* end */ Double, /* kind */ start | end) => Unit): Self = this.set("onEdgeAssertion", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnEdgeAssertion: Self = this.set("onEdgeAssertion", js.undefined)
    
    @scala.inline
    def setOnEscapeCharacterSet(
      value: (/* start */ Double, /* end */ Double, /* kind */ digit | space | word, /* negate */ Boolean) => Unit
    ): Self = this.set("onEscapeCharacterSet", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnEscapeCharacterSet: Self = this.set("onEscapeCharacterSet", js.undefined)
    
    @scala.inline
    def setOnFlags(
      value: (/* start */ Double, /* end */ Double, /* global */ Boolean, /* ignoreCase */ Boolean, /* multiline */ Boolean, /* unicode */ Boolean, /* sticky */ Boolean, /* dotAll */ Boolean) => Unit
    ): Self = this.set("onFlags", js.Any.fromFunction8(value))
    
    @scala.inline
    def deleteOnFlags: Self = this.set("onFlags", js.undefined)
    
    @scala.inline
    def setOnGroupEnter(value: /* start */ Double => Unit): Self = this.set("onGroupEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGroupEnter: Self = this.set("onGroupEnter", js.undefined)
    
    @scala.inline
    def setOnGroupLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = this.set("onGroupLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnGroupLeave: Self = this.set("onGroupLeave", js.undefined)
    
    @scala.inline
    def setOnLiteralEnter(value: /* start */ Double => Unit): Self = this.set("onLiteralEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLiteralEnter: Self = this.set("onLiteralEnter", js.undefined)
    
    @scala.inline
    def setOnLiteralLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = this.set("onLiteralLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnLiteralLeave: Self = this.set("onLiteralLeave", js.undefined)
    
    @scala.inline
    def setOnLookaroundAssertionEnter(value: (/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit): Self = this.set("onLookaroundAssertionEnter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnLookaroundAssertionEnter: Self = this.set("onLookaroundAssertionEnter", js.undefined)
    
    @scala.inline
    def setOnLookaroundAssertionLeave(
      value: (/* start */ Double, /* end */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit
    ): Self = this.set("onLookaroundAssertionLeave", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnLookaroundAssertionLeave: Self = this.set("onLookaroundAssertionLeave", js.undefined)
    
    @scala.inline
    def setOnPatternEnter(value: /* start */ Double => Unit): Self = this.set("onPatternEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPatternEnter: Self = this.set("onPatternEnter", js.undefined)
    
    @scala.inline
    def setOnPatternLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = this.set("onPatternLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPatternLeave: Self = this.set("onPatternLeave", js.undefined)
    
    @scala.inline
    def setOnQuantifier(
      value: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, /* greedy */ Boolean) => Unit
    ): Self = this.set("onQuantifier", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnQuantifier: Self = this.set("onQuantifier", js.undefined)
    
    @scala.inline
    def setOnUnicodePropertyCharacterSet(
      value: (/* start */ Double, /* end */ Double, property, /* key */ String, /* value */ String | Null, /* negate */ Boolean) => Unit
    ): Self = this.set("onUnicodePropertyCharacterSet", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteOnUnicodePropertyCharacterSet: Self = this.set("onUnicodePropertyCharacterSet", js.undefined)
    
    @scala.inline
    def setOnWordBoundaryAssertion(value: (/* start */ Double, /* end */ Double, word, /* negate */ Boolean) => Unit): Self = this.set("onWordBoundaryAssertion", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnWordBoundaryAssertion: Self = this.set("onWordBoundaryAssertion", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
