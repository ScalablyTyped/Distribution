package typings.standardEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object standardEngineStrings {
  @js.native
  sealed trait cwd extends js.Object
  
  @js.native
  sealed trait filename extends js.Object
  
  @js.native
  sealed trait ignore extends js.Object
  
  @scala.inline
  def cwd: cwd = "cwd".asInstanceOf[cwd]
  @scala.inline
  def filename: filename = "filename".asInstanceOf[filename]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
}

