package typings.reactDashJoyride

import typings.reactDashJoyride.reactDashJoyrideMod.Placement
import typings.reactDashJoyride.reactDashJoyrideMod.PlacementBeacon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashJoyrideStrings {
  @js.native
  sealed trait auto extends Placement
  
  @js.native
  sealed trait beacon extends js.Object
  
  @js.native
  sealed trait bottom
    extends Placement
       with PlacementBeacon
  
  @js.native
  sealed trait `bottom-end` extends Placement
  
  @js.native
  sealed trait `bottom-start` extends Placement
  
  @js.native
  sealed trait center extends Placement
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait `error:target_not_found` extends js.Object
  
  @js.native
  sealed trait finished extends js.Object
  
  @js.native
  sealed trait go extends js.Object
  
  @js.native
  sealed trait idle extends js.Object
  
  @js.native
  sealed trait index extends js.Object
  
  @js.native
  sealed trait init extends js.Object
  
  @js.native
  sealed trait left
    extends Placement
       with PlacementBeacon
  
  @js.native
  sealed trait `left-end` extends Placement
  
  @js.native
  sealed trait `left-start` extends Placement
  
  @js.native
  sealed trait next extends js.Object
  
  @js.native
  sealed trait paused extends js.Object
  
  @js.native
  sealed trait prev extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait reset extends js.Object
  
  @js.native
  sealed trait restart extends js.Object
  
  @js.native
  sealed trait right
    extends Placement
       with PlacementBeacon
  
  @js.native
  sealed trait `right-end` extends Placement
  
  @js.native
  sealed trait `right-start` extends Placement
  
  @js.native
  sealed trait running extends js.Object
  
  @js.native
  sealed trait skip extends js.Object
  
  @js.native
  sealed trait skipped extends js.Object
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait `step:after` extends js.Object
  
  @js.native
  sealed trait `step:before` extends js.Object
  
  @js.native
  sealed trait stop extends js.Object
  
  @js.native
  sealed trait tooltip extends js.Object
  
  @js.native
  sealed trait top
    extends Placement
       with PlacementBeacon
  
  @js.native
  sealed trait `top-end` extends Placement
  
  @js.native
  sealed trait `top-start` extends Placement
  
  @js.native
  sealed trait `tour:end` extends js.Object
  
  @js.native
  sealed trait `tour:start` extends js.Object
  
  @js.native
  sealed trait `tour:status` extends js.Object
  
  @js.native
  sealed trait update extends js.Object
  
  @js.native
  sealed trait waiting extends js.Object
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def beacon: beacon = "beacon".asInstanceOf[beacon]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def `bottom-end`: `bottom-end` = "bottom-end".asInstanceOf[`bottom-end`]
  @scala.inline
  def `bottom-start`: `bottom-start` = "bottom-start".asInstanceOf[`bottom-start`]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def `error:target_not_found`: `error:target_not_found` = "error:target_not_found".asInstanceOf[`error:target_not_found`]
  @scala.inline
  def finished: finished = "finished".asInstanceOf[finished]
  @scala.inline
  def go: go = "go".asInstanceOf[go]
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  @scala.inline
  def index: index = "index".asInstanceOf[index]
  @scala.inline
  def init: init = "init".asInstanceOf[init]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `left-end`: `left-end` = "left-end".asInstanceOf[`left-end`]
  @scala.inline
  def `left-start`: `left-start` = "left-start".asInstanceOf[`left-start`]
  @scala.inline
  def next: next = "next".asInstanceOf[next]
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  @scala.inline
  def prev: prev = "prev".asInstanceOf[prev]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  @scala.inline
  def restart: restart = "restart".asInstanceOf[restart]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def `right-end`: `right-end` = "right-end".asInstanceOf[`right-end`]
  @scala.inline
  def `right-start`: `right-start` = "right-start".asInstanceOf[`right-start`]
  @scala.inline
  def running: running = "running".asInstanceOf[running]
  @scala.inline
  def skip: skip = "skip".asInstanceOf[skip]
  @scala.inline
  def skipped: skipped = "skipped".asInstanceOf[skipped]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def `step:after`: `step:after` = "step:after".asInstanceOf[`step:after`]
  @scala.inline
  def `step:before`: `step:before` = "step:before".asInstanceOf[`step:before`]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  @scala.inline
  def tooltip: tooltip = "tooltip".asInstanceOf[tooltip]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def `top-end`: `top-end` = "top-end".asInstanceOf[`top-end`]
  @scala.inline
  def `top-start`: `top-start` = "top-start".asInstanceOf[`top-start`]
  @scala.inline
  def `tour:end`: `tour:end` = "tour:end".asInstanceOf[`tour:end`]
  @scala.inline
  def `tour:start`: `tour:start` = "tour:start".asInstanceOf[`tour:start`]
  @scala.inline
  def `tour:status`: `tour:status` = "tour:status".asInstanceOf[`tour:status`]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  @scala.inline
  def waiting: waiting = "waiting".asInstanceOf[waiting]
}

