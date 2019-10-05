package typings.semanticDashUiDashShape.SemanticUI

import typings.semanticDashUiDashShape.JQuery
import typings.semanticDashUiDashShape.SemanticUI.Shape.Translation
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip back`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip down`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip left`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip over`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip right`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`flip up`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`get transform down`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`get transform left`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`get transform right`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`get transform up`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`is animating`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`set default side`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`set next side`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.`set stage size`
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.destroy
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.queue
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.refresh
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.repaint
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.reset
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Shape")
@js.native
trait Shape_ extends js.Object {
  var settings: ShapeSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Flips the shape over counter-clockwise
    */
  def apply(behavior: `flip back`): JQuery = js.native
  /**
    * Flips the shape downward
    */
  def apply(behavior: `flip down`): JQuery = js.native
  /**
    * Flips the shape left
    */
  def apply(behavior: `flip left`): JQuery = js.native
  /**
    * Flips the shape over clock-wise
    */
  def apply(behavior: `flip over`): JQuery = js.native
  /**
    * Flips the shape right
    */
  def apply(behavior: `flip right`): JQuery = js.native
  /**
    * Flips the shape upward
    */
  def apply(behavior: `flip up`): JQuery = js.native
  /**
    * Returns translation for next side staged below
    */
  def apply(behavior: `get transform down`): Translation = js.native
  /**
    * Returns translation for next side staged left
    */
  def apply(behavior: `get transform left`): Translation = js.native
  /**
    * Returns translation for next side staged right
    */
  def apply(behavior: `get transform right`): Translation = js.native
  /**
    * Returns translation for next side staged up
    */
  def apply(behavior: `get transform up`): Translation = js.native
  /**
    * Returns whether shape is currently animating
    */
  def apply(behavior: `is animating`): Boolean = js.native
  /**
    * Set the next side to next sibling to active element
    */
  def apply(behavior: `set default side`): JQuery = js.native
  /**
    * Set the next side to a specific selector
    */
  def apply(behavior: `set next side`, selector: String): JQuery = js.native
  def apply(behavior: `set next side`, selector: JQuery): JQuery = js.native
  /**
    * Sets shape to the content size of the next side
    */
  def apply(behavior: `set stage size`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Queues an animation until after current animation
    */
  def apply(behavior: queue, animation: String): JQuery = js.native
  /**
    * Refreshes the selector cache for element sides
    */
  def apply(behavior: refresh): JQuery = js.native
  /**
    * Forces a reflow on element
    */
  def apply(behavior: repaint): JQuery = js.native
  /**
    * Removes all inline styles
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, value: ShapeSettings): JQuery = js.native
  def apply(settings: ShapeSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

