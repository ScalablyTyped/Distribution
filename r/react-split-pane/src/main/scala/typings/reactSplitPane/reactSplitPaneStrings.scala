package typings.reactSplitPane

import typings.reactSplitPane.mod.Split
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactSplitPaneStrings {
  @js.native
  sealed trait first extends js.Object
  
  @js.native
  sealed trait horizontal extends Split
  
  @js.native
  sealed trait second extends js.Object
  
  @js.native
  sealed trait vertical extends Split
  
  @scala.inline
  def first: first = "first".asInstanceOf[first]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def second: second = "second".asInstanceOf[second]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

