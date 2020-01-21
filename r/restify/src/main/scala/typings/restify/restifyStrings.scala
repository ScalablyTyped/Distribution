package typings.restify

import typings.restify.mod.plugins._TMetricsCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object restifyStrings {
  @js.native
  sealed trait aborted extends _TMetricsCallback
  
  @js.native
  sealed trait after extends js.Object
  
  @js.native
  sealed trait close extends _TMetricsCallback
  
  @js.native
  sealed trait pre extends js.Object
  
  @js.native
  sealed trait routed extends js.Object
  
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def pre: pre = "pre".asInstanceOf[pre]
  @scala.inline
  def routed: routed = "routed".asInstanceOf[routed]
}

