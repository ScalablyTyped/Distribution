package typings.standardVersion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object standardVersionStrings {
  @js.native
  sealed trait bump extends js.Object
  
  @js.native
  sealed trait changelog extends js.Object
  
  @js.native
  sealed trait commit extends js.Object
  
  @js.native
  sealed trait tag extends js.Object
  
  @scala.inline
  def bump: bump = "bump".asInstanceOf[bump]
  @scala.inline
  def changelog: changelog = "changelog".asInstanceOf[changelog]
  @scala.inline
  def commit: commit = "commit".asInstanceOf[commit]
  @scala.inline
  def tag: tag = "tag".asInstanceOf[tag]
}

