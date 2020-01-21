package typings.slateReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EditorProps[T /* <: typings.slate.mod.Controller */] = typings.slateReact.mod.BasicEditorProps[T] with typings.slateReact.mod.Plugin[T]
  type EventHook[T] = js.Function3[
    /* event */ T, 
    /* editor */ typings.slateReact.mod.Editor, 
    /* next */ js.Function0[js.Any], 
    js.Any
  ]
  type OnChangeFn = js.Function1[/* change */ typings.slateReact.mod.OnChangeParam, js.Any]
  type RenderAttributes = org.scalablytyped.runtime.StringDictionary[js.Any]
}
