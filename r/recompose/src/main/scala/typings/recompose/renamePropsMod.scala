package typings.recompose

import typings.recompose.mod.ComponentEnhancer
import typings.recompose.mod.NameMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#renameprops
@JSImport("recompose/renameProps", JSImport.Namespace)
@js.native
object renamePropsMod extends js.Object {
  def default(nameMap: NameMap): ComponentEnhancer[_, _] = js.native
}

