package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Lights {
  
  @JSImport("seen", "Lights")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ambient(): Light = ^.asInstanceOf[js.Dynamic].applyDynamic("ambient")().asInstanceOf[Light]
  @scala.inline
  def ambient(opts: LightOptions): Light = ^.asInstanceOf[js.Dynamic].applyDynamic("ambient")(opts.asInstanceOf[js.Any]).asInstanceOf[Light]
  
  @scala.inline
  def directional(): Light = ^.asInstanceOf[js.Dynamic].applyDynamic("directional")().asInstanceOf[Light]
  @scala.inline
  def directional(opts: LightOptions): Light = ^.asInstanceOf[js.Dynamic].applyDynamic("directional")(opts.asInstanceOf[js.Any]).asInstanceOf[Light]
  
  @scala.inline
  def point(): Light = ^.asInstanceOf[js.Dynamic].applyDynamic("point")().asInstanceOf[Light]
  @scala.inline
  def point(opts: LightOptions): Light = ^.asInstanceOf[js.Dynamic].applyDynamic("point")(opts.asInstanceOf[js.Any]).asInstanceOf[Light]
}
