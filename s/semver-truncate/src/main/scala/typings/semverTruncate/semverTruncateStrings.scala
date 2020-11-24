package typings.semverTruncate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semverTruncateStrings {
  
  @scala.inline
  def major: major = "major".asInstanceOf[major]
  
  @scala.inline
  def minor: minor = "minor".asInstanceOf[minor]
  
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait major extends js.Object
  
  @js.native
  sealed trait minor extends js.Object
  
  @js.native
  sealed trait patch extends js.Object
}
