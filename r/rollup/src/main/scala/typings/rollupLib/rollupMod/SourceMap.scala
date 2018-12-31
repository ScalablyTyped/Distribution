package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMap extends js.Object {
  var file: java.lang.String
  var mappings: java.lang.String
  var names: js.Array[java.lang.String]
  var sources: js.Array[java.lang.String]
  var sourcesContent: js.Array[java.lang.String]
  var version: java.lang.String
  def toUrl(): java.lang.String
}

