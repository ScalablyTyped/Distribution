package typings.sharp.mod

import typings.sharp.sharpStrings.bicubic
import typings.sharp.sharpStrings.bilinear
import typings.sharp.sharpStrings.lbb
import typings.sharp.sharpStrings.nearest
import typings.sharp.sharpStrings.nohalo
import typings.sharp.sharpStrings.vsqbs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interpolators_ extends StObject {
  
  /** [Bicubic interpolation](http://en.wikipedia.org/wiki/Bicubic_interpolation) (the default). */
  var bicubic: typings.sharp.sharpStrings.bicubic
  
  /** [Bilinear interpolation](http://en.wikipedia.org/wiki/Bilinear_interpolation). Faster than bicubic but with less smooth results. */
  var bilinear: typings.sharp.sharpStrings.bilinear
  
  /**
    * [LBB interpolation](https://github.com/libvips/libvips/blob/master/libvips/resample/lbb.cpp#L100).
    * Prevents some "[acutance](http://en.wikipedia.org/wiki/Acutance)" but typically reduces performance by a factor of 2.
    */
  var locallyBoundedBicubic: lbb
  
  /** [Nearest neighbour interpolation](http://en.wikipedia.org/wiki/Nearest-neighbor_interpolation). Suitable for image enlargement only. */
  var nearest: typings.sharp.sharpStrings.nearest
  
  /** [Nohalo interpolation](http://eprints.soton.ac.uk/268086/). Prevents acutance but typically reduces performance by a factor of 3. */
  var nohalo: typings.sharp.sharpStrings.nohalo
  
  /** [VSQBS interpolation](https://github.com/libvips/libvips/blob/master/libvips/resample/vsqbs.cpp#L48). Prevents "staircasing" when enlarging. */
  var vertexSplitQuadraticBasisSpline: vsqbs
}
object Interpolators_ {
  
  inline def apply(): Interpolators_ = {
    val __obj = js.Dynamic.literal(bicubic = "bicubic", bilinear = "bilinear", locallyBoundedBicubic = "lbb", nearest = "nearest", nohalo = "nohalo", vertexSplitQuadraticBasisSpline = "vsqbs")
    __obj.asInstanceOf[Interpolators_]
  }
  
  extension [Self <: Interpolators_](x: Self) {
    
    inline def setBicubic(value: bicubic): Self = StObject.set(x, "bicubic", value.asInstanceOf[js.Any])
    
    inline def setBilinear(value: bilinear): Self = StObject.set(x, "bilinear", value.asInstanceOf[js.Any])
    
    inline def setLocallyBoundedBicubic(value: lbb): Self = StObject.set(x, "locallyBoundedBicubic", value.asInstanceOf[js.Any])
    
    inline def setNearest(value: nearest): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
    
    inline def setNohalo(value: nohalo): Self = StObject.set(x, "nohalo", value.asInstanceOf[js.Any])
    
    inline def setVertexSplitQuadraticBasisSpline(value: vsqbs): Self = StObject.set(x, "vertexSplitQuadraticBasisSpline", value.asInstanceOf[js.Any])
  }
}
