package typings.regexpp.visitorMod.RegExpVisitor

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

@js.native
trait Handlers extends js.Object {
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
  implicit class HandlersOps[Self <: Handlers] (val x: Self) extends AnyVal {
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
    def setOnAlternativeEnter(value: /* node */ Alternative => Unit): Self = this.set("onAlternativeEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAlternativeEnter: Self = this.set("onAlternativeEnter", js.undefined)
    @scala.inline
    def setOnAlternativeLeave(value: /* node */ Alternative => Unit): Self = this.set("onAlternativeLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAlternativeLeave: Self = this.set("onAlternativeLeave", js.undefined)
    @scala.inline
    def setOnAssertionEnter(value: /* node */ Assertion => Unit): Self = this.set("onAssertionEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAssertionEnter: Self = this.set("onAssertionEnter", js.undefined)
    @scala.inline
    def setOnAssertionLeave(value: /* node */ Assertion => Unit): Self = this.set("onAssertionLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAssertionLeave: Self = this.set("onAssertionLeave", js.undefined)
    @scala.inline
    def setOnBackreferenceEnter(value: /* node */ Backreference => Unit): Self = this.set("onBackreferenceEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBackreferenceEnter: Self = this.set("onBackreferenceEnter", js.undefined)
    @scala.inline
    def setOnBackreferenceLeave(value: /* node */ Backreference => Unit): Self = this.set("onBackreferenceLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBackreferenceLeave: Self = this.set("onBackreferenceLeave", js.undefined)
    @scala.inline
    def setOnCapturingGroupEnter(value: /* node */ CapturingGroup => Unit): Self = this.set("onCapturingGroupEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCapturingGroupEnter: Self = this.set("onCapturingGroupEnter", js.undefined)
    @scala.inline
    def setOnCapturingGroupLeave(value: /* node */ CapturingGroup => Unit): Self = this.set("onCapturingGroupLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCapturingGroupLeave: Self = this.set("onCapturingGroupLeave", js.undefined)
    @scala.inline
    def setOnCharacterClassEnter(value: /* node */ CharacterClass => Unit): Self = this.set("onCharacterClassEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCharacterClassEnter: Self = this.set("onCharacterClassEnter", js.undefined)
    @scala.inline
    def setOnCharacterClassLeave(value: /* node */ CharacterClass => Unit): Self = this.set("onCharacterClassLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCharacterClassLeave: Self = this.set("onCharacterClassLeave", js.undefined)
    @scala.inline
    def setOnCharacterClassRangeEnter(value: /* node */ CharacterClassRange => Unit): Self = this.set("onCharacterClassRangeEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCharacterClassRangeEnter: Self = this.set("onCharacterClassRangeEnter", js.undefined)
    @scala.inline
    def setOnCharacterClassRangeLeave(value: /* node */ CharacterClassRange => Unit): Self = this.set("onCharacterClassRangeLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCharacterClassRangeLeave: Self = this.set("onCharacterClassRangeLeave", js.undefined)
    @scala.inline
    def setOnCharacterEnter(value: /* node */ Character => Unit): Self = this.set("onCharacterEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCharacterEnter: Self = this.set("onCharacterEnter", js.undefined)
    @scala.inline
    def setOnCharacterLeave(value: /* node */ Character => Unit): Self = this.set("onCharacterLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCharacterLeave: Self = this.set("onCharacterLeave", js.undefined)
    @scala.inline
    def setOnCharacterSetEnter(value: /* node */ CharacterSet => Unit): Self = this.set("onCharacterSetEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCharacterSetEnter: Self = this.set("onCharacterSetEnter", js.undefined)
    @scala.inline
    def setOnCharacterSetLeave(value: /* node */ CharacterSet => Unit): Self = this.set("onCharacterSetLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCharacterSetLeave: Self = this.set("onCharacterSetLeave", js.undefined)
    @scala.inline
    def setOnFlagsEnter(value: /* node */ Flags => Unit): Self = this.set("onFlagsEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFlagsEnter: Self = this.set("onFlagsEnter", js.undefined)
    @scala.inline
    def setOnFlagsLeave(value: /* node */ Flags => Unit): Self = this.set("onFlagsLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFlagsLeave: Self = this.set("onFlagsLeave", js.undefined)
    @scala.inline
    def setOnGroupEnter(value: /* node */ Group => Unit): Self = this.set("onGroupEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGroupEnter: Self = this.set("onGroupEnter", js.undefined)
    @scala.inline
    def setOnGroupLeave(value: /* node */ Group => Unit): Self = this.set("onGroupLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGroupLeave: Self = this.set("onGroupLeave", js.undefined)
    @scala.inline
    def setOnPatternEnter(value: /* node */ Pattern => Unit): Self = this.set("onPatternEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPatternEnter: Self = this.set("onPatternEnter", js.undefined)
    @scala.inline
    def setOnPatternLeave(value: /* node */ Pattern => Unit): Self = this.set("onPatternLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPatternLeave: Self = this.set("onPatternLeave", js.undefined)
    @scala.inline
    def setOnQuantifierEnter(value: /* node */ Quantifier => Unit): Self = this.set("onQuantifierEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnQuantifierEnter: Self = this.set("onQuantifierEnter", js.undefined)
    @scala.inline
    def setOnQuantifierLeave(value: /* node */ Quantifier => Unit): Self = this.set("onQuantifierLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnQuantifierLeave: Self = this.set("onQuantifierLeave", js.undefined)
    @scala.inline
    def setOnRegExpLiteralEnter(value: /* node */ RegExpLiteral => Unit): Self = this.set("onRegExpLiteralEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRegExpLiteralEnter: Self = this.set("onRegExpLiteralEnter", js.undefined)
    @scala.inline
    def setOnRegExpLiteralLeave(value: /* node */ RegExpLiteral => Unit): Self = this.set("onRegExpLiteralLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRegExpLiteralLeave: Self = this.set("onRegExpLiteralLeave", js.undefined)
  }
  
}

