package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BaseType extends StObject
/** Specifies the base type for a list. */
@JSGlobal("SP.BaseType")
@js.native
object BaseType extends StObject {
  
  @js.native
  sealed trait discussionBoard
    extends StObject
       with BaseType
  
  @js.native
  sealed trait documentLibrary
    extends StObject
       with BaseType
  
  @js.native
  sealed trait genericList
    extends StObject
       with BaseType
  
  @js.native
  sealed trait issue
    extends StObject
       with BaseType
  
  @js.native
  sealed trait none
    extends StObject
       with BaseType
  
  @js.native
  sealed trait survey
    extends StObject
       with BaseType
  
  @js.native
  sealed trait unused
    extends StObject
       with BaseType
}
