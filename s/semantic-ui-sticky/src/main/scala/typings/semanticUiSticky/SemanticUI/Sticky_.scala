package typings.semanticUiSticky.SemanticUI

import typings.semanticUiSticky.JQuery
import typings.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import typings.semanticUiSticky.SemanticUI.Sticky.ErrorSettings
import typings.semanticUiSticky.semanticUiStickyBooleans.`false`
import typings.semanticUiSticky.semanticUiStickyStrings.bottomOffset
import typings.semanticUiSticky.semanticUiStickyStrings.className
import typings.semanticUiSticky.semanticUiStickyStrings.context
import typings.semanticUiSticky.semanticUiStickyStrings.debug
import typings.semanticUiSticky.semanticUiStickyStrings.destroy
import typings.semanticUiSticky.semanticUiStickyStrings.error
import typings.semanticUiSticky.semanticUiStickyStrings.jitter
import typings.semanticUiSticky.semanticUiStickyStrings.name
import typings.semanticUiSticky.semanticUiStickyStrings.namespace
import typings.semanticUiSticky.semanticUiStickyStrings.observeChanges
import typings.semanticUiSticky.semanticUiStickyStrings.offset
import typings.semanticUiSticky.semanticUiStickyStrings.onBottom
import typings.semanticUiSticky.semanticUiStickyStrings.onReposition
import typings.semanticUiSticky.semanticUiStickyStrings.onScroll
import typings.semanticUiSticky.semanticUiStickyStrings.onStick
import typings.semanticUiSticky.semanticUiStickyStrings.onTop
import typings.semanticUiSticky.semanticUiStickyStrings.onUnstick
import typings.semanticUiSticky.semanticUiStickyStrings.performance
import typings.semanticUiSticky.semanticUiStickyStrings.pushing
import typings.semanticUiSticky.semanticUiStickyStrings.refresh
import typings.semanticUiSticky.semanticUiStickyStrings.scrollContext
import typings.semanticUiSticky.semanticUiStickyStrings.setSize
import typings.semanticUiSticky.semanticUiStickyStrings.setting
import typings.semanticUiSticky.semanticUiStickyStrings.silent
import typings.semanticUiSticky.semanticUiStickyStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sticky_ extends js.Object {
  
  def apply(): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * recalculates offsets
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, name: bottomOffset, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: bottomOffset, value: Double): JQuery = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: context, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: jitter, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: jitter, value: Double): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: offset, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
  def apply(behavior: setting, name: onBottom, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottom, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onReposition, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onReposition, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onScroll, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onScroll, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onStick, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onStick, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTop, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTop, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onUnstick, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onUnstick, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: pushing, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: pushing, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: scrollContext, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def apply(behavior: setting, name: scrollContext, value: String): JQuery = js.native
  def apply(behavior: setting, name: scrollContext, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: setSize, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: setSize, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: StickySettings): JQuery = js.native
  def apply(settings: StickySettings): JQuery = js.native
  
  var settings: StickySettings = js.native
}
