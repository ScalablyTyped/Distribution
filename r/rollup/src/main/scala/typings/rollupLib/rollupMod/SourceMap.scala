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
  var version: scala.Double
  def toUrl(): java.lang.String
}

object SourceMap {
  @scala.inline
  def apply(
    file: java.lang.String,
    mappings: java.lang.String,
    names: js.Array[java.lang.String],
    sources: js.Array[java.lang.String],
    sourcesContent: js.Array[java.lang.String],
    toString: () => java.lang.String,
    toUrl: () => java.lang.String,
    version: scala.Double
  ): SourceMap = {
    val __obj = js.Dynamic.literal(file = file, mappings = mappings, names = names, sources = sources, sourcesContent = sourcesContent, toString = js.Any.fromFunction0(toString), toUrl = js.Any.fromFunction0(toUrl), version = version)
  
    __obj.asInstanceOf[SourceMap]
  }
}

