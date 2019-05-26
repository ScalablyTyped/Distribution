package typings
package rcDashMentionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcDashMentionsLibStrings {
  @js.native
  sealed trait OmitFunc extends js.Object
  
  @js.native
  sealed trait bottom
    extends rcDashMentionsLib.esMentionsMod.Placement
       with rcDashMentionsLib.libMentionsMod.Placement
  
  @js.native
  sealed trait onChange extends js.Object
  
  @js.native
  sealed trait onSelect extends js.Object
  
  @js.native
  sealed trait prefix extends js.Object
  
  @js.native
  sealed trait top
    extends rcDashMentionsLib.esMentionsMod.Placement
       with rcDashMentionsLib.libMentionsMod.Placement
  
  @scala.inline
  def OmitFunc: OmitFunc = "OmitFunc".asInstanceOf[OmitFunc]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def onChange: onChange = "onChange".asInstanceOf[onChange]
  @scala.inline
  def onSelect: onSelect = "onSelect".asInstanceOf[onSelect]
  @scala.inline
  def prefix: prefix = "prefix".asInstanceOf[prefix]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}

