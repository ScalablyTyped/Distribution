package typings.reactDashWindow

import typings.reactDashWindow.reactDashWindowMod.Align
import typings.reactDashWindow.reactDashWindowMod.CSSDirection
import typings.reactDashWindow.reactDashWindowMod.Direction
import typings.reactDashWindow.reactDashWindowMod.Layout
import typings.reactDashWindow.reactDashWindowMod.ScrollDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashWindowStrings {
  @js.native
  sealed trait auto extends Align
  
  @js.native
  sealed trait backward extends ScrollDirection
  
  @js.native
  sealed trait center extends Align
  
  @js.native
  sealed trait end extends Align
  
  @js.native
  sealed trait forward extends ScrollDirection
  
  @js.native
  sealed trait horizontal
    extends Direction
       with Layout
  
  @js.native
  sealed trait ltr extends CSSDirection
  
  @js.native
  sealed trait rtl extends CSSDirection
  
  @js.native
  sealed trait smart extends Align
  
  @js.native
  sealed trait start extends Align
  
  @js.native
  sealed trait vertical
    extends Direction
       with Layout
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  @scala.inline
  def smart: smart = "smart".asInstanceOf[smart]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

