package typings.rcInputNumber

import typings.rcInputNumber.interfaceMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcInputNumberStrings {
  
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait large extends ISize
  
  @js.native
  sealed trait middle extends ISize
  
  @js.native
  sealed trait small extends ISize
}
