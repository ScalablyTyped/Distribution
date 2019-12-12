package typings.qiniuDashJs.qiniuDashJsMod

import org.scalablytyped.runtime.TopLevel
import typings.qiniuDashJs.qiniuDashJsMod.Region.as0
import typings.qiniuDashJs.qiniuDashJsMod.Region.na0
import typings.qiniuDashJs.qiniuDashJsMod.Region.z0
import typings.qiniuDashJs.qiniuDashJsMod.Region.z1
import typings.qiniuDashJs.qiniuDashJsMod.Region.z2
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Region with Double] = js.native
  /* 4 */ @js.native
  object as0 extends TopLevel[as0 with Double]
  
  /* 3 */ @js.native
  object na0 extends TopLevel[na0 with Double]
  
  /* 0 */ @js.native
  object z0 extends TopLevel[z0 with Double]
  
  /* 1 */ @js.native
  object z1 extends TopLevel[z1 with Double]
  
  /* 2 */ @js.native
  object z2 extends TopLevel[z2 with Double]
  
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

