package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.FileLevel.checkout
import typings.sharepoint.SP.FileLevel.draft
import typings.sharepoint.SP.FileLevel.published
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileLevel extends js.Object

@JSGlobal("SP.FileLevel")
@js.native
object FileLevel extends js.Object {
  @js.native
  sealed trait checkout extends FileLevel
  
  @js.native
  sealed trait draft extends FileLevel
  
  @js.native
  sealed trait published extends FileLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileLevel with Double] = js.native
  /* 2 */ @js.native
  object checkout extends TopLevel[checkout with Double]
  
  /* 1 */ @js.native
  object draft extends TopLevel[draft with Double]
  
  /* 0 */ @js.native
  object published extends TopLevel[published with Double]
  
}

