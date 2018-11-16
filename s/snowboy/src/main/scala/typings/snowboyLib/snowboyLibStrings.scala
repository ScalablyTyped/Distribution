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
  
  def error: error = "error".asInstanceOf[error]
  def hotword: hotword = "hotword".asInstanceOf[hotword]
  def silence: silence = "silence".asInstanceOf[silence]
  def sound: sound = "sound".asInstanceOf[sound]
}

