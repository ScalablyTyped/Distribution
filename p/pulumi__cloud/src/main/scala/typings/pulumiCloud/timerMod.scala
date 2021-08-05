package typings.pulumiCloud

import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerMod {
  
  @JSImport("@pulumi/cloud/timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cron(name: String, cronTab: String, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cron")(name.asInstanceOf[js.Any], cronTab.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cron(name: String, cronTab: String, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cron")(name.asInstanceOf[js.Any], cronTab.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def daily(name: String, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("daily")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def daily(name: String, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("daily")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def daily(name: String, schedule: DailySchedule, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("daily")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def daily(name: String, schedule: DailySchedule, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("daily")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hourly(name: String, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hourly")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hourly(name: String, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hourly")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hourly(name: String, schedule: HourlySchedule, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hourly")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hourly(name: String, schedule: HourlySchedule, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hourly")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def interval(name: String, options: IntervalRate, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def interval(name: String, options: IntervalRate, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Action = js.Function0[js.Promise[Unit]]
  
  trait DailySchedule extends StObject {
    
    /**
      * The hour, in UTC, that the timer should fire.
      */
    var hourUTC: js.UndefOr[Double] = js.undefined
    
    /**
      * The minute, in UTC, that the timer should fire.
      */
    var minuteUTC: js.UndefOr[Double] = js.undefined
  }
  object DailySchedule {
    
    inline def apply(): DailySchedule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DailySchedule]
    }
    
    extension [Self <: DailySchedule](x: Self) {
      
      inline def setHourUTC(value: Double): Self = StObject.set(x, "hourUTC", value.asInstanceOf[js.Any])
      
      inline def setHourUTCUndefined: Self = StObject.set(x, "hourUTC", js.undefined)
      
      inline def setMinuteUTC(value: Double): Self = StObject.set(x, "minuteUTC", value.asInstanceOf[js.Any])
      
      inline def setMinuteUTCUndefined: Self = StObject.set(x, "minuteUTC", js.undefined)
    }
  }
  
  trait HourlySchedule extends StObject {
    
    /**
      * The minute, in UTC, that the timer should fire.
      */
    var minuteUTC: js.UndefOr[Double] = js.undefined
  }
  object HourlySchedule {
    
    inline def apply(): HourlySchedule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HourlySchedule]
    }
    
    extension [Self <: HourlySchedule](x: Self) {
      
      inline def setMinuteUTC(value: Double): Self = StObject.set(x, "minuteUTC", value.asInstanceOf[js.Any])
      
      inline def setMinuteUTCUndefined: Self = StObject.set(x, "minuteUTC", js.undefined)
    }
  }
  
  trait IntervalRate extends StObject {
    
    /**
      * The number of days in the interval.  Must be a positive integer.
      */
    var days: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of hours in the interval.  Must be a positive integer.
      */
    var hours: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of minutes in the interval.  Must be a positive integer.
      */
    var minutes: js.UndefOr[Double] = js.undefined
  }
  object IntervalRate {
    
    inline def apply(): IntervalRate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntervalRate]
    }
    
    extension [Self <: IntervalRate](x: Self) {
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    }
  }
}
