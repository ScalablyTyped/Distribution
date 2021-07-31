package typings.reactEmailEditor.mod

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileInfo extends StObject {
  
  val accepted: js.Array[File]
  
  val attachments: js.Array[File]
}
object FileInfo {
  
  @scala.inline
  def apply(accepted: js.Array[File], attachments: js.Array[File]): FileInfo = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
  
  @scala.inline
  implicit class FileInfoMutableBuilder[Self <: FileInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepted(value: js.Array[File]): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptedVarargs(value: File*): Self = StObject.set(x, "accepted", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[File]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: File*): Self = StObject.set(x, "attachments", js.Array(value :_*))
  }
}
