package typings.semanticUiShape

import typings.semanticUiShape.SemanticUI.Shape
import typings.semanticUiShape.SemanticUI.Shape.Translation
import typings.semanticUiShape.SemanticUI.ShapeSettings
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
import typings.semanticUiShape.semanticUiShapeStrings.destroy
import typings.semanticUiShape.semanticUiShapeStrings.queue
import typings.semanticUiShape.semanticUiShapeStrings.refresh
import typings.semanticUiShape.semanticUiShapeStrings.repaint
import typings.semanticUiShape.semanticUiShapeStrings.reset
import typings.semanticUiShape.semanticUiShapeStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def shape(): JQuery
  def shape(settings: ShapeSettings): JQuery
  @JSName("shape")
  var shape_Original: Shape
  @JSName("shape")
  def shape_destroy(behavior: destroy): JQuery
  /**
    * Flips the shape over counter-clockwise
    */
  @JSName("shape")
  def shape_flipback(behavior: `flip back`): JQuery
  /**
    * Flips the shape downward
    */
  @JSName("shape")
  def shape_flipdown(behavior: `flip down`): JQuery
  /**
    * Flips the shape left
    */
  @JSName("shape")
  def shape_flipleft(behavior: `flip left`): JQuery
  /**
    * Flips the shape over clock-wise
    */
  @JSName("shape")
  def shape_flipover(behavior: `flip over`): JQuery
  /**
    * Flips the shape right
    */
  @JSName("shape")
  def shape_flipright(behavior: `flip right`): JQuery
  /**
    * Flips the shape upward
    */
  @JSName("shape")
  def shape_flipup(behavior: `flip up`): JQuery
  /**
    * Returns translation for next side staged below
    */
  @JSName("shape")
  def shape_gettransformdown(behavior: `get transform down`): Translation
  /**
    * Returns translation for next side staged left
    */
  @JSName("shape")
  def shape_gettransformleft(behavior: `get transform left`): Translation
  /**
    * Returns translation for next side staged right
    */
  @JSName("shape")
  def shape_gettransformright(behavior: `get transform right`): Translation
  /**
    * Returns translation for next side staged up
    */
  @JSName("shape")
  def shape_gettransformup(behavior: `get transform up`): Translation
  /**
    * Returns whether shape is currently animating
    */
  @JSName("shape")
  def shape_isanimating(behavior: `is animating`): Boolean
  /**
    * Queues an animation until after current animation
    */
  @JSName("shape")
  def shape_queue(behavior: queue, animation: String): JQuery
  /**
    * Refreshes the selector cache for element sides
    */
  @JSName("shape")
  def shape_refresh(behavior: refresh): JQuery
  /**
    * Forces a reflow on element
    */
  @JSName("shape")
  def shape_repaint(behavior: repaint): JQuery
  /**
    * Removes all inline styles
    */
  @JSName("shape")
  def shape_reset(behavior: reset): JQuery
  /**
    * Set the next side to next sibling to active element
    */
  @JSName("shape")
  def shape_setdefaultside(behavior: `set default side`): JQuery
  /**
    * Set the next side to a specific selector
    */
  @JSName("shape")
  def shape_setnextside(behavior: `set next side`, selector: String): JQuery
  @JSName("shape")
  def shape_setnextside(behavior: `set next side`, selector: JQuery): JQuery
  /**
    * Sets shape to the content size of the next side
    */
  @JSName("shape")
  def shape_setstagesize(behavior: `set stage size`): JQuery
  @JSName("shape")
  def shape_setting(behavior: setting, value: ShapeSettings): JQuery
  @JSName("shape")
  def shape_setting[K /* <: /* keyof semantic-ui-shape.SemanticUI.ShapeSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("shape")
  def shape_setting[K /* <: /* keyof semantic-ui-shape.SemanticUI.ShapeSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any
}
object JQuery {
  
  inline def apply(shape: Shape): JQuery = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
