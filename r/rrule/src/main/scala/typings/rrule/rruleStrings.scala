package typings.rrule

import typings.rrule.cacheMod.CacheKeys
import typings.rrule.typesMod.QueryMethodTypes
import typings.rrule.weekdayMod.WeekdayStr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rruleStrings {
  
  @js.native
  sealed trait FR
    extends StObject
       with WeekdayStr
  inline def FR: FR = "FR".asInstanceOf[FR]
  
  @js.native
  sealed trait MO
    extends StObject
       with WeekdayStr
  inline def MO: MO = "MO".asInstanceOf[MO]
  
  @js.native
  sealed trait SA
    extends StObject
       with WeekdayStr
  inline def SA: SA = "SA".asInstanceOf[SA]
  
  @js.native
  sealed trait SU
    extends StObject
       with WeekdayStr
  inline def SU: SU = "SU".asInstanceOf[SU]
  
  @js.native
  sealed trait TH
    extends StObject
       with WeekdayStr
  inline def TH: TH = "TH".asInstanceOf[TH]
  
  @js.native
  sealed trait TU
    extends StObject
       with WeekdayStr
  inline def TU: TU = "TU".asInstanceOf[TU]
  
  @js.native
  sealed trait WE
    extends StObject
       with WeekdayStr
  inline def WE: WE = "WE".asInstanceOf[WE]
  
  @js.native
  sealed trait after
    extends StObject
       with CacheKeys
       with QueryMethodTypes
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait all
    extends StObject
       with QueryMethodTypes
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait before
    extends StObject
       with CacheKeys
       with QueryMethodTypes
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait between
    extends StObject
       with CacheKeys
       with QueryMethodTypes
  inline def between: between = "between".asInstanceOf[between]
  
  @js.native
  sealed trait byeaster extends StObject
  inline def byeaster: byeaster = "byeaster".asInstanceOf[byeaster]
  
  @js.native
  sealed trait byhour extends StObject
  inline def byhour: byhour = "byhour".asInstanceOf[byhour]
  
  @js.native
  sealed trait byminute extends StObject
  inline def byminute: byminute = "byminute".asInstanceOf[byminute]
  
  @js.native
  sealed trait bymonth extends StObject
  inline def bymonth: bymonth = "bymonth".asInstanceOf[bymonth]
  
  @js.native
  sealed trait bymonthday extends StObject
  inline def bymonthday: bymonthday = "bymonthday".asInstanceOf[bymonthday]
  
  @js.native
  sealed trait bynmonthday extends StObject
  inline def bynmonthday: bynmonthday = "bynmonthday".asInstanceOf[bynmonthday]
  
  @js.native
  sealed trait bynweekday extends StObject
  inline def bynweekday: bynweekday = "bynweekday".asInstanceOf[bynweekday]
  
  @js.native
  sealed trait bysecond extends StObject
  inline def bysecond: bysecond = "bysecond".asInstanceOf[bysecond]
  
  @js.native
  sealed trait bysetpos extends StObject
  inline def bysetpos: bysetpos = "bysetpos".asInstanceOf[bysetpos]
  
  @js.native
  sealed trait byweekday extends StObject
  inline def byweekday: byweekday = "byweekday".asInstanceOf[byweekday]
  
  @js.native
  sealed trait byweekno extends StObject
  inline def byweekno: byweekno = "byweekno".asInstanceOf[byweekno]
  
  @js.native
  sealed trait byyearday extends StObject
  inline def byyearday: byyearday = "byyearday".asInstanceOf[byyearday]
  
  @js.native
  sealed trait count extends StObject
  inline def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait dtstart extends StObject
  inline def dtstart: dtstart = "dtstart".asInstanceOf[dtstart]
  
  @js.native
  sealed trait freq extends StObject
  inline def freq: freq = "freq".asInstanceOf[freq]
  
  @js.native
  sealed trait interval extends StObject
  inline def interval: interval = "interval".asInstanceOf[interval]
  
  @js.native
  sealed trait tzid extends StObject
  inline def tzid: tzid = "tzid".asInstanceOf[tzid]
  
  @js.native
  sealed trait until extends StObject
  inline def until: until = "until".asInstanceOf[until]
  
  @js.native
  sealed trait wkst extends StObject
  inline def wkst: wkst = "wkst".asInstanceOf[wkst]
}
