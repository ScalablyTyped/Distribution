package typings.semanticUiShape.SemanticUI.ShapeSettings

import typings.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typings.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typings.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typings.semanticUiShape.semanticUiShapeStrings.initial
import typings.semanticUiShape.semanticUiShapeStrings.next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  var className: ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: Boolean
  // region Shape Settings
  /**
    * Duration of side change animation
    *
    * @default 700
    */
  var duration: Double
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * When set to next will use the height of the next side during the shape's animation.
    * When set to initial it will use the height of the shape at initialization.
    * When set to a specific pixel height, will force the height to that height.
    *
    * @default 'initial'
    * @since 2.2
    */
  var height: next | initial | Double
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  // endregion
  // region DOM Settings
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * When set to next will use the width of the next side during the shape's animation.
    * When set to initial it will use the width of the shape at initialization.
    * When set to a specific pixel height, will force the width to that height.
    *
    * @default 'initial'
    * @since 2.2
    */
  var width: next | initial | Double
  // endregion
  // region Callbacks
  /**
    * Is called before side change
    */
  def beforeChange(): Unit
  /**
    * Is called after visible side change
    */
  def onChange(): Unit
}

object Impl {
  @scala.inline
  def apply(
    beforeChange: () => Unit,
    className: ClassNameSettings,
    debug: Boolean,
    duration: Double,
    error: ErrorSettings,
    height: next | initial | Double,
    name: String,
    namespace: String,
    onChange: () => Unit,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    verbose: Boolean,
    width: next | initial | Double
  ): Impl = {
    val __obj = js.Dynamic.literal(beforeChange = js.Any.fromFunction0(beforeChange), className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

