package typings.semanticUiPopup

import typings.semanticUiPopup.SemanticUI.Popup
import typings.semanticUiPopup.SemanticUI.Popup.ClassNameSettings
import typings.semanticUiPopup.SemanticUI.Popup.DelaySettings
import typings.semanticUiPopup.SemanticUI.Popup.ErrorSettings
import typings.semanticUiPopup.SemanticUI.Popup.MetadataSettings
import typings.semanticUiPopup.SemanticUI.Popup.SelectorSettings
import typings.semanticUiPopup.SemanticUI.PopupSettings
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def popup(): JQuery
  def popup(behavior: setting, name: `inline`, value: Boolean): JQuery
  def popup(behavior: setting, name: `inline`, value: Unit): Boolean
  def popup(behavior: setting, name: addTouchEvents, value: Boolean): JQuery
  def popup(behavior: setting, name: addTouchEvents, value: Unit): Boolean
  def popup(behavior: setting, name: boundary, value: String): JQuery
  def popup(behavior: setting, name: boundary, value: Unit): String | JQuery
  def popup(behavior: setting, name: boundary, value: JQuery): JQuery
  def popup(behavior: setting, name: className, value: Unit): ClassNameSettings
  def popup(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def popup(behavior: setting, name: closable, value: Boolean): JQuery
  def popup(behavior: setting, name: closable, value: Unit): Boolean
  def popup(behavior: setting, name: content, value: String): JQuery
  def popup(behavior: setting, name: content, value: Unit): String
  def popup(behavior: setting, name: context, value: String): JQuery
  def popup(behavior: setting, name: context, value: Unit): String | JQuery
  def popup(behavior: setting, name: context, value: JQuery): JQuery
  def popup(behavior: setting, name: debug, value: Boolean): JQuery
  def popup(behavior: setting, name: debug, value: Unit): Boolean
  def popup(behavior: setting, name: delay, value: Unit): DelaySettings
  def popup(behavior: setting, name: delay, value: DelaySettings): JQuery
  def popup(behavior: setting, name: distanceAway, value: Double): JQuery
  def popup(behavior: setting, name: distanceAway, value: Unit): Double
  def popup(behavior: setting, name: duration, value: Double): JQuery
  def popup(behavior: setting, name: duration, value: Unit): Double
  def popup(behavior: setting, name: error, value: Unit): ErrorSettings
  def popup(behavior: setting, name: error, value: ErrorSettings): JQuery
  def popup(behavior: setting, name: exclusive, value: Boolean): JQuery
  def popup(behavior: setting, name: exclusive, value: Unit): Boolean
  def popup(behavior: setting, name: hideOnScroll, value: Unit): auto | `false`
  def popup(behavior: setting, name: hideOnScroll, value: `false`): JQuery
  def popup(behavior: setting, name: hideOnScroll, value: auto): JQuery
  def popup(behavior: setting, name: hoverable, value: Boolean): JQuery
  def popup(behavior: setting, name: hoverable, value: Unit): Boolean
  def popup(behavior: setting, name: html, value: String): JQuery
  def popup(behavior: setting, name: html, value: Unit): String | JQuery
  def popup(behavior: setting, name: html, value: JQuery): JQuery
  def popup(behavior: setting, name: jitter, value: Double): JQuery
  def popup(behavior: setting, name: jitter, value: Unit): Double
  def popup(behavior: setting, name: lastResort, value: String): JQuery
  def popup(behavior: setting, name: lastResort, value: Boolean): JQuery
  def popup(behavior: setting, name: lastResort, value: Unit): Boolean | String
  def popup(behavior: setting, name: maxSearchDepth, value: Double): JQuery
  def popup(behavior: setting, name: maxSearchDepth, value: Unit): Double
  def popup(behavior: setting, name: metadata, value: Unit): MetadataSettings
  def popup(behavior: setting, name: metadata, value: MetadataSettings): JQuery
  def popup(behavior: setting, name: movePopup, value: Boolean): JQuery
  def popup(behavior: setting, name: movePopup, value: Unit): Boolean
  def popup(behavior: setting, name: namespace, value: String): JQuery
  def popup(behavior: setting, name: namespace, value: Unit): String
  def popup(behavior: setting, name: name, value: String): JQuery
  def popup(behavior: setting, name: name, value: Unit): String
  def popup(behavior: setting, name: observeChanges, value: Boolean): JQuery
  def popup(behavior: setting, name: observeChanges, value: Unit): Boolean
  def popup(behavior: setting, name: offset, value: Double): JQuery
  def popup(behavior: setting, name: offset, value: Unit): Double
  def popup(
    behavior: setting,
    name: onCreate,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery
  def popup(behavior: setting, name: onCreate, value: Unit): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  def popup(
    behavior: setting,
    name: onHidden,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery
  def popup(behavior: setting, name: onHidden, value: Unit): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  def popup(
    behavior: setting,
    name: onHide,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  ): JQuery
  def popup(behavior: setting, name: onHide, value: Unit): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  def popup(
    behavior: setting,
    name: onRemove,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery
  def popup(behavior: setting, name: onRemove, value: Unit): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  def popup(
    behavior: setting,
    name: onShow,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  ): JQuery
  def popup(behavior: setting, name: onShow, value: Unit): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  def popup(
    behavior: setting,
    name: onUnplaceable,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery
  def popup(behavior: setting, name: onUnplaceable, value: Unit): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  def popup(
    behavior: setting,
    name: onVisible,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery
  def popup(behavior: setting, name: onVisible, value: Unit): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  def popup(behavior: setting, name: on, value: Unit): focus | click | hover | manual
  def popup(behavior: setting, name: on, value: click): JQuery
  def popup(behavior: setting, name: on, value: focus): JQuery
  def popup(behavior: setting, name: on, value: hover): JQuery
  def popup(behavior: setting, name: on, value: manual): JQuery
  def popup(behavior: setting, name: performance, value: Boolean): JQuery
  def popup(behavior: setting, name: performance, value: Unit): Boolean
  def popup(behavior: setting, name: typings.semanticUiPopup.semanticUiPopupStrings.popup, value: String): JQuery
  def popup(behavior: setting, name: typings.semanticUiPopup.semanticUiPopupStrings.popup, value: Unit): `false` | String | JQuery
  def popup(behavior: setting, name: typings.semanticUiPopup.semanticUiPopupStrings.popup, value: JQuery): JQuery
  def popup(behavior: setting, name: typings.semanticUiPopup.semanticUiPopupStrings.popup, value: `false`): JQuery
  def popup(behavior: setting, name: position, value: String): JQuery
  def popup(behavior: setting, name: position, value: Unit): String
  def popup(behavior: setting, name: prefer, value: Unit): adjacent | opposite
  def popup(behavior: setting, name: prefer, value: adjacent): JQuery
  def popup(behavior: setting, name: prefer, value: opposite): JQuery
  def popup(behavior: setting, name: preserve, value: Boolean): JQuery
  def popup(behavior: setting, name: preserve, value: Unit): Boolean
  def popup(behavior: setting, name: scrollContext, value: String): JQuery
  def popup(behavior: setting, name: scrollContext, value: Unit): String | JQuery
  def popup(behavior: setting, name: scrollContext, value: JQuery): JQuery
  def popup(behavior: setting, name: selector, value: Unit): SelectorSettings
  def popup(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def popup(behavior: setting, name: setFluidWidth, value: Boolean): JQuery
  def popup(behavior: setting, name: setFluidWidth, value: Unit): Boolean
  def popup(behavior: setting, name: silent, value: Boolean): JQuery
  def popup(behavior: setting, name: silent, value: Unit): Boolean
  def popup(behavior: setting, name: target, value: String): JQuery
  def popup(behavior: setting, name: target, value: Unit): `false` | String | JQuery
  def popup(behavior: setting, name: target, value: JQuery): JQuery
  def popup(behavior: setting, name: target, value: `false`): JQuery
  def popup(behavior: setting, name: title, value: String): JQuery
  def popup(behavior: setting, name: title, value: Unit): String
  def popup(behavior: setting, name: transition, value: String): JQuery
  def popup(behavior: setting, name: transition, value: Unit): String
  def popup(behavior: setting, name: variation, value: String): JQuery
  def popup(behavior: setting, name: variation, value: Unit): String
  def popup(behavior: setting, name: verbose, value: Boolean): JQuery
  def popup(behavior: setting, name: verbose, value: Unit): Boolean
  def popup(settings: PopupSettings): JQuery
  @JSName("popup")
  var popup_Original: Popup
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindclickaway(behavior: `bind clickaway`): JQuery
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindcloseonscroll(behavior: `bind close on scroll`): JQuery
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindtouchclose(behavior: `bind touch close`): JQuery
  /**
    * Changes current popup content
    */
  @JSName("popup")
  def popup_changecontent(behavior: `change content`, html: String): JQuery
  /**
    * Removes popup from the page and removes all events
    */
  @JSName("popup")
  def popup_destroy(behavior: destroy): JQuery
  /**
    * Returns whether popup is created and inserted into the page
    */
  @JSName("popup")
  def popup_exists(behavior: exists): Boolean
  /**
    * Returns current popup dom element
    */
  @JSName("popup")
  def popup_getpopup(behavior: `get popup`): JQuery
  /**
    * Hides popup
    */
  @JSName("popup")
  def popup_hide(behavior: hide): JQuery
  /**
    * Hides all visible pop ups on the page
    */
  @JSName("popup")
  def popup_hideall(behavior: `hide all`): JQuery
  /**
    * Returns whether popup is hidden
    */
  @JSName("popup")
  def popup_ishidden(behavior: `is hidden`): Boolean
  /**
    * Returns whether popup is visible
    */
  @JSName("popup")
  def popup_isvisible(behavior: `is visible`): Boolean
  /**
    * Removes popup from the page
    */
  @JSName("popup")
  def popup_removepopup(behavior: `remove popup`): JQuery
  /**
    * Adjusts popup when content size changes (only necessary for centered popups)
    */
  @JSName("popup")
  def popup_reposition(behavior: reposition): JQuery
  /**
    * Repositions a popup
    */
  @JSName("popup")
  def popup_setposition(behavior: `set position`, position: String): JQuery
  @JSName("popup")
  def popup_setting(behavior: setting, value: PopupSettings): JQuery
  /**
    * Shows popup
    */
  @JSName("popup")
  def popup_show(behavior: show): JQuery
  /**
    * Toggles visibility of popup
    */
  @JSName("popup")
  def popup_toggle(behavior: toggle): JQuery
}
object JQuery {
  
  inline def apply(popup: Popup): JQuery = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setPopup(value: Popup): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
  }
}
