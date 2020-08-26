package typings.reactMdAppBar

import typings.reactMdAppBar.appBarMod.AppBarHeight
import typings.reactMdAppBar.appBarMod.AppBarPosition
import typings.reactMdAppBar.appBarMod.AppBarTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactMdAppBarStrings {
  @js.native
  sealed trait bottom extends AppBarPosition
  
  @js.native
  sealed trait clear extends AppBarTheme
  
  @js.native
  sealed trait default extends AppBarTheme
  
  @js.native
  sealed trait dense extends AppBarHeight
  
  @js.native
  sealed trait none extends AppBarHeight
  
  @js.native
  sealed trait normal extends AppBarHeight
  
  @js.native
  sealed trait primary extends AppBarTheme
  
  @js.native
  sealed trait prominent extends AppBarHeight
  
  @js.native
  sealed trait `prominent-dense` extends AppBarHeight
  
  @js.native
  sealed trait secondary extends AppBarTheme
  
  @js.native
  sealed trait top extends AppBarPosition
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def dense: dense = "dense".asInstanceOf[dense]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def primary: primary = "primary".asInstanceOf[primary]
  @scala.inline
  def prominent: prominent = "prominent".asInstanceOf[prominent]
  @scala.inline
  def `prominent-dense`: `prominent-dense` = "prominent-dense".asInstanceOf[`prominent-dense`]
  @scala.inline
  def secondary: secondary = "secondary".asInstanceOf[secondary]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}

