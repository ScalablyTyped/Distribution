package typings
package simplecrawlerLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveWithTtlOptions extends ResolveOptions {
  @JSName("ttl")
  var ttl_ResolveWithTtlOptions: simplecrawlerLib.simplecrawlerLibNumbers.`true`
}

object ResolveWithTtlOptions {
  @scala.inline
  def apply(ttl: simplecrawlerLib.simplecrawlerLibNumbers.`true`): ResolveWithTtlOptions = {
    val __obj = js.Dynamic.literal(ttl = ttl)
  
    __obj.asInstanceOf[ResolveWithTtlOptions]
  }
}

