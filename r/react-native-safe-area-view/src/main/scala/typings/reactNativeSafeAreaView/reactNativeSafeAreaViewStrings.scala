package typings.reactNativeSafeAreaView

import typings.reactNativeSafeAreaView.mod.SafeAreaViewForceInsetValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeSafeAreaViewStrings {
  @js.native
  sealed trait always extends SafeAreaViewForceInsetValue
  
  @js.native
  sealed trait never extends SafeAreaViewForceInsetValue
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
}

