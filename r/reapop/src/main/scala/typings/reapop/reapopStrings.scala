package typings.reapop

import typings.reapop.typesMod.Position
import typings.reapop.typesMod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reapopStrings {
  
  @scala.inline
  def `bottom-center`: `bottom-center` = "bottom-center".asInstanceOf[`bottom-center`]
  
  @scala.inline
  def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @scala.inline
  def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @scala.inline
  def `top-center`: `top-center` = "top-center".asInstanceOf[`top-center`]
  
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait `bottom-center` extends Position
  
  @js.native
  sealed trait `bottom-left` extends Position
  
  @js.native
  sealed trait `bottom-right` extends Position
  
  @js.native
  sealed trait error extends Status
  
  @js.native
  sealed trait info extends Status
  
  @js.native
  sealed trait loading extends Status
  
  @js.native
  sealed trait none extends Status
  
  @js.native
  sealed trait success extends Status
  
  @js.native
  sealed trait `top-center` extends Position
  
  @js.native
  sealed trait `top-left` extends Position
  
  @js.native
  sealed trait `top-right` extends Position
  
  @js.native
  sealed trait warning extends Status
}
