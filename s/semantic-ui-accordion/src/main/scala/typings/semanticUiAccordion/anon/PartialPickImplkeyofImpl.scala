package typings.semanticUiAccordion.anon

import typings.semanticUiAccordion.JQuery
import typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, keyof semantic-ui-accordion.SemanticUI.AccordionSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  
  var animateChildren: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[ClassNameSettings] = js.native
  
  var closeNested: js.UndefOr[Boolean] = js.native
  
  var collapsible: js.UndefOr[Boolean] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[ErrorSettings] = js.native
  
  var exclusive: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespace: js.UndefOr[String] = js.native
  
  var observeChanges: js.UndefOr[Boolean] = js.native
  
  var on: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var onClose: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var onClosing: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var onOpen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var onOpening: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var performance: js.UndefOr[Boolean] = js.native
  
  var selector: js.UndefOr[SelectorSettings] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
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
    def setAnimateChildren(value: Boolean): Self = this.set("animateChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateChildren: Self = this.set("animateChildren", js.undefined)
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCloseNested(value: Boolean): Self = this.set("closeNested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseNested: Self = this.set("closeNested", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setObserveChanges(value: Boolean): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObserveChanges: Self = this.set("observeChanges", js.undefined)
    
    @scala.inline
    def setOn(value: String): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setOnChange(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClose(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnClosing(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClosing: Self = this.set("onClosing", js.undefined)
    
    @scala.inline
    def setOnOpen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnOpening(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onOpening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOpening: Self = this.set("onOpening", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
