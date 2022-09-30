package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an audio clip optimized for regular, repeated playback.
  */
@JSGlobal("Sample")
@js.native
open class Sample protected ()
  extends StObject
     with typings.sphereEngineBrowser.Sample {
  /**
    * Construct a new sample from the contents of an audio file. The sample can be used
    * immediately; playback will be silent until the file is fully loaded.
    * @param fileName SphereFS path of an audio file.
    */
  def this(fileName: String) = this()
}
object Sample {
  
  @JSGlobal("Sample")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Load an audio file in the background and construct a new sample from its contents.
    * @async
    * @param fileName SphereFS path of an audio file.
    * @returns A promise for the newly constructed `Sample`.
    */
  /* static member */
  inline def fromFile(fileName: String): js.Promise[typings.sphereEngineBrowser.Sample] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(fileName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.sphereEngineBrowser.Sample]]
}
