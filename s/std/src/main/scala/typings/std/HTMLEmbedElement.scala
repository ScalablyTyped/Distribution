package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <embed> elements. */
@js.native
trait HTMLEmbedElement
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
  
  /** @deprecated */
  var align: java.lang.String = js.native
  
  def getSVGDocument(): Document | Null = js.native
  
  /**
    * Sets or retrieves the height of the object.
    */
  var height: java.lang.String = js.native
  
  /**
    * Sets or retrieves the name of the object.
    */
  /** @deprecated */
  var name: java.lang.String = js.native
  
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
    * Sets or retrieves a URL to be loaded by the object.
    */
  var src: java.lang.String = js.native
  
  var `type`: java.lang.String = js.native
  
  /**
    * Sets or retrieves the width of the object.
    */
  var width: java.lang.String = js.native
}
