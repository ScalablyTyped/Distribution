package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Colorspace extends StObject
/** Data type used for color values. */
@JSGlobal("Colorspace")
@js.native
object Colorspace extends StObject {
  
  @js.native
  sealed trait R
    extends StObject
       with Colorspace
  
  @js.native
  sealed trait RG
    extends StObject
       with Colorspace
  
  @js.native
  sealed trait RGBA
    extends StObject
       with Colorspace
}
