package typings
package remarkableLib.libMod.RemarkableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParsingState extends js.Object {
  var block: remarkableLib.libMod.ParserBlock
  var env: Env
  var `inline`: remarkableLib.libMod.ParserInline
  var inlineMode: scala.Boolean
  var level: scala.Double
  var options: Options
  var pending: java.lang.String
  var pos: scala.Double
  var posMax: scala.Double
  var renderer: remarkableLib.libRendererMod.namespaced
  var src: java.lang.String
  var tokens: js.Array[ContentToken]
  var typographer: scala.Boolean
  def push(token: ContentToken): scala.Unit
}

