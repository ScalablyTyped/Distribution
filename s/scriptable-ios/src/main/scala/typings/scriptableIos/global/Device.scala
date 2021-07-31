package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Provides information about the device._
  * @see https://docs.scriptable.app/device
  */
object Device {
  
  @JSGlobal("Device")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Current battery level._
    *
    * The value is in percentage ranging between 0 and 1.
    * @see https://docs.scriptable.app/device/#batterylevel
    */
  @scala.inline
  def batteryLevel(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("batteryLevel")().asInstanceOf[Double]
  
  /**
    * _Whether the device is being charged._
    * @see https://docs.scriptable.app/device/#ischarging
    */
  @scala.inline
  def isCharging(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCharging")().asInstanceOf[Boolean]
  
  /**
    * _Whether the device is being not plugged into power and thus discharging._
    * @see https://docs.scriptable.app/device/#isdischarging
    */
  @scala.inline
  def isDischarging(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDischarging")().asInstanceOf[Boolean]
  
  /**
    * _Whether the device is lying parallel to the ground with the screen facing downwards._
    * @see https://docs.scriptable.app/device/#isfacedown
    */
  @scala.inline
  def isFaceDown(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFaceDown")().asInstanceOf[Boolean]
  
  /**
    * _Whether the device is lying parallel to the ground with the screen facing upwards._
    * @see https://docs.scriptable.app/device/#isfaceup
    */
  @scala.inline
  def isFaceUp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFaceUp")().asInstanceOf[Boolean]
  
  /**
    * _Whether the device is fully charged._
    * @see https://docs.scriptable.app/device/#isfullycharged
    */
  @scala.inline
  def isFullyCharged(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullyCharged")().asInstanceOf[Boolean]
  
  /**
    * _Whether the device is in landscape with the home button or home indicator on the right side._
    * @see https://docs.scriptable.app/device/#isinlandscapeleft
    */
  @scala.inline
  def isInLandscapeLeft(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInLandscapeLeft")().asInstanceOf[Boolean]
  
  /**
    * _Whether the device is in landscape with the home button or home indicator on the left side._
    * @see https://docs.scriptable.app/device/#isinlandscaperight
    */
  @scala.inline
  def isInLandscapeRight(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInLandscapeRight")().asInstanceOf[Boolean]
  
  /**
    * _Whether the device is in portrait with the home button or home indicator at the bottom._
    * @see https://docs.scriptable.app/device/#isinportrait
    */
  @scala.inline
  def isInPortrait(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInPortrait")().asInstanceOf[Boolean]
  
  /**
    * _Whether the device is in portrait but upside down with the home button or home indicator at the top._
    * @see https://docs.scriptable.app/device/#isinportraitupsidedown
    */
  @scala.inline
  def isInPortraitUpsideDown(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInPortraitUpsideDown")().asInstanceOf[Boolean]
  
  /**
    * _Whether the device is a pad._
    *
    * You can use this property to choose behavior of a script depending on whether its running on a phone or a pad.
    * @see https://docs.scriptable.app/device/#ispad
    */
  @scala.inline
  def isPad(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPad")().asInstanceOf[Boolean]
  
  /**
    * _Whether the device is a phone._
    *
    * You can use this property to choose behavior of a script depending on whether its running on a phone or a pad.
    * @see https://docs.scriptable.app/device/#isphone
    */
  @scala.inline
  def isPhone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhone")().asInstanceOf[Boolean]
  
  /**
    * _Whether the device is using dark appearance._
    *
    * This API is not supported in widgets.
    * @see https://docs.scriptable.app/device/#isusingdarkappearance
    */
  @scala.inline
  def isUsingDarkAppearance(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingDarkAppearance")().asInstanceOf[Boolean]
  
  /**
    * _Identifier for the device language._
    * @see https://docs.scriptable.app/device/#language
    */
  @scala.inline
  def language(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("language")().asInstanceOf[String]
  
  /**
    * _Identifier for the device locale._
    * @see https://docs.scriptable.app/device/#locale
    */
  @scala.inline
  def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
  
  /**
    * _Model of the device, e.g. "iPhone"._
    * @see https://docs.scriptable.app/device/#model
    */
  @scala.inline
  def model(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("model")().asInstanceOf[String]
  
  /**
    * _Name identifying the device._
    *
    * You can find and edit the name of your device in the system settings.
    * @see https://docs.scriptable.app/device/#name
    */
  @scala.inline
  def name(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("name")().asInstanceOf[String]
  
  /**
    * _The preferred langauges._
    *
    * The list is ordered according to the language preferences specified in the system settings.
    * @see https://docs.scriptable.app/device/#preferredlanguages
    */
  @scala.inline
  def preferredLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("preferredLanguages")().asInstanceOf[js.Array[String]]
  
  /**
    * _Brightness of the screen in percentage._
    *
    * The value range from 0 to 1. To set the screen brightness, refer to the `setScreenBrightness()` function.
    * @see https://docs.scriptable.app/device/#screenbrightness
    */
  @scala.inline
  def screenBrightness(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("screenBrightness")().asInstanceOf[Double]
  
  /**
    * _Resolution of the screen._
    *
    * The value is measured in pixels. The value does not take the rotation of the deviec into account.
    * @see https://docs.scriptable.app/device/#screenresolution
    */
  @scala.inline
  def screenResolution(): typings.scriptableIos.Size = ^.asInstanceOf[js.Dynamic].applyDynamic("screenResolution")().asInstanceOf[typings.scriptableIos.Size]
  
  /**
    * _Scale of the screen._
    *
    * Standard resolution displays have a scale of 1.0 where one point on the screen equals one pixel. Retina displays will have a scale factor of 2.0 or 3.0 where one point on the
    * screen is four or nine pixels, respectively.
    * @see https://docs.scriptable.app/device/#screenscale
    */
  @scala.inline
  def screenScale(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("screenScale")().asInstanceOf[Double]
  
  /**
    * _Size of the screen._
    *
    * The value is measured in points. For an explanation of the relationship between points and pixels, see the documentation of the `screenScale()` method. The value takes the device
    * rotation into account, so the value will vary between portrait and landscape.
    * @see https://docs.scriptable.app/device/#screensize
    */
  @scala.inline
  def screenSize(): typings.scriptableIos.Size = ^.asInstanceOf[js.Dynamic].applyDynamic("screenSize")().asInstanceOf[typings.scriptableIos.Size]
  
  /**
    * _Sets the brightness of the screen._
    *
    * The value range from 0 to 1. To get the screen brightness, refer to the `screenBrightness()` function.
    * @param percentage - Percentage to set the screen brightness to. Value between 0 and 1.
    * @see https://docs.scriptable.app/device/#setscreenbrightness
    */
  @scala.inline
  def setScreenBrightness(percentage: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setScreenBrightness")(percentage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Name of the operating system:_
    * @see https://docs.scriptable.app/device/#systemname
    */
  @scala.inline
  def systemName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("systemName")().asInstanceOf[String]
  
  /**
    * _Version of the operating system._
    * @see https://docs.scriptable.app/device/#systemversion
    */
  @scala.inline
  def systemVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("systemVersion")().asInstanceOf[String]
  
  /**
    * _The device volume._
    *
    * The value range from 0 to 1.
    * @see https://docs.scriptable.app/device/#volume
    */
  @scala.inline
  def volume(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("volume")().asInstanceOf[Double]
}
