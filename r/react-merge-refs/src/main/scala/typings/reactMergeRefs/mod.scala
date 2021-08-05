package typings.reactMergeRefs

import typings.react.mod.LegacyRef
import typings.react.mod.MutableRefObject
import typings.react.mod.RefCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-merge-refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](refs: js.Array[MutableRefObject[T] | LegacyRef[T]]): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(refs.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
}
