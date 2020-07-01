package typings.rcMentions

import typings.rcMentions.mentionsMod.Direction
import typings.rcMentions.mentionsMod.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcMentionsStrings {
  @js.native
  sealed trait OmitFunc extends js.Object
  
  @js.native
  sealed trait bottom extends Placement
  
  @js.native
  sealed trait ltr extends Direction
  
  @js.native
  sealed trait onChange extends js.Object
  
  @js.native
  sealed trait onSelect extends js.Object
  
  @js.native
  sealed trait prefix extends js.Object
  
  @js.native
  sealed trait rtl extends Direction
  
  @js.native
  sealed trait top extends Placement
  
  @scala.inline
  def OmitFunc: OmitFunc = "OmitFunc".asInstanceOf[OmitFunc]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  @scala.inline
  def onChange: onChange = "onChange".asInstanceOf[onChange]
  @scala.inline
  def onSelect: onSelect = "onSelect".asInstanceOf[onSelect]
  @scala.inline
  def prefix: prefix = "prefix".asInstanceOf[prefix]
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}

