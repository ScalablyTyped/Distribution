package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** <option> elements and inherits all classes and methods of the HTMLElement interface. */
@js.native
trait HTMLOptionElement
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
  
  /** Sets or retrieves the status of an option. */
  /* standard dom */
  var defaultSelected: scala.Boolean = js.native
  
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /** Retrieves a reference to the form that the object is embedded in. */
  /* standard dom */
  val form: HTMLFormElement | Null = js.native
  
  /** Sets or retrieves the ordinal position of an option in a list box. */
  /* standard dom */
  val index: Double = js.native
  
  /** Sets or retrieves a value that you can use to implement your own label functionality for the object. */
  /* standard dom */
  var label: java.lang.String = js.native
  
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
  
  /** Sets or retrieves whether the option in the list box is the default item. */
  /* standard dom */
  var selected: scala.Boolean = js.native
  
  /** Sets or retrieves the text string specified by the option tag. */
  /* standard dom */
  var text: java.lang.String = js.native
  
  /** Sets or retrieves the value which is returned to the server when the form control is submitted. */
  /* standard dom */
  var value: java.lang.String = js.native
}
