package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an audio clip optimized for streaming playback.
  */
@JSGlobal("Sound")
@js.native
open class Sound protected ()
  extends StObject
     with typings.sphereEngineBrowser.Sound {
  /**
    * Construct a `Sound` that can be used to play back the given audio file. The sound can be used
    * immediately, but playback may be silent until enough audio data has been buffered.
    * @param fileName SphereFS path of an audio file.
    */
  def this(fileName: String) = this()
}
object Sound {
  
  @JSGlobal("Sound")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Open an audio file in the background and construct a `Sound` that can be used to play it.
    * @async
    * @param fileName SphereFS path of an audio file.
    * @returns A promise for the newly constructed `Sound`.
    */
  /* static member */
  inline def fromFile(fileName: String): js.Promise[typings.sphereEngineBrowser.Sound] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(fileName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.sphereEngineBrowser.Sound]]
}
