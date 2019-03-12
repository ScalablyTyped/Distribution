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
    encodePathSegment: java.lang.String => java.lang.String,
    normalizePath: java.lang.String => java.lang.String,
    normalizeSegment: java.lang.String => java.lang.String
  ): Anon_EncodePathSegment = {
    val __obj = js.Dynamic.literal(encodePathSegment = js.Any.fromFunction1(encodePathSegment), normalizePath = js.Any.fromFunction1(normalizePath), normalizeSegment = js.Any.fromFunction1(normalizeSegment))
  
    __obj.asInstanceOf[Anon_EncodePathSegment]
  }
}

