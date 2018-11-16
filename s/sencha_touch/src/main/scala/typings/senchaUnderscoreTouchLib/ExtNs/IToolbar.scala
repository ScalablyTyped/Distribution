package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IToolbar extends IContainer {
  /** [Method] Returns the value of layout
  		* @returns Object/String
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an Ext Title component
  		* @returns Ext.Title
  		*/
  var getTitle: js.UndefOr[js.Function0[ITitle]] = js.undefined
  /** [Method] Hides the title if it exists  */
  var hideTitle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_IToolbar: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of minHeight
  		* @param minHeight String The new value.
  		*/
  @JSName("setMinHeight")
  var setMinHeight_IToolbar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Use this to update the title configuration
  		* @param title String/Ext.Title You can either pass a String, or a config/instance of Ext.Title.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Shows the title if it exists  */
  var showTitle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Ext.Title) */
  var title: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var titleCls: js.UndefOr[scala.Boolean] = js.undefined
}

