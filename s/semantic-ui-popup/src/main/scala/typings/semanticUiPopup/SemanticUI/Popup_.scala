package typings.semanticUiPopup.SemanticUI

import typings.semanticUiPopup.JQuery
import typings.semanticUiPopup.SemanticUI.Popup.ClassNameSettings
import typings.semanticUiPopup.SemanticUI.Popup.DelaySettings
import typings.semanticUiPopup.SemanticUI.Popup.ErrorSettings
import typings.semanticUiPopup.SemanticUI.Popup.MetadataSettings
import typings.semanticUiPopup.SemanticUI.Popup.SelectorSettings
import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import typings.semanticUiPopup.semanticUiPopupStrings.`bind clickaway`
import typings.semanticUiPopup.semanticUiPopupStrings.`bind close on scroll`
import typings.semanticUiPopup.semanticUiPopupStrings.`bind touch close`
import typings.semanticUiPopup.semanticUiPopupStrings.`change content`
import typings.semanticUiPopup.semanticUiPopupStrings.`get popup`
import typings.semanticUiPopup.semanticUiPopupStrings.`hide all`
import typings.semanticUiPopup.semanticUiPopupStrings.`inline`
import typings.semanticUiPopup.semanticUiPopupStrings.`is hidden`
import typings.semanticUiPopup.semanticUiPopupStrings.`is visible`
import typings.semanticUiPopup.semanticUiPopupStrings.`remove popup`
import typings.semanticUiPopup.semanticUiPopupStrings.`set position`
import typings.semanticUiPopup.semanticUiPopupStrings.addTouchEvents
import typings.semanticUiPopup.semanticUiPopupStrings.adjacent
import typings.semanticUiPopup.semanticUiPopupStrings.auto
import typings.semanticUiPopup.semanticUiPopupStrings.boundary
import typings.semanticUiPopup.semanticUiPopupStrings.className
import typings.semanticUiPopup.semanticUiPopupStrings.click
import typings.semanticUiPopup.semanticUiPopupStrings.closable
import typings.semanticUiPopup.semanticUiPopupStrings.content
import typings.semanticUiPopup.semanticUiPopupStrings.context
import typings.semanticUiPopup.semanticUiPopupStrings.debug
import typings.semanticUiPopup.semanticUiPopupStrings.delay
import typings.semanticUiPopup.semanticUiPopupStrings.destroy
import typings.semanticUiPopup.semanticUiPopupStrings.distanceAway
import typings.semanticUiPopup.semanticUiPopupStrings.duration
import typings.semanticUiPopup.semanticUiPopupStrings.error
import typings.semanticUiPopup.semanticUiPopupStrings.exclusive
import typings.semanticUiPopup.semanticUiPopupStrings.exists
import typings.semanticUiPopup.semanticUiPopupStrings.focus
import typings.semanticUiPopup.semanticUiPopupStrings.hide
import typings.semanticUiPopup.semanticUiPopupStrings.hideOnScroll
import typings.semanticUiPopup.semanticUiPopupStrings.hover
import typings.semanticUiPopup.semanticUiPopupStrings.hoverable
import typings.semanticUiPopup.semanticUiPopupStrings.html
import typings.semanticUiPopup.semanticUiPopupStrings.jitter
import typings.semanticUiPopup.semanticUiPopupStrings.lastResort
import typings.semanticUiPopup.semanticUiPopupStrings.manual
import typings.semanticUiPopup.semanticUiPopupStrings.maxSearchDepth
import typings.semanticUiPopup.semanticUiPopupStrings.metadata
import typings.semanticUiPopup.semanticUiPopupStrings.movePopup
import typings.semanticUiPopup.semanticUiPopupStrings.name
import typings.semanticUiPopup.semanticUiPopupStrings.namespace
import typings.semanticUiPopup.semanticUiPopupStrings.observeChanges
import typings.semanticUiPopup.semanticUiPopupStrings.offset
import typings.semanticUiPopup.semanticUiPopupStrings.on
import typings.semanticUiPopup.semanticUiPopupStrings.onCreate
import typings.semanticUiPopup.semanticUiPopupStrings.onHidden
import typings.semanticUiPopup.semanticUiPopupStrings.onHide
import typings.semanticUiPopup.semanticUiPopupStrings.onRemove
import typings.semanticUiPopup.semanticUiPopupStrings.onShow
import typings.semanticUiPopup.semanticUiPopupStrings.onUnplaceable
import typings.semanticUiPopup.semanticUiPopupStrings.onVisible
import typings.semanticUiPopup.semanticUiPopupStrings.opposite
import typings.semanticUiPopup.semanticUiPopupStrings.performance
import typings.semanticUiPopup.semanticUiPopupStrings.popup
import typings.semanticUiPopup.semanticUiPopupStrings.position
import typings.semanticUiPopup.semanticUiPopupStrings.prefer
import typings.semanticUiPopup.semanticUiPopupStrings.preserve
import typings.semanticUiPopup.semanticUiPopupStrings.reposition
import typings.semanticUiPopup.semanticUiPopupStrings.scrollContext
import typings.semanticUiPopup.semanticUiPopupStrings.selector
import typings.semanticUiPopup.semanticUiPopupStrings.setFluidWidth
import typings.semanticUiPopup.semanticUiPopupStrings.setting
import typings.semanticUiPopup.semanticUiPopupStrings.show
import typings.semanticUiPopup.semanticUiPopupStrings.silent
import typings.semanticUiPopup.semanticUiPopupStrings.target
import typings.semanticUiPopup.semanticUiPopupStrings.title
import typings.semanticUiPopup.semanticUiPopupStrings.toggle
import typings.semanticUiPopup.semanticUiPopupStrings.transition
import typings.semanticUiPopup.semanticUiPopupStrings.variation
import typings.semanticUiPopup.semanticUiPopupStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popup_ extends js.Object {
  
  def apply(): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind clickaway`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind close on scroll`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `bind touch close`): JQuery = js.native
  /**
    * Changes current popup content
    */
  def apply(behavior: `change content`, html: String): JQuery = js.native
  /**
    * Returns current popup dom element
    */
  def apply(behavior: `get popup`): JQuery = js.native
  /**
    * Hides all visible pop ups on the page
    */
  def apply(behavior: `hide all`): JQuery = js.native
  /**
    * Returns whether popup is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether popup is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Removes popup from the page
    */
  def apply(behavior: `remove popup`): JQuery = js.native
  /**
    * Repositions a popup
    */
  def apply(behavior: `set position`, position: String): JQuery = js.native
  /**
    * Removes popup from the page and removes all events
    */
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Returns whether popup is created and inserted into the page
    */
  def apply(behavior: exists): Boolean = js.native
  /**
    * Hides popup
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Adjusts popup when content size changes (only necessary for centered popups)
    */
  def apply(behavior: reposition): JQuery = js.native
  def apply(behavior: setting, name: `inline`, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: `inline`, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: addTouchEvents, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: addTouchEvents, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: boundary, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def apply(behavior: setting, name: boundary, value: String): JQuery = js.native
  def apply(behavior: setting, name: boundary, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: closable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: content, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: content, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: delay, value: DelaySettings): JQuery = js.native
  def apply(behavior: setting, name: distanceAway, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: distanceAway, value: Double): JQuery = js.native
  def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: exclusive, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: hideOnScroll, value: js.UndefOr[scala.Nothing]): auto | `false` = js.native
  def apply(behavior: setting, name: hideOnScroll, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: hideOnScroll, value: auto): JQuery = js.native
  def apply(behavior: setting, name: hoverable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: hoverable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: html, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def apply(behavior: setting, name: html, value: String): JQuery = js.native
  def apply(behavior: setting, name: html, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: jitter, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: jitter, value: Double): JQuery = js.native
  def apply(behavior: setting, name: lastResort, value: js.UndefOr[scala.Nothing]): Boolean | String = js.native
  def apply(behavior: setting, name: lastResort, value: String): JQuery = js.native
  def apply(behavior: setting, name: lastResort, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: maxSearchDepth, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: maxSearchDepth, value: Double): JQuery = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: movePopup, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: movePopup, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: offset, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
  def apply(behavior: setting, name: onCreate, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onCreate,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onHidden, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onHidden,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onHide,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onRemove, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onRemove,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onShow,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onUnplaceable, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onUnplaceable,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onVisible,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): focus | click | hover | manual = js.native
  def apply(behavior: setting, name: on, value: click): JQuery = js.native
  def apply(behavior: setting, name: on, value: focus): JQuery = js.native
  def apply(behavior: setting, name: on, value: hover): JQuery = js.native
  def apply(behavior: setting, name: on, value: manual): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: popup, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
  def apply(behavior: setting, name: popup, value: String): JQuery = js.native
  def apply(behavior: setting, name: popup, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: popup, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: position, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: position, value: String): JQuery = js.native
  def apply(behavior: setting, name: prefer, value: js.UndefOr[scala.Nothing]): adjacent | opposite = js.native
  def apply(behavior: setting, name: prefer, value: adjacent): JQuery = js.native
  def apply(behavior: setting, name: prefer, value: opposite): JQuery = js.native
  def apply(behavior: setting, name: preserve, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: preserve, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: scrollContext, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def apply(behavior: setting, name: scrollContext, value: String): JQuery = js.native
  def apply(behavior: setting, name: scrollContext, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: setFluidWidth, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: setFluidWidth, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: target, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
  def apply(behavior: setting, name: target, value: String): JQuery = js.native
  def apply(behavior: setting, name: target, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: target, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: title, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: title, value: String): JQuery = js.native
  def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: variation, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: variation, value: String): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: PopupSettings): JQuery = js.native
  /**
    * Shows popup
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of popup
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: PopupSettings): JQuery = js.native
  
  var settings: PopupSettings = js.native
}
