package typings.std.global

import typings.std.MediaImage
import typings.std.MediaMetadataInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaMetadata")
@js.native
/* standard dom */
open class MediaMetadata ()
  extends StObject
     with typings.std.MediaMetadata {
  def this(init: MediaMetadataInit) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/album) */
  /* standard dom */
  /* CompleteClass */
  var album: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/artist) */
  /* standard dom */
  /* CompleteClass */
  var artist: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/artwork) */
  /* standard dom */
  /* CompleteClass */
  var artwork: js.Array[MediaImage] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaMetadata/title) */
  /* standard dom */
  /* CompleteClass */
  var title: java.lang.String = js.native
}
