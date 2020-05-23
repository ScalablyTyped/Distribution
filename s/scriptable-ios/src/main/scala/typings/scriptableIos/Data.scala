package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Raw data representation._
  * @see https://docs.scriptable.app/data
  */
trait Data extends js.Object {
  /**
    * _Gets bytes from data._
    * @see https://docs.scriptable.app/data/#-getbytes
    */
  def getBytes(): js.Array[Double]
  /**
    * _Creates a base 64 encoded string._
    *
    * Creates a base 64 encoded string from the data.
    * @see https://docs.scriptable.app/data/#-tobase64string
    */
  def toBase64String(): String
  /**
    * _Creates a string from the data._
    *
    * The data is assumed to represent a UTF8 encoded string. If the string is not UTF8 encoded string, the function will return null.
    * @see https://docs.scriptable.app/data/#-torawstring
    */
  def toRawString(): String
}

object Data {
  @scala.inline
  def apply(getBytes: () => js.Array[Double], toBase64String: () => String, toRawString: () => String): Data = {
    val __obj = js.Dynamic.literal(getBytes = js.Any.fromFunction0(getBytes), toBase64String = js.Any.fromFunction0(toBase64String), toRawString = js.Any.fromFunction0(toRawString))
    __obj.asInstanceOf[Data]
  }
}

