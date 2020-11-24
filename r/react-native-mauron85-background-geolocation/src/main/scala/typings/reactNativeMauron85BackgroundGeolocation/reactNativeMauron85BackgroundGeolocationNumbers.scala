package typings.reactNativeMauron85BackgroundGeolocation

import typings.reactNativeMauron85BackgroundGeolocation.mod.AuthorizationStatus
import typings.reactNativeMauron85BackgroundGeolocation.mod.LocationErrorCode
import typings.reactNativeMauron85BackgroundGeolocation.mod.LocationProvider
import typings.reactNativeMauron85BackgroundGeolocation.mod.ServiceMode
import typings.reactNativeMauron85BackgroundGeolocation.mod._AccuracyLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeMauron85BackgroundGeolocationNumbers {
  
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
}
