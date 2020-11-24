package typings.scrollIntoView

import typings.scrollIntoView.ScrollIntoView.callbackParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollIntoViewStrings {
  
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait canceled extends callbackParameterType
  
  @js.native
  sealed trait complete extends callbackParameterType
}
