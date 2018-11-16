package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIFrameElement
  extends HTMLElement
     with GetSVGDocument {
  /**
       * Sets or retrieves how the object is aligned with adjacent text.
       */
  /** @deprecated */
  var align: java.lang.String = js.native
  var allowFullscreen: scala.Boolean = js.native
  var allowPaymentRequest: scala.Boolean = js.native
  /**
       * Retrieves the document object of the page or frame.
       */
  val contentDocument: Document | scala.Null = js.native
  /**
       * Retrieves the object of the specified.
       */
  val contentWindow: Window | scala.Null = js.native
  /**
       * Sets or retrieves whether to display a border for the frame.
       */
  /** @deprecated */
  var frameBorder: java.lang.String = js.native
  /**
       * Sets or retrieves the height of the object.
       */
  var height: java.lang.String = js.native
  /**
       * Sets or retrieves a URI to a long description of the object.
       */
  /** @deprecated */
  var longDesc: java.lang.String = js.native
  /**
       * Sets or retrieves the top and bottom margin heights before displaying the text in a frame.
       */
  /** @deprecated */
  var marginHeight: java.lang.String = js.native
  /**
       * Sets or retrieves the left and right margin widths before displaying the text in a frame.
       */
  /** @deprecated */
  var marginWidth: java.lang.String = js.native
  /**
       * Sets or retrieves the frame name.
       */
  var name: java.lang.String = js.native
  val sandbox: DOMTokenList = js.native
  /**
       * Sets or retrieves whether the frame can be scrolled.
       */
  /** @deprecated */
  var scrolling: java.lang.String = js.native
  /**
       * Sets or retrieves a URL to be loaded by the object.
       */
  var src: java.lang.String = js.native
  /**
       * Sets or retrives the content of the page that is to contain.
       */
  var srcdoc: java.lang.String = js.native
  /**
       * Sets or retrieves the width of the object.
       */
  var width: java.lang.String = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("HTMLIFrameElement")
@js.native
object HTMLIFrameElement
  extends ScalablyTyped.runtime.Instantiable0[HTMLIFrameElement]

