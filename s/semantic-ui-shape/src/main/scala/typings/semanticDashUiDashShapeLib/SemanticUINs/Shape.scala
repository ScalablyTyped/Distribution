package typings
package semanticDashUiDashShapeLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends js.Object {
  var settings: ShapeSettings = js.native
  def apply(): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Flips the shape over counter-clockwise
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip back`): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Flips the shape downward
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip down`): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Flips the shape left
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip left`): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Flips the shape over clock-wise
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip over`): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Flips the shape right
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip right`): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Flips the shape upward
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip up`): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Returns translation for next side staged below
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`get transform down`): semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.Translation = js.native
  /**
    * Returns translation for next side staged left
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`get transform left`): semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.Translation = js.native
  /**
    * Returns translation for next side staged right
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`get transform right`): semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.Translation = js.native
  /**
    * Returns translation for next side staged up
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`get transform up`): semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.Translation = js.native
  /**
    * Returns whether shape is currently animating
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`is animating`): scala.Boolean = js.native
  /**
    * Set the next side to next sibling to active element
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`set default side`): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Set the next side to a specific selector
    */
  def apply(
    behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`set next side`,
    selector: java.lang.String
  ): semanticDashUiDashShapeLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`set next side`,
    selector: semanticDashUiDashShapeLib.JQuery
  ): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Sets shape to the content size of the next side
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`set stage size`): semanticDashUiDashShapeLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.destroy): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Queues an animation until after current animation
    */
  def apply(
    behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.queue,
    animation: java.lang.String
  ): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Refreshes the selector cache for element sides
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.refresh): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Forces a reflow on element
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.repaint): semanticDashUiDashShapeLib.JQuery = js.native
  /**
    * Removes all inline styles
    */
  def apply(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.reset): semanticDashUiDashShapeLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.setting,
    value: ShapeSettings
  ): semanticDashUiDashShapeLib.JQuery = js.native
  def apply(settings: ShapeSettings): semanticDashUiDashShapeLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any
  ): semanticDashUiDashShapeLib.JQuery = js.native
}

