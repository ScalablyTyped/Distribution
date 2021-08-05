package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Shaders {
  
  @JSImport("seen", "Shaders")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ambient(): Ambient = ^.asInstanceOf[js.Dynamic].applyDynamic("ambient")().asInstanceOf[Ambient]
  
  inline def diffuse(): DiffusePhong = ^.asInstanceOf[js.Dynamic].applyDynamic("diffuse")().asInstanceOf[DiffusePhong]
  
  inline def flat(): Flat = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")().asInstanceOf[Flat]
  
  inline def phong(): Phong = ^.asInstanceOf[js.Dynamic].applyDynamic("phong")().asInstanceOf[Phong]
}
