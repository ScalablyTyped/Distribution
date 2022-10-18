package typings.ssimJs

import typings.ssimJs.distTypesMod.Matrix
import typings.ssimJs.distTypesMod.Shape
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMatlabConv2Mod {
  
  @JSImport("ssim.js/dist/matlab/conv2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof boxConv | typeof convn | typeof mxConv2> is not an array type */ args: Parameters[
      (js.Function3[/* a */ Matrix, /* hasDataWidthHeight */ Matrix, js.UndefOr[Shape], Matrix]) | (js.Function4[/* a */ Matrix, /* b1 */ Matrix, /* b2 */ Matrix, /* shape */ js.UndefOr[Shape], Matrix])
    ]
  ): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2")(args.asInstanceOf[js.Any]).asInstanceOf[Matrix]
}
