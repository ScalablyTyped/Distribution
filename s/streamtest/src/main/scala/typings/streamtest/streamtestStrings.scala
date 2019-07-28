package typings.streamtest

import typings.streamtest.streamtestMod.VersionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object streamtestStrings {
  @js.native
  sealed trait v1 extends VersionName
  
  @js.native
  sealed trait v2 extends VersionName
  
  @scala.inline
  def v1: v1 = "v1".asInstanceOf[v1]
  @scala.inline
  def v2: v2 = "v2".asInstanceOf[v2]
}

