package typings.semanticDashUiDashShape.SemanticUINs.ShapeSettingsNs

import typings.semanticDashUiDashShape.JQuery
import typings.semanticDashUiDashShape.SemanticUINs.ShapeNs.ClassNameSettings
import typings.semanticDashUiDashShape.SemanticUINs.ShapeNs.ErrorSettings
import typings.semanticDashUiDashShape.SemanticUINs.ShapeNs.SelectorSettings
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.initial
import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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
  def beforeChange(`this`: JQuery): Unit
  /**
    * Is called after visible side change
    */
  def onChange(`this`: JQuery): Unit
}

object _Impl {
  @scala.inline
  def apply(
    beforeChange: JQuery => Unit,
    className: ClassNameSettings,
    debug: Boolean,
    duration: Double,
    error: ErrorSettings,
    height: next | initial | Double,
    name: String,
    namespace: String,
    onChange: JQuery => Unit,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    verbose: Boolean,
    width: next | initial | Double
  ): _Impl = {
    val __obj = js.Dynamic.literal(beforeChange = js.Any.fromFunction1(beforeChange), className = className, debug = debug, duration = duration, error = error, height = height.asInstanceOf[js.Any], name = name, namespace = namespace, onChange = js.Any.fromFunction1(onChange), performance = performance, selector = selector, silent = silent, verbose = verbose, width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

