package typings.sphereEngineBrowser.global

import typings.sphereEngineBrowser.DirectoryStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a means for enumerating the contents of a directory (files and subdirectories).
  */
@JSGlobal("DirectoryStream")
@js.native
open class DirectoryStream protected ()
  extends StObject
     with typings.sphereEngineBrowser.DirectoryStream {
  /**
    * Construct a new `DirectoryStream` for a specified directory.
    * @param directoryName SphereFS path to the directory whose contents will be enumerated.
    * @param options       Options for creating the new directory stream.
    */
  def this(directoryName: String) = this()
  def this(directoryName: String, options: DirectoryStreamOptions) = this()
}
