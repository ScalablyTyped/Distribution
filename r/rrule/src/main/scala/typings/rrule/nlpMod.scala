package typings.rrule

import typings.rrule.anon.PartialOptions
import typings.rrule.i18nMod.Language
import typings.rrule.mod.default
import typings.rrule.totextMod.DateFormatter
import typings.rrule.totextMod.GetText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/nlp", JSImport.Namespace)
@js.native
object nlpMod extends js.Object {
  @js.native
  trait Nlp extends js.Object {
    @JSName("fromText")
    var fromText_Original: js.Function2[/* text */ String, /* language */ js.UndefOr[Language], default] = js.native
    var isFullyConvertible: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToText.isFullyConvertible */ js.Any = js.native
    @JSName("parseText")
    var parseText_Original: js.Function2[/* text */ String, /* language */ js.UndefOr[Language], PartialOptions | Null] = js.native
    @JSName("toText")
    var toText_Original: js.Function4[
        /* rrule */ default, 
        /* gettext */ js.UndefOr[GetText], 
        /* language */ js.UndefOr[Language], 
        /* dateFormatter */ js.UndefOr[DateFormatter], 
        String
      ] = js.native
    def fromText(text: String): default = js.native
    def fromText(text: String, language: Language): default = js.native
    def parseText(text: String): PartialOptions | Null = js.native
    def parseText(text: String, language: Language): PartialOptions | Null = js.native
    def toText(rrule: default): String = js.native
    def toText(rrule: default, gettext: GetText): String = js.native
    def toText(rrule: default, gettext: GetText, language: Language): String = js.native
    def toText(rrule: default, gettext: GetText, language: Language, dateFormatter: DateFormatter): String = js.native
  }
  
  val isFullyConvertible: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToText.isFullyConvertible */ js.Any = js.native
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
  def fromText(text: String): default = js.native
  def fromText(text: String, language: Language): default = js.native
  def parseText(text: String): PartialOptions | Null = js.native
  def parseText(text: String, language: Language): PartialOptions | Null = js.native
  def toText(rrule: default): String = js.native
  def toText(rrule: default, gettext: GetText): String = js.native
  def toText(rrule: default, gettext: GetText, language: Language): String = js.native
  def toText(rrule: default, gettext: GetText, language: Language, dateFormatter: DateFormatter): String = js.native
}

