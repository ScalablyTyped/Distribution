package typings.rrule

import typings.rrule.anon.PartialOptions
import typings.rrule.distEsmNlpI18nMod.Language
import typings.rrule.distEsmNlpTotextMod.DateFormatter
import typings.rrule.distEsmNlpTotextMod.GetText
import typings.rrule.distEsmRruleMod.RRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmNlpMod {
  
  @JSImport("rrule/dist/esm/nlp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Implementation of RRule.fromText() and RRule::toText().
    *
    *
    * On the client side, this file needs to be included
    * when those functions are used.
    *
    */
  /**
    * Will be able to convert some of the below described rules from
    * text format to a rule object.
    *
    *
    * RULES
    *
    * Every ([n])
    * day(s)
    * | [weekday], ..., (and) [weekday]
    * | weekday(s)
    * | week(s)
    * | month(s)
    * | [month], ..., (and) [month]
    * | year(s)
    *
    *
    * Plus 0, 1, or multiple of these:
    *
    * on [weekday], ..., (or) [weekday] the [monthday], [monthday], ... (or) [monthday]
    *
    * on [weekday], ..., (and) [weekday]
    *
    * on the [monthday], [monthday], ... (and) [monthday] (day of the month)
    *
    * on the [nth-weekday], ..., (and) [nth-weekday] (of the month/year)
    *
    *
    * Plus 0 or 1 of these:
    *
    * for [n] time(s)
    *
    * until [date]
    *
    * Plus (.)
    *
    *
    * Definitely no supported for parsing:
    *
    * (for year):
    * in week(s) [n], ..., (and) [n]
    *
    * on the [yearday], ..., (and) [n] day of the year
    * on day [yearday], ..., (and) [n]
    *
    *
    * NON-TERMINALS
    *
    * [n]: 1, 2 ..., one, two, three ..
    * [month]: January, February, March, April, May, ... December
    * [weekday]: Monday, ... Sunday
    * [nth-weekday]: first [weekday], 2nd [weekday], ... last [weekday], ...
    * [monthday]: first, 1., 2., 1st, 2nd, second, ... 31st, last day, 2nd last day, ..
    * [date]:
    * - [month] (0-31(,) ([year])),
    * - (the) 0-31.(1-12.([year])),
    * - (the) 0-31/(1-12/([year])),
    * - [weekday]
    *
    * [year]: 0000, 0001, ... 01, 02, ..
    *
    * Definitely not supported for parsing:
    *
    * [yearday]: first, 1., 2., 1st, 2nd, second, ... 366th, last day, 2nd last day, ..
    *
    * @param {String} text
    * @return {Object, Boolean} the rule, or null.
    */
  inline def fromText(text: String): RRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any]).asInstanceOf[RRule]
  inline def fromText(text: String, language: Language): RRule = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[RRule]
  
  @JSImport("rrule/dist/esm/nlp", "isFullyConvertible")
  @js.native
  val isFullyConvertible: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof ToText.isFullyConvertible */ Any = js.native
  
  inline def parseText(text: String): PartialOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any]).asInstanceOf[PartialOptions]
  inline def parseText(text: String, language: Language): PartialOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[PartialOptions]
  
  inline def toText(rrule: RRule): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toText(rrule: RRule, gettext: Unit, language: Unit, dateFormatter: DateFormatter): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toText(rrule: RRule, gettext: Unit, language: Language): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toText(rrule: RRule, gettext: Unit, language: Language, dateFormatter: DateFormatter): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toText(rrule: RRule, gettext: GetText): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toText(rrule: RRule, gettext: GetText, language: Unit, dateFormatter: DateFormatter): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toText(rrule: RRule, gettext: GetText, language: Language): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toText(rrule: RRule, gettext: GetText, language: Language, dateFormatter: DateFormatter): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Nlp extends StObject {
    
    def fromText(text: String): RRule
    def fromText(text: String, language: Language): RRule
    @JSName("fromText")
    var fromText_Original: js.Function2[/* text */ String, /* language */ js.UndefOr[Language], RRule]
    
    var isFullyConvertible: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof ToText.isFullyConvertible */ Any
    
    def parseText(text: String): PartialOptions
    def parseText(text: String, language: Language): PartialOptions
    @JSName("parseText")
    var parseText_Original: js.Function2[/* text */ String, /* language */ js.UndefOr[Language], PartialOptions]
    
    def toText(rrule: RRule): String
    def toText(rrule: RRule, gettext: Unit, language: Unit, dateFormatter: DateFormatter): String
    def toText(rrule: RRule, gettext: Unit, language: Language): String
    def toText(rrule: RRule, gettext: Unit, language: Language, dateFormatter: DateFormatter): String
    def toText(rrule: RRule, gettext: GetText): String
    def toText(rrule: RRule, gettext: GetText, language: Unit, dateFormatter: DateFormatter): String
    def toText(rrule: RRule, gettext: GetText, language: Language): String
    def toText(rrule: RRule, gettext: GetText, language: Language, dateFormatter: DateFormatter): String
    @JSName("toText")
    var toText_Original: js.Function4[
        /* rrule */ RRule, 
        /* gettext */ js.UndefOr[GetText], 
        /* language */ js.UndefOr[Language], 
        /* dateFormatter */ js.UndefOr[DateFormatter], 
        String
      ]
  }
  object Nlp {
    
    inline def apply(
      fromText: (/* text */ String, /* language */ js.UndefOr[Language]) => RRule,
      isFullyConvertible: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof ToText.isFullyConvertible */ Any,
      parseText: (/* text */ String, /* language */ js.UndefOr[Language]) => PartialOptions,
      toText: (/* rrule */ RRule, /* gettext */ js.UndefOr[GetText], /* language */ js.UndefOr[Language], /* dateFormatter */ js.UndefOr[DateFormatter]) => String
    ): Nlp = {
      val __obj = js.Dynamic.literal(fromText = js.Any.fromFunction2(fromText), isFullyConvertible = isFullyConvertible.asInstanceOf[js.Any], parseText = js.Any.fromFunction2(parseText), toText = js.Any.fromFunction4(toText))
      __obj.asInstanceOf[Nlp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Nlp] (val x: Self) extends AnyVal {
      
      inline def setFromText(value: (/* text */ String, /* language */ js.UndefOr[Language]) => RRule): Self = StObject.set(x, "fromText", js.Any.fromFunction2(value))
      
      inline def setIsFullyConvertible(
        value: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof ToText.isFullyConvertible */ Any
      ): Self = StObject.set(x, "isFullyConvertible", value.asInstanceOf[js.Any])
      
      inline def setParseText(value: (/* text */ String, /* language */ js.UndefOr[Language]) => PartialOptions): Self = StObject.set(x, "parseText", js.Any.fromFunction2(value))
      
      inline def setToText(
        value: (/* rrule */ RRule, /* gettext */ js.UndefOr[GetText], /* language */ js.UndefOr[Language], /* dateFormatter */ js.UndefOr[DateFormatter]) => String
      ): Self = StObject.set(x, "toText", js.Any.fromFunction4(value))
    }
  }
}
