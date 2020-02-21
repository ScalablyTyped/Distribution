package typings.sharepoint.CUI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImgContainerType extends js.Object

@JSGlobal("CUI.ImgContainerType")
@js.native
object ImgContainerType extends js.Object {
  @js.native
  sealed trait anchor extends ImgContainerType
  
  @js.native
  sealed trait div extends ImgContainerType
  
  @js.native
  sealed trait span extends ImgContainerType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImgContainerType with Double] = js.native
  /* 2 */ @js.native
  object anchor extends TopLevel[anchor with Double]
  
  /* 0 */ @js.native
  object div extends TopLevel[div with Double]
  
  /* 1 */ @js.native
  object span extends TopLevel[span with Double]
  
}

