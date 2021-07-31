package typings.reactFileUtils

import typings.reactFileUtils.mod.UploadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactFileUtilsStrings {
  
  @js.native
  sealed trait failed
    extends StObject
       with UploadState
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait finished
    extends StObject
       with UploadState
  @scala.inline
  def finished: finished = "finished".asInstanceOf[finished]
  
  @js.native
  sealed trait uploading
    extends StObject
       with UploadState
  @scala.inline
  def uploading: uploading = "uploading".asInstanceOf[uploading]
}
