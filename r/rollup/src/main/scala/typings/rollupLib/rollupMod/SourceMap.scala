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

object SourceMap {
  @scala.inline
  def apply(
    file: java.lang.String,
    mappings: java.lang.String,
    names: js.Array[java.lang.String],
    sources: js.Array[java.lang.String],
    sourcesContent: js.Array[java.lang.String],
    toString: js.Function0[java.lang.String],
    toUrl: js.Function0[java.lang.String],
    version: java.lang.String
  ): SourceMap = {
    val __obj = js.Dynamic.literal(file = file, mappings = mappings, names = names, sources = sources, sourcesContent = sourcesContent, toString = toString, toUrl = toUrl, version = version)
  
    __obj.asInstanceOf[SourceMap]
  }
}

