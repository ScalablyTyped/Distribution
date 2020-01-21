package typings.reactSound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactSoundStrings {
  @js.native
  sealed trait PAUSED extends js.Object
  
  @js.native
  sealed trait PLAYING extends js.Object
  
  @js.native
  sealed trait STOPPED extends js.Object
  
  @scala.inline
  def PAUSED: PAUSED = "PAUSED".asInstanceOf[PAUSED]
  @scala.inline
  def PLAYING: PLAYING = "PLAYING".asInstanceOf[PLAYING]
  @scala.inline
  def STOPPED: STOPPED = "STOPPED".asInstanceOf[STOPPED]
}

