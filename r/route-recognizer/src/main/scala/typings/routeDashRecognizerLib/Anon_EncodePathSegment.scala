package typings
package routeDashRecognizerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodePathSegment extends js.Object {
  def encodePathSegment(str: java.lang.String): java.lang.String
  def normalizePath(path: java.lang.String): java.lang.String
  def normalizeSegment(segment: java.lang.String): java.lang.String
}

object Anon_EncodePathSegment {
  @scala.inline
  def apply(
    encodePathSegment: js.Function1[java.lang.String, java.lang.String],
    normalizePath: js.Function1[java.lang.String, java.lang.String],
    normalizeSegment: js.Function1[java.lang.String, java.lang.String]
  ): Anon_EncodePathSegment = {
    val __obj = js.Dynamic.literal(encodePathSegment = encodePathSegment, normalizePath = normalizePath, normalizeSegment = normalizeSegment)
  
    __obj.asInstanceOf[Anon_EncodePathSegment]
  }
}

