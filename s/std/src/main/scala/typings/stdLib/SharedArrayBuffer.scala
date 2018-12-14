package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedArrayBuffer extends js.Object {
  /**
       * Read-only. The length of the ArrayBuffer (in bytes).
       */
  val byteLength: scala.Double = js.native
  /*
       * The SharedArrayBuffer constructor's length property whose value is 1.
       */
  var length: scala.Double = js.native
  @JSName(org.scalablytyped.runtime.Symbol.species)
  val species: SharedArrayBuffer = js.native
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  val toStringTag: stdLib.stdLibStrings.SharedArrayBuffer = js.native
  /**
       * Returns a section of an SharedArrayBuffer.
       */
  def slice(begin: scala.Double): SharedArrayBuffer = js.native
  /**
       * Returns a section of an SharedArrayBuffer.
       */
  def slice(begin: scala.Double, end: scala.Double): SharedArrayBuffer = js.native
}

