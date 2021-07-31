package typings.rrule

import typings.rrule.anon.PartialOptions
import typings.rrule.i18nMod.Language
import typings.rrule.mod.default
import typings.rrule.totextMod.DateFormatter
import typings.rrule.totextMod.GetText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nlpMod {
  
  @JSImport("rrule/dist/esm/src/nlp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /*!
  * rrule.js - Library for working with recurrence rules for calendar dates.
  * https://github.com/jakubroztocil/rrule
  *
  * Copyright 2010, Jakub Roztocil and Lars Schoning
  * Licenced under the BSD licence.
  * https://github.com/jakubroztocil/rrule/blob/master/LICENCE
  *
  */
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
    *       day(s)
    *     | [weekday], ..., (and) [weekday]
    *     | weekday(s)
    *     | week(s)
    *     | month(s)
    *     | [month], ..., (and) [month]
    *     | year(s)
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
    *     in week(s) [n], ..., (and) [n]
    *
    *     on the [yearday], ..., (and) [n] day of the year
    *     on day [yearday], ..., (and) [n]
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
    *     [month] (0-31(,) ([year])),
    *     (the) 0-31.(1-12.([year])),
    *     (the) 0-31/(1-12/([year])),
    *     [weekday]
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
  @scala.inline
  def fromText(text: String): default = ^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any]).asInstanceOf[default]
  @scala.inline
  def fromText(text: String, language: Language): default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[default]
  
  @JSImport("rrule/dist/esm/src/nlp", "isFullyConvertible")
  @js.native
  val isFullyConvertible: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof ToText.isFullyConvertible */ js.Any = js.native
  
  @scala.inline
  def parseText(text: String): PartialOptions | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any]).asInstanceOf[PartialOptions | Null]
  @scala.inline
  def parseText(text: String, language: Language): PartialOptions | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseText")(text.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[PartialOptions | Null]
  
  @scala.inline
  def toText(rrule: default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toText(rrule: default, gettext: Unit, language: Unit, dateFormatter: DateFormatter): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toText(rrule: default, gettext: Unit, language: Language): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toText(rrule: default, gettext: Unit, language: Language, dateFormatter: DateFormatter): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toText(rrule: default, gettext: GetText): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toText(rrule: default, gettext: GetText, language: Unit, dateFormatter: DateFormatter): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toText(rrule: default, gettext: GetText, language: Language): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toText(rrule: default, gettext: GetText, language: Language, dateFormatter: DateFormatter): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toText")(rrule.asInstanceOf[js.Any], gettext.asInstanceOf[js.Any], language.asInstanceOf[js.Any], dateFormatter.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Nlp extends StObject {
    
    def fromText(text: String): default
    def fromText(text: String, language: Language): default
    @JSName("fromText")
    var fromText_Original: js.Function2[/* text */ String, /* language */ js.UndefOr[Language], default]
    
    var isFullyConvertible: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof ToText.isFullyConvertible */ js.Any
    
    def parseText(text: String): PartialOptions | Null
    def parseText(text: String, language: Language): PartialOptions | Null
    @JSName("parseText")
    var parseText_Original: js.Function2[/* text */ String, /* language */ js.UndefOr[Language], PartialOptions | Null]
    
    def toText(rrule: default): String
    def toText(rrule: default, gettext: Unit, language: Unit, dateFormatter: DateFormatter): String
    def toText(rrule: default, gettext: Unit, language: Language): String
    def toText(rrule: default, gettext: Unit, language: Language, dateFormatter: DateFormatter): String
    def toText(rrule: default, gettext: GetText): String
    def toText(rrule: default, gettext: GetText, language: Unit, dateFormatter: DateFormatter): String
    def toText(rrule: default, gettext: GetText, language: Language): String
    def toText(rrule: default, gettext: GetText, language: Language, dateFormatter: DateFormatter): String
    @JSName("toText")
    var toText_Original: js.Function4[
        /* rrule */ default, 
        /* gettext */ js.UndefOr[GetText], 
        /* language */ js.UndefOr[Language], 
        /* dateFormatter */ js.UndefOr[DateFormatter], 
        String
      ]
  }
  object Nlp {
    
    @scala.inline
    def apply(
      fromText: (/* text */ String, /* language */ js.UndefOr[Language]) => default,
      isFullyConvertible: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof ToText.isFullyConvertible */ js.Any,
      parseText: (/* text */ String, /* language */ js.UndefOr[Language]) => PartialOptions | Null,
      toText: (/* rrule */ default, /* gettext */ js.UndefOr[GetText], /* language */ js.UndefOr[Language], /* dateFormatter */ js.UndefOr[DateFormatter]) => String
    ): Nlp = {
      val __obj = js.Dynamic.literal(fromText = js.Any.fromFunction2(fromText), isFullyConvertible = isFullyConvertible.asInstanceOf[js.Any], parseText = js.Any.fromFunction2(parseText), toText = js.Any.fromFunction4(toText))
      __obj.asInstanceOf[Nlp]
    }
    
    @scala.inline
    implicit class NlpMutableBuilder[Self <: Nlp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromText(value: (/* text */ String, /* language */ js.UndefOr[Language]) => default): Self = StObject.set(x, "fromText", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsFullyConvertible(
        value: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof ToText.isFullyConvertible */ js.Any
      ): Self = StObject.set(x, "isFullyConvertible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseText(value: (/* text */ String, /* language */ js.UndefOr[Language]) => PartialOptions | Null): Self = StObject.set(x, "parseText", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToText(
        value: (/* rrule */ default, /* gettext */ js.UndefOr[GetText], /* language */ js.UndefOr[Language], /* dateFormatter */ js.UndefOr[DateFormatter]) => String
      ): Self = StObject.set(x, "toText", js.Any.fromFunction4(value))
    }
  }
}
