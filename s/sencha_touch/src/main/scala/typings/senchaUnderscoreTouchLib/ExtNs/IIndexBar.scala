package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexBar extends IComponent {
  /** [Config Option] (Boolean) */
  var alphabet: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of letters
  		* @returns Array
  		*/
  var getLetters: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of listPrefix
  		* @returns String
  		*/
  var getListPrefix: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns true when direction is horizontal  */
  var isHorizontal: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns true when direction is vertical  */
  var isVertical: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var itemSelector: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Array) */
  var letters: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var listPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of letters
  		* @param letters Array The new value.
  		*/
  var setLetters: js.UndefOr[js.Function1[/* letters */ js.UndefOr[Array], scala.Unit]] = js.undefined
  /** [Method] Sets the value of listPrefix
  		* @param listPrefix String The new value.
  		*/
  var setListPrefix: js.UndefOr[js.Function1[/* listPrefix */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var store: js.UndefOr[scala.Boolean] = js.undefined
}

object IIndexBar {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    alphabet: js.UndefOr[scala.Boolean] = js.undefined,
    baseCls: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    direction: java.lang.String = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getDirection: js.Function0[java.lang.String] = null,
    getLetters: js.Function0[Array] = null,
    getListPrefix: js.Function0[java.lang.String] = null,
    getUi: js.Function0[java.lang.String] = null,
    isHorizontal: js.Function0[scala.Unit] = null,
    isVertical: js.Function0[scala.Unit] = null,
    itemSelector: js.UndefOr[scala.Boolean] = js.undefined,
    letters: Array = null,
    listPrefix: java.lang.String = null,
    refresh: js.Function0[scala.Unit] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDirection: js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setLetters: js.Function1[/* letters */ js.UndefOr[Array], scala.Unit] = null,
    setListPrefix: js.Function1[/* listPrefix */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    store: js.UndefOr[scala.Boolean] = js.undefined,
    ui: java.lang.String = null
  ): IIndexBar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(alphabet)) __obj.updateDynamic("alphabet")(alphabet)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getDirection != null) __obj.updateDynamic("getDirection")(getDirection)
    if (getLetters != null) __obj.updateDynamic("getLetters")(getLetters)
    if (getListPrefix != null) __obj.updateDynamic("getListPrefix")(getListPrefix)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (isHorizontal != null) __obj.updateDynamic("isHorizontal")(isHorizontal)
    if (isVertical != null) __obj.updateDynamic("isVertical")(isVertical)
    if (!js.isUndefined(itemSelector)) __obj.updateDynamic("itemSelector")(itemSelector)
    if (letters != null) __obj.updateDynamic("letters")(letters)
    if (listPrefix != null) __obj.updateDynamic("listPrefix")(listPrefix)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setDirection != null) __obj.updateDynamic("setDirection")(setDirection)
    if (setLetters != null) __obj.updateDynamic("setLetters")(setLetters)
    if (setListPrefix != null) __obj.updateDynamic("setListPrefix")(setListPrefix)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (!js.isUndefined(store)) __obj.updateDynamic("store")(store)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[IIndexBar]
  }
}

