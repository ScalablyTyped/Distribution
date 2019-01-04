package typings
package rruleLib.distEsmSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src", JSImport.Default)
@js.native
class default ()
  extends rruleLib.distEsmSrcRruleMod.default {
  def this(options: stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options]) = this()
  def this(options: stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options], noCache: scala.Boolean) = this()
}

@JSImport("rrule/dist/esm/src", JSImport.Default)
@js.native
object default extends js.Object {
  val DAILY: rruleLib.distEsmSrcTypesMod.Frequency = js.native
  val FR: rruleLib.distEsmSrcWeekdayMod.Weekday = js.native
  val FREQUENCIES: js.Array[java.lang.String] = js.native
  val HOURLY: rruleLib.distEsmSrcTypesMod.Frequency = js.native
  val MINUTELY: rruleLib.distEsmSrcTypesMod.Frequency = js.native
  val MO: rruleLib.distEsmSrcWeekdayMod.Weekday = js.native
  val MONTHLY: rruleLib.distEsmSrcTypesMod.Frequency = js.native
  val SA: rruleLib.distEsmSrcWeekdayMod.Weekday = js.native
  val SECONDLY: rruleLib.distEsmSrcTypesMod.Frequency = js.native
  val SU: rruleLib.distEsmSrcWeekdayMod.Weekday = js.native
  val TH: rruleLib.distEsmSrcWeekdayMod.Weekday = js.native
  val TU: rruleLib.distEsmSrcWeekdayMod.Weekday = js.native
  val WE: rruleLib.distEsmSrcWeekdayMod.Weekday = js.native
  val WEEKLY: rruleLib.distEsmSrcTypesMod.Frequency = js.native
  val YEARLY: rruleLib.distEsmSrcTypesMod.Frequency = js.native
  @JSName("optionsToString")
  var optionsToString_Original: js.Function1[
    /* options */ stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options], 
    java.lang.String
  ] = js.native
  @JSName("parseString")
  var parseString_Original: js.Function1[
    /* rfcString */ java.lang.String, 
    stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options]
  ] = js.native
  def fromString(str: java.lang.String): rruleLib.distEsmSrcRruleMod.RRule = js.native
  def fromText(text: java.lang.String): rruleLib.distEsmSrcRruleMod.RRule = js.native
  def fromText(text: java.lang.String, language: rruleLib.distEsmSrcNlpI18nMod.Language): rruleLib.distEsmSrcRruleMod.RRule = js.native
  def optionsToString(options: stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options]): java.lang.String = js.native
  def parseString(rfcString: java.lang.String): stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options] = js.native
  def parseText(text: java.lang.String): stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options] | scala.Null = js.native
  def parseText(text: java.lang.String, language: rruleLib.distEsmSrcNlpI18nMod.Language): stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options] | scala.Null = js.native
}

