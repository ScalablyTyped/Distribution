package typings.scrollIntoView

import typings.scrollIntoView.ScrollIntoView.callbackParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object scrollIntoViewStrings {
  @js.native
  sealed trait canceled extends callbackParameterType
  
  @js.native
  sealed trait complete extends callbackParameterType
  
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
}

