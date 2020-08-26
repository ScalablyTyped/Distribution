package typings.reactNativeFirebase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CACHESDIRECTORYPATH extends js.Object {
  var CACHES_DIRECTORY_PATH: String = js.native
  var DOCUMENT_DIRECTORY_PATH: String = js.native
  var EXTERNAL_DIRECTORY_PATH: String = js.native
  var EXTERNAL_STORAGE_DIRECTORY_PATH: String = js.native
  var FILETYPE_DIRECTORY: String = js.native
  var FILETYPE_REGULAR: String = js.native
  var LIBRARY_DIRECTORY_PATH: String = js.native
  var MAIN_BUNDLE_PATH: String = js.native
  var TEMP_DIRECTORY_PATH: String = js.native
}

object CACHESDIRECTORYPATH {
  @scala.inline
  def apply(
    CACHES_DIRECTORY_PATH: String,
    DOCUMENT_DIRECTORY_PATH: String,
    EXTERNAL_DIRECTORY_PATH: String,
    EXTERNAL_STORAGE_DIRECTORY_PATH: String,
    FILETYPE_DIRECTORY: String,
    FILETYPE_REGULAR: String,
    LIBRARY_DIRECTORY_PATH: String,
    MAIN_BUNDLE_PATH: String,
    TEMP_DIRECTORY_PATH: String
  ): CACHESDIRECTORYPATH = {
    val __obj = js.Dynamic.literal(CACHES_DIRECTORY_PATH = CACHES_DIRECTORY_PATH.asInstanceOf[js.Any], DOCUMENT_DIRECTORY_PATH = DOCUMENT_DIRECTORY_PATH.asInstanceOf[js.Any], EXTERNAL_DIRECTORY_PATH = EXTERNAL_DIRECTORY_PATH.asInstanceOf[js.Any], EXTERNAL_STORAGE_DIRECTORY_PATH = EXTERNAL_STORAGE_DIRECTORY_PATH.asInstanceOf[js.Any], FILETYPE_DIRECTORY = FILETYPE_DIRECTORY.asInstanceOf[js.Any], FILETYPE_REGULAR = FILETYPE_REGULAR.asInstanceOf[js.Any], LIBRARY_DIRECTORY_PATH = LIBRARY_DIRECTORY_PATH.asInstanceOf[js.Any], MAIN_BUNDLE_PATH = MAIN_BUNDLE_PATH.asInstanceOf[js.Any], TEMP_DIRECTORY_PATH = TEMP_DIRECTORY_PATH.asInstanceOf[js.Any])
    __obj.asInstanceOf[CACHESDIRECTORYPATH]
  }
  @scala.inline
  implicit class CACHESDIRECTORYPATHOps[Self <: CACHESDIRECTORYPATH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCACHES_DIRECTORY_PATH(value: String): Self = this.set("CACHES_DIRECTORY_PATH", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOCUMENT_DIRECTORY_PATH(value: String): Self = this.set("DOCUMENT_DIRECTORY_PATH", value.asInstanceOf[js.Any])
    @scala.inline
    def setEXTERNAL_DIRECTORY_PATH(value: String): Self = this.set("EXTERNAL_DIRECTORY_PATH", value.asInstanceOf[js.Any])
    @scala.inline
    def setEXTERNAL_STORAGE_DIRECTORY_PATH(value: String): Self = this.set("EXTERNAL_STORAGE_DIRECTORY_PATH", value.asInstanceOf[js.Any])
    @scala.inline
    def setFILETYPE_DIRECTORY(value: String): Self = this.set("FILETYPE_DIRECTORY", value.asInstanceOf[js.Any])
    @scala.inline
    def setFILETYPE_REGULAR(value: String): Self = this.set("FILETYPE_REGULAR", value.asInstanceOf[js.Any])
    @scala.inline
    def setLIBRARY_DIRECTORY_PATH(value: String): Self = this.set("LIBRARY_DIRECTORY_PATH", value.asInstanceOf[js.Any])
    @scala.inline
    def setMAIN_BUNDLE_PATH(value: String): Self = this.set("MAIN_BUNDLE_PATH", value.asInstanceOf[js.Any])
    @scala.inline
    def setTEMP_DIRECTORY_PATH(value: String): Self = this.set("TEMP_DIRECTORY_PATH", value.asInstanceOf[js.Any])
  }
  
}

