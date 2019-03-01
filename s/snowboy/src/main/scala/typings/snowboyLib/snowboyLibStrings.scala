package typings
package snowboyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object snowboyLibStrings {
  @js.native
  sealed trait error
    extends snowboyLib.snowboyMod.State
  
  @js.native
  sealed trait hotword
    extends snowboyLib.snowboyMod.State
  
  @js.native
  sealed trait silence
    extends snowboyLib.snowboyMod.State
  
  @js.native
  sealed trait sound
    extends snowboyLib.snowboyMod.State
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def hotword: hotword = "hotword".asInstanceOf[hotword]
  @scala.inline
  def silence: silence = "silence".asInstanceOf[silence]
  @scala.inline
  def sound: sound = "sound".asInstanceOf[sound]
}

