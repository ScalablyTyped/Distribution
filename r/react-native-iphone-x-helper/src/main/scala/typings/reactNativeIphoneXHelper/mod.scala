package typings.reactNativeIphoneXHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-iphone-x-helper", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getBottomSpace(): Double = js.native
  def getStatusBarHeight(): Double = js.native
  def getStatusBarHeight(safe: Boolean): Double = js.native
  def ifIphoneX[T, U](iphoneXVal: T, regularVal: U): T | U = js.native
  def isIphoneX(): Boolean = js.native
}

