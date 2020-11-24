package typings.priorityqueuejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
}
