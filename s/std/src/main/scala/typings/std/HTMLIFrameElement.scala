package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods (beyond those of the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of inline frame elements. */
@js.native
trait HTMLIFrameElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    * @deprecated
    */
  /* standard dom */
  var align: java.lang.String = js.native
  
  /* standard dom */
  var allow: java.lang.String = js.native
  
  /* standard dom */
  var allowFullscreen: scala.Boolean = js.native
  
  /** Retrieves the document object of the page or frame. */
  /* standard dom */
  val contentDocument: Document | Null = js.native
  
  /** Retrieves the object of the specified. */
  /* standard dom */
  val contentWindow: WindowProxy | Null = js.native
  
  /**
    * Sets or retrieves whether to display a border for the frame.
    * @deprecated
    */
  /* standard dom */
  var frameBorder: java.lang.String = js.native
  
  /* standard dom */
  def getSVGDocument(): Document | Null = js.native
  
  /** Sets or retrieves the height of the object. */
  /* standard dom */
  var height: java.lang.String = js.native
  
  /**
    * Sets or retrieves a URI to a long description of the object.
    * @deprecated
    */
  /* standard dom */
  var longDesc: java.lang.String = js.native
  
  /**
    * Sets or retrieves the top and bottom margin heights before displaying the text in a frame.
    * @deprecated
    */
  /* standard dom */
  var marginHeight: java.lang.String = js.native
  
  /**
    * Sets or retrieves the left and right margin widths before displaying the text in a frame.
    * @deprecated
    */
  /* standard dom */
  var marginWidth: java.lang.String = js.native
  
  /** Sets or retrieves the frame name. */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /* standard dom */
  var referrerPolicy: ReferrerPolicy = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val sandbox: DOMTokenList = js.native
  
  /**
    * Sets or retrieves whether the frame can be scrolled.
    * @deprecated
    */
  /* standard dom */
  var scrolling: java.lang.String = js.native
  
  /** Sets or retrieves a URL to be loaded by the object. */
  /* standard dom */
  var src: java.lang.String = js.native
  
  /** Sets or retrives the content of the page that is to contain. */
  /* standard dom */
  var srcdoc: java.lang.String = js.native
  
  /** Sets or retrieves the width of the object. */
  /* standard dom */
  var width: java.lang.String = js.native
}
