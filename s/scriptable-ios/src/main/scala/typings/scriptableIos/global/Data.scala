package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Raw data representation._
  * @see https://docs.scriptable.app/data
  */
@JSGlobal("Data")
@js.native
class Data ()
  extends typings.scriptableIos.Data

/* static members */
@JSGlobal("Data")
@js.native
object Data extends js.Object {
  /**
    * _Creates data from base 64 encoded string._
    *
    * The supplied string must be base 64 encoded otherwise the function will return null.
    * @param base64String - Base 64 encoded string to create data from.
    * @see https://docs.scriptable.app/data/#frombase64string
    */
  def fromBase64String(base64String: String): typings.scriptableIos.Data = js.native
  /**
    * _Reads data from file path._
    *
    * Reads the raw data of the file at the specified file path.
    * @param filePath - Path of file to read data from.
    * @see https://docs.scriptable.app/data/#fromfile
    */
  def fromFile(filePath: String): typings.scriptableIos.Data = js.native
  /**
    * _Creates data from JPEG image._
    * @param image - JPEG image to convert to data.
    * @see https://docs.scriptable.app/data/#fromjpeg
    */
  def fromJPEG(image: typings.scriptableIos.Image): typings.scriptableIos.Data = js.native
  /**
    * _Creates data from PNG image._
    * @param image - PNG image to convert to data.
    * @see https://docs.scriptable.app/data/#frompng
    */
  def fromPNG(image: typings.scriptableIos.Image): typings.scriptableIos.Data = js.native
  /**
    * _Creates data from string._
    *
    * The provided string is assumed to be UTF8 encoded. If the string is not UTF8 encoded, the function will return null.
    * @param string - String to create data from.
    * @see https://docs.scriptable.app/data/#fromstring
    */
  def fromString(string: String): typings.scriptableIos.Data = js.native
}

