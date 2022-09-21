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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorMod {
  
  @JSImport("regexpp/validator", "RegExpValidator")
  @js.native
  open class RegExpValidator () extends StObject {
    def this(options: Options) = this()
    
    def validateFlags(source: String): Unit = js.native
    def validateFlags(source: String, start: Double): Unit = js.native
    def validateFlags(source: String, start: Double, end: Double): Unit = js.native
    def validateFlags(source: String, start: Unit, end: Double): Unit = js.native
    
    def validateLiteral(source: String): Unit = js.native
    def validateLiteral(source: String, start: Double): Unit = js.native
    def validateLiteral(source: String, start: Double, end: Double): Unit = js.native
    def validateLiteral(source: String, start: Unit, end: Double): Unit = js.native
    
    def validatePattern(source: String): Unit = js.native
    def validatePattern(source: String, start: Double): Unit = js.native
    def validatePattern(source: String, start: Double, end: Double): Unit = js.native
    def validatePattern(source: String, start: Double, end: Double, uFlag: Boolean): Unit = js.native
    def validatePattern(source: String, start: Double, end: Unit, uFlag: Boolean): Unit = js.native
    def validatePattern(source: String, start: Unit, end: Double): Unit = js.native
    def validatePattern(source: String, start: Unit, end: Double, uFlag: Boolean): Unit = js.native
    def validatePattern(source: String, start: Unit, end: Unit, uFlag: Boolean): Unit = js.native
  }
  object RegExpValidator {
    
    trait Options extends StObject {
      
      var ecmaVersion: js.UndefOr[EcmaVersion] = js.undefined
      
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
            js.Function9[
              /* start */ Double, 
              /* end */ Double, 
              /* global */ Boolean, 
              /* ignoreCase */ Boolean, 
              /* multiline */ Boolean, 
              /* unicode */ Boolean, 
              /* sticky */ Boolean, 
              /* dotAll */ Boolean, 
              /* hasIndices */ Boolean, 
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
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setEcmaVersion(value: EcmaVersion): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
        
        inline def setEcmaVersionUndefined: Self = StObject.set(x, "ecmaVersion", js.undefined)
        
        inline def setOnAlternativeEnter(value: (/* start */ Double, /* index */ Double) => Unit): Self = StObject.set(x, "onAlternativeEnter", js.Any.fromFunction2(value))
        
        inline def setOnAlternativeEnterUndefined: Self = StObject.set(x, "onAlternativeEnter", js.undefined)
        
        inline def setOnAlternativeLeave(value: (/* start */ Double, /* end */ Double, /* index */ Double) => Unit): Self = StObject.set(x, "onAlternativeLeave", js.Any.fromFunction3(value))
        
        inline def setOnAlternativeLeaveUndefined: Self = StObject.set(x, "onAlternativeLeave", js.undefined)
        
        inline def setOnAnyCharacterSet(value: (/* start */ Double, /* end */ Double, any) => Unit): Self = StObject.set(x, "onAnyCharacterSet", js.Any.fromFunction3(value))
        
        inline def setOnAnyCharacterSetUndefined: Self = StObject.set(x, "onAnyCharacterSet", js.undefined)
        
        inline def setOnBackreference(value: (/* start */ Double, /* end */ Double, /* ref */ Double | String) => Unit): Self = StObject.set(x, "onBackreference", js.Any.fromFunction3(value))
        
        inline def setOnBackreferenceUndefined: Self = StObject.set(x, "onBackreference", js.undefined)
        
        inline def setOnCapturingGroupEnter(value: (/* start */ Double, /* name */ String | Null) => Unit): Self = StObject.set(x, "onCapturingGroupEnter", js.Any.fromFunction2(value))
        
        inline def setOnCapturingGroupEnterUndefined: Self = StObject.set(x, "onCapturingGroupEnter", js.undefined)
        
        inline def setOnCapturingGroupLeave(value: (/* start */ Double, /* end */ Double, /* name */ String | Null) => Unit): Self = StObject.set(x, "onCapturingGroupLeave", js.Any.fromFunction3(value))
        
        inline def setOnCapturingGroupLeaveUndefined: Self = StObject.set(x, "onCapturingGroupLeave", js.undefined)
        
        inline def setOnCharacter(value: (/* start */ Double, /* end */ Double, /* value */ Double) => Unit): Self = StObject.set(x, "onCharacter", js.Any.fromFunction3(value))
        
        inline def setOnCharacterClassEnter(value: (/* start */ Double, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onCharacterClassEnter", js.Any.fromFunction2(value))
        
        inline def setOnCharacterClassEnterUndefined: Self = StObject.set(x, "onCharacterClassEnter", js.undefined)
        
        inline def setOnCharacterClassLeave(value: (/* start */ Double, /* end */ Double, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onCharacterClassLeave", js.Any.fromFunction3(value))
        
        inline def setOnCharacterClassLeaveUndefined: Self = StObject.set(x, "onCharacterClassLeave", js.undefined)
        
        inline def setOnCharacterClassRange(value: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double) => Unit): Self = StObject.set(x, "onCharacterClassRange", js.Any.fromFunction4(value))
        
        inline def setOnCharacterClassRangeUndefined: Self = StObject.set(x, "onCharacterClassRange", js.undefined)
        
        inline def setOnCharacterUndefined: Self = StObject.set(x, "onCharacter", js.undefined)
        
        inline def setOnDisjunctionEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onDisjunctionEnter", js.Any.fromFunction1(value))
        
        inline def setOnDisjunctionEnterUndefined: Self = StObject.set(x, "onDisjunctionEnter", js.undefined)
        
        inline def setOnDisjunctionLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onDisjunctionLeave", js.Any.fromFunction2(value))
        
        inline def setOnDisjunctionLeaveUndefined: Self = StObject.set(x, "onDisjunctionLeave", js.undefined)
        
        inline def setOnEdgeAssertion(value: (/* start */ Double, /* end */ Double, /* kind */ start | end) => Unit): Self = StObject.set(x, "onEdgeAssertion", js.Any.fromFunction3(value))
        
        inline def setOnEdgeAssertionUndefined: Self = StObject.set(x, "onEdgeAssertion", js.undefined)
        
        inline def setOnEscapeCharacterSet(
          value: (/* start */ Double, /* end */ Double, /* kind */ digit | space | word, /* negate */ Boolean) => Unit
        ): Self = StObject.set(x, "onEscapeCharacterSet", js.Any.fromFunction4(value))
        
        inline def setOnEscapeCharacterSetUndefined: Self = StObject.set(x, "onEscapeCharacterSet", js.undefined)
        
        inline def setOnFlags(
          value: (/* start */ Double, /* end */ Double, /* global */ Boolean, /* ignoreCase */ Boolean, /* multiline */ Boolean, /* unicode */ Boolean, /* sticky */ Boolean, /* dotAll */ Boolean, /* hasIndices */ Boolean) => Unit
        ): Self = StObject.set(x, "onFlags", js.Any.fromFunction9(value))
        
        inline def setOnFlagsUndefined: Self = StObject.set(x, "onFlags", js.undefined)
        
        inline def setOnGroupEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onGroupEnter", js.Any.fromFunction1(value))
        
        inline def setOnGroupEnterUndefined: Self = StObject.set(x, "onGroupEnter", js.undefined)
        
        inline def setOnGroupLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onGroupLeave", js.Any.fromFunction2(value))
        
        inline def setOnGroupLeaveUndefined: Self = StObject.set(x, "onGroupLeave", js.undefined)
        
        inline def setOnLiteralEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onLiteralEnter", js.Any.fromFunction1(value))
        
        inline def setOnLiteralEnterUndefined: Self = StObject.set(x, "onLiteralEnter", js.undefined)
        
        inline def setOnLiteralLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onLiteralLeave", js.Any.fromFunction2(value))
        
        inline def setOnLiteralLeaveUndefined: Self = StObject.set(x, "onLiteralLeave", js.undefined)
        
        inline def setOnLookaroundAssertionEnter(value: (/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onLookaroundAssertionEnter", js.Any.fromFunction3(value))
        
        inline def setOnLookaroundAssertionEnterUndefined: Self = StObject.set(x, "onLookaroundAssertionEnter", js.undefined)
        
        inline def setOnLookaroundAssertionLeave(
          value: (/* start */ Double, /* end */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit
        ): Self = StObject.set(x, "onLookaroundAssertionLeave", js.Any.fromFunction4(value))
        
        inline def setOnLookaroundAssertionLeaveUndefined: Self = StObject.set(x, "onLookaroundAssertionLeave", js.undefined)
        
        inline def setOnPatternEnter(value: /* start */ Double => Unit): Self = StObject.set(x, "onPatternEnter", js.Any.fromFunction1(value))
        
        inline def setOnPatternEnterUndefined: Self = StObject.set(x, "onPatternEnter", js.undefined)
        
        inline def setOnPatternLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "onPatternLeave", js.Any.fromFunction2(value))
        
        inline def setOnPatternLeaveUndefined: Self = StObject.set(x, "onPatternLeave", js.undefined)
        
        inline def setOnQuantifier(
          value: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, /* greedy */ Boolean) => Unit
        ): Self = StObject.set(x, "onQuantifier", js.Any.fromFunction5(value))
        
        inline def setOnQuantifierUndefined: Self = StObject.set(x, "onQuantifier", js.undefined)
        
        inline def setOnUnicodePropertyCharacterSet(
          value: (/* start */ Double, /* end */ Double, property, /* key */ String, /* value */ String | Null, /* negate */ Boolean) => Unit
        ): Self = StObject.set(x, "onUnicodePropertyCharacterSet", js.Any.fromFunction6(value))
        
        inline def setOnUnicodePropertyCharacterSetUndefined: Self = StObject.set(x, "onUnicodePropertyCharacterSet", js.undefined)
        
        inline def setOnWordBoundaryAssertion(value: (/* start */ Double, /* end */ Double, word, /* negate */ Boolean) => Unit): Self = StObject.set(x, "onWordBoundaryAssertion", js.Any.fromFunction4(value))
        
        inline def setOnWordBoundaryAssertionUndefined: Self = StObject.set(x, "onWordBoundaryAssertion", js.undefined)
        
        inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
  }
}
