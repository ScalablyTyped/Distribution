package typings.std

import typings.std.stdStrings.loading
import typings.std.stdStrings.loadingdone
import typings.std.stdStrings.loadingerror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet) */
@js.native
trait FontFaceSet
  extends StObject
     with EventTarget
     with Set[FontFace] {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_loading(`type`: loading, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loading(
    `type`: loading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loading(
    `type`: loading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadingdone(`type`: loadingdone, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadingdone(
    `type`: loadingdone,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadingdone(
    `type`: loadingdone,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadingerror(`type`: loadingerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadingerror(
    `type`: loadingerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadingerror(
    `type`: loadingerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/check) */
  /* standard dom */
  def check(font: java.lang.String): scala.Boolean = js.native
  def check(font: java.lang.String, text: java.lang.String): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/load) */
  /* standard dom */
  def load(font: java.lang.String): js.Promise[js.Array[FontFace]] = js.native
  def load(font: java.lang.String, text: java.lang.String): js.Promise[js.Array[FontFace]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loading_event) */
  /* standard dom */
  var onloading: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingdone_event) */
  /* standard dom */
  var onloadingdone: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/loadingerror_event) */
  /* standard dom */
  var onloadingerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/ready) */
  /* standard dom */
  val ready: js.Promise[FontFaceSet] = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_loading(`type`: loading, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loading(
    `type`: loading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loading(
    `type`: loading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadingdone(`type`: loadingdone, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadingdone(
    `type`: loadingdone,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadingdone(
    `type`: loadingdone,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadingerror(`type`: loadingerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadingerror(
    `type`: loadingerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadingerror(
    `type`: loadingerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FontFaceSet/status) */
  /* standard dom */
  val status: FontFaceSetLoadStatus = js.native
}
