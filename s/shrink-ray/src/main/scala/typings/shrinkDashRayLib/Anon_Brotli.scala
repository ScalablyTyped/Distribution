package typings
package shrinkDashRayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Brotli extends js.Object {
  var brotli: Anon_Quality
  var cacheSize: scala.Double
  var filter: FilterFunction
  var threshold: scala.Double
  var zlib: stdLib.Partial[Anon_ChunkSize]
  def cache(req: stdLib.Request, res: stdLib.Response): scala.Boolean
}

