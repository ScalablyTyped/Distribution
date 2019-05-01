package typings
package shrinkDashRayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brotli extends js.Object {
  var brotli: Anon_01
  var cacheSize: scala.Double
  var filter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FilterFunction */ js.Any
  var threshold: scala.Double
  var zlib: stdLib.Partial[Anon_0]
  def cache(req: stdLib.Request, res: stdLib.Response): scala.Boolean
}

object Anon_Brotli {
  @scala.inline
  def apply(
    brotli: Anon_01,
    cache: (stdLib.Request, stdLib.Response) => scala.Boolean,
    cacheSize: scala.Double,
    filter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FilterFunction */ js.Any,
    threshold: scala.Double,
    zlib: stdLib.Partial[Anon_0]
  ): Anon_Brotli = {
    val __obj = js.Dynamic.literal(brotli = brotli, cache = js.Any.fromFunction2(cache), cacheSize = cacheSize, filter = filter, threshold = threshold, zlib = zlib)
  
    __obj.asInstanceOf[Anon_Brotli]
  }
}

