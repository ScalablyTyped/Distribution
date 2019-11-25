package typings.roarr.roarrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoarrGlobalStateType extends WriterType {
  var sequence: Double
  var versions: js.Array[String]
}

object RoarrGlobalStateType {
  @scala.inline
  def apply(sequence: Double, versions: js.Array[String], write: String => Unit): RoarrGlobalStateType = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[RoarrGlobalStateType]
  }
}

