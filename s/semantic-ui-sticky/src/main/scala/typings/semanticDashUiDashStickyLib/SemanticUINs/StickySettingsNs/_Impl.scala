package typings
package semanticDashUiDashStickyLib.SemanticUINs.StickySettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait _Impl extends js.Object {
  /**
               * Offset in pixels from the bottom of the screen when fixing element to viewport
               *
               * @default 0
               */
  var bottomOffset: scala.Double
  // endregion
  // region DOM Settings
  /**
               * Class names used to attach style to state
               */
  var className: semanticDashUiDashStickyLib.SemanticUINs.StickyNs.ClassNameSettings
  /**
               * Context which sticky element should stick to
               *
               * @default false
               */
  var context: semanticDashUiDashStickyLib.semanticDashUiDashStickyLibNumbers.`false` | java.lang.String | semanticDashUiDashStickyLib.JQuery
  /**
               * Debug output to console
               */
  var debug: scala.Boolean
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashStickyLib.SemanticUINs.StickyNs.ErrorSettings
  /**
               * Sticky container height will only be set if the difference between heights of container and context is larger than this jitter value.
               *
               * @default 5
               */
  var jitter: scala.Double
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
               * Whether any change in context DOM should automatically refresh cached sticky positions
               *
               * @default false
               */
  var observeChanges: scala.Boolean
  /**
               * Offset in pixels from the top of the screen when fixing element to viewport
               *
               * @default 0
               */
  var offset: scala.Double
  /**
               * Show console.table output with performance metrics
               */
  var performance: scala.Boolean
  // region Sticky Settings
  /**
               * Whether element should be "pushed" by the viewport, attaching to the bottom of the screen when scrolling up
               *
               * @default false
               */
  var pushing: scala.Boolean
  /**
               * Context which sticky should attach onscroll events.
               *
               * @default 'window'
               */
  var scrollContext: java.lang.String | semanticDashUiDashStickyLib.JQuery
  /**
               * Sets size of fixed content to match its width before fixing to screen dynamically.
               * This is used because fixed may display block or 100% width content differently than it appears before sticking.
               *
               * @default true
               * @since 2.2.11
               */
  var setSize: scala.Boolean
  /**
               * Silences all console output including error messages, regardless of other debug settings.
               */
  var silent: scala.Boolean
  /**
               * Debug output includes all internal behaviors
               */
  var verbose: scala.Boolean
  /**
               * Callback when element is bound to bottom of parent container
               */
  def onBottom(`this`: semanticDashUiDashStickyLib.JQuery): scala.Unit
  // endregion
  // region Callbacks
  /**
               * Callback when element is repositioned from layout change
               */
  def onReposition(`this`: semanticDashUiDashStickyLib.JQuery): scala.Unit
  /**
               * Callback when requestAnimationFrame fires from scroll handler.
               */
  def onScroll(`this`: semanticDashUiDashStickyLib.JQuery): scala.Unit
  /**
               * Callback when element is fixed to page
               */
  def onStick(`this`: semanticDashUiDashStickyLib.JQuery): scala.Unit
  /**
               * Callback when element is bound to top of parent container
               */
  def onTop(`this`: semanticDashUiDashStickyLib.JQuery): scala.Unit
  /**
               * Callback when element is unfixed from page
               */
  def onUnstick(`this`: semanticDashUiDashStickyLib.JQuery): scala.Unit
}

