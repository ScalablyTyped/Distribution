package typings.sixRuntime.Six

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object plugins {
  
  type rpc = js.Function1[/* config */ js.Object, js.Object]
  
  type whiteList = js.Function1[/* ctx */ js.Object, scala.Boolean]
}
