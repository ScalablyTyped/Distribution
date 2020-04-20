package typings.routeRecognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodePathSegment extends js.Object {
  def encodePathSegment(str: String): String
  def normalizePath(path: String): String
  def normalizeSegment(segment: String): String
}

object AnonEncodePathSegment {
  @scala.inline
  def apply(
    encodePathSegment: String => String,
    normalizePath: String => String,
    normalizeSegment: String => String
  ): AnonEncodePathSegment = {
    val __obj = js.Dynamic.literal(encodePathSegment = js.Any.fromFunction1(encodePathSegment), normalizePath = js.Any.fromFunction1(normalizePath), normalizeSegment = js.Any.fromFunction1(normalizeSegment))
    __obj.asInstanceOf[AnonEncodePathSegment]
  }
}

