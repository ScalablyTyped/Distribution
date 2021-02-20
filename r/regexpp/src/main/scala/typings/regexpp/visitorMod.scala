package typings.regexpp

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
import typings.regexpp.astMod.Node
import typings.regexpp.astMod.Pattern
import typings.regexpp.astMod.Quantifier
import typings.regexpp.astMod.RegExpLiteral
import typings.regexpp.visitorMod.RegExpVisitor.Handlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visitorMod {
  
  @JSImport("regexpp/visitor", "RegExpVisitor")
  @js.native
  class RegExpVisitor protected () extends StObject {
    def this(handlers: Handlers) = this()
    
    def visit(node: Node): Unit = js.native
  }
  object RegExpVisitor {
    
    @js.native
    trait Handlers extends StObject {
      
      var onAlternativeEnter: js.UndefOr[js.Function1[/* node */ Alternative, Unit]] = js.native
      
      var onAlternativeLeave: js.UndefOr[js.Function1[/* node */ Alternative, Unit]] = js.native
      
      var onAssertionEnter: js.UndefOr[js.Function1[/* node */ Assertion, Unit]] = js.native
      
      var onAssertionLeave: js.UndefOr[js.Function1[/* node */ Assertion, Unit]] = js.native
      
      var onBackreferenceEnter: js.UndefOr[js.Function1[/* node */ Backreference, Unit]] = js.native
      
      var onBackreferenceLeave: js.UndefOr[js.Function1[/* node */ Backreference, Unit]] = js.native
      
      var onCapturingGroupEnter: js.UndefOr[js.Function1[/* node */ CapturingGroup, Unit]] = js.native
      
      var onCapturingGroupLeave: js.UndefOr[js.Function1[/* node */ CapturingGroup, Unit]] = js.native
      
      var onCharacterClassEnter: js.UndefOr[js.Function1[/* node */ CharacterClass, Unit]] = js.native
      
      var onCharacterClassLeave: js.UndefOr[js.Function1[/* node */ CharacterClass, Unit]] = js.native
      
      var onCharacterClassRangeEnter: js.UndefOr[js.Function1[/* node */ CharacterClassRange, Unit]] = js.native
      
      var onCharacterClassRangeLeave: js.UndefOr[js.Function1[/* node */ CharacterClassRange, Unit]] = js.native
      
      var onCharacterEnter: js.UndefOr[js.Function1[/* node */ Character, Unit]] = js.native
      
      var onCharacterLeave: js.UndefOr[js.Function1[/* node */ Character, Unit]] = js.native
      
      var onCharacterSetEnter: js.UndefOr[js.Function1[/* node */ CharacterSet, Unit]] = js.native
      
      var onCharacterSetLeave: js.UndefOr[js.Function1[/* node */ CharacterSet, Unit]] = js.native
      
      var onFlagsEnter: js.UndefOr[js.Function1[/* node */ Flags, Unit]] = js.native
      
      var onFlagsLeave: js.UndefOr[js.Function1[/* node */ Flags, Unit]] = js.native
      
      var onGroupEnter: js.UndefOr[js.Function1[/* node */ Group, Unit]] = js.native
      
      var onGroupLeave: js.UndefOr[js.Function1[/* node */ Group, Unit]] = js.native
      
      var onPatternEnter: js.UndefOr[js.Function1[/* node */ Pattern, Unit]] = js.native
      
      var onPatternLeave: js.UndefOr[js.Function1[/* node */ Pattern, Unit]] = js.native
      
      var onQuantifierEnter: js.UndefOr[js.Function1[/* node */ Quantifier, Unit]] = js.native
      
      var onQuantifierLeave: js.UndefOr[js.Function1[/* node */ Quantifier, Unit]] = js.native
      
      var onRegExpLiteralEnter: js.UndefOr[js.Function1[/* node */ RegExpLiteral, Unit]] = js.native
      
      var onRegExpLiteralLeave: js.UndefOr[js.Function1[/* node */ RegExpLiteral, Unit]] = js.native
    }
    object Handlers {
      
      @scala.inline
      def apply(): Handlers = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Handlers]
      }
      
      @scala.inline
      implicit class HandlersMutableBuilder[Self <: Handlers] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnAlternativeEnter(value: /* node */ Alternative => Unit): Self = StObject.set(x, "onAlternativeEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnAlternativeEnterUndefined: Self = StObject.set(x, "onAlternativeEnter", js.undefined)
        
        @scala.inline
        def setOnAlternativeLeave(value: /* node */ Alternative => Unit): Self = StObject.set(x, "onAlternativeLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnAlternativeLeaveUndefined: Self = StObject.set(x, "onAlternativeLeave", js.undefined)
        
        @scala.inline
        def setOnAssertionEnter(value: /* node */ Assertion => Unit): Self = StObject.set(x, "onAssertionEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnAssertionEnterUndefined: Self = StObject.set(x, "onAssertionEnter", js.undefined)
        
        @scala.inline
        def setOnAssertionLeave(value: /* node */ Assertion => Unit): Self = StObject.set(x, "onAssertionLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnAssertionLeaveUndefined: Self = StObject.set(x, "onAssertionLeave", js.undefined)
        
        @scala.inline
        def setOnBackreferenceEnter(value: /* node */ Backreference => Unit): Self = StObject.set(x, "onBackreferenceEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnBackreferenceEnterUndefined: Self = StObject.set(x, "onBackreferenceEnter", js.undefined)
        
        @scala.inline
        def setOnBackreferenceLeave(value: /* node */ Backreference => Unit): Self = StObject.set(x, "onBackreferenceLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnBackreferenceLeaveUndefined: Self = StObject.set(x, "onBackreferenceLeave", js.undefined)
        
        @scala.inline
        def setOnCapturingGroupEnter(value: /* node */ CapturingGroup => Unit): Self = StObject.set(x, "onCapturingGroupEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCapturingGroupEnterUndefined: Self = StObject.set(x, "onCapturingGroupEnter", js.undefined)
        
        @scala.inline
        def setOnCapturingGroupLeave(value: /* node */ CapturingGroup => Unit): Self = StObject.set(x, "onCapturingGroupLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCapturingGroupLeaveUndefined: Self = StObject.set(x, "onCapturingGroupLeave", js.undefined)
        
        @scala.inline
        def setOnCharacterClassEnter(value: /* node */ CharacterClass => Unit): Self = StObject.set(x, "onCharacterClassEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCharacterClassEnterUndefined: Self = StObject.set(x, "onCharacterClassEnter", js.undefined)
        
        @scala.inline
        def setOnCharacterClassLeave(value: /* node */ CharacterClass => Unit): Self = StObject.set(x, "onCharacterClassLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCharacterClassLeaveUndefined: Self = StObject.set(x, "onCharacterClassLeave", js.undefined)
        
        @scala.inline
        def setOnCharacterClassRangeEnter(value: /* node */ CharacterClassRange => Unit): Self = StObject.set(x, "onCharacterClassRangeEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCharacterClassRangeEnterUndefined: Self = StObject.set(x, "onCharacterClassRangeEnter", js.undefined)
        
        @scala.inline
        def setOnCharacterClassRangeLeave(value: /* node */ CharacterClassRange => Unit): Self = StObject.set(x, "onCharacterClassRangeLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCharacterClassRangeLeaveUndefined: Self = StObject.set(x, "onCharacterClassRangeLeave", js.undefined)
        
        @scala.inline
        def setOnCharacterEnter(value: /* node */ Character => Unit): Self = StObject.set(x, "onCharacterEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCharacterEnterUndefined: Self = StObject.set(x, "onCharacterEnter", js.undefined)
        
        @scala.inline
        def setOnCharacterLeave(value: /* node */ Character => Unit): Self = StObject.set(x, "onCharacterLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCharacterLeaveUndefined: Self = StObject.set(x, "onCharacterLeave", js.undefined)
        
        @scala.inline
        def setOnCharacterSetEnter(value: /* node */ CharacterSet => Unit): Self = StObject.set(x, "onCharacterSetEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCharacterSetEnterUndefined: Self = StObject.set(x, "onCharacterSetEnter", js.undefined)
        
        @scala.inline
        def setOnCharacterSetLeave(value: /* node */ CharacterSet => Unit): Self = StObject.set(x, "onCharacterSetLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCharacterSetLeaveUndefined: Self = StObject.set(x, "onCharacterSetLeave", js.undefined)
        
        @scala.inline
        def setOnFlagsEnter(value: /* node */ Flags => Unit): Self = StObject.set(x, "onFlagsEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnFlagsEnterUndefined: Self = StObject.set(x, "onFlagsEnter", js.undefined)
        
        @scala.inline
        def setOnFlagsLeave(value: /* node */ Flags => Unit): Self = StObject.set(x, "onFlagsLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnFlagsLeaveUndefined: Self = StObject.set(x, "onFlagsLeave", js.undefined)
        
        @scala.inline
        def setOnGroupEnter(value: /* node */ Group => Unit): Self = StObject.set(x, "onGroupEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnGroupEnterUndefined: Self = StObject.set(x, "onGroupEnter", js.undefined)
        
        @scala.inline
        def setOnGroupLeave(value: /* node */ Group => Unit): Self = StObject.set(x, "onGroupLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnGroupLeaveUndefined: Self = StObject.set(x, "onGroupLeave", js.undefined)
        
        @scala.inline
        def setOnPatternEnter(value: /* node */ Pattern => Unit): Self = StObject.set(x, "onPatternEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPatternEnterUndefined: Self = StObject.set(x, "onPatternEnter", js.undefined)
        
        @scala.inline
        def setOnPatternLeave(value: /* node */ Pattern => Unit): Self = StObject.set(x, "onPatternLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPatternLeaveUndefined: Self = StObject.set(x, "onPatternLeave", js.undefined)
        
        @scala.inline
        def setOnQuantifierEnter(value: /* node */ Quantifier => Unit): Self = StObject.set(x, "onQuantifierEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnQuantifierEnterUndefined: Self = StObject.set(x, "onQuantifierEnter", js.undefined)
        
        @scala.inline
        def setOnQuantifierLeave(value: /* node */ Quantifier => Unit): Self = StObject.set(x, "onQuantifierLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnQuantifierLeaveUndefined: Self = StObject.set(x, "onQuantifierLeave", js.undefined)
        
        @scala.inline
        def setOnRegExpLiteralEnter(value: /* node */ RegExpLiteral => Unit): Self = StObject.set(x, "onRegExpLiteralEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnRegExpLiteralEnterUndefined: Self = StObject.set(x, "onRegExpLiteralEnter", js.undefined)
        
        @scala.inline
        def setOnRegExpLiteralLeave(value: /* node */ RegExpLiteral => Unit): Self = StObject.set(x, "onRegExpLiteralLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnRegExpLiteralLeaveUndefined: Self = StObject.set(x, "onRegExpLiteralLeave", js.undefined)
      }
    }
  }
}
