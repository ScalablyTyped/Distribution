package typings.reactNativeMauron85BackgroundGeolocation

import typings.reactNativeMauron85BackgroundGeolocation.mod.ActivityType
import typings.reactNativeMauron85BackgroundGeolocation.mod.Event
import typings.reactNativeMauron85BackgroundGeolocation.mod.HeadlessTaskEventName
import typings.reactNativeMauron85BackgroundGeolocation.mod.LogLevel
import typings.reactNativeMauron85BackgroundGeolocation.mod.NativeProvider
import typings.reactNativeMauron85BackgroundGeolocation.mod.iOSActivityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeMauron85BackgroundGeolocationStrings {
  @js.native
  sealed trait AutomotiveNavigation extends iOSActivityType
  
  @js.native
  sealed trait DEBUG extends LogLevel
  
  @js.native
  sealed trait ERROR extends LogLevel
  
  @js.native
  sealed trait Fitness extends iOSActivityType
  
  @js.native
  sealed trait INFO extends LogLevel
  
  @js.native
  sealed trait IN_VEHICLE extends ActivityType
  
  @js.native
  sealed trait ON_BICYCLE extends ActivityType
  
  @js.native
  sealed trait ON_FOOT extends ActivityType
  
  @js.native
  sealed trait Other extends iOSActivityType
  
  @js.native
  sealed trait OtherNavigation extends iOSActivityType
  
  @js.native
  sealed trait RUNNING extends ActivityType
  
  @js.native
  sealed trait STILL extends ActivityType
  
  @js.native
  sealed trait TILTING extends ActivityType
  
  @js.native
  sealed trait TRACE extends LogLevel
  
  @js.native
  sealed trait UNKNOWN extends ActivityType
  
  @js.native
  sealed trait WALKING extends ActivityType
  
  @js.native
  sealed trait WARN extends LogLevel
  
  @js.native
  sealed trait abort_requested extends Event
  
  @js.native
  sealed trait activity
    extends Event
       with HeadlessTaskEventName
  
  @js.native
  sealed trait authorization extends Event
  
  @js.native
  sealed trait background extends Event
  
  @js.native
  sealed trait error_ extends Event
  
  @js.native
  sealed trait foreground extends Event
  
  @js.native
  sealed trait fused extends NativeProvider
  
  @js.native
  sealed trait gps extends NativeProvider
  
  @js.native
  sealed trait http_authorization extends Event
  
  @js.native
  sealed trait location
    extends Event
       with HeadlessTaskEventName
  
  @js.native
  sealed trait network extends NativeProvider
  
  @js.native
  sealed trait passive extends NativeProvider
  
  @js.native
  sealed trait start extends Event
  
  @js.native
  sealed trait stationary
    extends Event
       with HeadlessTaskEventName
  
  @js.native
  sealed trait stop extends Event
  
  @scala.inline
  def AutomotiveNavigation: AutomotiveNavigation = "AutomotiveNavigation".asInstanceOf[AutomotiveNavigation]
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def Fitness: Fitness = "Fitness".asInstanceOf[Fitness]
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  @scala.inline
  def IN_VEHICLE: IN_VEHICLE = "IN_VEHICLE".asInstanceOf[IN_VEHICLE]
  @scala.inline
  def ON_BICYCLE: ON_BICYCLE = "ON_BICYCLE".asInstanceOf[ON_BICYCLE]
  @scala.inline
  def ON_FOOT: ON_FOOT = "ON_FOOT".asInstanceOf[ON_FOOT]
  @scala.inline
  def Other: Other = "Other".asInstanceOf[Other]
  @scala.inline
  def OtherNavigation: OtherNavigation = "OtherNavigation".asInstanceOf[OtherNavigation]
  @scala.inline
  def RUNNING: RUNNING = "RUNNING".asInstanceOf[RUNNING]
  @scala.inline
  def STILL: STILL = "STILL".asInstanceOf[STILL]
  @scala.inline
  def TILTING: TILTING = "TILTING".asInstanceOf[TILTING]
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  @scala.inline
  def WALKING: WALKING = "WALKING".asInstanceOf[WALKING]
  @scala.inline
  def WARN: WARN = "WARN".asInstanceOf[WARN]
  @scala.inline
  def abort_requested: abort_requested = "abort_requested".asInstanceOf[abort_requested]
  @scala.inline
  def activity: activity = "activity".asInstanceOf[activity]
  @scala.inline
  def authorization: authorization = "authorization".asInstanceOf[authorization]
  @scala.inline
  def background: background = "background".asInstanceOf[background]
  @scala.inline
  def error_ : error_ = "error".asInstanceOf[error_]
  @scala.inline
  def foreground: foreground = "foreground".asInstanceOf[foreground]
  @scala.inline
  def fused: fused = "fused".asInstanceOf[fused]
  @scala.inline
  def gps: gps = "gps".asInstanceOf[gps]
  @scala.inline
  def http_authorization: http_authorization = "http_authorization".asInstanceOf[http_authorization]
  @scala.inline
  def location: location = "location".asInstanceOf[location]
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  @scala.inline
  def passive: passive = "passive".asInstanceOf[passive]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def stationary: stationary = "stationary".asInstanceOf[stationary]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
}

