package typings.streamifyArray

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Converts an array into a Node readable stream.
    * Elements get removed from the array when they are read from the stream.
    */
  @scala.inline
  def apply(input: js.Array[js.Any]): Readable = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Readable]
  
  @JSImport("streamify-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
