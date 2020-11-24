package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import typings.semanticUiPopup.SemanticUI.Popup.ClassNameSettings
import typings.semanticUiPopup.SemanticUI.Popup.DelaySettings
import typings.semanticUiPopup.SemanticUI.Popup.ErrorSettings
import typings.semanticUiPopup.SemanticUI.Popup.MetadataSettings
import typings.semanticUiPopup.SemanticUI.Popup.SelectorSettings
import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import typings.semanticUiPopup.semanticUiPopupStrings.adjacent
import typings.semanticUiPopup.semanticUiPopupStrings.auto
import typings.semanticUiPopup.semanticUiPopupStrings.click
import typings.semanticUiPopup.semanticUiPopupStrings.focus
import typings.semanticUiPopup.semanticUiPopupStrings.hover
import typings.semanticUiPopup.semanticUiPopupStrings.manual
import typings.semanticUiPopup.semanticUiPopupStrings.opposite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, keyof semantic-ui-popup.SemanticUI.PopupSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  
  var addTouchEvents: js.UndefOr[Boolean] = js.native
  
  var boundary: js.UndefOr[String | JQuery] = js.native
  
  var className: js.UndefOr[ClassNameSettings] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var context: js.UndefOr[String | JQuery] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var delay: js.UndefOr[DelaySettings] = js.native
  
  var distanceAway: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var error: js.UndefOr[ErrorSettings] = js.native
  
  var exclusive: js.UndefOr[Boolean] = js.native
  
  var hideOnScroll: js.UndefOr[auto | `false`] = js.native
  
  var hoverable: js.UndefOr[Boolean] = js.native
  
  var html: js.UndefOr[String | JQuery] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var jitter: js.UndefOr[Double] = js.native
  
  var lastResort: js.UndefOr[Boolean | String] = js.native
  
  var maxSearchDepth: js.UndefOr[Double] = js.native
  
  var metadata: js.UndefOr[MetadataSettings] = js.native
  
  var movePopup: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespace: js.UndefOr[String] = js.native
  
  var observeChanges: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var on: js.UndefOr[focus | click | hover | manual] = js.native
  
  var onCreate: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.native
  
  var onHidden: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.native
  
  var onHide: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]] = js.native
  
  var onRemove: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.native
  
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]] = js.native
  
  var onUnplaceable: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.native
  
  var onVisible: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.native
  
  var performance: js.UndefOr[Boolean] = js.native
  
  var popup: js.UndefOr[`false` | String | JQuery] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var prefer: js.UndefOr[adjacent | opposite] = js.native
  
  var preserve: js.UndefOr[Boolean] = js.native
  
  var scrollContext: js.UndefOr[String | JQuery] = js.native
  
  var selector: js.UndefOr[SelectorSettings] = js.native
  
  var setFluidWidth: js.UndefOr[Boolean] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[`false` | String | JQuery] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var transition: js.UndefOr[String] = js.native
  
  var variation: js.UndefOr[String] = js.native
  
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
    def setAddTouchEvents(value: Boolean): Self = this.set("addTouchEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddTouchEvents: Self = this.set("addTouchEvents", js.undefined)
    
    @scala.inline
    def setBoundary(value: String | JQuery): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContext(value: String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDelay(value: DelaySettings): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDistanceAway(value: Double): Self = this.set("distanceAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceAway: Self = this.set("distanceAway", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    
    @scala.inline
    def setHideOnScroll(value: auto | `false`): Self = this.set("hideOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnScroll: Self = this.set("hideOnScroll", js.undefined)
    
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    
    @scala.inline
    def setHtml(value: String | JQuery): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setJitter(value: Double): Self = this.set("jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJitter: Self = this.set("jitter", js.undefined)
    
    @scala.inline
    def setLastResort(value: Boolean | String): Self = this.set("lastResort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastResort: Self = this.set("lastResort", js.undefined)
    
    @scala.inline
    def setMaxSearchDepth(value: Double): Self = this.set("maxSearchDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSearchDepth: Self = this.set("maxSearchDepth", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMovePopup(value: Boolean): Self = this.set("movePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovePopup: Self = this.set("movePopup", js.undefined)
    
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOn(value: focus | click | hover | manual): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setOnCreate(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = this.set("onCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCreate: Self = this.set("onCreate", js.undefined)
    
    @scala.inline
    def setOnHidden(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = this.set("onHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHidden: Self = this.set("onHidden", js.undefined)
    
    @scala.inline
    def setOnHide(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]): Self = this.set("onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnRemove(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = this.set("onRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnUnplaceable(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = this.set("onUnplaceable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUnplaceable: Self = this.set("onUnplaceable", js.undefined)
    
    @scala.inline
    def setOnVisible(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = this.set("onVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnVisible: Self = this.set("onVisible", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    
    @scala.inline
    def setPopup(value: `false` | String | JQuery): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPrefer(value: adjacent | opposite): Self = this.set("prefer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefer: Self = this.set("prefer", js.undefined)
    
    @scala.inline
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserve: Self = this.set("preserve", js.undefined)
    
    @scala.inline
    def setScrollContext(value: String | JQuery): Self = this.set("scrollContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollContext: Self = this.set("scrollContext", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSetFluidWidth(value: Boolean): Self = this.set("setFluidWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetFluidWidth: Self = this.set("setFluidWidth", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setTarget(value: `false` | String | JQuery): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setVariation(value: String): Self = this.set("variation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariation: Self = this.set("variation", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
