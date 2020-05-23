package typings.snykPaketParser

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-paket-parser/dist/line-parser", JSImport.Namespace)
@js.native
object lineParserMod extends js.Object {
  @js.native
  class Line protected () extends js.Object {
    def this(data: String, indentation: Double) = this()
    var data: String = js.native
    var indentation: Double = js.native
  }
  
  def parseLines(input: String): js.Array[Line] = js.native
  def parseLines(input: String, indent: String): js.Array[Line] = js.native
  def parseLines(input: String, indent: String, lineSeparator: RegExp): js.Array[Line] = js.native
}

