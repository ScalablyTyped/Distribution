package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.react.mod.Ref
import typings.react.mod.RefCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEnsuredRefMod {
  
  @JSImport("@react-md/utils/types/useEnsuredRef", "useEnsuredRef")
  @js.native
  def useEnsuredRef[E /* <: HTMLElement */](): EnsuredRefs[E] = js.native
  @JSImport("@react-md/utils/types/useEnsuredRef", "useEnsuredRef")
  @js.native
  def useEnsuredRef[E /* <: HTMLElement */](propRef: Ref[E | Null]): EnsuredRefs[E] = js.native
  
  type EnsuredRefs[E /* <: HTMLElement */] = js.Tuple2[MutableRefObject[E | Null], RefCallback[E | Null]]
}
