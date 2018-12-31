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

