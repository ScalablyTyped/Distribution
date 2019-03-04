package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheObjectSelectorCreator extends _Options {
  var cacheObject: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ICacheObject */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ICacheObject */ js.Any
  ] = js.undefined
  var selectorCreator: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CreateSelectorInstance */ js.Any
}

object Anon_CacheObjectSelectorCreator {
  @scala.inline
  def apply(
    selectorCreator: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CreateSelectorInstance */ js.Any,
    cacheObject: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ICacheObject */ js.Any = null
  ): Anon_CacheObjectSelectorCreator = {
    val __obj = js.Dynamic.literal(selectorCreator = selectorCreator)
    if (cacheObject != null) __obj.updateDynamic("cacheObject")(cacheObject)
    __obj.asInstanceOf[Anon_CacheObjectSelectorCreator]
  }
}

