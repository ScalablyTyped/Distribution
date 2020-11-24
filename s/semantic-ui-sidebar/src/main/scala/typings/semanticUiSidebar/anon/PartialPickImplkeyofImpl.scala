package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.JQuery
import typings.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings
import typings.semanticUiSidebar.semanticUiSidebarStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  
  var className: js.UndefOr[ClassNameSettings] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var context: js.UndefOr[String | JQuery] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var defaultTransition: js.UndefOr[DefaultTransitionSettings] = js.native
  
  var delaySetup: js.UndefOr[Boolean] = js.native
  
  var dimPage: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[ErrorSettings] = js.native
  
  var exclusive: js.UndefOr[Boolean] = js.native
  
  var mobileTransition: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespace: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var onHidden: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var onVisible: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var performance: js.UndefOr[Boolean] = js.native
  
  var regExp: js.UndefOr[RegExpSettings] = js.native
  
  var returnScroll: js.UndefOr[Boolean] = js.native
  
  var scrollLock: js.UndefOr[Boolean] = js.native
  
  var selector: js.UndefOr[SelectorSettings] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var transition: js.UndefOr[String] = js.native
  
  var useLegacy: js.UndefOr[auto | Boolean] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object PartialPickImplkeyofImpl {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setContext(value: String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDefaultTransition(value: DefaultTransitionSettings): Self = this.set("defaultTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTransition: Self = this.set("defaultTransition", js.undefined)
    
    @scala.inline
    def setDelaySetup(value: Boolean): Self = this.set("delaySetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelaySetup: Self = this.set("delaySetup", js.undefined)
    
    @scala.inline
    def setDimPage(value: Boolean): Self = this.set("dimPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimPage: Self = this.set("dimPage", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    
    @scala.inline
    def setMobileTransition(value: String): Self = this.set("mobileTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileTransition: Self = this.set("mobileTransition", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setOnChange(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnHidden(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHidden: Self = this.set("onHidden", js.undefined)
    
    @scala.inline
    def setOnHide(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnVisible: Self = this.set("onVisible", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = this.set("regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegExp: Self = this.set("regExp", js.undefined)
    
    @scala.inline
    def setReturnScroll(value: Boolean): Self = this.set("returnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnScroll: Self = this.set("returnScroll", js.undefined)
    
    @scala.inline
    def setScrollLock(value: Boolean): Self = this.set("scrollLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollLock: Self = this.set("scrollLock", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setUseLegacy(value: auto | Boolean): Self = this.set("useLegacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLegacy: Self = this.set("useLegacy", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
