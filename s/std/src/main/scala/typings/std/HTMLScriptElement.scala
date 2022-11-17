package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** HTML <script> elements expose the HTMLScriptElement interface, which provides special properties and methods for manipulating the behavior and execution of <script> elements (beyond the inherited HTMLElement interface). */
@js.native
trait HTMLScriptElement
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
  
  /* standard dom */
  var async: scala.Boolean = js.native
  
  /**
    * Sets or retrieves the character set used to encode the object.
    * @deprecated
    */
  /* standard dom */
  var charset: java.lang.String = js.native
  
  /* standard dom */
  var crossOrigin: java.lang.String | Null = js.native
  
  /** Sets or retrieves the status of the script. */
  /* standard dom */
  var defer: scala.Boolean = js.native
  
  /**
    * Sets or retrieves the event for which the script is written.
    * @deprecated
    */
  /* standard dom */
  var event: java.lang.String = js.native
  
  /**
    * Sets or retrieves the object that is bound to the event script.
    * @deprecated
    */
  /* standard dom */
  var htmlFor: java.lang.String = js.native
  
  /* standard dom */
  var integrity: java.lang.String = js.native
  
  /* standard dom */
  var noModule: scala.Boolean = js.native
  
  /* standard dom */
  var referrerPolicy: java.lang.String = js.native
  
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
  
  /** Retrieves the URL to an external file that contains the source code or data. */
  /* standard dom */
  var src: java.lang.String = js.native
  
  /** Retrieves or sets the text of the object as a string. */
  /* standard dom */
  var text: java.lang.String = js.native
  
  /** Sets or retrieves the MIME type for the associated scripting engine. */
  /* standard dom */
  var `type`: java.lang.String = js.native
}
