package typings
package senchaUnderscoreTouchLib.ExtNs.dataviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IIndexBar
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
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
  var getLetters: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
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
  var letters: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
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
  var setLetters: js.UndefOr[
    js.Function1[/* letters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of listPrefix
  		* @param listPrefix String The new value.
  		*/
  var setListPrefix: js.UndefOr[js.Function1[/* listPrefix */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var store: js.UndefOr[scala.Boolean] = js.undefined
}

