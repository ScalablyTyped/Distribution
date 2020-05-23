package typings.qiniuJs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Region_ extends js.Object

@JSImport("qiniu-js", "Region")
@js.native
object Region_ extends js.Object {
  @js.native
  sealed trait as0 extends Region_
  
          // 代表北美区域
  @js.native
  sealed trait na0 extends Region_
  
      // 代表华东区域
  @js.native
  sealed trait z0 extends Region_
  
          // 代表华北区域
  @js.native
  sealed trait z1 extends Region_
  
          // 代表华南区域
  @js.native
  sealed trait z2 extends Region_
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Region_ with Double] = js.native
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

