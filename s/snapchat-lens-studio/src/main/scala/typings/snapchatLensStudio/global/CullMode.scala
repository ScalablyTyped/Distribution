package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used with Pass’s cullMode property. Determines which faces of a surface are culled (not rendered). */
@JSGlobal("CullMode")
@js.native
object CullMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.CullMode & Double] = js.native
  
  /* 1 */ val Back: typings.snapchatLensStudio.CullMode.Back & Double = js.native
  
  /* 0 */ val Front: typings.snapchatLensStudio.CullMode.Front & Double = js.native
  
  /* 2 */ val FrontAndBack: typings.snapchatLensStudio.CullMode.FrontAndBack & Double = js.native
}
