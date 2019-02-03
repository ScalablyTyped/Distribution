package typings
package snowboyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object snowboyLibStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait hotword extends js.Object
  
  @js.native
  sealed trait silence extends js.Object
  
  @js.native
  sealed trait sound extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def hotword: hotword = "hotword".asInstanceOf[hotword]
  @scala.inline
  def silence: silence = "silence".asInstanceOf[silence]
  @scala.inline
  def sound: sound = "sound".asInstanceOf[sound]
}

