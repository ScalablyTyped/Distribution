package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Region extends js.Object

@JSImport("qiniu-js", "Region")
@js.native
object Region extends js.Object {
  @js.native
  sealed trait as0
    extends qiniuDashJsLib.qiniuDashJsMod.Region
  
  		// 代表北美区域
  @js.native
  sealed trait na0
    extends qiniuDashJsLib.qiniuDashJsMod.Region
  
  	// 代表华东区域
  @js.native
  sealed trait z0
    extends qiniuDashJsLib.qiniuDashJsMod.Region
  
  		// 代表华北区域
  @js.native
  sealed trait z1
    extends qiniuDashJsLib.qiniuDashJsMod.Region
  
  		// 代表华南区域
  @js.native
  sealed trait z2
    extends qiniuDashJsLib.qiniuDashJsMod.Region
  
  /* 4 */ val as0: as0 with scala.Double = js.native
  /* 3 */ val na0: na0 with scala.Double = js.native
  /* 0 */ val z0: z0 with scala.Double = js.native
  /* 1 */ val z1: z1 with scala.Double = js.native
  /* 2 */ val z2: z2 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[qiniuDashJsLib.qiniuDashJsMod.Region with scala.Double] = js.native
}

