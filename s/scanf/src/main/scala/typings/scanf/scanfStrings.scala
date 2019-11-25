package typings.scanf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object scanfStrings {
  @js.native
  sealed trait `%S` extends js.Object
  
  @js.native
  sealed trait `%d` extends js.Object
  
  @js.native
  sealed trait `%f` extends js.Object
  
  @js.native
  sealed trait `%o` extends js.Object
  
  @js.native
  sealed trait `%s_` extends js.Object
  
  @js.native
  sealed trait `%x` extends js.Object
  
  @scala.inline
  def `%S`: `%S` = "%S".asInstanceOf[`%S`]
  @scala.inline
  def `%d`: `%d` = "%d".asInstanceOf[`%d`]
  @scala.inline
  def `%f`: `%f` = "%f".asInstanceOf[`%f`]
  @scala.inline
  def `%o`: `%o` = "%o".asInstanceOf[`%o`]
  @scala.inline
  def `%s_`: `%s_` = "%s".asInstanceOf[`%s_`]
  @scala.inline
  def `%x`: `%x` = "%x".asInstanceOf[`%x`]
}

