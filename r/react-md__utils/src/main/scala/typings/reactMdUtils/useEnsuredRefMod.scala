package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.react.mod.Ref
import typings.react.mod.RefCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEnsuredRefMod {
  
  @JSImport("@react-md/utils/types/useEnsuredRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useEnsuredRef[E /* <: HTMLElement */](): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEnsuredRef")().asInstanceOf[EnsuredRefs[E]]
  @scala.inline
  def useEnsuredRef[E /* <: HTMLElement */](propRef: Ref[E | Null]): EnsuredRefs[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEnsuredRef")(propRef.asInstanceOf[js.Any]).asInstanceOf[EnsuredRefs[E]]
  
  type EnsuredRefs[E /* <: HTMLElement */] = js.Tuple2[MutableRefObject[E | Null], RefCallback[E | Null]]
}
