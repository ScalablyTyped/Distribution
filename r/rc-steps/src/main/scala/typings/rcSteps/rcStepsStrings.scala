package typings.rcSteps

import typings.rcSteps.interfaceMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcStepsStrings {
  
  @js.native
  sealed trait default extends StObject
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait error extends Status
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait finish extends Status
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  
  @js.native
  sealed trait horizontal extends StObject
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait navigation extends StObject
  @scala.inline
  def navigation: navigation = "navigation".asInstanceOf[navigation]
  
  @js.native
  sealed trait process extends Status
  @scala.inline
  def process: process = "process".asInstanceOf[process]
  
  @js.native
  sealed trait small extends StObject
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait vertical extends StObject
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait wait extends Status
}
