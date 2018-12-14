package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RenderedChunk extends js.Object {
  var exports: js.Array[java.lang.String]
  var fileName: java.lang.String
  var imports: js.Array[java.lang.String]
  var isEntry: scala.Boolean
  var modules: org.scalablytyped.runtime.StringDictionary[RenderedModule]
}

