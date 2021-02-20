package typings.ssimJs

import typings.ssimJs.typesMod.Matrix
import typings.ssimJs.typesMod.Shape
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv2Mod {
  
  @JSImport("ssim.js/dist/matlab/conv2", "conv2")
  @js.native
  def conv2(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof boxConv | typeof convn | typeof mxConv2> is not an array type */ args: Parameters[
      (js.Function3[/* a */ Matrix, /* hasDataWidthHeight */ Matrix, js.UndefOr[Shape], Matrix]) | (js.Function4[/* a */ Matrix, /* b1 */ Matrix, /* b2 */ Matrix, /* shape */ js.UndefOr[Shape], Matrix])
    ]
  ): Matrix = js.native
}
