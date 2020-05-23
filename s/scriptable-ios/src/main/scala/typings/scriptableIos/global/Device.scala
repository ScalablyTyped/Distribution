package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Provides information about the device._
  * @see https://docs.scriptable.app/device
  */
@JSGlobal("Device")
@js.native
object Device extends js.Object {
  /**
    * _Current battery level._
    *
    * The value is in percentage ranging between 0 and 1.
    * @see https://docs.scriptable.app/device/#batterylevel
    */
  def batteryLevel(): Double = js.native
  /**
    * _Whether the device is being charged._
    * @see https://docs.scriptable.app/device/#ischarging
    */
  def isCharging(): Boolean = js.native
  /**
    * _Whether the device is being not plugged into power and thus discharging._
    * @see https://docs.scriptable.app/device/#isdischarging
    */
  def isDischarging(): Boolean = js.native
  /**
    * _Whether the device is lying parallel to the ground with the screen facing downwards._
    * @see https://docs.scriptable.app/device/#isfacedown
    */
  def isFaceDown(): Boolean = js.native
  /**
    * _Whether the device is lying parallel to the ground with the screen facing upwards._
    * @see https://docs.scriptable.app/device/#isfaceup
    */
  def isFaceUp(): Boolean = js.native
  /**
    * _Whether the device is fully charged._
    * @see https://docs.scriptable.app/device/#isfullycharged
    */
  def isFullyCharged(): Boolean = js.native
  /**
    * _Whether the device is in landscape with the home button or home indicator on the right side._
    * @see https://docs.scriptable.app/device/#isinlandscapeleft
    */
  def isInLandscapeLeft(): Boolean = js.native
  /**
    * _Whether the device is in landscape with the home button or home indicator on the left side._
    * @see https://docs.scriptable.app/device/#isinlandscaperight
    */
  def isInLandscapeRight(): Boolean = js.native
  /**
    * _Whether the device is in portrait with the home button or home indicator at the bottom._
    * @see https://docs.scriptable.app/device/#isinportrait
    */
  def isInPortrait(): Boolean = js.native
  /**
    * _Whether the device is in portrait but upside down with the home button or home indicator at the top._
    * @see https://docs.scriptable.app/device/#isinportraitupsidedown
    */
  def isInPortraitUpsideDown(): Boolean = js.native
  /**
    * _Whether the device is a pad._
    *
    * You can use this property to choose behavior of a script depending on whether its running on a phone or a pad.
    * @see https://docs.scriptable.app/device/#ispad
    */
  def isPad(): Boolean = js.native
  /**
    * _Whether the device is a phone._
    *
    * You can use this property to choose behavior of a script depending on whether its running on a phone or a pad.
    * @see https://docs.scriptable.app/device/#isphone
    */
  def isPhone(): Boolean = js.native
  /**
    * _Whether the device is using dark appearance._
    * @see https://docs.scriptable.app/device/#isusingdarkappearance
    */
  def isUsingDarkAppearance(): Boolean = js.native
  /**
    * _Identifier for the device language._
    * @see https://docs.scriptable.app/device/#language
    */
  def language(): String = js.native
  /**
    * _Identifier for the device locale._
    * @see https://docs.scriptable.app/device/#locale
    */
  def locale(): String = js.native
  /**
    * _Model of the device, e.g. "iPhone"._
    * @see https://docs.scriptable.app/device/#model
    */
  def model(): String = js.native
  /**
    * _Name identifying the device._
    *
    * You can find and edit the name of your device in the system settings.
    * @see https://docs.scriptable.app/device/#name
    */
  def name(): String = js.native
  /**
    * _The preferred langauges._
    *
    * The list is ordered according to the language preferences specified in the system settings.
    * @see https://docs.scriptable.app/device/#preferredlanguages
    */
  def preferredLanguages(): js.Array[String] = js.native
  /**
    * _Brightness of the screen in percentage._
    *
    * The value range from 0 to 1. To set the screen brightness, refer to the `setScreenBrightness()` function.
    * @see https://docs.scriptable.app/device/#screenbrightness
    */
  def screenBrightness(): Double = js.native
  /**
    * _Resolution of the screen._
    *
    * The value is measured in pixels. The value does not take the rotation of the deviec into account.
    * @see https://docs.scriptable.app/device/#screenresolution
    */
  def screenResolution(): typings.scriptableIos.Size = js.native
  /**
    * _Scale of the screen._
    *
    * Standard resolution displays have a scale of 1.0 where one point on the screen equals one pixel. Retina displays will have a scale factor of 2.0 or 3.0 where one point on the
    * screen is four or nine pixels, respectively.
    * @see https://docs.scriptable.app/device/#screenscale
    */
  def screenScale(): Double = js.native
  /**
    * _Size of the screen._
    *
    * The value is measured in points. For an explanation of the relationship between points and pixels, see the documentation of the `screenScale()` method. The value takes the device
    * rotation into account, so the value will vary between portrait and landscape.
    * @see https://docs.scriptable.app/device/#screensize
    */
  def screenSize(): typings.scriptableIos.Size = js.native
  /**
    * _Sets the brightness of the screen._
    *
    * The value range from 0 to 1. To get the screen brightness, refer to the `screenBrightness()` function.
    * @param percentage - Percentage to set the screen brightness to. Value between 0 and 1.
    * @see https://docs.scriptable.app/device/#setscreenbrightness
    */
  def setScreenBrightness(percentage: Double): Unit = js.native
  /**
    * _Name of the operating system:_
    * @see https://docs.scriptable.app/device/#systemname
    */
  def systemName(): String = js.native
  /**
    * _Version of the operating system._
    * @see https://docs.scriptable.app/device/#systemversion
    */
  def systemVersion(): String = js.native
  /**
    * _The device volume._
    *
    * The value range from 0 to 1.
    * @see https://docs.scriptable.app/device/#volume
    */
  def volume(): Double = js.native
}

