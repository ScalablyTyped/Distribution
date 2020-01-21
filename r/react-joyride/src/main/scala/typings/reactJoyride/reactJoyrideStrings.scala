package typings.reactJoyride

import typings.reactJoyride.mod.Placement
import typings.reactJoyride.mod.PlacementBeacon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactJoyrideStrings {
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
  sealed trait errorColontarget_not_found extends js.Object
  
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
  sealed trait stepColonafter extends js.Object
  
  @js.native
  sealed trait stepColonbefore extends js.Object
  
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
  sealed trait tourColonend extends js.Object
  
  @js.native
  sealed trait tourColonstart extends js.Object
  
  @js.native
  sealed trait tourColonstatus extends js.Object
  
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
  def errorColontarget_not_found: errorColontarget_not_found = "error:target_not_found".asInstanceOf[errorColontarget_not_found]
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
  def stepColonafter: stepColonafter = "step:after".asInstanceOf[stepColonafter]
  @scala.inline
  def stepColonbefore: stepColonbefore = "step:before".asInstanceOf[stepColonbefore]
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
  def tourColonend: tourColonend = "tour:end".asInstanceOf[tourColonend]
  @scala.inline
  def tourColonstart: tourColonstart = "tour:start".asInstanceOf[tourColonstart]
  @scala.inline
  def tourColonstatus: tourColonstatus = "tour:status".asInstanceOf[tourColonstatus]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  @scala.inline
  def waiting: waiting = "waiting".asInstanceOf[waiting]
}

