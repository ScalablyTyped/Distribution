package typings.sharepoint.SP

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
  
  /* 5 */ val administrator: typings.sharepoint.SP.RoleType.administrator with Double = js.native
  /* 3 */ val contributor: typings.sharepoint.SP.RoleType.contributor with Double = js.native
  /* 6 */ val editor: typings.sharepoint.SP.RoleType.editor with Double = js.native
  /* 1 */ val guest: typings.sharepoint.SP.RoleType.guest with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.RoleType.none with Double = js.native
  /* 2 */ val reader: typings.sharepoint.SP.RoleType.reader with Double = js.native
  /* 4 */ val webDesigner: typings.sharepoint.SP.RoleType.webDesigner with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoleType with Double] = js.native
}

