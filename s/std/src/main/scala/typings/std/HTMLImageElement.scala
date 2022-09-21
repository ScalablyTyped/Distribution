package typings.std

import typings.std.stdStrings.`lazy`
import typings.std.stdStrings.async
import typings.std.stdStrings.auto
import typings.std.stdStrings.eager
import typings.std.stdStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods for manipulating <img> elements. */
@js.native
trait HTMLImageElement
  extends StObject
     with HTMLElement
     with HTMLOrSVGImageElement
     with TexImageSource {
  
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
  
  /** Sets or retrieves a text alternative to the graphic. */
  /* standard dom */
  var alt: java.lang.String = js.native
  
  /**
    * Specifies the properties of a border drawn around an object.
    * @deprecated
    */
  /* standard dom */
  var border: java.lang.String = js.native
  
  /** Retrieves whether the object is fully loaded. */
  /* standard dom */
  val complete: scala.Boolean = js.native
  
  /* standard dom */
  var crossOrigin: java.lang.String | Null = js.native
  
  /* standard dom */
  val currentSrc: java.lang.String = js.native
  
  /* standard dom */
  def decode(): js.Promise[Unit] = js.native
  
  /* standard dom */
  var decoding: async | sync | auto = js.native
  
  /** Sets or retrieves the height of the object. */
  /* standard dom */
  var height: Double = js.native
  
  /**
    * Sets or retrieves the width of the border to draw around the object.
    * @deprecated
    */
  /* standard dom */
  var hspace: Double = js.native
  
  /** Sets or retrieves whether the image is a server-side image map. */
  /* standard dom */
  var isMap: scala.Boolean = js.native
  
  /** Sets or retrieves the policy for loading image elements that are outside the viewport. */
  /* standard dom */
  var loading: eager | `lazy` = js.native
  
  /**
    * Sets or retrieves a Uniform Resource Identifier (URI) to a long description of the object.
    * @deprecated
    */
  /* standard dom */
  var longDesc: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var lowsrc: java.lang.String = js.native
  
  /**
    * Sets or retrieves the name of the object.
    * @deprecated
    */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /** The original height of the image resource before sizing. */
  /* standard dom */
  val naturalHeight: Double = js.native
  
  /** The original width of the image resource before sizing. */
  /* standard dom */
  val naturalWidth: Double = js.native
  
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
  
  /* standard dom */
  var sizes: java.lang.String = js.native
  
  /** The address or URL of the a media resource that is to be considered. */
  /* standard dom */
  var src: java.lang.String = js.native
  
  /* standard dom */
  var srcset: java.lang.String = js.native
  
  /** Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map. */
  /* standard dom */
  var useMap: java.lang.String = js.native
  
  /**
    * Sets or retrieves the vertical margin for the object.
    * @deprecated
    */
  /* standard dom */
  var vspace: Double = js.native
  
  /** Sets or retrieves the width of the object. */
  /* standard dom */
  var width: Double = js.native
  
  /* standard dom */
  val x: Double = js.native
  
  /* standard dom */
  val y: Double = js.native
}
