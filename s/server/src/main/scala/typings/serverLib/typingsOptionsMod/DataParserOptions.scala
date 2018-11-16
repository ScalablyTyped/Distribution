package typings
package serverLib.typingsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataParserOptions extends js.Object {
  var bytesExpected: scala.Double = js.native
  var bytesReceived: scala.Double = js.native
  var encoding: java.lang.String = js.native
  var hash: java.lang.String | scala.Boolean = js.native
  var keepExtensions: scala.Boolean = js.native
  var maxFields: scala.Double = js.native
  var maxFieldsSize: scala.Double = js.native
  var multiples: scala.Boolean = js.native
  var `type`: java.lang.String = js.native
  var uploadDir: java.lang.String = js.native
  def handlePart(part: formidableLib.formidableMod.Part): scala.Unit = js.native
  def onPart(part: formidableLib.formidableMod.Part): scala.Unit = js.native
  def parse(req: nodeLib.httpMod.IncomingMessage): scala.Unit = js.native
  def parse(
    req: nodeLib.httpMod.IncomingMessage,
    callback: js.Function3[
      /* err */ js.Any, 
      /* fields */ formidableLib.formidableMod.Fields, 
      /* files */ formidableLib.formidableMod.Files, 
      _
    ]
  ): scala.Unit = js.native
}

