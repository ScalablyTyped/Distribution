package typings.promisePoller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promisePollerStrings {
  
  @scala.inline
  def `exponential-backoff`: `exponential-backoff` = "exponential-backoff".asInstanceOf[`exponential-backoff`]
  
  @scala.inline
  def `fixed-interval`: `fixed-interval` = "fixed-interval".asInstanceOf[`fixed-interval`]
  
  @scala.inline
  def `linear-backoff`: `linear-backoff` = "linear-backoff".asInstanceOf[`linear-backoff`]
  
  @js.native
  sealed trait `exponential-backoff` extends js.Object
  
  @js.native
  sealed trait `fixed-interval` extends js.Object
  
  @js.native
  sealed trait `linear-backoff` extends js.Object
}
