package typings.psi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object psiStrings {
  @js.native
  sealed trait desktop extends js.Object
  
  @js.native
  sealed trait mobile extends js.Object
  
  @scala.inline
  def desktop: desktop = "desktop".asInstanceOf[desktop]
  @scala.inline
  def mobile: mobile = "mobile".asInstanceOf[mobile]
}

