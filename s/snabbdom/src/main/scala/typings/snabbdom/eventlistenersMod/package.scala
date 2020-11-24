package typings.snabbdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object eventlistenersMod {
  
  type Listener[T] = js.ThisFunction2[
    /* this */ typings.snabbdom.vnodeMod.VNode_, 
    /* ev */ T, 
    /* vnode */ typings.snabbdom.vnodeMod.VNode_, 
    scala.Unit
  ]
}
