package typings.rcSteps

import typings.rcSteps.interfaceMod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcStepsStrings {
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @scala.inline
  def navigation: navigation = "navigation".asInstanceOf[navigation]
  
  @scala.inline
  def process: process = "process".asInstanceOf[process]
  
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait default extends js.Object
  
  @js.native
  sealed trait error extends Status
  
  @js.native
  sealed trait finish extends Status
  
  @js.native
  sealed trait horizontal extends js.Object
  
  @js.native
  sealed trait navigation extends js.Object
  
  @js.native
  sealed trait process extends Status
  
  @js.native
  sealed trait small extends js.Object
  
  @js.native
  sealed trait vertical extends js.Object
  
  @js.native
  sealed trait wait extends Status
}
