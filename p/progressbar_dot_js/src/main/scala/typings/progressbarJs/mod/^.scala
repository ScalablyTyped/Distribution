package typings.progressbarJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.progressbarJs.anon.Typeofutils
import typings.std.Element
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("progressbar.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var Circle: Instantiable0[typings.progressbarJs.circleMod.^] = js.native
  
  var Line: Instantiable0[typings.progressbarJs.lineMod.^] = js.native
  
  var Path: Instantiable2[
    /* path */ (/* import warning: RewrittenClass.unapply cls was tparam SElement */ js.Any) | String | Null, 
    /* options */ js.UndefOr[AnimationOptions], 
    typings.progressbarJs.pathMod.^[Element]
  ] = js.native
  
  var SemiCircle: Instantiable0[typings.progressbarJs.semicircleMod.^] = js.native
  
  var Shape: Instantiable2[
    /* container */ SVGPathElement | String | Null, 
    /* opts */ js.UndefOr[PathDrawingOptions], 
    typings.progressbarJs.shapeMod.^
  ] = js.native
  
  var Square: Instantiable0[typings.progressbarJs.squareMod.^] = js.native
  
  var utils: Typeofutils = js.native
}
