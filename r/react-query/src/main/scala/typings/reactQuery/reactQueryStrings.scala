package typings.reactQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactQueryStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait idle extends js.Object
  
  @js.native
  sealed trait loading extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

