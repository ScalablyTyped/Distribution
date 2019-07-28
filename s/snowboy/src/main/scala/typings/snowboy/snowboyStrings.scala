package typings.snowboy

import typings.snowboy.snowboyMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object snowboyStrings {
  @js.native
  sealed trait error extends State
  
  @js.native
  sealed trait hotword extends State
  
  @js.native
  sealed trait silence extends State
  
  @js.native
  sealed trait sound extends State
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def hotword: hotword = "hotword".asInstanceOf[hotword]
  @scala.inline
  def silence: silence = "silence".asInstanceOf[silence]
  @scala.inline
  def sound: sound = "sound".asInstanceOf[sound]
}

