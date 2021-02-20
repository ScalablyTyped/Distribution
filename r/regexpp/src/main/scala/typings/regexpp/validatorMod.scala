package typings.regexpp

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
import typings.regexpp.validatorMod.RegExpValidator.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorMod {
  
  @JSImport("regexpp/validator", "RegExpValidator")
  @js.native
  class RegExpValidator () extends StObject {
    def this(options: Options) = this()
    
    def validateFlags(source: String): Unit = js.native
    def validateFlags(source: String, start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
    def validateFlags(source: String, start: Double): Unit = js.native
    def validateFlags(source: String, start: Double, end: Double): Unit = js.native
    
    def validateLiteral(source: String): Unit = js.native
    def validateLiteral(source: String, start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
    def validateLiteral(source: String, start: Double): Unit = js.native
    def validateLiteral(source: String, start: Double, end: Double): Unit = js.native
    
    def validatePattern(source: String): Unit = js.native
    def validatePattern(source: String, start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], uFlag: Boolean): Unit = js.native
    def validatePattern(source: String, start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
    def validatePattern(source: String, start: js.UndefOr[scala.Nothing], end: Double, uFlag: Boolean): Unit = js.native
    def validatePattern(source: String, start: Double): Unit = js.native
    def validatePattern(source: String, start: Double, end: js.UndefOr[scala.Nothing], uFlag: Boolean): Unit = js.native
    def validatePattern(source: String, start: Double, end: Double): Unit = js.native
    def validatePattern(source: String, start: Double, end: Double, uFlag: Boolean): Unit = js.native
  }
  object RegExpValidator {
    
    @js.native
    trait Options extends StObject {
      
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
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEcmaVersion(value: EcmaVersion): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEcmaVersionUndefined: Self = StObject.set(x, "ecmaVersion", js.undefined)
        
        @scala.inline
        def setOnAlternativeEnter(value: (/* start */ Double, /* index */ Double) => Unit): Self = StObject.set(x, "onAlternativeEnter", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnAlternativeEnterUndefined: Self = StObject.set(x, "onAlternativeEnter", js.undefined)
        
        @scala.inline
        def setOnAlternativeLeave(value: (/* start */ Double, /* end */ Double, /* index */ Double) => Unit): Self = StObject.set(x, "onAlternativeLeave", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnAlternativeLeaveUndefined: Self = StObject.set(x, "onAlternativeLeave", js.undefined)
        
        @scala.inline
        def setOnAnyCharacterSet(value: (/* start */ Double, /* end */ Double, any) => Unit): Self = StObject.set(x, "onAnyCharacterSet", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnAnyCharacterSetUndefined: Self = StObject.set(x, "onAnyCharacterSet", js.undefined)
        
        @scala.inline
        def setOnBackreference(value: (/* start */ Double, /* end */ Double, /* ref */ Double | String) => Unit): Self = StObject.set(x, "onBackreference", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnBackreferenceUndefined: Self = StObject.set(x, "onBackreference", js.undefined)
        
        @scala.inline
        def setOnCapturingGroupEnter(value: (/* start */ Double, /* name */ String | Null) => Unit): Self = StObject.set(x, "onCapturingGroupEnter", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnCapturingGroupEnterUndefined: Self = StObject.set(x, "onCapturingGroupEnter", js.undefined)
        
        @scala.inline
        def setOnCapturingGroupLeave(value: (/* start */ Double, /* end */ Double, /* name */ String | Null) => Unit): Self = StObject.set(x, "onCapturingGroupLeave", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnCapturingGroupLeaveUndefined: Self = StObject.set(x, "onCapturingGroupLeave", js.undefined)
        
        @scala.inline
        def setOnCharacter(value: (/* start */ Double, /* end */ Double, /* value */ Double) => Unit): Self = StObject.set(x, "onCharacter", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnCharacterClassEnter(value: (/* start */ Double, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onCharacterClassEnter", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnCharacterClassEnterUndefined: Self = StObject.set(x, "onCharacterClassEnter", js.undefined)
        
        @scala.inline
        def setOnCharacterClassLeave(value: (/* start */ Double, /* end */ Double, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onCharacterClassLeave", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnCharacterClassLeaveUndefined: Self = StObject.set(x, "onCharacterClassLeave", js.undefined)
        
        @scala.inline
        def setOnCharacterClassRange(value: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double) => Unit): Self = StObject.set(x, "onCharacterClassRange", js.Any.fromFunction4(value))
        
        @scala.inline
        def setOnCharacterClassRangeUndefined: Self = StObject.set(x, "onCharacterClassRange", js.undefined)
        
        @scala.inline
        def setOnCharacterUndefined: Self = StObject.set(x, "onCharacter", js.undefined)
        
        @scala.inline
        def setOnDisjunctionEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onDisjunctionEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDisjunctionEnterUndefined: Self = StObject.set(x, "onDisjunctionEnter", js.undefined)
        
        @scala.inline
        def setOnDisjunctionLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onDisjunctionLeave", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnDisjunctionLeaveUndefined: Self = StObject.set(x, "onDisjunctionLeave", js.undefined)
        
        @scala.inline
        def setOnEdgeAssertion(value: (/* start */ Double, /* end */ Double, /* kind */ start | end) => Unit): Self = StObject.set(x, "onEdgeAssertion", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnEdgeAssertionUndefined: Self = StObject.set(x, "onEdgeAssertion", js.undefined)
        
        @scala.inline
        def setOnEscapeCharacterSet(
          value: (/* start */ Double, /* end */ Double, /* kind */ digit | space | word, /* negate */ Boolean) => Unit
        ): Self = StObject.set(x, "onEscapeCharacterSet", js.Any.fromFunction4(value))
        
        @scala.inline
        def setOnEscapeCharacterSetUndefined: Self = StObject.set(x, "onEscapeCharacterSet", js.undefined)
        
        @scala.inline
        def setOnFlags(
          value: (/* start */ Double, /* end */ Double, /* global */ Boolean, /* ignoreCase */ Boolean, /* multiline */ Boolean, /* unicode */ Boolean, /* sticky */ Boolean, /* dotAll */ Boolean) => Unit
        ): Self = StObject.set(x, "onFlags", js.Any.fromFunction8(value))
        
        @scala.inline
        def setOnFlagsUndefined: Self = StObject.set(x, "onFlags", js.undefined)
        
        @scala.inline
        def setOnGroupEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onGroupEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnGroupEnterUndefined: Self = StObject.set(x, "onGroupEnter", js.undefined)
        
        @scala.inline
        def setOnGroupLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onGroupLeave", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnGroupLeaveUndefined: Self = StObject.set(x, "onGroupLeave", js.undefined)
        
        @scala.inline
        def setOnLiteralEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onLiteralEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnLiteralEnterUndefined: Self = StObject.set(x, "onLiteralEnter", js.undefined)
        
        @scala.inline
        def setOnLiteralLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onLiteralLeave", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnLiteralLeaveUndefined: Self = StObject.set(x, "onLiteralLeave", js.undefined)
        
        @scala.inline
        def setOnLookaroundAssertionEnter(value: (/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onLookaroundAssertionEnter", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnLookaroundAssertionEnterUndefined: Self = StObject.set(x, "onLookaroundAssertionEnter", js.undefined)
        
        @scala.inline
        def setOnLookaroundAssertionLeave(
          value: (/* start */ Double, /* end */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit
        ): Self = StObject.set(x, "onLookaroundAssertionLeave", js.Any.fromFunction4(value))
        
        @scala.inline
        def setOnLookaroundAssertionLeaveUndefined: Self = StObject.set(x, "onLookaroundAssertionLeave", js.undefined)
        
        @scala.inline
        def setOnPatternEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onPatternEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPatternEnterUndefined: Self = StObject.set(x, "onPatternEnter", js.undefined)
        
        @scala.inline
        def setOnPatternLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onPatternLeave", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnPatternLeaveUndefined: Self = StObject.set(x, "onPatternLeave", js.undefined)
        
        @scala.inline
        def setOnQuantifier(
          value: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, /* greedy */ Boolean) => Unit
        ): Self = StObject.set(x, "onQuantifier", js.Any.fromFunction5(value))
        
        @scala.inline
        def setOnQuantifierUndefined: Self = StObject.set(x, "onQuantifier", js.undefined)
        
        @scala.inline
        def setOnUnicodePropertyCharacterSet(
          value: (/* start */ Double, /* end */ Double, property, /* key */ String, /* value */ String | Null, /* negate */ Boolean) => Unit
        ): Self = StObject.set(x, "onUnicodePropertyCharacterSet", js.Any.fromFunction6(value))
        
        @scala.inline
        def setOnUnicodePropertyCharacterSetUndefined: Self = StObject.set(x, "onUnicodePropertyCharacterSet", js.undefined)
        
        @scala.inline
        def setOnWordBoundaryAssertion(value: (/* start */ Double, /* end */ Double, word, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onWordBoundaryAssertion", js.Any.fromFunction4(value))
        
        @scala.inline
        def setOnWordBoundaryAssertionUndefined: Self = StObject.set(x, "onWordBoundaryAssertion", js.undefined)
        
        @scala.inline
        def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
  }
}
