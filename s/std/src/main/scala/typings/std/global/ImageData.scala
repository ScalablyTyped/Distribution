package typings.std.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ImageData")
@js.native
class ImageData protected ()
  extends typings.std.ImageData {
  def this(data: typings.std.Uint8ClampedArray, sw: Double) = this()
  def this(sw: Double, sh: Double) = this()
  def this(data: typings.std.Uint8ClampedArray, sw: Double, sh: Double) = this()
}
@JSGlobal("ImageData")
@js.native
object ImageData
  extends Instantiable2[
      (/* sw */ Double) | (/* data */ typings.std.Uint8ClampedArray), 
      /* sw */ Double, 
      typings.std.ImageData
    ]
     with Instantiable3[
      /* data */ typings.std.Uint8ClampedArray, 
      /* sw */ Double, 
      /* sh */ Double, 
      typings.std.ImageData
    ]
