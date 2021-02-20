package typings.reactNativeMauron85BackgroundGeolocation

import typings.reactNativeMauron85BackgroundGeolocation.mod.ActivityType
import typings.reactNativeMauron85BackgroundGeolocation.mod.Event
import typings.reactNativeMauron85BackgroundGeolocation.mod.HeadlessTaskEventName
import typings.reactNativeMauron85BackgroundGeolocation.mod.LogLevel
import typings.reactNativeMauron85BackgroundGeolocation.mod.NativeProvider
import typings.reactNativeMauron85BackgroundGeolocation.mod.iOSActivityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeMauron85BackgroundGeolocationStrings {
  
  @js.native
  sealed trait AutomotiveNavigation extends iOSActivityType
  @scala.inline
  def AutomotiveNavigation: AutomotiveNavigation = "AutomotiveNavigation".asInstanceOf[AutomotiveNavigation]
  
  @js.native
  sealed trait DEBUG extends LogLevel
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait ERROR extends LogLevel
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait Fitness extends iOSActivityType
  @scala.inline
  def Fitness: Fitness = "Fitness".asInstanceOf[Fitness]
  
  @js.native
  sealed trait INFO extends LogLevel
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait IN_VEHICLE extends ActivityType
  @scala.inline
  def IN_VEHICLE: IN_VEHICLE = "IN_VEHICLE".asInstanceOf[IN_VEHICLE]
  
  @js.native
  sealed trait ON_BICYCLE extends ActivityType
  @scala.inline
  def ON_BICYCLE: ON_BICYCLE = "ON_BICYCLE".asInstanceOf[ON_BICYCLE]
  
  @js.native
  sealed trait ON_FOOT extends ActivityType
  @scala.inline
  def ON_FOOT: ON_FOOT = "ON_FOOT".asInstanceOf[ON_FOOT]
  
  @js.native
  sealed trait Other extends iOSActivityType
  @scala.inline
  def Other: Other = "Other".asInstanceOf[Other]
  
  @js.native
  sealed trait OtherNavigation extends iOSActivityType
  @scala.inline
  def OtherNavigation: OtherNavigation = "OtherNavigation".asInstanceOf[OtherNavigation]
  
  @js.native
  sealed trait RUNNING extends ActivityType
  @scala.inline
  def RUNNING: RUNNING = "RUNNING".asInstanceOf[RUNNING]
  
  @js.native
  sealed trait STILL extends ActivityType
  @scala.inline
  def STILL: STILL = "STILL".asInstanceOf[STILL]
  
  @js.native
  sealed trait TILTING extends ActivityType
  @scala.inline
  def TILTING: TILTING = "TILTING".asInstanceOf[TILTING]
  
  @js.native
  sealed trait TRACE extends LogLevel
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait UNKNOWN extends ActivityType
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait WALKING extends ActivityType
  @scala.inline
  def WALKING: WALKING = "WALKING".asInstanceOf[WALKING]
  
  @js.native
  sealed trait WARN extends LogLevel
  @scala.inline
  def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @js.native
  sealed trait abort_requested extends Event
  @scala.inline
  def abort_requested: abort_requested = "abort_requested".asInstanceOf[abort_requested]
  
  @js.native
  sealed trait activity
    extends Event
       with HeadlessTaskEventName
  @scala.inline
  def activity: activity = "activity".asInstanceOf[activity]
  
  @js.native
  sealed trait authorization extends Event
  @scala.inline
  def authorization: authorization = "authorization".asInstanceOf[authorization]
  
  @js.native
  sealed trait background extends Event
  @scala.inline
  def background: background = "background".asInstanceOf[background]
  
  @js.native
  sealed trait error_ extends Event
  @scala.inline
  def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait foreground extends Event
  @scala.inline
  def foreground: foreground = "foreground".asInstanceOf[foreground]
  
  @js.native
  sealed trait fused extends NativeProvider
  @scala.inline
  def fused: fused = "fused".asInstanceOf[fused]
  
  @js.native
  sealed trait gps extends NativeProvider
  @scala.inline
  def gps: gps = "gps".asInstanceOf[gps]
  
  @js.native
  sealed trait http_authorization extends Event
  @scala.inline
  def http_authorization: http_authorization = "http_authorization".asInstanceOf[http_authorization]
  
  @js.native
  sealed trait location
    extends Event
       with HeadlessTaskEventName
  @scala.inline
  def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait network extends NativeProvider
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait passive extends NativeProvider
  @scala.inline
  def passive: passive = "passive".asInstanceOf[passive]
  
  @js.native
  sealed trait start extends Event
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stationary
    extends Event
       with HeadlessTaskEventName
  @scala.inline
  def stationary: stationary = "stationary".asInstanceOf[stationary]
  
  @js.native
  sealed trait stop extends Event
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
}
