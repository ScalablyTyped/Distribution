package typings.scrollIntoViewIfNeeded

import typings.scrollIntoViewIfNeeded.typesMod.ScrollBehavior
import typings.scrollIntoViewIfNeeded.typesMod.ScrollLogicalPosition
import typings.scrollIntoViewIfNeeded.typesMod.ScrollMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollIntoViewIfNeededStrings {
  @js.native
  sealed trait always extends ScrollMode
  
  @js.native
  sealed trait auto extends ScrollBehavior
  
  @js.native
  sealed trait center extends ScrollLogicalPosition
  
  @js.native
  sealed trait end extends ScrollLogicalPosition
  
  @js.native
  sealed trait `if-needed` extends ScrollMode
  
  @js.native
  sealed trait nearest extends ScrollLogicalPosition
  
  @js.native
  sealed trait smooth extends ScrollBehavior
  
  @js.native
  sealed trait start extends ScrollLogicalPosition
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def `if-needed`: `if-needed` = "if-needed".asInstanceOf[`if-needed`]
  @scala.inline
  def nearest: nearest = "nearest".asInstanceOf[nearest]
  @scala.inline
  def smooth: smooth = "smooth".asInstanceOf[smooth]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}

