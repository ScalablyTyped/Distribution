package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttachmentPointType extends StObject
/** Used by Head.setAttachmentPointType() to specify the type of attachment used with a Head binding. */
@JSGlobal("AttachmentPointType")
@js.native
object AttachmentPointType extends StObject {
  
  @js.native
  sealed trait CandideCenter
    extends StObject
       with AttachmentPointType
  
  @js.native
  sealed trait HeadCenter
    extends StObject
       with AttachmentPointType
  
  @js.native
  sealed trait LeftEyeballCenter
    extends StObject
       with AttachmentPointType
  
  @js.native
  sealed trait RightEyeballCenter
    extends StObject
       with AttachmentPointType
  
  @js.native
  sealed trait TriangleBarycentric
    extends StObject
       with AttachmentPointType
}
