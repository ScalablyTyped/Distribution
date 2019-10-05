package typings.qiniuDashJs.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Region extends js.Object

@JSImport("qiniu-js", "Region")
@js.native
object Region extends js.Object {
  @js.native
  sealed trait as0 extends Region
  
  		// 代表北美区域
  @js.native
  sealed trait na0 extends Region
  
  	// 代表华东区域
  @js.native
  sealed trait z0 extends Region
  
  		// 代表华北区域
  @js.native
  sealed trait z1 extends Region
  
  		// 代表华南区域
  @js.native
  sealed trait z2 extends Region
  
  /* 4 */ val as0: typings.qiniuDashJs.qiniuDashJsMod.Region.as0 with Double = js.native
  /* 3 */ val na0: typings.qiniuDashJs.qiniuDashJsMod.Region.na0 with Double = js.native
  /* 0 */ val z0: typings.qiniuDashJs.qiniuDashJsMod.Region.z0 with Double = js.native
  /* 1 */ val z1: typings.qiniuDashJs.qiniuDashJsMod.Region.z1 with Double = js.native
  /* 2 */ val z2: typings.qiniuDashJs.qiniuDashJsMod.Region.z2 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Region with Double] = js.native
}

@JSImport("qiniu-js", "region")
@js.native
object region extends js.Object {
  val as0: Region = js.native
  val na0: Region = js.native
  val z0: Region = js.native
  val z1: Region = js.native
  val z2: Region = js.native
}

