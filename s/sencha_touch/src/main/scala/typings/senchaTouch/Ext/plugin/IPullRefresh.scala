package typings.senchaTouch.Ext.plugin

import typings.senchaTouch.Ext.IComponent
import typings.senchaTouch.Ext.dataview.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPullRefresh extends IComponent {
  
  /** [Config Option] (Boolean) */
  var autoSnapBack: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the value of autoSnapBack
    * @returns Boolean
    */
  var getAutoSnapBack: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of lastUpdatedDateFormat
    * @returns String
    */
  var getLastUpdatedDateFormat: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of lastUpdatedText
    * @returns String
    */
  var getLastUpdatedText: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of list
    * @returns Ext.dataview.List
    */
  var getList: js.UndefOr[js.Function0[IList]] = js.native
  
  /** [Method] Returns the value of loadedText
    * @returns String
    */
  var getLoadedText: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of loadingText
    * @returns String
    */
  var getLoadingText: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of overpullSnapBackDuration
    * @returns Number
    */
  var getOverpullSnapBackDuration: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of pullText
    * @returns String
    */
  var getPullText: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of pullTpl
    * @returns Ext.XTemplate/String/Array
    */
  var getPullTpl: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of releaseText
    * @returns String
    */
  var getReleaseText: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of scrollerAutoRefresh
    * @returns Boolean
    */
  var getScrollerAutoRefresh: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of snappingAnimationDuration
    * @returns Number
    */
  var getSnappingAnimationDuration: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of translatable
    * @returns Boolean
    */
  var getTranslatable: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (String) */
  var lastUpdatedDateFormat: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var lastUpdatedText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.dataview.List) */
  var list: js.UndefOr[IList] = js.native
  
  /** [Config Option] (String) */
  var loadedText: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var overpullSnapBackDuration: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var pullRefreshText: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var pullReleaseText: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var pullText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.XTemplate/String/Array) */
  var pullTpl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var releaseText: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var scrollerAutoRefresh: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the value of autoSnapBack
    * @param autoSnapBack Boolean The new value.
    */
  var setAutoSnapBack: js.UndefOr[js.Function1[/* autoSnapBack */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of lastUpdatedDateFormat
    * @param lastUpdatedDateFormat String The new value.
    */
  var setLastUpdatedDateFormat: js.UndefOr[js.Function1[/* lastUpdatedDateFormat */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of lastUpdatedText
    * @param lastUpdatedText String The new value.
    */
  var setLastUpdatedText: js.UndefOr[js.Function1[/* lastUpdatedText */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of list
    * @param list Ext.dataview.List The new value.
    */
  var setList: js.UndefOr[js.Function1[/* list */ js.UndefOr[IList], Unit]] = js.native
  
  /** [Method] Sets the value of loadedText
    * @param loadedText String The new value.
    */
  var setLoadedText: js.UndefOr[js.Function1[/* loadedText */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of loadingText
    * @param loadingText String The new value.
    */
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of overpullSnapBackDuration
    * @param overpullSnapBackDuration Number The new value.
    */
  var setOverpullSnapBackDuration: js.UndefOr[js.Function1[/* overpullSnapBackDuration */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Updates the PullRefreshText
    * @param text String
    */
  var setPullRefreshText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of pullText
    * @param pullText String The new value.
    */
  var setPullText: js.UndefOr[js.Function1[/* pullText */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of pullTpl
    * @param pullTpl Ext.XTemplate/String/Array The new value.
    */
  var setPullTpl: js.UndefOr[js.Function1[/* pullTpl */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Updates the ReleaseRefreshText
    * @param text String
    */
  var setReleaseRefreshText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of releaseText
    * @param releaseText String The new value.
    */
  var setReleaseText: js.UndefOr[js.Function1[/* releaseText */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of scrollerAutoRefresh
    * @param scrollerAutoRefresh Boolean The new value.
    */
  var setScrollerAutoRefresh: js.UndefOr[js.Function1[/* scrollerAutoRefresh */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of snappingAnimationDuration
    * @param snappingAnimationDuration Number The new value.
    */
  var setSnappingAnimationDuration: js.UndefOr[js.Function1[/* snappingAnimationDuration */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of translatable
    * @param translatable Boolean The new value.
    */
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Snaps the List back to the top after a pullrefresh is complete
    * @param force Boolean Force the snapback to occur regardless of state {optional}
    */
  var snapBack: js.UndefOr[js.Function1[/* force */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var snappingAnimationDuration: js.UndefOr[Double] = js.native
}
object IPullRefresh {
  
  @scala.inline
  def apply(): IPullRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPullRefresh]
  }
  
  @scala.inline
  implicit class IPullRefreshOps[Self <: IPullRefresh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoSnapBack(value: Boolean): Self = this.set("autoSnapBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSnapBack: Self = this.set("autoSnapBack", js.undefined)
    
    @scala.inline
    def setGetAutoSnapBack(value: () => Boolean): Self = this.set("getAutoSnapBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoSnapBack: Self = this.set("getAutoSnapBack", js.undefined)
    
    @scala.inline
    def setGetLastUpdatedDateFormat(value: () => String): Self = this.set("getLastUpdatedDateFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLastUpdatedDateFormat: Self = this.set("getLastUpdatedDateFormat", js.undefined)
    
    @scala.inline
    def setGetLastUpdatedText(value: () => String): Self = this.set("getLastUpdatedText", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLastUpdatedText: Self = this.set("getLastUpdatedText", js.undefined)
    
    @scala.inline
    def setGetList(value: () => IList): Self = this.set("getList", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetList: Self = this.set("getList", js.undefined)
    
    @scala.inline
    def setGetLoadedText(value: () => String): Self = this.set("getLoadedText", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLoadedText: Self = this.set("getLoadedText", js.undefined)
    
    @scala.inline
    def setGetLoadingText(value: () => String): Self = this.set("getLoadingText", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLoadingText: Self = this.set("getLoadingText", js.undefined)
    
    @scala.inline
    def setGetOverpullSnapBackDuration(value: () => Double): Self = this.set("getOverpullSnapBackDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOverpullSnapBackDuration: Self = this.set("getOverpullSnapBackDuration", js.undefined)
    
    @scala.inline
    def setGetPullText(value: () => String): Self = this.set("getPullText", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPullText: Self = this.set("getPullText", js.undefined)
    
    @scala.inline
    def setGetPullTpl(value: () => _): Self = this.set("getPullTpl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPullTpl: Self = this.set("getPullTpl", js.undefined)
    
    @scala.inline
    def setGetReleaseText(value: () => String): Self = this.set("getReleaseText", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetReleaseText: Self = this.set("getReleaseText", js.undefined)
    
    @scala.inline
    def setGetScrollerAutoRefresh(value: () => Boolean): Self = this.set("getScrollerAutoRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollerAutoRefresh: Self = this.set("getScrollerAutoRefresh", js.undefined)
    
    @scala.inline
    def setGetSnappingAnimationDuration(value: () => Double): Self = this.set("getSnappingAnimationDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSnappingAnimationDuration: Self = this.set("getSnappingAnimationDuration", js.undefined)
    
    @scala.inline
    def setGetTranslatable(value: () => Boolean): Self = this.set("getTranslatable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTranslatable: Self = this.set("getTranslatable", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateFormat(value: String): Self = this.set("lastUpdatedDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDateFormat: Self = this.set("lastUpdatedDateFormat", js.undefined)
    
    @scala.inline
    def setLastUpdatedText(value: String): Self = this.set("lastUpdatedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedText: Self = this.set("lastUpdatedText", js.undefined)
    
    @scala.inline
    def setList(value: IList): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setLoadedText(value: String): Self = this.set("loadedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadedText: Self = this.set("loadedText", js.undefined)
    
    @scala.inline
    def setLoadingText(value: String): Self = this.set("loadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingText: Self = this.set("loadingText", js.undefined)
    
    @scala.inline
    def setOverpullSnapBackDuration(value: Double): Self = this.set("overpullSnapBackDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverpullSnapBackDuration: Self = this.set("overpullSnapBackDuration", js.undefined)
    
    @scala.inline
    def setPullRefreshText(value: String): Self = this.set("pullRefreshText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRefreshText: Self = this.set("pullRefreshText", js.undefined)
    
    @scala.inline
    def setPullReleaseText(value: String): Self = this.set("pullReleaseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullReleaseText: Self = this.set("pullReleaseText", js.undefined)
    
    @scala.inline
    def setPullText(value: String): Self = this.set("pullText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullText: Self = this.set("pullText", js.undefined)
    
    @scala.inline
    def setPullTpl(value: js.Any): Self = this.set("pullTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullTpl: Self = this.set("pullTpl", js.undefined)
    
    @scala.inline
    def setReleaseText(value: String): Self = this.set("releaseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseText: Self = this.set("releaseText", js.undefined)
    
    @scala.inline
    def setScrollerAutoRefresh(value: Boolean): Self = this.set("scrollerAutoRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollerAutoRefresh: Self = this.set("scrollerAutoRefresh", js.undefined)
    
    @scala.inline
    def setSetAutoSnapBack(value: /* autoSnapBack */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoSnapBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoSnapBack: Self = this.set("setAutoSnapBack", js.undefined)
    
    @scala.inline
    def setSetLastUpdatedDateFormat(value: /* lastUpdatedDateFormat */ js.UndefOr[String] => Unit): Self = this.set("setLastUpdatedDateFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLastUpdatedDateFormat: Self = this.set("setLastUpdatedDateFormat", js.undefined)
    
    @scala.inline
    def setSetLastUpdatedText(value: /* lastUpdatedText */ js.UndefOr[String] => Unit): Self = this.set("setLastUpdatedText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLastUpdatedText: Self = this.set("setLastUpdatedText", js.undefined)
    
    @scala.inline
    def setSetList(value: /* list */ js.UndefOr[IList] => Unit): Self = this.set("setList", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetList: Self = this.set("setList", js.undefined)
    
    @scala.inline
    def setSetLoadedText(value: /* loadedText */ js.UndefOr[String] => Unit): Self = this.set("setLoadedText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLoadedText: Self = this.set("setLoadedText", js.undefined)
    
    @scala.inline
    def setSetLoadingText(value: /* loadingText */ js.UndefOr[String] => Unit): Self = this.set("setLoadingText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLoadingText: Self = this.set("setLoadingText", js.undefined)
    
    @scala.inline
    def setSetOverpullSnapBackDuration(value: /* overpullSnapBackDuration */ js.UndefOr[Double] => Unit): Self = this.set("setOverpullSnapBackDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOverpullSnapBackDuration: Self = this.set("setOverpullSnapBackDuration", js.undefined)
    
    @scala.inline
    def setSetPullRefreshText(value: /* text */ js.UndefOr[String] => Unit): Self = this.set("setPullRefreshText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPullRefreshText: Self = this.set("setPullRefreshText", js.undefined)
    
    @scala.inline
    def setSetPullText(value: /* pullText */ js.UndefOr[String] => Unit): Self = this.set("setPullText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPullText: Self = this.set("setPullText", js.undefined)
    
    @scala.inline
    def setSetPullTpl(value: /* pullTpl */ js.UndefOr[js.Any] => Unit): Self = this.set("setPullTpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPullTpl: Self = this.set("setPullTpl", js.undefined)
    
    @scala.inline
    def setSetReleaseRefreshText(value: /* text */ js.UndefOr[String] => Unit): Self = this.set("setReleaseRefreshText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetReleaseRefreshText: Self = this.set("setReleaseRefreshText", js.undefined)
    
    @scala.inline
    def setSetReleaseText(value: /* releaseText */ js.UndefOr[String] => Unit): Self = this.set("setReleaseText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetReleaseText: Self = this.set("setReleaseText", js.undefined)
    
    @scala.inline
    def setSetScrollerAutoRefresh(value: /* scrollerAutoRefresh */ js.UndefOr[Boolean] => Unit): Self = this.set("setScrollerAutoRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetScrollerAutoRefresh: Self = this.set("setScrollerAutoRefresh", js.undefined)
    
    @scala.inline
    def setSetSnappingAnimationDuration(value: /* snappingAnimationDuration */ js.UndefOr[Double] => Unit): Self = this.set("setSnappingAnimationDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSnappingAnimationDuration: Self = this.set("setSnappingAnimationDuration", js.undefined)
    
    @scala.inline
    def setSetTranslatable(value: /* translatable */ js.UndefOr[Boolean] => Unit): Self = this.set("setTranslatable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTranslatable: Self = this.set("setTranslatable", js.undefined)
    
    @scala.inline
    def setSnapBack(value: /* force */ js.UndefOr[Boolean] => Unit): Self = this.set("snapBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSnapBack: Self = this.set("snapBack", js.undefined)
    
    @scala.inline
    def setSnappingAnimationDuration(value: Double): Self = this.set("snappingAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnappingAnimationDuration: Self = this.set("snappingAnimationDuration", js.undefined)
  }
}
