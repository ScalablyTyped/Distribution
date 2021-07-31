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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, keyof semantic-ui-popup.SemanticUI.PopupSettings._Impl>> */
trait PartialPickImplkeyofImpl extends StObject {
  
  var addTouchEvents: js.UndefOr[Boolean] = js.undefined
  
  var boundary: js.UndefOr[String | JQuery] = js.undefined
  
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  
  var closable: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var context: js.UndefOr[String | JQuery] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var delay: js.UndefOr[DelaySettings] = js.undefined
  
  var distanceAway: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[ErrorSettings] = js.undefined
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  var hideOnScroll: js.UndefOr[auto | `false`] = js.undefined
  
  var hoverable: js.UndefOr[Boolean] = js.undefined
  
  var html: js.UndefOr[String | JQuery] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var jitter: js.UndefOr[Double] = js.undefined
  
  var lastResort: js.UndefOr[Boolean | String] = js.undefined
  
  var maxSearchDepth: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  
  var movePopup: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var observeChanges: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var on: js.UndefOr[focus | click | hover | manual] = js.undefined
  
  var onCreate: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.undefined
  
  var onHidden: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.undefined
  
  var onHide: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]] = js.undefined
  
  var onRemove: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]] = js.undefined
  
  var onUnplaceable: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.undefined
  
  var onVisible: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var popup: js.UndefOr[`false` | String | JQuery] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var prefer: js.UndefOr[adjacent | opposite] = js.undefined
  
  var preserve: js.UndefOr[Boolean] = js.undefined
  
  var scrollContext: js.UndefOr[String | JQuery] = js.undefined
  
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  
  var setFluidWidth: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var target: js.UndefOr[`false` | String | JQuery] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var variation: js.UndefOr[String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PartialPickImplkeyofImpl {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplMutableBuilder[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTouchEvents(value: Boolean): Self = StObject.set(x, "addTouchEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTouchEventsUndefined: Self = StObject.set(x, "addTouchEvents", js.undefined)
    
    @scala.inline
    def setBoundary(value: String | JQuery): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDelay(value: DelaySettings): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDistanceAway(value: Double): Self = StObject.set(x, "distanceAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceAwayUndefined: Self = StObject.set(x, "distanceAway", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setHideOnScroll(value: auto | `false`): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnScrollUndefined: Self = StObject.set(x, "hideOnScroll", js.undefined)
    
    @scala.inline
    def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
    
    @scala.inline
    def setHtml(value: String | JQuery): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
    @scala.inline
    def setLastResort(value: Boolean | String): Self = StObject.set(x, "lastResort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastResortUndefined: Self = StObject.set(x, "lastResort", js.undefined)
    
    @scala.inline
    def setMaxSearchDepth(value: Double): Self = StObject.set(x, "maxSearchDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSearchDepthUndefined: Self = StObject.set(x, "maxSearchDepth", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMovePopup(value: Boolean): Self = StObject.set(x, "movePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovePopupUndefined: Self = StObject.set(x, "movePopup", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveChangesUndefined: Self = StObject.set(x, "observeChanges", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOn(value: focus | click | hover | manual): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCreate(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = StObject.set(x, "onCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
    
    @scala.inline
    def setOnHidden(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = StObject.set(x, "onHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHiddenUndefined: Self = StObject.set(x, "onHidden", js.undefined)
    
    @scala.inline
    def setOnHide(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnRemove(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = StObject.set(x, "onRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setOnUnplaceable(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = StObject.set(x, "onUnplaceable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUnplaceableUndefined: Self = StObject.set(x, "onUnplaceable", js.undefined)
    
    @scala.inline
    def setOnVisible(value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]): Self = StObject.set(x, "onVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVisibleUndefined: Self = StObject.set(x, "onVisible", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setPopup(value: `false` | String | JQuery): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPrefer(value: adjacent | opposite): Self = StObject.set(x, "prefer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferUndefined: Self = StObject.set(x, "prefer", js.undefined)
    
    @scala.inline
    def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    
    @scala.inline
    def setScrollContext(value: String | JQuery): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollContextUndefined: Self = StObject.set(x, "scrollContext", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSetFluidWidth(value: Boolean): Self = StObject.set(x, "setFluidWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFluidWidthUndefined: Self = StObject.set(x, "setFluidWidth", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setTarget(value: `false` | String | JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
