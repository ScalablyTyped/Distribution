package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableState extends js.Object {
  var awaitDrain: scala.Double
  var buffer: BufferList[_]
  var decoder: nodeLib.stringUnderscoreDecoderMod.NodeStringDecoder | scala.Null
  var defaultEncoding: java.lang.String
  var destroyed: scala.Boolean
  var emittedReadable: scala.Boolean
  var encoding: java.lang.String | scala.Null
  var endEmitted: scala.Boolean
  var ended: scala.Boolean
  var flowing: js.Any
  var highWaterMark: scala.Double
  var length: scala.Double
  var needReadable: scala.Boolean
  var objectMode: scala.Boolean
  var pipes: js.Any
   // NodeJS.WritableStream | any[]; // TODO
  var pipesCount: scala.Double
  var readableListening: scala.Boolean
  var reading: scala.Boolean
  var readingMore: scala.Boolean
  var resumeScheduled: scala.Boolean
  var sync: scala.Boolean
}

