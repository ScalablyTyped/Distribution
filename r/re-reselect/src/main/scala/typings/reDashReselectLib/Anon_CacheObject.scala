package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheObject extends _Options {
  var cacheObject: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ICacheObject */ js.Any
  var selectorCreator: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CreateSelectorInstance */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CreateSelectorInstance */ js.Any
  ] = js.undefined
}

object Anon_CacheObject {
  @scala.inline
  def apply(
    cacheObject: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ICacheObject */ js.Any,
    selectorCreator: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CreateSelectorInstance */ js.Any = null
  ): Anon_CacheObject = {
    val __obj = js.Dynamic.literal(cacheObject = cacheObject)
    if (selectorCreator != null) __obj.updateDynamic("selectorCreator")(selectorCreator)
    __obj.asInstanceOf[Anon_CacheObject]
  }
}

