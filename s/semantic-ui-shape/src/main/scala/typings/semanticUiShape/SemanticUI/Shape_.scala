package typings.semanticUiShape.SemanticUI

import typings.semanticUiShape.JQuery
import typings.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typings.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typings.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typings.semanticUiShape.SemanticUI.Shape.Translation
import typings.semanticUiShape.semanticUiShapeStrings.`flip back`
import typings.semanticUiShape.semanticUiShapeStrings.`flip down`
import typings.semanticUiShape.semanticUiShapeStrings.`flip left`
import typings.semanticUiShape.semanticUiShapeStrings.`flip over`
import typings.semanticUiShape.semanticUiShapeStrings.`flip right`
import typings.semanticUiShape.semanticUiShapeStrings.`flip up`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform down`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform left`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform right`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform up`
import typings.semanticUiShape.semanticUiShapeStrings.`is animating`
import typings.semanticUiShape.semanticUiShapeStrings.`set default side`
import typings.semanticUiShape.semanticUiShapeStrings.`set next side`
import typings.semanticUiShape.semanticUiShapeStrings.`set stage size`
import typings.semanticUiShape.semanticUiShapeStrings.beforeChange
import typings.semanticUiShape.semanticUiShapeStrings.className
import typings.semanticUiShape.semanticUiShapeStrings.debug
import typings.semanticUiShape.semanticUiShapeStrings.destroy
import typings.semanticUiShape.semanticUiShapeStrings.duration
import typings.semanticUiShape.semanticUiShapeStrings.error
import typings.semanticUiShape.semanticUiShapeStrings.height
import typings.semanticUiShape.semanticUiShapeStrings.initial
import typings.semanticUiShape.semanticUiShapeStrings.name
import typings.semanticUiShape.semanticUiShapeStrings.namespace
import typings.semanticUiShape.semanticUiShapeStrings.next
import typings.semanticUiShape.semanticUiShapeStrings.onChange
import typings.semanticUiShape.semanticUiShapeStrings.performance
import typings.semanticUiShape.semanticUiShapeStrings.queue
import typings.semanticUiShape.semanticUiShapeStrings.refresh
import typings.semanticUiShape.semanticUiShapeStrings.repaint
import typings.semanticUiShape.semanticUiShapeStrings.reset
import typings.semanticUiShape.semanticUiShapeStrings.selector
import typings.semanticUiShape.semanticUiShapeStrings.setting
import typings.semanticUiShape.semanticUiShapeStrings.silent
import typings.semanticUiShape.semanticUiShapeStrings.verbose
import typings.semanticUiShape.semanticUiShapeStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shape_ extends js.Object {
  
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
  def apply(behavior: setting, name: beforeChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: beforeChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: height, value: js.UndefOr[scala.Nothing]): next | initial | Double = js.native
  def apply(behavior: setting, name: height, value: Double): JQuery = js.native
  def apply(behavior: setting, name: height, value: initial): JQuery = js.native
  def apply(behavior: setting, name: height, value: next): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: width, value: js.UndefOr[scala.Nothing]): next | initial | Double = js.native
  def apply(behavior: setting, name: width, value: Double): JQuery = js.native
  def apply(behavior: setting, name: width, value: initial): JQuery = js.native
  def apply(behavior: setting, name: width, value: next): JQuery = js.native
  def apply(behavior: setting, value: ShapeSettings): JQuery = js.native
  def apply(settings: ShapeSettings): JQuery = js.native
  
  var settings: ShapeSettings = js.native
}
