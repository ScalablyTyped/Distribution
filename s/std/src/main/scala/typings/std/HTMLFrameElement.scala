package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLFrameElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Retrieves the document object of the page or frame.
    */
  /** @deprecated */
  val contentDocument: Document | Null = js.native
  
  /**
    * Retrieves the object of the specified.
    */
  /** @deprecated */
  val contentWindow: WindowProxy | Null = js.native
  
  /**
    * Sets or retrieves whether to display a border for the frame.
    */
  /** @deprecated */
  var frameBorder: java.lang.String = js.native
  
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
  /** @deprecated */
  var name: java.lang.String = js.native
  
  /**
    * Sets or retrieves whether the user can resize the frame.
    */
  /** @deprecated */
  var noResize: scala.Boolean = js.native
  
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
  
  /**
    * Sets or retrieves whether the frame can be scrolled.
    */
  /** @deprecated */
  var scrolling: java.lang.String = js.native
  
  /**
    * Sets or retrieves a URL to be loaded by the object.
    */
  /** @deprecated */
  var src: java.lang.String = js.native
}
