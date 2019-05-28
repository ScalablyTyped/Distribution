package typings
package smoothDashScrollbarLib.smoothDashScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar", JSImport.Default)
@js.native
class default () extends SmoothScrollbar

/* static members */
@JSImport("smooth-scrollbar", JSImport.Default)
@js.native
object default extends js.Object {
  var ScrollbarPlugin: smoothDashScrollbarLib.TypeofClassScrollbarPlugin = js.native
  var version: java.lang.String = js.native
  /**
    * Attaches default style sheets to current document.
    * You don't need to call this method manually unless
    * you removed the default styles via `Scrollbar.detachStyle()`
    */
  def attachStyle(): scala.Unit = js.native
  /**
    * Removes scrollbar on the given element
    */
  def destroy(elem: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Removes all scrollbar instances from current document
    */
  def destroyAll(): scala.Unit = js.native
  /**
    * Removes default styles from current document.
    * Use this method when you want to use your own css for scrollbars.
    */
  def detachStyle(): scala.Unit = js.native
  /**
    * Gets scrollbar on the given element.
    * If no scrollbar instance exsits, returns `undefined`
    *
    * @param elem The DOM element that you want to check.
    */
  def get(elem: stdLib.HTMLElement): js.UndefOr[smoothDashScrollbarLib.scrollbarMod.Scrollbar] = js.native
  /**
    * Returns an array that contains all scrollbar instances
    */
  def getAll(): js.Array[smoothDashScrollbarLib.scrollbarMod.Scrollbar] = js.native
  /**
    * Check if there is a scrollbar on given element
    *
    * @param elem The DOM element that you want to check
    */
  def has(elem: stdLib.HTMLElement): scala.Boolean = js.native
  /**
    * Initializes a scrollbar on the given element.
    *
    * @param elem The DOM element that you want to initialize scrollbar to
    * @param [options] Initial options
    */
  def init(elem: stdLib.HTMLElement): smoothDashScrollbarLib.scrollbarMod.Scrollbar = js.native
  def init(
    elem: stdLib.HTMLElement,
    options: stdLib.Partial[smoothDashScrollbarLib.interfacesScrollbarMod.ScrollbarOptions]
  ): smoothDashScrollbarLib.scrollbarMod.Scrollbar = js.native
  /**
    * Automatically init scrollbar on all elements base on the selector `[data-scrollbar]`
    *
    * @param options Initial options
    */
  def initAll(): js.Array[smoothDashScrollbarLib.scrollbarMod.Scrollbar] = js.native
  def initAll(options: stdLib.Partial[smoothDashScrollbarLib.interfacesScrollbarMod.ScrollbarOptions]): js.Array[smoothDashScrollbarLib.scrollbarMod.Scrollbar] = js.native
  /**
    * Attaches plugins to scrollbars
    *
    * @param ...Plugins Scrollbar plugin classes
    */
  def use(Plugins: smoothDashScrollbarLib.TypeofClassScrollbarPlugin*): scala.Unit = js.native
}

