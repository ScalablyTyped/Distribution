package typings.smoothie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smoothieStrings {
  
  @scala.inline
  def bezier: bezier = "bezier".asInstanceOf[bezier]
  
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  
  @scala.inline
  def step: step = "step".asInstanceOf[step]
  
  @js.native
  sealed trait bezier extends js.Object
  
  @js.native
  sealed trait linear extends js.Object
  
  @js.native
  sealed trait step extends js.Object
}
