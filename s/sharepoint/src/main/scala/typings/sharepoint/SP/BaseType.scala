package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BaseType extends js.Object

/** Specifies the base type for a list. */
@JSGlobal("SP.BaseType")
@js.native
object BaseType extends js.Object {
  @js.native
  sealed trait discussionBoard extends BaseType
  
  @js.native
  sealed trait documentLibrary extends BaseType
  
  @js.native
  sealed trait genericList extends BaseType
  
  @js.native
  sealed trait issue extends BaseType
  
  @js.native
  sealed trait none extends BaseType
  
  @js.native
  sealed trait survey extends BaseType
  
  @js.native
  sealed trait unused extends BaseType
  
}

