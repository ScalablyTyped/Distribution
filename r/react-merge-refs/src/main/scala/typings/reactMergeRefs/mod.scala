package typings.reactMergeRefs

import typings.react.mod.LegacyRef
import typings.react.mod.MutableRefObject
import typings.react.mod.RefCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-merge-refs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default[T](refs: js.Array[MutableRefObject[T] | LegacyRef[T]]): RefCallback[T] = js.native
}
