package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.RoleType.administrator
import typings.sharepoint.SP.RoleType.contributor
import typings.sharepoint.SP.RoleType.editor
import typings.sharepoint.SP.RoleType.guest
import typings.sharepoint.SP.RoleType.none
import typings.sharepoint.SP.RoleType.reader
import typings.sharepoint.SP.RoleType.webDesigner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoleType extends js.Object

@JSGlobal("SP.RoleType")
@js.native
object RoleType extends js.Object {
  @js.native
  sealed trait administrator extends RoleType
  
  @js.native
  sealed trait contributor extends RoleType
  
  @js.native
  sealed trait editor extends RoleType
  
  @js.native
  sealed trait guest extends RoleType
  
  @js.native
  sealed trait none extends RoleType
  
  @js.native
  sealed trait reader extends RoleType
  
  @js.native
  sealed trait webDesigner extends RoleType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoleType with Double] = js.native
  /* 5 */ @js.native
  object administrator extends TopLevel[administrator with Double]
  
  /* 3 */ @js.native
  object contributor extends TopLevel[contributor with Double]
  
  /* 6 */ @js.native
  object editor extends TopLevel[editor with Double]
  
  /* 1 */ @js.native
  object guest extends TopLevel[guest with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object reader extends TopLevel[reader with Double]
  
  /* 4 */ @js.native
  object webDesigner extends TopLevel[webDesigner with Double]
  
}

