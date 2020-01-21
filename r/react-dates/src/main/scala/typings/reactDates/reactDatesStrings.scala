package typings.reactDates

import typings.reactDates.mod.AnchorDirectionShape
import typings.reactDates.mod.CalendarInfoPositionShape
import typings.reactDates.mod.FocusedInputShape
import typings.reactDates.mod.IconPositionShape
import typings.reactDates.mod.OpenDirectionShape
import typings.reactDates.mod.OrientationShape
import typings.reactDates.mod.ScrollableOrientationShape
import typings.reactDates.mod._DisabledShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDatesStrings {
  @js.native
  sealed trait after
    extends CalendarInfoPositionShape
       with IconPositionShape
  
  @js.native
  sealed trait before
    extends CalendarInfoPositionShape
       with IconPositionShape
  
  @js.native
  sealed trait bottom extends CalendarInfoPositionShape
  
  @js.native
  sealed trait down extends OpenDirectionShape
  
  @js.native
  sealed trait endDate
    extends FocusedInputShape
       with _DisabledShape
  
  @js.native
  sealed trait horizontal
    extends OrientationShape
       with ScrollableOrientationShape
  
  @js.native
  sealed trait left extends AnchorDirectionShape
  
  @js.native
  sealed trait right extends AnchorDirectionShape
  
  @js.native
  sealed trait startDate
    extends FocusedInputShape
       with _DisabledShape
  
  @js.native
  sealed trait top extends CalendarInfoPositionShape
  
  @js.native
  sealed trait up extends OpenDirectionShape
  
  @js.native
  sealed trait vertical
    extends OrientationShape
       with ScrollableOrientationShape
  
  @js.native
  sealed trait verticalScrollable extends ScrollableOrientationShape
  
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def endDate: endDate = "endDate".asInstanceOf[endDate]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def startDate: startDate = "startDate".asInstanceOf[startDate]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  @scala.inline
  def verticalScrollable: verticalScrollable = "verticalScrollable".asInstanceOf[verticalScrollable]
}

