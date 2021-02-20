package typings.reactWindow

import typings.reactWindow.mod.Align
import typings.reactWindow.mod.CSSDirection
import typings.reactWindow.mod.Direction
import typings.reactWindow.mod.Layout
import typings.reactWindow.mod.ScrollDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactWindowStrings {
  
  @js.native
  sealed trait auto extends Align
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait backward extends ScrollDirection
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  
  @js.native
  sealed trait center extends Align
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait end extends Align
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait forward extends ScrollDirection
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait horizontal
    extends Direction
       with Layout
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait ltr extends CSSDirection
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait rtl extends CSSDirection
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait smart extends Align
  @scala.inline
  def smart: smart = "smart".asInstanceOf[smart]
  
  @js.native
  sealed trait start extends Align
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait vertical
    extends Direction
       with Layout
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}
