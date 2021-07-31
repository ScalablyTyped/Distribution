package typings.reactAlert

import typings.reactAlert.mod.AlertPosition
import typings.reactAlert.mod.AlertTransition
import typings.reactAlert.mod.AlertType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactAlertStrings {
  
  @js.native
  sealed trait alert extends StObject
  @scala.inline
  def alert: alert = "alert".asInstanceOf[alert]
  
  @js.native
  sealed trait `bottom center`
    extends StObject
       with AlertPosition
  @scala.inline
  def `bottom center`: `bottom center` = ("bottom center").asInstanceOf[`bottom center`]
  
  @js.native
  sealed trait `bottom left`
    extends StObject
       with AlertPosition
  @scala.inline
  def `bottom left`: `bottom left` = ("bottom left").asInstanceOf[`bottom left`]
  
  @js.native
  sealed trait `bottom right`
    extends StObject
       with AlertPosition
  @scala.inline
  def `bottom right`: `bottom right` = ("bottom right").asInstanceOf[`bottom right`]
  
  @js.native
  sealed trait error
    extends StObject
       with AlertType
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fade
    extends StObject
       with AlertTransition
  @scala.inline
  def fade: fade = "fade".asInstanceOf[fade]
  
  @js.native
  sealed trait info
    extends StObject
       with AlertType
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait middle
    extends StObject
       with AlertPosition
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait `middle left`
    extends StObject
       with AlertPosition
  @scala.inline
  def `middle left`: `middle left` = ("middle left").asInstanceOf[`middle left`]
  
  @js.native
  sealed trait `middle right`
    extends StObject
       with AlertPosition
  @scala.inline
  def `middle right`: `middle right` = ("middle right").asInstanceOf[`middle right`]
  
  @js.native
  sealed trait scale
    extends StObject
       with AlertTransition
  @scala.inline
  def scale: scale = "scale".asInstanceOf[scale]
  
  @js.native
  sealed trait success
    extends StObject
       with AlertType
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait `top center`
    extends StObject
       with AlertPosition
  @scala.inline
  def `top center`: `top center` = ("top center").asInstanceOf[`top center`]
  
  @js.native
  sealed trait `top left`
    extends StObject
       with AlertPosition
  @scala.inline
  def `top left`: `top left` = ("top left").asInstanceOf[`top left`]
  
  @js.native
  sealed trait `top right`
    extends StObject
       with AlertPosition
  @scala.inline
  def `top right`: `top right` = ("top right").asInstanceOf[`top right`]
}
