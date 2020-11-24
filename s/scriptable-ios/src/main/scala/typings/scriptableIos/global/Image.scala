package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Manages image data._
  * @see https://docs.scriptable.app/image
  */
@JSGlobal("Image")
@js.native
class Image ()
  extends typings.scriptableIos.Image
/* static members */
@JSGlobal("Image")
@js.native
object Image extends js.Object {
  
  /**
    * _Creates an image from raw data._
    *
    * Loads an image from the raw data. If the image could not be read, the function will return null.
    * @param data - Data to read image from.
    * @see https://docs.scriptable.app/image/#fromdata
    */
  def fromData(data: typings.scriptableIos.Data): typings.scriptableIos.Image = js.native
  
  /**
    * _Creates an image from file._
    *
    * Loads an image from the specified file path. If the image could not be read, the function will return null.
    * @param filePath - File path to read image from.
    * @see https://docs.scriptable.app/image/#fromfile
    */
  def fromFile(filePath: String): typings.scriptableIos.Image = js.native
}
