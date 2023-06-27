package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods to manipulate <marquee> elements.
  * @deprecated
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMarqueeElement)
  */
@js.native
trait HTMLMarqueeElement
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
  
  /** @deprecated */
  /* standard dom */
  var behavior: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var bgColor: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var direction: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var height: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var hspace: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  var loop: Double = js.native
  
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
  /* standard dom */
  var scrollAmount: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  var scrollDelay: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  def start(): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def stop(): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  var trueSpeed: scala.Boolean = js.native
  
  /** @deprecated */
  /* standard dom */
  var vspace: Double = js.native
  
  /** @deprecated */
  /* standard dom */
  var width: java.lang.String = js.native
}
