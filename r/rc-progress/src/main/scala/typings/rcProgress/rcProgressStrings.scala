package typings.rcProgress

import typings.rcProgress.interfaceMod.GapPositionType
import typings.rcProgress.interfaceMod.StrokeLinecapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcProgressStrings {
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait bottom extends GapPositionType
  
  @js.native
  sealed trait butt extends StrokeLinecapType
  
  @js.native
  sealed trait left extends GapPositionType
  
  @js.native
  sealed trait right extends GapPositionType
  
  @js.native
  sealed trait round extends StrokeLinecapType
  
  @js.native
  sealed trait square extends StrokeLinecapType
  
  @js.native
  sealed trait top extends GapPositionType
}
