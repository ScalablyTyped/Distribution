package typings.staticmaps

import typings.staticmaps.mod.TextAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticmapsStrings {
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait end extends TextAnchor
  
  @js.native
  sealed trait middle extends TextAnchor
  
  @js.native
  sealed trait start extends TextAnchor
}
