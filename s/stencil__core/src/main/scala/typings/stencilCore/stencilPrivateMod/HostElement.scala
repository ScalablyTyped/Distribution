package typings.stencilCore.stencilPrivateMod

import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  var attributeChangedCallback: js.UndefOr[
    js.Function4[
      /* attribName */ String, 
      /* oldVal */ String, 
      /* newVal */ String, 
      /* namespace */ String, 
      Unit
    ]
  ] = js.native
  
  var componentOnReady: js.UndefOr[js.Function0[js.Promise[this.type]]] = js.native
  
  var connectedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var disconnectedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var forceUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  
  var host: js.UndefOr[Element] = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /**
    * Content Reference:
    * Reference to the HTML Comment that's placed inside of the
    * host element's original content. This comment is used to
    * always represent where host element's light dom is.
    */
  var `s-cr`: js.UndefOr[RenderNode] = js.native
  
  /**
    * Hot Module Replacement, dev mode only
    */
  var `s-hmr`: js.UndefOr[js.Function1[/* versionId */ String, Unit]] = js.native
  
  /**
    * Callback method for when HMR finishes
    */
  var `s-hmr-load`: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Unique stencil id for this element
    */
  var `s-id`: js.UndefOr[String] = js.native
  
  /**
    * Lifecycle ready
    */
  var `s-lr`: js.UndefOr[Boolean] = js.native
  
  var `s-p`: js.UndefOr[js.Array[js.Promise[Unit]]] = js.native
  
  /**
    * On Render Callbacks:
    * Array of callbacks to fire off after it has rendered.
    */
  var `s-rc`: js.UndefOr[js.Array[js.Function0[Unit]]] = js.native
  
  /**
    * Scope Id
    * The scope id of this component when using scoped css encapsulation
    * or using shadow dom but the browser doesn't support it
    */
  var `s-sc`: js.UndefOr[String] = js.native
}
