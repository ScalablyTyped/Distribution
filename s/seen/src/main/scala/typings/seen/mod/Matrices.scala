package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Matrices {
  
  @JSImport("seen", "Matrices")
  @js.native
  val ^ : js.Any = js.native
  
  inline def flipX(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("flipX")().asInstanceOf[Matrix]
  
  inline def flipY(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("flipY")().asInstanceOf[Matrix]
  
  inline def flipZ(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("flipZ")().asInstanceOf[Matrix]
  
  inline def identity(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")().asInstanceOf[Matrix]
}
