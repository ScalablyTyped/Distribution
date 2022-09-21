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
  
  /* standard dom */
  /* CompleteClass */
  var album: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var artist: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var artwork: js.Array[MediaImage] = js.native
  
  /* standard dom */
  /* CompleteClass */
  var title: java.lang.String = js.native
}
