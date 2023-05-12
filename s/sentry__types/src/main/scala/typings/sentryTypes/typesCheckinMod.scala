package typings.sentryTypes

import typings.sentryTypes.anon.Checkinmargin
import typings.sentryTypes.sentryTypesStrings.crontab
import typings.sentryTypes.sentryTypesStrings.day
import typings.sentryTypes.sentryTypesStrings.error
import typings.sentryTypes.sentryTypesStrings.hour
import typings.sentryTypes.sentryTypesStrings.in_progress
import typings.sentryTypes.sentryTypesStrings.interval
import typings.sentryTypes.sentryTypesStrings.minute
import typings.sentryTypes.sentryTypesStrings.month
import typings.sentryTypes.sentryTypesStrings.ok
import typings.sentryTypes.sentryTypesStrings.week
import typings.sentryTypes.sentryTypesStrings.year
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCheckinMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.typesCheckinMod.InProgressCheckIn
    - typings.sentryTypes.typesCheckinMod.FinishedCheckIn
  */
  trait CheckIn extends StObject
  object CheckIn {
    
    inline def FinishedCheckIn(checkInId: String, monitorSlug: String, status: ok | error): typings.sentryTypes.typesCheckinMod.FinishedCheckIn = {
      val __obj = js.Dynamic.literal(checkInId = checkInId.asInstanceOf[js.Any], monitorSlug = monitorSlug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sentryTypes.typesCheckinMod.FinishedCheckIn]
    }
    
    inline def InProgressCheckIn(monitorSlug: String): typings.sentryTypes.typesCheckinMod.InProgressCheckIn = {
      val __obj = js.Dynamic.literal(monitorSlug = monitorSlug.asInstanceOf[js.Any], status = "in_progress")
      __obj.asInstanceOf[typings.sentryTypes.typesCheckinMod.InProgressCheckIn]
    }
  }
  
  trait CrontabSchedule
    extends StObject
       with MonitorSchedule {
    
    var `type`: crontab
    
    var value: String
  }
  object CrontabSchedule {
    
    inline def apply(value: String): CrontabSchedule = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("crontab")
      __obj.asInstanceOf[CrontabSchedule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrontabSchedule] (val x: Self) extends AnyVal {
      
      inline def setType(value: crontab): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FinishedCheckIn
    extends StObject
       with CheckIn {
    
    var checkInId: String
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var monitorSlug: String
    
    var status: ok | error
  }
  object FinishedCheckIn {
    
    inline def apply(checkInId: String, monitorSlug: String, status: ok | error): FinishedCheckIn = {
      val __obj = js.Dynamic.literal(checkInId = checkInId.asInstanceOf[js.Any], monitorSlug = monitorSlug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinishedCheckIn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FinishedCheckIn] (val x: Self) extends AnyVal {
      
      inline def setCheckInId(value: String): Self = StObject.set(x, "checkInId", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMonitorSlug(value: String): Self = StObject.set(x, "monitorSlug", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ok | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait InProgressCheckIn
    extends StObject
       with CheckIn {
    
    var monitorSlug: String
    
    var status: in_progress
  }
  object InProgressCheckIn {
    
    inline def apply(monitorSlug: String): InProgressCheckIn = {
      val __obj = js.Dynamic.literal(monitorSlug = monitorSlug.asInstanceOf[js.Any], status = "in_progress")
      __obj.asInstanceOf[InProgressCheckIn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InProgressCheckIn] (val x: Self) extends AnyVal {
      
      inline def setMonitorSlug(value: String): Self = StObject.set(x, "monitorSlug", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: in_progress): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntervalSchedule
    extends StObject
       with MonitorSchedule {
    
    var `type`: interval
    
    var unit: year | month | week | day | hour | minute
    
    var value: Double
  }
  object IntervalSchedule {
    
    inline def apply(unit: year | month | week | day | hour | minute, value: Double): IntervalSchedule = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("interval")
      __obj.asInstanceOf[IntervalSchedule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntervalSchedule] (val x: Self) extends AnyVal {
      
      inline def setType(value: interval): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: year | month | week | day | hour | minute): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonitorConfig extends StObject {
    
    var checkinMargin: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @sentry/types.@sentry/types/types/checkin.SerializedMonitorConfig['checkin_margin'] */ js.Any
      ] = js.undefined
    
    var maxRuntime: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @sentry/types.@sentry/types/types/checkin.SerializedMonitorConfig['max_runtime'] */ js.Any
      ] = js.undefined
    
    var schedule: MonitorSchedule
    
    var timezone: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @sentry/types.@sentry/types/types/checkin.SerializedMonitorConfig['timezone'] */ js.Any
      ] = js.undefined
  }
  object MonitorConfig {
    
    inline def apply(schedule: MonitorSchedule): MonitorConfig = {
      val __obj = js.Dynamic.literal(schedule = schedule.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonitorConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MonitorConfig] (val x: Self) extends AnyVal {
      
      inline def setCheckinMargin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/types.@sentry/types/types/checkin.SerializedMonitorConfig['checkin_margin'] */ js.Any
      ): Self = StObject.set(x, "checkinMargin", value.asInstanceOf[js.Any])
      
      inline def setCheckinMarginUndefined: Self = StObject.set(x, "checkinMargin", js.undefined)
      
      inline def setMaxRuntime(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/types.@sentry/types/types/checkin.SerializedMonitorConfig['max_runtime'] */ js.Any
      ): Self = StObject.set(x, "maxRuntime", value.asInstanceOf[js.Any])
      
      inline def setMaxRuntimeUndefined: Self = StObject.set(x, "maxRuntime", js.undefined)
      
      inline def setSchedule(value: MonitorSchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      inline def setTimezone(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/types.@sentry/types/types/checkin.SerializedMonitorConfig['timezone'] */ js.Any
      ): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.typesCheckinMod.CrontabSchedule
    - typings.sentryTypes.typesCheckinMod.IntervalSchedule
  */
  trait MonitorSchedule extends StObject
  object MonitorSchedule {
    
    inline def CrontabSchedule(value: String): typings.sentryTypes.typesCheckinMod.CrontabSchedule = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("crontab")
      __obj.asInstanceOf[typings.sentryTypes.typesCheckinMod.CrontabSchedule]
    }
    
    inline def IntervalSchedule(unit: year | month | week | day | hour | minute, value: Double): typings.sentryTypes.typesCheckinMod.IntervalSchedule = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("interval")
      __obj.asInstanceOf[typings.sentryTypes.typesCheckinMod.IntervalSchedule]
    }
  }
  
  trait SerializedCheckIn extends StObject {
    
    var check_in_id: String
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var monitor_config: js.UndefOr[Checkinmargin] = js.undefined
    
    var monitor_slug: String
    
    var release: js.UndefOr[String] = js.undefined
    
    var status: in_progress | ok | error
  }
  object SerializedCheckIn {
    
    inline def apply(check_in_id: String, monitor_slug: String, status: in_progress | ok | error): SerializedCheckIn = {
      val __obj = js.Dynamic.literal(check_in_id = check_in_id.asInstanceOf[js.Any], monitor_slug = monitor_slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedCheckIn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedCheckIn] (val x: Self) extends AnyVal {
      
      inline def setCheck_in_id(value: String): Self = StObject.set(x, "check_in_id", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setMonitor_config(value: Checkinmargin): Self = StObject.set(x, "monitor_config", value.asInstanceOf[js.Any])
      
      inline def setMonitor_configUndefined: Self = StObject.set(x, "monitor_config", js.undefined)
      
      inline def setMonitor_slug(value: String): Self = StObject.set(x, "monitor_slug", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setStatus(value: in_progress | ok | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type SerializedMonitorConfig = NonNullable[js.UndefOr[Checkinmargin]]
}
