package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CullMode extends StObject
/** Used with Pass’s cullMode property. Determines which faces of a surface are culled (not rendered). */
@JSGlobal("CullMode")
@js.native
object CullMode extends StObject {
  
  /** Back facing surfaces are not rendered. */
  @js.native
  sealed trait Back
    extends StObject
       with CullMode
  
  /** Front facing surfaces are not rendered. */
  @js.native
  sealed trait Front
    extends StObject
       with CullMode
  
  /** Neither front facing nor back facing surfaces are rendered. */
  @js.native
  sealed trait FrontAndBack
    extends StObject
       with CullMode
}
