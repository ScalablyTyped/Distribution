package typings
package semanticDashUiDashShapeLib.SemanticUINs.ShapeSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait _Impl extends js.Object {
  var className: semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.ClassNameSettings
  /**
               * Debug output to console
               */
  var debug: scala.Boolean
  // region Shape Settings
  /**
               * Duration of side change animation
               *
               * @default 700
               */
  var duration: scala.Double
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.ErrorSettings
  /**
               * When set to next will use the height of the next side during the shape's animation.
               * When set to initial it will use the height of the shape at initialization.
               * When set to a specific pixel height, will force the height to that height.
               *
               * @default 'initial'
               * @since 2.2
               */
  var height: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.next | semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.initial | scala.Double
  // endregion
  // region Debug Settings
  /**
               * Name used in log statements
               */
  var name: java.lang.String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
               * Event namespace. Makes sure module teardown does not effect other events attached to an element.
               */
  var namespace: java.lang.String
  /**
               * Show console.table output with performance metrics
               */
  var performance: scala.Boolean
  // endregion
  // region DOM Settings
  var selector: semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.SelectorSettings
  /**
               * Silences all console output including error messages, regardless of other debug settings.
               */
  var silent: scala.Boolean
  /**
               * Debug output includes all internal behaviors
               */
  var verbose: scala.Boolean
  /**
               * When set to next will use the width of the next side during the shape's animation.
               * When set to initial it will use the width of the shape at initialization.
               * When set to a specific pixel height, will force the width to that height.
               *
               * @default 'initial'
               * @since 2.2
               */
  var width: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.next | semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.initial | scala.Double
  // endregion
  // region Callbacks
  /**
               * Is called before side change
               */
  def beforeChange(`this`: semanticDashUiDashShapeLib.JQuery): scala.Unit
  /**
               * Is called after visible side change
               */
  def onChange(`this`: semanticDashUiDashShapeLib.JQuery): scala.Unit
}

