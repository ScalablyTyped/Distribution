package typings.redisInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object redisInfoStrings {
  @js.native
  sealed trait `32` extends js.Object
  
  @js.native
  sealed trait `64` extends js.Object
  
  @js.native
  sealed trait cluster extends js.Object
  
  @js.native
  sealed trait master extends js.Object
  
  @js.native
  sealed trait sentinel extends js.Object
  
  @js.native
  sealed trait slave extends js.Object
  
  @js.native
  sealed trait standalone extends js.Object
  
  @scala.inline
  def `32`: `32` = "32".asInstanceOf[`32`]
  @scala.inline
  def `64`: `64` = "64".asInstanceOf[`64`]
  @scala.inline
  def cluster: cluster = "cluster".asInstanceOf[cluster]
  @scala.inline
  def master: master = "master".asInstanceOf[master]
  @scala.inline
  def sentinel: sentinel = "sentinel".asInstanceOf[sentinel]
  @scala.inline
  def slave: slave = "slave".asInstanceOf[slave]
  @scala.inline
  def standalone: standalone = "standalone".asInstanceOf[standalone]
}

