package typings
package senchaUnderscoreTouchLib.ExtNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListPaging
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
  /** [Config Option] (Boolean) */
  var autoPaging: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of autoPaging
  		* @returns Boolean
  		*/
  var getAutoPaging: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of loadMoreText
  		* @returns String
  		*/
  var getLoadMoreText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of noMoreRecordsText
  		* @returns String
  		*/
  var getNoMoreRecordsText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var loadMoreText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var noMoreRecordsText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of autoPaging
  		* @param autoPaging Boolean The new value.
  		*/
  var setAutoPaging: js.UndefOr[js.Function1[/* autoPaging */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of loadMoreText
  		* @param loadMoreText String The new value.
  		*/
  var setLoadMoreText: js.UndefOr[js.Function1[/* loadMoreText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of noMoreRecordsText
  		* @param noMoreRecordsText String The new value.
  		*/
  var setNoMoreRecordsText: js.UndefOr[js.Function1[/* noMoreRecordsText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IListPaging {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    autoPaging: js.UndefOr[scala.Boolean] = js.undefined,
    getAutoPaging: js.Function0[scala.Boolean] = null,
    getLoadMoreText: js.Function0[java.lang.String] = null,
    getNoMoreRecordsText: js.Function0[java.lang.String] = null,
    loadMoreText: java.lang.String = null,
    noMoreRecordsText: java.lang.String = null,
    setAutoPaging: js.Function1[/* autoPaging */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setLoadMoreText: js.Function1[/* loadMoreText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setNoMoreRecordsText: js.Function1[/* noMoreRecordsText */ js.UndefOr[java.lang.String], scala.Unit] = null
  ): IListPaging = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(autoPaging)) __obj.updateDynamic("autoPaging")(autoPaging)
    if (getAutoPaging != null) __obj.updateDynamic("getAutoPaging")(getAutoPaging)
    if (getLoadMoreText != null) __obj.updateDynamic("getLoadMoreText")(getLoadMoreText)
    if (getNoMoreRecordsText != null) __obj.updateDynamic("getNoMoreRecordsText")(getNoMoreRecordsText)
    if (loadMoreText != null) __obj.updateDynamic("loadMoreText")(loadMoreText)
    if (noMoreRecordsText != null) __obj.updateDynamic("noMoreRecordsText")(noMoreRecordsText)
    if (setAutoPaging != null) __obj.updateDynamic("setAutoPaging")(setAutoPaging)
    if (setLoadMoreText != null) __obj.updateDynamic("setLoadMoreText")(setLoadMoreText)
    if (setNoMoreRecordsText != null) __obj.updateDynamic("setNoMoreRecordsText")(setNoMoreRecordsText)
    __obj.asInstanceOf[IListPaging]
  }
}

