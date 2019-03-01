package typings
package senchaUnderscoreTouchLib.ExtNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPullRefresh
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
  /** [Config Option] (Boolean) */
  var autoSnapBack: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of autoSnapBack
  		* @returns Boolean
  		*/
  var getAutoSnapBack: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of lastUpdatedDateFormat
  		* @returns String
  		*/
  var getLastUpdatedDateFormat: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of lastUpdatedText
  		* @returns String
  		*/
  var getLastUpdatedText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of list
  		* @returns Ext.dataview.List
  		*/
  var getList: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList]] = js.undefined
  /** [Method] Returns the value of loadedText
  		* @returns String
  		*/
  var getLoadedText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of loadingText
  		* @returns String
  		*/
  var getLoadingText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of overpullSnapBackDuration
  		* @returns Number
  		*/
  var getOverpullSnapBackDuration: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of pullText
  		* @returns String
  		*/
  var getPullText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of pullTpl
  		* @returns Ext.XTemplate/String/Array
  		*/
  var getPullTpl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of releaseText
  		* @returns String
  		*/
  var getReleaseText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of scrollerAutoRefresh
  		* @returns Boolean
  		*/
  var getScrollerAutoRefresh: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of snappingAnimationDuration
  		* @returns Number
  		*/
  var getSnappingAnimationDuration: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of translatable
  		* @returns Boolean
  		*/
  var getTranslatable: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var lastUpdatedDateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var lastUpdatedText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.dataview.List) */
  var list: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList] = js.undefined
  /** [Config Option] (String) */
  var loadedText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var overpullSnapBackDuration: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var pullRefreshText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var pullReleaseText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var pullText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.XTemplate/String/Array) */
  var pullTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var releaseText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var scrollerAutoRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the value of autoSnapBack
  		* @param autoSnapBack Boolean The new value.
  		*/
  var setAutoSnapBack: js.UndefOr[js.Function1[/* autoSnapBack */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of lastUpdatedDateFormat
  		* @param lastUpdatedDateFormat String The new value.
  		*/
  var setLastUpdatedDateFormat: js.UndefOr[
    js.Function1[/* lastUpdatedDateFormat */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of lastUpdatedText
  		* @param lastUpdatedText String The new value.
  		*/
  var setLastUpdatedText: js.UndefOr[js.Function1[/* lastUpdatedText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of list
  		* @param list Ext.dataview.List The new value.
  		*/
  var setList: js.UndefOr[
    js.Function1[/* list */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of loadedText
  		* @param loadedText String The new value.
  		*/
  var setLoadedText: js.UndefOr[js.Function1[/* loadedText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of loadingText
  		* @param loadingText String The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of overpullSnapBackDuration
  		* @param overpullSnapBackDuration Number The new value.
  		*/
  var setOverpullSnapBackDuration: js.UndefOr[
    js.Function1[/* overpullSnapBackDuration */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] Updates the PullRefreshText
  		* @param text String
  		*/
  var setPullRefreshText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pullText
  		* @param pullText String The new value.
  		*/
  var setPullText: js.UndefOr[js.Function1[/* pullText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pullTpl
  		* @param pullTpl Ext.XTemplate/String/Array The new value.
  		*/
  var setPullTpl: js.UndefOr[js.Function1[/* pullTpl */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Updates the ReleaseRefreshText
  		* @param text String
  		*/
  var setReleaseRefreshText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of releaseText
  		* @param releaseText String The new value.
  		*/
  var setReleaseText: js.UndefOr[js.Function1[/* releaseText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scrollerAutoRefresh
  		* @param scrollerAutoRefresh Boolean The new value.
  		*/
  var setScrollerAutoRefresh: js.UndefOr[js.Function1[/* scrollerAutoRefresh */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of snappingAnimationDuration
  		* @param snappingAnimationDuration Number The new value.
  		*/
  var setSnappingAnimationDuration: js.UndefOr[
    js.Function1[/* snappingAnimationDuration */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of translatable
  		* @param translatable Boolean The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Snaps the List back to the top after a pullrefresh is complete
  		* @param force Boolean Force the snapback to occur regardless of state {optional}
  		*/
  var snapBack: js.UndefOr[js.Function1[/* force */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var snappingAnimationDuration: js.UndefOr[scala.Double] = js.undefined
}

object IPullRefresh {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    autoSnapBack: js.UndefOr[scala.Boolean] = js.undefined,
    getAutoSnapBack: js.Function0[scala.Boolean] = null,
    getLastUpdatedDateFormat: js.Function0[java.lang.String] = null,
    getLastUpdatedText: js.Function0[java.lang.String] = null,
    getList: js.Function0[senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList] = null,
    getLoadedText: js.Function0[java.lang.String] = null,
    getLoadingText: js.Function0[java.lang.String] = null,
    getOverpullSnapBackDuration: js.Function0[scala.Double] = null,
    getPullText: js.Function0[java.lang.String] = null,
    getPullTpl: js.Function0[_] = null,
    getReleaseText: js.Function0[java.lang.String] = null,
    getScrollerAutoRefresh: js.Function0[scala.Boolean] = null,
    getSnappingAnimationDuration: js.Function0[scala.Double] = null,
    getTranslatable: js.Function0[scala.Boolean] = null,
    lastUpdatedDateFormat: java.lang.String = null,
    lastUpdatedText: java.lang.String = null,
    list: senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList = null,
    loadedText: java.lang.String = null,
    loadingText: java.lang.String = null,
    overpullSnapBackDuration: scala.Int | scala.Double = null,
    pullRefreshText: java.lang.String = null,
    pullReleaseText: java.lang.String = null,
    pullText: java.lang.String = null,
    pullTpl: js.Any = null,
    releaseText: java.lang.String = null,
    scrollerAutoRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    setAutoSnapBack: js.Function1[/* autoSnapBack */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setLastUpdatedDateFormat: js.Function1[/* lastUpdatedDateFormat */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setLastUpdatedText: js.Function1[/* lastUpdatedText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setList: js.Function1[/* list */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList], scala.Unit] = null,
    setLoadedText: js.Function1[/* loadedText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setLoadingText: js.Function1[/* loadingText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setOverpullSnapBackDuration: js.Function1[/* overpullSnapBackDuration */ js.UndefOr[scala.Double], scala.Unit] = null,
    setPullRefreshText: js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPullText: js.Function1[/* pullText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPullTpl: js.Function1[/* pullTpl */ js.UndefOr[js.Any], scala.Unit] = null,
    setReleaseRefreshText: js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setReleaseText: js.Function1[/* releaseText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setScrollerAutoRefresh: js.Function1[/* scrollerAutoRefresh */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setSnappingAnimationDuration: js.Function1[/* snappingAnimationDuration */ js.UndefOr[scala.Double], scala.Unit] = null,
    setTranslatable: js.Function1[/* translatable */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    snapBack: js.Function1[/* force */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    snappingAnimationDuration: scala.Int | scala.Double = null
  ): IPullRefresh = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(autoSnapBack)) __obj.updateDynamic("autoSnapBack")(autoSnapBack)
    if (getAutoSnapBack != null) __obj.updateDynamic("getAutoSnapBack")(getAutoSnapBack)
    if (getLastUpdatedDateFormat != null) __obj.updateDynamic("getLastUpdatedDateFormat")(getLastUpdatedDateFormat)
    if (getLastUpdatedText != null) __obj.updateDynamic("getLastUpdatedText")(getLastUpdatedText)
    if (getList != null) __obj.updateDynamic("getList")(getList)
    if (getLoadedText != null) __obj.updateDynamic("getLoadedText")(getLoadedText)
    if (getLoadingText != null) __obj.updateDynamic("getLoadingText")(getLoadingText)
    if (getOverpullSnapBackDuration != null) __obj.updateDynamic("getOverpullSnapBackDuration")(getOverpullSnapBackDuration)
    if (getPullText != null) __obj.updateDynamic("getPullText")(getPullText)
    if (getPullTpl != null) __obj.updateDynamic("getPullTpl")(getPullTpl)
    if (getReleaseText != null) __obj.updateDynamic("getReleaseText")(getReleaseText)
    if (getScrollerAutoRefresh != null) __obj.updateDynamic("getScrollerAutoRefresh")(getScrollerAutoRefresh)
    if (getSnappingAnimationDuration != null) __obj.updateDynamic("getSnappingAnimationDuration")(getSnappingAnimationDuration)
    if (getTranslatable != null) __obj.updateDynamic("getTranslatable")(getTranslatable)
    if (lastUpdatedDateFormat != null) __obj.updateDynamic("lastUpdatedDateFormat")(lastUpdatedDateFormat)
    if (lastUpdatedText != null) __obj.updateDynamic("lastUpdatedText")(lastUpdatedText)
    if (list != null) __obj.updateDynamic("list")(list)
    if (loadedText != null) __obj.updateDynamic("loadedText")(loadedText)
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText)
    if (overpullSnapBackDuration != null) __obj.updateDynamic("overpullSnapBackDuration")(overpullSnapBackDuration.asInstanceOf[js.Any])
    if (pullRefreshText != null) __obj.updateDynamic("pullRefreshText")(pullRefreshText)
    if (pullReleaseText != null) __obj.updateDynamic("pullReleaseText")(pullReleaseText)
    if (pullText != null) __obj.updateDynamic("pullText")(pullText)
    if (pullTpl != null) __obj.updateDynamic("pullTpl")(pullTpl)
    if (releaseText != null) __obj.updateDynamic("releaseText")(releaseText)
    if (!js.isUndefined(scrollerAutoRefresh)) __obj.updateDynamic("scrollerAutoRefresh")(scrollerAutoRefresh)
    if (setAutoSnapBack != null) __obj.updateDynamic("setAutoSnapBack")(setAutoSnapBack)
    if (setLastUpdatedDateFormat != null) __obj.updateDynamic("setLastUpdatedDateFormat")(setLastUpdatedDateFormat)
    if (setLastUpdatedText != null) __obj.updateDynamic("setLastUpdatedText")(setLastUpdatedText)
    if (setList != null) __obj.updateDynamic("setList")(setList)
    if (setLoadedText != null) __obj.updateDynamic("setLoadedText")(setLoadedText)
    if (setLoadingText != null) __obj.updateDynamic("setLoadingText")(setLoadingText)
    if (setOverpullSnapBackDuration != null) __obj.updateDynamic("setOverpullSnapBackDuration")(setOverpullSnapBackDuration)
    if (setPullRefreshText != null) __obj.updateDynamic("setPullRefreshText")(setPullRefreshText)
    if (setPullText != null) __obj.updateDynamic("setPullText")(setPullText)
    if (setPullTpl != null) __obj.updateDynamic("setPullTpl")(setPullTpl)
    if (setReleaseRefreshText != null) __obj.updateDynamic("setReleaseRefreshText")(setReleaseRefreshText)
    if (setReleaseText != null) __obj.updateDynamic("setReleaseText")(setReleaseText)
    if (setScrollerAutoRefresh != null) __obj.updateDynamic("setScrollerAutoRefresh")(setScrollerAutoRefresh)
    if (setSnappingAnimationDuration != null) __obj.updateDynamic("setSnappingAnimationDuration")(setSnappingAnimationDuration)
    if (setTranslatable != null) __obj.updateDynamic("setTranslatable")(setTranslatable)
    if (snapBack != null) __obj.updateDynamic("snapBack")(snapBack)
    if (snappingAnimationDuration != null) __obj.updateDynamic("snappingAnimationDuration")(snappingAnimationDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPullRefresh]
  }
}

