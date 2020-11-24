package typings.proj4leaflet.mod.leafletAugmentingMod.Proj

import typings.leaflet.mod.Projection
import typings.leaflet.mod.Transformation
import typings.proj4.mod.InterfaceProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Proj.CRS")
@js.native
class CRS protected ()
  extends typings.leaflet.mod.CRS {
  def this(projection: InterfaceProjection) = this()
  def this(code: String, proj4def: String) = this()
  def this(projection: InterfaceProjection, options: ProjCRSOptions) = this()
  def this(code: String, proj4def: String, options: ProjCRSOptions) = this()
  
  var projection: Projection = js.native
  
  var transformation: Transformation = js.native
}
