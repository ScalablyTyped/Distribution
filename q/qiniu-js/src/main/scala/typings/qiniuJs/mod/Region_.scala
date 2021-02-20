package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Region_ extends StObject
@JSImport("qiniu-js", "Region")
@js.native
object Region_ extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Region_ with Double] = js.native
  
  // 代表北美区域
  @js.native
  sealed trait as0 extends Region_
  /* 4 */ val as0: typings.qiniuJs.mod.Region_.as0 with Double = js.native
  
  // 代表华南区域
  @js.native
  sealed trait na0 extends Region_
  /* 3 */ val na0: typings.qiniuJs.mod.Region_.na0 with Double = js.native
  
  @js.native
  sealed trait z0 extends Region_
  /* 0 */ val z0: typings.qiniuJs.mod.Region_.z0 with Double = js.native
  
  // 代表华东区域
  @js.native
  sealed trait z1 extends Region_
  /* 1 */ val z1: typings.qiniuJs.mod.Region_.z1 with Double = js.native
  
  // 代表华北区域
  @js.native
  sealed trait z2 extends Region_
  /* 2 */ val z2: typings.qiniuJs.mod.Region_.z2 with Double = js.native
}
