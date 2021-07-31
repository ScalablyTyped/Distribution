package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLAppletElement
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
  
  /**
    * Sets or retrieves a text alternative to the graphic.
    */
  /** @deprecated */
  var alt: java.lang.String = js.native
  
  /**
    * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
    */
  /** @deprecated */
  var archive: java.lang.String = js.native
  
  /** @deprecated */
  var code: java.lang.String = js.native
  
  /**
    * Sets or retrieves the URL of the component.
    */
  /** @deprecated */
  var codeBase: java.lang.String = js.native
  
  val form: HTMLFormElement | Null = js.native
  
  /**
    * Sets or retrieves the height of the object.
    */
  /** @deprecated */
  var height: java.lang.String = js.native
  
  /** @deprecated */
  var hspace: Double = js.native
  
  /**
    * Sets or retrieves the shape of the object.
    */
  /** @deprecated */
  var name: java.lang.String = js.native
  
  /** @deprecated */
  var `object`: java.lang.String = js.native
  
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
  
  /** @deprecated */
  var vspace: Double = js.native
  
  /** @deprecated */
  var width: java.lang.String = js.native
}
