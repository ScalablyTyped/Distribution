package typings.snykDepGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object snykDepGraphStrings {
  @js.native
  sealed trait cyclic extends js.Object
  
  @js.native
  sealed trait dev extends js.Object
  
  @js.native
  sealed trait prod extends js.Object
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def cyclic: cyclic = "cyclic".asInstanceOf[cyclic]
  @scala.inline
  def dev: dev = "dev".asInstanceOf[dev]
  @scala.inline
  def prod: prod = "prod".asInstanceOf[prod]
  @scala.inline
  def `true`: `true` = "true".asInstanceOf[`true`]
}

