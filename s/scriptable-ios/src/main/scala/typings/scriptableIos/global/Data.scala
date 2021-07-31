package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Raw data representation._
  * @see https://docs.scriptable.app/data
  */
@JSGlobal("Data")
@js.native
class Data ()
  extends StObject
     with typings.scriptableIos.Data {
  
  /**
    * _Gets bytes from data._
    * @see https://docs.scriptable.app/data/#-getbytes
    */
  /* CompleteClass */
  override def getBytes(): js.Array[Double] = js.native
  
  /**
    * _Creates a base64 encoded string._
    *
    * Creates a base64 encoded string from the data.
    * @see https://docs.scriptable.app/data/#-tobase64string
    */
  /* CompleteClass */
  override def toBase64String(): String = js.native
  
  /**
    * _Creates a string from the data._
    *
    * The data is assumed to represent a UTF8 encoded string. If the string is not UTF8 encoded string, the function will return null.
    * @see https://docs.scriptable.app/data/#-torawstring
    */
  /* CompleteClass */
  override def toRawString(): String = js.native
}
object Data {
  
  @JSGlobal("Data")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Creates data from base64 encoded string._
    *
    * The supplied string must be base64 encoded otherwise the function will return null.
    * @param base64String - Base64 encoded string to create data from.
    * @see https://docs.scriptable.app/data/#frombase64string
    */
  /* static member */
  @scala.inline
  def fromBase64String(base64String: String): typings.scriptableIos.Data = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64String.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Data]
  
  /**
    * _Reads data from file path._
    *
    * Reads the raw data of the file at the specified file path.
    * @param filePath - Path of file to read data from.
    * @see https://docs.scriptable.app/data/#fromfile
    */
  /* static member */
  @scala.inline
  def fromFile(filePath: String): typings.scriptableIos.Data = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Data]
  
  /**
    * _Creates data from JPEG image._
    * @param image - JPEG image to convert to data.
    * @see https://docs.scriptable.app/data/#fromjpeg
    */
  /* static member */
  @scala.inline
  def fromJPEG(image: typings.scriptableIos.Image): typings.scriptableIos.Data = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJPEG")(image.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Data]
  
  /**
    * _Creates data from PNG image._
    * @param image - PNG image to convert to data.
    * @see https://docs.scriptable.app/data/#frompng
    */
  /* static member */
  @scala.inline
  def fromPNG(image: typings.scriptableIos.Image): typings.scriptableIos.Data = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPNG")(image.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Data]
  
  /**
    * _Creates data from string._
    *
    * The provided string is assumed to be UTF8 encoded. If the string is not UTF8 encoded, the function will return null.
    * @param string - String to create data from.
    * @see https://docs.scriptable.app/data/#fromstring
    */
  /* static member */
  @scala.inline
  def fromString(string: String): typings.scriptableIos.Data = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Data]
}
