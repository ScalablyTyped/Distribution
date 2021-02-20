package typings.reactDates

import typings.reactDates.mod.AnchorDirectionShape
import typings.reactDates.mod.CalendarInfoPositionShape
import typings.reactDates.mod.FocusedInputShape
import typings.reactDates.mod.IconPositionShape
import typings.reactDates.mod.NavPositionShape
import typings.reactDates.mod.OpenDirectionShape
import typings.reactDates.mod.OrientationShape
import typings.reactDates.mod.ScrollableOrientationShape
import typings.reactDates.mod._DisabledShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactDatesStrings {
  
  @js.native
  sealed trait after
    extends CalendarInfoPositionShape
       with IconPositionShape
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait before
    extends CalendarInfoPositionShape
       with IconPositionShape
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait bottom extends CalendarInfoPositionShape
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait down extends OpenDirectionShape
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait endDate
    extends FocusedInputShape
       with _DisabledShape
  @scala.inline
  def endDate: endDate = "endDate".asInstanceOf[endDate]
  
  @js.native
  sealed trait horizontal
    extends OrientationShape
       with ScrollableOrientationShape
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait left extends AnchorDirectionShape
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait navPositionBottom extends NavPositionShape
  @scala.inline
  def navPositionBottom: navPositionBottom = "navPositionBottom".asInstanceOf[navPositionBottom]
  
  @js.native
  sealed trait navPositionTop extends NavPositionShape
  @scala.inline
  def navPositionTop: navPositionTop = "navPositionTop".asInstanceOf[navPositionTop]
  
  @js.native
  sealed trait right extends AnchorDirectionShape
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait startDate
    extends FocusedInputShape
       with _DisabledShape
  @scala.inline
  def startDate: startDate = "startDate".asInstanceOf[startDate]
  
  @js.native
  sealed trait top extends CalendarInfoPositionShape
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait up extends OpenDirectionShape
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait vertical
    extends OrientationShape
       with ScrollableOrientationShape
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait verticalScrollable extends ScrollableOrientationShape
  @scala.inline
  def verticalScrollable: verticalScrollable = "verticalScrollable".asInstanceOf[verticalScrollable]
}
