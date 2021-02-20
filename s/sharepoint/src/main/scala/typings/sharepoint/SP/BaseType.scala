package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BaseType extends StObject
/** Specifies the base type for a list. */
@JSGlobal("SP.BaseType")
@js.native
object BaseType extends StObject {
  
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
