package typings.reactFileUtils

import typings.reactFileUtils.mod.UploadState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactFileUtilsStrings {
  
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @scala.inline
  def finished: finished = "finished".asInstanceOf[finished]
  
  @scala.inline
  def uploading: uploading = "uploading".asInstanceOf[uploading]
  
  @js.native
  sealed trait failed extends UploadState
  
  @js.native
  sealed trait finished extends UploadState
  
  @js.native
  sealed trait uploading extends UploadState
}
