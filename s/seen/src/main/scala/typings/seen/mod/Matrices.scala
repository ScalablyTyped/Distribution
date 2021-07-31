package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Matrices {
  
  @JSImport("seen", "Matrices")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def flipX(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("flipX")().asInstanceOf[Matrix]
  
  @scala.inline
  def flipY(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("flipY")().asInstanceOf[Matrix]
  
  @scala.inline
  def flipZ(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("flipZ")().asInstanceOf[Matrix]
  
  @scala.inline
  def identity(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")().asInstanceOf[Matrix]
}
