package typings.pulumiCloud

import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerMod {
  
  @JSImport("@pulumi/cloud/timer", "cron")
  @js.native
  def cron(name: String, cronTab: String, handler: Action): Unit = js.native
  @JSImport("@pulumi/cloud/timer", "cron")
  @js.native
  def cron(name: String, cronTab: String, handler: Action, opts: ResourceOptions): Unit = js.native
  
  @JSImport("@pulumi/cloud/timer", "daily")
  @js.native
  def daily(name: String, handler: Action): Unit = js.native
  @JSImport("@pulumi/cloud/timer", "daily")
  @js.native
  def daily(name: String, handler: Action, opts: ResourceOptions): Unit = js.native
  @JSImport("@pulumi/cloud/timer", "daily")
  @js.native
  def daily(name: String, schedule: DailySchedule, handler: Action): Unit = js.native
  @JSImport("@pulumi/cloud/timer", "daily")
  @js.native
  def daily(name: String, schedule: DailySchedule, handler: Action, opts: ResourceOptions): Unit = js.native
  
  @JSImport("@pulumi/cloud/timer", "hourly")
  @js.native
  def hourly(name: String, handler: Action): Unit = js.native
  @JSImport("@pulumi/cloud/timer", "hourly")
  @js.native
  def hourly(name: String, handler: Action, opts: ResourceOptions): Unit = js.native
  @JSImport("@pulumi/cloud/timer", "hourly")
  @js.native
  def hourly(name: String, schedule: HourlySchedule, handler: Action): Unit = js.native
  @JSImport("@pulumi/cloud/timer", "hourly")
  @js.native
  def hourly(name: String, schedule: HourlySchedule, handler: Action, opts: ResourceOptions): Unit = js.native
  
  @JSImport("@pulumi/cloud/timer", "interval")
  @js.native
  def interval(name: String, options: IntervalRate, handler: Action): Unit = js.native
  @JSImport("@pulumi/cloud/timer", "interval")
  @js.native
  def interval(name: String, options: IntervalRate, handler: Action, opts: ResourceOptions): Unit = js.native
  
  type Action = js.Function0[js.Promise[Unit]]
  
  @js.native
  trait DailySchedule extends StObject {
    
    /**
      * The hour, in UTC, that the timer should fire.
      */
    var hourUTC: js.UndefOr[Double] = js.native
    
    /**
      * The minute, in UTC, that the timer should fire.
      */
    var minuteUTC: js.UndefOr[Double] = js.native
  }
  object DailySchedule {
    
    @scala.inline
    def apply(): DailySchedule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DailySchedule]
    }
    
    @scala.inline
    implicit class DailyScheduleMutableBuilder[Self <: DailySchedule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHourUTC(value: Double): Self = StObject.set(x, "hourUTC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourUTCUndefined: Self = StObject.set(x, "hourUTC", js.undefined)
      
      @scala.inline
      def setMinuteUTC(value: Double): Self = StObject.set(x, "minuteUTC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUTCUndefined: Self = StObject.set(x, "minuteUTC", js.undefined)
    }
  }
  
  @js.native
  trait HourlySchedule extends StObject {
    
    /**
      * The minute, in UTC, that the timer should fire.
      */
    var minuteUTC: js.UndefOr[Double] = js.native
  }
  object HourlySchedule {
    
    @scala.inline
    def apply(): HourlySchedule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HourlySchedule]
    }
    
    @scala.inline
    implicit class HourlyScheduleMutableBuilder[Self <: HourlySchedule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinuteUTC(value: Double): Self = StObject.set(x, "minuteUTC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUTCUndefined: Self = StObject.set(x, "minuteUTC", js.undefined)
    }
  }
  
  @js.native
  trait IntervalRate extends StObject {
    
    /**
      * The number of days in the interval.  Must be a positive integer.
      */
    var days: js.UndefOr[Double] = js.native
    
    /**
      * The number of hours in the interval.  Must be a positive integer.
      */
    var hours: js.UndefOr[Double] = js.native
    
    /**
      * The number of minutes in the interval.  Must be a positive integer.
      */
    var minutes: js.UndefOr[Double] = js.native
  }
  object IntervalRate {
    
    @scala.inline
    def apply(): IntervalRate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntervalRate]
    }
    
    @scala.inline
    implicit class IntervalRateMutableBuilder[Self <: IntervalRate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    }
  }
}
