package typings.promiseAllsettled

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseAllsettledStrings {
  
  @scala.inline
  def PromiseResultTuple: PromiseResultTuple = "PromiseResultTuple".asInstanceOf[PromiseResultTuple]
  
  @scala.inline
  def PromiseTuple: PromiseTuple = "PromiseTuple".asInstanceOf[PromiseTuple]
  
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait PromiseResultTuple extends js.Object
  
  @js.native
  sealed trait PromiseTuple extends js.Object
  
  @js.native
  sealed trait fulfilled extends js.Object
  
  @js.native
  sealed trait rejected extends js.Object
}
