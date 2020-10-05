package typings.semanticUiReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object commonjsMod {
  type SemanticShorthandCollection[T] = js.Array[typings.semanticUiReact.commonjsMod.SemanticShorthandItem[T]]
  type SemanticShorthandContent = typings.react.mod.ReactNode
  type SemanticShorthandItem[T] = typings.react.mod.ReactNode | T
}
