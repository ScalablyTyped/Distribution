package typings.slateDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object slateDashReactMod {
  import org.scalablytyped.runtime.StringDictionary

  type EditorProps = BasicEditorProps with Plugin
  type EventHook[T] = js.Function3[/* event */ T, /* editor */ Editor, /* next */ js.Function0[js.Any], js.Any]
  type OnChangeFn = js.Function1[/* change */ OnChangeParam, js.Any]
  type RenderAttributes = StringDictionary[js.Any]
}
