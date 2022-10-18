package typings.ssimJs

import typings.ssimJs.distTypesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabTransposeMod {
  
  @JSImport("ssim.js/dist/matlab/transpose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transpose(hasRefWidthHeight: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(hasRefWidthHeight.asInstanceOf[js.Any]).asInstanceOf[Matrix]
}
