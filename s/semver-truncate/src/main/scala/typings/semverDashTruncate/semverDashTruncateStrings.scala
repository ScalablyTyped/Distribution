package typings.semverDashTruncate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object semverDashTruncateStrings {
  @js.native
  sealed trait major extends js.Object
  
  @js.native
  sealed trait minor extends js.Object
  
  @js.native
  sealed trait patch extends js.Object
  
  @scala.inline
  def major: major = "major".asInstanceOf[major]
  @scala.inline
  def minor: minor = "minor".asInstanceOf[minor]
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
}

