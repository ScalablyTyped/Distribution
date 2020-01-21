package typings.reactNativeAwesomeCardIo

import typings.reactNativeAwesomeCardIo.mod.CardIODetectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeAwesomeCardIoStrings {
  @js.native
  sealed trait AUTOMATIC extends CardIODetectionMode
  
  @js.native
  sealed trait IMAGE extends CardIODetectionMode
  
  @js.native
  sealed trait IMAGE_AND_NUMBER extends CardIODetectionMode
  
  @scala.inline
  def AUTOMATIC: AUTOMATIC = "AUTOMATIC".asInstanceOf[AUTOMATIC]
  @scala.inline
  def IMAGE: IMAGE = "IMAGE".asInstanceOf[IMAGE]
  @scala.inline
  def IMAGE_AND_NUMBER: IMAGE_AND_NUMBER = "IMAGE_AND_NUMBER".asInstanceOf[IMAGE_AND_NUMBER]
}

