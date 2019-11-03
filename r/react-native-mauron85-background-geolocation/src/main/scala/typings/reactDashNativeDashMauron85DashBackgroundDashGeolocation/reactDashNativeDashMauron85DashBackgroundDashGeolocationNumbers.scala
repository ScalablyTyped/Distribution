package typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation

import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod.AuthorizationStatus
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod.LocationErrorCode
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod.LocationProvider
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod.ServiceMode
import typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod._AccuracyLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNativeDashMauron85DashBackgroundDashGeolocationNumbers {
  @js.native
  sealed trait `0`
    extends AuthorizationStatus
       with LocationProvider
       with ServiceMode
       with _AccuracyLevel
  
  @js.native
  sealed trait `1`
    extends AuthorizationStatus
       with LocationErrorCode
       with LocationProvider
       with ServiceMode
  
  @js.native
  sealed trait `100` extends _AccuracyLevel
  
  @js.native
  sealed trait `1000` extends _AccuracyLevel
  
  @js.native
  sealed trait `10000` extends _AccuracyLevel
  
  @js.native
  sealed trait `2`
    extends AuthorizationStatus
       with LocationErrorCode
       with LocationProvider
  
  @js.native
  sealed trait `3` extends LocationErrorCode
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `100`: `100` = 100.asInstanceOf[`100`]
  @scala.inline
  def `1000`: `1000` = 1000.asInstanceOf[`1000`]
  @scala.inline
  def `10000`: `10000` = 10000.asInstanceOf[`10000`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
}

