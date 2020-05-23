package typings.routeRecognizer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodePathSegment extends js.Object {
  def encodePathSegment(str: String): String
  def normalizePath(path: String): String
  def normalizeSegment(segment: String): String
}

object EncodePathSegment {
  @scala.inline
  def apply(
    encodePathSegment: String => String,
    normalizePath: String => String,
    normalizeSegment: String => String
  ): EncodePathSegment = {
    val __obj = js.Dynamic.literal(encodePathSegment = js.Any.fromFunction1(encodePathSegment), normalizePath = js.Any.fromFunction1(normalizePath), normalizeSegment = js.Any.fromFunction1(normalizeSegment))
    __obj.asInstanceOf[EncodePathSegment]
  }
}

