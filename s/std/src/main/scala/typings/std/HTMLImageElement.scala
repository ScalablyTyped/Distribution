package typings.std

import typings.std.stdStrings.async
import typings.std.stdStrings.auto
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
    * Sets or retrieves how the object is aligned with adjacent text.
    */
  /** @deprecated */
  var align: java.lang.String = js.native
  
  /**
    * Sets or retrieves a text alternative to the graphic.
    */
  var alt: java.lang.String = js.native
  
  /**
    * Specifies the properties of a border drawn around an object.
    */
  /** @deprecated */
  var border: java.lang.String = js.native
  
  /**
    * Retrieves whether the object is fully loaded.
    */
  val complete: scala.Boolean = js.native
  
  var crossOrigin: java.lang.String | Null = js.native
  
  val currentSrc: java.lang.String = js.native
  
  def decode(): js.Promise[Unit] = js.native
  
  var decoding: async | sync | auto = js.native
  
  /**
    * Sets or retrieves the height of the object.
    */
  var height: Double = js.native
  
  /**
    * Sets or retrieves the width of the border to draw around the object.
    */
  /** @deprecated */
  var hspace: Double = js.native
  
  /**
    * Sets or retrieves whether the image is a server-side image map.
    */
  var isMap: scala.Boolean = js.native
  
  var loading: java.lang.String = js.native
  
  /**
    * Sets or retrieves a Uniform Resource Identifier (URI) to a long description of the object.
    */
  /** @deprecated */
  var longDesc: java.lang.String = js.native
  
  /** @deprecated */
  var lowsrc: java.lang.String = js.native
  
  /**
    * Sets or retrieves the name of the object.
    */
  /** @deprecated */
  var name: java.lang.String = js.native
  
  /**
    * The original height of the image resource before sizing.
    */
  val naturalHeight: Double = js.native
  
  /**
    * The original width of the image resource before sizing.
    */
  val naturalWidth: Double = js.native
  
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
  
  var sizes: java.lang.String = js.native
  
  /**
    * The address or URL of the a media resource that is to be considered.
    */
  var src: java.lang.String = js.native
  
  var srcset: java.lang.String = js.native
  
  /**
    * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
    */
  var useMap: java.lang.String = js.native
  
  /**
    * Sets or retrieves the vertical margin for the object.
    */
  /** @deprecated */
  var vspace: Double = js.native
  
  /**
    * Sets or retrieves the width of the object.
    */
  var width: Double = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
}
