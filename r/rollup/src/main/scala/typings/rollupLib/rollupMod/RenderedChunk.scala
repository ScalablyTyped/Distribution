package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RenderedChunk extends js.Object {
  var dynamicImports: js.Array[java.lang.String]
  var exports: js.Array[java.lang.String]
  var facadeModuleId: java.lang.String | scala.Null
  var fileName: java.lang.String
  var imports: js.Array[java.lang.String]
  var isDynamicEntry: scala.Boolean
  var isEntry: scala.Boolean
  var modules: org.scalablytyped.runtime.StringDictionary[RenderedModule]
  var name: java.lang.String
}

