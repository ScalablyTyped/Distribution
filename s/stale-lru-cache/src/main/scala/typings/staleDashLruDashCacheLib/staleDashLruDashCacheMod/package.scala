package typings
package staleDashLruDashCacheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object staleDashLruDashCacheMod {
  type OptionsCallback[K, V] = js.Function3[
    /* error */ js.Any, 
    /* value */ js.UndefOr[V], 
    /* options */ js.UndefOr[java.lang.String | (SetOptions[K, V])], 
    scala.Unit
  ]
  type RevalidationCallback[K, V] = js.Function2[/* key */ K, /* callback */ OptionsCallback[K, V], scala.Unit]
}
