package typings.reactDom

import typings.react.mod.Component
import typings.reactDom.testUtilsMod.EventSimulator
import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSimulate extends js.Object {
  val abort: EventSimulator
  val animationEnd: EventSimulator
  val animationIteration: EventSimulator
  val animationStart: EventSimulator
  val blur: EventSimulator
  val canPlay: EventSimulator
  val canPlayThrough: EventSimulator
  val change: EventSimulator
  val click: EventSimulator
  val compositionEnd: EventSimulator
  val compositionStart: EventSimulator
  val compositionUpdate: EventSimulator
  val contextMenu: EventSimulator
  val copy: EventSimulator
  val cut: EventSimulator
  val doubleClick: EventSimulator
  val drag: EventSimulator
  val dragEnd: EventSimulator
  val dragEnter: EventSimulator
  val dragExit: EventSimulator
  val dragLeave: EventSimulator
  val dragOver: EventSimulator
  val dragStart: EventSimulator
  val drop: EventSimulator
  val durationChange: EventSimulator
  val emptied: EventSimulator
  val encrypted: EventSimulator
  val ended: EventSimulator
  val error: EventSimulator
  val focus: EventSimulator
  val input: EventSimulator
  val invalid: EventSimulator
  val keyDown: EventSimulator
  val keyPress: EventSimulator
  val keyUp: EventSimulator
  val load: EventSimulator
  val loadStart: EventSimulator
  val loadedData: EventSimulator
  val loadedMetadata: EventSimulator
  val mouseDown: EventSimulator
  val mouseEnter: EventSimulator
  val mouseLeave: EventSimulator
  val mouseMove: EventSimulator
  val mouseOut: EventSimulator
  val mouseOver: EventSimulator
  val mouseUp: EventSimulator
  val paste: EventSimulator
  val pause: EventSimulator
  val play: EventSimulator
  val playing: EventSimulator
  val progress: EventSimulator
  val rateChange: EventSimulator
  val scroll: EventSimulator
  val seeked: EventSimulator
  val seeking: EventSimulator
  val select: EventSimulator
  val stalled: EventSimulator
  val submit: EventSimulator
  val suspend: EventSimulator
  val timeUpdate: EventSimulator
  val touchCancel: EventSimulator
  val touchEnd: EventSimulator
  val touchMove: EventSimulator
  val touchStart: EventSimulator
  val transitionEnd: EventSimulator
  val volumeChange: EventSimulator
  val waiting: EventSimulator
  val wheel: EventSimulator
}

object TypeofSimulate {
  @scala.inline
  def apply(
    abort: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    animationEnd: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    animationIteration: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    animationStart: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    blur: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    canPlay: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    canPlayThrough: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    change: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    click: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    compositionEnd: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    compositionStart: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    compositionUpdate: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    contextMenu: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    copy: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    cut: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    doubleClick: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    drag: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragEnd: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragEnter: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragExit: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragLeave: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragOver: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    dragStart: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    drop: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    durationChange: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    emptied: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    encrypted: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    ended: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    error: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    focus: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    input: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    invalid: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    keyDown: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    keyPress: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    keyUp: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    load: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    loadStart: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    loadedData: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    loadedMetadata: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseDown: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseEnter: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseLeave: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseMove: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseOut: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseOver: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    mouseUp: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    paste: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    pause: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    play: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    playing: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    progress: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    rateChange: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    scroll: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    seeked: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    seeking: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    select: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    stalled: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    submit: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    suspend: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    timeUpdate: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    touchCancel: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    touchEnd: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    touchMove: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    touchStart: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    transitionEnd: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    volumeChange: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    waiting: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
    wheel: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
  ): TypeofSimulate = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionEnd = js.Any.fromFunction2(transitionEnd), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
  
    __obj.asInstanceOf[TypeofSimulate]
  }
}

