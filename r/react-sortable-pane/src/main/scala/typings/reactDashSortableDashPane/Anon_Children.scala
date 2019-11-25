package typings.reactDashSortableDashPane

import typings.reactDashMotion.reactDashMotionMod.SpringHelperConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.Array[scala.Nothing]
  var className: String
  var direction: String
  var disableEffect: Boolean
  var isSortable: Boolean
  var margin: Double
  var springConfig: SpringHelperConfig
  def onClick(): Null
  def onDragStart(): Null
  def onDragStop(): Null
  def onOrderChange(): Null
  def onResize(): Null
  def onResizeStart(): Null
  def onResizeStop(): Null
  def onTouchStart(): Null
}

object Anon_Children {
  @scala.inline
  def apply(
    children: js.Array[scala.Nothing],
    className: String,
    direction: String,
    disableEffect: Boolean,
    isSortable: Boolean,
    margin: Double,
    onClick: () => Null,
    onDragStart: () => Null,
    onDragStop: () => Null,
    onOrderChange: () => Null,
    onResize: () => Null,
    onResizeStart: () => Null,
    onResizeStop: () => Null,
    onTouchStart: () => Null,
    springConfig: SpringHelperConfig
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disableEffect = disableEffect.asInstanceOf[js.Any], isSortable = isSortable.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), onDragStart = js.Any.fromFunction0(onDragStart), onDragStop = js.Any.fromFunction0(onDragStop), onOrderChange = js.Any.fromFunction0(onOrderChange), onResize = js.Any.fromFunction0(onResize), onResizeStart = js.Any.fromFunction0(onResizeStart), onResizeStop = js.Any.fromFunction0(onResizeStop), onTouchStart = js.Any.fromFunction0(onTouchStart), springConfig = springConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Children]
  }
}

