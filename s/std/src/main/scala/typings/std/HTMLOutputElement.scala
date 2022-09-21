package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods (beyond those inherited from HTMLElement) for manipulating the layout and presentation of <output> elements. */
@js.native
trait HTMLOutputElement
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
  def checkValidity(): scala.Boolean = js.native
  
  /* standard dom */
  var defaultValue: java.lang.String = js.native
  
  /* standard dom */
  val form: HTMLFormElement | Null = js.native
  
  /* standard dom */
  val htmlFor: DOMTokenList = js.native
  
  /* standard dom */
  val labels: NodeListOf[HTMLLabelElement] = js.native
  
  /* standard dom */
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
  
  /* standard dom */
  def reportValidity(): scala.Boolean = js.native
  
  /* standard dom */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /** Returns the string "output". */
  /* standard dom */
  val `type`: java.lang.String = js.native
  
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /* standard dom */
  val validity: ValidityState = js.native
  
  /**
    * Returns the element's current value.
    *
    * Can be set, to change the value.
    */
  /* standard dom */
  var value: java.lang.String = js.native
  
  /* standard dom */
  val willValidate: scala.Boolean = js.native
}
