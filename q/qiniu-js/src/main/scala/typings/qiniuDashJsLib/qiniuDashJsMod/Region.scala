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
  
  val as0: as0 with java.lang.String = js.native
  val na0: na0 with java.lang.String = js.native
  val z0: z0 with java.lang.String = js.native
  val z1: z1 with java.lang.String = js.native
  val z2: z2 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[qiniuDashJsLib.qiniuDashJsMod.Region with java.lang.String] = js.native
}

