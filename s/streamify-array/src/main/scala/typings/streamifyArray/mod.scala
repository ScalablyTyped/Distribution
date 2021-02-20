package typings.streamifyArray

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Converts an array into a Node readable stream.
    * Elements get removed from the array when they are read from the stream.
    */
  @JSImport("streamify-array", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[_]): Readable = js.native
}
